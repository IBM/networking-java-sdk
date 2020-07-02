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
package com.ibm.cloud.networking.direct_link_apis.v1;

import com.ibm.cloud.networking.direct_link_apis.v1.DirectLinkApis;
import com.ibm.cloud.networking.direct_link_apis.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.CreateGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.CrossConnectRouter;
import com.ibm.cloud.networking.direct_link_apis.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.DeleteGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayActionTemplateUpdatesItem;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequest;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestGatewayClientGatewayCreate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestGatewayClientGatewayDelete;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributes;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItem;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestUpdatesItem;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayChangeRequestUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayPort;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayTemplate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayVirtualConnection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayVirtualConnectionCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GetGatewayOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GetGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GetPortOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListGatewayLetterOfAuthorizationOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListGatewayVirtualConnectionsOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListGatewaysOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListOfferingTypeLocationCrossConnectRoutersOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListOfferingTypeLocationsOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListOfferingTypeSpeedsOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ListPortsOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.LocationCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.LocationCrossConnectRouterCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.LocationOutput;
import com.ibm.cloud.networking.direct_link_apis.v1.model.OfferingSpeed;
import com.ibm.cloud.networking.direct_link_apis.v1.model.OfferingSpeedCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.Port;
import com.ibm.cloud.networking.direct_link_apis.v1.model.PortCollection;
import com.ibm.cloud.networking.direct_link_apis.v1.model.PortsPaginatedCollectionFirst;
import com.ibm.cloud.networking.direct_link_apis.v1.model.PortsPaginatedCollectionNext;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.direct_link_apis.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;

import com.ibm.cloud.sdk.core.util.EnvironmentUtils;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
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
 * Unit test class for the DirectLinkApis service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore("javax.net.ssl.*")
