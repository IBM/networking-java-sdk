/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependCollection;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependEntry;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependPrefixArrayTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentityHpcsAuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyReferenceHpcsAuthenticationKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyReferenceKeyProtectAuthenticationKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CrossConnectRouter;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ExportRouteFilterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientBGPASNUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate;
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
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItemCrossAccountGateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItemGateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsec;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakActiveDelta;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPatch;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPatch;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecStatusReason;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatistic;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatisticCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayBFDStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayBGPStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusGatewayLinkStatus;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusReason;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnectionCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnectionPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponse;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponseCrossAccountGateway;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponseGateway;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatisticsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatusOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetPortOptions;
import com.ibm.cloud.networking.direct_link.v1.model.HpcsKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.HpcsKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.ImportRouteFilterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayImportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayLetterOfAuthorizationOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ListGatewayMacsecCaksOptions;
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
import com.ibm.cloud.networking.direct_link.v1.model.PortsPager;
import com.ibm.cloud.networking.direct_link.v1.model.PortsPaginatedCollectionFirst;
import com.ibm.cloud.networking.direct_link.v1.model.PortsPaginatedCollectionNext;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayImportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.direct_link.v1.model.RouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReport;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportAdvertisedRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportConnection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOnPremRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteForConnection;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteForOthers;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportOverlappingRouteGroup;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportRoute;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportVirtualConnectionRoute;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekey;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPacketNumberRolloverMode;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPatch;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPatchSakRekeyPacketNumberRolloverModePatch;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPatchSakRekeyTimerModePatch;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyPacketNumberRolloverModePrototype;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyTimerMode;
import com.ibm.cloud.networking.direct_link.v1.model.SetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UnsetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateRouteFilterTemplate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
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
 * Unit test class for the DirectLink service.
 */
