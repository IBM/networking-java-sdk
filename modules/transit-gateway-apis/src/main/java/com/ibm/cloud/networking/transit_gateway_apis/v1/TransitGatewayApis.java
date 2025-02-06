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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.73.0-eeee85a9-20230607-165104
 */

package com.ibm.cloud.networking.transit_gateway_apis.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionActionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayGreTunnelOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.DeleteTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetGatewayLocationOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayRouteReportOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListGatewayLocationsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionPrefixFiltersOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayConnectionsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayGreTunnelOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewayRouteReportsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ListTransitGatewaysOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ReplaceTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReport;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TSLocation;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGateway;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayTunnel;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayTunnelCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionTunnelsOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator).
 *
 * API Version: __VERSION__
 */
public class TransitGatewayApis extends BaseService {

  /**
   * Default service name used when configuring the `TransitGatewayApis` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "transit_gateway_apis";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://transit.cloud.ibm.com/v1";

  private String version;

 /**
   * Class method which constructs an instance of the `TransitGatewayApis` client.
   * The default service name is used to configure the client instance.
   *
   * @param version Requests the version of the API as of a date in the format `YYYY-MM-DD`. Any date up to the current
 * date may be provided. Specify the current date to request the latest version.
   * @return an instance of the `TransitGatewayApis` client using external configuration
   */
  public static TransitGatewayApis newInstance(String version) {
    return newInstance(version, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `TransitGatewayApis` client.
   * The specified service name is used to configure the client instance.
   *
   * @param version Requests the version of the API as of a date in the format `YYYY-MM-DD`. Any date up to the current
 * date may be provided. Specify the current date to request the latest version.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `TransitGatewayApis` client using external configuration
   */
  public static TransitGatewayApis newInstance(String version, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    TransitGatewayApis service = new TransitGatewayApis(version, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `TransitGatewayApis` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param version Requests the version of the API as of a date in the format `YYYY-MM-DD`. Any date up to the current
 * date may be provided. Specify the current date to request the latest version.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public TransitGatewayApis(String version, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setVersion(version);
  }

  /**
   * Gets the version.
   *
   * Requests the version of the API as of a date in the format `YYYY-MM-DD`. Any date up to the current date may be
   * provided. Specify the current date to request the latest version.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Sets the version.
   *
   * @param version the new version
   */
  public void setVersion(final String version) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(version, "version cannot be empty.");
    this.version = version;
  }

  /**
   * Retrieves all Transit Gateways.
   *
   * List all Transit Gateways in account the caller is authorized to view.
   *
   * @param listTransitGatewaysOptions the {@link ListTransitGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayCollection}
   */
  public ServiceCall<TransitGatewayCollection> listTransitGateways(ListTransitGatewaysOptions listTransitGatewaysOptions) {
    if (listTransitGatewaysOptions == null) {
      listTransitGatewaysOptions = new ListTransitGatewaysOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listTransitGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    if (listTransitGatewaysOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTransitGatewaysOptions.limit()));
    }
    if (listTransitGatewaysOptions.start() != null) {
      builder.query("start", String.valueOf(listTransitGatewaysOptions.start()));
    }
    ResponseConverter<TransitGatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves all Transit Gateways.
   *
   * List all Transit Gateways in account the caller is authorized to view.
   *
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayCollection}
   */
  public ServiceCall<TransitGatewayCollection> listTransitGateways() {
    return listTransitGateways(null);
  }

  /**
   * Creates a Transit Gateway.
   *
   * Create a Transit Gateway based on the supplied input template.
   *
   * @param createTransitGatewayOptions the {@link CreateTransitGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGateway}
   */
  public ServiceCall<TransitGateway> createTransitGateway(CreateTransitGatewayOptions createTransitGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayOptions,
      "createTransitGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("location", createTransitGatewayOptions.location());
    contentJson.addProperty("name", createTransitGatewayOptions.name());
    if (createTransitGatewayOptions.allowGreTrafficAcrossZones() != null) {
      contentJson.addProperty("allow_gre_traffic_across_zones", createTransitGatewayOptions.allowGreTrafficAcrossZones());
    }
    if (createTransitGatewayOptions.global() != null) {
      contentJson.addProperty("global", createTransitGatewayOptions.global());
    }
    if (createTransitGatewayOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTransitGatewayOptions.resourceGroup()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TransitGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deletes specified Transit Gateway.
   *
   * This request deletes a Transit Gateway. This operation cannot be reversed. For this request to succeed, the Transit
   * Gateway must not contain connections.
   *
   * @param deleteTransitGatewayOptions the {@link DeleteTransitGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTransitGateway(DeleteTransitGatewayOptions deleteTransitGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTransitGatewayOptions,
      "deleteTransitGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteTransitGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "deleteTransitGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves specified Transit Gateway.
   *
   * This request retrieves a single Transit Gateway specified by the identifier in the URL.
   *
   * @param getTransitGatewayOptions the {@link GetTransitGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGateway}
   */
  public ServiceCall<TransitGateway> getTransitGateway(GetTransitGatewayOptions getTransitGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTransitGatewayOptions,
      "getTransitGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getTransitGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getTransitGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TransitGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates specified Transit Gateway.
   *
   * This request updates a Transit Gateway's name and/or global flag.
   *
   * @param updateTransitGatewayOptions the {@link UpdateTransitGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGateway}
   */
  public ServiceCall<TransitGateway> updateTransitGateway(UpdateTransitGatewayOptions updateTransitGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTransitGatewayOptions,
      "updateTransitGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateTransitGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "updateTransitGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (updateTransitGatewayOptions.allowGreTrafficAcrossZones() != null) {
      contentJson.addProperty("allow_gre_traffic_across_zones", updateTransitGatewayOptions.allowGreTrafficAcrossZones());
    }
    if (updateTransitGatewayOptions.global() != null) {
      contentJson.addProperty("global", updateTransitGatewayOptions.global());
    }
    if (updateTransitGatewayOptions.name() != null) {
      contentJson.addProperty("name", updateTransitGatewayOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TransitGateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves all connections.
   *
   * List all transit gateway connections associated with this account.
   *
   * @param listConnectionsOptions the {@link ListConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitConnectionCollection}
   */
  public ServiceCall<TransitConnectionCollection> listConnections(ListConnectionsOptions listConnectionsOptions) {
    if (listConnectionsOptions == null) {
      listConnectionsOptions = new ListConnectionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/connections"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    if (listConnectionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listConnectionsOptions.limit()));
    }
    if (listConnectionsOptions.start() != null) {
      builder.query("start", String.valueOf(listConnectionsOptions.start()));
    }
    if (listConnectionsOptions.networkId() != null) {
      builder.query("network_id", String.valueOf(listConnectionsOptions.networkId()));
    }
    ResponseConverter<TransitConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves all connections.
   *
   * List all transit gateway connections associated with this account.
   *
   * @return a {@link ServiceCall} with a result of type {@link TransitConnectionCollection}
   */
  public ServiceCall<TransitConnectionCollection> listConnections() {
    return listConnections(null);
  }

  /**
   * Retrieves all connections in a Transit Gateway.
   *
   * This request retrieves all connections in a Transit Gateway.
   *
   * @param listTransitGatewayConnectionsOptions the {@link ListTransitGatewayConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayConnectionCollection}
   */
  public ServiceCall<TransitGatewayConnectionCollection> listTransitGatewayConnections(ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTransitGatewayConnectionsOptions,
      "listTransitGatewayConnectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", listTransitGatewayConnectionsOptions.transitGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listTransitGatewayConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    if (listTransitGatewayConnectionsOptions.start() != null) {
      builder.query("start", String.valueOf(listTransitGatewayConnectionsOptions.start()));
    }
    if (listTransitGatewayConnectionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTransitGatewayConnectionsOptions.limit()));
    }
    if (listTransitGatewayConnectionsOptions.name() != null) {
      builder.query("name", String.valueOf(listTransitGatewayConnectionsOptions.name()));
    }
    ResponseConverter<TransitGatewayConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Adds a connection to a Transit Gateway.
   *
   * Add a connection to Transit Gateway.
   *
   * @param createTransitGatewayConnectionOptions the {@link CreateTransitGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayConnectionCust}
   */
  public ServiceCall<TransitGatewayConnectionCust> createTransitGatewayConnection(CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayConnectionOptions,
      "createTransitGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", createTransitGatewayConnectionOptions.transitGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("network_type", createTransitGatewayConnectionOptions.networkType());
    if (createTransitGatewayConnectionOptions.baseConnectionId() != null) {
      contentJson.addProperty("base_connection_id", createTransitGatewayConnectionOptions.baseConnectionId());
    }
    if (createTransitGatewayConnectionOptions.baseNetworkType() != null) {
      contentJson.addProperty("base_network_type", createTransitGatewayConnectionOptions.baseNetworkType());
    }
    if (createTransitGatewayConnectionOptions.cidr() != null) {
      contentJson.addProperty("cidr", createTransitGatewayConnectionOptions.cidr());
    }
    if (createTransitGatewayConnectionOptions.localGatewayIp() != null) {
      contentJson.addProperty("local_gateway_ip", createTransitGatewayConnectionOptions.localGatewayIp());
    }
    if (createTransitGatewayConnectionOptions.localTunnelIp() != null) {
      contentJson.addProperty("local_tunnel_ip", createTransitGatewayConnectionOptions.localTunnelIp());
    }
    if (createTransitGatewayConnectionOptions.name() != null) {
      contentJson.addProperty("name", createTransitGatewayConnectionOptions.name());
    }
    if (createTransitGatewayConnectionOptions.networkAccountId() != null) {
      contentJson.addProperty("network_account_id", createTransitGatewayConnectionOptions.networkAccountId());
    }
    if (createTransitGatewayConnectionOptions.networkId() != null) {
      contentJson.addProperty("network_id", createTransitGatewayConnectionOptions.networkId());
    }
    if (createTransitGatewayConnectionOptions.prefixFilters() != null) {
      contentJson.add("prefix_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTransitGatewayConnectionOptions.prefixFilters()));
    }
    if (createTransitGatewayConnectionOptions.prefixFiltersDefault() != null) {
      contentJson.addProperty("prefix_filters_default", createTransitGatewayConnectionOptions.prefixFiltersDefault());
    }
    if (createTransitGatewayConnectionOptions.remoteBgpAsn() != null) {
      contentJson.addProperty("remote_bgp_asn", createTransitGatewayConnectionOptions.remoteBgpAsn());
    }
    if (createTransitGatewayConnectionOptions.remoteGatewayIp() != null) {
      contentJson.addProperty("remote_gateway_ip", createTransitGatewayConnectionOptions.remoteGatewayIp());
    }
    if (createTransitGatewayConnectionOptions.remoteTunnelIp() != null) {
      contentJson.addProperty("remote_tunnel_ip", createTransitGatewayConnectionOptions.remoteTunnelIp());
    }
    if (createTransitGatewayConnectionOptions.tunnels() != null) {
      contentJson.add("tunnels", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTransitGatewayConnectionOptions.tunnels()));
    }
    if (createTransitGatewayConnectionOptions.zone() != null) {
      contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTransitGatewayConnectionOptions.zone()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TransitGatewayConnectionCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayConnectionCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Removes a connection from Transit Gateway.
   *
   * After the specified connection is detached, entities still within the Transit Gateway will no longer be able to
   * communicate directly to it through the IBM Cloud private backbone.
   *
   * @param deleteTransitGatewayConnectionOptions the {@link DeleteTransitGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTransitGatewayConnection(DeleteTransitGatewayConnectionOptions deleteTransitGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTransitGatewayConnectionOptions,
      "deleteTransitGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", deleteTransitGatewayConnectionOptions.transitGatewayId());
    pathParamsMap.put("id", deleteTransitGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "deleteTransitGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves specified Transit Gateway connection.
   *
   * This request retrieves a connection from the Transit Gateway.
   *
   * @param getTransitGatewayConnectionOptions the {@link GetTransitGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayConnectionCust}
   */
  public ServiceCall<TransitGatewayConnectionCust> getTransitGatewayConnection(GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTransitGatewayConnectionOptions,
      "getTransitGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", getTransitGatewayConnectionOptions.transitGatewayId());
    pathParamsMap.put("id", getTransitGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getTransitGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TransitGatewayConnectionCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayConnectionCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates specified Transit Gateway connection.
   *
   * Update the name of a connection to a Transit Gateway.
   *
   * @param updateTransitGatewayConnectionOptions the {@link UpdateTransitGatewayConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayConnectionCust}
   */
  public ServiceCall<TransitGatewayConnectionCust> updateTransitGatewayConnection(UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTransitGatewayConnectionOptions,
      "updateTransitGatewayConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", updateTransitGatewayConnectionOptions.transitGatewayId());
    pathParamsMap.put("id", updateTransitGatewayConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "updateTransitGatewayConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (updateTransitGatewayConnectionOptions.name() != null) {
      contentJson.addProperty("name", updateTransitGatewayConnectionOptions.name());
    }
    if (updateTransitGatewayConnectionOptions.prefixFiltersDefault() != null) {
      contentJson.addProperty("prefix_filters_default", updateTransitGatewayConnectionOptions.prefixFiltersDefault());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TransitGatewayConnectionCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayConnectionCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Performs actions on a connection for a Transit Gateway.
   *
   * Allow a network owner to approve or reject a cross-account connection request.
   *
   * @param createTransitGatewayConnectionActionsOptions the {@link CreateTransitGatewayConnectionActionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createTransitGatewayConnectionActions(CreateTransitGatewayConnectionActionsOptions createTransitGatewayConnectionActionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayConnectionActionsOptions,
      "createTransitGatewayConnectionActionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", createTransitGatewayConnectionActionsOptions.transitGatewayId());
    pathParamsMap.put("id", createTransitGatewayConnectionActionsOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGatewayConnectionActions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", createTransitGatewayConnectionActionsOptions.action());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves specified Transit Gateway redundant gre connection tunnels.
   *
   * This request retrieves a list of all the tunnels for the redundant gre connection.
   *
   * @param listTransitGatewayGreTunnelOptions the {@link ListTransitGatewayGreTunnelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayTunnelCollection}
   */
  public ServiceCall<TransitGatewayTunnelCollection> listTransitGatewayGreTunnel(ListTransitGatewayGreTunnelOptions listTransitGatewayGreTunnelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTransitGatewayGreTunnelOptions,
      "listTransitGatewayGreTunnelOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", listTransitGatewayGreTunnelOptions.transitGatewayId());
    pathParamsMap.put("id", listTransitGatewayGreTunnelOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/tunnels", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listTransitGatewayGreTunnel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TransitGatewayTunnelCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayTunnelCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Creates a Transit Gateway redundant GRE tunnel.
   *
   * Add a tunnel to an existing Redundant GRE connection.
   *
   * @param createTransitGatewayGreTunnelOptions the {@link CreateTransitGatewayGreTunnelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayTunnel}
   */
  public ServiceCall<TransitGatewayTunnel> createTransitGatewayGreTunnel(CreateTransitGatewayGreTunnelOptions createTransitGatewayGreTunnelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayGreTunnelOptions,
      "createTransitGatewayGreTunnelOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", createTransitGatewayGreTunnelOptions.transitGatewayId());
    pathParamsMap.put("id", createTransitGatewayGreTunnelOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/tunnels", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGatewayGreTunnel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("local_gateway_ip", createTransitGatewayGreTunnelOptions.localGatewayIp());
    contentJson.addProperty("local_tunnel_ip", createTransitGatewayGreTunnelOptions.localTunnelIp());
    contentJson.addProperty("name", createTransitGatewayGreTunnelOptions.name());
    contentJson.addProperty("remote_gateway_ip", createTransitGatewayGreTunnelOptions.remoteGatewayIp());
    contentJson.addProperty("remote_tunnel_ip", createTransitGatewayGreTunnelOptions.remoteTunnelIp());
    contentJson.add("zone", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createTransitGatewayGreTunnelOptions.zone()));
    if (createTransitGatewayGreTunnelOptions.remoteBgpAsn() != null) {
      contentJson.addProperty("remote_bgp_asn", createTransitGatewayGreTunnelOptions.remoteBgpAsn());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TransitGatewayTunnel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayTunnel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deletes a specified Transit Gateway redundant GRE tunnel.
   *
   * Remove a tunnel from a redundant GRE connection.
   *
   * @param deleteTransitGatewayConnectionTunnelsOptions the {@link DeleteTransitGatewayConnectionTunnelsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTransitGatewayConnectionTunnels(DeleteTransitGatewayConnectionTunnelsOptions deleteTransitGatewayConnectionTunnelsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTransitGatewayConnectionTunnelsOptions,
      "deleteTransitGatewayConnectionTunnelsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", deleteTransitGatewayConnectionTunnelsOptions.transitGatewayId());
    pathParamsMap.put("id", deleteTransitGatewayConnectionTunnelsOptions.id());
    pathParamsMap.put("gre_tunnel_id", deleteTransitGatewayConnectionTunnelsOptions.greTunnelId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/tunnels/{gre_tunnel_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "deleteTransitGatewayConnectionTunnels");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves specified Transit Gateway connection tunnel.
   *
   * This request retrieves a connection tunnel from the Transit Gateway connection.
   *
   * @param getTransitGatewayConnectionTunnelsOptions the {@link GetTransitGatewayConnectionTunnelsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayTunnel}
   */
  public ServiceCall<TransitGatewayTunnel> getTransitGatewayConnectionTunnels(GetTransitGatewayConnectionTunnelsOptions getTransitGatewayConnectionTunnelsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTransitGatewayConnectionTunnelsOptions,
      "getTransitGatewayConnectionTunnelsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", getTransitGatewayConnectionTunnelsOptions.transitGatewayId());
    pathParamsMap.put("id", getTransitGatewayConnectionTunnelsOptions.id());
    pathParamsMap.put("gre_tunnel_id", getTransitGatewayConnectionTunnelsOptions.greTunnelId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/tunnels/{gre_tunnel_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getTransitGatewayConnectionTunnels");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TransitGatewayTunnel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayTunnel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates specified Transit Gateway redundant GRE tunnel.
   *
   * Update the name of a connection tunnel.
   *
   * @param updateTransitGatewayConnectionTunnelsOptions the {@link UpdateTransitGatewayConnectionTunnelsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TransitGatewayTunnel}
   */
  public ServiceCall<TransitGatewayTunnel> updateTransitGatewayConnectionTunnels(UpdateTransitGatewayConnectionTunnelsOptions updateTransitGatewayConnectionTunnelsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTransitGatewayConnectionTunnelsOptions,
      "updateTransitGatewayConnectionTunnelsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", updateTransitGatewayConnectionTunnelsOptions.transitGatewayId());
    pathParamsMap.put("id", updateTransitGatewayConnectionTunnelsOptions.id());
    pathParamsMap.put("gre_tunnel_id", updateTransitGatewayConnectionTunnelsOptions.greTunnelId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/tunnels/{gre_tunnel_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "updateTransitGatewayConnectionTunnels");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateTransitGatewayConnectionTunnelsOptions.transitGatewayTunnelPatch()), "application/merge-patch+json");
    ResponseConverter<TransitGatewayTunnel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TransitGatewayTunnel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Lists all locations that support Transit Gateways.
   *
   * List all locations that support Transit Gateways.
   *
   * @param listGatewayLocationsOptions the {@link ListGatewayLocationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TSCollection}
   */
  public ServiceCall<TSCollection> listGatewayLocations(ListGatewayLocationsOptions listGatewayLocationsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/locations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listGatewayLocations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TSCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TSCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Lists all locations that support Transit Gateways.
   *
   * List all locations that support Transit Gateways.
   *
   * @return a {@link ServiceCall} with a result of type {@link TSCollection}
   */
  public ServiceCall<TSCollection> listGatewayLocations() {
    return listGatewayLocations(null);
  }

  /**
   * Shows the details of a given Transit Gateway location.
   *
   * Get the details of a Transit Gateway Location.
   *
   * @param getGatewayLocationOptions the {@link GetGatewayLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TSLocation}
   */
  public ServiceCall<TSLocation> getGatewayLocation(GetGatewayLocationOptions getGatewayLocationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayLocationOptions,
      "getGatewayLocationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("name", getGatewayLocationOptions.name());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/locations/{name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getGatewayLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<TSLocation> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TSLocation>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves all prefix filters in a Transit Gateway connection.
   *
   * This request retrieves all prefix filters in a Transit Gateway connection.
   *
   * @param listTransitGatewayConnectionPrefixFiltersOptions the {@link ListTransitGatewayConnectionPrefixFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefixFilterCollection}
   */
  public ServiceCall<PrefixFilterCollection> listTransitGatewayConnectionPrefixFilters(ListTransitGatewayConnectionPrefixFiltersOptions listTransitGatewayConnectionPrefixFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTransitGatewayConnectionPrefixFiltersOptions,
      "listTransitGatewayConnectionPrefixFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", listTransitGatewayConnectionPrefixFiltersOptions.transitGatewayId());
    pathParamsMap.put("id", listTransitGatewayConnectionPrefixFiltersOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listTransitGatewayConnectionPrefixFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<PrefixFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefixFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add a prefix filter to a Transit Gateway connection.
   *
   * Add a prefix filter to a Transit Gateway connection.
   *
   * @param createTransitGatewayConnectionPrefixFilterOptions the {@link CreateTransitGatewayConnectionPrefixFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefixFilterCust}
   */
  public ServiceCall<PrefixFilterCust> createTransitGatewayConnectionPrefixFilter(CreateTransitGatewayConnectionPrefixFilterOptions createTransitGatewayConnectionPrefixFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayConnectionPrefixFilterOptions,
      "createTransitGatewayConnectionPrefixFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", createTransitGatewayConnectionPrefixFilterOptions.transitGatewayId());
    pathParamsMap.put("id", createTransitGatewayConnectionPrefixFilterOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGatewayConnectionPrefixFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", createTransitGatewayConnectionPrefixFilterOptions.action());
    contentJson.addProperty("prefix", createTransitGatewayConnectionPrefixFilterOptions.prefix());
    if (createTransitGatewayConnectionPrefixFilterOptions.before() != null) {
      contentJson.addProperty("before", createTransitGatewayConnectionPrefixFilterOptions.before());
    }
    if (createTransitGatewayConnectionPrefixFilterOptions.ge() != null) {
      contentJson.addProperty("ge", createTransitGatewayConnectionPrefixFilterOptions.ge());
    }
    if (createTransitGatewayConnectionPrefixFilterOptions.le() != null) {
      contentJson.addProperty("le", createTransitGatewayConnectionPrefixFilterOptions.le());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrefixFilterCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefixFilterCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replaces the prefix filters of the Transit Gateway connection.
   *
   * Replaces the prefix filters of the Transit Gateway connection.
   *
   * @param replaceTransitGatewayConnectionPrefixFilterOptions the {@link ReplaceTransitGatewayConnectionPrefixFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefixFilterCollection}
   */
  public ServiceCall<PrefixFilterCollection> replaceTransitGatewayConnectionPrefixFilter(ReplaceTransitGatewayConnectionPrefixFilterOptions replaceTransitGatewayConnectionPrefixFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTransitGatewayConnectionPrefixFilterOptions,
      "replaceTransitGatewayConnectionPrefixFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", replaceTransitGatewayConnectionPrefixFilterOptions.transitGatewayId());
    pathParamsMap.put("id", replaceTransitGatewayConnectionPrefixFilterOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "replaceTransitGatewayConnectionPrefixFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("prefix_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceTransitGatewayConnectionPrefixFilterOptions.prefixFilters()));
    builder.bodyJson(contentJson);
    ResponseConverter<PrefixFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefixFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove prefix filter from Transit Gateway connection.
   *
   * Delete a prefix filter.
   *
   * @param deleteTransitGatewayConnectionPrefixFilterOptions the {@link DeleteTransitGatewayConnectionPrefixFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTransitGatewayConnectionPrefixFilter(DeleteTransitGatewayConnectionPrefixFilterOptions deleteTransitGatewayConnectionPrefixFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTransitGatewayConnectionPrefixFilterOptions,
      "deleteTransitGatewayConnectionPrefixFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", deleteTransitGatewayConnectionPrefixFilterOptions.transitGatewayId());
    pathParamsMap.put("id", deleteTransitGatewayConnectionPrefixFilterOptions.id());
    pathParamsMap.put("filter_id", deleteTransitGatewayConnectionPrefixFilterOptions.filterId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters/{filter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "deleteTransitGatewayConnectionPrefixFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves specified Transit Gateway connection prefix filter.
   *
   * This request retrieves a prefix filter from the Transit Gateway connection.
   *
   * @param getTransitGatewayConnectionPrefixFilterOptions the {@link GetTransitGatewayConnectionPrefixFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefixFilterCust}
   */
  public ServiceCall<PrefixFilterCust> getTransitGatewayConnectionPrefixFilter(GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTransitGatewayConnectionPrefixFilterOptions,
      "getTransitGatewayConnectionPrefixFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", getTransitGatewayConnectionPrefixFilterOptions.transitGatewayId());
    pathParamsMap.put("id", getTransitGatewayConnectionPrefixFilterOptions.id());
    pathParamsMap.put("filter_id", getTransitGatewayConnectionPrefixFilterOptions.filterId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters/{filter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getTransitGatewayConnectionPrefixFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<PrefixFilterCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefixFilterCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates specified Transit Gateway connection prefix filter.
   *
   * Update prefix filter for a Transit Gateway Connection.
   *
   * @param updateTransitGatewayConnectionPrefixFilterOptions the {@link UpdateTransitGatewayConnectionPrefixFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrefixFilterCust}
   */
  public ServiceCall<PrefixFilterCust> updateTransitGatewayConnectionPrefixFilter(UpdateTransitGatewayConnectionPrefixFilterOptions updateTransitGatewayConnectionPrefixFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTransitGatewayConnectionPrefixFilterOptions,
      "updateTransitGatewayConnectionPrefixFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", updateTransitGatewayConnectionPrefixFilterOptions.transitGatewayId());
    pathParamsMap.put("id", updateTransitGatewayConnectionPrefixFilterOptions.id());
    pathParamsMap.put("filter_id", updateTransitGatewayConnectionPrefixFilterOptions.filterId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/connections/{id}/prefix_filters/{filter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "updateTransitGatewayConnectionPrefixFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (updateTransitGatewayConnectionPrefixFilterOptions.action() != null) {
      contentJson.addProperty("action", updateTransitGatewayConnectionPrefixFilterOptions.action());
    }
    if (updateTransitGatewayConnectionPrefixFilterOptions.before() != null) {
      contentJson.addProperty("before", updateTransitGatewayConnectionPrefixFilterOptions.before());
    }
    if (updateTransitGatewayConnectionPrefixFilterOptions.ge() != null) {
      contentJson.addProperty("ge", updateTransitGatewayConnectionPrefixFilterOptions.ge());
    }
    if (updateTransitGatewayConnectionPrefixFilterOptions.le() != null) {
      contentJson.addProperty("le", updateTransitGatewayConnectionPrefixFilterOptions.le());
    }
    if (updateTransitGatewayConnectionPrefixFilterOptions.prefix() != null) {
      contentJson.addProperty("prefix", updateTransitGatewayConnectionPrefixFilterOptions.prefix());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PrefixFilterCust> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrefixFilterCust>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Lists route reports.
   *
   * Retrieve all route reports for the specified Transit Gateway.  There will normally be at most one completed report
   * and one pending report.  Additionally, completed route reports are written to IBM Cloud Activity Tracker.
   *
   * @param listTransitGatewayRouteReportsOptions the {@link ListTransitGatewayRouteReportsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReportCollection}
   */
  public ServiceCall<RouteReportCollection> listTransitGatewayRouteReports(ListTransitGatewayRouteReportsOptions listTransitGatewayRouteReportsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTransitGatewayRouteReportsOptions,
      "listTransitGatewayRouteReportsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", listTransitGatewayRouteReportsOptions.transitGatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/route_reports", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "listTransitGatewayRouteReports");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<RouteReportCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteReportCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Requests a route report.
   *
   * Request route report generation.  While report generation is in progress, additional requests to generate a report
   * are ignored and return the current pending report.
   *
   * @param createTransitGatewayRouteReportOptions the {@link CreateTransitGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReport}
   */
  public ServiceCall<RouteReport> createTransitGatewayRouteReport(CreateTransitGatewayRouteReportOptions createTransitGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTransitGatewayRouteReportOptions,
      "createTransitGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", createTransitGatewayRouteReportOptions.transitGatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/route_reports", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "createTransitGatewayRouteReport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<RouteReport> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteReport>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deletes a route report.
   *
   * Delete a route report.
   *
   * @param deleteTransitGatewayRouteReportOptions the {@link DeleteTransitGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTransitGatewayRouteReport(DeleteTransitGatewayRouteReportOptions deleteTransitGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTransitGatewayRouteReportOptions,
      "deleteTransitGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", deleteTransitGatewayRouteReportOptions.transitGatewayId());
    pathParamsMap.put("id", deleteTransitGatewayRouteReportOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/route_reports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "deleteTransitGatewayRouteReport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves a route report.
   *
   * Retrieve a route report.
   *
   * @param getTransitGatewayRouteReportOptions the {@link GetTransitGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReport}
   */
  public ServiceCall<RouteReport> getTransitGatewayRouteReport(GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTransitGatewayRouteReportOptions,
      "getTransitGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("transit_gateway_id", getTransitGatewayRouteReportOptions.transitGatewayId());
    pathParamsMap.put("id", getTransitGatewayRouteReportOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/transit_gateways/{transit_gateway_id}/route_reports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("transit_gateway_apis", "v1", "getTransitGatewayRouteReport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<RouteReport> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteReport>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
