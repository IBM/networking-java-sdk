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

package com.ibm.cloud.networking.zone_rate_limits.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.CreateZoneRateLimitsOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.DeleteRateLimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.DeleteZoneRateLimitOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.GetRateLimitOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.ListAllZoneRateLimitsOptions;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.ListRatelimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitResp;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.UpdateRateLimitOptions;
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
 * Zone Rate Limits.
 *
 * @version v1
 */
public class ZoneRateLimits extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "zone_rate_limits";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `ZoneRateLimits` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @return an instance of the `ZoneRateLimits` client using external configuration
   */
  public static ZoneRateLimits newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `ZoneRateLimits` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `ZoneRateLimits` client using external configuration
   */
  public static ZoneRateLimits newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    ZoneRateLimits service = new ZoneRateLimits(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `ZoneRateLimits` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public ZoneRateLimits(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
  }

  /**
   * Gets the crn.
   *
   * Full crn of the service instance.
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
   * Zone identifier (zone id).
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
   * List all rate limits.
   *
   * The details of Rate Limit for a given zone under a given service instance.
   *
   * @param listAllZoneRateLimitsOptions the {@link ListAllZoneRateLimitsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRatelimitResp}
   */
  public ServiceCall<ListRatelimitResp> listAllZoneRateLimits(ListAllZoneRateLimitsOptions listAllZoneRateLimitsOptions) {
    if (listAllZoneRateLimitsOptions == null) {
      listAllZoneRateLimitsOptions = new ListAllZoneRateLimitsOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "rate_limits" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_rate_limits", "v1", "listAllZoneRateLimits");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllZoneRateLimitsOptions.page() != null) {
      builder.query("page", String.valueOf(listAllZoneRateLimitsOptions.page()));
    }
    if (listAllZoneRateLimitsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllZoneRateLimitsOptions.perPage()));
    }
    ResponseConverter<ListRatelimitResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRatelimitResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all rate limits.
   *
   * The details of Rate Limit for a given zone under a given service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListRatelimitResp}
   */
  public ServiceCall<ListRatelimitResp> listAllZoneRateLimits() {
    return listAllZoneRateLimits(null);
  }

  /**
   * Create rate limit.
   *
   * Create a new rate limit for a given zone under a service instance.
   *
   * @param createZoneRateLimitsOptions the {@link CreateZoneRateLimitsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RatelimitResp}
   */
  public ServiceCall<RatelimitResp> createZoneRateLimits(CreateZoneRateLimitsOptions createZoneRateLimitsOptions) {
    boolean skipBody = false;
    if (createZoneRateLimitsOptions == null) {
      createZoneRateLimitsOptions = new CreateZoneRateLimitsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "rate_limits" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_rate_limits", "v1", "createZoneRateLimits");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createZoneRateLimitsOptions.disabled() != null) {
        contentJson.addProperty("disabled", createZoneRateLimitsOptions.disabled());
      }
      if (createZoneRateLimitsOptions.description() != null) {
        contentJson.addProperty("description", createZoneRateLimitsOptions.description());
      }
      if (createZoneRateLimitsOptions.bypass() != null) {
        contentJson.add("bypass", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRateLimitsOptions.bypass()));
      }
      if (createZoneRateLimitsOptions.threshold() != null) {
        contentJson.addProperty("threshold", createZoneRateLimitsOptions.threshold());
      }
      if (createZoneRateLimitsOptions.period() != null) {
        contentJson.addProperty("period", createZoneRateLimitsOptions.period());
      }
      if (createZoneRateLimitsOptions.action() != null) {
        contentJson.add("action", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRateLimitsOptions.action()));
      }
      if (createZoneRateLimitsOptions.correlate() != null) {
        contentJson.add("correlate", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRateLimitsOptions.correlate()));
      }
      if (createZoneRateLimitsOptions.match() != null) {
        contentJson.add("match", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRateLimitsOptions.match()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<RatelimitResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RatelimitResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create rate limit.
   *
   * Create a new rate limit for a given zone under a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link RatelimitResp}
   */
  public ServiceCall<RatelimitResp> createZoneRateLimits() {
    return createZoneRateLimits(null);
  }

  /**
   * Delete rate limit.
   *
   * Delete a rate limit given its id.
   *
   * @param deleteZoneRateLimitOptions the {@link DeleteZoneRateLimitOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteRateLimitResp}
   */
  public ServiceCall<DeleteRateLimitResp> deleteZoneRateLimit(DeleteZoneRateLimitOptions deleteZoneRateLimitOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneRateLimitOptions,
      "deleteZoneRateLimitOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "rate_limits" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteZoneRateLimitOptions.rateLimitIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_rate_limits", "v1", "deleteZoneRateLimit");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteRateLimitResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteRateLimitResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a rate limit.
   *
   * Get the details of a rate limit for a given zone under a given service instance.
   *
   * @param getRateLimitOptions the {@link GetRateLimitOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RatelimitResp}
   */
  public ServiceCall<RatelimitResp> getRateLimit(GetRateLimitOptions getRateLimitOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRateLimitOptions,
      "getRateLimitOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "rate_limits" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getRateLimitOptions.rateLimitIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_rate_limits", "v1", "getRateLimit");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RatelimitResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RatelimitResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update rate limit.
   *
   * Update an existing rate limit for a given zone under a service instance.
   *
   * @param updateRateLimitOptions the {@link UpdateRateLimitOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RatelimitResp}
   */
  public ServiceCall<RatelimitResp> updateRateLimit(UpdateRateLimitOptions updateRateLimitOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateRateLimitOptions,
      "updateRateLimitOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "rate_limits" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateRateLimitOptions.rateLimitIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_rate_limits", "v1", "updateRateLimit");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateRateLimitOptions.disabled() != null) {
      contentJson.addProperty("disabled", updateRateLimitOptions.disabled());
    }
    if (updateRateLimitOptions.description() != null) {
      contentJson.addProperty("description", updateRateLimitOptions.description());
    }
    if (updateRateLimitOptions.bypass() != null) {
      contentJson.add("bypass", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRateLimitOptions.bypass()));
    }
    if (updateRateLimitOptions.threshold() != null) {
      contentJson.addProperty("threshold", updateRateLimitOptions.threshold());
    }
    if (updateRateLimitOptions.period() != null) {
      contentJson.addProperty("period", updateRateLimitOptions.period());
    }
    if (updateRateLimitOptions.action() != null) {
      contentJson.add("action", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRateLimitOptions.action()));
    }
    if (updateRateLimitOptions.correlate() != null) {
      contentJson.add("correlate", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRateLimitOptions.correlate()));
    }
    if (updateRateLimitOptions.match() != null) {
      contentJson.add("match", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRateLimitOptions.match()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RatelimitResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RatelimitResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
