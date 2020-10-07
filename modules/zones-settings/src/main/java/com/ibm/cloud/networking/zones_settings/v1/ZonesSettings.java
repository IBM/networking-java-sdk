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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.12.1-318e07c8-20200909-152230
 */

package com.ibm.cloud.networking.zones_settings.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.zones_settings.v1.model.AlwaysUseHttpsResp;
import com.ibm.cloud.networking.zones_settings.v1.model.AutomaticHttpsRewritesResp;
import com.ibm.cloud.networking.zones_settings.v1.model.BrowserCheckResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ChallengeTtlResp;
import com.ibm.cloud.networking.zones_settings.v1.model.CiphersResp;
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
import com.ibm.cloud.networking.zones_settings.v1.model.Http2Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageLoadOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ImageSizeOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.IpGeolocationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.Ipv6Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.MaxUploadResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MinTlsVersionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MinifyResp;
import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirectResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticEncryptionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OriginErrorPagePassThruResp;
import com.ibm.cloud.networking.zones_settings.v1.model.PrefetchPreloadResp;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.ResponseBufferingResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ScriptLoadOptimizationResp;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ServerSideExcludeResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TlsClientAuthResp;
import com.ibm.cloud.networking.zones_settings.v1.model.TrueClientIpResp;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAlwaysUseHttpsOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateAutomaticHttpsRewritesOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateBrowserCheckOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateChallengeTtlOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateCiphersOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateEnableErrorPagesOnOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHotlinkProtectionOptions;
import com.ibm.cloud.networking.zones_settings.v1.model.UpdateHttp2Options;
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
import com.ibm.cloud.networking.zones_settings.v1.model.WebsocketsResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ZonesCnameFlatteningResp;
import com.ibm.cloud.networking.zones_settings.v1.model.ZonesDnssecResp;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.Map;
import java.util.Map.Entry;

/**
 * CIS Zones Settings.
 *
 * @version v1
 */
