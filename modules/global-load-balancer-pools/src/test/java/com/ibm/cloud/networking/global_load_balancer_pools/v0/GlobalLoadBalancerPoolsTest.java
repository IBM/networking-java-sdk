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
package com.ibm.cloud.networking.global_load_balancer_pools.v0;

import com.ibm.cloud.networking.global_load_balancer_pools.v0.GlobalLoadBalancerPools;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolRespResult;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.EditLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.GetLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListAllLoadBalancerPoolsOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListLoadBalancerPoolsResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolPack;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolPackOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolReqOriginsItem;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ResultInfo;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.utils.TestUtilities;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GlobalLoadBalancerPools service.
 */
public class GlobalLoadBalancerPoolsTest{

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected GlobalLoadBalancerPools globalLoadBalancerPoolsService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    globalLoadBalancerPoolsService = GlobalLoadBalancerPools.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    globalLoadBalancerPoolsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new GlobalLoadBalancerPools(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(globalLoadBalancerPoolsService.getCrn(), "testString");
  }

  @Test
  public void testListAllLoadBalancerPoolsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"17b5962d775c646f3f9725cbc7a53df4\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Primary data center - Provider XYZ\", \"name\": \"primary-dc-1\", \"enabled\": true, \"healthy\": true, \"monitor\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"origins\": [{\"name\": \"app-server-1\", \"address\": \"0.0.0.0\", \"enabled\": true, \"healthy\": true}], \"notification_email\": \"someone@example.com\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listAllLoadBalancerPoolsPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllLoadBalancerPoolsOptions model
    ListAllLoadBalancerPoolsOptions listAllLoadBalancerPoolsOptionsModel = new ListAllLoadBalancerPoolsOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListLoadBalancerPoolsResp> response = globalLoadBalancerPoolsService.listAllLoadBalancerPools(listAllLoadBalancerPoolsOptionsModel).execute();
    assertNotNull(response);
    ListLoadBalancerPoolsResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listAllLoadBalancerPoolsPath);
  }

  @Test
  public void testCreateLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"17b5962d775c646f3f9725cbc7a53df4\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Primary data center - Provider XYZ\", \"name\": \"primary-dc-1\", \"enabled\": true, \"healthy\": true, \"monitor\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"origins\": [{\"name\": \"app-server-1\", \"address\": \"0.0.0.0\", \"enabled\": true, \"healthy\": true}], \"notification_email\": \"someone@example.com\"}, \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String createLoadBalancerPoolPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolReqOriginsItem model
    LoadBalancerPoolReqOriginsItem loadBalancerPoolReqOriginsItemModel = new LoadBalancerPoolReqOriginsItem.Builder()
    .name("app-server-1")
    .address("0.0.0.0")
    .enabled(true)
    .build();

    // Construct an instance of the CreateLoadBalancerPoolOptions model
    CreateLoadBalancerPoolOptions createLoadBalancerPoolOptionsModel = new CreateLoadBalancerPoolOptions.Builder()
    .name("primary-dc-1")
    .checkRegions(new java.util.ArrayList<String>(java.util.Arrays.asList("WNAM")))
    .origins(new java.util.ArrayList<LoadBalancerPoolReqOriginsItem>(java.util.Arrays.asList(loadBalancerPoolReqOriginsItemModel)))
    .description("Primary data center - Provider XYZ")
    .minimumOrigins(Long.valueOf("2"))
    .enabled(true)
    .monitor("f1aba936b94213e5b8dca0c0dbf1f9cc")
    .notificationEmail("someone@example.com")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolResp> response = globalLoadBalancerPoolsService.createLoadBalancerPool(createLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createLoadBalancerPoolPath);
  }

  @Test
  public void testGetLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"17b5962d775c646f3f9725cbc7a53df4\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Primary data center - Provider XYZ\", \"name\": \"primary-dc-1\", \"enabled\": true, \"healthy\": true, \"monitor\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"origins\": [{\"name\": \"app-server-1\", \"address\": \"0.0.0.0\", \"enabled\": true, \"healthy\": true}], \"notification_email\": \"someone@example.com\"}, \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String getLoadBalancerPoolPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerPoolOptions model
    GetLoadBalancerPoolOptions getLoadBalancerPoolOptionsModel = new GetLoadBalancerPoolOptions.Builder()
    .poolIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolResp> response = globalLoadBalancerPoolsService.getLoadBalancerPool(getLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getLoadBalancerPoolPath);
  }

  // Test the getLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerPoolsService.getLoadBalancerPool(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"17b5962d775c646f3f9725cbc7a53df4\"}}";
    String deleteLoadBalancerPoolPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerPoolOptions model
    DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptionsModel = new DeleteLoadBalancerPoolOptions.Builder()
    .poolIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteLoadBalancerPoolResp> response = globalLoadBalancerPoolsService.deleteLoadBalancerPool(deleteLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    DeleteLoadBalancerPoolResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteLoadBalancerPoolPath);
  }

  // Test the deleteLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerPoolsService.deleteLoadBalancerPool(null).execute();
  }

  @Test
  public void testEditLoadBalancerPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"17b5962d775c646f3f9725cbc7a53df4\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"description\": \"Primary data center - Provider XYZ\", \"name\": \"primary-dc-1\", \"enabled\": true, \"healthy\": true, \"monitor\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"origins\": [{\"name\": \"app-server-1\", \"address\": \"0.0.0.0\", \"enabled\": true, \"healthy\": true}], \"notification_email\": \"someone@example.com\"}, \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String editLoadBalancerPoolPath = java.net.URLEncoder.encode("/v1/testString/load_balancers/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerPoolReqOriginsItem model
    LoadBalancerPoolReqOriginsItem loadBalancerPoolReqOriginsItemModel = new LoadBalancerPoolReqOriginsItem.Builder()
    .name("app-server-1")
    .address("0.0.0.0")
    .enabled(true)
    .build();

    // Construct an instance of the EditLoadBalancerPoolOptions model
    EditLoadBalancerPoolOptions editLoadBalancerPoolOptionsModel = new EditLoadBalancerPoolOptions.Builder()
    .poolIdentifier("testString")
    .name("primary-dc-1")
    .checkRegions(new java.util.ArrayList<String>(java.util.Arrays.asList("WNAM")))
    .origins(new java.util.ArrayList<LoadBalancerPoolReqOriginsItem>(java.util.Arrays.asList(loadBalancerPoolReqOriginsItemModel)))
    .description("Primary data center - Provider XYZ")
    .minimumOrigins(Long.valueOf("2"))
    .enabled(true)
    .monitor("f1aba936b94213e5b8dca0c0dbf1f9cc")
    .notificationEmail("someone@example.com")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancerPoolResp> response = globalLoadBalancerPoolsService.editLoadBalancerPool(editLoadBalancerPoolOptionsModel).execute();
    assertNotNull(response);
    LoadBalancerPoolResp responseObj = response.getResult();
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
    assertEquals(parsedPath, editLoadBalancerPoolPath);
  }

  // Test the editLoadBalancerPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEditLoadBalancerPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    globalLoadBalancerPoolsService.editLoadBalancerPool(null).execute();
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
    globalLoadBalancerPoolsService = null;
  }
}