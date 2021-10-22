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
 * IBM OpenAPI SDK Code Generator Version: 3.40.0-910cf8c2-20211006-154754
 */

package com.ibm.cloud.networking.firewall_rules.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.firewall_rules.v1.model.CreateFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.GetFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListAllFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewllRulesOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Firewall rules.
 *
 * API Version: 1.0.1
 */
public class FirewallRules extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "firewall_rules";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

 /**
   * Class method which constructs an instance of the `FirewallRules` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `FirewallRules` client using external configuration
   */
  public static FirewallRules newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `FirewallRules` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `FirewallRules` client using external configuration
   */
  public static FirewallRules newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    FirewallRules service = new FirewallRules(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `FirewallRules` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public FirewallRules(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List all firewall rules for a zone.
   *
   * List all firewall rules for a zone.
   *
   * @param listAllFirewallRulesOptions the {@link ListAllFirewallRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListFirewallRulesResp}
   */
  public ServiceCall<ListFirewallRulesResp> listAllFirewallRules(ListAllFirewallRulesOptions listAllFirewallRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAllFirewallRulesOptions,
      "listAllFirewallRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", listAllFirewallRulesOptions.crn());
    pathParamsMap.put("zone_identifier", listAllFirewallRulesOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "listAllFirewallRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", listAllFirewallRulesOptions.xAuthUserToken());
    ResponseConverter<ListFirewallRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListFirewallRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create firewall rules for a zone.
   *
   * Create new firewall rules for a given zone under a service instance.
   *
   * @param createFirewallRulesOptions the {@link CreateFirewallRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FirewallRulesResp}
   */
  public ServiceCall<FirewallRulesResp> createFirewallRules(CreateFirewallRulesOptions createFirewallRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createFirewallRulesOptions,
      "createFirewallRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", createFirewallRulesOptions.crn());
    pathParamsMap.put("zone_identifier", createFirewallRulesOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "createFirewallRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", createFirewallRulesOptions.xAuthUserToken());
    if (createFirewallRulesOptions.firewallRuleInputWithFilterId() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createFirewallRulesOptions.firewallRuleInputWithFilterId()), "application/json");
    }
    ResponseConverter<FirewallRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FirewallRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update firewall rules.
   *
   * Update existing firewall rules for a given zone under a given service instance.
   *
   * @param updateFirewllRulesOptions the {@link UpdateFirewllRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FirewallRulesResp}
   */
  public ServiceCall<FirewallRulesResp> updateFirewllRules(UpdateFirewllRulesOptions updateFirewllRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFirewllRulesOptions,
      "updateFirewllRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", updateFirewllRulesOptions.crn());
    pathParamsMap.put("zone_identifier", updateFirewllRulesOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "updateFirewllRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", updateFirewllRulesOptions.xAuthUserToken());
    if (updateFirewllRulesOptions.firewallRulesUpdateInputItem() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateFirewllRulesOptions.firewallRulesUpdateInputItem()), "application/json");
    }
    ResponseConverter<FirewallRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FirewallRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete firewall rules.
   *
   * Delete firewall rules by filter ids.
   *
   * @param deleteFirewallRulesOptions the {@link DeleteFirewallRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteFirewallRulesResp}
   */
  public ServiceCall<DeleteFirewallRulesResp> deleteFirewallRules(DeleteFirewallRulesOptions deleteFirewallRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFirewallRulesOptions,
      "deleteFirewallRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", deleteFirewallRulesOptions.crn());
    pathParamsMap.put("zone_identifier", deleteFirewallRulesOptions.zoneIdentifier());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "deleteFirewallRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", deleteFirewallRulesOptions.xAuthUserToken());
    builder.query("id", String.valueOf(deleteFirewallRulesOptions.id()));
    ResponseConverter<DeleteFirewallRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteFirewallRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a firewall rule.
   *
   * Delete a firewall rule given its id.
   *
   * @param deleteFirewallRuleOptions the {@link DeleteFirewallRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteFirewallRuleResp}
   */
  public ServiceCall<DeleteFirewallRuleResp> deleteFirewallRule(DeleteFirewallRuleOptions deleteFirewallRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFirewallRuleOptions,
      "deleteFirewallRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", deleteFirewallRuleOptions.crn());
    pathParamsMap.put("zone_identifier", deleteFirewallRuleOptions.zoneIdentifier());
    pathParamsMap.put("firewall_rule_identifier", deleteFirewallRuleOptions.firewallRuleIdentifier());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules/{firewall_rule_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "deleteFirewallRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", deleteFirewallRuleOptions.xAuthUserToken());
    ResponseConverter<DeleteFirewallRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteFirewallRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get firewall rule details by id.
   *
   * Get the details of a firewall rule for a given zone under a given service instance.
   *
   * @param getFirewallRuleOptions the {@link GetFirewallRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FirewallRuleResp}
   */
  public ServiceCall<FirewallRuleResp> getFirewallRule(GetFirewallRuleOptions getFirewallRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFirewallRuleOptions,
      "getFirewallRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", getFirewallRuleOptions.crn());
    pathParamsMap.put("zone_identifier", getFirewallRuleOptions.zoneIdentifier());
    pathParamsMap.put("firewall_rule_identifier", getFirewallRuleOptions.firewallRuleIdentifier());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules/{firewall_rule_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "getFirewallRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", getFirewallRuleOptions.xAuthUserToken());
    ResponseConverter<FirewallRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FirewallRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a firewall rule.
   *
   * Update an existing firewall rule for a given zone under a given service instance.
   *
   * @param updateFirewallRuleOptions the {@link UpdateFirewallRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link FirewallRuleResp}
   */
  public ServiceCall<FirewallRuleResp> updateFirewallRule(UpdateFirewallRuleOptions updateFirewallRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFirewallRuleOptions,
      "updateFirewallRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", updateFirewallRuleOptions.crn());
    pathParamsMap.put("zone_identifier", updateFirewallRuleOptions.zoneIdentifier());
    pathParamsMap.put("firewall_rule_identifier", updateFirewallRuleOptions.firewallRuleIdentifier());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/firewall/rules/{firewall_rule_identifier}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_rules", "v1", "updateFirewallRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("X-Auth-User-Token", updateFirewallRuleOptions.xAuthUserToken());
    final JsonObject contentJson = new JsonObject();
    if (updateFirewallRuleOptions.action() != null) {
      contentJson.addProperty("action", updateFirewallRuleOptions.action());
    }
    if (updateFirewallRuleOptions.paused() != null) {
      contentJson.addProperty("paused", updateFirewallRuleOptions.paused());
    }
    if (updateFirewallRuleOptions.description() != null) {
      contentJson.addProperty("description", updateFirewallRuleOptions.description());
    }
    if (updateFirewallRuleOptions.filter() != null) {
      contentJson.add("filter", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateFirewallRuleOptions.filter()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<FirewallRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<FirewallRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
