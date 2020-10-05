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

package com.ibm.cloud.networking.waf_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.waf_api.v1.model.GetWafSettingsOptions;
import com.ibm.cloud.networking.waf_api.v1.model.UpdateWafSettingsOptions;
import com.ibm.cloud.networking.waf_api.v1.model.WafResponse;
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
 * This document describes CIS WAF API.
 *
 * @version v1
 */
public class WafApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "waf_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `WafApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @return an instance of the `WafApi` client using external configuration
   */
  public static WafApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WafApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WafApi` client using external configuration
   */
  public static WafApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WafApi service = new WafApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WafApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WafApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
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
   * Get WAF setting.
   *
   * Get WAF of a specific zone.
   *
   * @param getWafSettingsOptions the {@link GetWafSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafResponse}
   */
  public ServiceCall<WafResponse> getWafSettings(GetWafSettingsOptions getWafSettingsOptions) {
    String[] pathSegments = { "v1", "zones", "settings/waf" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_api", "v1", "getWafSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WafResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get WAF setting.
   *
   * Get WAF of a specific zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WafResponse}
   */
  public ServiceCall<WafResponse> getWafSettings() {
    return getWafSettings(null);
  }

  /**
   * Set WAF setting.
   *
   * Set WAF (on | off) for a specific zone.
   *
   * @param updateWafSettingsOptions the {@link UpdateWafSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafResponse}
   */
  public ServiceCall<WafResponse> updateWafSettings(UpdateWafSettingsOptions updateWafSettingsOptions) {
    boolean skipBody = false;
    if (updateWafSettingsOptions == null) {
      updateWafSettingsOptions = new UpdateWafSettingsOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/waf" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_api", "v1", "updateWafSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateWafSettingsOptions.value() != null) {
        contentJson.addProperty("value", updateWafSettingsOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<WafResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set WAF setting.
   *
   * Set WAF (on | off) for a specific zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WafResponse}
   */
  public ServiceCall<WafResponse> updateWafSettings() {
    return updateWafSettings(null);
  }

}
