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
 * IBM OpenAPI SDK Code Generator Version: 3.99.1-daeb6e46-20250131-173156
 */

package com.ibm.cloud.networking.direct_link.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependCollection;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayCompletionNoticeOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.DeleteGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ExportRouteFilterCollection;
import com.ibm.cloud.networking.direct_link.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsec;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatisticCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnection;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayVirtualConnectionCollection;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponse;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayRouteReportOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatisticsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatusOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GetPortOptions;
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
import com.ibm.cloud.networking.direct_link.v1.model.OfferingSpeedCollection;
import com.ibm.cloud.networking.direct_link.v1.model.Port;
import com.ibm.cloud.networking.direct_link.v1.model.PortCollection;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayImportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.model.RouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReport;
import com.ibm.cloud.networking.direct_link.v1.model.RouteReportCollection;
import com.ibm.cloud.networking.direct_link.v1.model.SetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UnsetGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayImportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecCakOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayMacsecOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayVirtualConnectionOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator).
 *
 * API Version: __VERSION__
 */
public class DirectLink extends BaseService {

  /**
   * Default service name used when configuring the `DirectLink` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "direct_link";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://directlink.cloud.ibm.com/v1";

  private String version;

 /**
   * Class method which constructs an instance of the `DirectLink` client.
   * The default service name is used to configure the client instance.
   *
   * @param version Requests the version of the API as a date in the format `YYYY-MM-DD`. Any date from 2019-12-13 up to
 * the current date may be provided. Specify the current date to request the latest version.
   * @return an instance of the `DirectLink` client using external configuration
   */
  public static DirectLink newInstance(String version) {
    return newInstance(version, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `DirectLink` client.
   * The specified service name is used to configure the client instance.
   *
   * @param version Requests the version of the API as a date in the format `YYYY-MM-DD`. Any date from 2019-12-13 up to
 * the current date may be provided. Specify the current date to request the latest version.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `DirectLink` client using external configuration
   */
  public static DirectLink newInstance(String version, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    DirectLink service = new DirectLink(version, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `DirectLink` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param version Requests the version of the API as a date in the format `YYYY-MM-DD`. Any date from 2019-12-13 up to
 * the current date may be provided. Specify the current date to request the latest version.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public DirectLink(String version, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setVersion(version);
  }

  /**
   * Gets the version.
   *
   * Requests the version of the API as a date in the format `YYYY-MM-DD`. Any date from 2019-12-13 up to the current
   * date may be provided. Specify the current date to request the latest version.
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
   * List gateways.
   *
   * List all Direct Link gateways in this account.  Gateways in other accounts with connections to networks in this
   * account are also returned.
   *
   * @param listGatewaysOptions the {@link ListGatewaysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayCollection}
   */
  public ServiceCall<GatewayCollection> listGateways(ListGatewaysOptions listGatewaysOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGateways");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List gateways.
   *
   * List all Direct Link gateways in this account.  Gateways in other accounts with connections to networks in this
   * account are also returned.
   *
   * @return a {@link ServiceCall} with a result of type {@link GatewayCollection}
   */
  public ServiceCall<GatewayCollection> listGateways() {
    return listGateways(null);
  }

  /**
   * Create gateway.
   *
   * Creates a Direct Link gateway based on the supplied template.
   *
   * @param createGatewayOptions the {@link CreateGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Gateway}
   */
  public ServiceCall<Gateway> createGateway(CreateGatewayOptions createGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayOptions,
      "createGatewayOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createGatewayOptions.gatewayTemplate()), "application/json");
    ResponseConverter<Gateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Gateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete gateway.
   *
   * Delete a Direct Link gateway.
   *
   * @param deleteGatewayOptions the {@link DeleteGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGateway(DeleteGatewayOptions deleteGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayOptions,
      "deleteGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get gateway.
   *
   * Retrieve a Direct Link gateway.
   *
   * @param getGatewayOptions the {@link GetGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetGatewayResponse}
   */
  public ServiceCall<GetGatewayResponse> getGateway(GetGatewayOptions getGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayOptions,
      "getGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GetGatewayResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetGatewayResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update gateway.
   *
   * Update a Direct Link gateway.
   *
   * @param updateGatewayOptions the {@link UpdateGatewayOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Gateway}
   */
  public ServiceCall<Gateway> updateGateway(UpdateGatewayOptions updateGatewayOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayOptions,
      "updateGatewayOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateGatewayOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGateway");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayOptions.gatewayPatchTemplatePatch()), "application/merge-patch+json");
    ResponseConverter<Gateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Gateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Approve or reject change requests.
   *
   * Approve or reject a gateway's current oustanding change request.
   *
   * This API is only used for provider created Direct Link Connect gateways to approve or reject specific changes
   * initiated from a provider portal.
   *
   * @param createGatewayActionOptions the {@link CreateGatewayActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Gateway}
   */
  public ServiceCall<Gateway> createGatewayAction(CreateGatewayActionOptions createGatewayActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayActionOptions,
      "createGatewayActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createGatewayActionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (createGatewayActionOptions.action() != null) {
      contentJson.addProperty("action", createGatewayActionOptions.action());
    }
    if (createGatewayActionOptions.asPrepends() != null) {
      contentJson.add("as_prepends", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.asPrepends()));
    }
    if (createGatewayActionOptions.authenticationKey() != null) {
      contentJson.add("authentication_key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.authenticationKey()));
    }
    if (createGatewayActionOptions.bfdConfig() != null) {
      contentJson.add("bfd_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.bfdConfig()));
    }
    if (createGatewayActionOptions.connectionMode() != null) {
      contentJson.addProperty("connection_mode", createGatewayActionOptions.connectionMode());
    }
    if (createGatewayActionOptions.defaultExportRouteFilter() != null) {
      contentJson.addProperty("default_export_route_filter", createGatewayActionOptions.defaultExportRouteFilter());
    }
    if (createGatewayActionOptions.defaultImportRouteFilter() != null) {
      contentJson.addProperty("default_import_route_filter", createGatewayActionOptions.defaultImportRouteFilter());
    }
    if (createGatewayActionOptions.exportRouteFilters() != null) {
      contentJson.add("export_route_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.exportRouteFilters()));
    }
    if (createGatewayActionOptions.global() != null) {
      contentJson.addProperty("global", createGatewayActionOptions.global());
    }
    if (createGatewayActionOptions.importRouteFilters() != null) {
      contentJson.add("import_route_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.importRouteFilters()));
    }
    if (createGatewayActionOptions.metered() != null) {
      contentJson.addProperty("metered", createGatewayActionOptions.metered());
    }
    if (createGatewayActionOptions.resourceGroup() != null) {
      contentJson.add("resource_group", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.resourceGroup()));
    }
    if (createGatewayActionOptions.updates() != null) {
      contentJson.add("updates", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayActionOptions.updates()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Gateway> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Gateway>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get completion notice.
   *
   * Retrieve a Direct Link Dedicated gateway's completion notice.
   *
   * @param listGatewayCompletionNoticeOptions the {@link ListGatewayCompletionNoticeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> listGatewayCompletionNotice(ListGatewayCompletionNoticeOptions listGatewayCompletionNoticeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayCompletionNoticeOptions,
      "listGatewayCompletionNoticeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listGatewayCompletionNoticeOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/completion_notice", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayCompletionNotice");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/pdf");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create completion notice.
   *
   * Upload a Direct Link Dedicated gateway completion notice.
   *
   * @param createGatewayCompletionNoticeOptions the {@link CreateGatewayCompletionNoticeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createGatewayCompletionNotice(CreateGatewayCompletionNoticeOptions createGatewayCompletionNoticeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayCompletionNoticeOptions,
      "createGatewayCompletionNoticeOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((createGatewayCompletionNoticeOptions.upload() != null),
      "At least one of  or upload must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createGatewayCompletionNoticeOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/completion_notice", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayCompletionNotice");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (createGatewayCompletionNoticeOptions.upload() != null) {
      okhttp3.RequestBody uploadBody = RequestUtils.inputStreamBody(createGatewayCompletionNoticeOptions.upload(), createGatewayCompletionNoticeOptions.uploadContentType());
      multipartBuilder.addFormDataPart("upload", "filename", uploadBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get letter of authorization.
   *
   * Retrieve a Direct Link Dedicated gateway's Letter of Authorization.
   *
   * @param listGatewayLetterOfAuthorizationOptions the {@link ListGatewayLetterOfAuthorizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> listGatewayLetterOfAuthorization(ListGatewayLetterOfAuthorizationOptions listGatewayLetterOfAuthorizationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayLetterOfAuthorizationOptions,
      "listGatewayLetterOfAuthorizationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listGatewayLetterOfAuthorizationOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/letter_of_authorization", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayLetterOfAuthorization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/pdf");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Gateway statistics/debug information.
   *
   * Retrieve gateway statistics or debug information.  Specify statistic to retrieve using required `type` query
   * parameter.
   *
   * @param getGatewayStatisticsOptions the {@link GetGatewayStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayStatisticCollection}
   */
  public ServiceCall<GatewayStatisticCollection> getGatewayStatistics(GetGatewayStatisticsOptions getGatewayStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayStatisticsOptions,
      "getGatewayStatisticsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getGatewayStatisticsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/statistics", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("type", String.valueOf(getGatewayStatisticsOptions.type()));
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayStatisticCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayStatisticCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Gateway status information.
   *
   * Retrieve gateway status.  Specify status to retrieve using required `type` query parameter.
   *
   * @param getGatewayStatusOptions the {@link GetGatewayStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayStatusCollection}
   */
  public ServiceCall<GatewayStatusCollection> getGatewayStatus(GetGatewayStatusOptions getGatewayStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayStatusOptions,
      "getGatewayStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getGatewayStatusOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/status", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    if (getGatewayStatusOptions.type() != null) {
      builder.query("type", String.valueOf(getGatewayStatusOptions.type()));
    }
    ResponseConverter<GatewayStatusCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayStatusCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List AS Prepends.
   *
   * Retrieve all AS Prepends for the specified Direct Link gateway.
   *
   * @param listGatewayAsPrependsOptions the {@link ListGatewayAsPrependsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AsPrependCollection}
   */
  public ServiceCall<AsPrependCollection> listGatewayAsPrepends(ListGatewayAsPrependsOptions listGatewayAsPrependsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayAsPrependsOptions,
      "listGatewayAsPrependsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", listGatewayAsPrependsOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/as_prepends", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayAsPrepends");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<AsPrependCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AsPrependCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace existing AS Prepends.
   *
   * Replace the given set of AS prepends on the specified gateway.  Existing resources may be reused when the
   * individual AS Prepend item is unchanged.
   *
   * @param replaceGatewayAsPrependsOptions the {@link ReplaceGatewayAsPrependsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AsPrependCollection}
   */
  public ServiceCall<AsPrependCollection> replaceGatewayAsPrepends(ReplaceGatewayAsPrependsOptions replaceGatewayAsPrependsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceGatewayAsPrependsOptions,
      "replaceGatewayAsPrependsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", replaceGatewayAsPrependsOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/as_prepends", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "replaceGatewayAsPrepends");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceGatewayAsPrependsOptions.ifMatch());
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (replaceGatewayAsPrependsOptions.asPrepends() != null) {
      contentJson.add("as_prepends", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceGatewayAsPrependsOptions.asPrepends()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AsPrependCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AsPrependCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List export route filters.
   *
   * List all export route filters that influence the export routes advertised to the on premises network and learned
   * from attached virtual connections of the Direct Link gateway.
   *
   * The first export route filter an export route matches will determine whether the route is permitted or denied to be
   * advertised by the Direct Link gateway. Route filter order is determined by the filter's `before` field.
   *
   * If an export route does not match any of the export route filters, the route is subject to the
   * `default_export_route_filter` of the direct link.
   *
   * @param listGatewayExportRouteFiltersOptions the {@link ListGatewayExportRouteFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExportRouteFilterCollection}
   */
  public ServiceCall<ExportRouteFilterCollection> listGatewayExportRouteFilters(ListGatewayExportRouteFiltersOptions listGatewayExportRouteFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayExportRouteFiltersOptions,
      "listGatewayExportRouteFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", listGatewayExportRouteFiltersOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayExportRouteFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<ExportRouteFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExportRouteFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an export route filter.
   *
   * Create a new export route filter to be configured on the Direct Link gateway.
   *
   * This call can result in an implicit update to another route filter's `before` field.
   *
   * If the request's route filter template does not contain a `before` field, the created filter will be added to the
   * end of of the list. The filter previously at the end of the list will have it's `before` field set to the created
   * route filter.
   *
   * If the request's route filter template contains a `before` field, the created filter will be added directly before
   * that specified route filter. If the specified route filter has a preceding route filter, that filter's `before`
   * field is updated to the created route filter.
   *
   * @param createGatewayExportRouteFilterOptions the {@link CreateGatewayExportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> createGatewayExportRouteFilter(CreateGatewayExportRouteFilterOptions createGatewayExportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayExportRouteFilterOptions,
      "createGatewayExportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", createGatewayExportRouteFilterOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayExportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", createGatewayExportRouteFilterOptions.action());
    contentJson.addProperty("prefix", createGatewayExportRouteFilterOptions.prefix());
    if (createGatewayExportRouteFilterOptions.before() != null) {
      contentJson.addProperty("before", createGatewayExportRouteFilterOptions.before());
    }
    if (createGatewayExportRouteFilterOptions.ge() != null) {
      contentJson.addProperty("ge", createGatewayExportRouteFilterOptions.ge());
    }
    if (createGatewayExportRouteFilterOptions.le() != null) {
      contentJson.addProperty("le", createGatewayExportRouteFilterOptions.le());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace existing export route filters.
   *
   * Replace all existing export route filters configured on the Direct Link gateway.
   *
   * @param replaceGatewayExportRouteFiltersOptions the {@link ReplaceGatewayExportRouteFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExportRouteFilterCollection}
   */
  public ServiceCall<ExportRouteFilterCollection> replaceGatewayExportRouteFilters(ReplaceGatewayExportRouteFiltersOptions replaceGatewayExportRouteFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceGatewayExportRouteFiltersOptions,
      "replaceGatewayExportRouteFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", replaceGatewayExportRouteFiltersOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "replaceGatewayExportRouteFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceGatewayExportRouteFiltersOptions.ifMatch());
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (replaceGatewayExportRouteFiltersOptions.exportRouteFilters() != null) {
      contentJson.add("export_route_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceGatewayExportRouteFiltersOptions.exportRouteFilters()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExportRouteFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExportRouteFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove export route filter from Direct Link gateway.
   *
   * Delete an export route filter.
   *
   * Deleting an export route filter will implicitly update the preceding filter's `before` field to the filter that
   * follows the deleted filter. The preceding filter will result with an empty `before` field if there is no filter
   * following the deleted route filter.
   *
   * @param deleteGatewayExportRouteFilterOptions the {@link DeleteGatewayExportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGatewayExportRouteFilter(DeleteGatewayExportRouteFilterOptions deleteGatewayExportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayExportRouteFilterOptions,
      "deleteGatewayExportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", deleteGatewayExportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", deleteGatewayExportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGatewayExportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves the specified Direct Link gateway export route filter.
   *
   * Retrieve an export route filter from the Direct Link gateway.
   *
   * @param getGatewayExportRouteFilterOptions the {@link GetGatewayExportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> getGatewayExportRouteFilter(GetGatewayExportRouteFilterOptions getGatewayExportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayExportRouteFilterOptions,
      "getGatewayExportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", getGatewayExportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", getGatewayExportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayExportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates the specified Direct Link gateway export route filter.
   *
   * Update an export route filter from the Direct Link gateway.
   *
   * Updating a route filter's `before` field will result in implicit updates to other route filters' `before` fields.
   *
   * Considering the updated filter prior to the update, the preceding route filter's `before` field will be set to the
   * filter following the updating route filter, if present. Otherwise it is set to empty.
   *
   * Considering the updated filter after the update, if the new filter following the updated filter has an existing
   * filter preceding it, that preceding filter's `before` field will be set to the updated filter.
   *
   * @param updateGatewayExportRouteFilterOptions the {@link UpdateGatewayExportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> updateGatewayExportRouteFilter(UpdateGatewayExportRouteFilterOptions updateGatewayExportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayExportRouteFilterOptions,
      "updateGatewayExportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", updateGatewayExportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", updateGatewayExportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/export_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGatewayExportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayExportRouteFilterOptions.updateRouteFilterTemplatePatch()), "application/merge-patch+json");
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List import route filters.
   *
   * List all import route filters that influence the import routes learned from the on premises network.
   *
   * The first import route filter an import route matches will determine whether the route is permitted or denied to be
   * learned by the Direct Link gateway. Route filter order is determined by the filter's `before` field.
   *
   * If an import route does not match any of the import route filters, the route is subject to the
   * `default_import_route_filter` of the direct link.
   *
   * @param listGatewayImportRouteFiltersOptions the {@link ListGatewayImportRouteFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImportRouteFilterCollection}
   */
  public ServiceCall<ImportRouteFilterCollection> listGatewayImportRouteFilters(ListGatewayImportRouteFiltersOptions listGatewayImportRouteFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayImportRouteFiltersOptions,
      "listGatewayImportRouteFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", listGatewayImportRouteFiltersOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayImportRouteFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<ImportRouteFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImportRouteFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an import route filter.
   *
   * Create a new import route filter to be configured on the Direct Link gateway.
   *
   * This call can result in an implicit update to another route filter's `before` field.
   *
   * If the request's route filter template does not contain a `before` field, the created filter will be added to the
   * end of of the list. The filter previously at the end of the list will have it's `before` field set to the created
   * route filter.
   *
   * If the request's route filter template contains a `before` field, the created filter will be added directly before
   * that specified route filter. If the specified route filter has a preceding route filter, that filter's `before`
   * field is updated to the created route filter.
   *
   * @param createGatewayImportRouteFilterOptions the {@link CreateGatewayImportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> createGatewayImportRouteFilter(CreateGatewayImportRouteFilterOptions createGatewayImportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayImportRouteFilterOptions,
      "createGatewayImportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", createGatewayImportRouteFilterOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayImportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", createGatewayImportRouteFilterOptions.action());
    contentJson.addProperty("prefix", createGatewayImportRouteFilterOptions.prefix());
    if (createGatewayImportRouteFilterOptions.before() != null) {
      contentJson.addProperty("before", createGatewayImportRouteFilterOptions.before());
    }
    if (createGatewayImportRouteFilterOptions.ge() != null) {
      contentJson.addProperty("ge", createGatewayImportRouteFilterOptions.ge());
    }
    if (createGatewayImportRouteFilterOptions.le() != null) {
      contentJson.addProperty("le", createGatewayImportRouteFilterOptions.le());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace existing import route filters.
   *
   * Replace all existing import route filters configured on the Direct Link gateway.
   *
   * @param replaceGatewayImportRouteFiltersOptions the {@link ReplaceGatewayImportRouteFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImportRouteFilterCollection}
   */
  public ServiceCall<ImportRouteFilterCollection> replaceGatewayImportRouteFilters(ReplaceGatewayImportRouteFiltersOptions replaceGatewayImportRouteFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceGatewayImportRouteFiltersOptions,
      "replaceGatewayImportRouteFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", replaceGatewayImportRouteFiltersOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "replaceGatewayImportRouteFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("If-Match", replaceGatewayImportRouteFiltersOptions.ifMatch());
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    if (replaceGatewayImportRouteFiltersOptions.importRouteFilters() != null) {
      contentJson.add("import_route_filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceGatewayImportRouteFiltersOptions.importRouteFilters()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ImportRouteFilterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImportRouteFilterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove import route filter from Direct Link gateway.
   *
   * Delete an import route filter.
   *
   * Deleting an import route filter will implicitly update the preceding filter's `before` field to the filter that
   * follows the deleted filter. The preceding filter will result with an empty `before` field if there is no filter
   * following the deleted route filter.
   *
   * @param deleteGatewayImportRouteFilterOptions the {@link DeleteGatewayImportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGatewayImportRouteFilter(DeleteGatewayImportRouteFilterOptions deleteGatewayImportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayImportRouteFilterOptions,
      "deleteGatewayImportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", deleteGatewayImportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", deleteGatewayImportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGatewayImportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves the specified Direct Link gateway import route filter.
   *
   * Retrieve an import route filter from the Direct Link gateway.
   *
   * @param getGatewayImportRouteFilterOptions the {@link GetGatewayImportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> getGatewayImportRouteFilter(GetGatewayImportRouteFilterOptions getGatewayImportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayImportRouteFilterOptions,
      "getGatewayImportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", getGatewayImportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", getGatewayImportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayImportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates the specified Direct Link gateway import route filter.
   *
   * Update an import route filter from the Direct Link gateway.
   *
   * Updating a route filter's `before` field will result in implicit updates to other route filters' `before` fields.
   *
   * Considering the updated filter prior to the update, the preceding route filter's `before` field will be set to the
   * filter following the updating route filter, if present. Otherwise it is set to empty.
   *
   * Considering the updated filter after the update, if the new filter following the updated filter has an existing
   * filter preceding it, that preceding filter's `before` field will be set to the updated filter.
   *
   * @param updateGatewayImportRouteFilterOptions the {@link UpdateGatewayImportRouteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteFilter}
   */
  public ServiceCall<RouteFilter> updateGatewayImportRouteFilter(UpdateGatewayImportRouteFilterOptions updateGatewayImportRouteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayImportRouteFilterOptions,
      "updateGatewayImportRouteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", updateGatewayImportRouteFilterOptions.gatewayId());
    pathParamsMap.put("id", updateGatewayImportRouteFilterOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/import_route_filters/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGatewayImportRouteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayImportRouteFilterOptions.updateRouteFilterTemplatePatch()), "application/merge-patch+json");
    ResponseConverter<RouteFilter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RouteFilter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unset MACsec configuration.
   *
   * Removes the MACsec configuration from a direct link, disabling the features.
   *
   * @param unsetGatewayMacsecOptions the {@link UnsetGatewayMacsecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> unsetGatewayMacsec(UnsetGatewayMacsecOptions unsetGatewayMacsecOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(unsetGatewayMacsecOptions,
      "unsetGatewayMacsecOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", unsetGatewayMacsecOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "unsetGatewayMacsec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get MACsec configuration.
   *
   * Retrieve the MACsec configuration of a direct link.
   *
   * @param getGatewayMacsecOptions the {@link GetGatewayMacsecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsec}
   */
  public ServiceCall<GatewayMacsec> getGatewayMacsec(GetGatewayMacsecOptions getGatewayMacsecOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayMacsecOptions,
      "getGatewayMacsecOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getGatewayMacsecOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayMacsec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayMacsec> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsec>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update MACsec configuration.
   *
   * Updates the MACsec configuration on a direct link.
   *
   * @param updateGatewayMacsecOptions the {@link UpdateGatewayMacsecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsec}
   */
  public ServiceCall<GatewayMacsec> updateGatewayMacsec(UpdateGatewayMacsecOptions updateGatewayMacsecOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayMacsecOptions,
      "updateGatewayMacsecOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateGatewayMacsecOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGatewayMacsec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayMacsecOptions.gatewayMacsecPatch()), "application/merge-patch+json");
    ResponseConverter<GatewayMacsec> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsec>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set MACsec configuration.
   *
   * Sets the MACsec configuration on a direct link, enabling the feature.
   *
   * @param setGatewayMacsecOptions the {@link SetGatewayMacsecOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsec}
   */
  public ServiceCall<GatewayMacsec> setGatewayMacsec(SetGatewayMacsecOptions setGatewayMacsecOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(setGatewayMacsecOptions,
      "setGatewayMacsecOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", setGatewayMacsecOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "setGatewayMacsec");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (setGatewayMacsecOptions.ifMatch() != null) {
      builder.header("If-Match", setGatewayMacsecOptions.ifMatch());
    }
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("active", setGatewayMacsecOptions.active());
    contentJson.add("caks", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(setGatewayMacsecOptions.caks()));
    contentJson.add("sak_rekey", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(setGatewayMacsecOptions.sakRekey()));
    contentJson.addProperty("security_policy", setGatewayMacsecOptions.securityPolicy());
    if (setGatewayMacsecOptions.windowSize() != null) {
      contentJson.addProperty("window_size", setGatewayMacsecOptions.windowSize());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GatewayMacsec> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsec>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List MACsec CAKs.
   *
   * List the CAKs associated with the MACsec configuration of a direct link.
   *
   * @param listGatewayMacsecCaksOptions the {@link ListGatewayMacsecCaksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsecCakCollection}
   */
  public ServiceCall<GatewayMacsecCakCollection> listGatewayMacsecCaks(ListGatewayMacsecCaksOptions listGatewayMacsecCaksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayMacsecCaksOptions,
      "listGatewayMacsecCaksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listGatewayMacsecCaksOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec/caks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayMacsecCaks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayMacsecCakCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsecCakCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create MACsec CAK.
   *
   * Creates a CAK associated with the MACsec configuration of a direct link.
   *
   * @param createGatewayMacsecCakOptions the {@link CreateGatewayMacsecCakOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsecCak}
   */
  public ServiceCall<GatewayMacsecCak> createGatewayMacsecCak(CreateGatewayMacsecCakOptions createGatewayMacsecCakOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayMacsecCakOptions,
      "createGatewayMacsecCakOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", createGatewayMacsecCakOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec/caks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayMacsecCak");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("key", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGatewayMacsecCakOptions.key()));
    contentJson.addProperty("name", createGatewayMacsecCakOptions.name());
    contentJson.addProperty("session", createGatewayMacsecCakOptions.session());
    builder.bodyJson(contentJson);
    ResponseConverter<GatewayMacsecCak> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsecCak>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete MACsec CAK.
   *
   * Deletes the CAK from the MACsec configuration of a direct link.
   *
   * @param deleteGatewayMacsecCakOptions the {@link DeleteGatewayMacsecCakOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGatewayMacsecCak(DeleteGatewayMacsecCakOptions deleteGatewayMacsecCakOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayMacsecCakOptions,
      "deleteGatewayMacsecCakOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteGatewayMacsecCakOptions.id());
    pathParamsMap.put("cak_id", deleteGatewayMacsecCakOptions.cakId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec/caks/{cak_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGatewayMacsecCak");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get MACsec CAK.
   *
   * Get a MACsec CAK by its identifier.
   *
   * @param getGatewayMacsecCakOptions the {@link GetGatewayMacsecCakOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsecCak}
   */
  public ServiceCall<GatewayMacsecCak> getGatewayMacsecCak(GetGatewayMacsecCakOptions getGatewayMacsecCakOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayMacsecCakOptions,
      "getGatewayMacsecCakOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getGatewayMacsecCakOptions.id());
    pathParamsMap.put("cak_id", getGatewayMacsecCakOptions.cakId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec/caks/{cak_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayMacsecCak");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayMacsecCak> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsecCak>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update MACsec CAK.
   *
   * Updates the CAK on the MACsec configuration of a direct link.
   *
   * @param updateGatewayMacsecCakOptions the {@link UpdateGatewayMacsecCakOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayMacsecCak}
   */
  public ServiceCall<GatewayMacsecCak> updateGatewayMacsecCak(UpdateGatewayMacsecCakOptions updateGatewayMacsecCakOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayMacsecCakOptions,
      "updateGatewayMacsecCakOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateGatewayMacsecCakOptions.id());
    pathParamsMap.put("cak_id", updateGatewayMacsecCakOptions.cakId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{id}/macsec/caks/{cak_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGatewayMacsecCak");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayMacsecCakOptions.gatewayMacsecCakPatch()), "application/merge-patch+json");
    ResponseConverter<GatewayMacsecCak> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayMacsecCak>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List route reports.
   *
   * Retrieve all route reports for the specified Direct Link gateway.
   *
   * @param listGatewayRouteReportsOptions the {@link ListGatewayRouteReportsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReportCollection}
   */
  public ServiceCall<RouteReportCollection> listGatewayRouteReports(ListGatewayRouteReportsOptions listGatewayRouteReportsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayRouteReportsOptions,
      "listGatewayRouteReportsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", listGatewayRouteReportsOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/route_reports", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayRouteReports");
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
   * Request a route report.
   *
   * Request route report generation.  While report generation is in progress, additional requests to generate a report
   * are ignored and return the current pending report. While `status` is `pending`, `gateway_routes`, `on_prem_routes`,
   * `virtual_connection_routes`, and `overlapping_routes` will be empty arrays. These fields will be filled when the
   * `status` enters the `complete` status.  Call `get_gateway_route_report` with the pending route report's `id` to
   * check on the current status of the report.
   *
   * @param createGatewayRouteReportOptions the {@link CreateGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReport}
   */
  public ServiceCall<RouteReport> createGatewayRouteReport(CreateGatewayRouteReportOptions createGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayRouteReportOptions,
      "createGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", createGatewayRouteReportOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/route_reports", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayRouteReport");
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
   * Delete route report.
   *
   * Delete a route report.
   *
   * @param deleteGatewayRouteReportOptions the {@link DeleteGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGatewayRouteReport(DeleteGatewayRouteReportOptions deleteGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayRouteReportOptions,
      "deleteGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", deleteGatewayRouteReportOptions.gatewayId());
    pathParamsMap.put("id", deleteGatewayRouteReportOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/route_reports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGatewayRouteReport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve route report.
   *
   * Retrieve a route report.
   *
   * @param getGatewayRouteReportOptions the {@link GetGatewayRouteReportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RouteReport}
   */
  public ServiceCall<RouteReport> getGatewayRouteReport(GetGatewayRouteReportOptions getGatewayRouteReportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayRouteReportOptions,
      "getGatewayRouteReportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", getGatewayRouteReportOptions.gatewayId());
    pathParamsMap.put("id", getGatewayRouteReportOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/route_reports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayRouteReport");
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
   * List virtual connections.
   *
   * List a gateway's virtual connections.   For gateway in other account with virtual connections that connect to
   * network in this account.  Only virtual connections that connect to this account are returned.
   *
   * @param listGatewayVirtualConnectionsOptions the {@link ListGatewayVirtualConnectionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayVirtualConnectionCollection}
   */
  public ServiceCall<GatewayVirtualConnectionCollection> listGatewayVirtualConnections(ListGatewayVirtualConnectionsOptions listGatewayVirtualConnectionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listGatewayVirtualConnectionsOptions,
      "listGatewayVirtualConnectionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", listGatewayVirtualConnectionsOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/virtual_connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listGatewayVirtualConnections");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayVirtualConnectionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayVirtualConnectionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create virtual connection.
   *
   * Create a virtual connection to the specified network.
   *
   * @param createGatewayVirtualConnectionOptions the {@link CreateGatewayVirtualConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayVirtualConnection}
   */
  public ServiceCall<GatewayVirtualConnection> createGatewayVirtualConnection(CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGatewayVirtualConnectionOptions,
      "createGatewayVirtualConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", createGatewayVirtualConnectionOptions.gatewayId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/virtual_connections", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "createGatewayVirtualConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createGatewayVirtualConnectionOptions.name());
    contentJson.addProperty("type", createGatewayVirtualConnectionOptions.type());
    if (createGatewayVirtualConnectionOptions.networkId() != null) {
      contentJson.addProperty("network_id", createGatewayVirtualConnectionOptions.networkId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GatewayVirtualConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayVirtualConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete virtual connection.
   *
   * Delete the virtual connection.
   *
   * @param deleteGatewayVirtualConnectionOptions the {@link DeleteGatewayVirtualConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteGatewayVirtualConnection(DeleteGatewayVirtualConnectionOptions deleteGatewayVirtualConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteGatewayVirtualConnectionOptions,
      "deleteGatewayVirtualConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", deleteGatewayVirtualConnectionOptions.gatewayId());
    pathParamsMap.put("id", deleteGatewayVirtualConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/virtual_connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "deleteGatewayVirtualConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get virtual connection.
   *
   * Retrieve a virtual connection.
   *
   * @param getGatewayVirtualConnectionOptions the {@link GetGatewayVirtualConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayVirtualConnection}
   */
  public ServiceCall<GatewayVirtualConnection> getGatewayVirtualConnection(GetGatewayVirtualConnectionOptions getGatewayVirtualConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGatewayVirtualConnectionOptions,
      "getGatewayVirtualConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", getGatewayVirtualConnectionOptions.gatewayId());
    pathParamsMap.put("id", getGatewayVirtualConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/virtual_connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getGatewayVirtualConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<GatewayVirtualConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayVirtualConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update virtual connection.
   *
   * Update a virtual connection.
   *
   * @param updateGatewayVirtualConnectionOptions the {@link UpdateGatewayVirtualConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GatewayVirtualConnection}
   */
  public ServiceCall<GatewayVirtualConnection> updateGatewayVirtualConnection(UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateGatewayVirtualConnectionOptions,
      "updateGatewayVirtualConnectionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("gateway_id", updateGatewayVirtualConnectionOptions.gatewayId());
    pathParamsMap.put("id", updateGatewayVirtualConnectionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/gateways/{gateway_id}/virtual_connections/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "updateGatewayVirtualConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateGatewayVirtualConnectionOptions.gatewayVirtualConnectionPatchTemplatePatch()), "application/merge-patch+json");
    ResponseConverter<GatewayVirtualConnection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GatewayVirtualConnection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List available locations.
   *
   * Retrieve the list of valid locations for the specified Direct Link offering.
   *
   * @param listOfferingTypeLocationsOptions the {@link ListOfferingTypeLocationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LocationCollection}
   */
  public ServiceCall<LocationCollection> listOfferingTypeLocations(ListOfferingTypeLocationsOptions listOfferingTypeLocationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listOfferingTypeLocationsOptions,
      "listOfferingTypeLocationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("offering_type", listOfferingTypeLocationsOptions.offeringType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/offering_types/{offering_type}/locations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listOfferingTypeLocations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<LocationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LocationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List routers.
   *
   * Retrieve location specific cross connect router information.  Only valid for offering_type=dedicated locations.
   *
   * @param listOfferingTypeLocationCrossConnectRoutersOptions the {@link ListOfferingTypeLocationCrossConnectRoutersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LocationCrossConnectRouterCollection}
   */
  public ServiceCall<LocationCrossConnectRouterCollection> listOfferingTypeLocationCrossConnectRouters(ListOfferingTypeLocationCrossConnectRoutersOptions listOfferingTypeLocationCrossConnectRoutersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listOfferingTypeLocationCrossConnectRoutersOptions,
      "listOfferingTypeLocationCrossConnectRoutersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("offering_type", listOfferingTypeLocationCrossConnectRoutersOptions.offeringType());
    pathParamsMap.put("location_name", listOfferingTypeLocationCrossConnectRoutersOptions.locationName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/offering_types/{offering_type}/locations/{location_name}/cross_connect_routers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listOfferingTypeLocationCrossConnectRouters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<LocationCrossConnectRouterCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LocationCrossConnectRouterCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List speed options.
   *
   * List the available Direct Link speeds.
   *
   * @param listOfferingTypeSpeedsOptions the {@link ListOfferingTypeSpeedsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OfferingSpeedCollection}
   */
  public ServiceCall<OfferingSpeedCollection> listOfferingTypeSpeeds(ListOfferingTypeSpeedsOptions listOfferingTypeSpeedsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listOfferingTypeSpeedsOptions,
      "listOfferingTypeSpeedsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("offering_type", listOfferingTypeSpeedsOptions.offeringType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/offering_types/{offering_type}/speeds", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listOfferingTypeSpeeds");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<OfferingSpeedCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OfferingSpeedCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List ports.
   *
   * Retrieve list of available Direct Link connect ports.  These ports can be used to create Direct Link connect
   * gateways.
   *
   * @param listPortsOptions the {@link ListPortsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PortCollection}
   */
  public ServiceCall<PortCollection> listPorts(ListPortsOptions listPortsOptions) {
    if (listPortsOptions == null) {
      listPortsOptions = new ListPortsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "listPorts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    if (listPortsOptions.start() != null) {
      builder.query("start", String.valueOf(listPortsOptions.start()));
    }
    if (listPortsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPortsOptions.limit()));
    }
    if (listPortsOptions.locationName() != null) {
      builder.query("location_name", String.valueOf(listPortsOptions.locationName()));
    }
    ResponseConverter<PortCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PortCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List ports.
   *
   * Retrieve list of available Direct Link connect ports.  These ports can be used to create Direct Link connect
   * gateways.
   *
   * @return a {@link ServiceCall} with a result of type {@link PortCollection}
   */
  public ServiceCall<PortCollection> listPorts() {
    return listPorts(null);
  }

  /**
   * Get port.
   *
   * Retrieve Direct Link Connect provider port.
   *
   * @param getPortOptions the {@link GetPortOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Port}
   */
  public ServiceCall<Port> getPort(GetPortOptions getPortOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPortOptions,
      "getPortOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getPortOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("direct_link", "v1", "getPort");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("version", String.valueOf(this.version));
    ResponseConverter<Port> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Port>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
