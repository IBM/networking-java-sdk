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

package com.ibm.cloud.networking.zones.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.zones.v1.model.CreateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneResp;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneRespResult;
import com.ibm.cloud.networking.zones.v1.model.GetZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesResp;
import com.ibm.cloud.networking.zones.v1.model.ResultInfo;
import com.ibm.cloud.networking.zones.v1.model.UpdateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationCheckOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckResp;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckRespResult;
import com.ibm.cloud.networking.zones.v1.model.ZoneDetails;
import com.ibm.cloud.networking.zones.v1.model.ZoneResp;
import com.ibm.cloud.networking.zones.v1.utils.TestUtilities;
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
 * Integration test class for the Zones service.
 */
public class ZonesIT extends SdkIntegrationTestBase {
  public Zones service = null;
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
      service = Zones.newInstance(crn, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateZone")
  public void testListZones() throws Exception {
    try {
      ListZonesOptions listZonesOptions = new ListZonesOptions();

      // Invoke operation
      Response<ListZonesResp> response = service.listZones(listZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListZonesResp listZonesRespResult = response.getResult();

      assertNotNull(listZonesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateZone() throws Exception {
    try {
      CreateZoneOptions createZoneOptions = new CreateZoneOptions.Builder()
      .name("test-example.com")
      .build();

      // Invoke operation
      Response<ZoneResp> response = service.createZone(createZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();
      identifier = zoneRespResult.getResult().getId();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateZone")
  public void testGetZone() throws Exception {
    try {
      GetZoneOptions getZoneOptions = new GetZoneOptions.Builder()
      .zoneIdentifier(identifier)
      .build();

      // Invoke operation
      Response<ZoneResp> response = service.getZone(getZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListZones")
  public void testUpdateZone() throws Exception {
    try {
      UpdateZoneOptions updateZoneOptions = new UpdateZoneOptions.Builder()
      .zoneIdentifier(identifier)
      .paused(true)
      .build();

      // Invoke operation
      Response<ZoneResp> response = service.updateZone(updateZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetZone")
  public void testZoneActivationCheck() throws Exception {
    try {
      ZoneActivationCheckOptions zoneActivationCheckOptions = new ZoneActivationCheckOptions.Builder()
      .zoneIdentifier(identifier)
      .build();

      // Invoke operation
      Response<ZoneActivationcheckResp> response = service.zoneActivationCheck(zoneActivationCheckOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneActivationcheckResp zoneActivationcheckRespResult = response.getResult();

      assertNotNull(zoneActivationcheckRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testZoneActivationCheck")
  public void testDeleteZone() throws Exception {
    try {
      DeleteZoneOptions deleteZoneOptions = new DeleteZoneOptions.Builder()
      .zoneIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteZoneResp> response = service.deleteZone(deleteZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteZoneResp deleteZoneRespResult = response.getResult();

      assertNotNull(deleteZoneRespResult);
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
