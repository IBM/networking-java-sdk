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
package com.ibm.cloud.networking.direct_link_provider.v2;

import com.ibm.cloud.networking.direct_link_provider.v2.DirectLinkProvider;
import com.ibm.cloud.networking.direct_link_provider.v2.model.CreateProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.DeleteProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.GetProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.GetProviderPortOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ListProviderGatewaysOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ListProviderPortsOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGateway;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayChangeRequest;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayChangeRequestProviderGatewayCreate;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayChangeRequestProviderGatewayDelete;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayChangeRequestProviderGatewayUpdateAttributes;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayCollection;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayCollectionFirst;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayCollectionNext;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayPortIdentity;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayPortReference;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayUpdateAttributesUpdatesItem;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayUpdateAttributesUpdatesItemProviderGatewayBGPASNUpdate;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayUpdateAttributesUpdatesItemProviderGatewayBGPIPUpdate;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayUpdateAttributesUpdatesItemProviderGatewaySpeedUpdate;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayUpdateAttributesUpdatesItemProviderGatewayVLAN;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewaysPager;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPort;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollection;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollectionFirst;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollectionNext;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortsPager;
import com.ibm.cloud.networking.direct_link_provider.v2.model.UpdateProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.utils.TestUtilities;
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
 * Unit test class for the DirectLinkProvider service.
 */
