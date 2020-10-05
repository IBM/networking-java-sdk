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

import com.ibm.cloud.networking.zone_rate_limits.v1.ZoneRateLimits;
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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ZoneRateLimits service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class ZoneRateLimitsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ZoneRateLimits zoneRateLimitsService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    zoneRateLimitsService = ZoneRateLimits.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    zoneRateLimitsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    new ZoneRateLimits(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(zoneRateLimitsService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(zoneRateLimitsService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllZoneRateLimitsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"[]\"]], \"messages\": [[\"[]\"]], \"result\": [{\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"disabled\": false, \"description\": \"Prevent multiple login failures to mitigate brute force attacks\", \"bypass\": [{\"name\": \"url\", \"value\": \"example.com/*\"}], \"threshold\": 1000, \"period\": 60, \"correlate\": {\"by\": \"nat\"}, \"action\": {\"mode\": \"simulate\", \"timeout\": 60, \"response\": {\"content_type\": \"text/plain\", \"body\": \"This request has been rate-limited.\"}}, \"match\": {\"request\": {\"methods\": [\"_ALL_\"], \"schemes\": [\"_ALL_\"], \"url\": \"*.example.org/path*\"}, \"response\": {\"status\": [403], \"headers\": [{\"name\": \"Cf-Cache-Status\", \"op\": \"ne\", \"value\": \"HIT\"}], \"origin_traffic\": false}}}], \"result_info\": {\"page\": 1, \"per_page\": 10, \"count\": 1, \"total_count\": 1}}";
    String listAllZoneRateLimitsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/rate_limits", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllZoneRateLimitsOptions model
    ListAllZoneRateLimitsOptions listAllZoneRateLimitsOptionsModel = new ListAllZoneRateLimitsOptions.Builder()
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListRatelimitResp> response = zoneRateLimitsService.listAllZoneRateLimits(listAllZoneRateLimitsOptionsModel).execute();
    assertNotNull(response);
    ListRatelimitResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("5"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllZoneRateLimitsPath);
  }

  @Test
  public void testCreateZoneRateLimitsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"[]\"]], \"messages\": [[\"[]\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"disabled\": false, \"description\": \"Prevent multiple login failures to mitigate brute force attacks\", \"bypass\": [{\"name\": \"url\", \"value\": \"example.com/*\"}], \"threshold\": 1000, \"period\": 60, \"correlate\": {\"by\": \"nat\"}, \"action\": {\"mode\": \"simulate\", \"timeout\": 60, \"response\": {\"content_type\": \"text/plain\", \"body\": \"This request has been rate-limited.\"}}, \"match\": {\"request\": {\"methods\": [\"_ALL_\"], \"schemes\": [\"_ALL_\"], \"url\": \"*.example.org/path*\"}, \"response\": {\"status\": [403], \"headers\": [{\"name\": \"Cf-Cache-Status\", \"op\": \"ne\", \"value\": \"HIT\"}], \"origin_traffic\": false}}}}";
    String createZoneRateLimitsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/rate_limits", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RatelimitInputBypassItem model
    RatelimitInputBypassItem ratelimitInputBypassItemModel = new RatelimitInputBypassItem.Builder()
    .name("url")
    .value("api.example.com/*")
    .build();

    // Construct an instance of the RatelimitInputActionResponse model
    RatelimitInputActionResponse ratelimitInputActionResponseModel = new RatelimitInputActionResponse.Builder()
    .contentType("text/plain")
    .body("This request has been rate-limited.")
    .build();

    // Construct an instance of the RatelimitInputAction model
    RatelimitInputAction ratelimitInputActionModel = new RatelimitInputAction.Builder()
    .mode("simulate")
    .timeout(Long.valueOf("60"))
    .response(ratelimitInputActionResponseModel)
    .build();

    // Construct an instance of the RatelimitInputCorrelate model
    RatelimitInputCorrelate ratelimitInputCorrelateModel = new RatelimitInputCorrelate.Builder()
    .by("nat")
    .build();

    // Construct an instance of the RatelimitInputMatchRequest model
    RatelimitInputMatchRequest ratelimitInputMatchRequestModel = new RatelimitInputMatchRequest.Builder()
    .methods(new java.util.ArrayList<String>(java.util.Arrays.asList("GET")))
    .schemes(new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")))
    .url("*.example.org/path*")
    .build();

    // Construct an instance of the RatelimitInputMatchResponseHeadersItem model
    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
    .name("Cf-Cache-Status")
    .op("ne")
    .value("HIT")
    .build();

    // Construct an instance of the RatelimitInputMatchResponse model
    RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
    .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
    .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
    .originTraffic(false)
    .build();

    // Construct an instance of the RatelimitInputMatch model
    RatelimitInputMatch ratelimitInputMatchModel = new RatelimitInputMatch.Builder()
    .request(ratelimitInputMatchRequestModel)
    .response(ratelimitInputMatchResponseModel)
    .build();

    // Construct an instance of the CreateZoneRateLimitsOptions model
    CreateZoneRateLimitsOptions createZoneRateLimitsOptionsModel = new CreateZoneRateLimitsOptions.Builder()
    .disabled(false)
    .description("Prevent multiple login failures to mitigate brute force attacks")
    .bypass(new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)))
    .threshold(Long.valueOf("1000"))
    .period(Long.valueOf("60"))
    .action(ratelimitInputActionModel)
    .correlate(ratelimitInputCorrelateModel)
    .match(ratelimitInputMatchModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RatelimitResp> response = zoneRateLimitsService.createZoneRateLimits(createZoneRateLimitsOptionsModel).execute();
    assertNotNull(response);
    RatelimitResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createZoneRateLimitsPath);
  }

  @Test
  public void testDeleteZoneRateLimitWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"[]\"]], \"messages\": [[\"[]\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZoneRateLimitPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/rate_limits/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteZoneRateLimitOptions model
    DeleteZoneRateLimitOptions deleteZoneRateLimitOptionsModel = new DeleteZoneRateLimitOptions.Builder()
    .rateLimitIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteRateLimitResp> response = zoneRateLimitsService.deleteZoneRateLimit(deleteZoneRateLimitOptionsModel).execute();
    assertNotNull(response);
    DeleteRateLimitResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZoneRateLimitPath);
  }

  // Test the deleteZoneRateLimit operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneRateLimitNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneRateLimitsService.deleteZoneRateLimit(null).execute();
  }

  @Test
  public void testGetRateLimitWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"[]\"]], \"messages\": [[\"[]\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"disabled\": false, \"description\": \"Prevent multiple login failures to mitigate brute force attacks\", \"bypass\": [{\"name\": \"url\", \"value\": \"example.com/*\"}], \"threshold\": 1000, \"period\": 60, \"correlate\": {\"by\": \"nat\"}, \"action\": {\"mode\": \"simulate\", \"timeout\": 60, \"response\": {\"content_type\": \"text/plain\", \"body\": \"This request has been rate-limited.\"}}, \"match\": {\"request\": {\"methods\": [\"_ALL_\"], \"schemes\": [\"_ALL_\"], \"url\": \"*.example.org/path*\"}, \"response\": {\"status\": [403], \"headers\": [{\"name\": \"Cf-Cache-Status\", \"op\": \"ne\", \"value\": \"HIT\"}], \"origin_traffic\": false}}}}";
    String getRateLimitPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/rate_limits/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetRateLimitOptions model
    GetRateLimitOptions getRateLimitOptionsModel = new GetRateLimitOptions.Builder()
    .rateLimitIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RatelimitResp> response = zoneRateLimitsService.getRateLimit(getRateLimitOptionsModel).execute();
    assertNotNull(response);
    RatelimitResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getRateLimitPath);
  }

  // Test the getRateLimit operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRateLimitNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneRateLimitsService.getRateLimit(null).execute();
  }

  @Test
  public void testUpdateRateLimitWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"[]\"]], \"messages\": [[\"[]\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"disabled\": false, \"description\": \"Prevent multiple login failures to mitigate brute force attacks\", \"bypass\": [{\"name\": \"url\", \"value\": \"example.com/*\"}], \"threshold\": 1000, \"period\": 60, \"correlate\": {\"by\": \"nat\"}, \"action\": {\"mode\": \"simulate\", \"timeout\": 60, \"response\": {\"content_type\": \"text/plain\", \"body\": \"This request has been rate-limited.\"}}, \"match\": {\"request\": {\"methods\": [\"_ALL_\"], \"schemes\": [\"_ALL_\"], \"url\": \"*.example.org/path*\"}, \"response\": {\"status\": [403], \"headers\": [{\"name\": \"Cf-Cache-Status\", \"op\": \"ne\", \"value\": \"HIT\"}], \"origin_traffic\": false}}}}";
    String updateRateLimitPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/rate_limits/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RatelimitInputBypassItem model
    RatelimitInputBypassItem ratelimitInputBypassItemModel = new RatelimitInputBypassItem.Builder()
    .name("url")
    .value("api.example.com/*")
    .build();

    // Construct an instance of the RatelimitInputActionResponse model
    RatelimitInputActionResponse ratelimitInputActionResponseModel = new RatelimitInputActionResponse.Builder()
    .contentType("text/plain")
    .body("This request has been rate-limited.")
    .build();

    // Construct an instance of the RatelimitInputAction model
    RatelimitInputAction ratelimitInputActionModel = new RatelimitInputAction.Builder()
    .mode("simulate")
    .timeout(Long.valueOf("60"))
    .response(ratelimitInputActionResponseModel)
    .build();

    // Construct an instance of the RatelimitInputCorrelate model
    RatelimitInputCorrelate ratelimitInputCorrelateModel = new RatelimitInputCorrelate.Builder()
    .by("nat")
    .build();

    // Construct an instance of the RatelimitInputMatchRequest model
    RatelimitInputMatchRequest ratelimitInputMatchRequestModel = new RatelimitInputMatchRequest.Builder()
    .methods(new java.util.ArrayList<String>(java.util.Arrays.asList("GET")))
    .schemes(new java.util.ArrayList<String>(java.util.Arrays.asList("HTTP")))
    .url("*.example.org/path*")
    .build();

    // Construct an instance of the RatelimitInputMatchResponseHeadersItem model
    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
    .name("Cf-Cache-Status")
    .op("ne")
    .value("HIT")
    .build();

    // Construct an instance of the RatelimitInputMatchResponse model
    RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
    .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
    .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
    .originTraffic(false)
    .build();

    // Construct an instance of the RatelimitInputMatch model
    RatelimitInputMatch ratelimitInputMatchModel = new RatelimitInputMatch.Builder()
    .request(ratelimitInputMatchRequestModel)
    .response(ratelimitInputMatchResponseModel)
    .build();

    // Construct an instance of the UpdateRateLimitOptions model
    UpdateRateLimitOptions updateRateLimitOptionsModel = new UpdateRateLimitOptions.Builder()
    .rateLimitIdentifier("testString")
    .disabled(false)
    .description("Prevent multiple login failures to mitigate brute force attacks")
    .bypass(new java.util.ArrayList<RatelimitInputBypassItem>(java.util.Arrays.asList(ratelimitInputBypassItemModel)))
    .threshold(Long.valueOf("1000"))
    .period(Long.valueOf("60"))
    .action(ratelimitInputActionModel)
    .correlate(ratelimitInputCorrelateModel)
    .match(ratelimitInputMatchModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RatelimitResp> response = zoneRateLimitsService.updateRateLimit(updateRateLimitOptionsModel).execute();
    assertNotNull(response);
    RatelimitResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateRateLimitPath);
  }

  // Test the updateRateLimit operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateRateLimitNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneRateLimitsService.updateRateLimit(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    zoneRateLimitsService = null;
  }
}