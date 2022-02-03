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
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPort;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollection;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollectionFirst;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderPortCollectionNext;
import com.ibm.cloud.networking.direct_link_provider.v2.model.UpdateProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.utils.TestUtilities;
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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DirectLinkProvider service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class DirectLinkProviderTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DirectLinkProvider directLinkProviderService;

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

    directLinkProviderService = DirectLinkProvider.newInstance(version, serviceName);
    String url = server.url("/").toString();
    directLinkProviderService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    new DirectLinkProvider(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(directLinkProviderService.getVersion(), "testString");
  }

  @Test
  public void testListProviderGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/gateways?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/gateways?start=8c4a91a3e2cbd233b5a5b33436855fc2&limit=100\", \"start\": \"8c4a91a3e2cbd233b5a5b33436855fc2\"}, \"total_count\": 132, \"gateways\": [{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}]}";
    String listProviderGatewaysPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListProviderGatewaysOptions model
    ListProviderGatewaysOptions listProviderGatewaysOptionsModel = new ListProviderGatewaysOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProviderGatewayCollection> response = directLinkProviderService.listProviderGateways(listProviderGatewaysOptionsModel).execute();
    assertNotNull(response);
    ProviderGatewayCollection responseObj = response.getResult();
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
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProviderGatewaysPath);
  }
  
  public void testListProviderGatewaysWOptionsWRetries() throws Throwable {
    // Enable retries and run testListProviderGatewaysWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testListProviderGatewaysWOptions();

    // Disable retries and run testListProviderGatewaysWOptions.
    directLinkProviderService.disableRetries();
    testListProviderGatewaysWOptions();
  }  

  @Test
  public void testCreateProviderGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String createProviderGatewayPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

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

    // Invoke operation with valid options model (positive test)
    Response<ProviderGateway> response = directLinkProviderService.createProviderGateway(createProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
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
    assertEquals(query.get("check_only"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createProviderGatewayPath);
  }
  
  public void testCreateProviderGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateProviderGatewayWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testCreateProviderGatewayWOptions();

    // Disable retries and run testCreateProviderGatewayWOptions.
    directLinkProviderService.disableRetries();
    testCreateProviderGatewayWOptions();
  }  

  // Test the createProviderGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateProviderGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkProviderService.createProviderGateway(null).execute();
  }

  @Test
  public void testDeleteProviderGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String deleteProviderGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteProviderGatewayOptions model
    DeleteProviderGatewayOptions deleteProviderGatewayOptionsModel = new DeleteProviderGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProviderGateway> response = directLinkProviderService.deleteProviderGateway(deleteProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
    assertNotNull(responseObj);

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
    assertEquals(parsedPath, deleteProviderGatewayPath);
  }
  
  public void testDeleteProviderGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteProviderGatewayWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testDeleteProviderGatewayWOptions();

    // Disable retries and run testDeleteProviderGatewayWOptions.
    directLinkProviderService.disableRetries();
    testDeleteProviderGatewayWOptions();
  }  

  // Test the deleteProviderGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteProviderGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkProviderService.deleteProviderGateway(null).execute();
  }

  @Test
  public void testGetProviderGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String getProviderGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetProviderGatewayOptions model
    GetProviderGatewayOptions getProviderGatewayOptionsModel = new GetProviderGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProviderGateway> response = directLinkProviderService.getProviderGateway(getProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
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
    assertEquals(parsedPath, getProviderGatewayPath);
  }
  
  public void testGetProviderGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetProviderGatewayWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testGetProviderGatewayWOptions();

    // Disable retries and run testGetProviderGatewayWOptions.
    directLinkProviderService.disableRetries();
    testGetProviderGatewayWOptions();
  }  

  // Test the getProviderGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProviderGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkProviderService.getProviderGateway(null).execute();
  }

  @Test
  public void testUpdateProviderGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::connect:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"customer_account_id\": \"4111d05f36894e3cb9b46a43556d9000\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"myGateway\", \"operational_status\": \"configuring\", \"port\": {\"id\": \"fffdcb1a-fee4-41c7-9e11-9cd99e65c777\"}, \"provider_api_managed\": true, \"speed_mbps\": 1000, \"type\": \"connect\", \"vlan\": 10}";
    String updateProviderGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

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

    // Invoke operation with valid options model (positive test)
    Response<ProviderGateway> response = directLinkProviderService.updateProviderGateway(updateProviderGatewayOptionsModel).execute();
    assertNotNull(response);
    ProviderGateway responseObj = response.getResult();
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
    assertEquals(parsedPath, updateProviderGatewayPath);
  }
  
  public void testUpdateProviderGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateProviderGatewayWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testUpdateProviderGatewayWOptions();

    // Disable retries and run testUpdateProviderGatewayWOptions.
    directLinkProviderService.disableRetries();
    testUpdateProviderGatewayWOptions();
  }  

  // Test the updateProviderGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateProviderGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkProviderService.updateProviderGateway(null).execute();
  }

  @Test
  public void testListProviderPortsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/ports?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/provider/v2/ports?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=100\", \"start\": \"9d5a91a3e2cbd233b5a5b33436855ed1\"}, \"total_count\": 132, \"ports\": [{\"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}]}";
    String listProviderPortsPath = "/ports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListProviderPortsOptions model
    ListProviderPortsOptions listProviderPortsOptionsModel = new ListProviderPortsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProviderPortCollection> response = directLinkProviderService.listProviderPorts(listProviderPortsOptionsModel).execute();
    assertNotNull(response);
    ProviderPortCollection responseObj = response.getResult();
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
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProviderPortsPath);
  }
  
  public void testListProviderPortsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListProviderPortsWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testListProviderPortsWOptions();

    // Disable retries and run testListProviderPortsWOptions.
    directLinkProviderService.disableRetries();
    testListProviderPortsWOptions();
  }  

  @Test
  public void testGetProviderPortWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}";
    String getProviderPortPath = "/ports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetProviderPortOptions model
    GetProviderPortOptions getProviderPortOptionsModel = new GetProviderPortOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProviderPort> response = directLinkProviderService.getProviderPort(getProviderPortOptionsModel).execute();
    assertNotNull(response);
    ProviderPort responseObj = response.getResult();
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
    assertEquals(parsedPath, getProviderPortPath);
  }
  
  public void testGetProviderPortWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetProviderPortWOptions.
    directLinkProviderService.enableRetries(4, 30);
    testGetProviderPortWOptions();

    // Disable retries and run testGetProviderPortWOptions.
    directLinkProviderService.disableRetries();
    testGetProviderPortWOptions();
  }  

  // Test the getProviderPort operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProviderPortNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkProviderService.getProviderPort(null).execute();
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
    directLinkProviderService = null;
  }
}