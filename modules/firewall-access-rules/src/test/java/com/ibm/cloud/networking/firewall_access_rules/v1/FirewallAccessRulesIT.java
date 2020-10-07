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

package com.ibm.cloud.networking.firewall_access_rules.v1;

import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleInputConfiguration;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObject;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObjectConfiguration;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObjectScope;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.CreateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleRespResult;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.GetAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAccountAccessRulesResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAccountAccessRulesRespResultInfo;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAllAccountAccessRulesOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.UpdateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.utils.TestUtilities;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the FirewallAccessRules service.
 */
public class FirewallAccessRulesIT extends SdkIntegrationTestBase {
  public FirewallAccessRules service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
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

    // set mock values for global params
    try {
      service = FirewallAccessRules.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test
  public void testListAllAccountAccessRules() throws Exception {
    try {
      ListAllAccountAccessRulesOptions listAllAccountAccessRulesOptions = new ListAllAccountAccessRulesOptions.Builder()
      .notes("testString")
      .mode("block")
      .configurationTarget("ip")
      .configurationValue("1.2.3.4")
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .order("target")
      .direction("asc")
      .match("any")
      .build();

      // Invoke operation
      Response<ListAccountAccessRulesResp> response = service.listAllAccountAccessRules(listAllAccountAccessRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListAccountAccessRulesResp listAccountAccessRulesRespResult = response.getResult();

      assertNotNull(listAccountAccessRulesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateAccountAccessRule() throws Exception {
    try {
      AccountAccessRuleInputConfiguration accountAccessRuleInputConfigurationModel = new AccountAccessRuleInputConfiguration.Builder()
      .target("ip")
      .value("198.51.100.4")
      .build();

      CreateAccountAccessRuleOptions createAccountAccessRuleOptions = new CreateAccountAccessRuleOptions.Builder()
      .mode("block")
      .notes("This rule is added because of event X that occurred on date xyz")
      .configuration(accountAccessRuleInputConfigurationModel)
      .build();

      // Invoke operation
      Response<AccountAccessRuleResp> response = service.createAccountAccessRule(createAccountAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccountAccessRuleResp accountAccessRuleRespResult = response.getResult();
      identifier = accountAccessRuleRespResult.getResult().getId();
      assertNotNull(accountAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testCreateAccountAccessRule")
  public void testGetAccountAccessRule() throws Exception {
    try {
      GetAccountAccessRuleOptions getAccountAccessRuleOptions = new GetAccountAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<AccountAccessRuleResp> response = service.getAccountAccessRule(getAccountAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccountAccessRuleResp accountAccessRuleRespResult = response.getResult();

      assertNotNull(accountAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetAccountAccessRule")
  public void testUpdateAccountAccessRule() throws Exception {
    try {
      UpdateAccountAccessRuleOptions updateAccountAccessRuleOptions = new UpdateAccountAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .mode("whitelist")
      .notes("This rule is added because of event X that occurred on date xyz, updated")
      .build();

      // Invoke operation
      Response<AccountAccessRuleResp> response = service.updateAccountAccessRule(updateAccountAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AccountAccessRuleResp accountAccessRuleRespResult = response.getResult();

      assertNotNull(accountAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateAccountAccessRule")
  public void testDeleteAccountAccessRule() throws Exception {
    try {
      DeleteAccountAccessRuleOptions deleteAccountAccessRuleOptions = new DeleteAccountAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteAccountAccessRuleResp> response = service.deleteAccountAccessRule(deleteAccountAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteAccountAccessRuleResp deleteAccountAccessRuleRespResult = response.getResult();

      assertNotNull(deleteAccountAccessRuleRespResult);
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
