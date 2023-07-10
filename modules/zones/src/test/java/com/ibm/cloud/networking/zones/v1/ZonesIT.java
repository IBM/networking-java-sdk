/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
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
import java.io.InputStream;
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

  String crn = "testString";
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../zones_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Zones.newInstance(crn);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Zones.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListZones() throws Exception {
    try {
      ListZonesOptions listZonesOptions = new ListZonesOptions.Builder()
        .page(Long.valueOf("1"))
        .perPage(Long.valueOf("20"))
        .build();

      // Invoke operation
      Response<ListZonesResp> response = service.listZones(listZonesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListZonesResp listZonesRespResult = response.getResult();

      assertNotNull(listZonesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListZones" })
  public void testCreateZone() throws Exception {
    try {
      CreateZoneOptions createZoneOptions = new CreateZoneOptions.Builder()
        .name("test-example.com")
        .type("full")
        .build();

      // Invoke operation
      Response<ZoneResp> response = service.createZone(createZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateZone" })
  public void testGetZone() throws Exception {
    try {
      GetZoneOptions getZoneOptions = new GetZoneOptions.Builder()
        .zoneIdentifier("testString")
        .build();

      // Invoke operation
      Response<ZoneResp> response = service.getZone(getZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetZone" })
  public void testUpdateZone() throws Exception {
    try {
      UpdateZoneOptions updateZoneOptions = new UpdateZoneOptions.Builder()
        .zoneIdentifier("testString")
        .paused(false)
        .build();

      // Invoke operation
      Response<ZoneResp> response = service.updateZone(updateZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneResp zoneRespResult = response.getResult();

      assertNotNull(zoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateZone" })
  public void testZoneActivationCheck() throws Exception {
    try {
      ZoneActivationCheckOptions zoneActivationCheckOptions = new ZoneActivationCheckOptions.Builder()
        .zoneIdentifier("testString")
        .build();

      // Invoke operation
      Response<ZoneActivationcheckResp> response = service.zoneActivationCheck(zoneActivationCheckOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZoneActivationcheckResp zoneActivationcheckRespResult = response.getResult();

      assertNotNull(zoneActivationcheckRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testZoneActivationCheck" })
  public void testDeleteZone() throws Exception {
    try {
      DeleteZoneOptions deleteZoneOptions = new DeleteZoneOptions.Builder()
        .zoneIdentifier("testString")
        .build();

      // Invoke operation
      Response<DeleteZoneResp> response = service.deleteZone(deleteZoneOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteZoneResp deleteZoneRespResult = response.getResult();

      assertNotNull(deleteZoneRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