public class DirectLinkTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DirectLink directLinkService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String version = "testString";
    new DirectLink(version, serviceName, null);
  }


  // Test the getter for the version global parameter
  @Test
  public void testGetVersion() throws Throwable {
    assertEquals(directLinkService.getVersion(), "testString");
  }

  // Test the listGateways operation with a valid options model parameter
  @Test
  public void testListGatewaysWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"gateways\": [{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"bfd_config\": {\"bfd_status\": \"up\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_account\": false, \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"default_export_route_filter\": \"permit\", \"default_import_route_filter\": \"permit\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec\": {\"active\": true, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}]}, \"macsec_capability\": \"non_macsec\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"operational_status_reasons\": [{\"code\": \"authentication_key_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}]}";
    String listGatewaysPath = "/gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewaysOptions model
    ListGatewaysOptions listGatewaysOptionsModel = new ListGatewaysOptions();

    // Invoke listGateways() with a valid options model and verify the result
    Response<GatewayCollection> response = directLinkService.listGateways(listGatewaysOptionsModel).execute();
    assertNotNull(response);
    GatewayCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewaysPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGateways operation with and without retries enabled
  @Test
  public void testListGatewaysWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewaysWOptions();

    directLinkService.disableRetries();
    testListGatewaysWOptions();
  }

  // Test the createGateway operation with a valid options model parameter
  @Test
  public void testCreateGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"bfd_config\": {\"bfd_status\": \"up\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_account\": false, \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"default_export_route_filter\": \"permit\", \"default_import_route_filter\": \"permit\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec\": {\"active\": true, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}]}, \"macsec_capability\": \"non_macsec\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"operational_status_reasons\": [{\"code\": \"authentication_key_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayPath = "/gateways";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AsPrependTemplate model
    AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
      .length(Long.valueOf("4"))
      .policy("import")
      .prefix("172.17.0.0/16")
      .specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
      .build();

    // Construct an instance of the AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity model
    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayBfdConfigTemplate model
    GatewayBfdConfigTemplate gatewayBfdConfigTemplateModel = new GatewayBfdConfigTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();

    // Construct an instance of the GatewayTemplateRouteFilter model
    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();

    // Construct an instance of the ResourceGroupIdentity model
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();

    // Construct an instance of the HpcsKeyIdentity model
    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayMacsecCakPrototype model
    GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .session("primary")
      .build();

    // Construct an instance of the SakRekeyPrototypeSakRekeyTimerModePrototype model
    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();

    // Construct an instance of the GatewayMacsecPrototype model
    GatewayMacsecPrototype gatewayMacsecPrototypeModel = new GatewayMacsecPrototype.Builder()
      .active(true)
      .caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
      .sakRekey(sakRekeyPrototypeModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();

    // Construct an instance of the GatewayTemplateGatewayTypeDedicatedTemplate model
    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
      .asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
      .authenticationKey(authenticationKeyIdentityModel)
      .bfdConfig(gatewayBfdConfigTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpBaseCidr("testString")
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .global(true)
      .importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
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
      .macsec(gatewayMacsecPrototypeModel)
      .macsecCapability("non_macsec")
      .vlan(Long.valueOf("10"))
      .build();

    // Construct an instance of the CreateGatewayOptions model
    CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder()
      .gatewayTemplate(gatewayTemplateModel)
      .build();

    // Invoke createGateway() with a valid options model and verify the result
    Response<Gateway> response = directLinkService.createGateway(createGatewayOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGateway operation with and without retries enabled
  @Test
  public void testCreateGatewayWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayWOptions();

    directLinkService.disableRetries();
    testCreateGatewayWOptions();
  }

  // Test the createGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGateway(null).execute();
  }

  // Test the deleteGateway operation with a valid options model parameter
  @Test
  public void testDeleteGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayOptions model
    DeleteGatewayOptions deleteGatewayOptionsModel = new DeleteGatewayOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke deleteGateway() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGateway(deleteGatewayOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGateway operation with and without retries enabled
  @Test
  public void testDeleteGatewayWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayWOptions();
  }

  // Test the deleteGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGateway(null).execute();
  }

  // Test the getGateway operation with a valid options model parameter
  @Test
  public void testGetGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"bfd_config\": {\"bfd_status\": \"up\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_account\": false, \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"default_export_route_filter\": \"permit\", \"default_import_route_filter\": \"permit\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec\": {\"active\": true, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}]}, \"macsec_capability\": \"non_macsec\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"operational_status_reasons\": [{\"code\": \"authentication_key_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String getGatewayPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayOptions model
    GetGatewayOptions getGatewayOptionsModel = new GetGatewayOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGateway() with a valid options model and verify the result
    Response<GetGatewayResponse> response = directLinkService.getGateway(getGatewayOptionsModel).execute();
    assertNotNull(response);
    GetGatewayResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGateway operation with and without retries enabled
  @Test
  public void testGetGatewayWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayWOptions();

    directLinkService.disableRetries();
    testGetGatewayWOptions();
  }

  // Test the getGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGateway(null).execute();
  }

  // Test the updateGateway operation with a valid options model parameter
  @Test
  public void testUpdateGatewayWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"bfd_config\": {\"bfd_status\": \"up\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_account\": false, \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"default_export_route_filter\": \"permit\", \"default_import_route_filter\": \"permit\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec\": {\"active\": true, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}]}, \"macsec_capability\": \"non_macsec\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"operational_status_reasons\": [{\"code\": \"authentication_key_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String updateGatewayPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity model
    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayBfdPatchTemplate model
    GatewayBfdPatchTemplate gatewayBfdPatchTemplateModel = new GatewayBfdPatchTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();

    // Construct an instance of the GatewayPatchTemplate model
    GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
      .authenticationKey(authenticationKeyIdentityModel)
      .bfdConfig(gatewayBfdPatchTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .global(true)
      .loaRejectReason("The port mentioned was incorrect")
      .metered(false)
      .name("testGateway")
      .operationalStatus("loa_accepted")
      .patchPanelCompletionNotice("patch panel configuration details")
      .speedMbps(Long.valueOf("1000"))
      .vlan(Long.valueOf("10"))
      .build();
    Map<String, Object> gatewayPatchTemplateModelAsPatch = gatewayPatchTemplateModel.asPatch();

    // Construct an instance of the UpdateGatewayOptions model
    UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .gatewayPatchTemplatePatch(gatewayPatchTemplateModelAsPatch)
      .build();

    // Invoke updateGateway() with a valid options model and verify the result
    Response<Gateway> response = directLinkService.updateGateway(updateGatewayOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGateway operation with and without retries enabled
  @Test
  public void testUpdateGatewayWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayWOptions();
  }

  // Test the updateGateway operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGateway(null).execute();
  }

  // Test the createGatewayAction operation with a valid options model parameter
  @Test
  public void testCreateGatewayActionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"prefix\": \"172.17.0.0/16\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"authentication_key\": {\"crn\": \"crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"bfd_config\": {\"bfd_status\": \"up\", \"bfd_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"interval\": 2000, \"multiplier\": 10}, \"bgp_asn\": 64999, \"bgp_base_cidr\": \"bgpBaseCidr\", \"bgp_cer_cidr\": \"10.254.30.78/30\", \"bgp_ibm_asn\": 13884, \"bgp_ibm_cidr\": \"10.254.30.77/30\", \"bgp_status\": \"active\", \"bgp_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"carrier_name\": \"myCarrierName\", \"change_request\": {\"type\": \"create_gateway\"}, \"completion_notice_reject_reason\": \"The completion notice file was blank\", \"connection_mode\": \"transit\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"crn\": \"crn:v1:bluemix:public:directlink:dal03:a/4111d05f36894e3cb9b46a43556d9000::dedicated:ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"cross_account\": false, \"cross_connect_router\": \"xcr01.dal03\", \"customer_name\": \"newCustomerName\", \"default_export_route_filter\": \"permit\", \"default_import_route_filter\": \"permit\", \"global\": true, \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"link_status\": \"up\", \"link_status_updated_at\": \"2020-08-20T06:58:41.909Z\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"macsec\": {\"active\": true, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}]}, \"macsec_capability\": \"non_macsec\", \"metered\": false, \"name\": \"myGateway\", \"operational_status\": \"awaiting_completion_notice\", \"operational_status_reasons\": [{\"code\": \"authentication_key_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"patch_panel_completion_notice\": \"patch panel configuration details\", \"port\": {\"id\": \"54321b1a-fee4-41c7-9e11-9cd99e000aaa\"}, \"provider_api_managed\": false, \"resource_group\": {\"id\": \"56969d6043e9465c883cb9f7363e78e8\"}, \"speed_mbps\": 1000, \"type\": \"dedicated\", \"vlan\": 10}";
    String createGatewayActionPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/actions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AsPrependTemplate model
    AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
      .length(Long.valueOf("4"))
      .policy("import")
      .prefix("172.17.0.0/16")
      .specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
      .build();

    // Construct an instance of the AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity model
    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayBfdConfigActionTemplate model
    GatewayBfdConfigActionTemplate gatewayBfdConfigActionTemplateModel = new GatewayBfdConfigActionTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();

    // Construct an instance of the GatewayTemplateRouteFilter model
    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
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
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .action("create_gateway_approve")
      .asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
      .authenticationKey(authenticationKeyIdentityModel)
      .bfdConfig(gatewayBfdConfigActionTemplateModel)
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .global(true)
      .importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .metered(false)
      .resourceGroup(resourceGroupIdentityModel)
      .updates(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel))
      .build();

    // Invoke createGatewayAction() with a valid options model and verify the result
    Response<Gateway> response = directLinkService.createGatewayAction(createGatewayActionOptionsModel).execute();
    assertNotNull(response);
    Gateway responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayActionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayAction operation with and without retries enabled
  @Test
  public void testCreateGatewayActionWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayActionWOptions();

    directLinkService.disableRetries();
    testCreateGatewayActionWOptions();
  }

  // Test the createGatewayAction operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayAction(null).execute();
  }

  // Test the listGatewayCompletionNotice operation with a valid options model parameter
  @Test
  public void testListGatewayCompletionNoticeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String listGatewayCompletionNoticePath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/completion_notice";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/pdf")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayCompletionNoticeOptions model
    ListGatewayCompletionNoticeOptions listGatewayCompletionNoticeOptionsModel = new ListGatewayCompletionNoticeOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayCompletionNotice() with a valid options model and verify the result
    Response<InputStream> response = directLinkService.listGatewayCompletionNotice(listGatewayCompletionNoticeOptionsModel).execute();
    assertNotNull(response);
    try (InputStream responseObj = response.getResult();) {
      assertNotNull(responseObj);
    }

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayCompletionNoticePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayCompletionNotice operation with and without retries enabled
  @Test
  public void testListGatewayCompletionNoticeWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayCompletionNoticeWOptions();

    directLinkService.disableRetries();
    testListGatewayCompletionNoticeWOptions();
  }

  // Test the listGatewayCompletionNotice operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayCompletionNoticeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayCompletionNotice(null).execute();
  }

  // Test the createGatewayCompletionNotice operation with a valid options model parameter
  @Test
  public void testCreateGatewayCompletionNoticeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String createGatewayCompletionNoticePath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/completion_notice";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateGatewayCompletionNoticeOptions model
    CreateGatewayCompletionNoticeOptions createGatewayCompletionNoticeOptionsModel = new CreateGatewayCompletionNoticeOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .upload(TestUtilities.createMockStream("This is a mock file."))
      .uploadContentType("testString")
      .build();

    // Invoke createGatewayCompletionNotice() with a valid options model and verify the result
    Response<Void> response = directLinkService.createGatewayCompletionNotice(createGatewayCompletionNoticeOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayCompletionNoticePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayCompletionNotice operation with and without retries enabled
  @Test
  public void testCreateGatewayCompletionNoticeWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayCompletionNoticeWOptions();

    directLinkService.disableRetries();
    testCreateGatewayCompletionNoticeWOptions();
  }

  // Test the createGatewayCompletionNotice operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayCompletionNoticeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayCompletionNotice(null).execute();
  }

  // Test the listGatewayLetterOfAuthorization operation with a valid options model parameter
  @Test
  public void testListGatewayLetterOfAuthorizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String listGatewayLetterOfAuthorizationPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/letter_of_authorization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/pdf")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayLetterOfAuthorizationOptions model
    ListGatewayLetterOfAuthorizationOptions listGatewayLetterOfAuthorizationOptionsModel = new ListGatewayLetterOfAuthorizationOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayLetterOfAuthorization() with a valid options model and verify the result
    Response<InputStream> response = directLinkService.listGatewayLetterOfAuthorization(listGatewayLetterOfAuthorizationOptionsModel).execute();
    assertNotNull(response);
    try (InputStream responseObj = response.getResult();) {
      assertNotNull(responseObj);
    }

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayLetterOfAuthorizationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayLetterOfAuthorization operation with and without retries enabled
  @Test
  public void testListGatewayLetterOfAuthorizationWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayLetterOfAuthorizationWOptions();

    directLinkService.disableRetries();
    testListGatewayLetterOfAuthorizationWOptions();
  }

  // Test the listGatewayLetterOfAuthorization operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayLetterOfAuthorizationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayLetterOfAuthorization(null).execute();
  }

  // Test the getGatewayStatistics operation with a valid options model parameter
  @Test
  public void testGetGatewayStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"statistics\": [{\"created_at\": \"2020-08-20T06:58:41.909Z\", \"data\": \"MKA statistics text...\", \"type\": \"macsec_policy\"}]}";
    String getGatewayStatisticsPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayStatisticsOptions model
    GetGatewayStatisticsOptions getGatewayStatisticsOptionsModel = new GetGatewayStatisticsOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .type("macsec_mka_session")
      .build();

    // Invoke getGatewayStatistics() with a valid options model and verify the result
    Response<GatewayStatisticCollection> response = directLinkService.getGatewayStatistics(getGatewayStatisticsOptionsModel).execute();
    assertNotNull(response);
    GatewayStatisticCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("type"), "macsec_mka_session");
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayStatistics operation with and without retries enabled
  @Test
  public void testGetGatewayStatisticsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayStatisticsWOptions();

    directLinkService.disableRetries();
    testGetGatewayStatisticsWOptions();
  }

  // Test the getGatewayStatistics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayStatisticsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayStatistics(null).execute();
  }

  // Test the getGatewayStatus operation with a valid options model parameter
  @Test
  public void testGetGatewayStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": [{\"type\": \"bgp\", \"updated_at\": \"2020-08-20T06:58:41.909Z\", \"value\": \"active\"}]}";
    String getGatewayStatusPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/status";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayStatusOptions model
    GetGatewayStatusOptions getGatewayStatusOptionsModel = new GetGatewayStatusOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .type("bgp")
      .build();

    // Invoke getGatewayStatus() with a valid options model and verify the result
    Response<GatewayStatusCollection> response = directLinkService.getGatewayStatus(getGatewayStatusOptionsModel).execute();
    assertNotNull(response);
    GatewayStatusCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayStatusPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("type"), "bgp");
  }

  // Test the getGatewayStatus operation with and without retries enabled
  @Test
  public void testGetGatewayStatusWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayStatusWOptions();

    directLinkService.disableRetries();
    testGetGatewayStatusWOptions();
  }

  // Test the getGatewayStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayStatus(null).execute();
  }

  // Test the listGatewayAsPrepends operation with a valid options model parameter
  @Test
  public void testListGatewayAsPrependsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listGatewayAsPrependsPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/as_prepends";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayAsPrependsOptions model
    ListGatewayAsPrependsOptions listGatewayAsPrependsOptionsModel = new ListGatewayAsPrependsOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayAsPrepends() with a valid options model and verify the result
    Response<AsPrependCollection> response = directLinkService.listGatewayAsPrepends(listGatewayAsPrependsOptionsModel).execute();
    assertNotNull(response);
    AsPrependCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayAsPrependsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayAsPrepends operation with and without retries enabled
  @Test
  public void testListGatewayAsPrependsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayAsPrependsWOptions();

    directLinkService.disableRetries();
    testListGatewayAsPrependsWOptions();
  }

  // Test the listGatewayAsPrepends operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayAsPrependsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayAsPrepends(null).execute();
  }

  // Test the replaceGatewayAsPrepends operation with a valid options model parameter
  @Test
  public void testReplaceGatewayAsPrependsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"as_prepends\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"length\": 4, \"policy\": \"import\", \"specific_prefixes\": [\"192.168.3.0/24\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String replaceGatewayAsPrependsPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/as_prepends";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AsPrependPrefixArrayTemplate model
    AsPrependPrefixArrayTemplate asPrependPrefixArrayTemplateModel = new AsPrependPrefixArrayTemplate.Builder()
      .length(Long.valueOf("4"))
      .policy("import")
      .specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
      .build();

    // Construct an instance of the ReplaceGatewayAsPrependsOptions model
    ReplaceGatewayAsPrependsOptions replaceGatewayAsPrependsOptionsModel = new ReplaceGatewayAsPrependsOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .asPrepends(java.util.Arrays.asList(asPrependPrefixArrayTemplateModel))
      .build();

    // Invoke replaceGatewayAsPrepends() with a valid options model and verify the result
    Response<AsPrependCollection> response = directLinkService.replaceGatewayAsPrepends(replaceGatewayAsPrependsOptionsModel).execute();
    assertNotNull(response);
    AsPrependCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceGatewayAsPrependsPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the replaceGatewayAsPrepends operation with and without retries enabled
  @Test
  public void testReplaceGatewayAsPrependsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testReplaceGatewayAsPrependsWOptions();

    directLinkService.disableRetries();
    testReplaceGatewayAsPrependsWOptions();
  }

  // Test the replaceGatewayAsPrepends operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceGatewayAsPrependsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.replaceGatewayAsPrepends(null).execute();
  }

  // Test the listGatewayExportRouteFilters operation with a valid options model parameter
  @Test
  public void testListGatewayExportRouteFiltersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"export_route_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}]}";
    String listGatewayExportRouteFiltersPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayExportRouteFiltersOptions model
    ListGatewayExportRouteFiltersOptions listGatewayExportRouteFiltersOptionsModel = new ListGatewayExportRouteFiltersOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayExportRouteFilters() with a valid options model and verify the result
    Response<ExportRouteFilterCollection> response = directLinkService.listGatewayExportRouteFilters(listGatewayExportRouteFiltersOptionsModel).execute();
    assertNotNull(response);
    ExportRouteFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayExportRouteFiltersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayExportRouteFilters operation with and without retries enabled
  @Test
  public void testListGatewayExportRouteFiltersWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayExportRouteFiltersWOptions();

    directLinkService.disableRetries();
    testListGatewayExportRouteFiltersWOptions();
  }

  // Test the listGatewayExportRouteFilters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayExportRouteFiltersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayExportRouteFilters(null).execute();
  }

  // Test the createGatewayExportRouteFilter operation with a valid options model parameter
  @Test
  public void testCreateGatewayExportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String createGatewayExportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateGatewayExportRouteFilterOptions model
    CreateGatewayExportRouteFilterOptions createGatewayExportRouteFilterOptionsModel = new CreateGatewayExportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .action("permit")
      .prefix("192.168.100.0/24")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .build();

    // Invoke createGatewayExportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.createGatewayExportRouteFilter(createGatewayExportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayExportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayExportRouteFilter operation with and without retries enabled
  @Test
  public void testCreateGatewayExportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayExportRouteFilterWOptions();

    directLinkService.disableRetries();
    testCreateGatewayExportRouteFilterWOptions();
  }

  // Test the createGatewayExportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayExportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayExportRouteFilter(null).execute();
  }

  // Test the replaceGatewayExportRouteFilters operation with a valid options model parameter
  @Test
  public void testReplaceGatewayExportRouteFiltersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"export_route_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}]}";
    String replaceGatewayExportRouteFiltersPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the GatewayTemplateRouteFilter model
    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();

    // Construct an instance of the ReplaceGatewayExportRouteFiltersOptions model
    ReplaceGatewayExportRouteFiltersOptions replaceGatewayExportRouteFiltersOptionsModel = new ReplaceGatewayExportRouteFiltersOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .build();

    // Invoke replaceGatewayExportRouteFilters() with a valid options model and verify the result
    Response<ExportRouteFilterCollection> response = directLinkService.replaceGatewayExportRouteFilters(replaceGatewayExportRouteFiltersOptionsModel).execute();
    assertNotNull(response);
    ExportRouteFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceGatewayExportRouteFiltersPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the replaceGatewayExportRouteFilters operation with and without retries enabled
  @Test
  public void testReplaceGatewayExportRouteFiltersWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testReplaceGatewayExportRouteFiltersWOptions();

    directLinkService.disableRetries();
    testReplaceGatewayExportRouteFiltersWOptions();
  }

  // Test the replaceGatewayExportRouteFilters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceGatewayExportRouteFiltersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.replaceGatewayExportRouteFilters(null).execute();
  }

  // Test the deleteGatewayExportRouteFilter operation with a valid options model parameter
  @Test
  public void testDeleteGatewayExportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayExportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayExportRouteFilterOptions model
    DeleteGatewayExportRouteFilterOptions deleteGatewayExportRouteFilterOptionsModel = new DeleteGatewayExportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke deleteGatewayExportRouteFilter() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGatewayExportRouteFilter(deleteGatewayExportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayExportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGatewayExportRouteFilter operation with and without retries enabled
  @Test
  public void testDeleteGatewayExportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayExportRouteFilterWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayExportRouteFilterWOptions();
  }

  // Test the deleteGatewayExportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayExportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGatewayExportRouteFilter(null).execute();
  }

  // Test the getGatewayExportRouteFilter operation with a valid options model parameter
  @Test
  public void testGetGatewayExportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String getGatewayExportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayExportRouteFilterOptions model
    GetGatewayExportRouteFilterOptions getGatewayExportRouteFilterOptionsModel = new GetGatewayExportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGatewayExportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.getGatewayExportRouteFilter(getGatewayExportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayExportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayExportRouteFilter operation with and without retries enabled
  @Test
  public void testGetGatewayExportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayExportRouteFilterWOptions();

    directLinkService.disableRetries();
    testGetGatewayExportRouteFilterWOptions();
  }

  // Test the getGatewayExportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayExportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayExportRouteFilter(null).execute();
  }

  // Test the updateGatewayExportRouteFilter operation with a valid options model parameter
  @Test
  public void testUpdateGatewayExportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String updateGatewayExportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/export_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateRouteFilterTemplate model
    UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
      .action("permit")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();
    Map<String, Object> updateRouteFilterTemplateModelAsPatch = updateRouteFilterTemplateModel.asPatch();

    // Construct an instance of the UpdateGatewayExportRouteFilterOptions model
    UpdateGatewayExportRouteFilterOptions updateGatewayExportRouteFilterOptionsModel = new UpdateGatewayExportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .updateRouteFilterTemplatePatch(updateRouteFilterTemplateModelAsPatch)
      .build();

    // Invoke updateGatewayExportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.updateGatewayExportRouteFilter(updateGatewayExportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayExportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGatewayExportRouteFilter operation with and without retries enabled
  @Test
  public void testUpdateGatewayExportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayExportRouteFilterWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayExportRouteFilterWOptions();
  }

  // Test the updateGatewayExportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayExportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGatewayExportRouteFilter(null).execute();
  }

  // Test the listGatewayImportRouteFilters operation with a valid options model parameter
  @Test
  public void testListGatewayImportRouteFiltersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"import_route_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}]}";
    String listGatewayImportRouteFiltersPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayImportRouteFiltersOptions model
    ListGatewayImportRouteFiltersOptions listGatewayImportRouteFiltersOptionsModel = new ListGatewayImportRouteFiltersOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayImportRouteFilters() with a valid options model and verify the result
    Response<ImportRouteFilterCollection> response = directLinkService.listGatewayImportRouteFilters(listGatewayImportRouteFiltersOptionsModel).execute();
    assertNotNull(response);
    ImportRouteFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayImportRouteFiltersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayImportRouteFilters operation with and without retries enabled
  @Test
  public void testListGatewayImportRouteFiltersWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayImportRouteFiltersWOptions();

    directLinkService.disableRetries();
    testListGatewayImportRouteFiltersWOptions();
  }

  // Test the listGatewayImportRouteFilters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayImportRouteFiltersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayImportRouteFilters(null).execute();
  }

  // Test the createGatewayImportRouteFilter operation with a valid options model parameter
  @Test
  public void testCreateGatewayImportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String createGatewayImportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateGatewayImportRouteFilterOptions model
    CreateGatewayImportRouteFilterOptions createGatewayImportRouteFilterOptionsModel = new CreateGatewayImportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .action("permit")
      .prefix("192.168.100.0/24")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .build();

    // Invoke createGatewayImportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.createGatewayImportRouteFilter(createGatewayImportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayImportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayImportRouteFilter operation with and without retries enabled
  @Test
  public void testCreateGatewayImportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayImportRouteFilterWOptions();

    directLinkService.disableRetries();
    testCreateGatewayImportRouteFilterWOptions();
  }

  // Test the createGatewayImportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayImportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayImportRouteFilter(null).execute();
  }

  // Test the replaceGatewayImportRouteFilters operation with a valid options model parameter
  @Test
  public void testReplaceGatewayImportRouteFiltersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"import_route_filters\": [{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}]}";
    String replaceGatewayImportRouteFiltersPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the GatewayTemplateRouteFilter model
    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();

    // Construct an instance of the ReplaceGatewayImportRouteFiltersOptions model
    ReplaceGatewayImportRouteFiltersOptions replaceGatewayImportRouteFiltersOptionsModel = new ReplaceGatewayImportRouteFiltersOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .build();

    // Invoke replaceGatewayImportRouteFilters() with a valid options model and verify the result
    Response<ImportRouteFilterCollection> response = directLinkService.replaceGatewayImportRouteFilters(replaceGatewayImportRouteFiltersOptionsModel).execute();
    assertNotNull(response);
    ImportRouteFilterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceGatewayImportRouteFiltersPath);
    // Verify header parameters
    assertEquals(request.getHeader("If-Match"), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the replaceGatewayImportRouteFilters operation with and without retries enabled
  @Test
  public void testReplaceGatewayImportRouteFiltersWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testReplaceGatewayImportRouteFiltersWOptions();

    directLinkService.disableRetries();
    testReplaceGatewayImportRouteFiltersWOptions();
  }

  // Test the replaceGatewayImportRouteFilters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceGatewayImportRouteFiltersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.replaceGatewayImportRouteFilters(null).execute();
  }

  // Test the deleteGatewayImportRouteFilter operation with a valid options model parameter
  @Test
  public void testDeleteGatewayImportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayImportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayImportRouteFilterOptions model
    DeleteGatewayImportRouteFilterOptions deleteGatewayImportRouteFilterOptionsModel = new DeleteGatewayImportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke deleteGatewayImportRouteFilter() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGatewayImportRouteFilter(deleteGatewayImportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayImportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGatewayImportRouteFilter operation with and without retries enabled
  @Test
  public void testDeleteGatewayImportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayImportRouteFilterWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayImportRouteFilterWOptions();
  }

  // Test the deleteGatewayImportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayImportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGatewayImportRouteFilter(null).execute();
  }

  // Test the getGatewayImportRouteFilter operation with a valid options model parameter
  @Test
  public void testGetGatewayImportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String getGatewayImportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayImportRouteFilterOptions model
    GetGatewayImportRouteFilterOptions getGatewayImportRouteFilterOptionsModel = new GetGatewayImportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGatewayImportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.getGatewayImportRouteFilter(getGatewayImportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayImportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayImportRouteFilter operation with and without retries enabled
  @Test
  public void testGetGatewayImportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayImportRouteFilterWOptions();

    directLinkService.disableRetries();
    testGetGatewayImportRouteFilterWOptions();
  }

  // Test the getGatewayImportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayImportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayImportRouteFilter(null).execute();
  }

  // Test the updateGatewayImportRouteFilter operation with a valid options model parameter
  @Test
  public void testUpdateGatewayImportRouteFilterWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"action\": \"permit\", \"before\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"created_at\": \"2020-11-02T20:40:29.622Z\", \"ge\": 25, \"id\": \"1a15dcab-7e40-45e1-b7c5-bc690eaa9782\", \"le\": 30, \"prefix\": \"192.168.100.0/24\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String updateGatewayImportRouteFilterPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/import_route_filters/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateRouteFilterTemplate model
    UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
      .action("permit")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();
    Map<String, Object> updateRouteFilterTemplateModelAsPatch = updateRouteFilterTemplateModel.asPatch();

    // Construct an instance of the UpdateGatewayImportRouteFilterOptions model
    UpdateGatewayImportRouteFilterOptions updateGatewayImportRouteFilterOptionsModel = new UpdateGatewayImportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .updateRouteFilterTemplatePatch(updateRouteFilterTemplateModelAsPatch)
      .build();

    // Invoke updateGatewayImportRouteFilter() with a valid options model and verify the result
    Response<RouteFilter> response = directLinkService.updateGatewayImportRouteFilter(updateGatewayImportRouteFilterOptionsModel).execute();
    assertNotNull(response);
    RouteFilter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayImportRouteFilterPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGatewayImportRouteFilter operation with and without retries enabled
  @Test
  public void testUpdateGatewayImportRouteFilterWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayImportRouteFilterWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayImportRouteFilterWOptions();
  }

  // Test the updateGatewayImportRouteFilter operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayImportRouteFilterNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGatewayImportRouteFilter(null).execute();
  }

  // Test the unsetGatewayMacsec operation with a valid options model parameter
  @Test
  public void testUnsetGatewayMacsecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String unsetGatewayMacsecPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the UnsetGatewayMacsecOptions model
    UnsetGatewayMacsecOptions unsetGatewayMacsecOptionsModel = new UnsetGatewayMacsecOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke unsetGatewayMacsec() with a valid options model and verify the result
    Response<Void> response = directLinkService.unsetGatewayMacsec(unsetGatewayMacsecOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, unsetGatewayMacsecPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the unsetGatewayMacsec operation with and without retries enabled
  @Test
  public void testUnsetGatewayMacsecWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUnsetGatewayMacsecWOptions();

    directLinkService.disableRetries();
    testUnsetGatewayMacsecWOptions();
  }

  // Test the unsetGatewayMacsec operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUnsetGatewayMacsecNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.unsetGatewayMacsec(null).execute();
  }

  // Test the getGatewayMacsec operation with a valid options model parameter
  @Test
  public void testGetGatewayMacsecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active\": true, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"key_server_priority\": 255, \"sak_rekey\": {\"interval\": 3600, \"mode\": \"timer\"}, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"updated_at\": \"2020-11-02T20:40:29.622Z\", \"window_size\": 512}";
    String getGatewayMacsecPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayMacsecOptions model
    GetGatewayMacsecOptions getGatewayMacsecOptionsModel = new GetGatewayMacsecOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGatewayMacsec() with a valid options model and verify the result
    Response<GatewayMacsec> response = directLinkService.getGatewayMacsec(getGatewayMacsecOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsec responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayMacsecPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayMacsec operation with and without retries enabled
  @Test
  public void testGetGatewayMacsecWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayMacsecWOptions();

    directLinkService.disableRetries();
    testGetGatewayMacsecWOptions();
  }

  // Test the getGatewayMacsec operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayMacsecNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayMacsec(null).execute();
  }

  // Test the updateGatewayMacsec operation with a valid options model parameter
  @Test
  public void testUpdateGatewayMacsecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active\": true, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"key_server_priority\": 255, \"sak_rekey\": {\"interval\": 3600, \"mode\": \"timer\"}, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"updated_at\": \"2020-11-02T20:40:29.622Z\", \"window_size\": 512}";
    String updateGatewayMacsecPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SakRekeyPatchSakRekeyTimerModePatch model
    SakRekeyPatchSakRekeyTimerModePatch sakRekeyPatchModel = new SakRekeyPatchSakRekeyTimerModePatch.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();

    // Construct an instance of the GatewayMacsecPatch model
    GatewayMacsecPatch gatewayMacsecPatchModel = new GatewayMacsecPatch.Builder()
      .active(true)
      .sakRekey(sakRekeyPatchModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();
    Map<String, Object> gatewayMacsecPatchModelAsPatch = gatewayMacsecPatchModel.asPatch();

    // Construct an instance of the UpdateGatewayMacsecOptions model
    UpdateGatewayMacsecOptions updateGatewayMacsecOptionsModel = new UpdateGatewayMacsecOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .gatewayMacsecPatch(gatewayMacsecPatchModelAsPatch)
      .build();

    // Invoke updateGatewayMacsec() with a valid options model and verify the result
    Response<GatewayMacsec> response = directLinkService.updateGatewayMacsec(updateGatewayMacsecOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsec responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayMacsecPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGatewayMacsec operation with and without retries enabled
  @Test
  public void testUpdateGatewayMacsecWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayMacsecWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayMacsecWOptions();
  }

  // Test the updateGatewayMacsec operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayMacsecNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGatewayMacsec(null).execute();
  }

  // Test the setGatewayMacsec operation with a valid options model parameter
  @Test
  public void testSetGatewayMacsecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active\": true, \"cipher_suite\": \"gcm_aes_xpn_256\", \"confidentiality_offset\": 0, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"key_server_priority\": 255, \"sak_rekey\": {\"interval\": 3600, \"mode\": \"timer\"}, \"security_policy\": \"must_secure\", \"status\": \"secured\", \"status_reasons\": [{\"code\": \"macsec_cak_failed\", \"message\": \"The `authentication_key` failed configuration.\", \"more_info\": \"https://cloud.ibm.com/docs/dl/TODO_ADD_DOCS_LINK\"}], \"updated_at\": \"2020-11-02T20:40:29.622Z\", \"window_size\": 512}";
    String setGatewayMacsecPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HpcsKeyIdentity model
    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayMacsecCakPrototype model
    GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .session("primary")
      .build();

    // Construct an instance of the SakRekeyPrototypeSakRekeyTimerModePrototype model
    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();

    // Construct an instance of the SetGatewayMacsecOptions model
    SetGatewayMacsecOptions setGatewayMacsecOptionsModel = new SetGatewayMacsecOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .active(true)
      .caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
      .sakRekey(sakRekeyPrototypeModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();

    // Invoke setGatewayMacsec() with a valid options model and verify the result
    Response<GatewayMacsec> response = directLinkService.setGatewayMacsec(setGatewayMacsecOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsec responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, setGatewayMacsecPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the setGatewayMacsec operation with and without retries enabled
  @Test
  public void testSetGatewayMacsecWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testSetGatewayMacsecWOptions();

    directLinkService.disableRetries();
    testSetGatewayMacsecWOptions();
  }

  // Test the setGatewayMacsec operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSetGatewayMacsecNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.setGatewayMacsec(null).execute();
  }

  // Test the listGatewayMacsecCaks operation with a valid options model parameter
  @Test
  public void testListGatewayMacsecCaksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"caks\": [{\"active_delta\": {\"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"status\": \"active\"}, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"session\": \"primary\", \"status\": \"active\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}]}";
    String listGatewayMacsecCaksPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec/caks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayMacsecCaksOptions model
    ListGatewayMacsecCaksOptions listGatewayMacsecCaksOptionsModel = new ListGatewayMacsecCaksOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayMacsecCaks() with a valid options model and verify the result
    Response<GatewayMacsecCakCollection> response = directLinkService.listGatewayMacsecCaks(listGatewayMacsecCaksOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsecCakCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayMacsecCaksPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayMacsecCaks operation with and without retries enabled
  @Test
  public void testListGatewayMacsecCaksWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayMacsecCaksWOptions();

    directLinkService.disableRetries();
    testListGatewayMacsecCaksWOptions();
  }

  // Test the listGatewayMacsecCaks operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayMacsecCaksNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayMacsecCaks(null).execute();
  }

  // Test the createGatewayMacsecCak operation with a valid options model parameter
  @Test
  public void testCreateGatewayMacsecCakWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active_delta\": {\"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"status\": \"active\"}, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"session\": \"primary\", \"status\": \"active\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String createGatewayMacsecCakPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec/caks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the HpcsKeyIdentity model
    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the CreateGatewayMacsecCakOptions model
    CreateGatewayMacsecCakOptions createGatewayMacsecCakOptionsModel = new CreateGatewayMacsecCakOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .session("primary")
      .build();

    // Invoke createGatewayMacsecCak() with a valid options model and verify the result
    Response<GatewayMacsecCak> response = directLinkService.createGatewayMacsecCak(createGatewayMacsecCakOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsecCak responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayMacsecCakPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayMacsecCak operation with and without retries enabled
  @Test
  public void testCreateGatewayMacsecCakWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayMacsecCakWOptions();

    directLinkService.disableRetries();
    testCreateGatewayMacsecCakWOptions();
  }

  // Test the createGatewayMacsecCak operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayMacsecCakNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayMacsecCak(null).execute();
  }

  // Test the deleteGatewayMacsecCak operation with a valid options model parameter
  @Test
  public void testDeleteGatewayMacsecCakWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayMacsecCakPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec/caks/ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayMacsecCakOptions model
    DeleteGatewayMacsecCakOptions deleteGatewayMacsecCakOptionsModel = new DeleteGatewayMacsecCakOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .cakId("ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4")
      .build();

    // Invoke deleteGatewayMacsecCak() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGatewayMacsecCak(deleteGatewayMacsecCakOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayMacsecCakPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGatewayMacsecCak operation with and without retries enabled
  @Test
  public void testDeleteGatewayMacsecCakWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayMacsecCakWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayMacsecCakWOptions();
  }

  // Test the deleteGatewayMacsecCak operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayMacsecCakNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGatewayMacsecCak(null).execute();
  }

  // Test the getGatewayMacsecCak operation with a valid options model parameter
  @Test
  public void testGetGatewayMacsecCakWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active_delta\": {\"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"status\": \"active\"}, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"session\": \"primary\", \"status\": \"active\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String getGatewayMacsecCakPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec/caks/ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayMacsecCakOptions model
    GetGatewayMacsecCakOptions getGatewayMacsecCakOptionsModel = new GetGatewayMacsecCakOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .cakId("ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4")
      .build();

    // Invoke getGatewayMacsecCak() with a valid options model and verify the result
    Response<GatewayMacsecCak> response = directLinkService.getGatewayMacsecCak(getGatewayMacsecCakOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsecCak responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayMacsecCakPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayMacsecCak operation with and without retries enabled
  @Test
  public void testGetGatewayMacsecCakWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayMacsecCakWOptions();

    directLinkService.disableRetries();
    testGetGatewayMacsecCakWOptions();
  }

  // Test the getGatewayMacsecCak operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayMacsecCakNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayMacsecCak(null).execute();
  }

  // Test the updateGatewayMacsecCak operation with a valid options model parameter
  @Test
  public void testUpdateGatewayMacsecCakWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"active_delta\": {\"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"status\": \"active\"}, \"created_at\": \"2020-11-02T20:40:29.622Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"key\": {\"crn\": \"crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222\"}, \"name\": \"1000\", \"session\": \"primary\", \"status\": \"active\", \"updated_at\": \"2020-11-02T20:40:29.622Z\"}";
    String updateGatewayMacsecCakPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/macsec/caks/ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HpcsKeyIdentity model
    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    // Construct an instance of the GatewayMacsecCakPatch model
    GatewayMacsecCakPatch gatewayMacsecCakPatchModel = new GatewayMacsecCakPatch.Builder()
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .build();
    Map<String, Object> gatewayMacsecCakPatchModelAsPatch = gatewayMacsecCakPatchModel.asPatch();

    // Construct an instance of the UpdateGatewayMacsecCakOptions model
    UpdateGatewayMacsecCakOptions updateGatewayMacsecCakOptionsModel = new UpdateGatewayMacsecCakOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .cakId("ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4")
      .gatewayMacsecCakPatch(gatewayMacsecCakPatchModelAsPatch)
      .build();

    // Invoke updateGatewayMacsecCak() with a valid options model and verify the result
    Response<GatewayMacsecCak> response = directLinkService.updateGatewayMacsecCak(updateGatewayMacsecCakOptionsModel).execute();
    assertNotNull(response);
    GatewayMacsecCak responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayMacsecCakPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGatewayMacsecCak operation with and without retries enabled
  @Test
  public void testUpdateGatewayMacsecCakWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayMacsecCakWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayMacsecCakWOptions();
  }

  // Test the updateGatewayMacsecCak operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayMacsecCakNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGatewayMacsecCak(null).execute();
  }

  // Test the listGatewayRouteReports operation with a valid options model parameter
  @Test
  public void testListGatewayRouteReportsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"route_reports\": [{\"advertised_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"prefix\": \"172.17.0.0/16\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"active\": true, \"local_preference\": \"200\", \"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}]}";
    String listGatewayRouteReportsPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/route_reports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayRouteReportsOptions model
    ListGatewayRouteReportsOptions listGatewayRouteReportsOptionsModel = new ListGatewayRouteReportsOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayRouteReports() with a valid options model and verify the result
    Response<RouteReportCollection> response = directLinkService.listGatewayRouteReports(listGatewayRouteReportsOptionsModel).execute();
    assertNotNull(response);
    RouteReportCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayRouteReportsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayRouteReports operation with and without retries enabled
  @Test
  public void testListGatewayRouteReportsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayRouteReportsWOptions();

    directLinkService.disableRetries();
    testListGatewayRouteReportsWOptions();
  }

  // Test the listGatewayRouteReports operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayRouteReportsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayRouteReports(null).execute();
  }

  // Test the createGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testCreateGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"advertised_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"prefix\": \"172.17.0.0/16\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"active\": true, \"local_preference\": \"200\", \"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}";
    String createGatewayRouteReportPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/route_reports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateGatewayRouteReportOptions model
    CreateGatewayRouteReportOptions createGatewayRouteReportOptionsModel = new CreateGatewayRouteReportOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke createGatewayRouteReport() with a valid options model and verify the result
    Response<RouteReport> response = directLinkService.createGatewayRouteReport(createGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayRouteReport operation with and without retries enabled
  @Test
  public void testCreateGatewayRouteReportWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayRouteReportWOptions();

    directLinkService.disableRetries();
    testCreateGatewayRouteReportWOptions();
  }

  // Test the createGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayRouteReport(null).execute();
  }

  // Test the deleteGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testDeleteGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayRouteReportPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/route_reports/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayRouteReportOptions model
    DeleteGatewayRouteReportOptions deleteGatewayRouteReportOptionsModel = new DeleteGatewayRouteReportOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke deleteGatewayRouteReport() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGatewayRouteReport(deleteGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGatewayRouteReport operation with and without retries enabled
  @Test
  public void testDeleteGatewayRouteReportWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayRouteReportWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayRouteReportWOptions();
  }

  // Test the deleteGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGatewayRouteReport(null).execute();
  }

  // Test the getGatewayRouteReport operation with a valid options model parameter
  @Test
  public void testGetGatewayRouteReportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"advertised_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"prefix\": \"172.17.0.0/16\"}], \"created_at\": \"2019-01-01T12:00:00.000Z\", \"gateway_routes\": [{\"prefix\": \"172.17.0.0/16\"}], \"id\": \"1a15dcab-7e26-45e1-b7c5-bc690eaa9724\", \"on_prem_routes\": [{\"as_path\": \"64999 64999 64998 I\", \"next_hop\": \"172.17.0.0\", \"prefix\": \"172.17.0.0/16\"}], \"overlapping_routes\": [{\"routes\": [{\"prefix\": \"172.17.0.0/16\", \"type\": \"virtual_connection\", \"virtual_connection_id\": \"d2d985d8-1d8e-4e8b-96cd-cee2290ecaff\"}]}], \"status\": \"complete\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"virtual_connection_routes\": [{\"routes\": [{\"active\": true, \"local_preference\": \"200\", \"prefix\": \"172.17.0.0/16\"}], \"virtual_connection_id\": \"3c265a62-91da-4261-a950-950b6af0eb58\", \"virtual_connection_name\": \"vpc1\", \"virtual_connection_type\": \"vpc\"}]}";
    String getGatewayRouteReportPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/route_reports/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayRouteReportOptions model
    GetGatewayRouteReportOptions getGatewayRouteReportOptionsModel = new GetGatewayRouteReportOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGatewayRouteReport() with a valid options model and verify the result
    Response<RouteReport> response = directLinkService.getGatewayRouteReport(getGatewayRouteReportOptionsModel).execute();
    assertNotNull(response);
    RouteReport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayRouteReportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayRouteReport operation with and without retries enabled
  @Test
  public void testGetGatewayRouteReportWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayRouteReportWOptions();

    directLinkService.disableRetries();
    testGetGatewayRouteReportWOptions();
  }

  // Test the getGatewayRouteReport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayRouteReportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayRouteReport(null).execute();
  }

  // Test the listGatewayVirtualConnections operation with a valid options model parameter
  @Test
  public void testListGatewayVirtualConnectionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"virtual_connections\": [{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}]}";
    String listGatewayVirtualConnectionsPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/virtual_connections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListGatewayVirtualConnectionsOptions model
    ListGatewayVirtualConnectionsOptions listGatewayVirtualConnectionsOptionsModel = new ListGatewayVirtualConnectionsOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke listGatewayVirtualConnections() with a valid options model and verify the result
    Response<GatewayVirtualConnectionCollection> response = directLinkService.listGatewayVirtualConnections(listGatewayVirtualConnectionsOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnectionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listGatewayVirtualConnectionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listGatewayVirtualConnections operation with and without retries enabled
  @Test
  public void testListGatewayVirtualConnectionsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListGatewayVirtualConnectionsWOptions();

    directLinkService.disableRetries();
    testListGatewayVirtualConnectionsWOptions();
  }

  // Test the listGatewayVirtualConnections operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListGatewayVirtualConnectionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listGatewayVirtualConnections(null).execute();
  }

  // Test the createGatewayVirtualConnection operation with a valid options model parameter
  @Test
  public void testCreateGatewayVirtualConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String createGatewayVirtualConnectionPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/virtual_connections";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateGatewayVirtualConnectionOptions model
    CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptionsModel = new CreateGatewayVirtualConnectionOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .name("newVC")
      .type("vpc")
      .networkId("crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb")
      .build();

    // Invoke createGatewayVirtualConnection() with a valid options model and verify the result
    Response<GatewayVirtualConnection> response = directLinkService.createGatewayVirtualConnection(createGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGatewayVirtualConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the createGatewayVirtualConnection operation with and without retries enabled
  @Test
  public void testCreateGatewayVirtualConnectionWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testCreateGatewayVirtualConnectionWOptions();

    directLinkService.disableRetries();
    testCreateGatewayVirtualConnectionWOptions();
  }

  // Test the createGatewayVirtualConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayVirtualConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.createGatewayVirtualConnection(null).execute();
  }

  // Test the deleteGatewayVirtualConnection operation with a valid options model parameter
  @Test
  public void testDeleteGatewayVirtualConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteGatewayVirtualConnectionPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/virtual_connections/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteGatewayVirtualConnectionOptions model
    DeleteGatewayVirtualConnectionOptions deleteGatewayVirtualConnectionOptionsModel = new DeleteGatewayVirtualConnectionOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke deleteGatewayVirtualConnection() with a valid options model and verify the result
    Response<Void> response = directLinkService.deleteGatewayVirtualConnection(deleteGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteGatewayVirtualConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the deleteGatewayVirtualConnection operation with and without retries enabled
  @Test
  public void testDeleteGatewayVirtualConnectionWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testDeleteGatewayVirtualConnectionWOptions();

    directLinkService.disableRetries();
    testDeleteGatewayVirtualConnectionWOptions();
  }

  // Test the deleteGatewayVirtualConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteGatewayVirtualConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.deleteGatewayVirtualConnection(null).execute();
  }

  // Test the getGatewayVirtualConnection operation with a valid options model parameter
  @Test
  public void testGetGatewayVirtualConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String getGatewayVirtualConnectionPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/virtual_connections/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGatewayVirtualConnectionOptions model
    GetGatewayVirtualConnectionOptions getGatewayVirtualConnectionOptionsModel = new GetGatewayVirtualConnectionOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getGatewayVirtualConnection() with a valid options model and verify the result
    Response<GatewayVirtualConnection> response = directLinkService.getGatewayVirtualConnection(getGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGatewayVirtualConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getGatewayVirtualConnection operation with and without retries enabled
  @Test
  public void testGetGatewayVirtualConnectionWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetGatewayVirtualConnectionWOptions();

    directLinkService.disableRetries();
    testGetGatewayVirtualConnectionWOptions();
  }

  // Test the getGatewayVirtualConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayVirtualConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getGatewayVirtualConnection(null).execute();
  }

  // Test the updateGatewayVirtualConnection operation with a valid options model parameter
  @Test
  public void testUpdateGatewayVirtualConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"2019-01-01T12:00:00.000Z\", \"id\": \"ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4\", \"name\": \"newVC\", \"network_account\": \"00aa14a2e0fb102c8995ebefff865555\", \"network_id\": \"crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb\", \"status\": \"attached\", \"type\": \"vpc\"}";
    String updateGatewayVirtualConnectionPath = "/gateways/0a06fb9b-820f-4c44-8a31-77f1f0806d28/virtual_connections/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GatewayVirtualConnectionPatchTemplate model
    GatewayVirtualConnectionPatchTemplate gatewayVirtualConnectionPatchTemplateModel = new GatewayVirtualConnectionPatchTemplate.Builder()
      .name("newConnectionName")
      .status("attached")
      .build();
    Map<String, Object> gatewayVirtualConnectionPatchTemplateModelAsPatch = gatewayVirtualConnectionPatchTemplateModel.asPatch();

    // Construct an instance of the UpdateGatewayVirtualConnectionOptions model
    UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptionsModel = new UpdateGatewayVirtualConnectionOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .gatewayVirtualConnectionPatchTemplatePatch(gatewayVirtualConnectionPatchTemplateModelAsPatch)
      .build();

    // Invoke updateGatewayVirtualConnection() with a valid options model and verify the result
    Response<GatewayVirtualConnection> response = directLinkService.updateGatewayVirtualConnection(updateGatewayVirtualConnectionOptionsModel).execute();
    assertNotNull(response);
    GatewayVirtualConnection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateGatewayVirtualConnectionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the updateGatewayVirtualConnection operation with and without retries enabled
  @Test
  public void testUpdateGatewayVirtualConnectionWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testUpdateGatewayVirtualConnectionWOptions();

    directLinkService.disableRetries();
    testUpdateGatewayVirtualConnectionWOptions();
  }

  // Test the updateGatewayVirtualConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayVirtualConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.updateGatewayVirtualConnection(null).execute();
  }

  // Test the listOfferingTypeLocations operation with a valid options model parameter
  @Test
  public void testListOfferingTypeLocationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [{\"billing_location\": \"us\", \"building_colocation_owner\": \"MyProvider\", \"display_name\": \"Dallas 9\", \"location_type\": \"PoP\", \"macsec_enabled\": false, \"market\": \"Dallas\", \"market_geography\": \"N/S America\", \"mzr\": true, \"name\": \"dal03\", \"offering_type\": \"dedicated\", \"provision_enabled\": true, \"vpc_region\": \"us-south\"}]}";
    String listOfferingTypeLocationsPath = "/offering_types/dedicated/locations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListOfferingTypeLocationsOptions model
    ListOfferingTypeLocationsOptions listOfferingTypeLocationsOptionsModel = new ListOfferingTypeLocationsOptions.Builder()
      .offeringType("dedicated")
      .build();

    // Invoke listOfferingTypeLocations() with a valid options model and verify the result
    Response<LocationCollection> response = directLinkService.listOfferingTypeLocations(listOfferingTypeLocationsOptionsModel).execute();
    assertNotNull(response);
    LocationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeLocationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listOfferingTypeLocations operation with and without retries enabled
  @Test
  public void testListOfferingTypeLocationsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeLocationsWOptions();

    directLinkService.disableRetries();
    testListOfferingTypeLocationsWOptions();
  }

  // Test the listOfferingTypeLocations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listOfferingTypeLocations(null).execute();
  }

  // Test the listOfferingTypeLocationCrossConnectRouters operation with a valid options model parameter
  @Test
  public void testListOfferingTypeLocationCrossConnectRoutersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cross_connect_routers\": [{\"capabilities\": [\"capabilities\"], \"router_name\": \"xcr01.dal03\", \"total_connections\": 1}]}";
    String listOfferingTypeLocationCrossConnectRoutersPath = "/offering_types/dedicated/locations/testString/cross_connect_routers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListOfferingTypeLocationCrossConnectRoutersOptions model
    ListOfferingTypeLocationCrossConnectRoutersOptions listOfferingTypeLocationCrossConnectRoutersOptionsModel = new ListOfferingTypeLocationCrossConnectRoutersOptions.Builder()
      .offeringType("dedicated")
      .locationName("testString")
      .build();

    // Invoke listOfferingTypeLocationCrossConnectRouters() with a valid options model and verify the result
    Response<LocationCrossConnectRouterCollection> response = directLinkService.listOfferingTypeLocationCrossConnectRouters(listOfferingTypeLocationCrossConnectRoutersOptionsModel).execute();
    assertNotNull(response);
    LocationCrossConnectRouterCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeLocationCrossConnectRoutersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listOfferingTypeLocationCrossConnectRouters operation with and without retries enabled
  @Test
  public void testListOfferingTypeLocationCrossConnectRoutersWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeLocationCrossConnectRoutersWOptions();

    directLinkService.disableRetries();
    testListOfferingTypeLocationCrossConnectRoutersWOptions();
  }

  // Test the listOfferingTypeLocationCrossConnectRouters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeLocationCrossConnectRoutersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listOfferingTypeLocationCrossConnectRouters(null).execute();
  }

  // Test the listOfferingTypeSpeeds operation with a valid options model parameter
  @Test
  public void testListOfferingTypeSpeedsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"speeds\": [{\"capabilities\": [\"capabilities\"], \"link_speed\": 2000, \"macsec_enabled\": false}]}";
    String listOfferingTypeSpeedsPath = "/offering_types/dedicated/speeds";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListOfferingTypeSpeedsOptions model
    ListOfferingTypeSpeedsOptions listOfferingTypeSpeedsOptionsModel = new ListOfferingTypeSpeedsOptions.Builder()
      .offeringType("dedicated")
      .build();

    // Invoke listOfferingTypeSpeeds() with a valid options model and verify the result
    Response<OfferingSpeedCollection> response = directLinkService.listOfferingTypeSpeeds(listOfferingTypeSpeedsOptionsModel).execute();
    assertNotNull(response);
    OfferingSpeedCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOfferingTypeSpeedsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the listOfferingTypeSpeeds operation with and without retries enabled
  @Test
  public void testListOfferingTypeSpeedsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListOfferingTypeSpeedsWOptions();

    directLinkService.disableRetries();
    testListOfferingTypeSpeedsWOptions();
  }

  // Test the listOfferingTypeSpeeds operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListOfferingTypeSpeedsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.listOfferingTypeSpeeds(null).execute();
  }

  // Test the listPorts operation with a valid options model parameter
  @Test
  public void testListPortsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"first\": {\"href\": \"https://directlink.cloud.ibm.com/v1/ports?limit=100\"}, \"limit\": 100, \"next\": {\"href\": \"https://directlink.cloud.ibm.com/v1/ports?start=9d5a91a3e2cbd233b5a5b33436855ed1&limit=100\", \"start\": \"9d5a91a3e2cbd233b5a5b33436855ed1\"}, \"total_count\": 132, \"ports\": [{\"direct_link_count\": 1, \"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}]}";
    String listPortsPath = "/ports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPortsOptions model
    ListPortsOptions listPortsOptionsModel = new ListPortsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("10"))
      .locationName("testString")
      .build();

    // Invoke listPorts() with a valid options model and verify the result
    Response<PortCollection> response = directLinkService.listPorts(listPortsOptionsModel).execute();
    assertNotNull(response);
    PortCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPortsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("location_name"), "testString");
  }

  // Test the listPorts operation with and without retries enabled
  @Test
  public void testListPortsWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testListPortsWOptions();

    directLinkService.disableRetries();
    testListPortsWOptions();
  }

  // Test the listPorts operation using the PortsPager.getNext() method
  @Test
  public void testListPortsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"ports\":[{\"direct_link_count\":1,\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"ports\":[{\"direct_link_count\":1,\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
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

    ListPortsOptions listPortsOptions = new ListPortsOptions.Builder()
      .limit(Long.valueOf("10"))
      .locationName("testString")
      .build();

    List<Port> allResults = new ArrayList<>();
    PortsPager pager = new PortsPager(directLinkService, listPortsOptions);
    while (pager.hasNext()) {
      List<Port> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listPorts operation using the PortsPager.getAll() method
  @Test
  public void testListPortsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"ports\":[{\"direct_link_count\":1,\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"ports\":[{\"direct_link_count\":1,\"id\":\"01122b9b-820f-4c44-8a31-77f1f0806765\",\"label\":\"XCR-FRK-CS-SEC-01\",\"location_display_name\":\"Dallas 03\",\"location_name\":\"dal03\",\"provider_name\":\"provider_1\",\"supported_link_speeds\":[19]}]}";
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

    ListPortsOptions listPortsOptions = new ListPortsOptions.Builder()
      .limit(Long.valueOf("10"))
      .locationName("testString")
      .build();

    PortsPager pager = new PortsPager(directLinkService, listPortsOptions);
    List<Port> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getPort operation with a valid options model parameter
  @Test
  public void testGetPortWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"direct_link_count\": 1, \"id\": \"01122b9b-820f-4c44-8a31-77f1f0806765\", \"label\": \"XCR-FRK-CS-SEC-01\", \"location_display_name\": \"Dallas 03\", \"location_name\": \"dal03\", \"provider_name\": \"provider_1\", \"supported_link_speeds\": [19]}";
    String getPortPath = "/ports/0a06fb9b-820f-4c44-8a31-77f1f0806d28";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPortOptions model
    GetPortOptions getPortOptionsModel = new GetPortOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .build();

    // Invoke getPort() with a valid options model and verify the result
    Response<Port> response = directLinkService.getPort(getPortOptionsModel).execute();
    assertNotNull(response);
    Port responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPortPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("version"), "testString");
  }

  // Test the getPort operation with and without retries enabled
  @Test
  public void testGetPortWRetries() throws Throwable {
    directLinkService.enableRetries(4, 30);
    testGetPortWOptions();

    directLinkService.disableRetries();
    testGetPortWOptions();
  }

  // Test the getPort operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPortNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    directLinkService.getPort(null).execute();
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
    directLinkService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String version = "testString";

    directLinkService = DirectLink.newInstance(version, serviceName);
    String url = server.url("/").toString();
    directLinkService.setServiceUrl(url);
  }
}