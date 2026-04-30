/*
 * (C) Copyright IBM Corp. 2026.
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
import com.ibm.cloud.networking.zones_settings.v1.model.BotMgtResp;
import com.ibm.cloud.networking.zones_settings.v1.model.BotMgtSettings;
import com.ibm.cloud.networking.zones_settings.v1.model.BrotliResp;
import com.ibm.cloud.networking.zones_settings.v1.model.BrotliRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.BrowserCheckResp;
import com.ibm.cloud.networking.zones_settings.v1.model.BrowserCheckRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ChallengeTtlResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ChallengeTtlRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.CiphersResp;
import com.ibm.cloud.networking.zones_settings.v1.model.CiphersRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.CnameFlatteningResponse;
import com.ibm.cloud.networking.zones_settings.v1.model.EmailObfuscationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.EmailObfuscationRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.GetAlwaysUseHttpsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetAutomaticHttpsRewritesOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetBotManagementOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetBrotliOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetBrowserCheckOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetChallengeTtlOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetCiphersOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetEmailObfuscationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetEnableErrorPagesOnOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHotlinkProtectionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHttp2Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetHttp3Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetImageLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetImageSizeOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetIpGeolocationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetIpv6Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetLogRetentionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMaxUploadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMinTlsVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMinifyOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetMobileRedirectOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetOpportunisticEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetOpportunisticOnionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetOriginMaxHttpVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetOriginPostQuantumEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetPrefetchPreloadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetProxyReadTimeoutOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetPseudoIpv4Options;
import com.ibm.cloud.networking.zones_settings.v1.model.GetReplaceInsecureJsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetResponseBufferingOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetScriptLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetSecurityHeaderOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.GetSecurityLevelOptions;
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
import com.ibm.cloud.networking.zones_settings.v1.model.LogRetentionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.LogRetentionRespResult;
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
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticOnionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticOnionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginErrorPagePassThruResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginErrorPagePassThruRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginMaxHttpVersionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginMaxHttpVersionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginPostQuantumEncryptionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginPostQuantumEncryptionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.PrefetchPreloadResp;
import com.ibm.cloud.networking.zones_settings.v1.model.PrefetchPreloadRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ProxyReadTimeoutResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ProxyReadTimeoutRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4RespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ReplaceInsecureJsResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ReplaceInsecureJsRespResult;
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
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityLevelResp;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityLevelRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.ServerSideExcludeResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ServerSideExcludeRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.TlsClientAuthResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TlsClientAuthRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.TrueClientIpResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TrueClientIpRespResult;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAlwaysUseHttpsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAutomaticHttpsRewritesOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateBotManagementOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateBrotliOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateBrowserCheckOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateChallengeTtlOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateCiphersOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateEmailObfuscationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateEnableErrorPagesOnOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHotlinkProtectionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHttp2Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHttp3Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateImageLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateImageSizeOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateIpGeolocationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateIpv6Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateLogRetentionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMaxUploadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMinTlsVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMinifyOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateMobileRedirectOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateOpportunisticEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateOpportunisticOnionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateOriginMaxHttpVersionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateOriginPostQuantumEncryptionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdatePrefetchPreloadOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateProxyReadTimeoutOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdatePseudoIpv4Options;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateReplaceInsecureJsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateResponseBufferingOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateScriptLoadOptimizationOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateSecurityHeaderOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateSecurityLevelOptions;
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
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.IOException;
import java.io.InputStream;
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
 * Unit test class for the ZonesSettings service.
 */
