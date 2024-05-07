/*
 * (C) Copyright IBM Corp. 2024.
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
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ConnectionsPager;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionActionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayGreTunnelOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetGatewayLocationOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayGreTunnelOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GreTunnelZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListGatewayLocationsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionPrefixFiltersOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayRouteReportsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewaysOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationFirstConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationFirstTG;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationFirstTGWConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationNextConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationNextTG;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationNextTGWConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterPut;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RedundantGRETunnelCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RedundantGRETunnelReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ReplaceTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RgreTunnelZoneReference;
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
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGateway;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilter;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionsPager;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayRedundantGRETunnelReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayRedundantGRETunnelTemplate;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewaysPager;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneReferenceCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
public class TransitGatewayApisTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected TransitGatewayApis transitGatewayApisService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String version = "testString";
    new TransitGatewayApis(version, serviceName, null);
  }


  // Test the getter for the version global parameter
  @Test
  public void testGetVersion() throws Throwable {
    assertEquals(transitGatewayApisService.getVersion(), "testString");
  }

  // Test the listTransitGateways operation with a valid options model parameter
  @Test
  public void testListTransitGatewaysWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?start=MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa\"}, \"transit_gateways\": [{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\", \"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewaysPath = "/transit_gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTransitGatewaysOptions model
    ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions.Builder()
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listTransitGateways() with a valid options model and verify the result
    Response<TransitGatewayCollection> response = transitGatewayApisService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewaysPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listTransitGateways operation with and without retries enabled
  @Test
  public void testListTransitGatewaysWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewaysWOptions();

    transitGatewayApisService.disableRetries();
    testListTransitGatewaysWOptions();
  }

  // Test the listTransitGateways operation using the TransitGatewaysPager.getNext() method
  @Test
  public void testListTransitGatewaysWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"transit_gateways\":[{\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"crn\":\"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"my-transit-gateway-in-TransitGateway\",\"location\":\"us-south\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"global\":true,\"resource_group\":{\"href\":\"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\",\"id\":\"56969d6043e9465c883cb9f7363e78e8\"},\"status\":\"available\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"transit_gateways\":[{\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"crn\":\"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"my-transit-gateway-in-TransitGateway\",\"location\":\"us-south\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"global\":true,\"resource_group\":{\"href\":\"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\",\"id\":\"56969d6043e9465c883cb9f7363e78e8\"},\"status\":\"available\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTransitGatewaysOptions listTransitGatewaysOptions = new ListTransitGatewaysOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<TransitGateway> allResults = new ArrayList<>();
    TransitGatewaysPager pager = new TransitGatewaysPager(transitGatewayApisService, listTransitGatewaysOptions);
    while (pager.hasNext()) {
      List<TransitGateway> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTransitGateways operation using the TransitGatewaysPager.getAll() method
  @Test
  public void testListTransitGatewaysWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"transit_gateways\":[{\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"crn\":\"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"my-transit-gateway-in-TransitGateway\",\"location\":\"us-south\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"global\":true,\"resource_group\":{\"href\":\"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\",\"id\":\"56969d6043e9465c883cb9f7363e78e8\"},\"status\":\"available\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"transit_gateways\":[{\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"crn\":\"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"my-transit-gateway-in-TransitGateway\",\"location\":\"us-south\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"global\":true,\"resource_group\":{\"href\":\"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\",\"id\":\"56969d6043e9465c883cb9f7363e78e8\"},\"status\":\"available\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTransitGatewaysOptions listTransitGatewaysOptions = new ListTransitGatewaysOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    TransitGatewaysPager pager = new TransitGatewaysPager(transitGatewayApisService, listTransitGatewaysOptions);
    List<TransitGateway> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createTransitGateway operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\", \"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayPath = "/transit_gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

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

    // Invoke createTransitGateway() with a valid options model and verify the result
    Response<TransitGateway> response = transitGatewayApisService.createTransitGateway(createTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGateway operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayWOptions();
  }

  // Test the createTransitGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGateway(null).execute();
  }

  // Test the deleteTransitGateway operation with a valid options model parameter
  @Test
  public void testDeleteTransitGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTransitGatewayPath = "/transit_gateways/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTransitGatewayOptions model
    DeleteTransitGatewayOptions deleteTransitGatewayOptionsModel = new DeleteTransitGatewayOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteTransitGateway() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteTransitGateway operation with and without retries enabled
  @Test
  public void testDeleteTransitGatewayWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayWOptions();

    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayWOptions();
  }

  // Test the deleteTransitGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.deleteTransitGateway(null).execute();
  }

  // Test the getTransitGateway operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\", \"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayPath = "/transit_gateways/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayOptions model
    GetTransitGatewayOptions getTransitGatewayOptionsModel = new GetTransitGatewayOptions.Builder()
      .id("testString")
      .build();

    // Invoke getTransitGateway() with a valid options model and verify the result
    Response<TransitGateway> response = transitGatewayApisService.getTransitGateway(getTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGateway operation with and without retries enabled
  @Test
  public void testGetTransitGatewayWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayWOptions();
  }

  // Test the getTransitGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGateway(null).execute();
  }

  // Test the updateTransitGateway operation with a valid options model parameter
  @Test
  public void testUpdateTransitGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"global\": true, \"resource_group\": {\"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\", \"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateTransitGatewayPath = "/transit_gateways/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTransitGatewayOptions model
    UpdateTransitGatewayOptions updateTransitGatewayOptionsModel = new UpdateTransitGatewayOptions.Builder()
      .id("testString")
      .global(true)
      .name("my-transit-gateway")
      .build();

    // Invoke updateTransitGateway() with a valid options model and verify the result
    Response<TransitGateway> response = transitGatewayApisService.updateTransitGateway(updateTransitGatewayOptionsModel).execute();
    assertNotNull(response);
    TransitGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateTransitGateway operation with and without retries enabled
  @Test
  public void testUpdateTransitGatewayWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayWOptions();

    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayWOptions();
  }

  // Test the updateTransitGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.updateTransitGateway(null).execute();
  }

  // Test the listConnections operation with a valid options model parameter
  @Test
  public void testListConnectionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connections\": [{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"networkAccountId\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"transit_gateway\": {\"crn\": \"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"id\": \"456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"name\": \"my-transit-gw100\"}, \"tunnels\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?start=MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa\"}}";
    String listConnectionsPath = "/connections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConnectionsOptions model
    ListConnectionsOptions listConnectionsOptionsModel = new ListConnectionsOptions.Builder()
      .limit(Long.valueOf("10"))
      .start("testString")
      .networkId("testString")
      .build();

    // Invoke listConnections() with a valid options model and verify the result
    Response<TransitConnectionCollection> response = transitGatewayApisService.listConnections(listConnectionsOptionsModel).execute();
    assertNotNull(response);
    TransitConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConnectionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
    assertEquals(query.get("network_id"), "testString");
  }

  // Test the listConnections operation with and without retries enabled
  @Test
  public void testListConnectionsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListConnectionsWOptions();

    transitGatewayApisService.disableRetries();
    testListConnectionsWOptions();
  }

  // Test the listConnections operation using the ConnectionsPager.getNext() method
  @Test
  public void testListConnectionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"transit_gateway\":{\"crn\":\"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"id\":\"456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"name\":\"my-transit-gw100\"},\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"transit_gateway\":{\"crn\":\"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"id\":\"456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"name\":\"my-transit-gw100\"},\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConnectionsOptions listConnectionsOptions = new ListConnectionsOptions.Builder()
      .limit(Long.valueOf("10"))
      .networkId("testString")
      .build();

    List<TransitConnection> allResults = new ArrayList<>();
    ConnectionsPager pager = new ConnectionsPager(transitGatewayApisService, listConnectionsOptions);
    while (pager.hasNext()) {
      List<TransitConnection> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listConnections operation using the ConnectionsPager.getAll() method
  @Test
  public void testListConnectionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"transit_gateway\":{\"crn\":\"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"id\":\"456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"name\":\"my-transit-gw100\"},\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"transit_gateway\":{\"crn\":\"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"id\":\"456f58c1-afe7-123a-0a0a-7f3d720f1a44\",\"name\":\"my-transit-gw100\"},\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListConnectionsOptions listConnectionsOptions = new ListConnectionsOptions.Builder()
      .limit(Long.valueOf("10"))
      .networkId("testString")
      .build();

    ConnectionsPager pager = new ConnectionsPager(transitGatewayApisService, listConnectionsOptions);
    List<TransitConnection> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTransitGatewayConnections operation with a valid options model parameter
  @Test
  public void testListTransitGatewayConnectionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connections\": [{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"networkAccountId\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"tunnels\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways/{transit_gateway_id}/connections?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways/{transit_gateway_id}/connections?start=MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa\"}, \"total_count\": 500}";
    String listTransitGatewayConnectionsPath = "/transit_gateways/testString/connections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTransitGatewayConnectionsOptions model
    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptionsModel = new ListTransitGatewayConnectionsOptions.Builder()
      .transitGatewayId("testString")
      .start("testString")
      .limit(Long.valueOf("10"))
      .name("testString")
      .build();

    // Invoke listTransitGatewayConnections() with a valid options model and verify the result
    Response<TransitGatewayConnectionCollection> response = transitGatewayApisService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayConnectionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("name"), "testString");
  }

  // Test the listTransitGatewayConnections operation with and without retries enabled
  @Test
  public void testListTransitGatewayConnectionsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayConnectionsWOptions();

    transitGatewayApisService.disableRetries();
    testListTransitGatewayConnectionsWOptions();
  }

  // Test the listTransitGatewayConnections operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayConnectionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.listTransitGatewayConnections(null).execute();
  }

  // Test the listTransitGatewayConnections operation using the TransitGatewayConnectionsPager.getNext() method
  @Test
  public void testListTransitGatewayConnectionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptions = new ListTransitGatewayConnectionsOptions.Builder()
      .transitGatewayId("testString")
      .limit(Long.valueOf("10"))
      .name("testString")
      .build();

    List<TransitGatewayConnectionCust> allResults = new ArrayList<>();
    TransitGatewayConnectionsPager pager = new TransitGatewayConnectionsPager(transitGatewayApisService, listTransitGatewayConnectionsOptions);
    while (pager.hasNext()) {
      List<TransitGatewayConnectionCust> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listTransitGatewayConnections operation using the TransitGatewayConnectionsPager.getAll() method
  @Test
  public void testListTransitGatewayConnectionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"connections\":[{\"base_network_type\":\"classic\",\"name\":\"Transit_Service_BWTN_SJ_DL\",\"network_id\":\"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\",\"network_type\":\"vpc\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"base_connection_id\":\"975f58c1-afe7-469a-9727-7f3d720f2d32\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"local_bgp_asn\":64490,\"local_gateway_ip\":\"192.168.100.1\",\"local_tunnel_ip\":\"192.168.129.2\",\"mtu\":9000,\"network_account_id\":\"networkAccountId\",\"prefix_filters\":[{\"action\":\"permit\",\"before\":\"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\",\"created_at\":\"2019-01-01T12:00:00.000Z\",\"ge\":0,\"id\":\"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\",\"le\":32,\"prefix\":\"192.168.100.0/24\",\"updated_at\":\"2019-01-01T12:00:00.000Z\"}],\"prefix_filters_default\":\"permit\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.63.12\",\"remote_tunnel_ip\":\"192.168.129.1\",\"request_status\":\"pending\",\"status\":\"attached\",\"tunnels\":[{\"created_at\":\"2019-01-01T12:00:00.000Z\",\"id\":\"1a15dca5-7e33-45e1-b7c5-bc690e569531\",\"local_bgp_asn\":11,\"local_gateway_ip\":\"10.242.63.12\",\"local_tunnel_ip\":\"192.168.100.20\",\"mtu\":9000,\"name\":\"gre1\",\"remote_bgp_asn\":65010,\"remote_gateway_ip\":\"10.242.33.22\",\"remote_tunnel_ip\":\"192.168.129.1\",\"status\":\"attached\",\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}],\"updated_at\":\"2019-01-01T12:00:00.000Z\",\"zone\":{\"name\":\"us-south-1\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptions = new ListTransitGatewayConnectionsOptions.Builder()
      .transitGatewayId("testString")
      .limit(Long.valueOf("10"))
      .name("testString")
      .build();

    TransitGatewayConnectionsPager pager = new TransitGatewayConnectionsPager(transitGatewayApisService, listTransitGatewayConnectionsOptions);
    List<TransitGatewayConnectionCust> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createTransitGatewayConnection operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"networkAccountId\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"tunnels\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String createTransitGatewayConnectionPath = "/transit_gateways/testString/connections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

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

    // Construct an instance of the TransitGatewayRedundantGRETunnelTemplate model
    TransitGatewayRedundantGRETunnelTemplate transitGatewayRedundantGreTunnelTemplateModel = new TransitGatewayRedundantGRETunnelTemplate.Builder()
      .localGatewayIp("10.242.63.12")
      .localTunnelIp("192.168.100.20")
      .name("gre1")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.33.22")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
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
      .networkAccountId("testString")
      .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .prefixFilters(java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel))
      .prefixFiltersDefault("permit")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.63.12")
      .remoteTunnelIp("192.168.129.1")
      .tunnels(java.util.Arrays.asList(transitGatewayRedundantGreTunnelTemplateModel))
      .zone(zoneIdentityModel)
      .build();

    // Invoke createTransitGatewayConnection() with a valid options model and verify the result
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGatewayConnection operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayConnectionWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionWOptions();
  }

  // Test the createTransitGatewayConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGatewayConnection(null).execute();
  }

  // Test the deleteTransitGatewayConnection operation with a valid options model parameter
  @Test
  public void testDeleteTransitGatewayConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTransitGatewayConnectionOptions model
    DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptionsModel = new DeleteTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke deleteTransitGatewayConnection() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteTransitGatewayConnection operation with and without retries enabled
  @Test
  public void testDeleteTransitGatewayConnectionWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayConnectionWOptions();

    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayConnectionWOptions();
  }

  // Test the deleteTransitGatewayConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.deleteTransitGatewayConnection(null).execute();
  }

  // Test the getTransitGatewayConnection operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"networkAccountId\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"tunnels\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String getTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayConnectionOptions model
    GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptionsModel = new GetTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke getTransitGatewayConnection() with a valid options model and verify the result
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.getTransitGatewayConnection(getTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGatewayConnection operation with and without retries enabled
  @Test
  public void testGetTransitGatewayConnectionWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayConnectionWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayConnectionWOptions();
  }

  // Test the getTransitGatewayConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGatewayConnection(null).execute();
  }

  // Test the updateTransitGatewayConnection operation with a valid options model parameter
  @Test
  public void testUpdateTransitGatewayConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"networkAccountId\", \"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"prefix_filters_default\": \"permit\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"tunnels\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String updateTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTransitGatewayConnectionOptions model
    UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptionsModel = new UpdateTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .name("Transit_Service_BWTN_SJ_DL")
      .prefixFiltersDefault("permit")
      .build();

    // Invoke updateTransitGatewayConnection() with a valid options model and verify the result
    Response<TransitGatewayConnectionCust> response = transitGatewayApisService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
    assertNotNull(response);
    TransitGatewayConnectionCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateTransitGatewayConnection operation with and without retries enabled
  @Test
  public void testUpdateTransitGatewayConnectionWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayConnectionWOptions();

    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayConnectionWOptions();
  }

  // Test the updateTransitGatewayConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.updateTransitGatewayConnection(null).execute();
  }

  // Test the createTransitGatewayConnectionActions operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayConnectionActionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String createTransitGatewayConnectionActionsPath = "/transit_gateways/testString/connections/testString/actions";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateTransitGatewayConnectionActionsOptions model
    CreateTransitGatewayConnectionActionsOptions createTransitGatewayConnectionActionsOptionsModel = new CreateTransitGatewayConnectionActionsOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .action("approve")
      .build();

    // Invoke createTransitGatewayConnectionActions() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.createTransitGatewayConnectionActions(createTransitGatewayConnectionActionsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionActionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGatewayConnectionActions operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayConnectionActionsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionActionsWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionActionsWOptions();
  }

  // Test the createTransitGatewayConnectionActions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionActionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGatewayConnectionActions(null).execute();
  }

  // Test the getTransitGatewayGreTunnel operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayGreTunnelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"tunnels\": [{\"base_network_type\": \"classic\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"network_account_id\": \"networkAccountId\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}]}";
    String getTransitGatewayGreTunnelPath = "/transit_gateways/testString/connections/testString/tunnels";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayGreTunnelOptions model
    GetTransitGatewayGreTunnelOptions getTransitGatewayGreTunnelOptionsModel = new GetTransitGatewayGreTunnelOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke getTransitGatewayGreTunnel() with a valid options model and verify the result
    Response<RedundantGRETunnelCollection> response = transitGatewayApisService.getTransitGatewayGreTunnel(getTransitGatewayGreTunnelOptionsModel).execute();
    assertNotNull(response);
    RedundantGRETunnelCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayGreTunnelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGatewayGreTunnel operation with and without retries enabled
  @Test
  public void testGetTransitGatewayGreTunnelWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayGreTunnelWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayGreTunnelWOptions();
  }

  // Test the getTransitGatewayGreTunnel operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayGreTunnelNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGatewayGreTunnel(null).execute();
  }

  // Test the createTransitGatewayGreTunnel operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayGreTunnelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"network_account_id\": \"networkAccountId\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String createTransitGatewayGreTunnelPath = "/transit_gateways/testString/connections/testString/tunnels";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

    // Construct an instance of the CreateTransitGatewayGreTunnelOptions model
    CreateTransitGatewayGreTunnelOptions createTransitGatewayGreTunnelOptionsModel = new CreateTransitGatewayGreTunnelOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .localGatewayIp("10.242.63.12")
      .localTunnelIp("192.168.100.20")
      .name("gre1")
      .remoteGatewayIp("10.242.33.22")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
      .remoteBgpAsn(Long.valueOf("65010"))
      .build();

    // Invoke createTransitGatewayGreTunnel() with a valid options model and verify the result
    Response<RedundantGRETunnelReference> response = transitGatewayApisService.createTransitGatewayGreTunnel(createTransitGatewayGreTunnelOptionsModel).execute();
    assertNotNull(response);
    RedundantGRETunnelReference responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayGreTunnelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGatewayGreTunnel operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayGreTunnelWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayGreTunnelWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayGreTunnelWOptions();
  }

  // Test the createTransitGatewayGreTunnel operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayGreTunnelNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGatewayGreTunnel(null).execute();
  }

  // Test the deleteTransitGatewayConnectionTunnels operation with a valid options model parameter
  @Test
  public void testDeleteTransitGatewayConnectionTunnelsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTransitGatewayConnectionTunnelsPath = "/transit_gateways/testString/connections/testString/tunnels/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTransitGatewayConnectionTunnelsOptions model
    DeleteTransitGatewayConnectionTunnelsOptions deleteTransitGatewayConnectionTunnelsOptionsModel = new DeleteTransitGatewayConnectionTunnelsOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .greTunnelId("testString")
      .build();

    // Invoke deleteTransitGatewayConnectionTunnels() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayConnectionTunnels(deleteTransitGatewayConnectionTunnelsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayConnectionTunnelsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteTransitGatewayConnectionTunnels operation with and without retries enabled
  @Test
  public void testDeleteTransitGatewayConnectionTunnelsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayConnectionTunnelsWOptions();

    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayConnectionTunnelsWOptions();
  }

  // Test the deleteTransitGatewayConnectionTunnels operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayConnectionTunnelsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.deleteTransitGatewayConnectionTunnels(null).execute();
  }

  // Test the getTransitGatewayConnectionTunnels operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayConnectionTunnelsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"network_account_id\": \"networkAccountId\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String getTransitGatewayConnectionTunnelsPath = "/transit_gateways/testString/connections/testString/tunnels/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayConnectionTunnelsOptions model
    GetTransitGatewayConnectionTunnelsOptions getTransitGatewayConnectionTunnelsOptionsModel = new GetTransitGatewayConnectionTunnelsOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .greTunnelId("testString")
      .build();

    // Invoke getTransitGatewayConnectionTunnels() with a valid options model and verify the result
    Response<RedundantGRETunnelReference> response = transitGatewayApisService.getTransitGatewayConnectionTunnels(getTransitGatewayConnectionTunnelsOptionsModel).execute();
    assertNotNull(response);
    RedundantGRETunnelReference responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayConnectionTunnelsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGatewayConnectionTunnels operation with and without retries enabled
  @Test
  public void testGetTransitGatewayConnectionTunnelsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayConnectionTunnelsWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayConnectionTunnelsWOptions();
  }

  // Test the getTransitGatewayConnectionTunnels operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionTunnelsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGatewayConnectionTunnels(null).execute();
  }

  // Test the updateTransitGatewayConnectionTunnels operation with a valid options model parameter
  @Test
  public void testUpdateTransitGatewayConnectionTunnelsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"base_network_type\": \"classic\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 11, \"local_gateway_ip\": \"10.242.63.12\", \"local_tunnel_ip\": \"192.168.100.20\", \"mtu\": 9000, \"name\": \"gre1\", \"network_account_id\": \"networkAccountId\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.33.22\", \"remote_tunnel_ip\": \"192.168.129.1\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"zone\": {\"name\": \"us-south-1\"}}";
    String updateTransitGatewayConnectionTunnelsPath = "/transit_gateways/testString/connections/testString/tunnels/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTransitGatewayConnectionTunnelsOptions model
    UpdateTransitGatewayConnectionTunnelsOptions updateTransitGatewayConnectionTunnelsOptionsModel = new UpdateTransitGatewayConnectionTunnelsOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .greTunnelId("testString")
      .name("gre2")
      .build();

    // Invoke updateTransitGatewayConnectionTunnels() with a valid options model and verify the result
    Response<RedundantGRETunnelReference> response = transitGatewayApisService.updateTransitGatewayConnectionTunnels(updateTransitGatewayConnectionTunnelsOptionsModel).execute();
    assertNotNull(response);
    RedundantGRETunnelReference responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayConnectionTunnelsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateTransitGatewayConnectionTunnels operation with and without retries enabled
  @Test
  public void testUpdateTransitGatewayConnectionTunnelsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayConnectionTunnelsWOptions();

    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayConnectionTunnelsWOptions();
  }

  // Test the updateTransitGatewayConnectionTunnels operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionTunnelsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.updateTransitGatewayConnectionTunnels(null).execute();
  }

  // Test the listGatewayLocations operation with a valid options model parameter
  @Test
  public void testListGatewayLocationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\"}]}";
    String listGatewayLocationsPath = "/locations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayLocationsOptions model
    ListGatewayLocationsOptions listGatewayLocationsOptionsModel = new ListGatewayLocationsOptions();

    // Invoke listGatewayLocations() with a valid options model and verify the result
    Response<TSCollection> response = transitGatewayApisService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
    assertNotNull(response);
    TSCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayLocationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayLocations operation with and without retries enabled
  @Test
  public void testListGatewayLocationsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListGatewayLocationsWOptions();

    transitGatewayApisService.disableRetries();
    testListGatewayLocationsWOptions();
  }

  // Test the getGatewayLocation operation with a valid options model parameter
  @Test
  public void testGetGatewayLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\", \"local_connection_locations\": [{\"display_name\": \"Dallas\", \"name\": \"us-south\", \"supported_connection_types\": [\"supportedConnectionTypes\"], \"type\": \"region\"}], \"zones\": [{\"zones\": [{\"name\": \"us-south-1\"}]}]}";
    String getGatewayLocationPath = "/locations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayLocationOptions model
    GetGatewayLocationOptions getGatewayLocationOptionsModel = new GetGatewayLocationOptions.Builder()
      .name("testString")
      .build();

    // Invoke getGatewayLocation() with a valid options model and verify the result
    Response<TSLocation> response = transitGatewayApisService.getGatewayLocation(getGatewayLocationOptionsModel).execute();
    assertNotNull(response);
    TSLocation responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayLocationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayLocation operation with and without retries enabled
  @Test
  public void testGetGatewayLocationWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetGatewayLocationWOptions();

    transitGatewayApisService.disableRetries();
    testGetGatewayLocationWOptions();
  }

  // Test the getGatewayLocation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayLocationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getGatewayLocation(null).execute();
  }

  // Test the listTransitGatewayConnectionPrefixFilters operation with a valid options model parameter
  @Test
  public void testListTransitGatewayConnectionPrefixFiltersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewayConnectionPrefixFiltersPath = "/transit_gateways/testString/connections/testString/prefix_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTransitGatewayConnectionPrefixFiltersOptions model
    ListTransitGatewayConnectionPrefixFiltersOptions listTransitGatewayConnectionPrefixFiltersOptionsModel = new ListTransitGatewayConnectionPrefixFiltersOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke listTransitGatewayConnectionPrefixFilters() with a valid options model and verify the result
    Response<PrefixFilterCollection> response = transitGatewayApisService.listTransitGatewayConnectionPrefixFilters(listTransitGatewayConnectionPrefixFiltersOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayConnectionPrefixFiltersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listTransitGatewayConnectionPrefixFilters operation with and without retries enabled
  @Test
  public void testListTransitGatewayConnectionPrefixFiltersWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayConnectionPrefixFiltersWOptions();

    transitGatewayApisService.disableRetries();
    testListTransitGatewayConnectionPrefixFiltersWOptions();
  }

  // Test the listTransitGatewayConnectionPrefixFilters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayConnectionPrefixFiltersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.listTransitGatewayConnectionPrefixFilters(null).execute();
  }

  // Test the createTransitGatewayConnectionPrefixFilter operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

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

    // Invoke createTransitGatewayConnectionPrefixFilter() with a valid options model and verify the result
    Response<PrefixFilterCust> response = transitGatewayApisService.createTransitGatewayConnectionPrefixFilter(createTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayConnectionPrefixFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGatewayConnectionPrefixFilter operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayConnectionPrefixFilterWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayConnectionPrefixFilterWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayConnectionPrefixFilterWOptions();
  }

  // Test the createTransitGatewayConnectionPrefixFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGatewayConnectionPrefixFilter(null).execute();
  }

  // Test the replaceTransitGatewayConnectionPrefixFilter operation with a valid options model parameter
  @Test
  public void testReplaceTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"prefix_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

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
      .prefixFilters(java.util.Arrays.asList(prefixFilterPutModel))
      .build();

    // Invoke replaceTransitGatewayConnectionPrefixFilter() with a valid options model and verify the result
    Response<PrefixFilterCollection> response = transitGatewayApisService.replaceTransitGatewayConnectionPrefixFilter(replaceTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTransitGatewayConnectionPrefixFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the replaceTransitGatewayConnectionPrefixFilter operation with and without retries enabled
  @Test
  public void testReplaceTransitGatewayConnectionPrefixFilterWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testReplaceTransitGatewayConnectionPrefixFilterWOptions();

    transitGatewayApisService.disableRetries();
    testReplaceTransitGatewayConnectionPrefixFilterWOptions();
  }

  // Test the replaceTransitGatewayConnectionPrefixFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.replaceTransitGatewayConnectionPrefixFilter(null).execute();
  }

  // Test the deleteTransitGatewayConnectionPrefixFilter operation with a valid options model parameter
  @Test
  public void testDeleteTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTransitGatewayConnectionPrefixFilterOptions model
    DeleteTransitGatewayConnectionPrefixFilterOptions deleteTransitGatewayConnectionPrefixFilterOptionsModel = new DeleteTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .filterId("testString")
      .build();

    // Invoke deleteTransitGatewayConnectionPrefixFilter() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayConnectionPrefixFilter(deleteTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayConnectionPrefixFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteTransitGatewayConnectionPrefixFilter operation with and without retries enabled
  @Test
  public void testDeleteTransitGatewayConnectionPrefixFilterWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayConnectionPrefixFilterWOptions();

    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayConnectionPrefixFilterWOptions();
  }

  // Test the deleteTransitGatewayConnectionPrefixFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.deleteTransitGatewayConnectionPrefixFilter(null).execute();
  }

  // Test the getTransitGatewayConnectionPrefixFilter operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayConnectionPrefixFilterOptions model
    GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptionsModel = new GetTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .filterId("testString")
      .build();

    // Invoke getTransitGatewayConnectionPrefixFilter() with a valid options model and verify the result
    Response<PrefixFilterCust> response = transitGatewayApisService.getTransitGatewayConnectionPrefixFilter(getTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayConnectionPrefixFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGatewayConnectionPrefixFilter operation with and without retries enabled
  @Test
  public void testGetTransitGatewayConnectionPrefixFilterWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayConnectionPrefixFilterWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayConnectionPrefixFilterWOptions();
  }

  // Test the getTransitGatewayConnectionPrefixFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGatewayConnectionPrefixFilter(null).execute();
  }

  // Test the updateTransitGatewayConnectionPrefixFilter operation with a valid options model parameter
  @Test
  public void testUpdateTransitGatewayConnectionPrefixFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"ge\": 0, \"id\": \"1a15dcab-7e30-45e1-b7c5-bc690eaa9865\", \"le\": 32, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateTransitGatewayConnectionPrefixFilterPath = "/transit_gateways/testString/connections/testString/prefix_filters/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke updateTransitGatewayConnectionPrefixFilter() with a valid options model and verify the result
    Response<PrefixFilterCust> response = transitGatewayApisService.updateTransitGatewayConnectionPrefixFilter(updateTransitGatewayConnectionPrefixFilterOptionsModel).execute();
    assertNotNull(response);
    PrefixFilterCust responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTransitGatewayConnectionPrefixFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateTransitGatewayConnectionPrefixFilter operation with and without retries enabled
  @Test
  public void testUpdateTransitGatewayConnectionPrefixFilterWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testUpdateTransitGatewayConnectionPrefixFilterWOptions();

    transitGatewayApisService.disableRetries();
    testUpdateTransitGatewayConnectionPrefixFilterWOptions();
  }

  // Test the updateTransitGatewayConnectionPrefixFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionPrefixFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.updateTransitGatewayConnectionPrefixFilter(null).execute();
  }

  // Test the listTransitGatewayRouteReports operation with a valid options model parameter
  @Test
  public void testListTransitGatewayRouteReportsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"route_reports\": [{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTransitGatewayRouteReportsPath = "/transit_gateways/testString/route_reports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTransitGatewayRouteReportsOptions model
    ListTransitGatewayRouteReportsOptions listTransitGatewayRouteReportsOptionsModel = new ListTransitGatewayRouteReportsOptions.Builder()
      .transitGatewayId("testString")
      .build();

    // Invoke listTransitGatewayRouteReports() with a valid options model and verify the result
    Response<RouteReportCollection> response = transitGatewayApisService.listTransitGatewayRouteReports(listTransitGatewayRouteReportsOptionsModel).execute();
    assertNotNull(response);
    RouteReportCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewayRouteReportsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listTransitGatewayRouteReports operation with and without retries enabled
  @Test
  public void testListTransitGatewayRouteReportsWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testListTransitGatewayRouteReportsWOptions();

    transitGatewayApisService.disableRetries();
    testListTransitGatewayRouteReportsWOptions();
  }

  // Test the listTransitGatewayRouteReports operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTransitGatewayRouteReportsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.listTransitGatewayRouteReports(null).execute();
  }

  // Test the createTransitGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testCreateTransitGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateTransitGatewayRouteReportOptions model
    CreateTransitGatewayRouteReportOptions createTransitGatewayRouteReportOptionsModel = new CreateTransitGatewayRouteReportOptions.Builder()
      .transitGatewayId("testString")
      .build();

    // Invoke createTransitGatewayRouteReport() with a valid options model and verify the result
    Response<RouteReport> response = transitGatewayApisService.createTransitGatewayRouteReport(createTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTransitGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createTransitGatewayRouteReport operation with and without retries enabled
  @Test
  public void testCreateTransitGatewayRouteReportWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testCreateTransitGatewayRouteReportWOptions();

    transitGatewayApisService.disableRetries();
    testCreateTransitGatewayRouteReportWOptions();
  }

  // Test the createTransitGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.createTransitGatewayRouteReport(null).execute();
  }

  // Test the deleteTransitGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testDeleteTransitGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTransitGatewayRouteReportOptions model
    DeleteTransitGatewayRouteReportOptions deleteTransitGatewayRouteReportOptionsModel = new DeleteTransitGatewayRouteReportOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke deleteTransitGatewayRouteReport() with a valid options model and verify the result
    Response<Void> response = transitGatewayApisService.deleteTransitGatewayRouteReport(deleteTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTransitGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteTransitGatewayRouteReport operation with and without retries enabled
  @Test
  public void testDeleteTransitGatewayRouteReportWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testDeleteTransitGatewayRouteReportWOptions();

    transitGatewayApisService.disableRetries();
    testDeleteTransitGatewayRouteReportWOptions();
  }

  // Test the deleteTransitGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTransitGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.deleteTransitGatewayRouteReport(null).execute();
  }

  // Test the getTransitGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testGetTransitGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connections\": [{\"bgps\": [{\"as_path\": \"(65201 4201065544) 4203065544\", \"is_used\": true, \"local_preference\": \"190\", \"prefix\": \"172.17.0.0/16\"}], \"id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"name\": \"transit-connection-vpc1\", \"routes\": [{\"prefix\": \"192.168.0.0/16\"}], \"type\": \"vpc\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"overlapping_routes\": [{\"routes\": [{\"connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\", \"prefix\": \"prefix\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTransitGatewayRouteReportPath = "/transit_gateways/testString/route_reports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTransitGatewayRouteReportOptions model
    GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptionsModel = new GetTransitGatewayRouteReportOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .build();

    // Invoke getTransitGatewayRouteReport() with a valid options model and verify the result
    Response<RouteReport> response = transitGatewayApisService.getTransitGatewayRouteReport(getTransitGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTransitGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getTransitGatewayRouteReport operation with and without retries enabled
  @Test
  public void testGetTransitGatewayRouteReportWRetries() throws Throwable {
    transitGatewayApisService.enableRetries(4, 30);
    testGetTransitGatewayRouteReportWOptions();

    transitGatewayApisService.disableRetries();
    testGetTransitGatewayRouteReportWOptions();
  }

  // Test the getTransitGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    transitGatewayApisService.getTransitGatewayRouteReport(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    transitGatewayApisService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    transitGatewayApisService = TransitGatewayApis.newInstance(version, serviceName);
    String url = server.url("/").toString();
    transitGatewayApisService.setServiceUrl(url);
  }
}