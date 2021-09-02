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

import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
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
import com.ibm.cloud.networking.zones_settings.v1.model.Http3Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.Http2RespResult;
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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the ZonesSettings service.
 */
public class ZonesSettingsIT extends SdkIntegrationTestBase {
  public ZonesSettings service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = null;
  String zoneIdentifier = null;
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../cloud_internet_services.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    final String serviceName = "cloud_internet_services";
    // Load up the config properties for this service.
    config = CredentialUtils.getServiceProperties(serviceName);
    // Load Config
    crn = config.get("CRN");
    zoneIdentifier = config.get("ZONE_ID");

    // set mock values for global params
    try {
      service = ZonesSettings.newInstance(crn, zoneIdentifier, serviceName);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Setup complete.");
  }

  @Test
  public void testGetZoneDnssec() throws Exception {
    try {
      GetZoneDnssecOptions getZoneDnssecOptions = new GetZoneDnssecOptions();

      // Invoke operation
      Response<ZonesDnssecResp> response = service.getZoneDnssec(getZoneDnssecOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZonesDnssecResp zonesDnssecRespResult = response.getResult();

      assertNotNull(zonesDnssecRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateZoneDnssecActive() throws Exception {
    try {
      UpdateZoneDnssecOptions updateZoneDnssecOptions = new UpdateZoneDnssecOptions.Builder()
      .status("active")
      .build();

      // Invoke operation
      Response<ZonesDnssecResp> response = service.updateZoneDnssec(updateZoneDnssecOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZonesDnssecResp zonesDnssecRespResult = response.getResult();

      assertNotNull(zonesDnssecRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateZoneDnssecDisable() throws Exception {
    try {
      UpdateZoneDnssecOptions updateZoneDnssecOptions = new UpdateZoneDnssecOptions.Builder()
      .status("disabled")
      .build();

      // Invoke operation
      Response<ZonesDnssecResp> response = service.updateZoneDnssec(updateZoneDnssecOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZonesDnssecResp zonesDnssecRespResult = response.getResult();

      assertNotNull(zonesDnssecRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetZoneCnameFlattening() throws Exception {
    try {
      GetZoneCnameFlatteningOptions getZoneCnameFlatteningOptions = new GetZoneCnameFlatteningOptions();

      // Invoke operation
      Response<ZonesCnameFlatteningResp> response = service.getZoneCnameFlattening(getZoneCnameFlatteningOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZonesCnameFlatteningResp zonesCnameFlatteningRespResult = response.getResult();

      assertNotNull(zonesCnameFlatteningRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateZoneCnameFlattening() throws Exception {
    try {
      UpdateZoneCnameFlatteningOptions updateZoneCnameFlatteningOptions = new UpdateZoneCnameFlatteningOptions.Builder()
      .value("flatten_all")
      .build();

      // Invoke operation
      Response<ZonesCnameFlatteningResp> response = service.updateZoneCnameFlattening(updateZoneCnameFlatteningOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ZonesCnameFlatteningResp zonesCnameFlatteningRespResult = response.getResult();

      assertNotNull(zonesCnameFlatteningRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetOpportunisticEncryption() throws Exception {
    try {
      GetOpportunisticEncryptionOptions getOpportunisticEncryptionOptions = new GetOpportunisticEncryptionOptions();

      // Invoke operation
      Response<OpportunisticEncryptionResp> response = service.getOpportunisticEncryption(getOpportunisticEncryptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OpportunisticEncryptionResp opportunisticEncryptionRespResult = response.getResult();

      assertNotNull(opportunisticEncryptionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateOpportunisticEncryption() throws Exception {
    try {
      UpdateOpportunisticEncryptionOptions updateOpportunisticEncryptionOptions = new UpdateOpportunisticEncryptionOptions.Builder()
      .value("off")
      .build();

      // Invoke operation
      Response<OpportunisticEncryptionResp> response = service.updateOpportunisticEncryption(updateOpportunisticEncryptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OpportunisticEncryptionResp opportunisticEncryptionRespResult = response.getResult();

      assertNotNull(opportunisticEncryptionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetChallengeTtl() throws Exception {
    try {
      GetChallengeTtlOptions getChallengeTtlOptions = new GetChallengeTtlOptions();

      // Invoke operation
      Response<ChallengeTtlResp> response = service.getChallengeTtl(getChallengeTtlOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ChallengeTtlResp challengeTtlRespResult = response.getResult();

      assertNotNull(challengeTtlRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateChallengeTtl() throws Exception {
    try {
      UpdateChallengeTtlOptions updateChallengeTtlOptions = new UpdateChallengeTtlOptions.Builder()
      .value(Long.valueOf("1800"))
      .build();

      // Invoke operation
      Response<ChallengeTtlResp> response = service.updateChallengeTtl(updateChallengeTtlOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ChallengeTtlResp challengeTtlRespResult = response.getResult();

      assertNotNull(challengeTtlRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAutomaticHttpsRewrites() throws Exception {
    try {
      GetAutomaticHttpsRewritesOptions getAutomaticHttpsRewritesOptions = new GetAutomaticHttpsRewritesOptions();

      // Invoke operation
      Response<AutomaticHttpsRewritesResp> response = service.getAutomaticHttpsRewrites(getAutomaticHttpsRewritesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AutomaticHttpsRewritesResp automaticHttpsRewritesRespResult = response.getResult();

      assertNotNull(automaticHttpsRewritesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateAutomaticHttpsRewrites() throws Exception {
    try {
      UpdateAutomaticHttpsRewritesOptions updateAutomaticHttpsRewritesOptions = new UpdateAutomaticHttpsRewritesOptions.Builder()
      .value("off")
      .build();

      // Invoke operation
      Response<AutomaticHttpsRewritesResp> response = service.updateAutomaticHttpsRewrites(updateAutomaticHttpsRewritesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AutomaticHttpsRewritesResp automaticHttpsRewritesRespResult = response.getResult();

      assertNotNull(automaticHttpsRewritesRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetTrueClientIp() throws Exception {
    try {
      GetTrueClientIpOptions getTrueClientIpOptions = new GetTrueClientIpOptions();

      // Invoke operation
      Response<TrueClientIpResp> response = service.getTrueClientIp(getTrueClientIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TrueClientIpResp trueClientIpRespResult = response.getResult();

      assertNotNull(trueClientIpRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateTrueClientIp() throws Exception {
    try {
      UpdateTrueClientIpOptions updateTrueClientIpOptions = new UpdateTrueClientIpOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<TrueClientIpResp> response = service.updateTrueClientIp(updateTrueClientIpOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TrueClientIpResp trueClientIpRespResult = response.getResult();

      assertNotNull(trueClientIpRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAlwaysUseHttps() throws Exception {
    try {
      GetAlwaysUseHttpsOptions getAlwaysUseHttpsOptions = new GetAlwaysUseHttpsOptions();

      // Invoke operation
      Response<AlwaysUseHttpsResp> response = service.getAlwaysUseHttps(getAlwaysUseHttpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlwaysUseHttpsResp alwaysUseHttpsRespResult = response.getResult();

      assertNotNull(alwaysUseHttpsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateAlwaysUseHttps() throws Exception {
    try {
      UpdateAlwaysUseHttpsOptions updateAlwaysUseHttpsOptions = new UpdateAlwaysUseHttpsOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<AlwaysUseHttpsResp> response = service.updateAlwaysUseHttps(updateAlwaysUseHttpsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlwaysUseHttpsResp alwaysUseHttpsRespResult = response.getResult();

      assertNotNull(alwaysUseHttpsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetImageSizeOptimization() throws Exception {
    try {
      GetImageSizeOptimizationOptions getImageSizeOptimizationOptions = new GetImageSizeOptimizationOptions();

      // Invoke operation
      Response<ImageSizeOptimizationResp> response = service.getImageSizeOptimization(getImageSizeOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageSizeOptimizationResp imageSizeOptimizationRespResult = response.getResult();

      assertNotNull(imageSizeOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateImageSizeOptimization() throws Exception {
    try {
      UpdateImageSizeOptimizationOptions updateImageSizeOptimizationOptions = new UpdateImageSizeOptimizationOptions.Builder()
      .value("lossless")
      .build();

      // Invoke operation
      Response<ImageSizeOptimizationResp> response = service.updateImageSizeOptimization(updateImageSizeOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageSizeOptimizationResp imageSizeOptimizationRespResult = response.getResult();

      assertNotNull(imageSizeOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetScriptLoadOptimization() throws Exception {
    try {
      GetScriptLoadOptimizationOptions getScriptLoadOptimizationOptions = new GetScriptLoadOptimizationOptions();

      // Invoke operation
      Response<ScriptLoadOptimizationResp> response = service.getScriptLoadOptimization(getScriptLoadOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ScriptLoadOptimizationResp scriptLoadOptimizationRespResult = response.getResult();

      assertNotNull(scriptLoadOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateScriptLoadOptimization() throws Exception {
    try {
      UpdateScriptLoadOptimizationOptions updateScriptLoadOptimizationOptions = new UpdateScriptLoadOptimizationOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<ScriptLoadOptimizationResp> response = service.updateScriptLoadOptimization(updateScriptLoadOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ScriptLoadOptimizationResp scriptLoadOptimizationRespResult = response.getResult();

      assertNotNull(scriptLoadOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetImageLoadOptimization() throws Exception {
    try {
      GetImageLoadOptimizationOptions getImageLoadOptimizationOptions = new GetImageLoadOptimizationOptions();

      // Invoke operation
      Response<ImageLoadOptimizationResp> response = service.getImageLoadOptimization(getImageLoadOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageLoadOptimizationResp imageLoadOptimizationRespResult = response.getResult();

      assertNotNull(imageLoadOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateImageLoadOptimization() throws Exception {
    try {
      UpdateImageLoadOptimizationOptions updateImageLoadOptimizationOptions = new UpdateImageLoadOptimizationOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<ImageLoadOptimizationResp> response = service.updateImageLoadOptimization(updateImageLoadOptimizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ImageLoadOptimizationResp imageLoadOptimizationRespResult = response.getResult();

      assertNotNull(imageLoadOptimizationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMinify() throws Exception {
    try {
      GetMinifyOptions getMinifyOptions = new GetMinifyOptions();

      // Invoke operation
      Response<MinifyResp> response = service.getMinify(getMinifyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MinifyResp minifyRespResult = response.getResult();

      assertNotNull(minifyRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateMinify() throws Exception {
    try {
      MinifySettingValue minifySettingValueModel = new MinifySettingValue.Builder()
      .css("on")
      .html("on")
      .js("on")
      .build();

      UpdateMinifyOptions updateMinifyOptions = new UpdateMinifyOptions.Builder()
      .value(minifySettingValueModel)
      .build();

      // Invoke operation
      Response<MinifyResp> response = service.updateMinify(updateMinifyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MinifyResp minifyRespResult = response.getResult();

      assertNotNull(minifyRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMinTlsVersion() throws Exception {
    try {
      GetMinTlsVersionOptions getMinTlsVersionOptions = new GetMinTlsVersionOptions();

      // Invoke operation
      Response<MinTlsVersionResp> response = service.getMinTlsVersion(getMinTlsVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MinTlsVersionResp minTlsVersionRespResult = response.getResult();

      assertNotNull(minTlsVersionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateMinTlsVersion() throws Exception {
    try {
      UpdateMinTlsVersionOptions updateMinTlsVersionOptions = new UpdateMinTlsVersionOptions.Builder()
      .value("1.2")
      .build();

      // Invoke operation
      Response<MinTlsVersionResp> response = service.updateMinTlsVersion(updateMinTlsVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MinTlsVersionResp minTlsVersionRespResult = response.getResult();

      assertNotNull(minTlsVersionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetIpGeolocation() throws Exception {
    try {
      GetIpGeolocationOptions getIpGeolocationOptions = new GetIpGeolocationOptions();

      // Invoke operation
      Response<IpGeolocationResp> response = service.getIpGeolocation(getIpGeolocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IpGeolocationResp ipGeolocationRespResult = response.getResult();

      assertNotNull(ipGeolocationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateIpGeolocation() throws Exception {
    try {
      UpdateIpGeolocationOptions updateIpGeolocationOptions = new UpdateIpGeolocationOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<IpGeolocationResp> response = service.updateIpGeolocation(updateIpGeolocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IpGeolocationResp ipGeolocationRespResult = response.getResult();

      assertNotNull(ipGeolocationRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetServerSideExclude() throws Exception {
    try {
      GetServerSideExcludeOptions getServerSideExcludeOptions = new GetServerSideExcludeOptions();

      // Invoke operation
      Response<ServerSideExcludeResp> response = service.getServerSideExclude(getServerSideExcludeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerSideExcludeResp serverSideExcludeRespResult = response.getResult();

      assertNotNull(serverSideExcludeRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateServerSideExclude() throws Exception {
    try {
      UpdateServerSideExcludeOptions updateServerSideExcludeOptions = new UpdateServerSideExcludeOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<ServerSideExcludeResp> response = service.updateServerSideExclude(updateServerSideExcludeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerSideExcludeResp serverSideExcludeRespResult = response.getResult();

      assertNotNull(serverSideExcludeRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSecurityHeader() throws Exception {
    try {
      GetSecurityHeaderOptions getSecurityHeaderOptions = new GetSecurityHeaderOptions();

      // Invoke operation
      Response<SecurityHeaderResp> response = service.getSecurityHeader(getSecurityHeaderOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityHeaderResp securityHeaderRespResult = response.getResult();

      assertNotNull(securityHeaderRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSecurityHeader() throws Exception {
    try {
      SecurityHeaderSettingValueStrictTransportSecurity securityHeaderSettingValueStrictTransportSecurityModel = new SecurityHeaderSettingValueStrictTransportSecurity.Builder()
      .enabled(true)
      .maxAge(Long.valueOf("86400"))
      .includeSubdomains(true)
      .nosniff(true)
      .build();

      SecurityHeaderSettingValue securityHeaderSettingValueModel = new SecurityHeaderSettingValue.Builder()
      .strictTransportSecurity(securityHeaderSettingValueStrictTransportSecurityModel)
      .build();

      UpdateSecurityHeaderOptions updateSecurityHeaderOptions = new UpdateSecurityHeaderOptions.Builder()
      .value(securityHeaderSettingValueModel)
      .build();

      // Invoke operation
      Response<SecurityHeaderResp> response = service.updateSecurityHeader(updateSecurityHeaderOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SecurityHeaderResp securityHeaderRespResult = response.getResult();

      assertNotNull(securityHeaderRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMobileRedirect() throws Exception {
    try {
      GetMobileRedirectOptions getMobileRedirectOptions = new GetMobileRedirectOptions();

      // Invoke operation
      Response<MobileRedirectResp> response = service.getMobileRedirect(getMobileRedirectOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MobileRedirectResp mobileRedirectRespResult = response.getResult();

      assertNotNull(mobileRedirectRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateMobileRedirect() throws Exception {
    try {
      MobileRedirecSettingValue mobileRedirecSettingValueModel = new MobileRedirecSettingValue.Builder()
      .status("on")
      .mobileSubdomain("java-sdk.java.sdk.cistest-load.com")
      .stripUri(false)
      .build();

      UpdateMobileRedirectOptions updateMobileRedirectOptions = new UpdateMobileRedirectOptions.Builder()
      .value(mobileRedirecSettingValueModel)
      .build();

      // Invoke operation
      Response<MobileRedirectResp> response = service.updateMobileRedirect(updateMobileRedirectOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MobileRedirectResp mobileRedirectRespResult = response.getResult();

      assertNotNull(mobileRedirectRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetPrefetchPreload() throws Exception {
    try {
      GetPrefetchPreloadOptions getPrefetchPreloadOptions = new GetPrefetchPreloadOptions();

      // Invoke operation
      Response<PrefetchPreloadResp> response = service.getPrefetchPreload(getPrefetchPreloadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrefetchPreloadResp prefetchPreloadRespResult = response.getResult();

      assertNotNull(prefetchPreloadRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdatePrefetchPreload() throws Exception {
    try {
      UpdatePrefetchPreloadOptions updatePrefetchPreloadOptions = new UpdatePrefetchPreloadOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<PrefetchPreloadResp> response = service.updatePrefetchPreload(updatePrefetchPreloadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrefetchPreloadResp prefetchPreloadRespResult = response.getResult();

      assertNotNull(prefetchPreloadRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetHttp2() throws Exception {
    try {
      GetHttp2Options getHttp2Options = new GetHttp2Options();

      // Invoke operation
      Response<Http2Resp> response = service.getHttp2(getHttp2Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Http2Resp http2RespResult = response.getResult();

      assertNotNull(http2RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetHttp3() throws Exception {
    try {
      GetHttp3Options getHttp3Options = new GetHttp3Options();

      // Invoke operation
      Response<Http3Resp> response = service.getHttp3(getHttp3Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Http3Resp http3RespResult = response.getResult();

      assertNotNull(http3RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateHttp2() throws Exception {
    try {
      UpdateHttp2Options updateHttp2Options = new UpdateHttp2Options.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<Http2Resp> response = service.updateHttp2(updateHttp2Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Http2Resp http2RespResult = response.getResult();

      assertNotNull(http2RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateHttp3() throws Exception {
    try {
      UpdateHttp3Options updateHttp3Options = new UpdateHttp3Options.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<Http3Resp> response = service.updateHttp3(updateHttp3Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Http3Resp http3RespResult = response.getResult();

      assertNotNull(http3RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetIpv6() throws Exception {
    try {
      GetIpv6Options getIpv6Options = new GetIpv6Options();

      // Invoke operation
      Response<Ipv6Resp> response = service.getIpv6(getIpv6Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ipv6Resp ipv6RespResult = response.getResult();

      assertNotNull(ipv6RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateIpv6() throws Exception {
    try {
      UpdateIpv6Options updateIpv6Options = new UpdateIpv6Options.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<Ipv6Resp> response = service.updateIpv6(updateIpv6Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ipv6Resp ipv6RespResult = response.getResult();

      assertNotNull(ipv6RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWebSockets() throws Exception {
    try {
      GetWebSocketsOptions getWebSocketsOptions = new GetWebSocketsOptions();

      // Invoke operation
      Response<WebsocketsResp> response = service.getWebSockets(getWebSocketsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WebsocketsResp websocketsRespResult = response.getResult();

      assertNotNull(websocketsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateWebSockets() throws Exception {
    try {
      UpdateWebSocketsOptions updateWebSocketsOptions = new UpdateWebSocketsOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<WebsocketsResp> response = service.updateWebSockets(updateWebSocketsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WebsocketsResp websocketsRespResult = response.getResult();

      assertNotNull(websocketsRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetPseudoIpv4() throws Exception {
    try {
      GetPseudoIpv4Options getPseudoIpv4Options = new GetPseudoIpv4Options();

      // Invoke operation
      Response<PseudoIpv4Resp> response = service.getPseudoIpv4(getPseudoIpv4Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PseudoIpv4Resp pseudoIpv4RespResult = response.getResult();

      assertNotNull(pseudoIpv4RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdatePseudoIpv4() throws Exception {
    try {
      UpdatePseudoIpv4Options updatePseudoIpv4Options = new UpdatePseudoIpv4Options.Builder()
      .value("add_header")
      .build();

      // Invoke operation
      Response<PseudoIpv4Resp> response = service.updatePseudoIpv4(updatePseudoIpv4Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PseudoIpv4Resp pseudoIpv4RespResult = response.getResult();

      assertNotNull(pseudoIpv4RespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetResponseBuffering() throws Exception {
    try {
      GetResponseBufferingOptions getResponseBufferingOptions = new GetResponseBufferingOptions();

      // Invoke operation
      Response<ResponseBufferingResp> response = service.getResponseBuffering(getResponseBufferingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResponseBufferingResp responseBufferingRespResult = response.getResult();

      assertNotNull(responseBufferingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateResponseBuffering() throws Exception {
    try {
      UpdateResponseBufferingOptions updateResponseBufferingOptions = new UpdateResponseBufferingOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<ResponseBufferingResp> response = service.updateResponseBuffering(updateResponseBufferingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResponseBufferingResp responseBufferingRespResult = response.getResult();

      assertNotNull(responseBufferingRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetHotlinkProtection() throws Exception {
    try {
      GetHotlinkProtectionOptions getHotlinkProtectionOptions = new GetHotlinkProtectionOptions();

      // Invoke operation
      Response<HotlinkProtectionResp> response = service.getHotlinkProtection(getHotlinkProtectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HotlinkProtectionResp hotlinkProtectionRespResult = response.getResult();

      assertNotNull(hotlinkProtectionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateHotlinkProtection() throws Exception {
    try {
      UpdateHotlinkProtectionOptions updateHotlinkProtectionOptions = new UpdateHotlinkProtectionOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<HotlinkProtectionResp> response = service.updateHotlinkProtection(updateHotlinkProtectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HotlinkProtectionResp hotlinkProtectionRespResult = response.getResult();

      assertNotNull(hotlinkProtectionRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMaxUpload() throws Exception {
    try {
      GetMaxUploadOptions getMaxUploadOptions = new GetMaxUploadOptions();

      // Invoke operation
      Response<MaxUploadResp> response = service.getMaxUpload(getMaxUploadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MaxUploadResp maxUploadRespResult = response.getResult();

      assertNotNull(maxUploadRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateMaxUpload() throws Exception {
    try {
      UpdateMaxUploadOptions updateMaxUploadOptions = new UpdateMaxUploadOptions.Builder()
      .value(Long.valueOf("300"))
      .build();

      // Invoke operation
      Response<MaxUploadResp> response = service.updateMaxUpload(updateMaxUploadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MaxUploadResp maxUploadRespResult = response.getResult();

      assertNotNull(maxUploadRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetTlsClientAuth() throws Exception {
    try {
      GetTlsClientAuthOptions getTlsClientAuthOptions = new GetTlsClientAuthOptions();

      // Invoke operation
      Response<TlsClientAuthResp> response = service.getTlsClientAuth(getTlsClientAuthOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TlsClientAuthResp tlsClientAuthRespResult = response.getResult();

      assertNotNull(tlsClientAuthRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateTlsClientAuth() throws Exception {
    try {
      UpdateTlsClientAuthOptions updateTlsClientAuthOptions = new UpdateTlsClientAuthOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<TlsClientAuthResp> response = service.updateTlsClientAuth(updateTlsClientAuthOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TlsClientAuthResp tlsClientAuthRespResult = response.getResult();

      assertNotNull(tlsClientAuthRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetBrowserCheck() throws Exception {
    try {
      GetBrowserCheckOptions getBrowserCheckOptions = new GetBrowserCheckOptions();

      // Invoke operation
      Response<BrowserCheckResp> response = service.getBrowserCheck(getBrowserCheckOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BrowserCheckResp browserCheckRespResult = response.getResult();

      assertNotNull(browserCheckRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateBrowserCheck() throws Exception {
    try {
      UpdateBrowserCheckOptions updateBrowserCheckOptions = new UpdateBrowserCheckOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<BrowserCheckResp> response = service.updateBrowserCheck(updateBrowserCheckOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BrowserCheckResp browserCheckRespResult = response.getResult();

      assertNotNull(browserCheckRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetEnableErrorPagesOn() throws Exception {
    try {
      GetEnableErrorPagesOnOptions getEnableErrorPagesOnOptions = new GetEnableErrorPagesOnOptions();

      // Invoke operation
      Response<OriginErrorPagePassThruResp> response = service.getEnableErrorPagesOn(getEnableErrorPagesOnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OriginErrorPagePassThruResp originErrorPagePassThruRespResult = response.getResult();

      assertNotNull(originErrorPagePassThruRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateEnableErrorPagesOn() throws Exception {
    try {
      UpdateEnableErrorPagesOnOptions updateEnableErrorPagesOnOptions = new UpdateEnableErrorPagesOnOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<OriginErrorPagePassThruResp> response = service.updateEnableErrorPagesOn(updateEnableErrorPagesOnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OriginErrorPagePassThruResp originErrorPagePassThruRespResult = response.getResult();

      assertNotNull(originErrorPagePassThruRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWebApplicationFirewall() throws Exception {
    try {
      GetWebApplicationFirewallOptions getWebApplicationFirewallOptions = new GetWebApplicationFirewallOptions();

      // Invoke operation
      Response<WafResp> response = service.getWebApplicationFirewall(getWebApplicationFirewallOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafResp wafRespResult = response.getResult();

      assertNotNull(wafRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateWebApplicationFirewall() throws Exception {
    try {
      UpdateWebApplicationFirewallOptions updateWebApplicationFirewallOptions = new UpdateWebApplicationFirewallOptions.Builder()
      .value("on")
      .build();

      // Invoke operation
      Response<WafResp> response = service.updateWebApplicationFirewall(updateWebApplicationFirewallOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WafResp wafRespResult = response.getResult();

      assertNotNull(wafRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCiphers() throws Exception {
    try {
      GetCiphersOptions getCiphersOptions = new GetCiphersOptions();

      // Invoke operation
      Response<CiphersResp> response = service.getCiphers(getCiphersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CiphersResp ciphersRespResult = response.getResult();

      assertNotNull(ciphersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateCiphers() throws Exception {
    try {
      UpdateCiphersOptions updateCiphersOptions = new UpdateCiphersOptions.Builder()
      .value(new java.util.ArrayList<String>(java.util.Arrays.asList("ECDHE-ECDSA-AES128-GCM-SHA256")))
      .build();

      // Invoke operation
      Response<CiphersResp> response = service.updateCiphers(updateCiphersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CiphersResp ciphersRespResult = response.getResult();

      assertNotNull(ciphersRespResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
