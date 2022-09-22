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
package com.ibm.cloud.networking.direct_link.v1;

import com.ibm.cloud.networking.direct_link.v1.DirectLink;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrepend;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CrossConnectRouter;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientBGPASNUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigActionTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequest;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayCreate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayDelete;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributes;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItemGatewayClientBGPASNUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItemGatewayClientBGPIPUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayUpdateAttributesUpdatesItemGatewayClientVLANUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestUpdatesItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestUpdatesItemGatewayClientBGPASNUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestUpdatesItemGatewayClientBGPIPUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestUpdatesItemGatewayClientVLANUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigActiveCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplateFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplateFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPatchTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPort;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatistic;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatisticCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayBFDStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayBGPStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayLinkStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnectionCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatisticsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatusOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetPortOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayLetterOfAuthorizationOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayRouteReportsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayVirtualConnectionsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewaysOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeLocationCrossConnectRoutersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeLocationsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListOfferingTypeSpeedsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListPortsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.LocationCollection;
import com.ibm.cloud.networking.direct_link.v1.model.LocationCrossConnectRouterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.LocationOutput;
import com.ibm.cloud.networking.direct_link.v1.model.OfferingSpeed;
import com.ibm.cloud.networking.direct_link.v1.model.OfferingSpeedCollection;
import com.ibm.cloud.networking.direct_link.v1.model.Port;
import com.ibm.cloud.networking.direct_link.v1.model.PortCollection;
import com.ibm.cloud.networking.direct_link.v1.model.PortsPaginatedCollectionFirst;
import com.ibm.cloud.networking.direct_link.v1.model.PortsPaginatedCollectionNext;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReport;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportConnection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOnPremRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteForConnection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteForOthers;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteGroup;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportRoute;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
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
 * Unit test class for the DirectLink service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class DirectLinkTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DirectLink directLinkService;

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

    directLinkService = DirectLink.newInstance(version, serviceName);
    String url = server.url("/").toString();
    directLinkService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    new DirectLink(version, serviceName, null);
  }


  @Test
  public void testGetVersion() throws Throwable {
    constructClientService();
    assertEquals(directLinkService.getVersion(), "testString");
  }

  @Test
  public void testListGatewayRouteReportsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"route_reports\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}]}";
    String listGatewayRouteReportsPath = "/gateways/testString/route_reports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewayRouteReportsOptions model
    ListGatewayRouteReportsOptions listGatewayRouteReportsOptionsModel = new ListGatewayRouteReportsOptions.Builder()
    .gatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReportCollection> response = directLinkService.listGatewayRouteReports(listGatewayRouteReportsOptionsModel).execute();
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
    assertEquals(parsedPath, listGatewayRouteReportsPath);
  }
  
  public void testListGatewayRouteReportsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewayRouteReportsWOptions.
    directLinkService.enableRetries(4, 30);
    testListGatewayRouteReportsWOptions();

    // Disable retries and run testListGatewayRouteReportsWOptions.
    directLinkService.disableRetries();
    testListGatewayRouteReportsWOptions();
  }  

  // Test the listGatewayRouteReports operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayRouteReportsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listGatewayRouteReports(null).execute();
  }

  @Test
  public void testCreateGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}";
    String createGatewayRouteReportPath = "/gateways/testString/route_reports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateGatewayRouteReportOptions model
    CreateGatewayRouteReportOptions createGatewayRouteReportOptionsModel = new CreateGatewayRouteReportOptions.Builder()
    .gatewayId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReport> response = directLinkService.createGatewayRouteReport(createGatewayRouteReportOptionsModel).execute();
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
    assertEquals(parsedPath, createGatewayRouteReportPath);
  }
  
  public void testCreateGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateGatewayRouteReportWOptions.
    directLinkService.enableRetries(4, 30);
    testCreateGatewayRouteReportWOptions();

    // Disable retries and run testCreateGatewayRouteReportWOptions.
    directLinkService.disableRetries();
    testCreateGatewayRouteReportWOptions();
  }  

  // Test the createGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.createGatewayRouteReport(null).execute();
  }

  @Test
  public void testDeleteGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteGatewayRouteReportPath = "/gateways/testString/route_reports/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteGatewayRouteReportOptions model
    DeleteGatewayRouteReportOptions deleteGatewayRouteReportOptionsModel = new DeleteGatewayRouteReportOptions.Builder()
    .gatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = directLinkService.deleteGatewayRouteReport(deleteGatewayRouteReportOptionsModel).execute();
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
    assertEquals(parsedPath, deleteGatewayRouteReportPath);
  }
  
  public void testDeleteGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteGatewayRouteReportWOptions.
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayRouteReportWOptions();

    // Disable retries and run testDeleteGatewayRouteReportWOptions.
    directLinkService.disableRetries();
    testDeleteGatewayRouteReportWOptions();
  }  

  // Test the deleteGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.deleteGatewayRouteReport(null).execute();
  }

  @Test
  public void testGetGatewayRouteReportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}";
    String getGatewayRouteReportPath = "/gateways/testString/route_reports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayRouteReportOptions model
    GetGatewayRouteReportOptions getGatewayRouteReportOptionsModel = new GetGatewayRouteReportOptions.Builder()
    .gatewayId("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RouteReport> response = directLinkService.getGatewayRouteReport(getGatewayRouteReportOptionsModel).execute();
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
    assertEquals(parsedPath, getGatewayRouteReportPath);
  }
  
  public void testGetGatewayRouteReportWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayRouteReportWOptions.
    directLinkService.enableRetries(4, 30);
    testGetGatewayRouteReportWOptions();

    // Disable retries and run testGetGatewayRouteReportWOptions.
    directLinkService.disableRetries();
    testGetGatewayRouteReportWOptions();
  }  

  // Test the getGatewayRouteReport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayRouteReportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getGatewayRouteReport(null).execute();
  }

  @Test
  public void testListGatewaysWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"gateways\": [{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c\"}, \"bfd_config\": {\"bfd_status\": \"active\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec_config\": {\"active\": true, \"active_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"cryptographic_algorithm\": \"aes_256_cmac\", \"fallback_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"key_server_priority\": 255, \"primary_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"sak_expiry_time\": 3600, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"window_size\": 64}, \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}]}";
    String listGatewaysPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListGatewaysOptions model
    ListGatewaysOptions listGatewaysOptionsModel = new ListGatewaysOptions();

    // Invoke operation with valid options model (positive test)
    Response<GatewayCollection> response = directLinkService.listGateways(listGatewaysOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewaysPath);
  }
  
  public void testListGatewaysWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewaysWOptions.
    directLinkService.enableRetries(4, 30);
    testListGatewaysWOptions();

    // Disable retries and run testListGatewaysWOptions.
    directLinkService.disableRetries();
    testListGatewaysWOptions();
  }  

  @Test
  public void testCreateGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c\"}, \"bfd_config\": {\"bfd_status\": \"active\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec_config\": {\"active\": true, \"active_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"cryptographic_algorithm\": \"aes_256_cmac\", \"fallback_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"key_server_priority\": 255, \"primary_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"sak_expiry_time\": 3600, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"window_size\": 64}, \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayPath = "/gateways";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AsPrependTemplate model
    AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
    .length(Long.valueOf("4"))
    .policy("import")
    .prefix("172.17.0.0/16")
    .build();

    // Construct an instance of the GatewayTemplateAuthenticationKey model
    GatewayTemplateAuthenticationKey gatewayTemplateAuthenticationKeyModel = new GatewayTemplateAuthenticationKey.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
    .build();

    // Construct an instance of the GatewayBfdConfigTemplate model
    GatewayBfdConfigTemplate gatewayBfdConfigTemplateModel = new GatewayBfdConfigTemplate.Builder()
    .interval(Long.valueOf("2000"))
    .multiplier(Long.valueOf("10"))
    .build();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d6043e9465c883cb9f7363e78e8")
    .build();

    // Construct an instance of the GatewayMacsecConfigTemplateFallbackCak model
    GatewayMacsecConfigTemplateFallbackCak gatewayMacsecConfigTemplateFallbackCakModel = new GatewayMacsecConfigTemplateFallbackCak.Builder()
    .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
    .build();

    // Construct an instance of the GatewayMacsecConfigTemplatePrimaryCak model
    GatewayMacsecConfigTemplatePrimaryCak gatewayMacsecConfigTemplatePrimaryCakModel = new GatewayMacsecConfigTemplatePrimaryCak.Builder()
    .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
    .build();

    // Construct an instance of the GatewayMacsecConfigTemplate model
    GatewayMacsecConfigTemplate gatewayMacsecConfigTemplateModel = new GatewayMacsecConfigTemplate.Builder()
    .active(true)
    .fallbackCak(gatewayMacsecConfigTemplateFallbackCakModel)
    .primaryCak(gatewayMacsecConfigTemplatePrimaryCakModel)
    .windowSize(Long.valueOf("148809600"))
    .build();

    // Construct an instance of the GatewayTemplateGatewayTypeDedicatedTemplate model
    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
    .asPrepends(new java.util.ArrayList<AsPrependTemplate>(java.util.Arrays.asList(asPrependTemplateModel)))
    .authenticationKey(gatewayTemplateAuthenticationKeyModel)
    .bfdConfig(gatewayBfdConfigTemplateModel)
    .bgpAsn(Long.valueOf("64999"))
    .bgpBaseCidr("testString")
    .bgpCerCidr("169.254.0.10/30")
    .bgpIbmCidr("169.254.0.9/30")
    .connectionMode("transit")
    .global(true)
    .metered(false)
    .name("myGateway")
    .patchPanelCompletionNotice("patch panel configuration details")
    .resourceGroup(resourceGroupIdentityModel)
    .speedMbps(Long.valueOf("1000"))
    .type("dedicated")
    .carrierName("myCarrierName")
    .crossConnectRouter("xcr01.dal03")
    .customerName("newCustomerName")
    .locationName("dal03")
    .macsecConfig(gatewayMacsecConfigTemplateModel)
    .build();

    // Construct an instance of the CreateGatewayOptions model
    CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder()
    .gatewayTemplate(gatewayTemplateModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = directLinkService.createGateway(createGatewayOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayPath);
  }
  
  public void testCreateGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateGatewayWOptions.
    directLinkService.enableRetries(4, 30);
    testCreateGatewayWOptions();

    // Disable retries and run testCreateGatewayWOptions.
    directLinkService.disableRetries();
    testCreateGatewayWOptions();
  }  

  // Test the createGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.createGateway(null).execute();
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
    Response<Void> response = directLinkService.deleteGateway(deleteGatewayOptionsModel).execute();
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
    assertEquals(parsedPath, deleteGatewayPath);
  }
  
  public void testDeleteGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteGatewayWOptions.
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayWOptions();

    // Disable retries and run testDeleteGatewayWOptions.
    directLinkService.disableRetries();
    testDeleteGatewayWOptions();
  }  

  // Test the deleteGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.deleteGateway(null).execute();
  }

  @Test
  public void testGetGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c\"}, \"bfd_config\": {\"bfd_status\": \"active\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec_config\": {\"active\": true, \"active_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"cryptographic_algorithm\": \"aes_256_cmac\", \"fallback_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"key_server_priority\": 255, \"primary_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"sak_expiry_time\": 3600, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"window_size\": 64}, \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
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
    Response<Gateway> response = directLinkService.getGateway(getGatewayOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayPath);
  }
  
  public void testGetGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayWOptions.
    directLinkService.enableRetries(4, 30);
    testGetGatewayWOptions();

    // Disable retries and run testGetGatewayWOptions.
    directLinkService.disableRetries();
    testGetGatewayWOptions();
  }  

  // Test the getGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getGateway(null).execute();
  }

  @Test
  public void testUpdateGatewayWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c\"}, \"bfd_config\": {\"bfd_status\": \"active\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec_config\": {\"active\": true, \"active_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"cryptographic_algorithm\": \"aes_256_cmac\", \"fallback_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"key_server_priority\": 255, \"primary_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"sak_expiry_time\": 3600, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"window_size\": 64}, \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String updateGatewayPath = "/gateways/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GatewayPatchTemplateAuthenticationKey model
    GatewayPatchTemplateAuthenticationKey gatewayPatchTemplateAuthenticationKeyModel = new GatewayPatchTemplateAuthenticationKey.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
    .build();

    // Construct an instance of the GatewayBfdPatchTemplate model
    GatewayBfdPatchTemplate gatewayBfdPatchTemplateModel = new GatewayBfdPatchTemplate.Builder()
    .interval(Long.valueOf("2000"))
    .multiplier(Long.valueOf("10"))
    .build();

    // Construct an instance of the GatewayMacsecConfigPatchTemplateFallbackCak model
    GatewayMacsecConfigPatchTemplateFallbackCak gatewayMacsecConfigPatchTemplateFallbackCakModel = new GatewayMacsecConfigPatchTemplateFallbackCak.Builder()
    .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
    .build();

    // Construct an instance of the GatewayMacsecConfigPatchTemplatePrimaryCak model
    GatewayMacsecConfigPatchTemplatePrimaryCak gatewayMacsecConfigPatchTemplatePrimaryCakModel = new GatewayMacsecConfigPatchTemplatePrimaryCak.Builder()
    .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
    .build();

    // Construct an instance of the GatewayMacsecConfigPatchTemplate model
    GatewayMacsecConfigPatchTemplate gatewayMacsecConfigPatchTemplateModel = new GatewayMacsecConfigPatchTemplate.Builder()
    .active(true)
    .fallbackCak(gatewayMacsecConfigPatchTemplateFallbackCakModel)
    .primaryCak(gatewayMacsecConfigPatchTemplatePrimaryCakModel)
    .windowSize(Long.valueOf("512"))
    .build();

    // Construct an instance of the UpdateGatewayOptions model
    UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
    .id("testString")
    .authenticationKey(gatewayPatchTemplateAuthenticationKeyModel)
    .bfdConfig(gatewayBfdPatchTemplateModel)
    .bgpAsn(Long.valueOf("64999"))
    .bgpCerCidr("169.254.0.10/30")
    .bgpIbmCidr("169.254.0.9/30")
    .connectionMode("transit")
    .global(true)
    .loaRejectReason("The port mentioned was incorrect")
    .macsecConfig(gatewayMacsecConfigPatchTemplateModel)
    .metered(false)
    .name("testGateway")
    .operationalStatus("loa_accepted")
    .patchPanelCompletionNotice("patch panel configuration details")
    .speedMbps(Long.valueOf("1000"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = directLinkService.updateGateway(updateGatewayOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayPath);
  }
  
  public void testUpdateGatewayWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateGatewayWOptions.
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayWOptions();

    // Disable retries and run testUpdateGatewayWOptions.
    directLinkService.disableRetries();
    testUpdateGatewayWOptions();
  }  

  // Test the updateGateway operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.updateGateway(null).execute();
  }

  @Test
  public void testCreateGatewayActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c\"}, \"bfd_config\": {\"bfd_status\": \"active\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec_config\": {\"active\": true, \"active_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"cryptographic_algorithm\": \"aes_256_cmac\", \"fallback_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"key_server_priority\": 255, \"primary_cak\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\", \"status\": \"status\"}, \"sak_expiry_time\": 3600, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"window_size\": 64}, \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayActionPath = "/gateways/testString/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AsPrependTemplate model
    AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
    .length(Long.valueOf("4"))
    .policy("import")
    .prefix("172.17.0.0/16")
    .build();

    // Construct an instance of the GatewayActionTemplateAuthenticationKey model
    GatewayActionTemplateAuthenticationKey gatewayActionTemplateAuthenticationKeyModel = new GatewayActionTemplateAuthenticationKey.Builder()
    .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
    .build();

    // Construct an instance of the GatewayBfdConfigActionTemplate model
    GatewayBfdConfigActionTemplate gatewayBfdConfigActionTemplateModel = new GatewayBfdConfigActionTemplate.Builder()
    .interval(Long.valueOf("2000"))
    .multiplier(Long.valueOf("10"))
    .build();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
    .id("56969d6043e9465c883cb9f7363e78e8")
    .build();

    // Construct an instance of the GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate model
    GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate gatewayActionTemplateUpdatesItemModel = new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.Builder()
    .speedMbps(Long.valueOf("500"))
    .build();

    // Construct an instance of the CreateGatewayActionOptions model
    CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
    .id("testString")
    .action("create_gateway_approve")
    .asPrepends(new java.util.ArrayList<AsPrependTemplate>(java.util.Arrays.asList(asPrependTemplateModel)))
    .authenticationKey(gatewayActionTemplateAuthenticationKeyModel)
    .bfdConfig(gatewayBfdConfigActionTemplateModel)
    .connectionMode("transit")
    .global(true)
    .metered(false)
    .resourceGroup(resourceGroupIdentityModel)
    .updates(new java.util.ArrayList<GatewayActionTemplateUpdatesItem>(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Gateway> response = directLinkService.createGatewayAction(createGatewayActionOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayActionPath);
  }
  
  public void testCreateGatewayActionWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateGatewayActionWOptions.
    directLinkService.enableRetries(4, 30);
    testCreateGatewayActionWOptions();

    // Disable retries and run testCreateGatewayActionWOptions.
    directLinkService.disableRetries();
    testCreateGatewayActionWOptions();
  }  

  // Test the createGatewayAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.createGatewayAction(null).execute();
  }

  @Test
  public void testListGatewayCompletionNoticeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
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
    Response<InputStream> response = directLinkService.listGatewayCompletionNotice(listGatewayCompletionNoticeOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayCompletionNoticePath);
  }
  
  public void testListGatewayCompletionNoticeWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewayCompletionNoticeWOptions.
    directLinkService.enableRetries(4, 30);
    testListGatewayCompletionNoticeWOptions();

    // Disable retries and run testListGatewayCompletionNoticeWOptions.
    directLinkService.disableRetries();
    testListGatewayCompletionNoticeWOptions();
  }  

  // Test the listGatewayCompletionNotice operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayCompletionNoticeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listGatewayCompletionNotice(null).execute();
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
    Response<Void> response = directLinkService.createGatewayCompletionNotice(createGatewayCompletionNoticeOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayCompletionNoticePath);
  }
  
  public void testCreateGatewayCompletionNoticeWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateGatewayCompletionNoticeWOptions.
    directLinkService.enableRetries(4, 30);
    testCreateGatewayCompletionNoticeWOptions();

    // Disable retries and run testCreateGatewayCompletionNoticeWOptions.
    directLinkService.disableRetries();
    testCreateGatewayCompletionNoticeWOptions();
  }  

  // Test the createGatewayCompletionNotice operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayCompletionNoticeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.createGatewayCompletionNotice(null).execute();
  }

  @Test
  public void testListGatewayLetterOfAuthorizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
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
    Response<InputStream> response = directLinkService.listGatewayLetterOfAuthorization(listGatewayLetterOfAuthorizationOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayLetterOfAuthorizationPath);
  }
  
  public void testListGatewayLetterOfAuthorizationWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewayLetterOfAuthorizationWOptions.
    directLinkService.enableRetries(4, 30);
    testListGatewayLetterOfAuthorizationWOptions();

    // Disable retries and run testListGatewayLetterOfAuthorizationWOptions.
    directLinkService.disableRetries();
    testListGatewayLetterOfAuthorizationWOptions();
  }  

  // Test the listGatewayLetterOfAuthorization operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayLetterOfAuthorizationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listGatewayLetterOfAuthorization(null).execute();
  }

  @Test
  public void testGetGatewayStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"statistics\": [{\"created_at\": \"2020-08-20T06:58:41.909Z\", \"data\": \"MKA statistics text...\", \"type\": \"macsec_policy\"}]}";
    String getGatewayStatisticsPath = "/gateways/testString/statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayStatisticsOptions model
    GetGatewayStatisticsOptions getGatewayStatisticsOptionsModel = new GetGatewayStatisticsOptions.Builder()
    .id("testString")
    .type("macsec_mka_session")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayStatisticCollection> response = directLinkService.getGatewayStatistics(getGatewayStatisticsOptionsModel).execute();
    assertNotNull(response);
    GatewayStatisticCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("type"), "macsec_mka_session");
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayStatisticsPath);
  }
  
  public void testGetGatewayStatisticsWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayStatisticsWOptions.
    directLinkService.enableRetries(4, 30);
    testGetGatewayStatisticsWOptions();

    // Disable retries and run testGetGatewayStatisticsWOptions.
    directLinkService.disableRetries();
    testGetGatewayStatisticsWOptions();
  }  

  // Test the getGatewayStatistics operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayStatisticsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getGatewayStatistics(null).execute();
  }

  @Test
  public void testGetGatewayStatusWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": [{\"type\": \"bgp\", \"updated_at\": \"2020-08-20T06:58:41.909Z\", \"value\": \"active\"}]}";
    String getGatewayStatusPath = "/gateways/testString/status";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetGatewayStatusOptions model
    GetGatewayStatusOptions getGatewayStatusOptionsModel = new GetGatewayStatusOptions.Builder()
    .id("testString")
    .type("bgp")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GatewayStatusCollection> response = directLinkService.getGatewayStatus(getGatewayStatusOptionsModel).execute();
    assertNotNull(response);
    GatewayStatusCollection responseObj = response.getResult();
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
    assertEquals(query.get("type"), "bgp");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayStatusPath);
  }
  
  public void testGetGatewayStatusWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayStatusWOptions.
    directLinkService.enableRetries(4, 30);
    testGetGatewayStatusWOptions();

    // Disable retries and run testGetGatewayStatusWOptions.
    directLinkService.disableRetries();
    testGetGatewayStatusWOptions();
  }  

  // Test the getGatewayStatus operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayStatusNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getGatewayStatus(null).execute();
  }

  @Test
  public void testListOfferingTypeLocationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"locations\": [{\"billing_location\": \"us\", \"building_colocation_owner\": \"MyProvider\", \"display_name\": \"Dallas 9\", \"location_type\": \"PoP\", \"macsec_enabled\": false, \"market\": \"Dallas\", \"market_geography\": \"N/S America\", \"mzr\": true, \"name\": \"dal03\", \"offering_type\": \"dedicated\", \"provision_enabled\": true, \"vpc_region\": \"us-south\"}]}";
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
    Response<LocationCollection> response = directLinkService.listOfferingTypeLocations(listOfferingTypeLocationsOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeLocationsPath);
  }
  
  public void testListOfferingTypeLocationsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListOfferingTypeLocationsWOptions.
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeLocationsWOptions();

    // Disable retries and run testListOfferingTypeLocationsWOptions.
    directLinkService.disableRetries();
    testListOfferingTypeLocationsWOptions();
  }  

  // Test the listOfferingTypeLocations operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listOfferingTypeLocations(null).execute();
  }

  @Test
  public void testListOfferingTypeLocationCrossConnectRoutersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"cross_connect_routers\": [{\"capabilities\": [\"capabilities\"], \"router_name\": \"xcr01.dal03\", \"total_connections\": 1}]}";
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
    Response<LocationCrossConnectRouterCollection> response = directLinkService.listOfferingTypeLocationCrossConnectRouters(listOfferingTypeLocationCrossConnectRoutersOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeLocationCrossConnectRoutersPath);
  }
  
  public void testListOfferingTypeLocationCrossConnectRoutersWOptionsWRetries() throws Throwable {
    // Enable retries and run testListOfferingTypeLocationCrossConnectRoutersWOptions.
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeLocationCrossConnectRoutersWOptions();

    // Disable retries and run testListOfferingTypeLocationCrossConnectRoutersWOptions.
    directLinkService.disableRetries();
    testListOfferingTypeLocationCrossConnectRoutersWOptions();
  }  

  // Test the listOfferingTypeLocationCrossConnectRouters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationCrossConnectRoutersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listOfferingTypeLocationCrossConnectRouters(null).execute();
  }

  @Test
  public void testListOfferingTypeSpeedsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"speeds\": [{\"capabilities\": [\"capabilities\"], \"link_speed\": 2000, \"macsec_enabled\": false}]}";
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
    Response<OfferingSpeedCollection> response = directLinkService.listOfferingTypeSpeeds(listOfferingTypeSpeedsOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeSpeedsPath);
  }
  
  public void testListOfferingTypeSpeedsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListOfferingTypeSpeedsWOptions.
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeSpeedsWOptions();

    // Disable retries and run testListOfferingTypeSpeedsWOptions.
    directLinkService.disableRetries();
    testListOfferingTypeSpeedsWOptions();
  }  

  // Test the listOfferingTypeSpeeds operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeSpeedsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listOfferingTypeSpeeds(null).execute();
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
    Response<PortCollection> response = directLinkService.listPorts(listPortsOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("location_name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPortsPath);
  }
  
  public void testListPortsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListPortsWOptions.
    directLinkService.enableRetries(4, 30);
    testListPortsWOptions();

    // Disable retries and run testListPortsWOptions.
    directLinkService.disableRetries();
    testListPortsWOptions();
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
    Response<Port> response = directLinkService.getPort(getPortOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPortPath);
  }
  
  public void testGetPortWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetPortWOptions.
    directLinkService.enableRetries(4, 30);
    testGetPortWOptions();

    // Disable retries and run testGetPortWOptions.
    directLinkService.disableRetries();
    testGetPortWOptions();
  }  

  // Test the getPort operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPortNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getPort(null).execute();
  }

  @Test
  public void testListGatewayVirtualConnectionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"virtual_connections\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}]}";
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
    Response<GatewayVirtualConnectionCollection> response = directLinkService.listGatewayVirtualConnections(listGatewayVirtualConnectionsOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayVirtualConnectionsPath);
  }
  
  public void testListGatewayVirtualConnectionsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListGatewayVirtualConnectionsWOptions.
    directLinkService.enableRetries(4, 30);
    testListGatewayVirtualConnectionsWOptions();

    // Disable retries and run testListGatewayVirtualConnectionsWOptions.
    directLinkService.disableRetries();
    testListGatewayVirtualConnectionsWOptions();
  }  

  // Test the listGatewayVirtualConnections operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayVirtualConnectionsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.listGatewayVirtualConnections(null).execute();
  }

  @Test
  public void testCreateGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
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
    Response<GatewayVirtualConnection> response = directLinkService.createGatewayVirtualConnection(createGatewayVirtualConnectionOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayVirtualConnectionPath);
  }
  
  public void testCreateGatewayVirtualConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateGatewayVirtualConnectionWOptions.
    directLinkService.enableRetries(4, 30);
    testCreateGatewayVirtualConnectionWOptions();

    // Disable retries and run testCreateGatewayVirtualConnectionWOptions.
    directLinkService.disableRetries();
    testCreateGatewayVirtualConnectionWOptions();
  }  

  // Test the createGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.createGatewayVirtualConnection(null).execute();
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
    Response<Void> response = directLinkService.deleteGatewayVirtualConnection(deleteGatewayVirtualConnectionOptionsModel).execute();
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
    assertEquals(parsedPath, deleteGatewayVirtualConnectionPath);
  }
  
  public void testDeleteGatewayVirtualConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteGatewayVirtualConnectionWOptions.
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayVirtualConnectionWOptions();

    // Disable retries and run testDeleteGatewayVirtualConnectionWOptions.
    directLinkService.disableRetries();
    testDeleteGatewayVirtualConnectionWOptions();
  }  

  // Test the deleteGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.deleteGatewayVirtualConnection(null).execute();
  }

  @Test
  public void testGetGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
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
    Response<GatewayVirtualConnection> response = directLinkService.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayVirtualConnectionPath);
  }
  
  public void testGetGatewayVirtualConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetGatewayVirtualConnectionWOptions.
    directLinkService.enableRetries(4, 30);
    testGetGatewayVirtualConnectionWOptions();

    // Disable retries and run testGetGatewayVirtualConnectionWOptions.
    directLinkService.disableRetries();
    testGetGatewayVirtualConnectionWOptions();
  }  

  // Test the getGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.getGatewayVirtualConnection(null).execute();
  }

  @Test
  public void testUpdateGatewayVirtualConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
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
    Response<GatewayVirtualConnection> response = directLinkService.updateGatewayVirtualConnection(updateGatewayVirtualConnectionOptionsModel).execute();
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayVirtualConnectionPath);
  }
  
  public void testUpdateGatewayVirtualConnectionWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateGatewayVirtualConnectionWOptions.
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayVirtualConnectionWOptions();

    // Disable retries and run testUpdateGatewayVirtualConnectionWOptions.
    directLinkService.disableRetries();
    testUpdateGatewayVirtualConnectionWOptions();
  }  

  // Test the updateGatewayVirtualConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayVirtualConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    directLinkService.updateGatewayVirtualConnection(null).execute();
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
    directLinkService = null;
  }
}