public class ZonesSettings extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "zones_settings";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `ZonesSettings` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @return an instance of the `ZonesSettings` client using external configuration
   */
  public static ZonesSettings newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `ZonesSettings` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `ZonesSettings` client using external configuration
   */
  public static ZonesSettings newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    ZonesSettings service = new ZonesSettings(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `ZonesSettings` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public ZonesSettings(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
  }

  /**
   * Gets the crn.
   *
   * Full url-encoded cloud resource name (CRN) of resource instance.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Sets the crn.
   *
   * @param crn the new crn
   */
  public void setCrn(final String crn) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(crn, "crn cannot be empty.");
    this.crn = crn;
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Zone identifier.
   *
   * @return the zoneIdentifier
   */
  public String getZoneIdentifier() {
    return this.zoneIdentifier;
  }

  /**
   * Sets the zoneIdentifier.
   *
   * @param zoneIdentifier the new zoneIdentifier
   */
  public void setZoneIdentifier(final String zoneIdentifier) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(zoneIdentifier, "zoneIdentifier cannot be empty.");
    this.zoneIdentifier = zoneIdentifier;
  }

  /**
   * Get zone DNSSEC.
   *
   * Get DNSSEC setting for a given zone.
   *
   * @param getZoneDnssecOptions the {@link GetZoneDnssecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZonesDnssecResp}
   */
  public ServiceCall<ZonesDnssecResp> getZoneDnssec(GetZoneDnssecOptions getZoneDnssecOptions) {
    String[] pathSegments = { "v1", "zones", "dnssec" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getZoneDnssec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ZonesDnssecResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZonesDnssecResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get zone DNSSEC.
   *
   * Get DNSSEC setting for a given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZonesDnssecResp}
   */
  public ServiceCall<ZonesDnssecResp> getZoneDnssec() {
    return getZoneDnssec(null);
  }

  /**
   * Update zone DNSSEC.
   *
   * Update DNSSEC setting for given zone.
   *
   * @param updateZoneDnssecOptions the {@link UpdateZoneDnssecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZonesDnssecResp}
   */
  public ServiceCall<ZonesDnssecResp> updateZoneDnssec(UpdateZoneDnssecOptions updateZoneDnssecOptions) {
    boolean skipBody = false;
    if (updateZoneDnssecOptions == null) {
      updateZoneDnssecOptions = new UpdateZoneDnssecOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "dnssec" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateZoneDnssec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateZoneDnssecOptions.status() != null) {
        contentJson.addProperty("status", updateZoneDnssecOptions.status());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ZonesDnssecResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZonesDnssecResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update zone DNSSEC.
   *
   * Update DNSSEC setting for given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZonesDnssecResp}
   */
  public ServiceCall<ZonesDnssecResp> updateZoneDnssec() {
    return updateZoneDnssec(null);
  }

  /**
   * Get zone CNAME flattening.
   *
   * Get CNAME flattening setting for a given zone.
   *
   * @param getZoneCnameFlatteningOptions the {@link GetZoneCnameFlatteningOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZonesCnameFlatteningResp}
   */
  public ServiceCall<ZonesCnameFlatteningResp> getZoneCnameFlattening(GetZoneCnameFlatteningOptions getZoneCnameFlatteningOptions) {
    String[] pathSegments = { "v1", "zones", "settings/cname_flattening" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getZoneCnameFlattening");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ZonesCnameFlatteningResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZonesCnameFlatteningResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get zone CNAME flattening.
   *
   * Get CNAME flattening setting for a given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZonesCnameFlatteningResp}
   */
  public ServiceCall<ZonesCnameFlatteningResp> getZoneCnameFlattening() {
    return getZoneCnameFlattening(null);
  }

  /**
   * Update zone CNAME flattening.
   *
   * Update CNAME flattening setting for given zone.
   *
   * @param updateZoneCnameFlatteningOptions the {@link UpdateZoneCnameFlatteningOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZonesCnameFlatteningResp}
   */
  public ServiceCall<ZonesCnameFlatteningResp> updateZoneCnameFlattening(UpdateZoneCnameFlatteningOptions updateZoneCnameFlatteningOptions) {
    boolean skipBody = false;
    if (updateZoneCnameFlatteningOptions == null) {
      updateZoneCnameFlatteningOptions = new UpdateZoneCnameFlatteningOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/cname_flattening" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateZoneCnameFlattening");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateZoneCnameFlatteningOptions.value() != null) {
        contentJson.addProperty("value", updateZoneCnameFlatteningOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ZonesCnameFlatteningResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZonesCnameFlatteningResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update zone CNAME flattening.
   *
   * Update CNAME flattening setting for given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZonesCnameFlatteningResp}
   */
  public ServiceCall<ZonesCnameFlatteningResp> updateZoneCnameFlattening() {
    return updateZoneCnameFlattening(null);
  }

  /**
   * Get opportunistic encryption setting.
   *
   * Get opportunistic encryption setting for a zone.
   *
   * @param getOpportunisticEncryptionOptions the {@link GetOpportunisticEncryptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OpportunisticEncryptionResp}
   */
  public ServiceCall<OpportunisticEncryptionResp> getOpportunisticEncryption(GetOpportunisticEncryptionOptions getOpportunisticEncryptionOptions) {
    String[] pathSegments = { "v1", "zones", "settings/opportunistic_encryption" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getOpportunisticEncryption");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<OpportunisticEncryptionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OpportunisticEncryptionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get opportunistic encryption setting.
   *
   * Get opportunistic encryption setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link OpportunisticEncryptionResp}
   */
  public ServiceCall<OpportunisticEncryptionResp> getOpportunisticEncryption() {
    return getOpportunisticEncryption(null);
  }

  /**
   * Update opportunistic encryption setting.
   *
   * Update opportunistic encryption setting for a zone.
   *
   * @param updateOpportunisticEncryptionOptions the {@link UpdateOpportunisticEncryptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OpportunisticEncryptionResp}
   */
  public ServiceCall<OpportunisticEncryptionResp> updateOpportunisticEncryption(UpdateOpportunisticEncryptionOptions updateOpportunisticEncryptionOptions) {
    boolean skipBody = false;
    if (updateOpportunisticEncryptionOptions == null) {
      updateOpportunisticEncryptionOptions = new UpdateOpportunisticEncryptionOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/opportunistic_encryption" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateOpportunisticEncryption");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateOpportunisticEncryptionOptions.value() != null) {
        contentJson.addProperty("value", updateOpportunisticEncryptionOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<OpportunisticEncryptionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OpportunisticEncryptionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update opportunistic encryption setting.
   *
   * Update opportunistic encryption setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link OpportunisticEncryptionResp}
   */
  public ServiceCall<OpportunisticEncryptionResp> updateOpportunisticEncryption() {
    return updateOpportunisticEncryption(null);
  }

  /**
   * Get challenge TTL setting.
   *
   * Get challenge TTL setting for a zone.
   *
   * @param getChallengeTtlOptions the {@link GetChallengeTtlOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ChallengeTtlResp}
   */
  public ServiceCall<ChallengeTtlResp> getChallengeTtl(GetChallengeTtlOptions getChallengeTtlOptions) {
    String[] pathSegments = { "v1", "zones", "settings/challenge_ttl" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getChallengeTtl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ChallengeTtlResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ChallengeTtlResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get challenge TTL setting.
   *
   * Get challenge TTL setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ChallengeTtlResp}
   */
  public ServiceCall<ChallengeTtlResp> getChallengeTtl() {
    return getChallengeTtl(null);
  }

  /**
   * Update challenge TTL setting.
   *
   * Update challenge TTL setting for a zone.
   *
   * @param updateChallengeTtlOptions the {@link UpdateChallengeTtlOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ChallengeTtlResp}
   */
  public ServiceCall<ChallengeTtlResp> updateChallengeTtl(UpdateChallengeTtlOptions updateChallengeTtlOptions) {
    boolean skipBody = false;
    if (updateChallengeTtlOptions == null) {
      updateChallengeTtlOptions = new UpdateChallengeTtlOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/challenge_ttl" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateChallengeTtl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateChallengeTtlOptions.value() != null) {
        contentJson.addProperty("value", updateChallengeTtlOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ChallengeTtlResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ChallengeTtlResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update challenge TTL setting.
   *
   * Update challenge TTL setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ChallengeTtlResp}
   */
  public ServiceCall<ChallengeTtlResp> updateChallengeTtl() {
    return updateChallengeTtl(null);
  }

  /**
   * Get automatic https rewrites setting.
   *
   * Get automatic https rewrites setting for a zone.
   *
   * @param getAutomaticHttpsRewritesOptions the {@link GetAutomaticHttpsRewritesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AutomaticHttpsRewritesResp}
   */
  public ServiceCall<AutomaticHttpsRewritesResp> getAutomaticHttpsRewrites(GetAutomaticHttpsRewritesOptions getAutomaticHttpsRewritesOptions) {
    String[] pathSegments = { "v1", "zones", "settings/automatic_https_rewrites" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getAutomaticHttpsRewrites");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AutomaticHttpsRewritesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AutomaticHttpsRewritesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get automatic https rewrites setting.
   *
   * Get automatic https rewrites setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AutomaticHttpsRewritesResp}
   */
  public ServiceCall<AutomaticHttpsRewritesResp> getAutomaticHttpsRewrites() {
    return getAutomaticHttpsRewrites(null);
  }

  /**
   * Update automatic https rewrites setting.
   *
   * Update automatic https rewrites setting for a zone.
   *
   * @param updateAutomaticHttpsRewritesOptions the {@link UpdateAutomaticHttpsRewritesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AutomaticHttpsRewritesResp}
   */
  public ServiceCall<AutomaticHttpsRewritesResp> updateAutomaticHttpsRewrites(UpdateAutomaticHttpsRewritesOptions updateAutomaticHttpsRewritesOptions) {
    boolean skipBody = false;
    if (updateAutomaticHttpsRewritesOptions == null) {
      updateAutomaticHttpsRewritesOptions = new UpdateAutomaticHttpsRewritesOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/automatic_https_rewrites" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateAutomaticHttpsRewrites");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateAutomaticHttpsRewritesOptions.value() != null) {
        contentJson.addProperty("value", updateAutomaticHttpsRewritesOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AutomaticHttpsRewritesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AutomaticHttpsRewritesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update automatic https rewrites setting.
   *
   * Update automatic https rewrites setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AutomaticHttpsRewritesResp}
   */
  public ServiceCall<AutomaticHttpsRewritesResp> updateAutomaticHttpsRewrites() {
    return updateAutomaticHttpsRewrites(null);
  }

  /**
   * Get true client IP setting.
   *
   * Get true client IP setting for a zone.
   *
   * @param getTrueClientIpOptions the {@link GetTrueClientIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TrueClientIpResp}
   */
  public ServiceCall<TrueClientIpResp> getTrueClientIp(GetTrueClientIpOptions getTrueClientIpOptions) {
    String[] pathSegments = { "v1", "zones", "settings/true_client_ip_header" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getTrueClientIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TrueClientIpResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TrueClientIpResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get true client IP setting.
   *
   * Get true client IP setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link TrueClientIpResp}
   */
  public ServiceCall<TrueClientIpResp> getTrueClientIp() {
    return getTrueClientIp(null);
  }

  /**
   * Update true client IP setting.
   *
   * Update true client IP setting for a zone.
   *
   * @param updateTrueClientIpOptions the {@link UpdateTrueClientIpOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TrueClientIpResp}
   */
  public ServiceCall<TrueClientIpResp> updateTrueClientIp(UpdateTrueClientIpOptions updateTrueClientIpOptions) {
    boolean skipBody = false;
    if (updateTrueClientIpOptions == null) {
      updateTrueClientIpOptions = new UpdateTrueClientIpOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/true_client_ip_header" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateTrueClientIp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateTrueClientIpOptions.value() != null) {
        contentJson.addProperty("value", updateTrueClientIpOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<TrueClientIpResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TrueClientIpResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update true client IP setting.
   *
   * Update true client IP setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link TrueClientIpResp}
   */
  public ServiceCall<TrueClientIpResp> updateTrueClientIp() {
    return updateTrueClientIp(null);
  }

  /**
   * Get always use https setting.
   *
   * Get always use https setting for a zone.
   *
   * @param getAlwaysUseHttpsOptions the {@link GetAlwaysUseHttpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlwaysUseHttpsResp}
   */
  public ServiceCall<AlwaysUseHttpsResp> getAlwaysUseHttps(GetAlwaysUseHttpsOptions getAlwaysUseHttpsOptions) {
    String[] pathSegments = { "v1", "zones", "settings/always_use_https" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getAlwaysUseHttps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AlwaysUseHttpsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlwaysUseHttpsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get always use https setting.
   *
   * Get always use https setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AlwaysUseHttpsResp}
   */
  public ServiceCall<AlwaysUseHttpsResp> getAlwaysUseHttps() {
    return getAlwaysUseHttps(null);
  }

  /**
   * Update always use https setting.
   *
   * Update always use https setting for a zone.
   *
   * @param updateAlwaysUseHttpsOptions the {@link UpdateAlwaysUseHttpsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlwaysUseHttpsResp}
   */
  public ServiceCall<AlwaysUseHttpsResp> updateAlwaysUseHttps(UpdateAlwaysUseHttpsOptions updateAlwaysUseHttpsOptions) {
    boolean skipBody = false;
    if (updateAlwaysUseHttpsOptions == null) {
      updateAlwaysUseHttpsOptions = new UpdateAlwaysUseHttpsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/always_use_https" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateAlwaysUseHttps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateAlwaysUseHttpsOptions.value() != null) {
        contentJson.addProperty("value", updateAlwaysUseHttpsOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AlwaysUseHttpsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlwaysUseHttpsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update always use https setting.
   *
   * Update always use https setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AlwaysUseHttpsResp}
   */
  public ServiceCall<AlwaysUseHttpsResp> updateAlwaysUseHttps() {
    return updateAlwaysUseHttps(null);
  }

  /**
   * Get image size optimization setting.
   *
   * Get image size optimization setting for a zone.
   *
   * @param getImageSizeOptimizationOptions the {@link GetImageSizeOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageSizeOptimizationResp}
   */
  public ServiceCall<ImageSizeOptimizationResp> getImageSizeOptimization(GetImageSizeOptimizationOptions getImageSizeOptimizationOptions) {
    String[] pathSegments = { "v1", "zones", "settings/image_size_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getImageSizeOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ImageSizeOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageSizeOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get image size optimization setting.
   *
   * Get image size optimization setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ImageSizeOptimizationResp}
   */
  public ServiceCall<ImageSizeOptimizationResp> getImageSizeOptimization() {
    return getImageSizeOptimization(null);
  }

  /**
   * Update image size optimization setting.
   *
   * Update image size optimization setting for a zone.
   *
   * @param updateImageSizeOptimizationOptions the {@link UpdateImageSizeOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageSizeOptimizationResp}
   */
  public ServiceCall<ImageSizeOptimizationResp> updateImageSizeOptimization(UpdateImageSizeOptimizationOptions updateImageSizeOptimizationOptions) {
    boolean skipBody = false;
    if (updateImageSizeOptimizationOptions == null) {
      updateImageSizeOptimizationOptions = new UpdateImageSizeOptimizationOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/image_size_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateImageSizeOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateImageSizeOptimizationOptions.value() != null) {
        contentJson.addProperty("value", updateImageSizeOptimizationOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ImageSizeOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageSizeOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update image size optimization setting.
   *
   * Update image size optimization setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ImageSizeOptimizationResp}
   */
  public ServiceCall<ImageSizeOptimizationResp> updateImageSizeOptimization() {
    return updateImageSizeOptimization(null);
  }

  /**
   * Get script load optimization setting.
   *
   * Get script load optimization setting for a zone.
   *
   * @param getScriptLoadOptimizationOptions the {@link GetScriptLoadOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ScriptLoadOptimizationResp}
   */
  public ServiceCall<ScriptLoadOptimizationResp> getScriptLoadOptimization(GetScriptLoadOptimizationOptions getScriptLoadOptimizationOptions) {
    String[] pathSegments = { "v1", "zones", "settings/script_load_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getScriptLoadOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ScriptLoadOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ScriptLoadOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get script load optimization setting.
   *
   * Get script load optimization setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ScriptLoadOptimizationResp}
   */
  public ServiceCall<ScriptLoadOptimizationResp> getScriptLoadOptimization() {
    return getScriptLoadOptimization(null);
  }

  /**
   * Update script load optimization setting.
   *
   * Update script load optimization setting for a zone.
   *
   * @param updateScriptLoadOptimizationOptions the {@link UpdateScriptLoadOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ScriptLoadOptimizationResp}
   */
  public ServiceCall<ScriptLoadOptimizationResp> updateScriptLoadOptimization(UpdateScriptLoadOptimizationOptions updateScriptLoadOptimizationOptions) {
    boolean skipBody = false;
    if (updateScriptLoadOptimizationOptions == null) {
      updateScriptLoadOptimizationOptions = new UpdateScriptLoadOptimizationOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/script_load_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateScriptLoadOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateScriptLoadOptimizationOptions.value() != null) {
        contentJson.addProperty("value", updateScriptLoadOptimizationOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ScriptLoadOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ScriptLoadOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update script load optimization setting.
   *
   * Update script load optimization setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ScriptLoadOptimizationResp}
   */
  public ServiceCall<ScriptLoadOptimizationResp> updateScriptLoadOptimization() {
    return updateScriptLoadOptimization(null);
  }

  /**
   * Get image load optimizationn setting.
   *
   * Get image load optimizationn setting for a zone.
   *
   * @param getImageLoadOptimizationOptions the {@link GetImageLoadOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageLoadOptimizationResp}
   */
  public ServiceCall<ImageLoadOptimizationResp> getImageLoadOptimization(GetImageLoadOptimizationOptions getImageLoadOptimizationOptions) {
    String[] pathSegments = { "v1", "zones", "settings/image_load_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getImageLoadOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ImageLoadOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageLoadOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get image load optimizationn setting.
   *
   * Get image load optimizationn setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ImageLoadOptimizationResp}
   */
  public ServiceCall<ImageLoadOptimizationResp> getImageLoadOptimization() {
    return getImageLoadOptimization(null);
  }

  /**
   * Update image load optimizationn setting.
   *
   * Update image load optimizationn setting for a zone.
   *
   * @param updateImageLoadOptimizationOptions the {@link UpdateImageLoadOptimizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImageLoadOptimizationResp}
   */
  public ServiceCall<ImageLoadOptimizationResp> updateImageLoadOptimization(UpdateImageLoadOptimizationOptions updateImageLoadOptimizationOptions) {
    boolean skipBody = false;
    if (updateImageLoadOptimizationOptions == null) {
      updateImageLoadOptimizationOptions = new UpdateImageLoadOptimizationOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/image_load_optimization" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateImageLoadOptimization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateImageLoadOptimizationOptions.value() != null) {
        contentJson.addProperty("value", updateImageLoadOptimizationOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ImageLoadOptimizationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImageLoadOptimizationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update image load optimizationn setting.
   *
   * Update image load optimizationn setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ImageLoadOptimizationResp}
   */
  public ServiceCall<ImageLoadOptimizationResp> updateImageLoadOptimization() {
    return updateImageLoadOptimization(null);
  }

  /**
   * Get minify setting.
   *
   * Get minify setting for a zone.
   *
   * @param getMinifyOptions the {@link GetMinifyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MinifyResp}
   */
  public ServiceCall<MinifyResp> getMinify(GetMinifyOptions getMinifyOptions) {
    String[] pathSegments = { "v1", "zones", "settings/minify" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getMinify");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MinifyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MinifyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get minify setting.
   *
   * Get minify setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MinifyResp}
   */
  public ServiceCall<MinifyResp> getMinify() {
    return getMinify(null);
  }

  /**
   * Update minify setting.
   *
   * Update minify setting for a zone.
   *
   * @param updateMinifyOptions the {@link UpdateMinifyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MinifyResp}
   */
  public ServiceCall<MinifyResp> updateMinify(UpdateMinifyOptions updateMinifyOptions) {
    boolean skipBody = false;
    if (updateMinifyOptions == null) {
      updateMinifyOptions = new UpdateMinifyOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/minify" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateMinify");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateMinifyOptions.value() != null) {
        contentJson.add("value", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateMinifyOptions.value()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<MinifyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MinifyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update minify setting.
   *
   * Update minify setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MinifyResp}
   */
  public ServiceCall<MinifyResp> updateMinify() {
    return updateMinify(null);
  }

  /**
   * Get minimum TLS version setting.
   *
   * Get minimum TLS version setting for a zone.
   *
   * @param getMinTlsVersionOptions the {@link GetMinTlsVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MinTlsVersionResp}
   */
  public ServiceCall<MinTlsVersionResp> getMinTlsVersion(GetMinTlsVersionOptions getMinTlsVersionOptions) {
    String[] pathSegments = { "v1", "zones", "settings/min_tls_version" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getMinTlsVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MinTlsVersionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MinTlsVersionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get minimum TLS version setting.
   *
   * Get minimum TLS version setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MinTlsVersionResp}
   */
  public ServiceCall<MinTlsVersionResp> getMinTlsVersion() {
    return getMinTlsVersion(null);
  }

  /**
   * Update minimum TLS version setting.
   *
   * Update minimum TLS version setting for a zone.
   *
   * @param updateMinTlsVersionOptions the {@link UpdateMinTlsVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MinTlsVersionResp}
   */
  public ServiceCall<MinTlsVersionResp> updateMinTlsVersion(UpdateMinTlsVersionOptions updateMinTlsVersionOptions) {
    boolean skipBody = false;
    if (updateMinTlsVersionOptions == null) {
      updateMinTlsVersionOptions = new UpdateMinTlsVersionOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/min_tls_version" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateMinTlsVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateMinTlsVersionOptions.value() != null) {
        contentJson.addProperty("value", updateMinTlsVersionOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<MinTlsVersionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MinTlsVersionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update minimum TLS version setting.
   *
   * Update minimum TLS version setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MinTlsVersionResp}
   */
  public ServiceCall<MinTlsVersionResp> updateMinTlsVersion() {
    return updateMinTlsVersion(null);
  }

  /**
   * Get IP geolocation setting.
   *
   * Get IP geolocation setting for a zone.
   *
   * @param getIpGeolocationOptions the {@link GetIpGeolocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IpGeolocationResp}
   */
  public ServiceCall<IpGeolocationResp> getIpGeolocation(GetIpGeolocationOptions getIpGeolocationOptions) {
    String[] pathSegments = { "v1", "zones", "settings/ip_geolocation" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getIpGeolocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<IpGeolocationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IpGeolocationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get IP geolocation setting.
   *
   * Get IP geolocation setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link IpGeolocationResp}
   */
  public ServiceCall<IpGeolocationResp> getIpGeolocation() {
    return getIpGeolocation(null);
  }

  /**
   * Update IP geolocation setting.
   *
   * Update IP geolocation setting for a zone.
   *
   * @param updateIpGeolocationOptions the {@link UpdateIpGeolocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IpGeolocationResp}
   */
  public ServiceCall<IpGeolocationResp> updateIpGeolocation(UpdateIpGeolocationOptions updateIpGeolocationOptions) {
    boolean skipBody = false;
    if (updateIpGeolocationOptions == null) {
      updateIpGeolocationOptions = new UpdateIpGeolocationOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/ip_geolocation" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateIpGeolocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateIpGeolocationOptions.value() != null) {
        contentJson.addProperty("value", updateIpGeolocationOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<IpGeolocationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IpGeolocationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update IP geolocation setting.
   *
   * Update IP geolocation setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link IpGeolocationResp}
   */
  public ServiceCall<IpGeolocationResp> updateIpGeolocation() {
    return updateIpGeolocation(null);
  }

  /**
   * Get server side exclude setting.
   *
   * Get server side exclude setting for a zone.
   *
   * @param getServerSideExcludeOptions the {@link GetServerSideExcludeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerSideExcludeResp}
   */
  public ServiceCall<ServerSideExcludeResp> getServerSideExclude(GetServerSideExcludeOptions getServerSideExcludeOptions) {
    String[] pathSegments = { "v1", "zones", "settings/server_side_exclude" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getServerSideExclude");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ServerSideExcludeResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerSideExcludeResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get server side exclude setting.
   *
   * Get server side exclude setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ServerSideExcludeResp}
   */
  public ServiceCall<ServerSideExcludeResp> getServerSideExclude() {
    return getServerSideExclude(null);
  }

  /**
   * Update server side exclude setting.
   *
   * Update server side exclude setting for a zone.
   *
   * @param updateServerSideExcludeOptions the {@link UpdateServerSideExcludeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerSideExcludeResp}
   */
  public ServiceCall<ServerSideExcludeResp> updateServerSideExclude(UpdateServerSideExcludeOptions updateServerSideExcludeOptions) {
    boolean skipBody = false;
    if (updateServerSideExcludeOptions == null) {
      updateServerSideExcludeOptions = new UpdateServerSideExcludeOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/server_side_exclude" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateServerSideExclude");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateServerSideExcludeOptions.value() != null) {
        contentJson.addProperty("value", updateServerSideExcludeOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ServerSideExcludeResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerSideExcludeResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update server side exclude setting.
   *
   * Update server side exclude setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ServerSideExcludeResp}
   */
  public ServiceCall<ServerSideExcludeResp> updateServerSideExclude() {
    return updateServerSideExclude(null);
  }

  /**
   * Get HTTP strict transport security setting.
   *
   * Get HTTP strict transport security setting for a zone.
   *
   * @param getSecurityHeaderOptions the {@link GetSecurityHeaderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityHeaderResp}
   */
  public ServiceCall<SecurityHeaderResp> getSecurityHeader(GetSecurityHeaderOptions getSecurityHeaderOptions) {
    String[] pathSegments = { "v1", "zones", "settings/security_header" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getSecurityHeader");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecurityHeaderResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityHeaderResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get HTTP strict transport security setting.
   *
   * Get HTTP strict transport security setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityHeaderResp}
   */
  public ServiceCall<SecurityHeaderResp> getSecurityHeader() {
    return getSecurityHeader(null);
  }

  /**
   * Update HTTP strict transport security setting.
   *
   * Update HTTP strict transport security setting for a zone.
   *
   * @param updateSecurityHeaderOptions the {@link UpdateSecurityHeaderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityHeaderResp}
   */
  public ServiceCall<SecurityHeaderResp> updateSecurityHeader(UpdateSecurityHeaderOptions updateSecurityHeaderOptions) {
    boolean skipBody = false;
    if (updateSecurityHeaderOptions == null) {
      updateSecurityHeaderOptions = new UpdateSecurityHeaderOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/security_header" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateSecurityHeader");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateSecurityHeaderOptions.value() != null) {
        contentJson.add("value", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSecurityHeaderOptions.value()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SecurityHeaderResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityHeaderResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update HTTP strict transport security setting.
   *
   * Update HTTP strict transport security setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityHeaderResp}
   */
  public ServiceCall<SecurityHeaderResp> updateSecurityHeader() {
    return updateSecurityHeader(null);
  }

  /**
   * Get mobile redirect setting.
   *
   * Get mobile redirect setting for a zone.
   *
   * @param getMobileRedirectOptions the {@link GetMobileRedirectOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MobileRedirectResp}
   */
  public ServiceCall<MobileRedirectResp> getMobileRedirect(GetMobileRedirectOptions getMobileRedirectOptions) {
    String[] pathSegments = { "v1", "zones", "settings/mobile_redirect" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getMobileRedirect");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MobileRedirectResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MobileRedirectResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get mobile redirect setting.
   *
   * Get mobile redirect setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MobileRedirectResp}
   */
  public ServiceCall<MobileRedirectResp> getMobileRedirect() {
    return getMobileRedirect(null);
  }

  /**
   * Update mobile redirect setting.
   *
   * Update mobile redirect setting for a zone.
   *
   * @param updateMobileRedirectOptions the {@link UpdateMobileRedirectOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MobileRedirectResp}
   */
  public ServiceCall<MobileRedirectResp> updateMobileRedirect(UpdateMobileRedirectOptions updateMobileRedirectOptions) {
    boolean skipBody = false;
    if (updateMobileRedirectOptions == null) {
      updateMobileRedirectOptions = new UpdateMobileRedirectOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/mobile_redirect" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateMobileRedirect");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateMobileRedirectOptions.value() != null) {
        contentJson.add("value", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateMobileRedirectOptions.value()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<MobileRedirectResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MobileRedirectResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update mobile redirect setting.
   *
   * Update mobile redirect setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MobileRedirectResp}
   */
  public ServiceCall<MobileRedirectResp> updateMobileRedirect() {
    return updateMobileRedirect(null);
  }

  /**
   * Get prefetch URLs from header setting.
   *
   * Get prefetch URLs from header setting for a zone.
   *
   * @param getPrefetchPreloadOptions the {@link GetPrefetchPreloadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefetchPreloadResp}
   */
  public ServiceCall<PrefetchPreloadResp> getPrefetchPreload(GetPrefetchPreloadOptions getPrefetchPreloadOptions) {
    String[] pathSegments = { "v1", "zones", "settings/prefetch_preload" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getPrefetchPreload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PrefetchPreloadResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefetchPreloadResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get prefetch URLs from header setting.
   *
   * Get prefetch URLs from header setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrefetchPreloadResp}
   */
  public ServiceCall<PrefetchPreloadResp> getPrefetchPreload() {
    return getPrefetchPreload(null);
  }

  /**
   * Update prefetch URLs from header setting.
   *
   * Update prefetch URLs from header setting for a zone.
   *
   * @param updatePrefetchPreloadOptions the {@link UpdatePrefetchPreloadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefetchPreloadResp}
   */
  public ServiceCall<PrefetchPreloadResp> updatePrefetchPreload(UpdatePrefetchPreloadOptions updatePrefetchPreloadOptions) {
    boolean skipBody = false;
    if (updatePrefetchPreloadOptions == null) {
      updatePrefetchPreloadOptions = new UpdatePrefetchPreloadOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/prefetch_preload" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updatePrefetchPreload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updatePrefetchPreloadOptions.value() != null) {
        contentJson.addProperty("value", updatePrefetchPreloadOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PrefetchPreloadResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefetchPreloadResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update prefetch URLs from header setting.
   *
   * Update prefetch URLs from header setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrefetchPreloadResp}
   */
  public ServiceCall<PrefetchPreloadResp> updatePrefetchPreload() {
    return updatePrefetchPreload(null);
  }

  /**
   * Get http/2 setting.
   *
   * Get http/2 setting for a zone.
   *
   * @param getHttp2Options the {@link GetHttp2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Http2Resp}
   */
  public ServiceCall<Http2Resp> getHttp2(GetHttp2Options getHttp2Options) {
    String[] pathSegments = { "v1", "zones", "settings/http2" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getHttp2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Http2Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Http2Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get http/2 setting.
   *
   * Get http/2 setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link Http2Resp}
   */
  public ServiceCall<Http2Resp> getHttp2() {
    return getHttp2(null);
  }

  /**
   * Update http/2 setting.
   *
   * Update http/2 setting for a zone.
   *
   * @param updateHttp2Options the {@link UpdateHttp2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Http2Resp}
   */
  public ServiceCall<Http2Resp> updateHttp2(UpdateHttp2Options updateHttp2Options) {
    boolean skipBody = false;
    if (updateHttp2Options == null) {
      updateHttp2Options = new UpdateHttp2Options.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/http2" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateHttp2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateHttp2Options.value() != null) {
        contentJson.addProperty("value", updateHttp2Options.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Http2Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Http2Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update http/2 setting.
   *
   * Update http/2 setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link Http2Resp}
   */
  public ServiceCall<Http2Resp> updateHttp2() {
    return updateHttp2(null);
  }

  /**
   * Get IPv6 compatibility setting.
   *
   * Get IPv6 compatibility setting for a zone.
   *
   * @param getIpv6Options the {@link GetIpv6Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ipv6Resp}
   */
  public ServiceCall<Ipv6Resp> getIpv6(GetIpv6Options getIpv6Options) {
    String[] pathSegments = { "v1", "zones", "settings/ipv6" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getIpv6");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Ipv6Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ipv6Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get IPv6 compatibility setting.
   *
   * Get IPv6 compatibility setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link Ipv6Resp}
   */
  public ServiceCall<Ipv6Resp> getIpv6() {
    return getIpv6(null);
  }

  /**
   * Update IPv6 compatibility setting.
   *
   * Update IPv6 compatibility setting for a zone.
   *
   * @param updateIpv6Options the {@link UpdateIpv6Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Ipv6Resp}
   */
  public ServiceCall<Ipv6Resp> updateIpv6(UpdateIpv6Options updateIpv6Options) {
    boolean skipBody = false;
    if (updateIpv6Options == null) {
      updateIpv6Options = new UpdateIpv6Options.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/ipv6" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateIpv6");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateIpv6Options.value() != null) {
        contentJson.addProperty("value", updateIpv6Options.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Ipv6Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Ipv6Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update IPv6 compatibility setting.
   *
   * Update IPv6 compatibility setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link Ipv6Resp}
   */
  public ServiceCall<Ipv6Resp> updateIpv6() {
    return updateIpv6(null);
  }

  /**
   * Get web sockets setting.
   *
   * Get web sockets setting for a zone.
   *
   * @param getWebSocketsOptions the {@link GetWebSocketsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebsocketsResp}
   */
  public ServiceCall<WebsocketsResp> getWebSockets(GetWebSocketsOptions getWebSocketsOptions) {
    String[] pathSegments = { "v1", "zones", "settings/websockets" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getWebSockets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WebsocketsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebsocketsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get web sockets setting.
   *
   * Get web sockets setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WebsocketsResp}
   */
  public ServiceCall<WebsocketsResp> getWebSockets() {
    return getWebSockets(null);
  }

  /**
   * Update web sockets setting.
   *
   * Update web sockets setting for a zone.
   *
   * @param updateWebSocketsOptions the {@link UpdateWebSocketsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebsocketsResp}
   */
  public ServiceCall<WebsocketsResp> updateWebSockets(UpdateWebSocketsOptions updateWebSocketsOptions) {
    boolean skipBody = false;
    if (updateWebSocketsOptions == null) {
      updateWebSocketsOptions = new UpdateWebSocketsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/websockets" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateWebSockets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateWebSocketsOptions.value() != null) {
        contentJson.addProperty("value", updateWebSocketsOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<WebsocketsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebsocketsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update web sockets setting.
   *
   * Update web sockets setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WebsocketsResp}
   */
  public ServiceCall<WebsocketsResp> updateWebSockets() {
    return updateWebSockets(null);
  }

  /**
   * Get pseudo IPv4 setting.
   *
   * Get pseudo IPv4 setting for a zone.
   *
   * @param getPseudoIpv4Options the {@link GetPseudoIpv4Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PseudoIpv4Resp}
   */
  public ServiceCall<PseudoIpv4Resp> getPseudoIpv4(GetPseudoIpv4Options getPseudoIpv4Options) {
    String[] pathSegments = { "v1", "zones", "settings/pseudo_ipv4" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getPseudoIpv4");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PseudoIpv4Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PseudoIpv4Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get pseudo IPv4 setting.
   *
   * Get pseudo IPv4 setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link PseudoIpv4Resp}
   */
  public ServiceCall<PseudoIpv4Resp> getPseudoIpv4() {
    return getPseudoIpv4(null);
  }

  /**
   * Update pseudo IPv4 setting.
   *
   * Update pseudo IPv4 setting for a zone.
   *
   * @param updatePseudoIpv4Options the {@link UpdatePseudoIpv4Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PseudoIpv4Resp}
   */
  public ServiceCall<PseudoIpv4Resp> updatePseudoIpv4(UpdatePseudoIpv4Options updatePseudoIpv4Options) {
    boolean skipBody = false;
    if (updatePseudoIpv4Options == null) {
      updatePseudoIpv4Options = new UpdatePseudoIpv4Options.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/pseudo_ipv4" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updatePseudoIpv4");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updatePseudoIpv4Options.value() != null) {
        contentJson.addProperty("value", updatePseudoIpv4Options.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PseudoIpv4Resp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PseudoIpv4Resp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update pseudo IPv4 setting.
   *
   * Update pseudo IPv4 setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link PseudoIpv4Resp}
   */
  public ServiceCall<PseudoIpv4Resp> updatePseudoIpv4() {
    return updatePseudoIpv4(null);
  }

  /**
   * Get response buffering setting.
   *
   * Get response buffering setting for a zone.
   *
   * @param getResponseBufferingOptions the {@link GetResponseBufferingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResponseBufferingResp}
   */
  public ServiceCall<ResponseBufferingResp> getResponseBuffering(GetResponseBufferingOptions getResponseBufferingOptions) {
    String[] pathSegments = { "v1", "zones", "settings/response_buffering" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getResponseBuffering");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResponseBufferingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResponseBufferingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get response buffering setting.
   *
   * Get response buffering setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResponseBufferingResp}
   */
  public ServiceCall<ResponseBufferingResp> getResponseBuffering() {
    return getResponseBuffering(null);
  }

  /**
   * Update response buffering setting.
   *
   * Update response buffering setting for a zone.
   *
   * @param updateResponseBufferingOptions the {@link UpdateResponseBufferingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResponseBufferingResp}
   */
  public ServiceCall<ResponseBufferingResp> updateResponseBuffering(UpdateResponseBufferingOptions updateResponseBufferingOptions) {
    boolean skipBody = false;
    if (updateResponseBufferingOptions == null) {
      updateResponseBufferingOptions = new UpdateResponseBufferingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/response_buffering" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateResponseBuffering");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateResponseBufferingOptions.value() != null) {
        contentJson.addProperty("value", updateResponseBufferingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ResponseBufferingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResponseBufferingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update response buffering setting.
   *
   * Update response buffering setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResponseBufferingResp}
   */
  public ServiceCall<ResponseBufferingResp> updateResponseBuffering() {
    return updateResponseBuffering(null);
  }

  /**
   * Get hotlink protection setting.
   *
   * Get hotlink protection setting for a zone.
   *
   * @param getHotlinkProtectionOptions the {@link GetHotlinkProtectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HotlinkProtectionResp}
   */
  public ServiceCall<HotlinkProtectionResp> getHotlinkProtection(GetHotlinkProtectionOptions getHotlinkProtectionOptions) {
    String[] pathSegments = { "v1", "zones", "settings/hotlink_protection" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getHotlinkProtection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HotlinkProtectionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HotlinkProtectionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get hotlink protection setting.
   *
   * Get hotlink protection setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link HotlinkProtectionResp}
   */
  public ServiceCall<HotlinkProtectionResp> getHotlinkProtection() {
    return getHotlinkProtection(null);
  }

  /**
   * Update hotlink protection setting.
   *
   * Update hotlink protection setting for a zone.
   *
   * @param updateHotlinkProtectionOptions the {@link UpdateHotlinkProtectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HotlinkProtectionResp}
   */
  public ServiceCall<HotlinkProtectionResp> updateHotlinkProtection(UpdateHotlinkProtectionOptions updateHotlinkProtectionOptions) {
    boolean skipBody = false;
    if (updateHotlinkProtectionOptions == null) {
      updateHotlinkProtectionOptions = new UpdateHotlinkProtectionOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/hotlink_protection" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateHotlinkProtection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateHotlinkProtectionOptions.value() != null) {
        contentJson.addProperty("value", updateHotlinkProtectionOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<HotlinkProtectionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HotlinkProtectionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update hotlink protection setting.
   *
   * Update hotlink protection setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link HotlinkProtectionResp}
   */
  public ServiceCall<HotlinkProtectionResp> updateHotlinkProtection() {
    return updateHotlinkProtection(null);
  }

  /**
   * Get maximum upload size setting.
   *
   * Get maximum upload size setting for a zone.
   *
   * @param getMaxUploadOptions the {@link GetMaxUploadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MaxUploadResp}
   */
  public ServiceCall<MaxUploadResp> getMaxUpload(GetMaxUploadOptions getMaxUploadOptions) {
    String[] pathSegments = { "v1", "zones", "settings/max_upload" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getMaxUpload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MaxUploadResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MaxUploadResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get maximum upload size setting.
   *
   * Get maximum upload size setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MaxUploadResp}
   */
  public ServiceCall<MaxUploadResp> getMaxUpload() {
    return getMaxUpload(null);
  }

  /**
   * Update maximum upload size setting.
   *
   * Update maximum upload size setting for a zone.
   *
   * @param updateMaxUploadOptions the {@link UpdateMaxUploadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MaxUploadResp}
   */
  public ServiceCall<MaxUploadResp> updateMaxUpload(UpdateMaxUploadOptions updateMaxUploadOptions) {
    boolean skipBody = false;
    if (updateMaxUploadOptions == null) {
      updateMaxUploadOptions = new UpdateMaxUploadOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/max_upload" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateMaxUpload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateMaxUploadOptions.value() != null) {
        contentJson.addProperty("value", updateMaxUploadOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<MaxUploadResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MaxUploadResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update maximum upload size setting.
   *
   * Update maximum upload size setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link MaxUploadResp}
   */
  public ServiceCall<MaxUploadResp> updateMaxUpload() {
    return updateMaxUpload(null);
  }

  /**
   * Get TLS Client Auth setting.
   *
   * Get TLS Client Auth setting for a zone.
   *
   * @param getTlsClientAuthOptions the {@link GetTlsClientAuthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TlsClientAuthResp}
   */
  public ServiceCall<TlsClientAuthResp> getTlsClientAuth(GetTlsClientAuthOptions getTlsClientAuthOptions) {
    String[] pathSegments = { "v1", "zones", "settings/tls_client_auth" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getTlsClientAuth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TlsClientAuthResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TlsClientAuthResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get TLS Client Auth setting.
   *
   * Get TLS Client Auth setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link TlsClientAuthResp}
   */
  public ServiceCall<TlsClientAuthResp> getTlsClientAuth() {
    return getTlsClientAuth(null);
  }

  /**
   * Update TLS Client Auth setting.
   *
   * Update TLS Client Auth setting for a zone.
   *
   * @param updateTlsClientAuthOptions the {@link UpdateTlsClientAuthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TlsClientAuthResp}
   */
  public ServiceCall<TlsClientAuthResp> updateTlsClientAuth(UpdateTlsClientAuthOptions updateTlsClientAuthOptions) {
    boolean skipBody = false;
    if (updateTlsClientAuthOptions == null) {
      updateTlsClientAuthOptions = new UpdateTlsClientAuthOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/tls_client_auth" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateTlsClientAuth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateTlsClientAuthOptions.value() != null) {
        contentJson.addProperty("value", updateTlsClientAuthOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<TlsClientAuthResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TlsClientAuthResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update TLS Client Auth setting.
   *
   * Update TLS Client Auth setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link TlsClientAuthResp}
   */
  public ServiceCall<TlsClientAuthResp> updateTlsClientAuth() {
    return updateTlsClientAuth(null);
  }

  /**
   * Get browser check setting.
   *
   * Get browser check setting for a zone.
   *
   * @param getBrowserCheckOptions the {@link GetBrowserCheckOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BrowserCheckResp}
   */
  public ServiceCall<BrowserCheckResp> getBrowserCheck(GetBrowserCheckOptions getBrowserCheckOptions) {
    String[] pathSegments = { "v1", "zones", "settings/browser_check" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getBrowserCheck");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<BrowserCheckResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BrowserCheckResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get browser check setting.
   *
   * Get browser check setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link BrowserCheckResp}
   */
  public ServiceCall<BrowserCheckResp> getBrowserCheck() {
    return getBrowserCheck(null);
  }

  /**
   * Update browser check setting.
   *
   * Update browser check setting for a zone.
   *
   * @param updateBrowserCheckOptions the {@link UpdateBrowserCheckOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BrowserCheckResp}
   */
  public ServiceCall<BrowserCheckResp> updateBrowserCheck(UpdateBrowserCheckOptions updateBrowserCheckOptions) {
    boolean skipBody = false;
    if (updateBrowserCheckOptions == null) {
      updateBrowserCheckOptions = new UpdateBrowserCheckOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/browser_check" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateBrowserCheck");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateBrowserCheckOptions.value() != null) {
        contentJson.addProperty("value", updateBrowserCheckOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<BrowserCheckResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BrowserCheckResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update browser check setting.
   *
   * Update browser check setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link BrowserCheckResp}
   */
  public ServiceCall<BrowserCheckResp> updateBrowserCheck() {
    return updateBrowserCheck(null);
  }

  /**
   * Get enable error pages on setting.
   *
   * Get enable error pages on setting for a zone.
   *
   * @param getEnableErrorPagesOnOptions the {@link GetEnableErrorPagesOnOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OriginErrorPagePassThruResp}
   */
  public ServiceCall<OriginErrorPagePassThruResp> getEnableErrorPagesOn(GetEnableErrorPagesOnOptions getEnableErrorPagesOnOptions) {
    String[] pathSegments = { "v1", "zones", "settings/origin_error_page_pass_thru" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getEnableErrorPagesOn");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<OriginErrorPagePassThruResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OriginErrorPagePassThruResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get enable error pages on setting.
   *
   * Get enable error pages on setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link OriginErrorPagePassThruResp}
   */
  public ServiceCall<OriginErrorPagePassThruResp> getEnableErrorPagesOn() {
    return getEnableErrorPagesOn(null);
  }

  /**
   * Update enable error pages on setting.
   *
   * Update enable error pages on setting for a zone.
   *
   * @param updateEnableErrorPagesOnOptions the {@link UpdateEnableErrorPagesOnOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OriginErrorPagePassThruResp}
   */
  public ServiceCall<OriginErrorPagePassThruResp> updateEnableErrorPagesOn(UpdateEnableErrorPagesOnOptions updateEnableErrorPagesOnOptions) {
    boolean skipBody = false;
    if (updateEnableErrorPagesOnOptions == null) {
      updateEnableErrorPagesOnOptions = new UpdateEnableErrorPagesOnOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/origin_error_page_pass_thru" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateEnableErrorPagesOn");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateEnableErrorPagesOnOptions.value() != null) {
        contentJson.addProperty("value", updateEnableErrorPagesOnOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<OriginErrorPagePassThruResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OriginErrorPagePassThruResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update enable error pages on setting.
   *
   * Update enable error pages on setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link OriginErrorPagePassThruResp}
   */
  public ServiceCall<OriginErrorPagePassThruResp> updateEnableErrorPagesOn() {
    return updateEnableErrorPagesOn(null);
  }

  /**
   * Get web application firewall setting.
   *
   * Get web application firewall setting for a zone.
   *
   * @param getWebApplicationFirewallOptions the {@link GetWebApplicationFirewallOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafResp}
   */
  public ServiceCall<WafResp> getWebApplicationFirewall(GetWebApplicationFirewallOptions getWebApplicationFirewallOptions) {
    String[] pathSegments = { "v1", "zones", "settings/waf" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getWebApplicationFirewall");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WafResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get web application firewall setting.
   *
   * Get web application firewall setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WafResp}
   */
  public ServiceCall<WafResp> getWebApplicationFirewall() {
    return getWebApplicationFirewall(null);
  }

  /**
   * Update web application firewall setting.
   *
   * A Web Application Firewall (WAF) blocks requests that contain malicious content.
   *
   * @param updateWebApplicationFirewallOptions the {@link UpdateWebApplicationFirewallOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafResp}
   */
  public ServiceCall<WafResp> updateWebApplicationFirewall(UpdateWebApplicationFirewallOptions updateWebApplicationFirewallOptions) {
    boolean skipBody = false;
    if (updateWebApplicationFirewallOptions == null) {
      updateWebApplicationFirewallOptions = new UpdateWebApplicationFirewallOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/waf" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateWebApplicationFirewall");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateWebApplicationFirewallOptions.value() != null) {
        contentJson.addProperty("value", updateWebApplicationFirewallOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<WafResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update web application firewall setting.
   *
   * A Web Application Firewall (WAF) blocks requests that contain malicious content.
   *
   * @return a {@link ServiceCall} with a result of type {@link WafResp}
   */
  public ServiceCall<WafResp> updateWebApplicationFirewall() {
    return updateWebApplicationFirewall(null);
  }

  /**
   * Get ciphers setting.
   *
   * Get ciphers setting for a zone.
   *
   * @param getCiphersOptions the {@link GetCiphersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CiphersResp}
   */
  public ServiceCall<CiphersResp> getCiphers(GetCiphersOptions getCiphersOptions) {
    String[] pathSegments = { "v1", "zones", "settings/ciphers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "getCiphers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CiphersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CiphersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get ciphers setting.
   *
   * Get ciphers setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link CiphersResp}
   */
  public ServiceCall<CiphersResp> getCiphers() {
    return getCiphers(null);
  }

  /**
   * Update ciphers setting.
   *
   * Update ciphers setting for a zone.
   *
   * @param updateCiphersOptions the {@link UpdateCiphersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CiphersResp}
   */
  public ServiceCall<CiphersResp> updateCiphers(UpdateCiphersOptions updateCiphersOptions) {
    boolean skipBody = false;
    if (updateCiphersOptions == null) {
      updateCiphersOptions = new UpdateCiphersOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/ciphers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones_settings", "v1", "updateCiphers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateCiphersOptions.value() != null) {
        contentJson.add("value", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCiphersOptions.value()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<CiphersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CiphersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update ciphers setting.
   *
   * Update ciphers setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link CiphersResp}
   */
  public ServiceCall<CiphersResp> updateCiphers() {
    return updateCiphers(null);
  }

}
