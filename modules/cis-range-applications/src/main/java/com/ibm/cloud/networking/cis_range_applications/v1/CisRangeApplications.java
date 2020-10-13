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

package com.ibm.cloud.networking.cis_range_applications.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.cis_range_applications.v1.model.CreateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.DeleteRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.GetRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.ListRangeAppsOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationResp;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplications;
import com.ibm.cloud.networking.cis_range_applications.v1.model.UpdateRangeAppOptions;
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
 * Range Applications.
 *
 * @version v1
 */
public class CisRangeApplications extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "cis_range_applications";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `CisRangeApplications` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier zone identifier.
   * @return an instance of the `CisRangeApplications` client using external configuration
   */
  public static CisRangeApplications newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `CisRangeApplications` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `CisRangeApplications` client using external configuration
   */
  public static CisRangeApplications newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    CisRangeApplications service = new CisRangeApplications(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `CisRangeApplications` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public CisRangeApplications(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * zone identifier.
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
   * List range applications.
   *
   * Get a list of currently existing Range Applications inside a zone.
   *
   * @param listRangeAppsOptions the {@link ListRangeAppsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RangeApplications}
   */
  public ServiceCall<RangeApplications> listRangeApps(ListRangeAppsOptions listRangeAppsOptions) {
    if (listRangeAppsOptions == null) {
      listRangeAppsOptions = new ListRangeAppsOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "range/apps" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cis_range_applications", "v1", "listRangeApps");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listRangeAppsOptions.page() != null) {
      builder.query("page", String.valueOf(listRangeAppsOptions.page()));
    }
    if (listRangeAppsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listRangeAppsOptions.perPage()));
    }
    if (listRangeAppsOptions.order() != null) {
      builder.query("order", String.valueOf(listRangeAppsOptions.order()));
    }
    if (listRangeAppsOptions.direction() != null) {
      builder.query("direction", String.valueOf(listRangeAppsOptions.direction()));
    }
    ResponseConverter<RangeApplications> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RangeApplications>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List range applications.
   *
   * Get a list of currently existing Range Applications inside a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link RangeApplications}
   */
  public ServiceCall<RangeApplications> listRangeApps() {
    return listRangeApps(null);
  }

  /**
   * Create Range Application.
   *
   * Create a Range Applications inside a zone.
   *
   * @param createRangeAppOptions the {@link CreateRangeAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RangeApplicationResp}
   */
  public ServiceCall<RangeApplicationResp> createRangeApp(CreateRangeAppOptions createRangeAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createRangeAppOptions,
      "createRangeAppOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "range/apps" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cis_range_applications", "v1", "createRangeApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("protocol", createRangeAppOptions.protocol());
    contentJson.add("dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRangeAppOptions.dns()));
    if (createRangeAppOptions.originDirect() != null) {
      contentJson.add("origin_direct", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRangeAppOptions.originDirect()));
    }
    if (createRangeAppOptions.originDns() != null) {
      contentJson.add("origin_dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRangeAppOptions.originDns()));
    }
    if (createRangeAppOptions.originPort() != null) {
      contentJson.addProperty("origin_port", createRangeAppOptions.originPort());
    }
    if (createRangeAppOptions.ipFirewall() != null) {
      contentJson.addProperty("ip_firewall", createRangeAppOptions.ipFirewall());
    }
    if (createRangeAppOptions.proxyProtocol() != null) {
      contentJson.addProperty("proxy_protocol", createRangeAppOptions.proxyProtocol());
    }
    if (createRangeAppOptions.edgeIps() != null) {
      contentJson.add("edge_ips", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createRangeAppOptions.edgeIps()));
    }
    if (createRangeAppOptions.trafficType() != null) {
      contentJson.addProperty("traffic_type", createRangeAppOptions.trafficType());
    }
    if (createRangeAppOptions.tls() != null) {
      contentJson.addProperty("tls", createRangeAppOptions.tls());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RangeApplicationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RangeApplicationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get range application a zone.
   *
   * Get the application configuration of a specific application inside a zone.
   *
   * @param getRangeAppOptions the {@link GetRangeAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RangeApplicationResp}
   */
  public ServiceCall<RangeApplicationResp> getRangeApp(GetRangeAppOptions getRangeAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRangeAppOptions,
      "getRangeAppOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "range/apps" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getRangeAppOptions.appIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cis_range_applications", "v1", "getRangeApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RangeApplicationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RangeApplicationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update range application.
   *
   * Update a Range Application inside a zone.
   *
   * @param updateRangeAppOptions the {@link UpdateRangeAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RangeApplicationResp}
   */
  public ServiceCall<RangeApplicationResp> updateRangeApp(UpdateRangeAppOptions updateRangeAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateRangeAppOptions,
      "updateRangeAppOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "range/apps" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateRangeAppOptions.appIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cis_range_applications", "v1", "updateRangeApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("protocol", updateRangeAppOptions.protocol());
    contentJson.add("dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRangeAppOptions.dns()));
    if (updateRangeAppOptions.originDirect() != null) {
      contentJson.add("origin_direct", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRangeAppOptions.originDirect()));
    }
    if (updateRangeAppOptions.originDns() != null) {
      contentJson.add("origin_dns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRangeAppOptions.originDns()));
    }
    if (updateRangeAppOptions.originPort() != null) {
      contentJson.addProperty("origin_port", updateRangeAppOptions.originPort());
    }
    if (updateRangeAppOptions.ipFirewall() != null) {
      contentJson.addProperty("ip_firewall", updateRangeAppOptions.ipFirewall());
    }
    if (updateRangeAppOptions.proxyProtocol() != null) {
      contentJson.addProperty("proxy_protocol", updateRangeAppOptions.proxyProtocol());
    }
    if (updateRangeAppOptions.edgeIps() != null) {
      contentJson.add("edge_ips", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateRangeAppOptions.edgeIps()));
    }
    if (updateRangeAppOptions.trafficType() != null) {
      contentJson.addProperty("traffic_type", updateRangeAppOptions.trafficType());
    }
    if (updateRangeAppOptions.tls() != null) {
      contentJson.addProperty("tls", updateRangeAppOptions.tls());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RangeApplicationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RangeApplicationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete range application.
   *
   * Delete a specific application configuration.
   *
   * @param deleteRangeAppOptions the {@link DeleteRangeAppOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RangeApplicationResp}
   */
  public ServiceCall<RangeApplicationResp> deleteRangeApp(DeleteRangeAppOptions deleteRangeAppOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteRangeAppOptions,
      "deleteRangeAppOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "range/apps" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteRangeAppOptions.appIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("cis_range_applications", "v1", "deleteRangeApp");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RangeApplicationResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RangeApplicationResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
