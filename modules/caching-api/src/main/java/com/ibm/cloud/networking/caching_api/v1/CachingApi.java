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

package com.ibm.cloud.networking.caching_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.caching_api.v1.model.BrowserTTLResponse;
import com.ibm.cloud.networking.caching_api.v1.model.CacheLevelResponse;
import com.ibm.cloud.networking.caching_api.v1.model.DeveopmentModeResponse;
import com.ibm.cloud.networking.caching_api.v1.model.EnableQueryStringSortResponse;
import com.ibm.cloud.networking.caching_api.v1.model.GetBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetQueryStringSortOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllResponse;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByCacheTagsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByHostsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByUrlsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateQueryStringSortOptions;
import com.ibm.cloud.networking.common.SdkCommon;
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
 * This document describes CIS caching  API.
 *
 * @version v1
 */
public class CachingApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "caching_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `CachingApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @return an instance of the `CachingApi` client using external configuration
   */
  public static CachingApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `CachingApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `CachingApi` client using external configuration
   */
  public static CachingApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    CachingApi service = new CachingApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `CachingApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public CachingApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneId(zoneId);
  }

  /**
   * Gets the crn.
   *
   * cloud resource name.
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
   * Gets the zoneId.
   *
   * zone id.
   *
   * @return the zoneId
   */
  public String getZoneId() {
    return this.zoneId;
  }

  /**
   * Sets the zoneId.
   *
   * @param zoneId the new zoneId
   */
  public void setZoneId(final String zoneId) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(zoneId, "zoneId cannot be empty.");
    this.zoneId = zoneId;
  }

  /**
   * Purge all.
   *
   * All resources in CDN edge servers' cache should be removed. This may have dramatic affects on your origin server
   * load after performing this action.
   *
   * @param purgeAllOptions the {@link PurgeAllOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeAll(PurgeAllOptions purgeAllOptions) {
    String[] pathSegments = { "v1", "zones", "purge_cache/purge_all" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "purgeAll");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PurgeAllResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PurgeAllResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Purge all.
   *
   * All resources in CDN edge servers' cache should be removed. This may have dramatic affects on your origin server
   * load after performing this action.
   *
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeAll() {
    return purgeAll(null);
  }

  /**
   * Purge URLs.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying URLs.
   *
   * @param purgeByUrlsOptions the {@link PurgeByUrlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByUrls(PurgeByUrlsOptions purgeByUrlsOptions) {
    boolean skipBody = false;
    if (purgeByUrlsOptions == null) {
      purgeByUrlsOptions = new PurgeByUrlsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "purge_cache/purge_by_urls" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "purgeByUrls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (purgeByUrlsOptions.files() != null) {
        contentJson.add("files", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(purgeByUrlsOptions.files()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PurgeAllResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PurgeAllResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Purge URLs.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying URLs.
   *
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByUrls() {
    return purgeByUrls(null);
  }

  /**
   * Purge Cache-Tags.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying the associated Cache-Tags.
   *
   * @param purgeByCacheTagsOptions the {@link PurgeByCacheTagsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByCacheTags(PurgeByCacheTagsOptions purgeByCacheTagsOptions) {
    boolean skipBody = false;
    if (purgeByCacheTagsOptions == null) {
      purgeByCacheTagsOptions = new PurgeByCacheTagsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "purge_cache/purge_by_cache_tags" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "purgeByCacheTags");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (purgeByCacheTagsOptions.tags() != null) {
        contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(purgeByCacheTagsOptions.tags()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PurgeAllResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PurgeAllResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Purge Cache-Tags.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying the associated Cache-Tags.
   *
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByCacheTags() {
    return purgeByCacheTags(null);
  }

  /**
   * Purge host names.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying the hostnames.
   *
   * @param purgeByHostsOptions the {@link PurgeByHostsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByHosts(PurgeByHostsOptions purgeByHostsOptions) {
    boolean skipBody = false;
    if (purgeByHostsOptions == null) {
      purgeByHostsOptions = new PurgeByHostsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "purge_cache/purge_by_hosts" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "purgeByHosts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (purgeByHostsOptions.hosts() != null) {
        contentJson.add("hosts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(purgeByHostsOptions.hosts()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PurgeAllResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PurgeAllResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Purge host names.
   *
   * Granularly remove one or more files from CDN edge servers' cache either by specifying the hostnames.
   *
   * @return a {@link ServiceCall} with a result of type {@link PurgeAllResponse}
   */
  public ServiceCall<PurgeAllResponse> purgeByHosts() {
    return purgeByHosts(null);
  }

  /**
   * Get browser cache TTL setting.
   *
   * Browser Cache TTL (in seconds) specifies how long CDN edge servers cached resources will remain on your visitors'
   * computers.
   *
   * @param getBrowserCacheTtlOptions the {@link GetBrowserCacheTtlOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BrowserTTLResponse}
   */
  public ServiceCall<BrowserTTLResponse> getBrowserCacheTtl(GetBrowserCacheTtlOptions getBrowserCacheTtlOptions) {
    String[] pathSegments = { "v1", "zones", "settings/browser_cache_ttl" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "getBrowserCacheTtl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<BrowserTTLResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BrowserTTLResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get browser cache TTL setting.
   *
   * Browser Cache TTL (in seconds) specifies how long CDN edge servers cached resources will remain on your visitors'
   * computers.
   *
   * @return a {@link ServiceCall} with a result of type {@link BrowserTTLResponse}
   */
  public ServiceCall<BrowserTTLResponse> getBrowserCacheTtl() {
    return getBrowserCacheTtl(null);
  }

  /**
   * Change browser cache TTL setting.
   *
   * Browser Cache TTL (in seconds) specifies how long CDN edge servers cached resources will remain on your visitors'
   * computers.
   *
   * @param updateBrowserCacheTtlOptions the {@link UpdateBrowserCacheTtlOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BrowserTTLResponse}
   */
  public ServiceCall<BrowserTTLResponse> updateBrowserCacheTtl(UpdateBrowserCacheTtlOptions updateBrowserCacheTtlOptions) {
    boolean skipBody = false;
    if (updateBrowserCacheTtlOptions == null) {
      updateBrowserCacheTtlOptions = new UpdateBrowserCacheTtlOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/browser_cache_ttl" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "updateBrowserCacheTtl");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateBrowserCacheTtlOptions.value() != null) {
        contentJson.addProperty("value", updateBrowserCacheTtlOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<BrowserTTLResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BrowserTTLResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change browser cache TTL setting.
   *
   * Browser Cache TTL (in seconds) specifies how long CDN edge servers cached resources will remain on your visitors'
   * computers.
   *
   * @return a {@link ServiceCall} with a result of type {@link BrowserTTLResponse}
   */
  public ServiceCall<BrowserTTLResponse> updateBrowserCacheTtl() {
    return updateBrowserCacheTtl(null);
  }

  /**
   * Get development mode setting.
   *
   * Get development mode setting.
   *
   * @param getDevelopmentModeOptions the {@link GetDevelopmentModeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeveopmentModeResponse}
   */
  public ServiceCall<DeveopmentModeResponse> getDevelopmentMode(GetDevelopmentModeOptions getDevelopmentModeOptions) {
    String[] pathSegments = { "v1", "zones", "settings/development_mode" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "getDevelopmentMode");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeveopmentModeResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeveopmentModeResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get development mode setting.
   *
   * Get development mode setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link DeveopmentModeResponse}
   */
  public ServiceCall<DeveopmentModeResponse> getDevelopmentMode() {
    return getDevelopmentMode(null);
  }

  /**
   * Change development mode setting.
   *
   * Change development mode setting.
   *
   * @param updateDevelopmentModeOptions the {@link UpdateDevelopmentModeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeveopmentModeResponse}
   */
  public ServiceCall<DeveopmentModeResponse> updateDevelopmentMode(UpdateDevelopmentModeOptions updateDevelopmentModeOptions) {
    boolean skipBody = false;
    if (updateDevelopmentModeOptions == null) {
      updateDevelopmentModeOptions = new UpdateDevelopmentModeOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/development_mode" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "updateDevelopmentMode");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateDevelopmentModeOptions.value() != null) {
        contentJson.addProperty("value", updateDevelopmentModeOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<DeveopmentModeResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeveopmentModeResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change development mode setting.
   *
   * Change development mode setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link DeveopmentModeResponse}
   */
  public ServiceCall<DeveopmentModeResponse> updateDevelopmentMode() {
    return updateDevelopmentMode(null);
  }

  /**
   * Get Enable Query String Sort setting.
   *
   * Get Enable Query String Sort setting.
   *
   * @param getQueryStringSortOptions the {@link GetQueryStringSortOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnableQueryStringSortResponse}
   */
  public ServiceCall<EnableQueryStringSortResponse> getQueryStringSort(GetQueryStringSortOptions getQueryStringSortOptions) {
    String[] pathSegments = { "v1", "zones", "settings/sort_query_string_for_cache" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "getQueryStringSort");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<EnableQueryStringSortResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnableQueryStringSortResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Enable Query String Sort setting.
   *
   * Get Enable Query String Sort setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link EnableQueryStringSortResponse}
   */
  public ServiceCall<EnableQueryStringSortResponse> getQueryStringSort() {
    return getQueryStringSort(null);
  }

  /**
   * Change Enable Query String Sort setting.
   *
   * Change Enable Query String Sort setting.
   *
   * @param updateQueryStringSortOptions the {@link UpdateQueryStringSortOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnableQueryStringSortResponse}
   */
  public ServiceCall<EnableQueryStringSortResponse> updateQueryStringSort(UpdateQueryStringSortOptions updateQueryStringSortOptions) {
    boolean skipBody = false;
    if (updateQueryStringSortOptions == null) {
      updateQueryStringSortOptions = new UpdateQueryStringSortOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/sort_query_string_for_cache" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "updateQueryStringSort");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateQueryStringSortOptions.value() != null) {
        contentJson.addProperty("value", updateQueryStringSortOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<EnableQueryStringSortResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnableQueryStringSortResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change Enable Query String Sort setting.
   *
   * Change Enable Query String Sort setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link EnableQueryStringSortResponse}
   */
  public ServiceCall<EnableQueryStringSortResponse> updateQueryStringSort() {
    return updateQueryStringSort(null);
  }

  /**
   * Get cache level setting of a specific zone.
   *
   * Get cache level setting of a specific zone.
   *
   * @param getCacheLevelOptions the {@link GetCacheLevelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CacheLevelResponse}
   */
  public ServiceCall<CacheLevelResponse> getCacheLevel(GetCacheLevelOptions getCacheLevelOptions) {
    String[] pathSegments = { "v1", "zones", "settings/cache_level" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "getCacheLevel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CacheLevelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CacheLevelResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get cache level setting of a specific zone.
   *
   * Get cache level setting of a specific zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link CacheLevelResponse}
   */
  public ServiceCall<CacheLevelResponse> getCacheLevel() {
    return getCacheLevel(null);
  }

  /**
   * Set cache level setting for a specific zone.
   *
   * The `basic` setting will cache most static resources (i.e., css, images, and JavaScript). The `simplified` setting
   * will ignore the query string when delivering a cached resource. The `aggressive` setting will cache all static
   * resources, including ones with a query string.
   *
   * @param updateCacheLevelOptions the {@link UpdateCacheLevelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CacheLevelResponse}
   */
  public ServiceCall<CacheLevelResponse> updateCacheLevel(UpdateCacheLevelOptions updateCacheLevelOptions) {
    boolean skipBody = false;
    if (updateCacheLevelOptions == null) {
      updateCacheLevelOptions = new UpdateCacheLevelOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/cache_level" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("caching_api", "v1", "updateCacheLevel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateCacheLevelOptions.value() != null) {
        contentJson.addProperty("value", updateCacheLevelOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<CacheLevelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CacheLevelResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set cache level setting for a specific zone.
   *
   * The `basic` setting will cache most static resources (i.e., css, images, and JavaScript). The `simplified` setting
   * will ignore the query string when delivering a cached resource. The `aggressive` setting will cache all static
   * resources, including ones with a query string.
   *
   * @return a {@link ServiceCall} with a result of type {@link CacheLevelResponse}
   */
  public ServiceCall<CacheLevelResponse> updateCacheLevel() {
    return updateCacheLevel(null);
  }

}
