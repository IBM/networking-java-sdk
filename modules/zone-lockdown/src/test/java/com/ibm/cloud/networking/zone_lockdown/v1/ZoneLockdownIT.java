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

package com.ibm.cloud.networking.zone_lockdown.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.zone_lockdown.v1.model.CreateZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteLockdownRespResult;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.GetLockdownOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListAllZoneLockownRulesOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListLockdownRespResultInfo;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownInputConfigurationsItem;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownObject;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownObjectConfigurationsItem;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.UpdateLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.utils.TestUtilities;
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
 * Integration test class for the ZoneLockdown service.
 */
public class ZoneLockdownIT extends SdkIntegrationTestBase {
  public ZoneLockdown service = null;
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
      service = ZoneLockdown.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateZoneLockdownRule")
  public void testListAllZoneLockownRules() throws Exception {
    try {
      ListAllZoneLockownRulesOptions listAllZoneLockownRulesOptions = new ListAllZoneLockownRulesOptions.Builder()
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .build();

      // Invoke operation
      Response<ListLockdownResp> response = service.listAllZoneLockownRules(listAllZoneLockownRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListLockdownResp listLockdownRespResult = response.getResult();

      assertNotNull(listLockdownRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateZoneLockdownRule() throws Exception {
    try {
      LockdownInputConfigurationsItem lockdownInputConfigurationsItemModel = new LockdownInputConfigurationsItem.Builder()
      .target("ip")
      .value("1.1.1.1")
      .build();

      CreateZoneLockdownRuleOptions createZoneLockdownRuleOptions = new CreateZoneLockdownRuleOptions.Builder()
      .paused(false)
      .description("Restrict access to these endpoints to requests from a known IP address")
      .urls(new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")))
      .configurations(new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)))
      .build();

      // Invoke operation
      Response<LockdownResp> response = service.createZoneLockdownRule(createZoneLockdownRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LockdownResp lockdownRespResult = response.getResult();
      identifier = lockdownRespResult.getResult().getId();
      assertNotNull(lockdownRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateLockdownRule")
  public void testGetLockdown() throws Exception {
    try {
      GetLockdownOptions getLockdownOptions = new GetLockdownOptions.Builder()
      .lockdownRuleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<LockdownResp> response = service.getLockdown(getLockdownOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LockdownResp lockdownRespResult = response.getResult();

      assertNotNull(lockdownRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllZoneLockownRules")
  public void testUpdateLockdownRule() throws Exception {
    try {
      LockdownInputConfigurationsItem lockdownInputConfigurationsItemModel = new LockdownInputConfigurationsItem.Builder()
      .target("ip")
      .value("1.2.3.4")
      .build();

      UpdateLockdownRuleOptions updateLockdownRuleOptions = new UpdateLockdownRuleOptions.Builder()
      .lockdownRuleIdentifier(identifier)
      .paused(false)
      .description("Restrict access to these endpoints to requests from a known IP address")
      .urls(new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")))
      .configurations(new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)))
      .build();

      // Invoke operation
      Response<LockdownResp> response = service.updateLockdownRule(updateLockdownRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LockdownResp lockdownRespResult = response.getResult();

      assertNotNull(lockdownRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetLockdown")
  public void testDeleteZoneLockdownRule() throws Exception {
    try {
      DeleteZoneLockdownRuleOptions deleteZoneLockdownRuleOptions = new DeleteZoneLockdownRuleOptions.Builder()
      .lockdownRuleIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteLockdownResp> response = service.deleteZoneLockdownRule(deleteZoneLockdownRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteLockdownResp deleteLockdownRespResult = response.getResult();

      assertNotNull(deleteLockdownRespResult);
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
