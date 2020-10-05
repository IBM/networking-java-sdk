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

package com.ibm.cloud.networking.zone_rate_limits.v1;

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.CreateZoneRateLimitsOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.DeleteRateLimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.DeleteRateLimitRespResult;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.DeleteZoneRateLimitOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.GetRateLimitOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.ListAllZoneRateLimitsOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.ListRatelimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.ListRatelimitRespResultInfo;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputAction;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputActionResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputBypassItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputCorrelate;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatch;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchRequest;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponseHeadersItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObject;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectAction;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectActionResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectBypassItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectCorrelate;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectMatch;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectMatchRequest;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectMatchResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitObjectMatchResponseHeadersItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.UpdateRateLimitOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.utils.TestUtilities;
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
 * Integration test class for the ZoneRateLimits service.
 */
public class ZoneRateLimitsIT extends SdkIntegrationTestBase {
  public ZoneRateLimits service = null;
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
      service = ZoneRateLimits.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test (dependsOnMethods = "testCreateZoneRateLimits")
  public void testListAllZoneRateLimits() throws Exception {
    try {
      ListAllZoneRateLimitsOptions listAllZoneRateLimitsOptions = new ListAllZoneRateLimitsOptions.Builder()
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .build();

      // Invoke operation
      Response<ListRatelimitResp> response = service.listAllZoneRateLimits(listAllZoneRateLimitsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListRatelimitResp listRatelimitRespResult = response.getResult();

      assertNotNull(listRatelimitRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateZoneRateLimits() throws Exception {
    try {
      RatelimitInputBypassItem ratelimitInputBypassItemModel = new RatelimitInputBypassItem.Builder()
      .name("url")
      .value("api.example.com/*")
      .build();

      RatelimitInputActionResponse ratelimitInputActionResponseModel = new RatelimitInputActionResponse.Builder()
      .contentType("text/plain")
      .body("This request has been rate-limited.")
      .build();

      RatelimitInputAction ratelimitInputActionModel = new RatelimitInputAction.Builder()
      .mode("simulate")
      .timeout(Long.valueOf("60"))
      .response(ratelimitInputActionResponseModel)
      .build();

      RatelimitInputCorrelate ratelimitInputCorrelateModel = new RatelimitInputCorrelate.Builder()
      .by("nat")
      .build();

      RatelimitInputMatchRequest ratelimitInputMatchRequestModel = new RatelimitInputMatchRequest.Builder()
      .methods(new java.util.ArrayList<String>(java.util.Arrays.asList("GET")))
      .schemes(new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")))
      .url("*.example.org/path*")
      .build();

      RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
      .name("Cf-Cache-Status")
      .op("ne")
      .value("HIT")
      .build();

      RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
      .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
      .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
      .originTraffic(false)
      .build();

      RatelimitInputMatch ratelimitInputMatchModel = new RatelimitInputMatch.Builder()
      .request(ratelimitInputMatchRequestModel)
      .response(ratelimitInputMatchResponseModel)
      .build();

      CreateZoneRateLimitsOptions createZoneRateLimitsOptions = new CreateZoneRateLimitsOptions.Builder()
      .disabled(false)
      .description("Prevent multiple login failures to mitigate brute force attacks")
      .bypass(new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)))
      .threshold(Long.valueOf("1000"))
      .period(Long.valueOf("60"))
      .action(ratelimitInputActionModel)
      .correlate(ratelimitInputCorrelateModel)
      .match(ratelimitInputMatchModel)
      .build();

      // Invoke operation
      Response<RatelimitResp> response = service.createZoneRateLimits(createZoneRateLimitsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RatelimitResp ratelimitRespResult = response.getResult();
      identifier = ratelimitRespResult.getResult().getId();

      assertNotNull(ratelimitRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testUpdateRateLimit")
  public void testGetRateLimit() throws Exception {
    try {
      GetRateLimitOptions getRateLimitOptions = new GetRateLimitOptions.Builder()
      .rateLimitIdentifier(identifier)
      .build();

      // Invoke operation
      Response<RatelimitResp> response = service.getRateLimit(getRateLimitOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RatelimitResp ratelimitRespResult = response.getResult();

      assertNotNull(ratelimitRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testListAllZoneRateLimits")
  public void testUpdateRateLimit() throws Exception {
    try {
      RatelimitInputBypassItem ratelimitInputBypassItemModel = new RatelimitInputBypassItem.Builder()
      .name("url")
      .value("api.example.com/*")
      .build();

      RatelimitInputActionResponse ratelimitInputActionResponseModel = new RatelimitInputActionResponse.Builder()
      .contentType("text/plain")
      .body("This request has been rate-limited.")
      .build();

      RatelimitInputAction ratelimitInputActionModel = new RatelimitInputAction.Builder()
      .mode("simulate")
      .timeout(Long.valueOf("60"))
      .response(ratelimitInputActionResponseModel)
      .build();

      RatelimitInputCorrelate ratelimitInputCorrelateModel = new RatelimitInputCorrelate.Builder()
      .by("nat")
      .build();

      RatelimitInputMatchRequest ratelimitInputMatchRequestModel = new RatelimitInputMatchRequest.Builder()
      .methods(new java.util.ArrayList<String>(java.util.Arrays.asList("GET")))
      .schemes(new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")))
      .url("*.example.org/path*")
      .build();

      RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
      .name("Cf-Cache-Status")
      .op("ne")
      .value("HIT")
      .build();

      RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
      .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
      .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
      .originTraffic(false)
      .build();

      RatelimitInputMatch ratelimitInputMatchModel = new RatelimitInputMatch.Builder()
      .request(ratelimitInputMatchRequestModel)
      .response(ratelimitInputMatchResponseModel)
      .build();

      UpdateRateLimitOptions updateRateLimitOptions = new UpdateRateLimitOptions.Builder()
      .rateLimitIdentifier(identifier)
      .disabled(false)
      .description("Prevent multiple login failures to mitigate brute force attacks")
      .bypass(new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)))
      .threshold(Long.valueOf("1000"))
      .period(Long.valueOf("60"))
      .action(ratelimitInputActionModel)
      .correlate(ratelimitInputCorrelateModel)
      .match(ratelimitInputMatchModel)
      .build();

      // Invoke operation
      Response<RatelimitResp> response = service.updateRateLimit(updateRateLimitOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RatelimitResp ratelimitRespResult = response.getResult();

      assertNotNull(ratelimitRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test (dependsOnMethods = "testGetRateLimit")
  public void testDeleteZoneRateLimit() throws Exception {
    try {
      DeleteZoneRateLimitOptions deleteZoneRateLimitOptions = new DeleteZoneRateLimitOptions.Builder()
      .rateLimitIdentifier(identifier)
      .build();

      // Invoke operation
      Response<DeleteRateLimitResp> response = service.deleteZoneRateLimit(deleteZoneRateLimitOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeleteRateLimitResp deleteRateLimitRespResult = response.getResult();

      assertNotNull(deleteRateLimitRespResult);
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
