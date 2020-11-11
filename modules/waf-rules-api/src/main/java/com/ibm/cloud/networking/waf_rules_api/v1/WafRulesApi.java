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

package com.ibm.cloud.networking.waf_rules_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.waf_rules_api.v1.model.GetWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.ListWafRulesOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.UpdateWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponse;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponse;
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
 * This document describes CIS WAF Rules API.
 *
 * @version v1
 */
public class WafRulesApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "waf_rules_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `WafRulesApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @return an instance of the `WafRulesApi` client using external configuration
   */
  public static WafRulesApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WafRulesApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WafRulesApi` client using external configuration
   */
  public static WafRulesApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WafRulesApi service = new WafRulesApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WafRulesApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WafRulesApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
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
   * List all WAF rules.
   *
   * List all Web Application Firewall (WAF) rules.
   *
   * @param listWafRulesOptions the {@link ListWafRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafRulesResponse}
   */
  public ServiceCall<WafRulesResponse> listWafRules(ListWafRulesOptions listWafRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWafRulesOptions,
      "listWafRulesOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "rules" };
    String[] pathParameters = { this.crn, this.zoneId, listWafRulesOptions.packageId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rules_api", "v1", "listWafRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWafRulesOptions.mode() != null) {
      builder.query("mode", String.valueOf(listWafRulesOptions.mode()));
    }
    if (listWafRulesOptions.priority() != null) {
      builder.query("priority", String.valueOf(listWafRulesOptions.priority()));
    }
    if (listWafRulesOptions.match() != null) {
      builder.query("match", String.valueOf(listWafRulesOptions.match()));
    }
    if (listWafRulesOptions.order() != null) {
      builder.query("order", String.valueOf(listWafRulesOptions.order()));
    }
    if (listWafRulesOptions.groupId() != null) {
      builder.query("group_id", String.valueOf(listWafRulesOptions.groupId()));
    }
    if (listWafRulesOptions.description() != null) {
      builder.query("description", String.valueOf(listWafRulesOptions.description()));
    }
    if (listWafRulesOptions.direction() != null) {
      builder.query("direction", String.valueOf(listWafRulesOptions.direction()));
    }
    if (listWafRulesOptions.page() != null) {
      builder.query("page", String.valueOf(listWafRulesOptions.page()));
    }
    if (listWafRulesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listWafRulesOptions.perPage()));
    }
    ResponseConverter<WafRulesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafRulesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get WAF rule.
   *
   * Get individual information about a rule.
   *
   * @param getWafRuleOptions the {@link GetWafRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafRuleResponse}
   */
  public ServiceCall<WafRuleResponse> getWafRule(GetWafRuleOptions getWafRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWafRuleOptions,
      "getWafRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "rules" };
    String[] pathParameters = { this.crn, this.zoneId, getWafRuleOptions.packageId(), getWafRuleOptions.identifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rules_api", "v1", "getWafRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WafRuleResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafRuleResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update WAF rule.
   *
   * Update the action the rule will perform if triggered on the zone.
   *
   * @param updateWafRuleOptions the {@link UpdateWafRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafRuleResponse}
   */
  public ServiceCall<WafRuleResponse> updateWafRule(UpdateWafRuleOptions updateWafRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWafRuleOptions,
      "updateWafRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "rules" };
    String[] pathParameters = { this.crn, this.zoneId, updateWafRuleOptions.packageId(), updateWafRuleOptions.identifier() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rules_api", "v1", "updateWafRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateWafRuleOptions.cis() != null) {
      contentJson.add("cis", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWafRuleOptions.cis()));
    }
    if (updateWafRuleOptions.owasp() != null) {
      contentJson.add("owasp", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWafRuleOptions.owasp()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WafRuleResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafRuleResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
