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

package com.ibm.cloud.networking.custom_pages.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.custom_pages.v1.model.CustomPageSpecificResp;
import com.ibm.cloud.networking.custom_pages.v1.model.GetInstanceCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.GetZoneCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.ListCustomPagesResp;
import com.ibm.cloud.networking.custom_pages.v1.model.ListInstanceCustomPagesOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.ListZoneCustomPagesOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.UpdateInstanceCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.UpdateZoneCustomPageOptions;
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
 * Custom Pages.
 *
 * @version v1
 */
public class CustomPages extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "custom_pages";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `CustomPages` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @return an instance of the `CustomPages` client using external configuration
   */
  public static CustomPages newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `CustomPages` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `CustomPages` client using external configuration
   */
  public static CustomPages newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    CustomPages service = new CustomPages(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `CustomPages` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public CustomPages(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * List all custom pages for a given instance.
   *
   * List all custom pages for a given instance.
   *
   * @param listInstanceCustomPagesOptions the {@link ListInstanceCustomPagesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListCustomPagesResp}
   */
  public ServiceCall<ListCustomPagesResp> listInstanceCustomPages(ListInstanceCustomPagesOptions listInstanceCustomPagesOptions) {
    String[] pathSegments = { "v1", "custom_pages" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "listInstanceCustomPages");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListCustomPagesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListCustomPagesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all custom pages for a given instance.
   *
   * List all custom pages for a given instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListCustomPagesResp}
   */
  public ServiceCall<ListCustomPagesResp> listInstanceCustomPages() {
    return listInstanceCustomPages(null);
  }

  /**
   * Get a custom page for a given instance.
   *
   * Get a specific custom page for a given instance.
   *
   * @param getInstanceCustomPageOptions the {@link GetInstanceCustomPageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomPageSpecificResp}
   */
  public ServiceCall<CustomPageSpecificResp> getInstanceCustomPage(GetInstanceCustomPageOptions getInstanceCustomPageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceCustomPageOptions,
      "getInstanceCustomPageOptions cannot be null");
    String[] pathSegments = { "v1", "custom_pages" };
    String[] pathParameters = { this.crn, getInstanceCustomPageOptions.pageIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "getInstanceCustomPage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomPageSpecificResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomPageSpecificResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a custom page for a given instance.
   *
   * Update a specific custom page for a given instance.
   *
   * @param updateInstanceCustomPageOptions the {@link UpdateInstanceCustomPageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomPageSpecificResp}
   */
  public ServiceCall<CustomPageSpecificResp> updateInstanceCustomPage(UpdateInstanceCustomPageOptions updateInstanceCustomPageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceCustomPageOptions,
      "updateInstanceCustomPageOptions cannot be null");
    String[] pathSegments = { "v1", "custom_pages" };
    String[] pathParameters = { this.crn, updateInstanceCustomPageOptions.pageIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "updateInstanceCustomPage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateInstanceCustomPageOptions.url() != null) {
      contentJson.addProperty("url", updateInstanceCustomPageOptions.url());
    }
    if (updateInstanceCustomPageOptions.state() != null) {
      contentJson.addProperty("state", updateInstanceCustomPageOptions.state());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomPageSpecificResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomPageSpecificResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all custom pages for a given zone.
   *
   * List all custom pages for a given zone.
   *
   * @param listZoneCustomPagesOptions the {@link ListZoneCustomPagesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListCustomPagesResp}
   */
  public ServiceCall<ListCustomPagesResp> listZoneCustomPages(ListZoneCustomPagesOptions listZoneCustomPagesOptions) {
    String[] pathSegments = { "v1", "zones", "custom_pages" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "listZoneCustomPages");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListCustomPagesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListCustomPagesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all custom pages for a given zone.
   *
   * List all custom pages for a given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListCustomPagesResp}
   */
  public ServiceCall<ListCustomPagesResp> listZoneCustomPages() {
    return listZoneCustomPages(null);
  }

  /**
   * Get a custom page for a given zone.
   *
   * Get a specific custom page for a given zone.
   *
   * @param getZoneCustomPageOptions the {@link GetZoneCustomPageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomPageSpecificResp}
   */
  public ServiceCall<CustomPageSpecificResp> getZoneCustomPage(GetZoneCustomPageOptions getZoneCustomPageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneCustomPageOptions,
      "getZoneCustomPageOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "custom_pages" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getZoneCustomPageOptions.pageIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "getZoneCustomPage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomPageSpecificResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomPageSpecificResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a custom page for a given zone.
   *
   * Update a specific custom page for a given zone.
   *
   * @param updateZoneCustomPageOptions the {@link UpdateZoneCustomPageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomPageSpecificResp}
   */
  public ServiceCall<CustomPageSpecificResp> updateZoneCustomPage(UpdateZoneCustomPageOptions updateZoneCustomPageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneCustomPageOptions,
      "updateZoneCustomPageOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "custom_pages" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateZoneCustomPageOptions.pageIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("custom_pages", "v1", "updateZoneCustomPage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneCustomPageOptions.url() != null) {
      contentJson.addProperty("url", updateZoneCustomPageOptions.url());
    }
    if (updateZoneCustomPageOptions.state() != null) {
      contentJson.addProperty("state", updateZoneCustomPageOptions.state());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomPageSpecificResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomPageSpecificResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
