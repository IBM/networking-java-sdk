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
package com.ibm.cloud.networking.routing.v1;

import com.ibm.cloud.networking.routing.v1.Routing;
import com.ibm.cloud.networking.routing.v1.model.GetSmartRoutingOptions;
import com.ibm.cloud.networking.routing.v1.model.SmartRoutingResp;
import com.ibm.cloud.networking.routing.v1.model.SmartRoutingRespResult;
import com.ibm.cloud.networking.routing.v1.model.UpdateSmartRoutingOptions;
import com.ibm.cloud.networking.routing.v1.utils.TestUtilities;
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
 * Unit test class for the Routing service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class RoutingTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Routing routingService;

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

    routingService = Routing.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    routingService.setServiceUrl(url);
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

    new Routing(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(routingService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(routingService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testGetSmartRoutingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"smart_routing\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getSmartRoutingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/routing/smart_routing", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSmartRoutingOptions model
    GetSmartRoutingOptions getSmartRoutingOptionsModel = new GetSmartRoutingOptions();

    // Invoke operation with valid options model (positive test)
    Response<SmartRoutingResp> response = routingService.getSmartRouting(getSmartRoutingOptionsModel).execute();
    assertNotNull(response);
    SmartRoutingResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getSmartRoutingPath);
  }

  @Test
  public void testUpdateSmartRoutingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"smart_routing\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateSmartRoutingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/routing/smart_routing", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateSmartRoutingOptions model
    UpdateSmartRoutingOptions updateSmartRoutingOptionsModel = new UpdateSmartRoutingOptions.Builder()
    .value("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SmartRoutingResp> response = routingService.updateSmartRouting(updateSmartRoutingOptionsModel).execute();
    assertNotNull(response);
    SmartRoutingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSmartRoutingPath);
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
    routingService = null;
  }
}