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
package com.ibm.cloud.networking.global_load_balancer.v1;

import com.ibm.cloud.networking.global_load_balancer.v1.GlobalLoadBalancer;
import com.ibm.cloud.networking.global_load_balancer.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancersRespResult;
import com.ibm.cloud.networking.global_load_balancer.v1.model.EditLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.GetLoadBalancerSettingsOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListAllLoadBalancersOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.LoadBalancerPack;
import com.ibm.cloud.networking.global_load_balancer.v1.model.LoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ResultInfo;
import com.ibm.cloud.networking.global_load_balancer.v1.utils.TestUtilities;
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
 * Unit test class for the GlobalLoadBalancer service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class GlobalLoadBalancerTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected GlobalLoadBalancer globalLoadBalancerService;

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

    globalLoadBalancerService = GlobalLoadBalancer.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    globalLoadBalancerService.setServiceUrl(url);
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

    new GlobalLoadBalancer(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(globalLoadBalancerService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(globalLoadBalancerService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllLoadBalancersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"699d98642c564d2e855e9661899b7252\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Load Balancer for www.example.com\", \"name\": \"www.example.com\", \"ttl\": 30, \"fallback_pool\": \"17b5962d775c646f3f9725cbc7a53df4\", \"default_pools\": [\"defaultPools\"], \"region_pools\": {\"mapKey\": \"anyValue\"}, \"pop_pools\": {\"mapKey\": \"anyValue\"}, \"proxied\": true, \"enabled\": true, \"session_affinity\": \"ip_cookie\", \"steering_policy\": \"dynamic_latency\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listAllLoadBalancersPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllLoadBalancersOptions model
    ListAllLoadBalancersOptions listAllLoadBalancersOptionsModel = new ListAllLoadBalancersOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListLoadBalancersResp> response = globalLoadBalancerService.listAllLoadBalancers(listAllLoadBalancersOptionsModel).execute();
    assertNotNull(response);
    ListLoadBalancersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listAllLoadBalancersPath);
  }

  @Test
  public void testCreateLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"699d98642c564d2e855e9661899b7252\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Load Balancer for www.example.com\", \"name\": \"www.example.com\", \"ttl\": 30, \"fallback_pool\": \"17b5962d775c646f3f9725cbc7a53df4\", \"default_pools\": [\"defaultPools\"], \"region_pools\": {\"mapKey\": \"anyValue\"}, \"pop_pools\": {\"mapKey\": \"anyValue\"}, \"proxied\": true, \"enabled\": true, \"session_affinity\": \"ip_cookie\", \"steering_policy\": \"dynamic_latency\"}}";
    String createLoadBalancerPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateLoadBalancerOptions model
    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
    .name("www.example.com")
    .fallbackPool("17b5962d775c646f3f9725cbc7a53df4")
    .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("Load Balancer for www.example.com")
    .ttl(Long.valueOf("30"))
    .regionPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .popPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .proxied(true)
    .enabled(true)
    .sessionAffinity("ip_cookie")
    .steeringPolicy("dynamic_latency")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancersResp> response = globalLoadBalancerService.createLoadBalancer(createLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createLoadBalancerPath);
  }

  @Test
  public void testEditLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"699d98642c564d2e855e9661899b7252\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Load Balancer for www.example.com\", \"name\": \"www.example.com\", \"ttl\": 30, \"fallback_pool\": \"17b5962d775c646f3f9725cbc7a53df4\", \"default_pools\": [\"defaultPools\"], \"region_pools\": {\"mapKey\": \"anyValue\"}, \"pop_pools\": {\"mapKey\": \"anyValue\"}, \"proxied\": true, \"enabled\": true, \"session_affinity\": \"ip_cookie\", \"steering_policy\": \"dynamic_latency\"}}";
    String editLoadBalancerPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EditLoadBalancerOptions model
    EditLoadBalancerOptions editLoadBalancerOptionsModel = new EditLoadBalancerOptions.Builder()
    .loadBalancerIdentifier("testString")
    .name("www.example.com")
    .fallbackPool("17b5962d775c646f3f9725cbc7a53df4")
    .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("Load Balancer for www.example.com")
    .ttl(Long.valueOf("30"))
    .regionPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .popPools(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .proxied(true)
    .enabled(true)
    .sessionAffinity("ip_cookie")
    .steeringPolicy("dynamic_latency")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancersResp> response = globalLoadBalancerService.editLoadBalancer(editLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, editLoadBalancerPath);
  }

  // Test the editLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerService.editLoadBalancer(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"699d98642c564d2e855e9661899b7252\"}}";
    String deleteLoadBalancerPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerOptions model
    DeleteLoadBalancerOptions deleteLoadBalancerOptionsModel = new DeleteLoadBalancerOptions.Builder()
    .loadBalancerIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteLoadBalancersResp> response = globalLoadBalancerService.deleteLoadBalancer(deleteLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    DeleteLoadBalancersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteLoadBalancerPath);
  }

  // Test the deleteLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerService.deleteLoadBalancer(null).execute();
  }

  @Test
  public void testGetLoadBalancerSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"699d98642c564d2e855e9661899b7252\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Load Balancer for www.example.com\", \"name\": \"www.example.com\", \"ttl\": 30, \"fallback_pool\": \"17b5962d775c646f3f9725cbc7a53df4\", \"default_pools\": [\"defaultPools\"], \"region_pools\": {\"mapKey\": \"anyValue\"}, \"pop_pools\": {\"mapKey\": \"anyValue\"}, \"proxied\": true, \"enabled\": true, \"session_affinity\": \"ip_cookie\", \"steering_policy\": \"dynamic_latency\"}}";
    String getLoadBalancerSettingsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerSettingsOptions model
    GetLoadBalancerSettingsOptions getLoadBalancerSettingsOptionsModel = new GetLoadBalancerSettingsOptions.Builder()
    .loadBalancerIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancersResp> response = globalLoadBalancerService.getLoadBalancerSettings(getLoadBalancerSettingsOptionsModel).execute();
    assertNotNull(response);
    LoadBalancersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getLoadBalancerSettingsPath);
  }

  // Test the getLoadBalancerSettings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerSettingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerService.getLoadBalancerSettings(null).execute();
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
    globalLoadBalancerService = null;
  }
}