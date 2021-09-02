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
package com.ibm.cloud.networking.zones_settings.v1;

import com.ibm.cloud.networking.zones_settings.v1.ZonesSettings;
import com.ibm.cloud.networking.zones_settings.v1.model.AlwaysUseHttpsResp;
import com.ibm.cloud.networking.zones_settings.v1.model.AlwaysUseHttpsRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.AutomaticHttpsRewritesResp;
import com.ibm.cloud.networking.zones_settings.v1.model.AutomaticHttpsRewritesRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.BrowserCheckResp;
import com.ibm.cloud.networking.zones_settings.v1.model.BrowserCheckRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ChallengeTtlResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ChallengeTtlRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.CiphersResp;
import com.ibm.cloud.networking.zones_settings.v1.model.CiphersRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.CnameFlatteningResponse;
import com.ibm.cloud.networking.zones_settings.v1.model.GetAlwaysUseHttpsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetAutomaticHttpsRewritesOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetBrowserCheckOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetChallengeTtlOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetCiphersOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetEnableErrorPagesOnOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHotlinkProtectionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHttp2Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHttp3Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetImageLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetImageSizeOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetIpGeolocationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetIpv6Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMaxUploadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMinTlsVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMinifyOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMobileRedirectOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetOpportunisticEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetPrefetchPreloadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetPseudoIpv4Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetResponseBufferingOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetScriptLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetSecurityHeaderOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetServerSideExcludeOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetTlsClientAuthOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetTrueClientIpOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetWebApplicationFirewallOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetWebSocketsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetZoneCnameFlatteningOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetZoneDnssecOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.HotlinkProtectionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.HotlinkProtectionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.Http2Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.Http2RespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.Http3Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.Http3RespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageLoadOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageLoadOptimizationRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageSizeOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageSizeOptimizationRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.IpGeolocationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.IpGeolocationRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.Ipv6Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.Ipv6RespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.MaxUploadResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MaxUploadRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.MinTlsVersionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MinTlsVersionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.MinifyResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MinifyRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.MinifyRespResultValue;
import com.ibm.cloud.networking.zones_settings.v1.model.MinifySettingValue;
import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirecSettingValue;
import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirectResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirectRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirectRespResultValue;
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticEncryptionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticEncryptionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginErrorPagePassThruResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginErrorPagePassThruRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.PrefetchPreloadResp;
import com.ibm.cloud.networking.zones_settings.v1.model.PrefetchPreloadRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4RespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ResponseBufferingResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ResponseBufferingRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ScriptLoadOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ScriptLoadOptimizationRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderResp;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderRespResultValue;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderRespResultValueStrictTransportSecurity;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderSettingValue;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderSettingValueStrictTransportSecurity;
import com.ibm.cloud.networking.zones_settings.v1.model.ServerSideExcludeResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ServerSideExcludeRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.TlsClientAuthResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TlsClientAuthRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.TrueClientIpResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TrueClientIpRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAlwaysUseHttpsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAutomaticHttpsRewritesOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateBrowserCheckOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateChallengeTtlOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateCiphersOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateEnableErrorPagesOnOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHotlinkProtectionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHttp2Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHttp3Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateImageLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateImageSizeOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateIpGeolocationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateIpv6Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMaxUploadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMinTlsVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMinifyOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMobileRedirectOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateOpportunisticEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdatePrefetchPreloadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdatePseudoIpv4Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateResponseBufferingOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateScriptLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateSecurityHeaderOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateServerSideExcludeOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateTlsClientAuthOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateTrueClientIpOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateWebApplicationFirewallOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateWebSocketsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateZoneCnameFlatteningOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateZoneDnssecOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.WafResp;
import com.ibm.cloud.networking.zones_settings.v1.model.WafRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.WebsocketsResp;
import com.ibm.cloud.networking.zones_settings.v1.model.WebsocketsRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ZonesCnameFlatteningResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ZonesDnssecResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ZonesDnssecRespResult;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ZonesSettings service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class ZonesSettingsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ZonesSettings zonesSettingsService;

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
    String crn = "testString";
    String zoneIdentifier = "testString";

    zonesSettingsService = ZonesSettings.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    zonesSettingsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    new ZonesSettings(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(zonesSettingsService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(zonesSettingsService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testGetZoneDnssecWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"status\": \"active\", \"flags\": 257, \"algorithm\": \"13\", \"key_type\": \"ECDSAP256SHA256\", \"digest_type\": \"2\", \"digest_algorithm\": \"SHA256\", \"digest\": \"48E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"ds\": \"example.com. 3600 IN DS 16953 13 2 248E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"key_tag\": 42, \"public_key\": \"oXiGYrSTO+LSCJ3mohc8EP+CzF9KxBj8/ydXJ22pKuZP3VAC3/Md/k7xZfz470CoRyZJ6gV6vml07IC3d8xqhA==\"}}";
    String getZoneDnssecPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dnssec", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetZoneDnssecOptions model
    GetZoneDnssecOptions getZoneDnssecOptionsModel = new GetZoneDnssecOptions();

    // Invoke operation with valid options model (positive test)
    Response<ZonesDnssecResp> response = zonesSettingsService.getZoneDnssec(getZoneDnssecOptionsModel).execute();
    assertNotNull(response);
    ZonesDnssecResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getZoneDnssecPath);
  }

  @Test
  public void testUpdateZoneDnssecWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"status\": \"active\", \"flags\": 257, \"algorithm\": \"13\", \"key_type\": \"ECDSAP256SHA256\", \"digest_type\": \"2\", \"digest_algorithm\": \"SHA256\", \"digest\": \"48E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"ds\": \"example.com. 3600 IN DS 16953 13 2 248E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"key_tag\": 42, \"public_key\": \"oXiGYrSTO+LSCJ3mohc8EP+CzF9KxBj8/ydXJ22pKuZP3VAC3/Md/k7xZfz470CoRyZJ6gV6vml07IC3d8xqhA==\"}}";
    String updateZoneDnssecPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dnssec", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateZoneDnssecOptions model
    UpdateZoneDnssecOptions updateZoneDnssecOptionsModel = new UpdateZoneDnssecOptions.Builder()
    .status("active")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZonesDnssecResp> response = zonesSettingsService.updateZoneDnssec(updateZoneDnssecOptionsModel).execute();
    assertNotNull(response);
    ZonesDnssecResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneDnssecPath);
  }

  @Test
  public void testGetZoneCnameFlatteningWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cname_flattening\", \"value\": \"flatten_all\", \"modified_on\": \"2019-01-01T12:00:00\", \"editable\": true}}";
    String getZoneCnameFlatteningPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/cname_flattening", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetZoneCnameFlatteningOptions model
    GetZoneCnameFlatteningOptions getZoneCnameFlatteningOptionsModel = new GetZoneCnameFlatteningOptions();

    // Invoke operation with valid options model (positive test)
    Response<ZonesCnameFlatteningResp> response = zonesSettingsService.getZoneCnameFlattening(getZoneCnameFlatteningOptionsModel).execute();
    assertNotNull(response);
    ZonesCnameFlatteningResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getZoneCnameFlatteningPath);
  }

  @Test
  public void testUpdateZoneCnameFlatteningWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cname_flattening\", \"value\": \"flatten_all\", \"modified_on\": \"2019-01-01T12:00:00\", \"editable\": true}}";
    String updateZoneCnameFlatteningPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/cname_flattening", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateZoneCnameFlatteningOptions model
    UpdateZoneCnameFlatteningOptions updateZoneCnameFlatteningOptionsModel = new UpdateZoneCnameFlatteningOptions.Builder()
    .value("flatten_all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZonesCnameFlatteningResp> response = zonesSettingsService.updateZoneCnameFlattening(updateZoneCnameFlatteningOptionsModel).execute();
    assertNotNull(response);
    ZonesCnameFlatteningResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneCnameFlatteningPath);
  }

  @Test
  public void testGetOpportunisticEncryptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_encryption\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getOpportunisticEncryptionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/opportunistic_encryption", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetOpportunisticEncryptionOptions model
    GetOpportunisticEncryptionOptions getOpportunisticEncryptionOptionsModel = new GetOpportunisticEncryptionOptions();

    // Invoke operation with valid options model (positive test)
    Response<OpportunisticEncryptionResp> response = zonesSettingsService.getOpportunisticEncryption(getOpportunisticEncryptionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticEncryptionResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getOpportunisticEncryptionPath);
  }

  @Test
  public void testUpdateOpportunisticEncryptionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_encryption\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateOpportunisticEncryptionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/opportunistic_encryption", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateOpportunisticEncryptionOptions model
    UpdateOpportunisticEncryptionOptions updateOpportunisticEncryptionOptionsModel = new UpdateOpportunisticEncryptionOptions.Builder()
    .value("false")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OpportunisticEncryptionResp> response = zonesSettingsService.updateOpportunisticEncryption(updateOpportunisticEncryptionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticEncryptionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOpportunisticEncryptionPath);
  }

  @Test
  public void testGetChallengeTtlWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"challenge_ttl\", \"value\": 1800, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getChallengeTtlPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/challenge_ttl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetChallengeTtlOptions model
    GetChallengeTtlOptions getChallengeTtlOptionsModel = new GetChallengeTtlOptions();

    // Invoke operation with valid options model (positive test)
    Response<ChallengeTtlResp> response = zonesSettingsService.getChallengeTtl(getChallengeTtlOptionsModel).execute();
    assertNotNull(response);
    ChallengeTtlResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getChallengeTtlPath);
  }

  @Test
  public void testUpdateChallengeTtlWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"challenge_ttl\", \"value\": 1800, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateChallengeTtlPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/challenge_ttl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateChallengeTtlOptions model
    UpdateChallengeTtlOptions updateChallengeTtlOptionsModel = new UpdateChallengeTtlOptions.Builder()
    .value(Long.valueOf("1800"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ChallengeTtlResp> response = zonesSettingsService.updateChallengeTtl(updateChallengeTtlOptionsModel).execute();
    assertNotNull(response);
    ChallengeTtlResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateChallengeTtlPath);
  }

  @Test
  public void testGetAutomaticHttpsRewritesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"automatic_https_rewrites\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getAutomaticHttpsRewritesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/automatic_https_rewrites", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAutomaticHttpsRewritesOptions model
    GetAutomaticHttpsRewritesOptions getAutomaticHttpsRewritesOptionsModel = new GetAutomaticHttpsRewritesOptions();

    // Invoke operation with valid options model (positive test)
    Response<AutomaticHttpsRewritesResp> response = zonesSettingsService.getAutomaticHttpsRewrites(getAutomaticHttpsRewritesOptionsModel).execute();
    assertNotNull(response);
    AutomaticHttpsRewritesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getAutomaticHttpsRewritesPath);
  }

  @Test
  public void testUpdateAutomaticHttpsRewritesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"automatic_https_rewrites\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateAutomaticHttpsRewritesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/automatic_https_rewrites", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateAutomaticHttpsRewritesOptions model
    UpdateAutomaticHttpsRewritesOptions updateAutomaticHttpsRewritesOptionsModel = new UpdateAutomaticHttpsRewritesOptions.Builder()
    .value("false")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AutomaticHttpsRewritesResp> response = zonesSettingsService.updateAutomaticHttpsRewrites(updateAutomaticHttpsRewritesOptionsModel).execute();
    assertNotNull(response);
    AutomaticHttpsRewritesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAutomaticHttpsRewritesPath);
  }

  @Test
  public void testGetTrueClientIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"true_client_ip_header\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getTrueClientIpPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/true_client_ip_header", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTrueClientIpOptions model
    GetTrueClientIpOptions getTrueClientIpOptionsModel = new GetTrueClientIpOptions();

    // Invoke operation with valid options model (positive test)
    Response<TrueClientIpResp> response = zonesSettingsService.getTrueClientIp(getTrueClientIpOptionsModel).execute();
    assertNotNull(response);
    TrueClientIpResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getTrueClientIpPath);
  }

  @Test
  public void testUpdateTrueClientIpWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"true_client_ip_header\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateTrueClientIpPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/true_client_ip_header", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateTrueClientIpOptions model
    UpdateTrueClientIpOptions updateTrueClientIpOptionsModel = new UpdateTrueClientIpOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TrueClientIpResp> response = zonesSettingsService.updateTrueClientIp(updateTrueClientIpOptionsModel).execute();
    assertNotNull(response);
    TrueClientIpResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTrueClientIpPath);
  }

  @Test
  public void testGetAlwaysUseHttpsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"always_use_https\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getAlwaysUseHttpsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/always_use_https", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAlwaysUseHttpsOptions model
    GetAlwaysUseHttpsOptions getAlwaysUseHttpsOptionsModel = new GetAlwaysUseHttpsOptions();

    // Invoke operation with valid options model (positive test)
    Response<AlwaysUseHttpsResp> response = zonesSettingsService.getAlwaysUseHttps(getAlwaysUseHttpsOptionsModel).execute();
    assertNotNull(response);
    AlwaysUseHttpsResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getAlwaysUseHttpsPath);
  }

  @Test
  public void testUpdateAlwaysUseHttpsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"always_use_https\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateAlwaysUseHttpsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/always_use_https", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateAlwaysUseHttpsOptions model
    UpdateAlwaysUseHttpsOptions updateAlwaysUseHttpsOptionsModel = new UpdateAlwaysUseHttpsOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AlwaysUseHttpsResp> response = zonesSettingsService.updateAlwaysUseHttps(updateAlwaysUseHttpsOptionsModel).execute();
    assertNotNull(response);
    AlwaysUseHttpsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAlwaysUseHttpsPath);
  }

  @Test
  public void testGetImageSizeOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"image_size_optimization\", \"value\": \"lossless\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getImageSizeOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/image_size_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetImageSizeOptimizationOptions model
    GetImageSizeOptimizationOptions getImageSizeOptimizationOptionsModel = new GetImageSizeOptimizationOptions();

    // Invoke operation with valid options model (positive test)
    Response<ImageSizeOptimizationResp> response = zonesSettingsService.getImageSizeOptimization(getImageSizeOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageSizeOptimizationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getImageSizeOptimizationPath);
  }

  @Test
  public void testUpdateImageSizeOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"image_size_optimization\", \"value\": \"lossless\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateImageSizeOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/image_size_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateImageSizeOptimizationOptions model
    UpdateImageSizeOptimizationOptions updateImageSizeOptimizationOptionsModel = new UpdateImageSizeOptimizationOptions.Builder()
    .value("lossless")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ImageSizeOptimizationResp> response = zonesSettingsService.updateImageSizeOptimization(updateImageSizeOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageSizeOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateImageSizeOptimizationPath);
  }

  @Test
  public void testGetScriptLoadOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"script_load_optimization\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getScriptLoadOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/script_load_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetScriptLoadOptimizationOptions model
    GetScriptLoadOptimizationOptions getScriptLoadOptimizationOptionsModel = new GetScriptLoadOptimizationOptions();

    // Invoke operation with valid options model (positive test)
    Response<ScriptLoadOptimizationResp> response = zonesSettingsService.getScriptLoadOptimization(getScriptLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ScriptLoadOptimizationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getScriptLoadOptimizationPath);
  }

  @Test
  public void testUpdateScriptLoadOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"script_load_optimization\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateScriptLoadOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/script_load_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateScriptLoadOptimizationOptions model
    UpdateScriptLoadOptimizationOptions updateScriptLoadOptimizationOptionsModel = new UpdateScriptLoadOptimizationOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ScriptLoadOptimizationResp> response = zonesSettingsService.updateScriptLoadOptimization(updateScriptLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ScriptLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateScriptLoadOptimizationPath);
  }

  @Test
  public void testGetImageLoadOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"image_load_optimization\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getImageLoadOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/image_load_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetImageLoadOptimizationOptions model
    GetImageLoadOptimizationOptions getImageLoadOptimizationOptionsModel = new GetImageLoadOptimizationOptions();

    // Invoke operation with valid options model (positive test)
    Response<ImageLoadOptimizationResp> response = zonesSettingsService.getImageLoadOptimization(getImageLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageLoadOptimizationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getImageLoadOptimizationPath);
  }

  @Test
  public void testUpdateImageLoadOptimizationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"image_load_optimization\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateImageLoadOptimizationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/image_load_optimization", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateImageLoadOptimizationOptions model
    UpdateImageLoadOptimizationOptions updateImageLoadOptimizationOptionsModel = new UpdateImageLoadOptimizationOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ImageLoadOptimizationResp> response = zonesSettingsService.updateImageLoadOptimization(updateImageLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateImageLoadOptimizationPath);
  }

  @Test
  public void testGetMinifyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"minify\", \"value\": {\"css\": \"true\", \"html\": \"true\", \"js\": \"true\"}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMinifyPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/minify", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMinifyOptions model
    GetMinifyOptions getMinifyOptionsModel = new GetMinifyOptions();

    // Invoke operation with valid options model (positive test)
    Response<MinifyResp> response = zonesSettingsService.getMinify(getMinifyOptionsModel).execute();
    assertNotNull(response);
    MinifyResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getMinifyPath);
  }

  @Test
  public void testUpdateMinifyWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"minify\", \"value\": {\"css\": \"true\", \"html\": \"true\", \"js\": \"true\"}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMinifyPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/minify", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MinifySettingValue model
    MinifySettingValue minifySettingValueModel = new MinifySettingValue.Builder()
    .css("false")
    .html("false")
    .js("false")
    .build();

    // Construct an instance of the UpdateMinifyOptions model
    UpdateMinifyOptions updateMinifyOptionsModel = new UpdateMinifyOptions.Builder()
    .value(minifySettingValueModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MinifyResp> response = zonesSettingsService.updateMinify(updateMinifyOptionsModel).execute();
    assertNotNull(response);
    MinifyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMinifyPath);
  }

  @Test
  public void testGetMinTlsVersionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"min_tls_version\", \"value\": \"1.2\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMinTlsVersionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/min_tls_version", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMinTlsVersionOptions model
    GetMinTlsVersionOptions getMinTlsVersionOptionsModel = new GetMinTlsVersionOptions();

    // Invoke operation with valid options model (positive test)
    Response<MinTlsVersionResp> response = zonesSettingsService.getMinTlsVersion(getMinTlsVersionOptionsModel).execute();
    assertNotNull(response);
    MinTlsVersionResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getMinTlsVersionPath);
  }

  @Test
  public void testUpdateMinTlsVersionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"min_tls_version\", \"value\": \"1.2\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMinTlsVersionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/min_tls_version", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateMinTlsVersionOptions model
    UpdateMinTlsVersionOptions updateMinTlsVersionOptionsModel = new UpdateMinTlsVersionOptions.Builder()
    .value("1.2")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MinTlsVersionResp> response = zonesSettingsService.updateMinTlsVersion(updateMinTlsVersionOptionsModel).execute();
    assertNotNull(response);
    MinTlsVersionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMinTlsVersionPath);
  }

  @Test
  public void testGetIpGeolocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ip_geolocation\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getIpGeolocationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ip_geolocation", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetIpGeolocationOptions model
    GetIpGeolocationOptions getIpGeolocationOptionsModel = new GetIpGeolocationOptions();

    // Invoke operation with valid options model (positive test)
    Response<IpGeolocationResp> response = zonesSettingsService.getIpGeolocation(getIpGeolocationOptionsModel).execute();
    assertNotNull(response);
    IpGeolocationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getIpGeolocationPath);
  }

  @Test
  public void testUpdateIpGeolocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ip_geolocation\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateIpGeolocationPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ip_geolocation", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateIpGeolocationOptions model
    UpdateIpGeolocationOptions updateIpGeolocationOptionsModel = new UpdateIpGeolocationOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<IpGeolocationResp> response = zonesSettingsService.updateIpGeolocation(updateIpGeolocationOptionsModel).execute();
    assertNotNull(response);
    IpGeolocationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIpGeolocationPath);
  }

  @Test
  public void testGetServerSideExcludeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"server_side_exclude\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getServerSideExcludePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/server_side_exclude", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetServerSideExcludeOptions model
    GetServerSideExcludeOptions getServerSideExcludeOptionsModel = new GetServerSideExcludeOptions();

    // Invoke operation with valid options model (positive test)
    Response<ServerSideExcludeResp> response = zonesSettingsService.getServerSideExclude(getServerSideExcludeOptionsModel).execute();
    assertNotNull(response);
    ServerSideExcludeResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getServerSideExcludePath);
  }

  @Test
  public void testUpdateServerSideExcludeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"server_side_exclude\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateServerSideExcludePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/server_side_exclude", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateServerSideExcludeOptions model
    UpdateServerSideExcludeOptions updateServerSideExcludeOptionsModel = new UpdateServerSideExcludeOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ServerSideExcludeResp> response = zonesSettingsService.updateServerSideExclude(updateServerSideExcludeOptionsModel).execute();
    assertNotNull(response);
    ServerSideExcludeResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateServerSideExcludePath);
  }

  @Test
  public void testGetSecurityHeaderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"security_header\", \"value\": {\"strict_transport_security\": {\"enabled\": true, \"max_age\": 86400, \"include_subdomains\": true, \"nosniff\": true}}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getSecurityHeaderPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/security_header", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecurityHeaderOptions model
    GetSecurityHeaderOptions getSecurityHeaderOptionsModel = new GetSecurityHeaderOptions();

    // Invoke operation with valid options model (positive test)
    Response<SecurityHeaderResp> response = zonesSettingsService.getSecurityHeader(getSecurityHeaderOptionsModel).execute();
    assertNotNull(response);
    SecurityHeaderResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getSecurityHeaderPath);
  }

  @Test
  public void testUpdateSecurityHeaderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"security_header\", \"value\": {\"strict_transport_security\": {\"enabled\": true, \"max_age\": 86400, \"include_subdomains\": true, \"nosniff\": true}}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateSecurityHeaderPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/security_header", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SecurityHeaderSettingValueStrictTransportSecurity model
    SecurityHeaderSettingValueStrictTransportSecurity securityHeaderSettingValueStrictTransportSecurityModel = new SecurityHeaderSettingValueStrictTransportSecurity.Builder()
    .enabled(true)
    .maxAge(Long.valueOf("86400"))
    .includeSubdomains(true)
    .nosniff(true)
    .build();

    // Construct an instance of the SecurityHeaderSettingValue model
    SecurityHeaderSettingValue securityHeaderSettingValueModel = new SecurityHeaderSettingValue.Builder()
    .strictTransportSecurity(securityHeaderSettingValueStrictTransportSecurityModel)
    .build();

    // Construct an instance of the UpdateSecurityHeaderOptions model
    UpdateSecurityHeaderOptions updateSecurityHeaderOptionsModel = new UpdateSecurityHeaderOptions.Builder()
    .value(securityHeaderSettingValueModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityHeaderResp> response = zonesSettingsService.updateSecurityHeader(updateSecurityHeaderOptionsModel).execute();
    assertNotNull(response);
    SecurityHeaderResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecurityHeaderPath);
  }

  @Test
  public void testGetMobileRedirectWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"mobile_redirect\", \"value\": {\"status\": \"true\", \"mobile_subdomain\": \"m\", \"strip_uri\": false}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMobileRedirectPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/mobile_redirect", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMobileRedirectOptions model
    GetMobileRedirectOptions getMobileRedirectOptionsModel = new GetMobileRedirectOptions();

    // Invoke operation with valid options model (positive test)
    Response<MobileRedirectResp> response = zonesSettingsService.getMobileRedirect(getMobileRedirectOptionsModel).execute();
    assertNotNull(response);
    MobileRedirectResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getMobileRedirectPath);
  }

  @Test
  public void testUpdateMobileRedirectWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"mobile_redirect\", \"value\": {\"status\": \"true\", \"mobile_subdomain\": \"m\", \"strip_uri\": false}, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMobileRedirectPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/mobile_redirect", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MobileRedirecSettingValue model
    MobileRedirecSettingValue mobileRedirecSettingValueModel = new MobileRedirecSettingValue.Builder()
    .status("true")
    .mobileSubdomain("m")
    .stripUri(false)
    .build();

    // Construct an instance of the UpdateMobileRedirectOptions model
    UpdateMobileRedirectOptions updateMobileRedirectOptionsModel = new UpdateMobileRedirectOptions.Builder()
    .value(mobileRedirecSettingValueModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MobileRedirectResp> response = zonesSettingsService.updateMobileRedirect(updateMobileRedirectOptionsModel).execute();
    assertNotNull(response);
    MobileRedirectResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMobileRedirectPath);
  }

  @Test
  public void testGetPrefetchPreloadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"prefetch_preload\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getPrefetchPreloadPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/prefetch_preload", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPrefetchPreloadOptions model
    GetPrefetchPreloadOptions getPrefetchPreloadOptionsModel = new GetPrefetchPreloadOptions();

    // Invoke operation with valid options model (positive test)
    Response<PrefetchPreloadResp> response = zonesSettingsService.getPrefetchPreload(getPrefetchPreloadOptionsModel).execute();
    assertNotNull(response);
    PrefetchPreloadResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getPrefetchPreloadPath);
  }

  @Test
  public void testUpdatePrefetchPreloadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"prefetch_preload\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updatePrefetchPreloadPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/prefetch_preload", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdatePrefetchPreloadOptions model
    UpdatePrefetchPreloadOptions updatePrefetchPreloadOptionsModel = new UpdatePrefetchPreloadOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrefetchPreloadResp> response = zonesSettingsService.updatePrefetchPreload(updatePrefetchPreloadOptionsModel).execute();
    assertNotNull(response);
    PrefetchPreloadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrefetchPreloadPath);
  }

  @Test
  public void testGetHttp2WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"http2\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHttp2Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/http2", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetHttp2Options model
    GetHttp2Options getHttp2OptionsModel = new GetHttp2Options();

    // Invoke operation with valid options model (positive test)
    Response<Http2Resp> response = zonesSettingsService.getHttp2(getHttp2OptionsModel).execute();
    assertNotNull(response);
    Http2Resp responseObj = response.getResult();
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
    assertEquals(parsedPath, getHttp2Path);
  }

  @Test
  public void testUpdateHttp2WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"http2\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHttp2Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/http2", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateHttp2Options model
    UpdateHttp2Options updateHttp2OptionsModel = new UpdateHttp2Options.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Http2Resp> response = zonesSettingsService.updateHttp2(updateHttp2OptionsModel).execute();
    assertNotNull(response);
    Http2Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHttp2Path);
  }

  @Test
  public void testGetHttp3WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"http3\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHttp3Path = "/v1/testString/zones/testString/settings/http3";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetHttp3Options model
    GetHttp3Options getHttp3OptionsModel = new GetHttp3Options();

    // Invoke operation with valid options model (positive test)
    Response<Http3Resp> response = zonesSettingsService.getHttp3(getHttp3OptionsModel).execute();
    assertNotNull(response);
    Http3Resp responseObj = response.getResult();
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
    assertEquals(parsedPath, getHttp3Path);
  }

  @Test
  public void testUpdateHttp3WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"http3\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHttp3Path = "/v1/testString/zones/testString/settings/http3";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateHttp3Options model
    UpdateHttp3Options updateHttp3OptionsModel = new UpdateHttp3Options.Builder()
    .value("on")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Http3Resp> response = zonesSettingsService.updateHttp3(updateHttp3OptionsModel).execute();
    assertNotNull(response);
    Http3Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHttp3Path);
  }

  @Test
  public void testGetIpv6WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ipv6\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getIpv6Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ipv6", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetIpv6Options model
    GetIpv6Options getIpv6OptionsModel = new GetIpv6Options();

    // Invoke operation with valid options model (positive test)
    Response<Ipv6Resp> response = zonesSettingsService.getIpv6(getIpv6OptionsModel).execute();
    assertNotNull(response);
    Ipv6Resp responseObj = response.getResult();
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
    assertEquals(parsedPath, getIpv6Path);
  }

  @Test
  public void testUpdateIpv6WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ipv6\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateIpv6Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ipv6", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateIpv6Options model
    UpdateIpv6Options updateIpv6OptionsModel = new UpdateIpv6Options.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Ipv6Resp> response = zonesSettingsService.updateIpv6(updateIpv6OptionsModel).execute();
    assertNotNull(response);
    Ipv6Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIpv6Path);
  }

  @Test
  public void testGetWebSocketsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"websockets\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getWebSocketsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/websockets", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWebSocketsOptions model
    GetWebSocketsOptions getWebSocketsOptionsModel = new GetWebSocketsOptions();

    // Invoke operation with valid options model (positive test)
    Response<WebsocketsResp> response = zonesSettingsService.getWebSockets(getWebSocketsOptionsModel).execute();
    assertNotNull(response);
    WebsocketsResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getWebSocketsPath);
  }

  @Test
  public void testUpdateWebSocketsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"websockets\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateWebSocketsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/websockets", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateWebSocketsOptions model
    UpdateWebSocketsOptions updateWebSocketsOptionsModel = new UpdateWebSocketsOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebsocketsResp> response = zonesSettingsService.updateWebSockets(updateWebSocketsOptionsModel).execute();
    assertNotNull(response);
    WebsocketsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWebSocketsPath);
  }

  @Test
  public void testGetPseudoIpv4WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"pseudo_ipv4\", \"value\": \"add_header\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getPseudoIpv4Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/pseudo_ipv4", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPseudoIpv4Options model
    GetPseudoIpv4Options getPseudoIpv4OptionsModel = new GetPseudoIpv4Options();

    // Invoke operation with valid options model (positive test)
    Response<PseudoIpv4Resp> response = zonesSettingsService.getPseudoIpv4(getPseudoIpv4OptionsModel).execute();
    assertNotNull(response);
    PseudoIpv4Resp responseObj = response.getResult();
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
    assertEquals(parsedPath, getPseudoIpv4Path);
  }

  @Test
  public void testUpdatePseudoIpv4WOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"pseudo_ipv4\", \"value\": \"add_header\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updatePseudoIpv4Path = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/pseudo_ipv4", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdatePseudoIpv4Options model
    UpdatePseudoIpv4Options updatePseudoIpv4OptionsModel = new UpdatePseudoIpv4Options.Builder()
    .value("add_header")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PseudoIpv4Resp> response = zonesSettingsService.updatePseudoIpv4(updatePseudoIpv4OptionsModel).execute();
    assertNotNull(response);
    PseudoIpv4Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePseudoIpv4Path);
  }

  @Test
  public void testGetResponseBufferingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"response_buffering\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getResponseBufferingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/response_buffering", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetResponseBufferingOptions model
    GetResponseBufferingOptions getResponseBufferingOptionsModel = new GetResponseBufferingOptions();

    // Invoke operation with valid options model (positive test)
    Response<ResponseBufferingResp> response = zonesSettingsService.getResponseBuffering(getResponseBufferingOptionsModel).execute();
    assertNotNull(response);
    ResponseBufferingResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getResponseBufferingPath);
  }

  @Test
  public void testUpdateResponseBufferingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"response_buffering\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateResponseBufferingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/response_buffering", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateResponseBufferingOptions model
    UpdateResponseBufferingOptions updateResponseBufferingOptionsModel = new UpdateResponseBufferingOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResponseBufferingResp> response = zonesSettingsService.updateResponseBuffering(updateResponseBufferingOptionsModel).execute();
    assertNotNull(response);
    ResponseBufferingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateResponseBufferingPath);
  }

  @Test
  public void testGetHotlinkProtectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"hotlink_protection\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHotlinkProtectionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/hotlink_protection", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetHotlinkProtectionOptions model
    GetHotlinkProtectionOptions getHotlinkProtectionOptionsModel = new GetHotlinkProtectionOptions();

    // Invoke operation with valid options model (positive test)
    Response<HotlinkProtectionResp> response = zonesSettingsService.getHotlinkProtection(getHotlinkProtectionOptionsModel).execute();
    assertNotNull(response);
    HotlinkProtectionResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getHotlinkProtectionPath);
  }

  @Test
  public void testUpdateHotlinkProtectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"hotlink_protection\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHotlinkProtectionPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/hotlink_protection", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateHotlinkProtectionOptions model
    UpdateHotlinkProtectionOptions updateHotlinkProtectionOptionsModel = new UpdateHotlinkProtectionOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<HotlinkProtectionResp> response = zonesSettingsService.updateHotlinkProtection(updateHotlinkProtectionOptionsModel).execute();
    assertNotNull(response);
    HotlinkProtectionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHotlinkProtectionPath);
  }

  @Test
  public void testGetMaxUploadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"max_upload\", \"value\": 300, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMaxUploadPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/max_upload", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMaxUploadOptions model
    GetMaxUploadOptions getMaxUploadOptionsModel = new GetMaxUploadOptions();

    // Invoke operation with valid options model (positive test)
    Response<MaxUploadResp> response = zonesSettingsService.getMaxUpload(getMaxUploadOptionsModel).execute();
    assertNotNull(response);
    MaxUploadResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getMaxUploadPath);
  }

  @Test
  public void testUpdateMaxUploadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"max_upload\", \"value\": 300, \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMaxUploadPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/max_upload", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateMaxUploadOptions model
    UpdateMaxUploadOptions updateMaxUploadOptionsModel = new UpdateMaxUploadOptions.Builder()
    .value(Long.valueOf("300"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MaxUploadResp> response = zonesSettingsService.updateMaxUpload(updateMaxUploadOptionsModel).execute();
    assertNotNull(response);
    MaxUploadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMaxUploadPath);
  }

  @Test
  public void testGetTlsClientAuthWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_client_auth\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getTlsClientAuthPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_client_auth", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTlsClientAuthOptions model
    GetTlsClientAuthOptions getTlsClientAuthOptionsModel = new GetTlsClientAuthOptions();

    // Invoke operation with valid options model (positive test)
    Response<TlsClientAuthResp> response = zonesSettingsService.getTlsClientAuth(getTlsClientAuthOptionsModel).execute();
    assertNotNull(response);
    TlsClientAuthResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getTlsClientAuthPath);
  }

  @Test
  public void testUpdateTlsClientAuthWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"tls_client_auth\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateTlsClientAuthPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/tls_client_auth", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateTlsClientAuthOptions model
    UpdateTlsClientAuthOptions updateTlsClientAuthOptionsModel = new UpdateTlsClientAuthOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TlsClientAuthResp> response = zonesSettingsService.updateTlsClientAuth(updateTlsClientAuthOptionsModel).execute();
    assertNotNull(response);
    TlsClientAuthResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTlsClientAuthPath);
  }

  @Test
  public void testGetBrowserCheckWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"browser_check\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getBrowserCheckPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/browser_check", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetBrowserCheckOptions model
    GetBrowserCheckOptions getBrowserCheckOptionsModel = new GetBrowserCheckOptions();

    // Invoke operation with valid options model (positive test)
    Response<BrowserCheckResp> response = zonesSettingsService.getBrowserCheck(getBrowserCheckOptionsModel).execute();
    assertNotNull(response);
    BrowserCheckResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getBrowserCheckPath);
  }

  @Test
  public void testUpdateBrowserCheckWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"browser_check\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateBrowserCheckPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/browser_check", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateBrowserCheckOptions model
    UpdateBrowserCheckOptions updateBrowserCheckOptionsModel = new UpdateBrowserCheckOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<BrowserCheckResp> response = zonesSettingsService.updateBrowserCheck(updateBrowserCheckOptionsModel).execute();
    assertNotNull(response);
    BrowserCheckResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBrowserCheckPath);
  }

  @Test
  public void testGetEnableErrorPagesOnWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"origin_error_page_pass_thru\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getEnableErrorPagesOnPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/origin_error_page_pass_thru", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetEnableErrorPagesOnOptions model
    GetEnableErrorPagesOnOptions getEnableErrorPagesOnOptionsModel = new GetEnableErrorPagesOnOptions();

    // Invoke operation with valid options model (positive test)
    Response<OriginErrorPagePassThruResp> response = zonesSettingsService.getEnableErrorPagesOn(getEnableErrorPagesOnOptionsModel).execute();
    assertNotNull(response);
    OriginErrorPagePassThruResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getEnableErrorPagesOnPath);
  }

  @Test
  public void testUpdateEnableErrorPagesOnWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"origin_error_page_pass_thru\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateEnableErrorPagesOnPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/origin_error_page_pass_thru", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateEnableErrorPagesOnOptions model
    UpdateEnableErrorPagesOnOptions updateEnableErrorPagesOnOptionsModel = new UpdateEnableErrorPagesOnOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OriginErrorPagePassThruResp> response = zonesSettingsService.updateEnableErrorPagesOn(updateEnableErrorPagesOnOptionsModel).execute();
    assertNotNull(response);
    OriginErrorPagePassThruResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEnableErrorPagesOnPath);
  }

  @Test
  public void testGetWebApplicationFirewallWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"waf\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getWebApplicationFirewallPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/waf", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWebApplicationFirewallOptions model
    GetWebApplicationFirewallOptions getWebApplicationFirewallOptionsModel = new GetWebApplicationFirewallOptions();

    // Invoke operation with valid options model (positive test)
    Response<WafResp> response = zonesSettingsService.getWebApplicationFirewall(getWebApplicationFirewallOptionsModel).execute();
    assertNotNull(response);
    WafResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getWebApplicationFirewallPath);
  }

  @Test
  public void testUpdateWebApplicationFirewallWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"waf\", \"value\": \"false\", \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateWebApplicationFirewallPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/waf", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateWebApplicationFirewallOptions model
    UpdateWebApplicationFirewallOptions updateWebApplicationFirewallOptionsModel = new UpdateWebApplicationFirewallOptions.Builder()
    .value("true")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafResp> response = zonesSettingsService.updateWebApplicationFirewall(updateWebApplicationFirewallOptionsModel).execute();
    assertNotNull(response);
    WafResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWebApplicationFirewallPath);
  }

  @Test
  public void testGetCiphersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ciphers\", \"value\": [\"value\"], \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getCiphersPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ciphers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCiphersOptions model
    GetCiphersOptions getCiphersOptionsModel = new GetCiphersOptions();

    // Invoke operation with valid options model (positive test)
    Response<CiphersResp> response = zonesSettingsService.getCiphers(getCiphersOptionsModel).execute();
    assertNotNull(response);
    CiphersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getCiphersPath);
  }

  @Test
  public void testUpdateCiphersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"ciphers\", \"value\": [\"value\"], \"editable\": true, \"modified_on\": \"2019-01-01T12:00:00\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateCiphersPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/ciphers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateCiphersOptions model
    UpdateCiphersOptions updateCiphersOptionsModel = new UpdateCiphersOptions.Builder()
    .value(new java.util.ArrayList<String>(java.util.Arrays.asList("ECDHE-ECDSA-AES128-GCM-SHA256")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CiphersResp> response = zonesSettingsService.updateCiphers(updateCiphersOptionsModel).execute();
    assertNotNull(response);
    CiphersResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCiphersPath);
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
    zonesSettingsService = null;
  }
}