public class DirectLinkProviderTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DirectLinkProvider directLinkProviderService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String version = "testString";
    new DirectLinkProvider(version, serviceName, null);
  }


  // Test the getter for the version global parameter
  @Test
  public void testGetVersion() throws Throwable {
    assertEquals(directLinkProviderService.getVersion(), "testString");
  }

  // Test the listProviderGateways operation with a valid options model parameter
  @Test
  public void testListProviderGatewaysWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/gateways?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/gateways?start=8c4a91a3e2cbd233b5a5b33436855fc2&limit=100\", \"start\": \"8c4a91a3e2cbd233b5a5b33436855fc2\"}, \"total_count\": 132, \"gateways\": [{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}]}";
    String listProviderGatewaysPath = "/gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListProviderGatewaysOptions model
    ListProviderGatewaysOptions listProviderGatewaysOptionsModel = new ListProviderGatewaysOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("10"))
      .build();

    // Invoke listProviderGateways() with a valid options model and verify the result
    Response<ProviderGatewayCollection> response = directLinkProviderService.listProviderGateways(listProviderGatewaysOptionsModel).execute();
    assertNotNull(response);
    ProviderGatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProviderGatewaysPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the listProviderGateways operation with and without retries enabled
  @Test
  public void testListProviderGatewaysWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testListProviderGatewaysWOptions();

    directLinkProviderService.disableRetries();
    testListProviderGatewaysWOptions();
  }

  // Test the listProviderGateways operation using the ProviderGatewaysPager.getNext() method
  @Test
  public void testListProviderGatewaysWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"gateways\":[{\"bgp_asn\":64999,\"bgp_cer_cidr\":\"10.254.30.78/30\",\"bgp_ibm_asn\":13884,\"bgp_ibm_cidr\":\"10.254.30.77/30\",\"bgp_status\":\"active\",\"change_request\":{\"type\":\"create_gateway\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"crn\":\"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"customer_account_id\":\"4111d05f36894e3cb9b46a43556d9000\",\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"myGateway\",\"operational_status\":\"configuring\",\"port\":{\"id\":\"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"},\"provider_api_managed\":true,\"speed_mbps\":1000,\"type\":\"connect\",\"vlan\":10}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"gateways\":[{\"bgp_asn\":64999,\"bgp_cer_cidr\":\"10.254.30.78/30\",\"bgp_ibm_asn\":13884,\"bgp_ibm_cidr\":\"10.254.30.77/30\",\"bgp_status\":\"active\",\"change_request\":{\"type\":\"create_gateway\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"crn\":\"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"customer_account_id\":\"4111d05f36894e3cb9b46a43556d9000\",\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"myGateway\",\"operational_status\":\"configuring\",\"port\":{\"id\":\"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"},\"provider_api_managed\":true,\"speed_mbps\":1000,\"type\":\"connect\",\"vlan\":10}],\"total_count\":2,\"limit\":1}";
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

    ListProviderGatewaysOptions listProviderGatewaysOptions = new ListProviderGatewaysOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<ProviderGateway> allResults = new ArrayList<>();
    ProviderGatewaysPager pager = new ProviderGatewaysPager(directLinkProviderService, listProviderGatewaysOptions);
    while (pager.hasNext()) {
      List<ProviderGateway> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listProviderGateways operation using the ProviderGatewaysPager.getAll() method
  @Test
  public void testListProviderGatewaysWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"gateways\":[{\"bgp_asn\":64999,\"bgp_cer_cidr\":\"10.254.30.78/30\",\"bgp_ibm_asn\":13884,\"bgp_ibm_cidr\":\"10.254.30.77/30\",\"bgp_status\":\"active\",\"change_request\":{\"type\":\"create_gateway\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"crn\":\"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"customer_account_id\":\"4111d05f36894e3cb9b46a43556d9000\",\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"myGateway\",\"operational_status\":\"configuring\",\"port\":{\"id\":\"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"},\"provider_api_managed\":true,\"speed_mbps\":1000,\"type\":\"connect\",\"vlan\":10}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"gateways\":[{\"bgp_asn\":64999,\"bgp_cer_cidr\":\"10.254.30.78/30\",\"bgp_ibm_asn\":13884,\"bgp_ibm_cidr\":\"10.254.30.77/30\",\"bgp_status\":\"active\",\"change_request\":{\"type\":\"create_gateway\"},\"created_at\":\"2019-01-01T12:00:00.000Z\",\"crn\":\"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"customer_account_id\":\"4111d05f36894e3cb9b46a43556d9000\",\"id\":\"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\",\"name\":\"myGateway\",\"operational_status\":\"configuring\",\"port\":{\"id\":\"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"},\"provider_api_managed\":true,\"speed_mbps\":1000,\"type\":\"connect\",\"vlan\":10}],\"total_count\":2,\"limit\":1}";
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

    ListProviderGatewaysOptions listProviderGatewaysOptions = new ListProviderGatewaysOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    ProviderGatewaysPager pager = new ProviderGatewaysPager(directLinkProviderService, listProviderGatewaysOptions);
    List<ProviderGateway> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createProviderGateway operation with a valid options model parameter
  @Test
  public void testCreateProviderGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String createProviderGatewayPath = "/gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ProviderGatewayPortIdentity model
    ProviderGatewayPortIdentity providerGatewayPortIdentityModel = new ProviderGatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();

    // Construct an instance of the CreateProviderGatewayOptions model
    CreateProviderGatewayOptions createProviderGatewayOptionsModel = new CreateProviderGatewayOptions.Builder()
      .bgpAsn(Long.valueOf("64999"))
      .customerAccountId("4111d05f36894e3cb9b46a43556d9000")
      .name("myGateway")
      .port(providerGatewayPortIdentityModel)
      .speedMbps(Long.valueOf("1000"))
      .bgpCerCidr("10.254.30.78/30")
      .bgpIbmCidr("10.254.30.77/30")
      .vlan(Long.valueOf("10"))
      .checkOnly("testString")
      .build();

    // Invoke createProviderGateway() with a valid options model and verify the result
    Response<ProviderGateway> response = directLinkProviderService.createProviderGateway(createProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createProviderGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("check_only"), "testString");
  }

  // Test the createProviderGateway operation with and without retries enabled
  @Test
  public void testCreateProviderGatewayWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testCreateProviderGatewayWOptions();

    directLinkProviderService.disableRetries();
    testCreateProviderGatewayWOptions();
  }

  // Test the createProviderGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateProviderGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkProviderService.createProviderGateway(null).execute();
  }

  // Test the deleteProviderGateway operation with a valid options model parameter
  @Test
  public void testDeleteProviderGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String deleteProviderGatewayPath = "/gateways/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteProviderGatewayOptions model
    DeleteProviderGatewayOptions deleteProviderGatewayOptionsModel = new DeleteProviderGatewayOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteProviderGateway() with a valid options model and verify the result
    Response<ProviderGateway> response = directLinkProviderService.deleteProviderGateway(deleteProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteProviderGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteProviderGateway operation with and without retries enabled
  @Test
  public void testDeleteProviderGatewayWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testDeleteProviderGatewayWOptions();

    directLinkProviderService.disableRetries();
    testDeleteProviderGatewayWOptions();
  }

  // Test the deleteProviderGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteProviderGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkProviderService.deleteProviderGateway(null).execute();
  }

  // Test the getProviderGateway operation with a valid options model parameter
  @Test
  public void testGetProviderGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String getProviderGatewayPath = "/gateways/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProviderGatewayOptions model
    GetProviderGatewayOptions getProviderGatewayOptionsModel = new GetProviderGatewayOptions.Builder()
      .id("testString")
      .build();

    // Invoke getProviderGateway() with a valid options model and verify the result
    Response<ProviderGateway> response = directLinkProviderService.getProviderGateway(getProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProviderGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getProviderGateway operation with and without retries enabled
  @Test
  public void testGetProviderGatewayWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testGetProviderGatewayWOptions();

    directLinkProviderService.disableRetries();
    testGetProviderGatewayWOptions();
  }

  // Test the getProviderGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProviderGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkProviderService.getProviderGateway(null).execute();
  }

  // Test the updateProviderGateway operation with a valid options model parameter
  @Test
  public void testUpdateProviderGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String updateProviderGatewayPath = "/gateways/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateProviderGatewayOptions model
    UpdateProviderGatewayOptions updateProviderGatewayOptionsModel = new UpdateProviderGatewayOptions.Builder()
      .id("testString")
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .name("myNewGateway")
      .speedMbps(Long.valueOf("1000"))
      .vlan(Long.valueOf("10"))
      .build();

    // Invoke updateProviderGateway() with a valid options model and verify the result
    Response<ProviderGateway> response = directLinkProviderService.updateProviderGateway(updateProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateProviderGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateProviderGateway operation with and without retries enabled
  @Test
  public void testUpdateProviderGatewayWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testUpdateProviderGatewayWOptions();

    directLinkProviderService.disableRetries();
    testUpdateProviderGatewayWOptions();
  }

  // Test the updateProviderGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateProviderGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkProviderService.updateProviderGateway(null).execute();
  }

  // Test the listProviderPorts operation with a valid options model parameter
  @Test
  public void testListProviderPortsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/ports?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/ports?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=100\", \"start\": \"9d5a91a3e2cbd233b5a5b33436855ed1\"}, \"total_count\": 132, \"ports\": [{\"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}]}";
    String listProviderPortsPath = "/ports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListProviderPortsOptions model
    ListProviderPortsOptions listProviderPortsOptionsModel = new ListProviderPortsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("10"))
      .build();

    // Invoke listProviderPorts() with a valid options model and verify the result
    Response<ProviderPortCollection> response = directLinkProviderService.listProviderPorts(listProviderPortsOptionsModel).execute();
    assertNotNull(response);
    ProviderPortCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProviderPortsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the listProviderPorts operation with and without retries enabled
  @Test
  public void testListProviderPortsWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testListProviderPortsWOptions();

    directLinkProviderService.disableRetries();
    testListProviderPortsWOptions();
  }

  // Test the listProviderPorts operation using the ProviderPortsPager.getNext() method
  @Test
  public void testListProviderPortsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"ports\":[{\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"ports\":[{\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
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

    ListProviderPortsOptions listProviderPortsOptions = new ListProviderPortsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<ProviderPort> allResults = new ArrayList<>();
    ProviderPortsPager pager = new ProviderPortsPager(directLinkProviderService, listProviderPortsOptions);
    while (pager.hasNext()) {
      List<ProviderPort> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listProviderPorts operation using the ProviderPortsPager.getAll() method
  @Test
  public void testListProviderPortsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"ports\":[{\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"ports\":[{\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
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

    ListProviderPortsOptions listProviderPortsOptions = new ListProviderPortsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    ProviderPortsPager pager = new ProviderPortsPager(directLinkProviderService, listProviderPortsOptions);
    List<ProviderPort> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getProviderPort operation with a valid options model parameter
  @Test
  public void testGetProviderPortWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}";
    String getProviderPortPath = "/ports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProviderPortOptions model
    GetProviderPortOptions getProviderPortOptionsModel = new GetProviderPortOptions.Builder()
      .id("testString")
      .build();

    // Invoke getProviderPort() with a valid options model and verify the result
    Response<ProviderPort> response = directLinkProviderService.getProviderPort(getProviderPortOptionsModel).execute();
    assertNotNull(response);
    ProviderPort responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProviderPortPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getProviderPort operation with and without retries enabled
  @Test
  public void testGetProviderPortWRetries() throws Throwable {
    directLinkProviderService.enableRetries(4, 30);
    testGetProviderPortWOptions();

    directLinkProviderService.disableRetries();
    testGetProviderPortWOptions();
  }

  // Test the getProviderPort operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProviderPortNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkProviderService.getProviderPort(null).execute();
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
    directLinkProviderService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    directLinkProviderService = DirectLinkProvider.newInstance(version, serviceName);
    String url = server.url("/").toString();
    directLinkProviderService.setServiceUrl(url);
  }
}