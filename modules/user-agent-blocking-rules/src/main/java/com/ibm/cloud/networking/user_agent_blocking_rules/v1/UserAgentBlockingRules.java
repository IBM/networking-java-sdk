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

package com.ibm.cloud.networking.user_agent_blocking_rules.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.CreateZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteUseragentRuleResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.GetUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListAllZoneUserAgentRulesOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListUseragentRulesResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UpdateUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleResp;
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
 * User-Agent Blocking Rules.
 *
 * @version v1
 */
public class UserAgentBlockingRules extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "user_agent_blocking_rules";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `UserAgentBlockingRules` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which user-agent rule is created.
   * @return an instance of the `UserAgentBlockingRules` client using external configuration
   */
  public static UserAgentBlockingRules newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `UserAgentBlockingRules` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which user-agent rule is created.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `UserAgentBlockingRules` client using external configuration
   */
  public static UserAgentBlockingRules newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    UserAgentBlockingRules service = new UserAgentBlockingRules(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `UserAgentBlockingRules` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which user-agent rule is created.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public UserAgentBlockingRules(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * Zone identifier of the zone for which user-agent rule is created.
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
   * List all user-agent blocking rules.
   *
   * List all user agent blocking rules.
   *
   * @param listAllZoneUserAgentRulesOptions the {@link ListAllZoneUserAgentRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListUseragentRulesResp}
   */
  public ServiceCall<ListUseragentRulesResp> listAllZoneUserAgentRules(ListAllZoneUserAgentRulesOptions listAllZoneUserAgentRulesOptions) {
    if (listAllZoneUserAgentRulesOptions == null) {
      listAllZoneUserAgentRulesOptions = new ListAllZoneUserAgentRulesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "firewall/ua_rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("user_agent_blocking_rules", "v1", "listAllZoneUserAgentRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllZoneUserAgentRulesOptions.page() != null) {
      builder.query("page", String.valueOf(listAllZoneUserAgentRulesOptions.page()));
    }
    if (listAllZoneUserAgentRulesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllZoneUserAgentRulesOptions.perPage()));
    }
    ResponseConverter<ListUseragentRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListUseragentRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all user-agent blocking rules.
   *
   * List all user agent blocking rules.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListUseragentRulesResp}
   */
  public ServiceCall<ListUseragentRulesResp> listAllZoneUserAgentRules() {
    return listAllZoneUserAgentRules(null);
  }

  /**
   * Create user-agent blocking rule.
   *
   * Create a new user-agent blocking rule for a given zone under a service instance.
   *
   * @param createZoneUserAgentRuleOptions the {@link CreateZoneUserAgentRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UseragentRuleResp}
   */
  public ServiceCall<UseragentRuleResp> createZoneUserAgentRule(CreateZoneUserAgentRuleOptions createZoneUserAgentRuleOptions) {
    boolean skipBody = false;
    if (createZoneUserAgentRuleOptions == null) {
      createZoneUserAgentRuleOptions = new CreateZoneUserAgentRuleOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "firewall/ua_rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("user_agent_blocking_rules", "v1", "createZoneUserAgentRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createZoneUserAgentRuleOptions.paused() != null) {
        contentJson.addProperty("paused", createZoneUserAgentRuleOptions.paused());
      }
      if (createZoneUserAgentRuleOptions.description() != null) {
        contentJson.addProperty("description", createZoneUserAgentRuleOptions.description());
      }
      if (createZoneUserAgentRuleOptions.mode() != null) {
        contentJson.addProperty("mode", createZoneUserAgentRuleOptions.mode());
      }
      if (createZoneUserAgentRuleOptions.configuration() != null) {
        contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneUserAgentRuleOptions.configuration()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<UseragentRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UseragentRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create user-agent blocking rule.
   *
   * Create a new user-agent blocking rule for a given zone under a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link UseragentRuleResp}
   */
  public ServiceCall<UseragentRuleResp> createZoneUserAgentRule() {
    return createZoneUserAgentRule(null);
  }

  /**
   * Delete user-agent blocking rule.
   *
   * Delete a user-agent blocking rule for a particular zone, given its id.
   *
   * @param deleteZoneUserAgentRuleOptions the {@link DeleteZoneUserAgentRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteUseragentRuleResp}
   */
  public ServiceCall<DeleteUseragentRuleResp> deleteZoneUserAgentRule(DeleteZoneUserAgentRuleOptions deleteZoneUserAgentRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneUserAgentRuleOptions,
      "deleteZoneUserAgentRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/ua_rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteZoneUserAgentRuleOptions.useragentRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("user_agent_blocking_rules", "v1", "deleteZoneUserAgentRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteUseragentRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteUseragentRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get user-agent blocking rule.
   *
   * For a given service instance, zone id and user-agent rule id, get the user-agent blocking rule details.
   *
   * @param getUserAgentRuleOptions the {@link GetUserAgentRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UseragentRuleResp}
   */
  public ServiceCall<UseragentRuleResp> getUserAgentRule(GetUserAgentRuleOptions getUserAgentRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getUserAgentRuleOptions,
      "getUserAgentRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/ua_rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getUserAgentRuleOptions.useragentRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("user_agent_blocking_rules", "v1", "getUserAgentRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<UseragentRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UseragentRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update user-agent blocking rule.
   *
   * Update an existing user-agent blocking rule for a given zone under a given service instance.
   *
   * @param updateUserAgentRuleOptions the {@link UpdateUserAgentRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UseragentRuleResp}
   */
  public ServiceCall<UseragentRuleResp> updateUserAgentRule(UpdateUserAgentRuleOptions updateUserAgentRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateUserAgentRuleOptions,
      "updateUserAgentRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/ua_rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateUserAgentRuleOptions.useragentRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("user_agent_blocking_rules", "v1", "updateUserAgentRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateUserAgentRuleOptions.paused() != null) {
      contentJson.addProperty("paused", updateUserAgentRuleOptions.paused());
    }
    if (updateUserAgentRuleOptions.description() != null) {
      contentJson.addProperty("description", updateUserAgentRuleOptions.description());
    }
    if (updateUserAgentRuleOptions.mode() != null) {
      contentJson.addProperty("mode", updateUserAgentRuleOptions.mode());
    }
    if (updateUserAgentRuleOptions.configuration() != null) {
      contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateUserAgentRuleOptions.configuration()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<UseragentRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UseragentRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