public class DirectLinkApisTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DirectLinkApis testService;

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

    testService = DirectLinkApis.newInstance(version, serviceName);
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

    new DirectLinkApis(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(testService.getVersion(), TestUtilities.createMockDate("2019-01-01"));
  }

  @Test
  public void testListGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"gateways\": [{\"bgp_asn\": 64999, \"bgp_base_cidr\": \"10.254.30.76/30\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"created_at\": \"2019-01-01T12:00:00\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/57a7d05f36894e3cb9b46a43556d903e::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"dedicated_hosting_id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}]}";
    String listGatewaysPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewaysOptions model
    ListGatewaysOptions listGatewaysOptionsModel = new ListGatewaysOptions();

    // Invoke operation with valid options model (positive test)
    Response<GatewayCollection> response = testService.listGateways(listGatewaysOptionsModel).execute();
    assertNotNull(response);
    GatewayCollection responseObj = response.getResult();
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
    assertEquals(parsedPath, listGatewaysPath);
  }

  @Test
  public void testCreateGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_base_cidr\": \"10.254.30.76/30\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"created_at\": \"2019-01-01T12:00:00\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/57a7d05f36894e3cb9b46a43556d903e::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"dedicated_hosting_id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d6043e9465c883cb9f7363e78e8")
    .build();

    // Construct an instance of the GatewayTemplateGatewayTypeDedicatedTemplate model
    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
    .bgpAsn(Long.valueOf("64999"))
    .bgpBaseCidr("10.254.30.76/30")
    .bgpCerCidr("10.254.30.78/30")
    .bgpIbmCidr("10.254.30.77/30")
    .global(true)
    .metered(false)
    .name("myGateway")
    .resourceGroup(resourceGroupIdentityModel)
    .speedMbps(Long.valueOf("1000"))
    .type("dedicated")
    .carrierName("myCarrierName")
    .crossConnectRouter("xcr01.dal03")
    .customerName("newCustomerName")
    .dedicatedHostingId("ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4")
    .locationName("dal03")
    .build();

    // Construct an instance of the CreateGatewayOptions model
    CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder()
    .gatewayTemplate(gatewayTemplateModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = testService.createGateway(createGatewayOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
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
    assertEquals(parsedPath, createGatewayPath);
  }

  // Test the createGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.createGateway(null).execute();
  }

  @Test
  public void testDeleteGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteGatewayOptions model
    DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = testService.deleteGateway(deleteGatewayOptionsModel).execute();
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
    assertEquals(parsedPath, deleteGatewayPath);
  }

  // Test the deleteGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.deleteGateway(null).execute();
  }

  @Test
  public void testGetGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_base_cidr\": \"10.254.30.76/30\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"created_at\": \"2019-01-01T12:00:00\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/57a7d05f36894e3cb9b46a43556d903e::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"dedicated_hosting_id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String getGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayOptions model
    GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = testService.getGateway(getGatewayOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
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
    assertEquals(parsedPath, getGatewayPath);
  }

  // Test the getGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.getGateway(null).execute();
  }

  @Test
  public void testUpdateGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_base_cidr\": \"10.254.30.76/30\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"created_at\": \"2019-01-01T12:00:00\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/57a7d05f36894e3cb9b46a43556d903e::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"dedicated_hosting_id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String updateGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateGatewayOptions model
    UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
    .id("testString")
    .global(true)
    .loaRejectReason("The port mentioned was incorrect")
    .metered(false)
    .name("testGateway")
    .operationalStatus("loa_accepted")
    .speedMbps(Long.valueOf("1000"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = testService.updateGateway(updateGatewayOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
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
    assertEquals(parsedPath, updateGatewayPath);
  }

  // Test the updateGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.updateGateway(null).execute();
  }

  @Test
  public void testCreateGatewayActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bgp_asn\": 64999, \"bgp_base_cidr\": \"10.254.30.76/30\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"created_at\": \"2019-01-01T12:00:00\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/57a7d05f36894e3cb9b46a43556d903e::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"dedicated_hosting_id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayActionPath = "/gateways/testString/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate model
    GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate gatewayActionTemplateUpdatesItemModel = new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.Builder()
    .speedMbps(Long.valueOf("500"))
    .build();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d6043e9465c883cb9f7363e78e8")
    .build();

    // Construct an instance of the CreateGatewayActionOptions model
    CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
    .id("testString")
    .action("create_gateway_approve")
    .global(true)
    .metered(false)
    .resourceGroup(resourceGroupIdentityModel)
    .updates(new java.util.ArrayList<GatewayActionTemplateUpdatesItem>(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = testService.createGatewayAction(createGatewayActionOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
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
    assertEquals(parsedPath, createGatewayActionPath);
  }

  // Test the createGatewayAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.createGatewayAction(null).execute();
  }

  @Test
  public void testListGatewayCompletionNoticeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{}";
    String listGatewayCompletionNoticePath = "/gateways/testString/completion_notice";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/pdf")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewayCompletionNoticeOptions model
    ListGatewayCompletionNoticeOptions listGatewayCompletionNoticeOptionsModel = new ListGatewayCompletionNoticeOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = testService.listGatewayCompletionNotice(listGatewayCompletionNoticeOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
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
    assertEquals(parsedPath, listGatewayCompletionNoticePath);
  }

  // Test the listGatewayCompletionNotice operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayCompletionNoticeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listGatewayCompletionNotice(null).execute();
  }

  @Test
  public void testCreateGatewayCompletionNoticeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String createGatewayCompletionNoticePath = "/gateways/testString/completion_notice";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateGatewayCompletionNoticeOptions model
    CreateGatewayCompletionNoticeOptions createGatewayCompletionNoticeOptionsModel = new CreateGatewayCompletionNoticeOptions.Builder()
    .id("testString")
    .upload(TestUtilities.createMockStream("This is a mock file."))
    .uploadContentType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = testService.createGatewayCompletionNotice(createGatewayCompletionNoticeOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayCompletionNoticePath);
  }

  // Test the createGatewayCompletionNotice operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayCompletionNoticeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.createGatewayCompletionNotice(null).execute();
  }

  @Test
  public void testListGatewayLetterOfAuthorizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{}";
    String listGatewayLetterOfAuthorizationPath = "/gateways/testString/letter_of_authorization";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/pdf")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewayLetterOfAuthorizationOptions model
    ListGatewayLetterOfAuthorizationOptions listGatewayLetterOfAuthorizationOptionsModel = new ListGatewayLetterOfAuthorizationOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = testService.listGatewayLetterOfAuthorization(listGatewayLetterOfAuthorizationOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
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
    assertEquals(parsedPath, listGatewayLetterOfAuthorizationPath);
  }

  // Test the listGatewayLetterOfAuthorization operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayLetterOfAuthorizationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listGatewayLetterOfAuthorization(null).execute();
  }

  @Test
  public void testListOfferingTypeLocationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"locations\": [{\"billing_location\": \"us\", \"building_colocation_owner\": \"MyProvider\", \"display_name\": \"Dallas 9\", \"location_type\": \"PoP\", \"market\": \"Dallas\", \"market_geography\": \"N/S America\", \"mzr\": true, \"name\": \"dal03\", \"offering_type\": \"dedicated\", \"provision_enabled\": true, \"vpc_region\": \"us-south\"}]}";
    String listOfferingTypeLocationsPath = "/offering_types/dedicated/locations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListOfferingTypeLocationsOptions model
    ListOfferingTypeLocationsOptions listOfferingTypeLocationsOptionsModel = new ListOfferingTypeLocationsOptions.Builder()
    .offeringType("dedicated")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LocationCollection> response = testService.listOfferingTypeLocations(listOfferingTypeLocationsOptionsModel).execute();
    assertNotNull(response);
    LocationCollection responseObj = response.getResult();
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
    assertEquals(parsedPath, listOfferingTypeLocationsPath);
  }

  // Test the listOfferingTypeLocations operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listOfferingTypeLocations(null).execute();
  }

  @Test
  public void testListOfferingTypeLocationCrossConnectRoutersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"cross_connect_routers\": [{\"router_name\": \"xcr01.dal03\", \"total_connections\": 1}]}";
    String listOfferingTypeLocationCrossConnectRoutersPath = "/offering_types/dedicated/locations/testString/cross_connect_routers";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListOfferingTypeLocationCrossConnectRoutersOptions model
    ListOfferingTypeLocationCrossConnectRoutersOptions listOfferingTypeLocationCrossConnectRoutersOptionsModel = new ListOfferingTypeLocationCrossConnectRoutersOptions.Builder()
    .offeringType("dedicated")
    .locationName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LocationCrossConnectRouterCollection> response = testService.listOfferingTypeLocationCrossConnectRouters(listOfferingTypeLocationCrossConnectRoutersOptionsModel).execute();
    assertNotNull(response);
    LocationCrossConnectRouterCollection responseObj = response.getResult();
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
    assertEquals(parsedPath, listOfferingTypeLocationCrossConnectRoutersPath);
  }

  // Test the listOfferingTypeLocationCrossConnectRouters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationCrossConnectRoutersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listOfferingTypeLocationCrossConnectRouters(null).execute();
  }

  @Test
  public void testListOfferingTypeSpeedsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"speeds\": [{\"link_speed\": 2000}]}";
    String listOfferingTypeSpeedsPath = "/offering_types/dedicated/speeds";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListOfferingTypeSpeedsOptions model
    ListOfferingTypeSpeedsOptions listOfferingTypeSpeedsOptionsModel = new ListOfferingTypeSpeedsOptions.Builder()
    .offeringType("dedicated")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OfferingSpeedCollection> response = testService.listOfferingTypeSpeeds(listOfferingTypeSpeedsOptionsModel).execute();
    assertNotNull(response);
    OfferingSpeedCollection responseObj = response.getResult();
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
    assertEquals(parsedPath, listOfferingTypeSpeedsPath);
  }

  // Test the listOfferingTypeSpeeds operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeSpeedsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listOfferingTypeSpeeds(null).execute();
  }

  @Test
  public void testListPortsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/v1/ports?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/v1/ports?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=100\", \"start\": \"9d5a91a3e2cbd233b5a5b33436855ed1\"}, \"total_count\": 132, \"ports\": [{\"direct_link_count\": 1, \"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}]}";
    String listPortsPath = "/ports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListPortsOptions model
    ListPortsOptions listPortsOptionsModel = new ListPortsOptions.Builder()
    .start("testString")
    .limit(Long.valueOf("1"))
    .locationName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PortCollection> response = testService.listPorts(listPortsOptionsModel).execute();
    assertNotNull(response);
    PortCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("location_name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPortsPath);
  }

  @Test
  public void testGetPortWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"direct_link_count\": 1, \"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}";
    String getPortPath = "/ports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPortOptions model
    GetPortOptions getPortOptionsModel = new GetPortOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Port> response = testService.getPort(getPortOptionsModel).execute();
    assertNotNull(response);
    Port responseObj = response.getResult();
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
    assertEquals(parsedPath, getPortPath);
  }

  // Test the getPort operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPortNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.getPort(null).execute();
  }

  @Test
  public void testListGatewayVirtualConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"virtual_connections\": [{\"created_at\": \"2019-01-01T12:00:00\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}]}";
    String listGatewayVirtualConnectionsPath = "/gateways/testString/virtual_connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewayVirtualConnectionsOptions model
    ListGatewayVirtualConnectionsOptions listGatewayVirtualConnectionsOptionsModel = new ListGatewayVirtualConnectionsOptions.Builder()
    .gatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayVirtualConnectionCollection> response = testService.listGatewayVirtualConnections(listGatewayVirtualConnectionsOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnectionCollection responseObj = response.getResult();
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
    assertEquals(parsedPath, listGatewayVirtualConnectionsPath);
  }

  // Test the listGatewayVirtualConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayVirtualConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.listGatewayVirtualConnections(null).execute();
  }

  @Test
  public void testCreateGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String createGatewayVirtualConnectionPath = "/gateways/testString/virtual_connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateGatewayVirtualConnectionOptions model
    CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptionsModel = new CreateGatewayVirtualConnectionOptions.Builder()
    .gatewayId("testString")
    .name("newVC")
    .type("vpc")
    .networkId("crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayVirtualConnection> response = testService.createGatewayVirtualConnection(createGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
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
    assertEquals(parsedPath, createGatewayVirtualConnectionPath);
  }

  // Test the createGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.createGatewayVirtualConnection(null).execute();
  }

  @Test
  public void testDeleteGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteGatewayVirtualConnectionPath = "/gateways/testString/virtual_connections/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteGatewayVirtualConnectionOptions model
    DeleteGatewayVirtualConnectionOptions deleteGatewayVirtualConnectionOptionsModel = new DeleteGatewayVirtualConnectionOptions.Builder()
    .gatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = testService.deleteGatewayVirtualConnection(deleteGatewayVirtualConnectionOptionsModel).execute();
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
    assertEquals(parsedPath, deleteGatewayVirtualConnectionPath);
  }

  // Test the deleteGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.deleteGatewayVirtualConnection(null).execute();
  }

  @Test
  public void testGetGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String getGatewayVirtualConnectionPath = "/gateways/testString/virtual_connections/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayVirtualConnectionOptions model
    GetGatewayVirtualConnectionOptions getGatewayVirtualConnectionOptionsModel = new GetGatewayVirtualConnectionOptions.Builder()
    .gatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayVirtualConnection> response = testService.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
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
    assertEquals(parsedPath, getGatewayVirtualConnectionPath);
  }

  // Test the getGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.getGatewayVirtualConnection(null).execute();
  }

  @Test
  public void testUpdateGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String updateGatewayVirtualConnectionPath = "/gateways/testString/virtual_connections/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateGatewayVirtualConnectionOptions model
    UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptionsModel = new UpdateGatewayVirtualConnectionOptions.Builder()
    .gatewayId("testString")
    .id("testString")
    .name("newConnectionName")
    .status("attached")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayVirtualConnection> response = testService.updateGatewayVirtualConnection(updateGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
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
    assertEquals(parsedPath, updateGatewayVirtualConnectionPath);
  }

  // Test the updateGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.updateGatewayVirtualConnection(null).execute();
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