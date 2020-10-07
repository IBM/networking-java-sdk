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
package com.ibm.cloud.networking.global_load_balancer_monitor.v1;

import com.ibm.cloud.networking.global_load_balancer_monitor.v1.GlobalLoadBalancerMonitor;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.CreateLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorRespResult;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.EditLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.GetLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListAllLoadBalancerMonitorsOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorPack;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ResultInfo;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
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
 * Unit test class for the GlobalLoadBalancerMonitor service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class GlobalLoadBalancerMonitorTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected GlobalLoadBalancerMonitor globalLoadBalancerMonitorService;

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

    globalLoadBalancerMonitorService = GlobalLoadBalancerMonitor.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    globalLoadBalancerMonitorService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new GlobalLoadBalancerMonitor(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(globalLoadBalancerMonitorService.getCrn(), "testString");
  }

  @Test
  public void testListAllLoadBalancerMonitorsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"type\": \"http\", \"description\": \"Login page monitor\", \"method\": \"GET\", \"port\": 8080, \"path\": \"/\", \"timeout\": 5, \"retries\": 2, \"interval\": 60, \"expected_body\": \"alive\", \"expected_codes\": \"2xx\", \"follow_redirects\": true, \"allow_insecure\": true}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listAllLoadBalancerMonitorsPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/monitors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllLoadBalancerMonitorsOptions model
    ListAllLoadBalancerMonitorsOptions listAllLoadBalancerMonitorsOptionsModel = new ListAllLoadBalancerMonitorsOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListMonitorResp> response = globalLoadBalancerMonitorService.listAllLoadBalancerMonitors(listAllLoadBalancerMonitorsOptionsModel).execute();
    assertNotNull(response);
    ListMonitorResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listAllLoadBalancerMonitorsPath);
  }

  @Test
  public void testCreateLoadBalancerMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"type\": \"http\", \"description\": \"Login page monitor\", \"method\": \"GET\", \"port\": 8080, \"path\": \"/\", \"timeout\": 5, \"retries\": 2, \"interval\": 60, \"expected_body\": \"alive\", \"expected_codes\": \"2xx\", \"follow_redirects\": true, \"allow_insecure\": true}}";
    String createLoadBalancerMonitorPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/monitors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateLoadBalancerMonitorOptions model
    CreateLoadBalancerMonitorOptions createLoadBalancerMonitorOptionsModel = new CreateLoadBalancerMonitorOptions.Builder()
    .type("http")
    .description("Login page monitor")
    .method("GET")
    .port(Long.valueOf("8080"))
    .path("/")
    .timeout(Long.valueOf("5"))
    .retries(Long.valueOf("2"))
    .interval(Long.valueOf("60"))
    .expectedCodes("2xx")
    .followRedirects(true)
    .expectedBody("alive")
    .allowInsecure(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MonitorResp> response = globalLoadBalancerMonitorService.createLoadBalancerMonitor(createLoadBalancerMonitorOptionsModel).execute();
    assertNotNull(response);
    MonitorResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createLoadBalancerMonitorPath);
  }

  @Test
  public void testEditLoadBalancerMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"type\": \"http\", \"description\": \"Login page monitor\", \"method\": \"GET\", \"port\": 8080, \"path\": \"/\", \"timeout\": 5, \"retries\": 2, \"interval\": 60, \"expected_body\": \"alive\", \"expected_codes\": \"2xx\", \"follow_redirects\": true, \"allow_insecure\": true}}";
    String editLoadBalancerMonitorPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditLoadBalancerMonitorOptions model
    EditLoadBalancerMonitorOptions editLoadBalancerMonitorOptionsModel = new EditLoadBalancerMonitorOptions.Builder()
    .monitorIdentifier("testString")
    .type("http")
    .description("Login page monitor")
    .method("GET")
    .port(Long.valueOf("8080"))
    .path("/")
    .timeout(Long.valueOf("5"))
    .retries(Long.valueOf("2"))
    .interval(Long.valueOf("60"))
    .expectedCodes("2xx")
    .followRedirects(true)
    .expectedBody("alive")
    .allowInsecure(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MonitorResp> response = globalLoadBalancerMonitorService.editLoadBalancerMonitor(editLoadBalancerMonitorOptionsModel).execute();
    assertNotNull(response);
    MonitorResp responseObj = response.getResult();
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
    assertEquals(parsedPath, editLoadBalancerMonitorPath);
  }

  // Test the editLoadBalancerMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditLoadBalancerMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerMonitorService.editLoadBalancerMonitor(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteLoadBalancerMonitorPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerMonitorOptions model
    DeleteLoadBalancerMonitorOptions deleteLoadBalancerMonitorOptionsModel = new DeleteLoadBalancerMonitorOptions.Builder()
    .monitorIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteMonitorResp> response = globalLoadBalancerMonitorService.deleteLoadBalancerMonitor(deleteLoadBalancerMonitorOptionsModel).execute();
    assertNotNull(response);
    DeleteMonitorResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteLoadBalancerMonitorPath);
  }

  // Test the deleteLoadBalancerMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerMonitorService.deleteLoadBalancerMonitor(null).execute();
  }

  @Test
  public void testGetLoadBalancerMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"type\": \"http\", \"description\": \"Login page monitor\", \"method\": \"GET\", \"port\": 8080, \"path\": \"/\", \"timeout\": 5, \"retries\": 2, \"interval\": 60, \"expected_body\": \"alive\", \"expected_codes\": \"2xx\", \"follow_redirects\": true, \"allow_insecure\": true}}";
    String getLoadBalancerMonitorPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerMonitorOptions model
    GetLoadBalancerMonitorOptions getLoadBalancerMonitorOptionsModel = new GetLoadBalancerMonitorOptions.Builder()
    .monitorIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MonitorResp> response = globalLoadBalancerMonitorService.getLoadBalancerMonitor(getLoadBalancerMonitorOptionsModel).execute();
    assertNotNull(response);
    MonitorResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getLoadBalancerMonitorPath);
  }

  // Test the getLoadBalancerMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerMonitorService.getLoadBalancerMonitor(null).execute();
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
    globalLoadBalancerMonitorService = null;
  }
}