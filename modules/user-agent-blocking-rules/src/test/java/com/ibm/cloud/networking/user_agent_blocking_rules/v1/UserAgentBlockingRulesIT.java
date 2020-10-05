/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.networking.user_agent_blocking_rules.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.CreateZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteUseragentRuleResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteUseragentRuleRespResult;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.GetUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListAllZoneUserAgentRulesOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListUseragentRulesResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListUseragentRulesRespResultInfo;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UpdateUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleInputConfiguration;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleObject;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleObjectConfiguration;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the UserAgentBlockingRules service.
 */
public class UserAgentBlockingRulesIT extends SdkIntegrationTestBase {
  public UserAgentBlockingRules service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;

  String identifier = null;
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../cloud_internet_services.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");

    // set mock values for global params
    try {
      service = UserAgentBlockingRules.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateZoneUserAgentRule")
  public void testListAllZoneUserAgentRules() throws Exception {
    try {
      ListAllZoneUserAgentRulesOptions listAllZoneUserAgentRulesOptions = new ListAllZoneUserAgentRulesOptions.Builder()
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .build();

      // Invoke operation
      Response<ListUseragentRulesResp> response = service.listAllZoneUserAgentRules(listAllZoneUserAgentRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListUseragentRulesResp listUseragentRulesRespResult = response.getResult();

      assertNotNull(listUseragentRulesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateZoneUserAgentRule() throws Exception {
    try {
      UseragentRuleInputConfiguration useragentRuleInputConfigurationModel = new UseragentRuleInputConfiguration.Builder()
      .target("ua")
      .value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4")
      .build();

      CreateZoneUserAgentRuleOptions createZoneUserAgentRuleOptions = new CreateZoneUserAgentRuleOptions.Builder()
      .paused(true)
      .description("Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack")
      .mode("block")
      .configuration(useragentRuleInputConfigurationModel)
      .build();

      // Invoke operation
      Response<UseragentRuleResp> response = service.createZoneUserAgentRule(createZoneUserAgentRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UseragentRuleResp useragentRuleRespResult = response.getResult();
      identifier = useragentRuleRespResult.getResult().getId();

      assertNotNull(useragentRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateUserAgentRule")
  public void testGetUserAgentRule() throws Exception {
    try {
      GetUserAgentRuleOptions getUserAgentRuleOptions = new GetUserAgentRuleOptions.Builder()
      .useragentRuleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<UseragentRuleResp> response = service.getUserAgentRule(getUserAgentRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UseragentRuleResp useragentRuleRespResult = response.getResult();

      assertNotNull(useragentRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllZoneUserAgentRules")
  public void testUpdateUserAgentRule() throws Exception {
    try {
      UseragentRuleInputConfiguration useragentRuleInputConfigurationModel = new UseragentRuleInputConfiguration.Builder()
      .target("ua")
      .value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4")
      .build();

      UpdateUserAgentRuleOptions updateUserAgentRuleOptions = new UpdateUserAgentRuleOptions.Builder()
      .useragentRuleIdentifier(identifier)
      .paused(true)
      .description("Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack")
      .mode("block")
      .configuration(useragentRuleInputConfigurationModel)
      .build();

      // Invoke operation
      Response<UseragentRuleResp> response = service.updateUserAgentRule(updateUserAgentRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UseragentRuleResp useragentRuleRespResult = response.getResult();

      assertNotNull(useragentRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetUserAgentRule")
  public void testDeleteZoneUserAgentRule() throws Exception {
    try {
      DeleteZoneUserAgentRuleOptions deleteZoneUserAgentRuleOptions = new DeleteZoneUserAgentRuleOptions.Builder()
      .useragentRuleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteUseragentRuleResp> response = service.deleteZoneUserAgentRule(deleteZoneUserAgentRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteUseragentRuleResp deleteUseragentRuleRespResult = response.getResult();

      assertNotNull(deleteUseragentRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
