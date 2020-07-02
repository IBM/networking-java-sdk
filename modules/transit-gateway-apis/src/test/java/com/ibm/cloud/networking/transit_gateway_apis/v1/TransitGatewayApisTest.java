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
package com.ibm.cloud.networking.transit_gateway_apis.v1;

import com.ibm.cloud.networking.transit_gateway_apis.v1.TransitGatewayApis;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DetailGatewayLocationOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DetailTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DetailTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListGatewayLocationsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewaysOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocalLocation;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocation;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocationBasic;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGateway;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import com.ibm.cloud.sdk.core.util.EnvironmentUtils;

import java.io.IOException;
import java.io.InputStream;

import java.util.Date;
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
  protected TransitGatewayApis testService;

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
    Date version = TestUtilities.createMockDate("2019-01-01");

    testService = TransitGatewayApis.newInstance(version, serviceName);
    String url = server.url("/").toString();
    testService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    Date version = TestUtilities.createMockDate("2019-01-01");

    new TransitGatewayApis(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(testService.getVersion(), TestUtilities.createMockDate("2019-01-01"));
  }

  @Test
  public void testListTransitGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"transit_gateways\": [{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"global\": true, \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"56969d60-43e9-465c-883c-b9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d60-43e9-465c-883c-b9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}]}";
    String listTransitGatewaysPath = "/transit_gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTransitGatewaysOptions model
    ListTransitGatewaysOptions listTransitGatewaysOptionsModel = new ListTransitGatewaysOptions();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayCollection> response = testService.listTransitGateways(listTransitGatewaysOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTransitGatewaysPath);
  }

  @Test
  public void testCreateTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"global\": true, \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"56969d60-43e9-465c-883c-b9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d60-43e9-465c-883c-b9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String createTransitGatewayPath = "/transit_gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d60-43e9-465c-883c-b9f7363e78e8")
    .build();

    // Construct an instance of the CreateTransitGatewayOptions model
    CreateTransitGatewayOptions createTransitGatewayOptionsModel = new CreateTransitGatewayOptions.Builder()
    .location("us-south")
    .name("Transit_Service_BWTN_SJ_DL")
    .global(true)
    .resourceGroup(resourceGroupIdentityModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGateway> response = testService.createTransitGateway(createTransitGatewayOptionsModel).execute();
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
    testService.createTransitGateway(null).execute();
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
    Response<Void> response = testService.deleteTransitGateway(deleteTransitGatewayOptionsModel).execute();
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
    testService.deleteTransitGateway(null).execute();
  }

  @Test
  public void testDetailTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"global\": true, \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"56969d60-43e9-465c-883c-b9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d60-43e9-465c-883c-b9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String detailTransitGatewayPath = "/transit_gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DetailTransitGatewayOptions model
    DetailTransitGatewayOptions detailTransitGatewayOptionsModel = new DetailTransitGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGateway> response = testService.detailTransitGateway(detailTransitGatewayOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, detailTransitGatewayPath);
  }

  // Test the detailTransitGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDetailTransitGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.detailTransitGateway(null).execute();
  }

  @Test
  public void testUpdateTransitGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"crn\": \"crn:v1:bluemix:public:transit:dal03:a/57a7d05f36894e3cb9b46a43556d903e::gateway:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"my-transit-gateway-in-TransitGateway\", \"global\": true, \"location\": \"us-south\", \"created_at\": \"2019-01-01T12:00:00\", \"resource_group\": {\"id\": \"56969d60-43e9-465c-883c-b9f7363e78e8\", \"href\": \"https://resource-manager.bluemix.net/v1/resource_groups/56969d60-43e9-465c-883c-b9f7363e78e8\"}, \"status\": \"available\", \"updated_at\": \"2019-01-01T12:00:00\"}";
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
    Response<TransitGateway> response = testService.updateTransitGateway(updateTransitGatewayOptionsModel).execute();
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
    testService.updateTransitGateway(null).execute();
  }

  @Test
  public void testListTransitGatewayConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"connections\": [{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531-connection_id\", \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\"}]}";
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
    Response<TransitGatewayConnectionCollection> response = testService.listTransitGatewayConnections(listTransitGatewayConnectionsOptionsModel).execute();
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
    testService.listTransitGatewayConnections(null).execute();
  }

  @Test
  public void testCreateTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531-connection_id\", \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String createTransitGatewayConnectionPath = "/transit_gateways/testString/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateTransitGatewayConnectionOptions model
    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .networkType("vpc")
    .name("Transit_Service_BWTN_SJ_DL")
    .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCust> response = testService.createTransitGatewayConnection(createTransitGatewayConnectionOptionsModel).execute();
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
    testService.createTransitGatewayConnection(null).execute();
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
    Response<Void> response = testService.deleteTransitGatewayConnection(deleteTransitGatewayConnectionOptionsModel).execute();
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
    testService.deleteTransitGatewayConnection(null).execute();
  }

  @Test
  public void testDetailTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531-connection_id\", \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String detailTransitGatewayConnectionPath = "/transit_gateways/testString/connections/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DetailTransitGatewayConnectionOptions model
    DetailTransitGatewayConnectionOptions detailTransitGatewayConnectionOptionsModel = new DetailTransitGatewayConnectionOptions.Builder()
    .transitGatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TransitGatewayConnectionCust> response = testService.detailTransitGatewayConnection(detailTransitGatewayConnectionOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, detailTransitGatewayConnectionPath);
  }

  // Test the detailTransitGatewayConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDetailTransitGatewayConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.detailTransitGatewayConnection(null).execute();
  }

  @Test
  public void testUpdateTransitGatewayConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Transit_Service_BWTN_SJ_DL\", \"network_id\": \"crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b\", \"network_type\": \"vpc\", \"id\": \"1a15dca5-7e33-45e1-b7c5-bc690e569531-connection_id\", \"created_at\": \"2019-01-01T12:00:00\", \"status\": \"attached\", \"updated_at\": \"2019-01-01T12:00:00\"}";
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
    Response<TransitGatewayConnectionCust> response = testService.updateTransitGatewayConnection(updateTransitGatewayConnectionOptionsModel).execute();
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
    testService.updateTransitGatewayConnection(null).execute();
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
    Response<TSCollection> response = testService.listGatewayLocations(listGatewayLocationsOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayLocationsPath);
  }

  @Test
  public void testDetailGatewayLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"billing_location\": \"us\", \"name\": \"us-south\", \"type\": \"region\", \"local_connection_locations\": [{\"display_name\": \"Dallas\", \"name\": \"us-south\", \"type\": \"region\"}]}";
    String detailGatewayLocationPath = "/locations/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DetailGatewayLocationOptions model
    DetailGatewayLocationOptions detailGatewayLocationOptionsModel = new DetailGatewayLocationOptions.Builder()
    .name("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TSLocation> response = testService.detailGatewayLocation(detailGatewayLocationOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, detailGatewayLocationPath);
  }

  // Test the detailGatewayLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDetailGatewayLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.detailGatewayLocation(null).execute();
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
    testService = null;
  }
}