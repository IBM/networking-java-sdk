/*
 * (C) Copyright IBM Corp. 2021.
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
 * IBM OpenAPI SDK Code Generator Version: 3.29.1-b338fb38-20210313-010605
 */

package com.ibm.cloud.networking.filters.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.filters.v1.model.CreateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterResp;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.FilterResp;
import com.ibm.cloud.networking.filters.v1.model.FiltersResp;
import com.ibm.cloud.networking.filters.v1.model.GetFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.ListAllFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.UpdateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.UpdateFiltersOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Filters.
 *
 * @version v1
 */
public class Filters extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "filters";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

 /**
   * Class method which constructs an instance of the `Filters` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Filters` client using external configuration
   */
  public static Filters newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Filters` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Filters` client using external configuration
   */
  public static Filters newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Filters service = new Filters(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Filters` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Filters(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List all filters for a zone.
   *
   * List all filters for a zone.
   *
   * @param listAllFiltersOptions the {@link ListAllFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListFiltersResp}
   */
  public ServiceCall<ListFiltersResp> listAllFilters(ListAllFiltersOptions listAllFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAllFiltersOptions,
      "listAllFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", listAllFiltersOptions.crn());
    pathParamsMap.put("zone_identifier", listAllFiltersOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "listAllFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", listAllFiltersOptions.xAuthUserToken());
    ResponseConverter<ListFiltersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListFiltersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create filters for a zone.
   *
   * Create new filters for a given zone under a service instance.
   *
   * @param createFilterOptions the {@link CreateFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FiltersResp}
   */
  public ServiceCall<FiltersResp> createFilter(CreateFilterOptions createFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createFilterOptions,
      "createFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", createFilterOptions.crn());
    pathParamsMap.put("zone_identifier", createFilterOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "createFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", createFilterOptions.xAuthUserToken());
    if (createFilterOptions.filterInput() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createFilterOptions.filterInput()), "application/json");
    }
    ResponseConverter<FiltersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FiltersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update filters.
   *
   * Update existing filters for a given zone under a given service instance.
   *
   * @param updateFiltersOptions the {@link UpdateFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FiltersResp}
   */
  public ServiceCall<FiltersResp> updateFilters(UpdateFiltersOptions updateFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFiltersOptions,
      "updateFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", updateFiltersOptions.crn());
    pathParamsMap.put("zone_identifier", updateFiltersOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "updateFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", updateFiltersOptions.xAuthUserToken());
    if (updateFiltersOptions.filterUpdateInput() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateFiltersOptions.filterUpdateInput()), "application/json");
    }
    ResponseConverter<FiltersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FiltersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete filters.
   *
   * Delete filters by filter ids.
   *
   * @param deleteFiltersOptions the {@link DeleteFiltersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteFiltersResp}
   */
  public ServiceCall<DeleteFiltersResp> deleteFilters(DeleteFiltersOptions deleteFiltersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFiltersOptions,
      "deleteFiltersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", deleteFiltersOptions.crn());
    pathParamsMap.put("zone_identifier", deleteFiltersOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "deleteFilters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", deleteFiltersOptions.xAuthUserToken());
    builder.query("id", String.valueOf(deleteFiltersOptions.id()));
    ResponseConverter<DeleteFiltersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteFiltersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a filter.
   *
   * Delete a filter given its id.
   *
   * @param deleteFilterOptions the {@link DeleteFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteFilterResp}
   */
  public ServiceCall<DeleteFilterResp> deleteFilter(DeleteFilterOptions deleteFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFilterOptions,
      "deleteFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", deleteFilterOptions.crn());
    pathParamsMap.put("zone_identifier", deleteFilterOptions.zoneIdentifier());
    pathParamsMap.put("filter_identifier", deleteFilterOptions.filterIdentifier());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters/{filter_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "deleteFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", deleteFilterOptions.xAuthUserToken());
    ResponseConverter<DeleteFilterResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteFilterResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get filter details by id.
   *
   * Get the details of a filter for a given zone under a given service instance.
   *
   * @param getFilterOptions the {@link GetFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FilterResp}
   */
  public ServiceCall<FilterResp> getFilter(GetFilterOptions getFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFilterOptions,
      "getFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", getFilterOptions.crn());
    pathParamsMap.put("zone_identifier", getFilterOptions.zoneIdentifier());
    pathParamsMap.put("filter_identifier", getFilterOptions.filterIdentifier());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters/{filter_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "getFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", getFilterOptions.xAuthUserToken());
    ResponseConverter<FilterResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FilterResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a filter.
   *
   * Update an existing filter for a given zone under a given service instance.
   *
   * @param updateFilterOptions the {@link UpdateFilterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FilterResp}
   */
  public ServiceCall<FilterResp> updateFilter(UpdateFilterOptions updateFilterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFilterOptions,
      "updateFilterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", updateFilterOptions.crn());
    pathParamsMap.put("zone_identifier", updateFilterOptions.zoneIdentifier());
    pathParamsMap.put("filter_identifier", updateFilterOptions.filterIdentifier());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/filters/{filter_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("filters", "v1", "updateFilter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", updateFilterOptions.xAuthUserToken());
    final JsonObject contentJson = new JsonObject();
    if (updateFilterOptions.id() != null) {
      contentJson.addProperty("id", updateFilterOptions.id());
    }
    if (updateFilterOptions.expression() != null) {
      contentJson.addProperty("expression", updateFilterOptions.expression());
    }
    if (updateFilterOptions.description() != null) {
      contentJson.addProperty("description", updateFilterOptions.description());
    }
    if (updateFilterOptions.paused() != null) {
      contentJson.addProperty("paused", updateFilterOptions.paused());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<FilterResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FilterResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