public class ZonesSettingsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ZonesSettings zonesSettingsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";
    new ZonesSettings(crn, zoneIdentifier, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(zonesSettingsService.getCrn(), "testString");
  }


  // Test the getter for the zoneIdentifier global parameter
  @Test
  public void testGetZoneIdentifier() throws Throwable {
    assertEquals(zonesSettingsService.getZoneIdentifier(), "testString");
  }

  // Test the getZoneDnssec operation with a valid options model parameter
  @Test
  public void testGetZoneDnssecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"status\": \"active\", \"flags\": 257, \"algorithm\": \"13\", \"key_type\": \"ECDSAP256SHA256\", \"digest_type\": \"2\", \"digest_algorithm\": \"SHA256\", \"digest\": \"48E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"ds\": \"example.com. 3600 IN DS 16953 13 2 248E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"key_tag\": 42, \"public_key\": \"oXiGYrSTO+LSCJ3mohc8EP+CzF9KxBj8/ydXJ22pKuZP3VAC3/Md/k7xZfz470CoRyZJ6gV6vml07IC3d8xqhA==\"}}";
    String getZoneDnssecPath = "/v1/testString/zones/testString/dnssec";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneDnssecOptions model
    GetZoneDnssecOptions getZoneDnssecOptionsModel = new GetZoneDnssecOptions();

    // Invoke getZoneDnssec() with a valid options model and verify the result
    Response<ZonesDnssecResp> response = zonesSettingsService.getZoneDnssec(getZoneDnssecOptionsModel).execute();
    assertNotNull(response);
    ZonesDnssecResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneDnssecPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneDnssec operation with and without retries enabled
  @Test
  public void testGetZoneDnssecWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetZoneDnssecWOptions();

    zonesSettingsService.disableRetries();
    testGetZoneDnssecWOptions();
  }

  // Test the updateZoneDnssec operation with a valid options model parameter
  @Test
  public void testUpdateZoneDnssecWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"status\": \"active\", \"flags\": 257, \"algorithm\": \"13\", \"key_type\": \"ECDSAP256SHA256\", \"digest_type\": \"2\", \"digest_algorithm\": \"SHA256\", \"digest\": \"48E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"ds\": \"example.com. 3600 IN DS 16953 13 2 248E939042E82C22542CB377B580DFDC52A361CEFDC72E7F9107E2B6BD9306A45\", \"key_tag\": 42, \"public_key\": \"oXiGYrSTO+LSCJ3mohc8EP+CzF9KxBj8/ydXJ22pKuZP3VAC3/Md/k7xZfz470CoRyZJ6gV6vml07IC3d8xqhA==\"}}";
    String updateZoneDnssecPath = "/v1/testString/zones/testString/dnssec";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateZoneDnssecOptions model
    UpdateZoneDnssecOptions updateZoneDnssecOptionsModel = new UpdateZoneDnssecOptions.Builder()
      .status("active")
      .build();

    // Invoke updateZoneDnssec() with a valid options model and verify the result
    Response<ZonesDnssecResp> response = zonesSettingsService.updateZoneDnssec(updateZoneDnssecOptionsModel).execute();
    assertNotNull(response);
    ZonesDnssecResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneDnssecPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneDnssec operation with and without retries enabled
  @Test
  public void testUpdateZoneDnssecWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateZoneDnssecWOptions();

    zonesSettingsService.disableRetries();
    testUpdateZoneDnssecWOptions();
  }

  // Test the getZoneCnameFlattening operation with a valid options model parameter
  @Test
  public void testGetZoneCnameFlatteningWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cname_flattening\", \"value\": \"flatten_all\", \"modified_on\": \"2014-01-01T05:20:00.123Z\", \"editable\": true}}";
    String getZoneCnameFlatteningPath = "/v1/testString/zones/testString/settings/cname_flattening";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneCnameFlatteningOptions model
    GetZoneCnameFlatteningOptions getZoneCnameFlatteningOptionsModel = new GetZoneCnameFlatteningOptions();

    // Invoke getZoneCnameFlattening() with a valid options model and verify the result
    Response<ZonesCnameFlatteningResp> response = zonesSettingsService.getZoneCnameFlattening(getZoneCnameFlatteningOptionsModel).execute();
    assertNotNull(response);
    ZonesCnameFlatteningResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneCnameFlatteningPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneCnameFlattening operation with and without retries enabled
  @Test
  public void testGetZoneCnameFlatteningWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetZoneCnameFlatteningWOptions();

    zonesSettingsService.disableRetries();
    testGetZoneCnameFlatteningWOptions();
  }

  // Test the updateZoneCnameFlattening operation with a valid options model parameter
  @Test
  public void testUpdateZoneCnameFlatteningWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cname_flattening\", \"value\": \"flatten_all\", \"modified_on\": \"2014-01-01T05:20:00.123Z\", \"editable\": true}}";
    String updateZoneCnameFlatteningPath = "/v1/testString/zones/testString/settings/cname_flattening";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateZoneCnameFlatteningOptions model
    UpdateZoneCnameFlatteningOptions updateZoneCnameFlatteningOptionsModel = new UpdateZoneCnameFlatteningOptions.Builder()
      .value("flatten_all")
      .build();

    // Invoke updateZoneCnameFlattening() with a valid options model and verify the result
    Response<ZonesCnameFlatteningResp> response = zonesSettingsService.updateZoneCnameFlattening(updateZoneCnameFlatteningOptionsModel).execute();
    assertNotNull(response);
    ZonesCnameFlatteningResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneCnameFlatteningPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneCnameFlattening operation with and without retries enabled
  @Test
  public void testUpdateZoneCnameFlatteningWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateZoneCnameFlatteningWOptions();

    zonesSettingsService.disableRetries();
    testUpdateZoneCnameFlatteningWOptions();
  }

  // Test the getOpportunisticEncryption operation with a valid options model parameter
  @Test
  public void testGetOpportunisticEncryptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_encryption\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getOpportunisticEncryptionPath = "/v1/testString/zones/testString/settings/opportunistic_encryption";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetOpportunisticEncryptionOptions model
    GetOpportunisticEncryptionOptions getOpportunisticEncryptionOptionsModel = new GetOpportunisticEncryptionOptions();

    // Invoke getOpportunisticEncryption() with a valid options model and verify the result
    Response<OpportunisticEncryptionResp> response = zonesSettingsService.getOpportunisticEncryption(getOpportunisticEncryptionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticEncryptionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOpportunisticEncryptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getOpportunisticEncryption operation with and without retries enabled
  @Test
  public void testGetOpportunisticEncryptionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetOpportunisticEncryptionWOptions();

    zonesSettingsService.disableRetries();
    testGetOpportunisticEncryptionWOptions();
  }

  // Test the updateOpportunisticEncryption operation with a valid options model parameter
  @Test
  public void testUpdateOpportunisticEncryptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_encryption\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateOpportunisticEncryptionPath = "/v1/testString/zones/testString/settings/opportunistic_encryption";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateOpportunisticEncryptionOptions model
    UpdateOpportunisticEncryptionOptions updateOpportunisticEncryptionOptionsModel = new UpdateOpportunisticEncryptionOptions.Builder()
      .value("off")
      .build();

    // Invoke updateOpportunisticEncryption() with a valid options model and verify the result
    Response<OpportunisticEncryptionResp> response = zonesSettingsService.updateOpportunisticEncryption(updateOpportunisticEncryptionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticEncryptionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOpportunisticEncryptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateOpportunisticEncryption operation with and without retries enabled
  @Test
  public void testUpdateOpportunisticEncryptionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateOpportunisticEncryptionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateOpportunisticEncryptionWOptions();
  }

  // Test the getOpportunisticOnion operation with a valid options model parameter
  @Test
  public void testGetOpportunisticOnionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_onion\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getOpportunisticOnionPath = "/v1/testString/zones/testString/settings/opportunistic_onion";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetOpportunisticOnionOptions model
    GetOpportunisticOnionOptions getOpportunisticOnionOptionsModel = new GetOpportunisticOnionOptions();

    // Invoke getOpportunisticOnion() with a valid options model and verify the result
    Response<OpportunisticOnionResp> response = zonesSettingsService.getOpportunisticOnion(getOpportunisticOnionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticOnionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOpportunisticOnionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getOpportunisticOnion operation with and without retries enabled
  @Test
  public void testGetOpportunisticOnionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetOpportunisticOnionWOptions();

    zonesSettingsService.disableRetries();
    testGetOpportunisticOnionWOptions();
  }

  // Test the updateOpportunisticOnion operation with a valid options model parameter
  @Test
  public void testUpdateOpportunisticOnionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"opportunistic_onion\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateOpportunisticOnionPath = "/v1/testString/zones/testString/settings/opportunistic_onion";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateOpportunisticOnionOptions model
    UpdateOpportunisticOnionOptions updateOpportunisticOnionOptionsModel = new UpdateOpportunisticOnionOptions.Builder()
      .value("off")
      .build();

    // Invoke updateOpportunisticOnion() with a valid options model and verify the result
    Response<OpportunisticOnionResp> response = zonesSettingsService.updateOpportunisticOnion(updateOpportunisticOnionOptionsModel).execute();
    assertNotNull(response);
    OpportunisticOnionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOpportunisticOnionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateOpportunisticOnion operation with and without retries enabled
  @Test
  public void testUpdateOpportunisticOnionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateOpportunisticOnionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateOpportunisticOnionWOptions();
  }

  // Test the getChallengeTtl operation with a valid options model parameter
  @Test
  public void testGetChallengeTtlWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"challenge_ttl\", \"value\": 1800, \"editable\": true, \"modified_on\": \"2018-09-17T07:21:39.844Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getChallengeTtlPath = "/v1/testString/zones/testString/settings/challenge_ttl";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetChallengeTtlOptions model
    GetChallengeTtlOptions getChallengeTtlOptionsModel = new GetChallengeTtlOptions();

    // Invoke getChallengeTtl() with a valid options model and verify the result
    Response<ChallengeTtlResp> response = zonesSettingsService.getChallengeTtl(getChallengeTtlOptionsModel).execute();
    assertNotNull(response);
    ChallengeTtlResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getChallengeTtlPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getChallengeTtl operation with and without retries enabled
  @Test
  public void testGetChallengeTtlWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetChallengeTtlWOptions();

    zonesSettingsService.disableRetries();
    testGetChallengeTtlWOptions();
  }

  // Test the updateChallengeTtl operation with a valid options model parameter
  @Test
  public void testUpdateChallengeTtlWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"challenge_ttl\", \"value\": 1800, \"editable\": true, \"modified_on\": \"2018-09-17T07:21:39.844Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateChallengeTtlPath = "/v1/testString/zones/testString/settings/challenge_ttl";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateChallengeTtlOptions model
    UpdateChallengeTtlOptions updateChallengeTtlOptionsModel = new UpdateChallengeTtlOptions.Builder()
      .value(Long.valueOf("1800"))
      .build();

    // Invoke updateChallengeTtl() with a valid options model and verify the result
    Response<ChallengeTtlResp> response = zonesSettingsService.updateChallengeTtl(updateChallengeTtlOptionsModel).execute();
    assertNotNull(response);
    ChallengeTtlResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateChallengeTtlPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateChallengeTtl operation with and without retries enabled
  @Test
  public void testUpdateChallengeTtlWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateChallengeTtlWOptions();

    zonesSettingsService.disableRetries();
    testUpdateChallengeTtlWOptions();
  }

  // Test the getAutomaticHttpsRewrites operation with a valid options model parameter
  @Test
  public void testGetAutomaticHttpsRewritesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"automatic_https_rewrites\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getAutomaticHttpsRewritesPath = "/v1/testString/zones/testString/settings/automatic_https_rewrites";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAutomaticHttpsRewritesOptions model
    GetAutomaticHttpsRewritesOptions getAutomaticHttpsRewritesOptionsModel = new GetAutomaticHttpsRewritesOptions();

    // Invoke getAutomaticHttpsRewrites() with a valid options model and verify the result
    Response<AutomaticHttpsRewritesResp> response = zonesSettingsService.getAutomaticHttpsRewrites(getAutomaticHttpsRewritesOptionsModel).execute();
    assertNotNull(response);
    AutomaticHttpsRewritesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAutomaticHttpsRewritesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAutomaticHttpsRewrites operation with and without retries enabled
  @Test
  public void testGetAutomaticHttpsRewritesWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetAutomaticHttpsRewritesWOptions();

    zonesSettingsService.disableRetries();
    testGetAutomaticHttpsRewritesWOptions();
  }

  // Test the updateAutomaticHttpsRewrites operation with a valid options model parameter
  @Test
  public void testUpdateAutomaticHttpsRewritesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"automatic_https_rewrites\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateAutomaticHttpsRewritesPath = "/v1/testString/zones/testString/settings/automatic_https_rewrites";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateAutomaticHttpsRewritesOptions model
    UpdateAutomaticHttpsRewritesOptions updateAutomaticHttpsRewritesOptionsModel = new UpdateAutomaticHttpsRewritesOptions.Builder()
      .value("off")
      .build();

    // Invoke updateAutomaticHttpsRewrites() with a valid options model and verify the result
    Response<AutomaticHttpsRewritesResp> response = zonesSettingsService.updateAutomaticHttpsRewrites(updateAutomaticHttpsRewritesOptionsModel).execute();
    assertNotNull(response);
    AutomaticHttpsRewritesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAutomaticHttpsRewritesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAutomaticHttpsRewrites operation with and without retries enabled
  @Test
  public void testUpdateAutomaticHttpsRewritesWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateAutomaticHttpsRewritesWOptions();

    zonesSettingsService.disableRetries();
    testUpdateAutomaticHttpsRewritesWOptions();
  }

  // Test the getTrueClientIp operation with a valid options model parameter
  @Test
  public void testGetTrueClientIpWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"true_client_ip_header\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getTrueClientIpPath = "/v1/testString/zones/testString/settings/true_client_ip_header";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTrueClientIpOptions model
    GetTrueClientIpOptions getTrueClientIpOptionsModel = new GetTrueClientIpOptions();

    // Invoke getTrueClientIp() with a valid options model and verify the result
    Response<TrueClientIpResp> response = zonesSettingsService.getTrueClientIp(getTrueClientIpOptionsModel).execute();
    assertNotNull(response);
    TrueClientIpResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTrueClientIpPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getTrueClientIp operation with and without retries enabled
  @Test
  public void testGetTrueClientIpWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetTrueClientIpWOptions();

    zonesSettingsService.disableRetries();
    testGetTrueClientIpWOptions();
  }

  // Test the updateTrueClientIp operation with a valid options model parameter
  @Test
  public void testUpdateTrueClientIpWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"true_client_ip_header\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateTrueClientIpPath = "/v1/testString/zones/testString/settings/true_client_ip_header";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTrueClientIpOptions model
    UpdateTrueClientIpOptions updateTrueClientIpOptionsModel = new UpdateTrueClientIpOptions.Builder()
      .value("on")
      .build();

    // Invoke updateTrueClientIp() with a valid options model and verify the result
    Response<TrueClientIpResp> response = zonesSettingsService.updateTrueClientIp(updateTrueClientIpOptionsModel).execute();
    assertNotNull(response);
    TrueClientIpResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTrueClientIpPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateTrueClientIp operation with and without retries enabled
  @Test
  public void testUpdateTrueClientIpWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateTrueClientIpWOptions();

    zonesSettingsService.disableRetries();
    testUpdateTrueClientIpWOptions();
  }

  // Test the getAlwaysUseHttps operation with a valid options model parameter
  @Test
  public void testGetAlwaysUseHttpsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"always_use_https\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getAlwaysUseHttpsPath = "/v1/testString/zones/testString/settings/always_use_https";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAlwaysUseHttpsOptions model
    GetAlwaysUseHttpsOptions getAlwaysUseHttpsOptionsModel = new GetAlwaysUseHttpsOptions();

    // Invoke getAlwaysUseHttps() with a valid options model and verify the result
    Response<AlwaysUseHttpsResp> response = zonesSettingsService.getAlwaysUseHttps(getAlwaysUseHttpsOptionsModel).execute();
    assertNotNull(response);
    AlwaysUseHttpsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAlwaysUseHttpsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAlwaysUseHttps operation with and without retries enabled
  @Test
  public void testGetAlwaysUseHttpsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetAlwaysUseHttpsWOptions();

    zonesSettingsService.disableRetries();
    testGetAlwaysUseHttpsWOptions();
  }

  // Test the updateAlwaysUseHttps operation with a valid options model parameter
  @Test
  public void testUpdateAlwaysUseHttpsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"always_use_https\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateAlwaysUseHttpsPath = "/v1/testString/zones/testString/settings/always_use_https";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateAlwaysUseHttpsOptions model
    UpdateAlwaysUseHttpsOptions updateAlwaysUseHttpsOptionsModel = new UpdateAlwaysUseHttpsOptions.Builder()
      .value("on")
      .build();

    // Invoke updateAlwaysUseHttps() with a valid options model and verify the result
    Response<AlwaysUseHttpsResp> response = zonesSettingsService.updateAlwaysUseHttps(updateAlwaysUseHttpsOptionsModel).execute();
    assertNotNull(response);
    AlwaysUseHttpsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAlwaysUseHttpsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateAlwaysUseHttps operation with and without retries enabled
  @Test
  public void testUpdateAlwaysUseHttpsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateAlwaysUseHttpsWOptions();

    zonesSettingsService.disableRetries();
    testUpdateAlwaysUseHttpsWOptions();
  }

  // Test the getImageSizeOptimization operation with a valid options model parameter
  @Test
  public void testGetImageSizeOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"image_size_optimization\", \"value\": \"lossless\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getImageSizeOptimizationPath = "/v1/testString/zones/testString/settings/image_size_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetImageSizeOptimizationOptions model
    GetImageSizeOptimizationOptions getImageSizeOptimizationOptionsModel = new GetImageSizeOptimizationOptions();

    // Invoke getImageSizeOptimization() with a valid options model and verify the result
    Response<ImageSizeOptimizationResp> response = zonesSettingsService.getImageSizeOptimization(getImageSizeOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageSizeOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getImageSizeOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getImageSizeOptimization operation with and without retries enabled
  @Test
  public void testGetImageSizeOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetImageSizeOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testGetImageSizeOptimizationWOptions();
  }

  // Test the updateImageSizeOptimization operation with a valid options model parameter
  @Test
  public void testUpdateImageSizeOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"image_size_optimization\", \"value\": \"lossless\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateImageSizeOptimizationPath = "/v1/testString/zones/testString/settings/image_size_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateImageSizeOptimizationOptions model
    UpdateImageSizeOptimizationOptions updateImageSizeOptimizationOptionsModel = new UpdateImageSizeOptimizationOptions.Builder()
      .value("lossless")
      .build();

    // Invoke updateImageSizeOptimization() with a valid options model and verify the result
    Response<ImageSizeOptimizationResp> response = zonesSettingsService.updateImageSizeOptimization(updateImageSizeOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageSizeOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateImageSizeOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateImageSizeOptimization operation with and without retries enabled
  @Test
  public void testUpdateImageSizeOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateImageSizeOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testUpdateImageSizeOptimizationWOptions();
  }

  // Test the getScriptLoadOptimization operation with a valid options model parameter
  @Test
  public void testGetScriptLoadOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"script_load_optimization\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getScriptLoadOptimizationPath = "/v1/testString/zones/testString/settings/script_load_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetScriptLoadOptimizationOptions model
    GetScriptLoadOptimizationOptions getScriptLoadOptimizationOptionsModel = new GetScriptLoadOptimizationOptions();

    // Invoke getScriptLoadOptimization() with a valid options model and verify the result
    Response<ScriptLoadOptimizationResp> response = zonesSettingsService.getScriptLoadOptimization(getScriptLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ScriptLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getScriptLoadOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getScriptLoadOptimization operation with and without retries enabled
  @Test
  public void testGetScriptLoadOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetScriptLoadOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testGetScriptLoadOptimizationWOptions();
  }

  // Test the updateScriptLoadOptimization operation with a valid options model parameter
  @Test
  public void testUpdateScriptLoadOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"script_load_optimization\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateScriptLoadOptimizationPath = "/v1/testString/zones/testString/settings/script_load_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateScriptLoadOptimizationOptions model
    UpdateScriptLoadOptimizationOptions updateScriptLoadOptimizationOptionsModel = new UpdateScriptLoadOptimizationOptions.Builder()
      .value("on")
      .build();

    // Invoke updateScriptLoadOptimization() with a valid options model and verify the result
    Response<ScriptLoadOptimizationResp> response = zonesSettingsService.updateScriptLoadOptimization(updateScriptLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ScriptLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateScriptLoadOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateScriptLoadOptimization operation with and without retries enabled
  @Test
  public void testUpdateScriptLoadOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateScriptLoadOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testUpdateScriptLoadOptimizationWOptions();
  }

  // Test the getImageLoadOptimization operation with a valid options model parameter
  @Test
  public void testGetImageLoadOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"image_load_optimization\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getImageLoadOptimizationPath = "/v1/testString/zones/testString/settings/image_load_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetImageLoadOptimizationOptions model
    GetImageLoadOptimizationOptions getImageLoadOptimizationOptionsModel = new GetImageLoadOptimizationOptions();

    // Invoke getImageLoadOptimization() with a valid options model and verify the result
    Response<ImageLoadOptimizationResp> response = zonesSettingsService.getImageLoadOptimization(getImageLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getImageLoadOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getImageLoadOptimization operation with and without retries enabled
  @Test
  public void testGetImageLoadOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetImageLoadOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testGetImageLoadOptimizationWOptions();
  }

  // Test the updateImageLoadOptimization operation with a valid options model parameter
  @Test
  public void testUpdateImageLoadOptimizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"image_load_optimization\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateImageLoadOptimizationPath = "/v1/testString/zones/testString/settings/image_load_optimization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateImageLoadOptimizationOptions model
    UpdateImageLoadOptimizationOptions updateImageLoadOptimizationOptionsModel = new UpdateImageLoadOptimizationOptions.Builder()
      .value("on")
      .build();

    // Invoke updateImageLoadOptimization() with a valid options model and verify the result
    Response<ImageLoadOptimizationResp> response = zonesSettingsService.updateImageLoadOptimization(updateImageLoadOptimizationOptionsModel).execute();
    assertNotNull(response);
    ImageLoadOptimizationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateImageLoadOptimizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateImageLoadOptimization operation with and without retries enabled
  @Test
  public void testUpdateImageLoadOptimizationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateImageLoadOptimizationWOptions();

    zonesSettingsService.disableRetries();
    testUpdateImageLoadOptimizationWOptions();
  }

  // Test the getMinify operation with a valid options model parameter
  @Test
  public void testGetMinifyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"minify\", \"value\": {\"css\": \"on\", \"html\": \"on\", \"js\": \"on\"}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMinifyPath = "/v1/testString/zones/testString/settings/minify";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMinifyOptions model
    GetMinifyOptions getMinifyOptionsModel = new GetMinifyOptions();

    // Invoke getMinify() with a valid options model and verify the result
    Response<MinifyResp> response = zonesSettingsService.getMinify(getMinifyOptionsModel).execute();
    assertNotNull(response);
    MinifyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMinifyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMinify operation with and without retries enabled
  @Test
  public void testGetMinifyWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetMinifyWOptions();

    zonesSettingsService.disableRetries();
    testGetMinifyWOptions();
  }

  // Test the updateMinify operation with a valid options model parameter
  @Test
  public void testUpdateMinifyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"minify\", \"value\": {\"css\": \"on\", \"html\": \"on\", \"js\": \"on\"}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMinifyPath = "/v1/testString/zones/testString/settings/minify";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MinifySettingValue model
    MinifySettingValue minifySettingValueModel = new MinifySettingValue.Builder()
      .css("off")
      .html("off")
      .js("off")
      .build();

    // Construct an instance of the UpdateMinifyOptions model
    UpdateMinifyOptions updateMinifyOptionsModel = new UpdateMinifyOptions.Builder()
      .value(minifySettingValueModel)
      .build();

    // Invoke updateMinify() with a valid options model and verify the result
    Response<MinifyResp> response = zonesSettingsService.updateMinify(updateMinifyOptionsModel).execute();
    assertNotNull(response);
    MinifyResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMinifyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMinify operation with and without retries enabled
  @Test
  public void testUpdateMinifyWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateMinifyWOptions();

    zonesSettingsService.disableRetries();
    testUpdateMinifyWOptions();
  }

  // Test the getMinTlsVersion operation with a valid options model parameter
  @Test
  public void testGetMinTlsVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"min_tls_version\", \"value\": \"1.2\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMinTlsVersionPath = "/v1/testString/zones/testString/settings/min_tls_version";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMinTlsVersionOptions model
    GetMinTlsVersionOptions getMinTlsVersionOptionsModel = new GetMinTlsVersionOptions();

    // Invoke getMinTlsVersion() with a valid options model and verify the result
    Response<MinTlsVersionResp> response = zonesSettingsService.getMinTlsVersion(getMinTlsVersionOptionsModel).execute();
    assertNotNull(response);
    MinTlsVersionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMinTlsVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMinTlsVersion operation with and without retries enabled
  @Test
  public void testGetMinTlsVersionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetMinTlsVersionWOptions();

    zonesSettingsService.disableRetries();
    testGetMinTlsVersionWOptions();
  }

  // Test the updateMinTlsVersion operation with a valid options model parameter
  @Test
  public void testUpdateMinTlsVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"min_tls_version\", \"value\": \"1.2\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMinTlsVersionPath = "/v1/testString/zones/testString/settings/min_tls_version";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateMinTlsVersionOptions model
    UpdateMinTlsVersionOptions updateMinTlsVersionOptionsModel = new UpdateMinTlsVersionOptions.Builder()
      .value("1.2")
      .build();

    // Invoke updateMinTlsVersion() with a valid options model and verify the result
    Response<MinTlsVersionResp> response = zonesSettingsService.updateMinTlsVersion(updateMinTlsVersionOptionsModel).execute();
    assertNotNull(response);
    MinTlsVersionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMinTlsVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMinTlsVersion operation with and without retries enabled
  @Test
  public void testUpdateMinTlsVersionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateMinTlsVersionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateMinTlsVersionWOptions();
  }

  // Test the getIpGeolocation operation with a valid options model parameter
  @Test
  public void testGetIpGeolocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ip_geolocation\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getIpGeolocationPath = "/v1/testString/zones/testString/settings/ip_geolocation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetIpGeolocationOptions model
    GetIpGeolocationOptions getIpGeolocationOptionsModel = new GetIpGeolocationOptions();

    // Invoke getIpGeolocation() with a valid options model and verify the result
    Response<IpGeolocationResp> response = zonesSettingsService.getIpGeolocation(getIpGeolocationOptionsModel).execute();
    assertNotNull(response);
    IpGeolocationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIpGeolocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getIpGeolocation operation with and without retries enabled
  @Test
  public void testGetIpGeolocationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetIpGeolocationWOptions();

    zonesSettingsService.disableRetries();
    testGetIpGeolocationWOptions();
  }

  // Test the updateIpGeolocation operation with a valid options model parameter
  @Test
  public void testUpdateIpGeolocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ip_geolocation\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateIpGeolocationPath = "/v1/testString/zones/testString/settings/ip_geolocation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateIpGeolocationOptions model
    UpdateIpGeolocationOptions updateIpGeolocationOptionsModel = new UpdateIpGeolocationOptions.Builder()
      .value("on")
      .build();

    // Invoke updateIpGeolocation() with a valid options model and verify the result
    Response<IpGeolocationResp> response = zonesSettingsService.updateIpGeolocation(updateIpGeolocationOptionsModel).execute();
    assertNotNull(response);
    IpGeolocationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIpGeolocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateIpGeolocation operation with and without retries enabled
  @Test
  public void testUpdateIpGeolocationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateIpGeolocationWOptions();

    zonesSettingsService.disableRetries();
    testUpdateIpGeolocationWOptions();
  }

  // Test the getServerSideExclude operation with a valid options model parameter
  @Test
  public void testGetServerSideExcludeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"server_side_exclude\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getServerSideExcludePath = "/v1/testString/zones/testString/settings/server_side_exclude";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetServerSideExcludeOptions model
    GetServerSideExcludeOptions getServerSideExcludeOptionsModel = new GetServerSideExcludeOptions();

    // Invoke getServerSideExclude() with a valid options model and verify the result
    Response<ServerSideExcludeResp> response = zonesSettingsService.getServerSideExclude(getServerSideExcludeOptionsModel).execute();
    assertNotNull(response);
    ServerSideExcludeResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getServerSideExcludePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getServerSideExclude operation with and without retries enabled
  @Test
  public void testGetServerSideExcludeWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetServerSideExcludeWOptions();

    zonesSettingsService.disableRetries();
    testGetServerSideExcludeWOptions();
  }

  // Test the updateServerSideExclude operation with a valid options model parameter
  @Test
  public void testUpdateServerSideExcludeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"server_side_exclude\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateServerSideExcludePath = "/v1/testString/zones/testString/settings/server_side_exclude";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateServerSideExcludeOptions model
    UpdateServerSideExcludeOptions updateServerSideExcludeOptionsModel = new UpdateServerSideExcludeOptions.Builder()
      .value("on")
      .build();

    // Invoke updateServerSideExclude() with a valid options model and verify the result
    Response<ServerSideExcludeResp> response = zonesSettingsService.updateServerSideExclude(updateServerSideExcludeOptionsModel).execute();
    assertNotNull(response);
    ServerSideExcludeResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateServerSideExcludePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateServerSideExclude operation with and without retries enabled
  @Test
  public void testUpdateServerSideExcludeWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateServerSideExcludeWOptions();

    zonesSettingsService.disableRetries();
    testUpdateServerSideExcludeWOptions();
  }

  // Test the getSecurityHeader operation with a valid options model parameter
  @Test
  public void testGetSecurityHeaderWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"security_header\", \"value\": {\"strict_transport_security\": {\"enabled\": true, \"max_age\": 86400, \"include_subdomains\": true, \"preload\": true, \"nosniff\": true}}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getSecurityHeaderPath = "/v1/testString/zones/testString/settings/security_header";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecurityHeaderOptions model
    GetSecurityHeaderOptions getSecurityHeaderOptionsModel = new GetSecurityHeaderOptions();

    // Invoke getSecurityHeader() with a valid options model and verify the result
    Response<SecurityHeaderResp> response = zonesSettingsService.getSecurityHeader(getSecurityHeaderOptionsModel).execute();
    assertNotNull(response);
    SecurityHeaderResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecurityHeaderPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecurityHeader operation with and without retries enabled
  @Test
  public void testGetSecurityHeaderWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetSecurityHeaderWOptions();

    zonesSettingsService.disableRetries();
    testGetSecurityHeaderWOptions();
  }

  // Test the updateSecurityHeader operation with a valid options model parameter
  @Test
  public void testUpdateSecurityHeaderWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"security_header\", \"value\": {\"strict_transport_security\": {\"enabled\": true, \"max_age\": 86400, \"include_subdomains\": true, \"preload\": true, \"nosniff\": true}}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateSecurityHeaderPath = "/v1/testString/zones/testString/settings/security_header";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecurityHeaderSettingValueStrictTransportSecurity model
    SecurityHeaderSettingValueStrictTransportSecurity securityHeaderSettingValueStrictTransportSecurityModel = new SecurityHeaderSettingValueStrictTransportSecurity.Builder()
      .enabled(true)
      .maxAge(Long.valueOf("86400"))
      .includeSubdomains(true)
      .preload(true)
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

    // Invoke updateSecurityHeader() with a valid options model and verify the result
    Response<SecurityHeaderResp> response = zonesSettingsService.updateSecurityHeader(updateSecurityHeaderOptionsModel).execute();
    assertNotNull(response);
    SecurityHeaderResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecurityHeaderPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSecurityHeader operation with and without retries enabled
  @Test
  public void testUpdateSecurityHeaderWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateSecurityHeaderWOptions();

    zonesSettingsService.disableRetries();
    testUpdateSecurityHeaderWOptions();
  }

  // Test the getMobileRedirect operation with a valid options model parameter
  @Test
  public void testGetMobileRedirectWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"mobile_redirect\", \"value\": {\"status\": \"on\", \"mobile_subdomain\": \"m\", \"strip_uri\": false}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMobileRedirectPath = "/v1/testString/zones/testString/settings/mobile_redirect";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMobileRedirectOptions model
    GetMobileRedirectOptions getMobileRedirectOptionsModel = new GetMobileRedirectOptions();

    // Invoke getMobileRedirect() with a valid options model and verify the result
    Response<MobileRedirectResp> response = zonesSettingsService.getMobileRedirect(getMobileRedirectOptionsModel).execute();
    assertNotNull(response);
    MobileRedirectResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMobileRedirectPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMobileRedirect operation with and without retries enabled
  @Test
  public void testGetMobileRedirectWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetMobileRedirectWOptions();

    zonesSettingsService.disableRetries();
    testGetMobileRedirectWOptions();
  }

  // Test the updateMobileRedirect operation with a valid options model parameter
  @Test
  public void testUpdateMobileRedirectWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"mobile_redirect\", \"value\": {\"status\": \"on\", \"mobile_subdomain\": \"m\", \"strip_uri\": false}, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMobileRedirectPath = "/v1/testString/zones/testString/settings/mobile_redirect";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MobileRedirecSettingValue model
    MobileRedirecSettingValue mobileRedirecSettingValueModel = new MobileRedirecSettingValue.Builder()
      .status("on")
      .mobileSubdomain("m")
      .stripUri(false)
      .build();

    // Construct an instance of the UpdateMobileRedirectOptions model
    UpdateMobileRedirectOptions updateMobileRedirectOptionsModel = new UpdateMobileRedirectOptions.Builder()
      .value(mobileRedirecSettingValueModel)
      .build();

    // Invoke updateMobileRedirect() with a valid options model and verify the result
    Response<MobileRedirectResp> response = zonesSettingsService.updateMobileRedirect(updateMobileRedirectOptionsModel).execute();
    assertNotNull(response);
    MobileRedirectResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMobileRedirectPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMobileRedirect operation with and without retries enabled
  @Test
  public void testUpdateMobileRedirectWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateMobileRedirectWOptions();

    zonesSettingsService.disableRetries();
    testUpdateMobileRedirectWOptions();
  }

  // Test the getPrefetchPreload operation with a valid options model parameter
  @Test
  public void testGetPrefetchPreloadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"prefetch_preload\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getPrefetchPreloadPath = "/v1/testString/zones/testString/settings/prefetch_preload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrefetchPreloadOptions model
    GetPrefetchPreloadOptions getPrefetchPreloadOptionsModel = new GetPrefetchPreloadOptions();

    // Invoke getPrefetchPreload() with a valid options model and verify the result
    Response<PrefetchPreloadResp> response = zonesSettingsService.getPrefetchPreload(getPrefetchPreloadOptionsModel).execute();
    assertNotNull(response);
    PrefetchPreloadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrefetchPreloadPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrefetchPreload operation with and without retries enabled
  @Test
  public void testGetPrefetchPreloadWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetPrefetchPreloadWOptions();

    zonesSettingsService.disableRetries();
    testGetPrefetchPreloadWOptions();
  }

  // Test the updatePrefetchPreload operation with a valid options model parameter
  @Test
  public void testUpdatePrefetchPreloadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"prefetch_preload\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updatePrefetchPreloadPath = "/v1/testString/zones/testString/settings/prefetch_preload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdatePrefetchPreloadOptions model
    UpdatePrefetchPreloadOptions updatePrefetchPreloadOptionsModel = new UpdatePrefetchPreloadOptions.Builder()
      .value("on")
      .build();

    // Invoke updatePrefetchPreload() with a valid options model and verify the result
    Response<PrefetchPreloadResp> response = zonesSettingsService.updatePrefetchPreload(updatePrefetchPreloadOptionsModel).execute();
    assertNotNull(response);
    PrefetchPreloadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrefetchPreloadPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrefetchPreload operation with and without retries enabled
  @Test
  public void testUpdatePrefetchPreloadWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdatePrefetchPreloadWOptions();

    zonesSettingsService.disableRetries();
    testUpdatePrefetchPreloadWOptions();
  }

  // Test the getHttp2 operation with a valid options model parameter
  @Test
  public void testGetHttp2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"http2\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHttp2Path = "/v1/testString/zones/testString/settings/http2";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHttp2Options model
    GetHttp2Options getHttp2OptionsModel = new GetHttp2Options();

    // Invoke getHttp2() with a valid options model and verify the result
    Response<Http2Resp> response = zonesSettingsService.getHttp2(getHttp2OptionsModel).execute();
    assertNotNull(response);
    Http2Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHttp2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHttp2 operation with and without retries enabled
  @Test
  public void testGetHttp2WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetHttp2WOptions();

    zonesSettingsService.disableRetries();
    testGetHttp2WOptions();
  }

  // Test the updateHttp2 operation with a valid options model parameter
  @Test
  public void testUpdateHttp2WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"http2\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHttp2Path = "/v1/testString/zones/testString/settings/http2";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateHttp2Options model
    UpdateHttp2Options updateHttp2OptionsModel = new UpdateHttp2Options.Builder()
      .value("on")
      .build();

    // Invoke updateHttp2() with a valid options model and verify the result
    Response<Http2Resp> response = zonesSettingsService.updateHttp2(updateHttp2OptionsModel).execute();
    assertNotNull(response);
    Http2Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHttp2Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateHttp2 operation with and without retries enabled
  @Test
  public void testUpdateHttp2WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateHttp2WOptions();

    zonesSettingsService.disableRetries();
    testUpdateHttp2WOptions();
  }

  // Test the getHttp3 operation with a valid options model parameter
  @Test
  public void testGetHttp3WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"http3\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHttp3Path = "/v1/testString/zones/testString/settings/http3";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHttp3Options model
    GetHttp3Options getHttp3OptionsModel = new GetHttp3Options();

    // Invoke getHttp3() with a valid options model and verify the result
    Response<Http3Resp> response = zonesSettingsService.getHttp3(getHttp3OptionsModel).execute();
    assertNotNull(response);
    Http3Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHttp3Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHttp3 operation with and without retries enabled
  @Test
  public void testGetHttp3WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetHttp3WOptions();

    zonesSettingsService.disableRetries();
    testGetHttp3WOptions();
  }

  // Test the updateHttp3 operation with a valid options model parameter
  @Test
  public void testUpdateHttp3WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"http3\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHttp3Path = "/v1/testString/zones/testString/settings/http3";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateHttp3Options model
    UpdateHttp3Options updateHttp3OptionsModel = new UpdateHttp3Options.Builder()
      .value("on")
      .build();

    // Invoke updateHttp3() with a valid options model and verify the result
    Response<Http3Resp> response = zonesSettingsService.updateHttp3(updateHttp3OptionsModel).execute();
    assertNotNull(response);
    Http3Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHttp3Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateHttp3 operation with and without retries enabled
  @Test
  public void testUpdateHttp3WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateHttp3WOptions();

    zonesSettingsService.disableRetries();
    testUpdateHttp3WOptions();
  }

  // Test the getIpv6 operation with a valid options model parameter
  @Test
  public void testGetIpv6WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ipv6\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getIpv6Path = "/v1/testString/zones/testString/settings/ipv6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetIpv6Options model
    GetIpv6Options getIpv6OptionsModel = new GetIpv6Options();

    // Invoke getIpv6() with a valid options model and verify the result
    Response<Ipv6Resp> response = zonesSettingsService.getIpv6(getIpv6OptionsModel).execute();
    assertNotNull(response);
    Ipv6Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getIpv6Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getIpv6 operation with and without retries enabled
  @Test
  public void testGetIpv6WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetIpv6WOptions();

    zonesSettingsService.disableRetries();
    testGetIpv6WOptions();
  }

  // Test the updateIpv6 operation with a valid options model parameter
  @Test
  public void testUpdateIpv6WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ipv6\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateIpv6Path = "/v1/testString/zones/testString/settings/ipv6";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateIpv6Options model
    UpdateIpv6Options updateIpv6OptionsModel = new UpdateIpv6Options.Builder()
      .value("on")
      .build();

    // Invoke updateIpv6() with a valid options model and verify the result
    Response<Ipv6Resp> response = zonesSettingsService.updateIpv6(updateIpv6OptionsModel).execute();
    assertNotNull(response);
    Ipv6Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateIpv6Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateIpv6 operation with and without retries enabled
  @Test
  public void testUpdateIpv6WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateIpv6WOptions();

    zonesSettingsService.disableRetries();
    testUpdateIpv6WOptions();
  }

  // Test the getWebSockets operation with a valid options model parameter
  @Test
  public void testGetWebSocketsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"websockets\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getWebSocketsPath = "/v1/testString/zones/testString/settings/websockets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWebSocketsOptions model
    GetWebSocketsOptions getWebSocketsOptionsModel = new GetWebSocketsOptions();

    // Invoke getWebSockets() with a valid options model and verify the result
    Response<WebsocketsResp> response = zonesSettingsService.getWebSockets(getWebSocketsOptionsModel).execute();
    assertNotNull(response);
    WebsocketsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWebSocketsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWebSockets operation with and without retries enabled
  @Test
  public void testGetWebSocketsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetWebSocketsWOptions();

    zonesSettingsService.disableRetries();
    testGetWebSocketsWOptions();
  }

  // Test the updateWebSockets operation with a valid options model parameter
  @Test
  public void testUpdateWebSocketsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"websockets\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateWebSocketsPath = "/v1/testString/zones/testString/settings/websockets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateWebSocketsOptions model
    UpdateWebSocketsOptions updateWebSocketsOptionsModel = new UpdateWebSocketsOptions.Builder()
      .value("on")
      .build();

    // Invoke updateWebSockets() with a valid options model and verify the result
    Response<WebsocketsResp> response = zonesSettingsService.updateWebSockets(updateWebSocketsOptionsModel).execute();
    assertNotNull(response);
    WebsocketsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWebSocketsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateWebSockets operation with and without retries enabled
  @Test
  public void testUpdateWebSocketsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateWebSocketsWOptions();

    zonesSettingsService.disableRetries();
    testUpdateWebSocketsWOptions();
  }

  // Test the getPseudoIpv4 operation with a valid options model parameter
  @Test
  public void testGetPseudoIpv4WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"pseudo_ipv4\", \"value\": \"add_header\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getPseudoIpv4Path = "/v1/testString/zones/testString/settings/pseudo_ipv4";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPseudoIpv4Options model
    GetPseudoIpv4Options getPseudoIpv4OptionsModel = new GetPseudoIpv4Options();

    // Invoke getPseudoIpv4() with a valid options model and verify the result
    Response<PseudoIpv4Resp> response = zonesSettingsService.getPseudoIpv4(getPseudoIpv4OptionsModel).execute();
    assertNotNull(response);
    PseudoIpv4Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPseudoIpv4Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPseudoIpv4 operation with and without retries enabled
  @Test
  public void testGetPseudoIpv4WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetPseudoIpv4WOptions();

    zonesSettingsService.disableRetries();
    testGetPseudoIpv4WOptions();
  }

  // Test the updatePseudoIpv4 operation with a valid options model parameter
  @Test
  public void testUpdatePseudoIpv4WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"pseudo_ipv4\", \"value\": \"add_header\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updatePseudoIpv4Path = "/v1/testString/zones/testString/settings/pseudo_ipv4";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdatePseudoIpv4Options model
    UpdatePseudoIpv4Options updatePseudoIpv4OptionsModel = new UpdatePseudoIpv4Options.Builder()
      .value("add_header")
      .build();

    // Invoke updatePseudoIpv4() with a valid options model and verify the result
    Response<PseudoIpv4Resp> response = zonesSettingsService.updatePseudoIpv4(updatePseudoIpv4OptionsModel).execute();
    assertNotNull(response);
    PseudoIpv4Resp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePseudoIpv4Path);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePseudoIpv4 operation with and without retries enabled
  @Test
  public void testUpdatePseudoIpv4WRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdatePseudoIpv4WOptions();

    zonesSettingsService.disableRetries();
    testUpdatePseudoIpv4WOptions();
  }

  // Test the getResponseBuffering operation with a valid options model parameter
  @Test
  public void testGetResponseBufferingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"response_buffering\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getResponseBufferingPath = "/v1/testString/zones/testString/settings/response_buffering";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetResponseBufferingOptions model
    GetResponseBufferingOptions getResponseBufferingOptionsModel = new GetResponseBufferingOptions();

    // Invoke getResponseBuffering() with a valid options model and verify the result
    Response<ResponseBufferingResp> response = zonesSettingsService.getResponseBuffering(getResponseBufferingOptionsModel).execute();
    assertNotNull(response);
    ResponseBufferingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getResponseBufferingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getResponseBuffering operation with and without retries enabled
  @Test
  public void testGetResponseBufferingWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetResponseBufferingWOptions();

    zonesSettingsService.disableRetries();
    testGetResponseBufferingWOptions();
  }

  // Test the updateResponseBuffering operation with a valid options model parameter
  @Test
  public void testUpdateResponseBufferingWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"response_buffering\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateResponseBufferingPath = "/v1/testString/zones/testString/settings/response_buffering";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateResponseBufferingOptions model
    UpdateResponseBufferingOptions updateResponseBufferingOptionsModel = new UpdateResponseBufferingOptions.Builder()
      .value("on")
      .build();

    // Invoke updateResponseBuffering() with a valid options model and verify the result
    Response<ResponseBufferingResp> response = zonesSettingsService.updateResponseBuffering(updateResponseBufferingOptionsModel).execute();
    assertNotNull(response);
    ResponseBufferingResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateResponseBufferingPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateResponseBuffering operation with and without retries enabled
  @Test
  public void testUpdateResponseBufferingWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateResponseBufferingWOptions();

    zonesSettingsService.disableRetries();
    testUpdateResponseBufferingWOptions();
  }

  // Test the getHotlinkProtection operation with a valid options model parameter
  @Test
  public void testGetHotlinkProtectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"hotlink_protection\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getHotlinkProtectionPath = "/v1/testString/zones/testString/settings/hotlink_protection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHotlinkProtectionOptions model
    GetHotlinkProtectionOptions getHotlinkProtectionOptionsModel = new GetHotlinkProtectionOptions();

    // Invoke getHotlinkProtection() with a valid options model and verify the result
    Response<HotlinkProtectionResp> response = zonesSettingsService.getHotlinkProtection(getHotlinkProtectionOptionsModel).execute();
    assertNotNull(response);
    HotlinkProtectionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHotlinkProtectionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHotlinkProtection operation with and without retries enabled
  @Test
  public void testGetHotlinkProtectionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetHotlinkProtectionWOptions();

    zonesSettingsService.disableRetries();
    testGetHotlinkProtectionWOptions();
  }

  // Test the updateHotlinkProtection operation with a valid options model parameter
  @Test
  public void testUpdateHotlinkProtectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"hotlink_protection\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateHotlinkProtectionPath = "/v1/testString/zones/testString/settings/hotlink_protection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateHotlinkProtectionOptions model
    UpdateHotlinkProtectionOptions updateHotlinkProtectionOptionsModel = new UpdateHotlinkProtectionOptions.Builder()
      .value("on")
      .build();

    // Invoke updateHotlinkProtection() with a valid options model and verify the result
    Response<HotlinkProtectionResp> response = zonesSettingsService.updateHotlinkProtection(updateHotlinkProtectionOptionsModel).execute();
    assertNotNull(response);
    HotlinkProtectionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateHotlinkProtectionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateHotlinkProtection operation with and without retries enabled
  @Test
  public void testUpdateHotlinkProtectionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateHotlinkProtectionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateHotlinkProtectionWOptions();
  }

  // Test the getMaxUpload operation with a valid options model parameter
  @Test
  public void testGetMaxUploadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"max_upload\", \"value\": 300, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getMaxUploadPath = "/v1/testString/zones/testString/settings/max_upload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMaxUploadOptions model
    GetMaxUploadOptions getMaxUploadOptionsModel = new GetMaxUploadOptions();

    // Invoke getMaxUpload() with a valid options model and verify the result
    Response<MaxUploadResp> response = zonesSettingsService.getMaxUpload(getMaxUploadOptionsModel).execute();
    assertNotNull(response);
    MaxUploadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMaxUploadPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMaxUpload operation with and without retries enabled
  @Test
  public void testGetMaxUploadWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetMaxUploadWOptions();

    zonesSettingsService.disableRetries();
    testGetMaxUploadWOptions();
  }

  // Test the updateMaxUpload operation with a valid options model parameter
  @Test
  public void testUpdateMaxUploadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"max_upload\", \"value\": 300, \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateMaxUploadPath = "/v1/testString/zones/testString/settings/max_upload";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateMaxUploadOptions model
    UpdateMaxUploadOptions updateMaxUploadOptionsModel = new UpdateMaxUploadOptions.Builder()
      .value(Long.valueOf("300"))
      .build();

    // Invoke updateMaxUpload() with a valid options model and verify the result
    Response<MaxUploadResp> response = zonesSettingsService.updateMaxUpload(updateMaxUploadOptionsModel).execute();
    assertNotNull(response);
    MaxUploadResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMaxUploadPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMaxUpload operation with and without retries enabled
  @Test
  public void testUpdateMaxUploadWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateMaxUploadWOptions();

    zonesSettingsService.disableRetries();
    testUpdateMaxUploadWOptions();
  }

  // Test the getTlsClientAuth operation with a valid options model parameter
  @Test
  public void testGetTlsClientAuthWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"tls_client_auth\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getTlsClientAuthPath = "/v1/testString/zones/testString/settings/tls_client_auth";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTlsClientAuthOptions model
    GetTlsClientAuthOptions getTlsClientAuthOptionsModel = new GetTlsClientAuthOptions();

    // Invoke getTlsClientAuth() with a valid options model and verify the result
    Response<TlsClientAuthResp> response = zonesSettingsService.getTlsClientAuth(getTlsClientAuthOptionsModel).execute();
    assertNotNull(response);
    TlsClientAuthResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTlsClientAuthPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getTlsClientAuth operation with and without retries enabled
  @Test
  public void testGetTlsClientAuthWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetTlsClientAuthWOptions();

    zonesSettingsService.disableRetries();
    testGetTlsClientAuthWOptions();
  }

  // Test the updateTlsClientAuth operation with a valid options model parameter
  @Test
  public void testUpdateTlsClientAuthWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"tls_client_auth\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateTlsClientAuthPath = "/v1/testString/zones/testString/settings/tls_client_auth";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTlsClientAuthOptions model
    UpdateTlsClientAuthOptions updateTlsClientAuthOptionsModel = new UpdateTlsClientAuthOptions.Builder()
      .value("on")
      .build();

    // Invoke updateTlsClientAuth() with a valid options model and verify the result
    Response<TlsClientAuthResp> response = zonesSettingsService.updateTlsClientAuth(updateTlsClientAuthOptionsModel).execute();
    assertNotNull(response);
    TlsClientAuthResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTlsClientAuthPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateTlsClientAuth operation with and without retries enabled
  @Test
  public void testUpdateTlsClientAuthWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateTlsClientAuthWOptions();

    zonesSettingsService.disableRetries();
    testUpdateTlsClientAuthWOptions();
  }

  // Test the getBrotli operation with a valid options model parameter
  @Test
  public void testGetBrotliWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"brotli\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getBrotliPath = "/v1/testString/zones/testString/settings/brotli";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBrotliOptions model
    GetBrotliOptions getBrotliOptionsModel = new GetBrotliOptions();

    // Invoke getBrotli() with a valid options model and verify the result
    Response<BrotliResp> response = zonesSettingsService.getBrotli(getBrotliOptionsModel).execute();
    assertNotNull(response);
    BrotliResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBrotliPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBrotli operation with and without retries enabled
  @Test
  public void testGetBrotliWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetBrotliWOptions();

    zonesSettingsService.disableRetries();
    testGetBrotliWOptions();
  }

  // Test the updateBrotli operation with a valid options model parameter
  @Test
  public void testUpdateBrotliWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"brotli\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateBrotliPath = "/v1/testString/zones/testString/settings/brotli";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateBrotliOptions model
    UpdateBrotliOptions updateBrotliOptionsModel = new UpdateBrotliOptions.Builder()
      .value("on")
      .build();

    // Invoke updateBrotli() with a valid options model and verify the result
    Response<BrotliResp> response = zonesSettingsService.updateBrotli(updateBrotliOptionsModel).execute();
    assertNotNull(response);
    BrotliResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBrotliPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBrotli operation with and without retries enabled
  @Test
  public void testUpdateBrotliWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateBrotliWOptions();

    zonesSettingsService.disableRetries();
    testUpdateBrotliWOptions();
  }

  // Test the getProxyReadTimeout operation with a valid options model parameter
  @Test
  public void testGetProxyReadTimeoutWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"proxy_read_timeout\", \"value\": 100, \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getProxyReadTimeoutPath = "/v1/testString/zones/testString/settings/proxy_read_timeout";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProxyReadTimeoutOptions model
    GetProxyReadTimeoutOptions getProxyReadTimeoutOptionsModel = new GetProxyReadTimeoutOptions();

    // Invoke getProxyReadTimeout() with a valid options model and verify the result
    Response<ProxyReadTimeoutResp> response = zonesSettingsService.getProxyReadTimeout(getProxyReadTimeoutOptionsModel).execute();
    assertNotNull(response);
    ProxyReadTimeoutResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProxyReadTimeoutPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getProxyReadTimeout operation with and without retries enabled
  @Test
  public void testGetProxyReadTimeoutWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetProxyReadTimeoutWOptions();

    zonesSettingsService.disableRetries();
    testGetProxyReadTimeoutWOptions();
  }

  // Test the updateProxyReadTimeout operation with a valid options model parameter
  @Test
  public void testUpdateProxyReadTimeoutWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"proxy_read_timeout\", \"value\": 100, \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateProxyReadTimeoutPath = "/v1/testString/zones/testString/settings/proxy_read_timeout";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateProxyReadTimeoutOptions model
    UpdateProxyReadTimeoutOptions updateProxyReadTimeoutOptionsModel = new UpdateProxyReadTimeoutOptions.Builder()
      .value(Double.valueOf("600"))
      .build();

    // Invoke updateProxyReadTimeout() with a valid options model and verify the result
    Response<ProxyReadTimeoutResp> response = zonesSettingsService.updateProxyReadTimeout(updateProxyReadTimeoutOptionsModel).execute();
    assertNotNull(response);
    ProxyReadTimeoutResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateProxyReadTimeoutPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateProxyReadTimeout operation with and without retries enabled
  @Test
  public void testUpdateProxyReadTimeoutWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateProxyReadTimeoutWOptions();

    zonesSettingsService.disableRetries();
    testUpdateProxyReadTimeoutWOptions();
  }

  // Test the getBrowserCheck operation with a valid options model parameter
  @Test
  public void testGetBrowserCheckWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"browser_check\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:14.506Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getBrowserCheckPath = "/v1/testString/zones/testString/settings/browser_check";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBrowserCheckOptions model
    GetBrowserCheckOptions getBrowserCheckOptionsModel = new GetBrowserCheckOptions();

    // Invoke getBrowserCheck() with a valid options model and verify the result
    Response<BrowserCheckResp> response = zonesSettingsService.getBrowserCheck(getBrowserCheckOptionsModel).execute();
    assertNotNull(response);
    BrowserCheckResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBrowserCheckPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBrowserCheck operation with and without retries enabled
  @Test
  public void testGetBrowserCheckWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetBrowserCheckWOptions();

    zonesSettingsService.disableRetries();
    testGetBrowserCheckWOptions();
  }

  // Test the updateBrowserCheck operation with a valid options model parameter
  @Test
  public void testUpdateBrowserCheckWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"browser_check\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:14.506Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateBrowserCheckPath = "/v1/testString/zones/testString/settings/browser_check";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateBrowserCheckOptions model
    UpdateBrowserCheckOptions updateBrowserCheckOptionsModel = new UpdateBrowserCheckOptions.Builder()
      .value("on")
      .build();

    // Invoke updateBrowserCheck() with a valid options model and verify the result
    Response<BrowserCheckResp> response = zonesSettingsService.updateBrowserCheck(updateBrowserCheckOptionsModel).execute();
    assertNotNull(response);
    BrowserCheckResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBrowserCheckPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBrowserCheck operation with and without retries enabled
  @Test
  public void testUpdateBrowserCheckWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateBrowserCheckWOptions();

    zonesSettingsService.disableRetries();
    testUpdateBrowserCheckWOptions();
  }

  // Test the getEnableErrorPagesOn operation with a valid options model parameter
  @Test
  public void testGetEnableErrorPagesOnWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_error_page_pass_thru\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getEnableErrorPagesOnPath = "/v1/testString/zones/testString/settings/origin_error_page_pass_thru";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEnableErrorPagesOnOptions model
    GetEnableErrorPagesOnOptions getEnableErrorPagesOnOptionsModel = new GetEnableErrorPagesOnOptions();

    // Invoke getEnableErrorPagesOn() with a valid options model and verify the result
    Response<OriginErrorPagePassThruResp> response = zonesSettingsService.getEnableErrorPagesOn(getEnableErrorPagesOnOptionsModel).execute();
    assertNotNull(response);
    OriginErrorPagePassThruResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEnableErrorPagesOnPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEnableErrorPagesOn operation with and without retries enabled
  @Test
  public void testGetEnableErrorPagesOnWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetEnableErrorPagesOnWOptions();

    zonesSettingsService.disableRetries();
    testGetEnableErrorPagesOnWOptions();
  }

  // Test the updateEnableErrorPagesOn operation with a valid options model parameter
  @Test
  public void testUpdateEnableErrorPagesOnWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_error_page_pass_thru\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:52.826Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateEnableErrorPagesOnPath = "/v1/testString/zones/testString/settings/origin_error_page_pass_thru";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateEnableErrorPagesOnOptions model
    UpdateEnableErrorPagesOnOptions updateEnableErrorPagesOnOptionsModel = new UpdateEnableErrorPagesOnOptions.Builder()
      .value("on")
      .build();

    // Invoke updateEnableErrorPagesOn() with a valid options model and verify the result
    Response<OriginErrorPagePassThruResp> response = zonesSettingsService.updateEnableErrorPagesOn(updateEnableErrorPagesOnOptionsModel).execute();
    assertNotNull(response);
    OriginErrorPagePassThruResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEnableErrorPagesOnPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateEnableErrorPagesOn operation with and without retries enabled
  @Test
  public void testUpdateEnableErrorPagesOnWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateEnableErrorPagesOnWOptions();

    zonesSettingsService.disableRetries();
    testUpdateEnableErrorPagesOnWOptions();
  }

  // Test the getWebApplicationFirewall operation with a valid options model parameter
  @Test
  public void testGetWebApplicationFirewallWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"waf\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:43.889Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getWebApplicationFirewallPath = "/v1/testString/zones/testString/settings/waf";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWebApplicationFirewallOptions model
    GetWebApplicationFirewallOptions getWebApplicationFirewallOptionsModel = new GetWebApplicationFirewallOptions();

    // Invoke getWebApplicationFirewall() with a valid options model and verify the result
    Response<WafResp> response = zonesSettingsService.getWebApplicationFirewall(getWebApplicationFirewallOptionsModel).execute();
    assertNotNull(response);
    WafResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWebApplicationFirewallPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getWebApplicationFirewall operation with and without retries enabled
  @Test
  public void testGetWebApplicationFirewallWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetWebApplicationFirewallWOptions();

    zonesSettingsService.disableRetries();
    testGetWebApplicationFirewallWOptions();
  }

  // Test the updateWebApplicationFirewall operation with a valid options model parameter
  @Test
  public void testUpdateWebApplicationFirewallWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"waf\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2018-12-08T18:57:43.889Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateWebApplicationFirewallPath = "/v1/testString/zones/testString/settings/waf";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateWebApplicationFirewallOptions model
    UpdateWebApplicationFirewallOptions updateWebApplicationFirewallOptionsModel = new UpdateWebApplicationFirewallOptions.Builder()
      .value("on")
      .build();

    // Invoke updateWebApplicationFirewall() with a valid options model and verify the result
    Response<WafResp> response = zonesSettingsService.updateWebApplicationFirewall(updateWebApplicationFirewallOptionsModel).execute();
    assertNotNull(response);
    WafResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWebApplicationFirewallPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateWebApplicationFirewall operation with and without retries enabled
  @Test
  public void testUpdateWebApplicationFirewallWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateWebApplicationFirewallWOptions();

    zonesSettingsService.disableRetries();
    testUpdateWebApplicationFirewallWOptions();
  }

  // Test the getCiphers operation with a valid options model parameter
  @Test
  public void testGetCiphersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ciphers\", \"value\": [\"value\"], \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getCiphersPath = "/v1/testString/zones/testString/settings/ciphers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCiphersOptions model
    GetCiphersOptions getCiphersOptionsModel = new GetCiphersOptions();

    // Invoke getCiphers() with a valid options model and verify the result
    Response<CiphersResp> response = zonesSettingsService.getCiphers(getCiphersOptionsModel).execute();
    assertNotNull(response);
    CiphersResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCiphersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCiphers operation with and without retries enabled
  @Test
  public void testGetCiphersWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetCiphersWOptions();

    zonesSettingsService.disableRetries();
    testGetCiphersWOptions();
  }

  // Test the updateCiphers operation with a valid options model parameter
  @Test
  public void testUpdateCiphersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"ciphers\", \"value\": [\"value\"], \"editable\": true, \"modified_on\": \"2018-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateCiphersPath = "/v1/testString/zones/testString/settings/ciphers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateCiphersOptions model
    UpdateCiphersOptions updateCiphersOptionsModel = new UpdateCiphersOptions.Builder()
      .value(java.util.Arrays.asList("AES256-GCM-SHA384", "AES256-SHA256"))
      .build();

    // Invoke updateCiphers() with a valid options model and verify the result
    Response<CiphersResp> response = zonesSettingsService.updateCiphers(updateCiphersOptionsModel).execute();
    assertNotNull(response);
    CiphersResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCiphersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCiphers operation with and without retries enabled
  @Test
  public void testUpdateCiphersWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateCiphersWOptions();

    zonesSettingsService.disableRetries();
    testUpdateCiphersWOptions();
  }

  // Test the getOriginMaxHttpVersion operation with a valid options model parameter
  @Test
  public void testGetOriginMaxHttpVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_max_http_version\", \"value\": \"1\", \"editable\": true, \"modified_on\": \"2023-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getOriginMaxHttpVersionPath = "/v1/testString/zones/testString/settings/origin_max_http_version";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetOriginMaxHttpVersionOptions model
    GetOriginMaxHttpVersionOptions getOriginMaxHttpVersionOptionsModel = new GetOriginMaxHttpVersionOptions();

    // Invoke getOriginMaxHttpVersion() with a valid options model and verify the result
    Response<OriginMaxHttpVersionResp> response = zonesSettingsService.getOriginMaxHttpVersion(getOriginMaxHttpVersionOptionsModel).execute();
    assertNotNull(response);
    OriginMaxHttpVersionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOriginMaxHttpVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getOriginMaxHttpVersion operation with and without retries enabled
  @Test
  public void testGetOriginMaxHttpVersionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetOriginMaxHttpVersionWOptions();

    zonesSettingsService.disableRetries();
    testGetOriginMaxHttpVersionWOptions();
  }

  // Test the updateOriginMaxHttpVersion operation with a valid options model parameter
  @Test
  public void testUpdateOriginMaxHttpVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_max_http_version\", \"value\": \"1\", \"editable\": true, \"modified_on\": \"2023-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateOriginMaxHttpVersionPath = "/v1/testString/zones/testString/settings/origin_max_http_version";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateOriginMaxHttpVersionOptions model
    UpdateOriginMaxHttpVersionOptions updateOriginMaxHttpVersionOptionsModel = new UpdateOriginMaxHttpVersionOptions.Builder()
      .value("1")
      .build();

    // Invoke updateOriginMaxHttpVersion() with a valid options model and verify the result
    Response<OriginMaxHttpVersionResp> response = zonesSettingsService.updateOriginMaxHttpVersion(updateOriginMaxHttpVersionOptionsModel).execute();
    assertNotNull(response);
    OriginMaxHttpVersionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOriginMaxHttpVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateOriginMaxHttpVersion operation with and without retries enabled
  @Test
  public void testUpdateOriginMaxHttpVersionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateOriginMaxHttpVersionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateOriginMaxHttpVersionWOptions();
  }

  // Test the getOriginPostQuantumEncryption operation with a valid options model parameter
  @Test
  public void testGetOriginPostQuantumEncryptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_pqe\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2023-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getOriginPostQuantumEncryptionPath = "/v1/testString/zones/testString/cache/origin_post_quantum_encryption";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetOriginPostQuantumEncryptionOptions model
    GetOriginPostQuantumEncryptionOptions getOriginPostQuantumEncryptionOptionsModel = new GetOriginPostQuantumEncryptionOptions();

    // Invoke getOriginPostQuantumEncryption() with a valid options model and verify the result
    Response<OriginPostQuantumEncryptionResp> response = zonesSettingsService.getOriginPostQuantumEncryption(getOriginPostQuantumEncryptionOptionsModel).execute();
    assertNotNull(response);
    OriginPostQuantumEncryptionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOriginPostQuantumEncryptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getOriginPostQuantumEncryption operation with and without retries enabled
  @Test
  public void testGetOriginPostQuantumEncryptionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetOriginPostQuantumEncryptionWOptions();

    zonesSettingsService.disableRetries();
    testGetOriginPostQuantumEncryptionWOptions();
  }

  // Test the updateOriginPostQuantumEncryption operation with a valid options model parameter
  @Test
  public void testUpdateOriginPostQuantumEncryptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"origin_pqe\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2023-09-14T09:49:19.524Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateOriginPostQuantumEncryptionPath = "/v1/testString/zones/testString/cache/origin_post_quantum_encryption";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateOriginPostQuantumEncryptionOptions model
    UpdateOriginPostQuantumEncryptionOptions updateOriginPostQuantumEncryptionOptionsModel = new UpdateOriginPostQuantumEncryptionOptions.Builder()
      .value("preferred")
      .build();

    // Invoke updateOriginPostQuantumEncryption() with a valid options model and verify the result
    Response<OriginPostQuantumEncryptionResp> response = zonesSettingsService.updateOriginPostQuantumEncryption(updateOriginPostQuantumEncryptionOptionsModel).execute();
    assertNotNull(response);
    OriginPostQuantumEncryptionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateOriginPostQuantumEncryptionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateOriginPostQuantumEncryption operation with and without retries enabled
  @Test
  public void testUpdateOriginPostQuantumEncryptionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateOriginPostQuantumEncryptionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateOriginPostQuantumEncryptionWOptions();
  }

  // Test the getLogRetention operation with a valid options model parameter
  @Test
  public void testGetLogRetentionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"result\": {\"flag\": true}, \"errors\": [\"errors\"], \"messages\": [\"messages\"]}";
    String getLogRetentionPath = "/v1/testString/zones/testString/logs/retention";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLogRetentionOptions model
    GetLogRetentionOptions getLogRetentionOptionsModel = new GetLogRetentionOptions.Builder()
      .crn("testString")
      .zoneIdentifier("testString")
      .build();

    // Invoke getLogRetention() with a valid options model and verify the result
    Response<LogRetentionResp> response = zonesSettingsService.getLogRetention(getLogRetentionOptionsModel).execute();
    assertNotNull(response);
    LogRetentionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLogRetentionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLogRetention operation with and without retries enabled
  @Test
  public void testGetLogRetentionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetLogRetentionWOptions();

    zonesSettingsService.disableRetries();
    testGetLogRetentionWOptions();
  }

  // Test the getLogRetention operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLogRetentionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesSettingsService.getLogRetention(null).execute();
  }

  // Test the updateLogRetention operation with a valid options model parameter
  @Test
  public void testUpdateLogRetentionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"result\": {\"flag\": true}, \"errors\": [\"errors\"], \"messages\": [\"messages\"]}";
    String updateLogRetentionPath = "/v1/testString/zones/testString/logs/retention";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateLogRetentionOptions model
    UpdateLogRetentionOptions updateLogRetentionOptionsModel = new UpdateLogRetentionOptions.Builder()
      .crn("testString")
      .zoneIdentifier("testString")
      .flag(true)
      .build();

    // Invoke updateLogRetention() with a valid options model and verify the result
    Response<LogRetentionResp> response = zonesSettingsService.updateLogRetention(updateLogRetentionOptionsModel).execute();
    assertNotNull(response);
    LogRetentionResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLogRetentionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateLogRetention operation with and without retries enabled
  @Test
  public void testUpdateLogRetentionWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateLogRetentionWOptions();

    zonesSettingsService.disableRetries();
    testUpdateLogRetentionWOptions();
  }

  // Test the updateLogRetention operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLogRetentionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesSettingsService.updateLogRetention(null).execute();
  }

  // Test the getBotManagement operation with a valid options model parameter
  @Test
  public void testGetBotManagementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"session_score\": false, \"enable_js\": false, \"use_latest_model\": false, \"ai_bots_protection\": \"block\"}}";
    String getBotManagementPath = "/v1/testString/zones/testString/bot_management";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBotManagementOptions model
    GetBotManagementOptions getBotManagementOptionsModel = new GetBotManagementOptions();

    // Invoke getBotManagement() with a valid options model and verify the result
    Response<BotMgtResp> response = zonesSettingsService.getBotManagement(getBotManagementOptionsModel).execute();
    assertNotNull(response);
    BotMgtResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBotManagementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBotManagement operation with and without retries enabled
  @Test
  public void testGetBotManagementWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetBotManagementWOptions();

    zonesSettingsService.disableRetries();
    testGetBotManagementWOptions();
  }

  // Test the updateBotManagement operation with a valid options model parameter
  @Test
  public void testUpdateBotManagementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"session_score\": false, \"enable_js\": false, \"use_latest_model\": false, \"ai_bots_protection\": \"block\"}}";
    String updateBotManagementPath = "/v1/testString/zones/testString/bot_management";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateBotManagementOptions model
    UpdateBotManagementOptions updateBotManagementOptionsModel = new UpdateBotManagementOptions.Builder()
      .sessionScore(false)
      .enableJs(false)
      .useLatestModel(false)
      .aiBotsProtection("block")
      .build();

    // Invoke updateBotManagement() with a valid options model and verify the result
    Response<BotMgtResp> response = zonesSettingsService.updateBotManagement(updateBotManagementOptionsModel).execute();
    assertNotNull(response);
    BotMgtResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBotManagementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBotManagement operation with and without retries enabled
  @Test
  public void testUpdateBotManagementWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateBotManagementWOptions();

    zonesSettingsService.disableRetries();
    testUpdateBotManagementWOptions();
  }

  // Test the getReplaceInsecureJs operation with a valid options model parameter
  @Test
  public void testGetReplaceInsecureJsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"replace_insecure_js\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"result_info\": {\"anyKey\": \"anyValue\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getReplaceInsecureJsPath = "/v1/testString/zones/testString/settings/replace_insecure_js";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetReplaceInsecureJsOptions model
    GetReplaceInsecureJsOptions getReplaceInsecureJsOptionsModel = new GetReplaceInsecureJsOptions();

    // Invoke getReplaceInsecureJs() with a valid options model and verify the result
    Response<ReplaceInsecureJsResp> response = zonesSettingsService.getReplaceInsecureJs(getReplaceInsecureJsOptionsModel).execute();
    assertNotNull(response);
    ReplaceInsecureJsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getReplaceInsecureJsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getReplaceInsecureJs operation with and without retries enabled
  @Test
  public void testGetReplaceInsecureJsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetReplaceInsecureJsWOptions();

    zonesSettingsService.disableRetries();
    testGetReplaceInsecureJsWOptions();
  }

  // Test the updateReplaceInsecureJs operation with a valid options model parameter
  @Test
  public void testUpdateReplaceInsecureJsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"replace_insecure_js\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"result_info\": {\"anyKey\": \"anyValue\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateReplaceInsecureJsPath = "/v1/testString/zones/testString/settings/replace_insecure_js";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateReplaceInsecureJsOptions model
    UpdateReplaceInsecureJsOptions updateReplaceInsecureJsOptionsModel = new UpdateReplaceInsecureJsOptions.Builder()
      .value("off")
      .build();

    // Invoke updateReplaceInsecureJs() with a valid options model and verify the result
    Response<ReplaceInsecureJsResp> response = zonesSettingsService.updateReplaceInsecureJs(updateReplaceInsecureJsOptionsModel).execute();
    assertNotNull(response);
    ReplaceInsecureJsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateReplaceInsecureJsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateReplaceInsecureJs operation with and without retries enabled
  @Test
  public void testUpdateReplaceInsecureJsWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateReplaceInsecureJsWOptions();

    zonesSettingsService.disableRetries();
    testUpdateReplaceInsecureJsWOptions();
  }

  // Test the getEmailObfuscation operation with a valid options model parameter
  @Test
  public void testGetEmailObfuscationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"email_obfuscation\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"result_info\": {\"anyKey\": \"anyValue\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getEmailObfuscationPath = "/v1/testString/zones/testString/settings/email_obfuscation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEmailObfuscationOptions model
    GetEmailObfuscationOptions getEmailObfuscationOptionsModel = new GetEmailObfuscationOptions();

    // Invoke getEmailObfuscation() with a valid options model and verify the result
    Response<EmailObfuscationResp> response = zonesSettingsService.getEmailObfuscation(getEmailObfuscationOptionsModel).execute();
    assertNotNull(response);
    EmailObfuscationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEmailObfuscationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEmailObfuscation operation with and without retries enabled
  @Test
  public void testGetEmailObfuscationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetEmailObfuscationWOptions();

    zonesSettingsService.disableRetries();
    testGetEmailObfuscationWOptions();
  }

  // Test the updateEmailObfuscation operation with a valid options model parameter
  @Test
  public void testUpdateEmailObfuscationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"email_obfuscation\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"result_info\": {\"anyKey\": \"anyValue\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateEmailObfuscationPath = "/v1/testString/zones/testString/settings/email_obfuscation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateEmailObfuscationOptions model
    UpdateEmailObfuscationOptions updateEmailObfuscationOptionsModel = new UpdateEmailObfuscationOptions.Builder()
      .value("off")
      .build();

    // Invoke updateEmailObfuscation() with a valid options model and verify the result
    Response<EmailObfuscationResp> response = zonesSettingsService.updateEmailObfuscation(updateEmailObfuscationOptionsModel).execute();
    assertNotNull(response);
    EmailObfuscationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEmailObfuscationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateEmailObfuscation operation with and without retries enabled
  @Test
  public void testUpdateEmailObfuscationWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateEmailObfuscationWOptions();

    zonesSettingsService.disableRetries();
    testUpdateEmailObfuscationWOptions();
  }

  // Test the getSecurityLevel operation with a valid options model parameter
  @Test
  public void testGetSecurityLevelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"security_level\", \"value\": \"medium\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String getSecurityLevelPath = "/v1/testString/zones/testString/settings/security_level";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSecurityLevelOptions model
    GetSecurityLevelOptions getSecurityLevelOptionsModel = new GetSecurityLevelOptions();

    // Invoke getSecurityLevel() with a valid options model and verify the result
    Response<SecurityLevelResp> response = zonesSettingsService.getSecurityLevel(getSecurityLevelOptionsModel).execute();
    assertNotNull(response);
    SecurityLevelResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSecurityLevelPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSecurityLevel operation with and without retries enabled
  @Test
  public void testGetSecurityLevelWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testGetSecurityLevelWOptions();

    zonesSettingsService.disableRetries();
    testGetSecurityLevelWOptions();
  }

  // Test the updateSecurityLevel operation with a valid options model parameter
  @Test
  public void testUpdateSecurityLevelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"result\": {\"id\": \"security_level\", \"value\": \"medium\", \"editable\": true, \"modified_on\": \"2017-01-01T05:20:00.123Z\"}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]]}";
    String updateSecurityLevelPath = "/v1/testString/zones/testString/settings/security_level";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSecurityLevelOptions model
    UpdateSecurityLevelOptions updateSecurityLevelOptionsModel = new UpdateSecurityLevelOptions.Builder()
      .value("medium")
      .build();

    // Invoke updateSecurityLevel() with a valid options model and verify the result
    Response<SecurityLevelResp> response = zonesSettingsService.updateSecurityLevel(updateSecurityLevelOptionsModel).execute();
    assertNotNull(response);
    SecurityLevelResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSecurityLevelPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSecurityLevel operation with and without retries enabled
  @Test
  public void testUpdateSecurityLevelWRetries() throws Throwable {
    zonesSettingsService.enableRetries(4, 30);
    testUpdateSecurityLevelWOptions();

    zonesSettingsService.disableRetries();
    testUpdateSecurityLevelWOptions();
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
    zonesSettingsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    zonesSettingsService = ZonesSettings.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    zonesSettingsService.setServiceUrl(url);
  }
}