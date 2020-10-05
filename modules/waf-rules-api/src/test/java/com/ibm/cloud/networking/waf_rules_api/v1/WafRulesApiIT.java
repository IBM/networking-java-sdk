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

package com.ibm.cloud.networking.waf_rules_api.v1;

import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupsResponse;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.ListWafRuleGroupsOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.WafRulePackagesApi;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.WafRuleGroupsApi;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.ListWafPackagesOptions;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.waf_rules_api.v1.model.GetWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.ListWafRulesOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.UpdateWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyCis;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyOwasp;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponse;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponseResult;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponseResultGroup;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponse;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultInfo;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultItem;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultItemGroup;
import com.ibm.cloud.networking.waf_rules_api.v1.utils.TestUtilities;
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
 * Integration test class for the WafRulesApi service.
 */
public class WafRulesApiIT extends SdkIntegrationTestBase {
  public WafRulePackagesApi wpService = null;
  public WafRuleGroupsApi wgService = null;
  public WafRulesApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneId = null;
  String identifier = null;
  String pIdentifier = null;
  String gIdentifier = null;
  String rIdentifier = null;
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
    zoneId = config.get("ZONE_ID");

    // set mock values for global params
    try {
      wpService = WafRulePackagesApi.newInstance(crn, zoneId, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      wgService = WafRuleGroupsApi.newInstance(crn, zoneId, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      service = WafRulesApi.newInstance(crn, zoneId, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }
  
  @Test
  public void testListWafPackages() throws Exception {
    try {
      ListWafPackagesOptions listWafPackagesOptions = new ListWafPackagesOptions.Builder()
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("50"))
      .order("status")
      .direction("desc")
      .match("all")
      .build();

      // Invoke operation
      Response<WafPackagesResponse> response = wpService.listWafPackages(listWafPackagesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafPackagesResponse wafPackagesResponseResult = response.getResult();
      int i = 0;
      while (i < wafPackagesResponseResult.getResult().size()) {
          if ( wafPackagesResponseResult.getResult().get(i).getDetectionMode().equals("anomaly") ) {
              pIdentifier = wafPackagesResponseResult.getResult().get(i).getId();
              break;
          }
          i++;
      }

      assertNotNull(wafPackagesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListWafPackages")
  public void testListWafRuleGroups() throws Exception {
    try {
      ListWafRuleGroupsOptions listWafRuleGroupsOptions = new ListWafRuleGroupsOptions.Builder()
      .pkgId(pIdentifier)
      .build();

      // Invoke operation
      Response<WafGroupsResponse> response = wgService.listWafRuleGroups(listWafRuleGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafGroupsResponse wafGroupsResponseResult = response.getResult();
      assertNotNull(wafGroupsResponseResult);
      int i = 0;
      while (i < wafGroupsResponseResult.getResult().size()) {
          gIdentifier = wafGroupsResponseResult.getResult().get(i).getId();
          break;
      }
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListWafRuleGroups")
  public void testListWafRules() throws Exception {
    try {
      ListWafRulesOptions listWafRulesOptions = new ListWafRulesOptions.Builder()
      .packageId(pIdentifier)
      .build();

      // Invoke operation
      Response<WafRulesResponse> response = service.listWafRules(listWafRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafRulesResponse wafRulesResponseResult = response.getResult();
      assertNotNull(wafRulesResponseResult);
      int i = 0;
      while (i < wafRulesResponseResult.getResult().size()) {
          rIdentifier = wafRulesResponseResult.getResult().get(i).getId();
          break;
      }
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateWafRule")
  public void testGetWafRule() throws Exception {
    try {
      GetWafRuleOptions getWafRuleOptions = new GetWafRuleOptions.Builder()
      .packageId(pIdentifier)
      .identifier(rIdentifier)
      .build();

      // Invoke operation
      Response<WafRuleResponse> response = service.getWafRule(getWafRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafRuleResponse wafRuleResponseResult = response.getResult();

      assertNotNull(wafRuleResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListWafRules")
  public void testUpdateWafRuleOff() throws Exception {
    try {
      WafRuleBodyCis wafRuleBodyCisModel = new WafRuleBodyCis.Builder()
      .mode("default")
      .build();

      WafRuleBodyOwasp wafRuleBodyOwaspModel = new WafRuleBodyOwasp.Builder()
      .mode("off")
      .build();

      UpdateWafRuleOptions updateWafRuleOptions = new UpdateWafRuleOptions.Builder()
      .packageId(pIdentifier)
      .identifier(rIdentifier)
      .owasp(wafRuleBodyOwaspModel)
      .build();

      // Invoke operation
      Response<WafRuleResponse> response = service.updateWafRule(updateWafRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafRuleResponse wafRuleResponseResult = response.getResult();

      assertNotNull(wafRuleResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  @Test (dependsOnMethods = "testUpdateWafRuleOff")
  public void testUpdateWafRule() throws Exception {
    try {
      WafRuleBodyCis wafRuleBodyCisModel = new WafRuleBodyCis.Builder()
      .mode("default")
      .build();

      WafRuleBodyOwasp wafRuleBodyOwaspModel = new WafRuleBodyOwasp.Builder()
      .mode("on")
      .build();

      UpdateWafRuleOptions updateWafRuleOptions = new UpdateWafRuleOptions.Builder()
      .packageId(pIdentifier)
      .identifier(rIdentifier)
      .owasp(wafRuleBodyOwaspModel)
      .build();

      // Invoke operation
      Response<WafRuleResponse> response = service.updateWafRule(updateWafRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafRuleResponse wafRuleResponseResult = response.getResult();

      assertNotNull(wafRuleResponseResult);
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
