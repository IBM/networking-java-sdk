/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.transit_gateway_apis.v1;

import com.ibm.cloud.networking.transit_gateway_apis.v1.TransitGatewayApis;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionActionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetGatewayLocationOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListGatewayLocationsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionPrefixFiltersOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayRouteReportsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewaysOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterPut;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ReplaceTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReport;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportConnectionBgp;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportConnectionRoute;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportOverlappingRoute;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportOverlappingRouteGroup;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocalLocation;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocation;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocationBasic;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnectionCollectionFirst;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnectionCollectionNext;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGateway;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollectionFirst;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollectionNext;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCustZone;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilter;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
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
 * Unit test class for the TransitGatewayApis service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class TransitGatewayApisTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected TransitGatewayApis transitGatewayApisService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    transitGatewayApisService = TransitGatewayApis.newInstance(version, serviceName);
    String url = server.url("/").toString();
    transitGatewayApisService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    new TransitGatewayApis(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(transitGatewayApisService.getVersion(), "testString");
  }

  @Test
  public void testListTransitGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?start=MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa\"}, \"transit_gateways\": [{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewaysPath = "/transit_gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTransitGatewaysOptions model
    ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions.Builder()
    .limit(Long.valueOf("1"))
    .start("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayCollection> response = transitGatewayApisService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("start"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewaysPath);
  }
  
  public void testListTransitGatewaysWOptionsWRetries() throws Throwable {
    // Enable retries and run testListTransitGatewaysWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewaysWOptions();

    // Disable retries and run testListTransitGatewaysWOptions.
    transitGatewayApisService.disableRetries();
    testListTransitGatewaysWOptions();
  }  

  @Test
  public void testCreateTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayPath = "/transit_gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d6043e9465c883cb9f7363e78e8")
    .build();

    // Construct an instance of the CreateTransitGatewayOptions model
    CreateTransitGatewayOptions createTransitGatewayOptionsModel = new CreateTransitGatewayOptions.Builder()
    .location("us-south")
    .name("Transit_Service_BWTN_SJ_DL")
    .global(true)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGateway> response = transitGatewayApisService.createTransitGateway(createTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayPath);
  }
  
  public void testCreateTransitGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTransitGatewayWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayWOptions();

    // Disable retries and run testCreateTransitGatewayWOptions.
    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayWOptions();
  }  

  // Test the createTransitGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.createTransitGateway(null).execute();
  }

  @Test
  public void testDeleteTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTransitGatewayPath = "/transit_gateways/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTransitGatewayOptions model
    DeleteTransitGatewayOptions deleteTransitGatewayOptionsModel = new DeleteTransitGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = transitGatewayApisService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayPath);
  }
  
  public void testDeleteTransitGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteTransitGatewayWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayWOptions();

    // Disable retries and run testDeleteTransitGatewayWOptions.
    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayWOptions();
  }  

  // Test the deleteTransitGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.deleteTransitGateway(null).execute();
  }

  @Test
  public void testGetTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayPath = "/transit_gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTransitGatewayOptions model
    GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGateway> response = transitGatewayApisService.getTransitGateway(getTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayPath);
  }
  
  public void testGetTransitGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetTransitGatewayWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayWOptions();

    // Disable retries and run testGetTransitGatewayWOptions.
    transitGatewayApisService.disableRetries();
    testGetTransitGatewayWOptions();
  }  

  // Test the getTransitGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getTransitGateway(null).execute();
  }

  @Test
  public void testUpdateTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateTransitGatewayPath = "/transit_gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateTransitGatewayOptions model
    UpdateTransitGatewayOptions updateTransitGatewayOptionsModel = new UpdateTransitGatewayOptions.Builder()
    .id("testString")
    .global(true)
    .name("my-transit-gateway")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGateway> response = transitGatewayApisService.updateTransitGateway(updateTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayPath);
  }
  
  public void testUpdateTransitGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateTransitGatewayWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayWOptions();

    // Disable retries and run testUpdateTransitGatewayWOptions.
    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayWOptions();
  }  

  // Test the updateTransitGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.updateTransitGateway(null).execute();
  }

  @Test
  public void testListConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"name\": \"Transit_Service_SJ_DL\", \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"transit_gateway\": {\"crn\": \"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"id\": \"456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"name\": \"my-transit-gw100\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?start=MjAyMC0wNS0wOVQxNjoyMDoyMC4yMjQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOVQxNjoyMDoyMC4yMjQ5NzNa\"}}";
    String listConnectionsPath = "/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListConnectionsOptions model
    ListConnectionsOptions listConnectionsOptionsModel = new ListConnectionsOptions.Builder()
    .limit(Long.valueOf("1"))
    .start("testString")
    .networkId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitConnectionCollection> response = transitGatewayApisService.listConnections(listConnectionsOptionsModel).execute();
    assertNotNull(response);
    TransitConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("start"), "testString");
    assertEquals(query.get("network_id"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConnectionsPath);
  }
  
  public void testListConnectionsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListConnectionsWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListConnectionsWOptions();

    // Disable retries and run testListConnectionsWOptions.
    transitGatewayApisService.disableRetries();
    testListConnectionsWOptions();
  }  

  @Test
  public void testListTransitGatewayConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}]}";
    String listTransitGatewayConnectionsPath = "/transit_gateways/testString/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTransitGatewayConnectionsOptions model
    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptionsModel = new ListTransitGatewayConnectionsOptions.Builder()
    .transitGatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCollection> response = transitGatewayApisService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayConnectionsPath);
  }
  
  public void testListTransitGatewayConnectionsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListTransitGatewayConnectionsWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayConnectionsWOptions();

    // Disable retries and run testListTransitGatewayConnectionsWOptions.
    transitGatewayApisService.disableRetries();
    testListTransitGatewayConnectionsWOptions();
  }  

  // Test the listTransitGatewayConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.listTransitGatewayConnections(null).execute();
  }

  @Test
  public void testCreateTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String createTransitGatewayConnectionPath = "/transit_gateways/testString/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the TransitGatewayConnectionPrefixFilter model
    TransitGatewayConnectionPrefixFilter transitGatewayConnectionPrefixFilterModel = new TransitGatewayConnectionPrefixFilter.Builder()
    .action("permit")
    .ge(Long.valueOf("0"))
    .le(Long.valueOf("32"))
    .prefix("192.168.100.0/24")
    .build();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the CreateTransitGatewayConnectionOptions model
    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .networkType("vpc")
    .baseConnectionId("975f58c1-afe7-469a-9727-7f3d720f2d32")
    .baseNetworkType("classic")
    .localGatewayIp("192.168.100.1")
    .localTunnelIp("192.168.129.2")
    .name("Transit_Service_BWTN_SJ_DL")
    .networkAccountId("28e4d90ac7504be694471ee66e70d0d5")
    .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .prefixFilters(new java.util.ArrayList<TransitGatewayConnectionPrefixFilter>(java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel)))
    .prefixFiltersDefault("permit")
    .remoteBgpAsn(Long.valueOf("65010"))
    .remoteGatewayIp("10.242.63.12")
    .remoteTunnelIp("192.168.129.1")
    .zone(zoneIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionPath);
  }
  
  public void testCreateTransitGatewayConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTransitGatewayConnectionWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionWOptions();

    // Disable retries and run testCreateTransitGatewayConnectionWOptions.
    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionWOptions();
  }  

  // Test the createTransitGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.createTransitGatewayConnection(null).execute();
  }

  @Test
  public void testDeleteTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTransitGatewayConnectionOptions model
    DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayConnectionPath);
  }
  
  public void testDeleteTransitGatewayConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteTransitGatewayConnectionWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayConnectionWOptions();

    // Disable retries and run testDeleteTransitGatewayConnectionWOptions.
    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayConnectionWOptions();
  }  

  // Test the deleteTransitGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.deleteTransitGatewayConnection(null).execute();
  }

  @Test
  public void testGetTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String getTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTransitGatewayConnectionOptions model
    GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.getTransitGatewayConnection(getTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayConnectionPath);
  }
  
  public void testGetTransitGatewayConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetTransitGatewayConnectionWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayConnectionWOptions();

    // Disable retries and run testGetTransitGatewayConnectionWOptions.
    transitGatewayApisService.disableRetries();
    testGetTransitGatewayConnectionWOptions();
  }  

  // Test the getTransitGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getTransitGatewayConnection(null).execute();
  }

  @Test
  public void testUpdateTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String updateTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateTransitGatewayConnectionOptions model
    UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .name("Transit_Service_BWTN_SJ_DL")
    .prefixFiltersDefault("permit")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayConnectionPath);
  }
  
  public void testUpdateTransitGatewayConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateTransitGatewayConnectionWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayConnectionWOptions();

    // Disable retries and run testUpdateTransitGatewayConnectionWOptions.
    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayConnectionWOptions();
  }  

  // Test the updateTransitGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.updateTransitGatewayConnection(null).execute();
  }

  @Test
  public void testCreateTransitGatewayConnectionActionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String createTransitGatewayConnectionActionsPath = "/transit_gateways/testString/connections/testString/actions";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateTransitGatewayConnectionActionsOptions model
    CreateTransitGatewayConnectionActionsOptions createTransitGatewayConnectionActionsOptionsModel = new CreateTransitGatewayConnectionActionsOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .action("approve")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = transitGatewayApisService.createTransitGatewayConnectionActions(createTransitGatewayConnectionActionsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionActionsPath);
  }
  
  public void testCreateTransitGatewayConnectionActionsWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTransitGatewayConnectionActionsWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionActionsWOptions();

    // Disable retries and run testCreateTransitGatewayConnectionActionsWOptions.
    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionActionsWOptions();
  }  

  // Test the createTransitGatewayConnectionActions operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionActionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.createTransitGatewayConnectionActions(null).execute();
  }

  @Test
  public void testListGatewayLocationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"locations\": [{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\"}]}";
    String listGatewayLocationsPath = "/locations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewayLocationsOptions model
    ListGatewayLocationsOptions listGatewayLocationsOptionsModel = new ListGatewayLocationsOptions();

    // Invoke operation with valid options model (positive test)
    Response<TSCollection> response = transitGatewayApisService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
    assertNotNull(response);
    TSCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayLocationsPath);
  }
  
  public void testListGatewayLocationsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewayLocationsWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListGatewayLocationsWOptions();

    // Disable retries and run testListGatewayLocationsWOptions.
    transitGatewayApisService.disableRetries();
    testListGatewayLocationsWOptions();
  }  

  @Test
  public void testGetGatewayLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\", \"local_connection_locations\": [{\"display_name\": \"Dallas\", \"name\": \"us-south\", \"supported_connection_types\": [\"supportedConnectionTypes\"], \"type\": \"region\"}]}";
    String getGatewayLocationPath = "/locations/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayLocationOptions model
    GetGatewayLocationOptions getGatewayLocationOptionsModel = new GetGatewayLocationOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TSLocation> response = transitGatewayApisService.getGatewayLocation(getGatewayLocationOptionsModel).execute();
    assertNotNull(response);
    TSLocation responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayLocationPath);
  }
  
  public void testGetGatewayLocationWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayLocationWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testGetGatewayLocationWOptions();

    // Disable retries and run testGetGatewayLocationWOptions.
    transitGatewayApisService.disableRetries();
    testGetGatewayLocationWOptions();
  }  

  // Test the getGatewayLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getGatewayLocation(null).execute();
  }

  @Test
  public void testListTransitGatewayConnectionPrefixFiltersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewayConnectionPrefixFiltersPath = "/transit_gateways/testString/connections/testString/prefix_filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTransitGatewayConnectionPrefixFiltersOptions model
    ListTransitGatewayConnectionPrefixFiltersOptions listTransitGatewayConnectionPrefixFiltersOptionsModel = new ListTransitGatewayConnectionPrefixFiltersOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefixFilterCollection> response = transitGatewayApisService.listTransitGatewayConnectionPrefixFilters(listTransitGatewayConnectionPrefixFiltersOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayConnectionPrefixFiltersPath);
  }
  
  public void testListTransitGatewayConnectionPrefixFiltersWOptionsWRetries() throws Throwable {
    // Enable retries and run testListTransitGatewayConnectionPrefixFiltersWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayConnectionPrefixFiltersWOptions();

    // Disable retries and run testListTransitGatewayConnectionPrefixFiltersWOptions.
    transitGatewayApisService.disableRetries();
    testListTransitGatewayConnectionPrefixFiltersWOptions();
  }  

  // Test the listTransitGatewayConnectionPrefixFilters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayConnectionPrefixFiltersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.listTransitGatewayConnectionPrefixFilters(null).execute();
  }

  @Test
  public void testCreateTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateTransitGatewayConnectionPrefixFilterOptions model
    CreateTransitGatewayConnectionPrefixFilterOptions createTransitGatewayConnectionPrefixFilterOptionsModel = new CreateTransitGatewayConnectionPrefixFilterOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .action("permit")
    .prefix("192.168.100.0/24")
    .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
    .ge(Long.valueOf("0"))
    .le(Long.valueOf("32"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefixFilterCust> response = transitGatewayApisService.createTransitGatewayConnectionPrefixFilter(createTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionPrefixFilterPath);
  }
  
  public void testCreateTransitGatewayConnectionPrefixFilterWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionPrefixFilterWOptions();

    // Disable retries and run testCreateTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionPrefixFilterWOptions();
  }  

  // Test the createTransitGatewayConnectionPrefixFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.createTransitGatewayConnectionPrefixFilter(null).execute();
  }

  @Test
  public void testReplaceTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PrefixFilterPut model
    PrefixFilterPut prefixFilterPutModel = new PrefixFilterPut.Builder()
    .action("permit")
    .ge(Long.valueOf("0"))
    .le(Long.valueOf("32"))
    .prefix("192.168.100.0/24")
    .build();

    // Construct an instance of the ReplaceTransitGatewayConnectionPrefixFilterOptions model
    ReplaceTransitGatewayConnectionPrefixFilterOptions replaceTransitGatewayConnectionPrefixFilterOptionsModel = new ReplaceTransitGatewayConnectionPrefixFilterOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .prefixFilters(new java.util.ArrayList<PrefixFilterPut>(java.util.Arrays.asList(prefixFilterPutModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefixFilterCollection> response = transitGatewayApisService.replaceTransitGatewayConnectionPrefixFilter(replaceTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTransitGatewayConnectionPrefixFilterPath);
  }
  
  public void testReplaceTransitGatewayConnectionPrefixFilterWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testReplaceTransitGatewayConnectionPrefixFilterWOptions();

    // Disable retries and run testReplaceTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.disableRetries();
    testReplaceTransitGatewayConnectionPrefixFilterWOptions();
  }  

  // Test the replaceTransitGatewayConnectionPrefixFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.replaceTransitGatewayConnectionPrefixFilter(null).execute();
  }

  @Test
  public void testDeleteTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTransitGatewayConnectionPrefixFilterOptions model
    DeleteTransitGatewayConnectionPrefixFilterOptions deleteTransitGatewayConnectionPrefixFilterOptionsModel = new DeleteTransitGatewayConnectionPrefixFilterOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .filterId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayConnectionPrefixFilter(deleteTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayConnectionPrefixFilterPath);
  }
  
  public void testDeleteTransitGatewayConnectionPrefixFilterWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayConnectionPrefixFilterWOptions();

    // Disable retries and run testDeleteTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayConnectionPrefixFilterWOptions();
  }  

  // Test the deleteTransitGatewayConnectionPrefixFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.deleteTransitGatewayConnectionPrefixFilter(null).execute();
  }

  @Test
  public void testGetTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTransitGatewayConnectionPrefixFilterOptions model
    GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptionsModel = new GetTransitGatewayConnectionPrefixFilterOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .filterId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefixFilterCust> response = transitGatewayApisService.getTransitGatewayConnectionPrefixFilter(getTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayConnectionPrefixFilterPath);
  }
  
  public void testGetTransitGatewayConnectionPrefixFilterWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayConnectionPrefixFilterWOptions();

    // Disable retries and run testGetTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.disableRetries();
    testGetTransitGatewayConnectionPrefixFilterWOptions();
  }  

  // Test the getTransitGatewayConnectionPrefixFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getTransitGatewayConnectionPrefixFilter(null).execute();
  }

  @Test
  public void testUpdateTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateTransitGatewayConnectionPrefixFilterOptions model
    UpdateTransitGatewayConnectionPrefixFilterOptions updateTransitGatewayConnectionPrefixFilterOptionsModel = new UpdateTransitGatewayConnectionPrefixFilterOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .filterId("testString")
    .action("permit")
    .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
    .ge(Long.valueOf("0"))
    .le(Long.valueOf("32"))
    .prefix("192.168.100.0/24")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefixFilterCust> response = transitGatewayApisService.updateTransitGatewayConnectionPrefixFilter(updateTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayConnectionPrefixFilterPath);
  }
  
  public void testUpdateTransitGatewayConnectionPrefixFilterWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayConnectionPrefixFilterWOptions();

    // Disable retries and run testUpdateTransitGatewayConnectionPrefixFilterWOptions.
    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayConnectionPrefixFilterWOptions();
  }  

  // Test the updateTransitGatewayConnectionPrefixFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.updateTransitGatewayConnectionPrefixFilter(null).execute();
  }

  @Test
  public void testListTransitGatewayRouteReportsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"route_reports\": [{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewayRouteReportsPath = "/transit_gateways/testString/route_reports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTransitGatewayRouteReportsOptions model
    ListTransitGatewayRouteReportsOptions listTransitGatewayRouteReportsOptionsModel = new ListTransitGatewayRouteReportsOptions.Builder()
    .transitGatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReportCollection> response = transitGatewayApisService.listTransitGatewayRouteReports(listTransitGatewayRouteReportsOptionsModel).execute();
    assertNotNull(response);
    RouteReportCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayRouteReportsPath);
  }
  
  public void testListTransitGatewayRouteReportsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListTransitGatewayRouteReportsWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayRouteReportsWOptions();

    // Disable retries and run testListTransitGatewayRouteReportsWOptions.
    transitGatewayApisService.disableRetries();
    testListTransitGatewayRouteReportsWOptions();
  }  

  // Test the listTransitGatewayRouteReports operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayRouteReportsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.listTransitGatewayRouteReports(null).execute();
  }

  @Test
  public void testCreateTransitGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateTransitGatewayRouteReportOptions model
    CreateTransitGatewayRouteReportOptions createTransitGatewayRouteReportOptionsModel = new CreateTransitGatewayRouteReportOptions.Builder()
    .transitGatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReport> response = transitGatewayApisService.createTransitGatewayRouteReport(createTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayRouteReportPath);
  }
  
  public void testCreateTransitGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateTransitGatewayRouteReportWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayRouteReportWOptions();

    // Disable retries and run testCreateTransitGatewayRouteReportWOptions.
    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayRouteReportWOptions();
  }  

  // Test the createTransitGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.createTransitGatewayRouteReport(null).execute();
  }

  @Test
  public void testDeleteTransitGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTransitGatewayRouteReportOptions model
    DeleteTransitGatewayRouteReportOptions deleteTransitGatewayRouteReportOptionsModel = new DeleteTransitGatewayRouteReportOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayRouteReport(deleteTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayRouteReportPath);
  }
  
  public void testDeleteTransitGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteTransitGatewayRouteReportWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayRouteReportWOptions();

    // Disable retries and run testDeleteTransitGatewayRouteReportWOptions.
    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayRouteReportWOptions();
  }  

  // Test the deleteTransitGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.deleteTransitGatewayRouteReport(null).execute();
  }

  @Test
  public void testGetTransitGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTransitGatewayRouteReportOptions model
    GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptionsModel = new GetTransitGatewayRouteReportOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReport> response = transitGatewayApisService.getTransitGatewayRouteReport(getTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayRouteReportPath);
  }
  
  public void testGetTransitGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetTransitGatewayRouteReportWOptions.
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayRouteReportWOptions();

    // Disable retries and run testGetTransitGatewayRouteReportWOptions.
    transitGatewayApisService.disableRetries();
    testGetTransitGatewayRouteReportWOptions();
  }  

  // Test the getTransitGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getTransitGatewayRouteReport(null).execute();
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
    transitGatewayApisService = null;
  }
}