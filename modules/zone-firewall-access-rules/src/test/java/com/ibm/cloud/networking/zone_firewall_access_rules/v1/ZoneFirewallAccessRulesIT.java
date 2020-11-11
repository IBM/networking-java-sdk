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

package com.ibm.cloud.networking.zone_firewall_access_rules.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.CreateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleRespResult;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.GetZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListAllZoneAccessRulesOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListZoneAccessRulesResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListZoneAccessRulesRespResultInfo;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.UpdateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleInputConfiguration;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObject;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObjectConfiguration;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObjectScope;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.utils.TestUtilities;
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
 * Integration test class for the ZoneFirewallAccessRules service.
 */
public class ZoneFirewallAccessRulesIT extends SdkIntegrationTestBase {
  public ZoneFirewallAccessRules service = null;
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
      service = ZoneFirewallAccessRules.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateZoneAccessRule")
  public void testListAllZoneAccessRules() throws Exception {
    try {
      ListAllZoneAccessRulesOptions listAllZoneAccessRulesOptions = new ListAllZoneAccessRulesOptions.Builder()
      .notes("testString")
      .mode("block")
      .configurationTarget("ip")
      .configurationValue("1.2.3.4")
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .order("configuration.target")
      .direction("asc")
      .match("any")
      .build();

      // Invoke operation
      Response<ListZoneAccessRulesResp> response = service.listAllZoneAccessRules(listAllZoneAccessRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListZoneAccessRulesResp listZoneAccessRulesRespResult = response.getResult();

      assertNotNull(listZoneAccessRulesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test 
  public void testCreateZoneAccessRule() throws Exception {
    try {
      ZoneAccessRuleInputConfiguration zoneAccessRuleInputConfigurationModel = new ZoneAccessRuleInputConfiguration.Builder()
      .target("ip")
      .value("1.1.1.2")
      .build();

      CreateZoneAccessRuleOptions createZoneAccessRuleOptions = new CreateZoneAccessRuleOptions.Builder()
      .mode("block")
      .notes("This rule is added because of event X that occurred on date xyz")
      .configuration(zoneAccessRuleInputConfigurationModel)
      .build();

      // Invoke operation
      Response<ZoneAccessRuleResp> response = service.createZoneAccessRule(createZoneAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneAccessRuleResp zoneAccessRuleRespResult = response.getResult();
      identifier = zoneAccessRuleRespResult.getResult().getId();

      assertNotNull(zoneAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateZoneAccessRule")
  public void testGetZoneAccessRule() throws Exception {
    try {
      GetZoneAccessRuleOptions getZoneAccessRuleOptions = new GetZoneAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<ZoneAccessRuleResp> response = service.getZoneAccessRule(getZoneAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneAccessRuleResp zoneAccessRuleRespResult = response.getResult();

      assertNotNull(zoneAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllZoneAccessRules")
  public void testUpdateZoneAccessRule() throws Exception {
    try {
      UpdateZoneAccessRuleOptions updateZoneAccessRuleOptions = new UpdateZoneAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .mode("block")
      .notes("This rule is added because of event X that occurred on date xyz")
      .build();

      // Invoke operation
      Response<ZoneAccessRuleResp> response = service.updateZoneAccessRule(updateZoneAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneAccessRuleResp zoneAccessRuleRespResult = response.getResult();

      assertNotNull(zoneAccessRuleRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetZoneAccessRule")
  public void testDeleteZoneAccessRule() throws Exception {
    try {
      DeleteZoneAccessRuleOptions deleteZoneAccessRuleOptions = new DeleteZoneAccessRuleOptions.Builder()
      .accessruleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteZoneAccessRuleResp> response = service.deleteZoneAccessRule(deleteZoneAccessRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteZoneAccessRuleResp deleteZoneAccessRuleRespResult = response.getResult();

      assertNotNull(deleteZoneAccessRuleRespResult);
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
