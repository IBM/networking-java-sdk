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

package com.ibm.cloud.networking.waf_rule_packages_api.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.GetWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.ListWafPackagesOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.UpdateWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponseResult;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponseResultInfo;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponseResultItem;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.utils.TestUtilities;
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
 * Integration test class for the WafRulePackagesApi service.
 */
public class WafRulePackagesApiIT extends SdkIntegrationTestBase {
  public WafRulePackagesApi service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneId = null;

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
    zoneId = config.get("ZONE_ID");

    // set mock values for global params
    try {
      service = WafRulePackagesApi.newInstance(crn, zoneId, serviceName);
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
      Response<WafPackagesResponse> response = service.listWafPackages(listWafPackagesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafPackagesResponse wafPackagesResponseResult = response.getResult();
      int i = 0;
      while (i < wafPackagesResponseResult.getResult().size()) {
          if ( wafPackagesResponseResult.getResult().get(i).getDetectionMode().equals("anomaly") ) {
              identifier = wafPackagesResponseResult.getResult().get(i).getId();
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

  @Test (dependsOnMethods = "testUpdateWafPackage")
  public void testGetWafPackage() throws Exception {
    try {
      GetWafPackageOptions getWafPackageOptions = new GetWafPackageOptions.Builder()
      .packageId(identifier)
      .build();

      // Invoke operation
      Response<WafPackageResponse> response = service.getWafPackage(getWafPackageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafPackageResponse wafPackageResponseResult = response.getResult();

      assertNotNull(wafPackageResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListWafPackages")
  public void testUpdateWafPackage() throws Exception {
    try {
      UpdateWafPackageOptions updateWafPackageOptions = new UpdateWafPackageOptions.Builder()
      .packageId(identifier)
      .sensitivity("high")
      .actionMode("simulate")
      .build();

      // Invoke operation
      Response<WafPackageResponse> response = service.updateWafPackage(updateWafPackageOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafPackageResponse wafPackageResponseResult = response.getResult();

      assertNotNull(wafPackageResponseResult);
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
