/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetGatewayLocationOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListGatewayLocationsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewaysOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupReference;
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
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
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
 * Unit test class for the TransitGatewayApis service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore("javax.net.ssl.*")
public class TransitGatewayApisTest extends PowerMockTestCase {

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
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
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
  public void testListConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"name\": \"Transit_Service_SJ_DL\", \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"transit_gateway\": {\"crn\": \"crn:v1:bluemix:public:transit:us-south:a/123456::gateway:456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"id\": \"456f58c1-afe7-123a-0a0a-7f3d720f1a44\", \"name\": \"my-transit-gw100\"}, \"updated_at\": \"2019-01-01T12:00:00\", \"zone\": {\"name\": \"us-south-1\"}}], \"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/connections?start=MjAyMC0wNS0wOVQxNjoyMDoyMC4yMjQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOVQxNjoyMDoyMC4yMjQ5NzNa\"}}";
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

  @Test
  public void testListTransitGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?limit=50\"}, \"limit\": 50, \"next\": {\"href\": \"https://transit.cloud.ibm.com/v1/transit_gateways?start=MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa&limit=50\", \"start\": \"MjAyMC0wNS0wOFQxNDoxNzowMy45NzQ5NzNa\"}, \"transit_gateways\": [{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}]}";
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

  @Test
  public void testCreateTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
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
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
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
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"global\": true, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d6043e9465c883cb9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
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
  public void testListTransitGatewayConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\", \"zone\": {\"name\": \"us-south-1\"}}]}";
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
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\", \"zone\": {\"name\": \"us-south-1\"}}";
    String createTransitGatewayConnectionPath = "/transit_gateways/testString/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ZoneIdentityByName model
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
    .name("us-south-1")
    .build();

    // Construct an instance of the CreateTransitGatewayConnectionOptions model
    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .networkType("vpc")
    .baseConnectionId("975f58c1-afe7-469a-9727-7f3d720f2d32")
    .localGatewayIp("192.168.100.1")
    .localTunnelIp("192.168.129.2")
    .name("Transit_Service_BWTN_SJ_DL")
    .networkAccountId("28e4d90ac7504be694471ee66e70d0d5")
    .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .remoteBgpAsn("65010")
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
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\", \"zone\": {\"name\": \"us-south-1\"}}";
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
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531\", \"base_connection_id\": \"975f58c1-afe7-469a-9727-7f3d720f2d32\", \"created_at\": \"2019-01-01T12:00:00\", \"local_bgp_asn\": 64490, \"local_gateway_ip\": \"192.168.100.1\", \"local_tunnel_ip\": \"192.168.129.2\", \"mtu\": 9000, \"network_account_id\": \"28e4d90ac7504be694471ee66e70d0d5\", \"remote_bgp_asn\": 65010, \"remote_gateway_ip\": \"10.242.63.12\", \"remote_tunnel_ip\": \"192.168.129.1\", \"request_status\": \"pending\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\", \"zone\": {\"name\": \"us-south-1\"}}";
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

  @Test
  public void testGetGatewayLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\", \"local_connection_locations\": [{\"display_name\": \"Dallas\", \"name\": \"us-south\", \"type\": \"region\"}]}";
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

  // Test the getGatewayLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    transitGatewayApisService.getGatewayLocation(null).execute();
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