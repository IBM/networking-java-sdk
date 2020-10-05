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
package com.ibm.cloud.networking.global_load_balancer_events.v1;

import com.ibm.cloud.networking.global_load_balancer_events.v1.GlobalLoadBalancerEvents;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.GetLoadBalancerEventsOptions;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsResp;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultInfo;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItemOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsRespResultItemPoolItem;
import com.ibm.cloud.networking.global_load_balancer_events.v1.utils.TestUtilities;
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
 * Unit test class for the GlobalLoadBalancerEvents service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class GlobalLoadBalancerEventsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected GlobalLoadBalancerEvents globalLoadBalancerEventsService;

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

    globalLoadBalancerEventsService = GlobalLoadBalancerEvents.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    globalLoadBalancerEventsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new GlobalLoadBalancerEvents(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(globalLoadBalancerEventsService.getCrn(), "testString");
  }

  @Test
  public void testGetLoadBalancerEventsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"timestamp\": \"2019-01-01T12:00:00\", \"pool\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"name\": \"some-pool\", \"healthy\": true, \"changed\": true, \"minimum_origins\": 1}], \"origins\": [{\"name\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"address\": \"1.2.3.4\", \"ip\": \"1.2.3.4\", \"enabled\": true, \"healthy\": true, \"failure_reason\": \"No failures\", \"changed\": true}]}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getLoadBalancerEventsPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/events", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerEventsOptions model
    GetLoadBalancerEventsOptions getLoadBalancerEventsOptionsModel = new GetLoadBalancerEventsOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListEventsResp> response = globalLoadBalancerEventsService.getLoadBalancerEvents(getLoadBalancerEventsOptionsModel).execute();
    assertNotNull(response);
    ListEventsResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getLoadBalancerEventsPath);
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
    globalLoadBalancerEventsService = null;
  }
}