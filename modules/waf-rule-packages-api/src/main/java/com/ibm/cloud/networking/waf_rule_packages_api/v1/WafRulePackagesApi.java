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

package com.ibm.cloud.networking.waf_rule_packages_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.GetWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.ListWafPackagesOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.UpdateWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponse;
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
 * This document describes CIS WAF Rule Packages API.
 *
 * @version v1
 */
public class WafRulePackagesApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "waf_rule_packages_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `WafRulePackagesApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @param zoneId Zone ID.
   * @return an instance of the `WafRulePackagesApi` client using external configuration
   */
  public static WafRulePackagesApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WafRulePackagesApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @param zoneId Zone ID.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WafRulePackagesApi` client using external configuration
   */
  public static WafRulePackagesApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WafRulePackagesApi service = new WafRulePackagesApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WafRulePackagesApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @param zoneId Zone ID.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WafRulePackagesApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneId(zoneId);
  }

  /**
   * Gets the crn.
   *
   * Cloud resource name.
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
   * Zone ID.
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
   * List all WAF rule packages.
   *
   * Get firewall packages for a zone.
   *
   * @param listWafPackagesOptions the {@link ListWafPackagesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafPackagesResponse}
   */
  public ServiceCall<WafPackagesResponse> listWafPackages(ListWafPackagesOptions listWafPackagesOptions) {
    if (listWafPackagesOptions == null) {
      listWafPackagesOptions = new ListWafPackagesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_packages_api", "v1", "listWafPackages");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWafPackagesOptions.name() != null) {
      builder.query("name", String.valueOf(listWafPackagesOptions.name()));
    }
    if (listWafPackagesOptions.page() != null) {
      builder.query("page", String.valueOf(listWafPackagesOptions.page()));
    }
    if (listWafPackagesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listWafPackagesOptions.perPage()));
    }
    if (listWafPackagesOptions.order() != null) {
      builder.query("order", String.valueOf(listWafPackagesOptions.order()));
    }
    if (listWafPackagesOptions.direction() != null) {
      builder.query("direction", String.valueOf(listWafPackagesOptions.direction()));
    }
    if (listWafPackagesOptions.match() != null) {
      builder.query("match", String.valueOf(listWafPackagesOptions.match()));
    }
    ResponseConverter<WafPackagesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafPackagesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all WAF rule packages.
   *
   * Get firewall packages for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link WafPackagesResponse}
   */
  public ServiceCall<WafPackagesResponse> listWafPackages() {
    return listWafPackages(null);
  }

  /**
   * Get WAF rule package.
   *
   * Get information about a single firewall package.
   *
   * @param getWafPackageOptions the {@link GetWafPackageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafPackageResponse}
   */
  public ServiceCall<WafPackageResponse> getWafPackage(GetWafPackageOptions getWafPackageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWafPackageOptions,
      "getWafPackageOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages" };
    String[] pathParameters = { this.crn, this.zoneId, getWafPackageOptions.packageId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_packages_api", "v1", "getWafPackage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WafPackageResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafPackageResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change WAF rule package package.
   *
   * Change the sensitivity and action for an anomaly detection type WAF rule package.
   *
   * @param updateWafPackageOptions the {@link UpdateWafPackageOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafPackageResponse}
   */
  public ServiceCall<WafPackageResponse> updateWafPackage(UpdateWafPackageOptions updateWafPackageOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWafPackageOptions,
      "updateWafPackageOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages" };
    String[] pathParameters = { this.crn, this.zoneId, updateWafPackageOptions.packageId() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_packages_api", "v1", "updateWafPackage");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateWafPackageOptions.sensitivity() != null) {
      contentJson.addProperty("sensitivity", updateWafPackageOptions.sensitivity());
    }
    if (updateWafPackageOptions.actionMode() != null) {
      contentJson.addProperty("action_mode", updateWafPackageOptions.actionMode());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WafPackageResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafPackageResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
