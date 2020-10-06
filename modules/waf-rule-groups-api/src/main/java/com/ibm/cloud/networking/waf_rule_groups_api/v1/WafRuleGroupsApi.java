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

package com.ibm.cloud.networking.waf_rule_groups_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.GetWafRuleGroupOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.ListWafRuleGroupsOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.UpdateWafRuleGroupOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupResponse;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupsResponse;
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
 * This document describes CIS WAF Rule Groups API.
 *
 * @version v1
 */
public class WafRuleGroupsApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "waf_rule_groups_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `WafRuleGroupsApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId Zone ID.
   * @return an instance of the `WafRuleGroupsApi` client using external configuration
   */
  public static WafRuleGroupsApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WafRuleGroupsApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId Zone ID.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WafRuleGroupsApi` client using external configuration
   */
  public static WafRuleGroupsApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WafRuleGroupsApi service = new WafRuleGroupsApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WafRuleGroupsApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneId Zone ID.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WafRuleGroupsApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
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
   * List all WAF rule groups.
   *
   * List all WAF rule groups contained within a package.
   *
   * @param listWafRuleGroupsOptions the {@link ListWafRuleGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafGroupsResponse}
   */
  public ServiceCall<WafGroupsResponse> listWafRuleGroups(ListWafRuleGroupsOptions listWafRuleGroupsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWafRuleGroupsOptions,
      "listWafRuleGroupsOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "groups" };
    String[] pathParameters = { this.crn, this.zoneId, listWafRuleGroupsOptions.pkgId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_groups_api", "v1", "listWafRuleGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWafRuleGroupsOptions.name() != null) {
      builder.query("name", String.valueOf(listWafRuleGroupsOptions.name()));
    }
    if (listWafRuleGroupsOptions.mode() != null) {
      builder.query("mode", String.valueOf(listWafRuleGroupsOptions.mode()));
    }
    if (listWafRuleGroupsOptions.rulesCount() != null) {
      builder.query("rules_count", String.valueOf(listWafRuleGroupsOptions.rulesCount()));
    }
    if (listWafRuleGroupsOptions.page() != null) {
      builder.query("page", String.valueOf(listWafRuleGroupsOptions.page()));
    }
    if (listWafRuleGroupsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listWafRuleGroupsOptions.perPage()));
    }
    if (listWafRuleGroupsOptions.order() != null) {
      builder.query("order", String.valueOf(listWafRuleGroupsOptions.order()));
    }
    if (listWafRuleGroupsOptions.direction() != null) {
      builder.query("direction", String.valueOf(listWafRuleGroupsOptions.direction()));
    }
    if (listWafRuleGroupsOptions.match() != null) {
      builder.query("match", String.valueOf(listWafRuleGroupsOptions.match()));
    }
    ResponseConverter<WafGroupsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafGroupsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get WAF rule group.
   *
   * Get a single WAF rule group.
   *
   * @param getWafRuleGroupOptions the {@link GetWafRuleGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafGroupResponse}
   */
  public ServiceCall<WafGroupResponse> getWafRuleGroup(GetWafRuleGroupOptions getWafRuleGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWafRuleGroupOptions,
      "getWafRuleGroupOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "groups" };
    String[] pathParameters = { this.crn, this.zoneId, getWafRuleGroupOptions.pkgId(), getWafRuleGroupOptions.groupId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_groups_api", "v1", "getWafRuleGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WafGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update WAF rule group.
   *
   * Update the state of a WAF rule group.
   *
   * @param updateWafRuleGroupOptions the {@link UpdateWafRuleGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WafGroupResponse}
   */
  public ServiceCall<WafGroupResponse> updateWafRuleGroup(UpdateWafRuleGroupOptions updateWafRuleGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWafRuleGroupOptions,
      "updateWafRuleGroupOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/waf/packages", "groups" };
    String[] pathParameters = { this.crn, this.zoneId, updateWafRuleGroupOptions.pkgId(), updateWafRuleGroupOptions.groupId() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("waf_rule_groups_api", "v1", "updateWafRuleGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateWafRuleGroupOptions.mode() != null) {
      contentJson.addProperty("mode", updateWafRuleGroupOptions.mode());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WafGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WafGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
