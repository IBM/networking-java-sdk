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
package com.ibm.cloud.networking.security_events_api.v1;

import com.ibm.cloud.networking.security_events_api.v1.SecurityEventsApi;
import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfo;
import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfoCursors;
import com.ibm.cloud.networking.security_events_api.v1.model.ResultInfoScannedRange;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObject;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventObjectMatchesItem;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEvents;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventsOptions;
import com.ibm.cloud.networking.security_events_api.v1.utils.TestUtilities;
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
 * Unit test class for the SecurityEventsApi service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class SecurityEventsApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected SecurityEventsApi securityEventsApiService;

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
    String zoneId = "testString";

    securityEventsApiService = SecurityEventsApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    securityEventsApiService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneId = "testString";

    new SecurityEventsApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(securityEventsApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(securityEventsApiService.getZoneId(), "testString");
  }

  @Test
  public void testSecurityEventsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": [{\"ray_id\": \"4c6392789858b224\", \"kind\": \"firewall\", \"source\": \"rateLimit\", \"action\": \"drop\", \"rule_id\": \"fe38bd35ca284de69b5ecbaa6db87dc3\", \"ip\": \"192.168.1.1\", \"ip_class\": \"noRecord\", \"country\": \"CN\", \"colo\": \"HKG\", \"host\": \"www.example.com\", \"method\": \"GET\", \"proto\": \"HTTP/2\", \"scheme\": \"https\", \"ua\": \"curl/7.61.1\", \"uri\": \"/\", \"occurred_at\": \"2019-01-01T12:00:00\", \"matches\": [{\"rule_id\": \"fe38bd35ca284de69b5ecbaa6db87dc3\", \"source\": \"rateLimit\", \"action\": \"drop\", \"metadata\": {\"mapKey\": \"anyValue\"}}]}], \"result_info\": {\"cursors\": {\"after\": \"bnRIiaU-14b2YBxIefX28h7Zqw50XXPA4Vu4Sa-DPa4qaGH-z47uwtOR0Hm2Y3cSh56raQb1POqaBwGXD44\", \"before\": \"dmmGxcD665xj3RiQ8eRqclts94GF3M4KpHEJ7AVekLtOUsHLHssfGaV_d8nZgLszk_iElB9LckPhFgmkTXHX\"}, \"scanned_range\": {\"since\": \"2019-04-12 07:44:18\", \"until\": \"2019-04-12 07:44:18\"}}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String securityEventsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/security/events", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SecurityEventsOptions model
    SecurityEventsOptions securityEventsOptionsModel = new SecurityEventsOptions.Builder()
    .ipClass("unknown")
    .method("GET")
    .scheme("unknown")
    .ip("testString")
    .host("testString")
    .proto("UNK")
    .uri("testString")
    .ua("testString")
    .colo("testString")
    .rayId("testString")
    .kind("firewall")
    .action("unknown")
    .cursor("testString")
    .country("testString")
    .since(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .source("unknown")
    .limit(Long.valueOf("10"))
    .ruleId("testString")
    .until(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityEvents> response = securityEventsApiService.securityEvents(securityEventsOptionsModel).execute();
    assertNotNull(response);
    SecurityEvents responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("ip_class"), "unknown");
    assertEquals(query.get("method"), "GET");
    assertEquals(query.get("scheme"), "unknown");
    assertEquals(query.get("ip"), "testString");
    assertEquals(query.get("host"), "testString");
    assertEquals(query.get("proto"), "UNK");
    assertEquals(query.get("uri"), "testString");
    assertEquals(query.get("ua"), "testString");
    assertEquals(query.get("colo"), "testString");
    assertEquals(query.get("ray_id"), "testString");
    assertEquals(query.get("kind"), "firewall");
    assertEquals(query.get("action"), "unknown");
    assertEquals(query.get("cursor"), "testString");
    assertEquals(query.get("country"), "testString");
    assertEquals(query.get("source"), "unknown");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("rule_id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, securityEventsPath);
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
    securityEventsApiService = null;
  }
}