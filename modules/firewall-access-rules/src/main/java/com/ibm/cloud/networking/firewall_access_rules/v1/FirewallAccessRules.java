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

package com.ibm.cloud.networking.firewall_access_rules.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.CreateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.GetAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAccountAccessRulesResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAllAccountAccessRulesOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.UpdateAccountAccessRuleOptions;
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
 * Instance Level Firewall Access Rules.
 *
 * @version v1
 */
public class FirewallAccessRules extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "firewall_access_rules";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `FirewallAccessRules` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @return an instance of the `FirewallAccessRules` client using external configuration
   */
  public static FirewallAccessRules newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `FirewallAccessRules` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `FirewallAccessRules` client using external configuration
   */
  public static FirewallAccessRules newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    FirewallAccessRules service = new FirewallAccessRules(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `FirewallAccessRules` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public FirewallAccessRules(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
  }

  /**
   * Gets the crn.
   *
   * Full crn of the service instance.
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
   * List instance level firewall access rules.
   *
   * List all instance level firewall access rules.
   *
   * @param listAllAccountAccessRulesOptions the {@link ListAllAccountAccessRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAccountAccessRulesResp}
   */
  public ServiceCall<ListAccountAccessRulesResp> listAllAccountAccessRules(ListAllAccountAccessRulesOptions listAllAccountAccessRulesOptions) {
    if (listAllAccountAccessRulesOptions == null) {
      listAllAccountAccessRulesOptions = new ListAllAccountAccessRulesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_access_rules", "v1", "listAllAccountAccessRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllAccountAccessRulesOptions.notes() != null) {
      builder.query("notes", String.valueOf(listAllAccountAccessRulesOptions.notes()));
    }
    if (listAllAccountAccessRulesOptions.mode() != null) {
      builder.query("mode", String.valueOf(listAllAccountAccessRulesOptions.mode()));
    }
    if (listAllAccountAccessRulesOptions.configurationTarget() != null) {
      builder.query("configuration.target", String.valueOf(listAllAccountAccessRulesOptions.configurationTarget()));
    }
    if (listAllAccountAccessRulesOptions.configurationValue() != null) {
      builder.query("configuration.value", String.valueOf(listAllAccountAccessRulesOptions.configurationValue()));
    }
    if (listAllAccountAccessRulesOptions.page() != null) {
      builder.query("page", String.valueOf(listAllAccountAccessRulesOptions.page()));
    }
    if (listAllAccountAccessRulesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllAccountAccessRulesOptions.perPage()));
    }
    if (listAllAccountAccessRulesOptions.order() != null) {
      builder.query("order", String.valueOf(listAllAccountAccessRulesOptions.order()));
    }
    if (listAllAccountAccessRulesOptions.direction() != null) {
      builder.query("direction", String.valueOf(listAllAccountAccessRulesOptions.direction()));
    }
    if (listAllAccountAccessRulesOptions.match() != null) {
      builder.query("match", String.valueOf(listAllAccountAccessRulesOptions.match()));
    }
    ResponseConverter<ListAccountAccessRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAccountAccessRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List instance level firewall access rules.
   *
   * List all instance level firewall access rules.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListAccountAccessRulesResp}
   */
  public ServiceCall<ListAccountAccessRulesResp> listAllAccountAccessRules() {
    return listAllAccountAccessRules(null);
  }

  /**
   * Create instance level firewall access rule.
   *
   * Create a new instance level firewall access rule for a given service instance.
   *
   * @param createAccountAccessRuleOptions the {@link CreateAccountAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccountAccessRuleResp}
   */
  public ServiceCall<AccountAccessRuleResp> createAccountAccessRule(CreateAccountAccessRuleOptions createAccountAccessRuleOptions) {
    boolean skipBody = false;
    if (createAccountAccessRuleOptions == null) {
      createAccountAccessRuleOptions = new CreateAccountAccessRuleOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_access_rules", "v1", "createAccountAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createAccountAccessRuleOptions.mode() != null) {
        contentJson.addProperty("mode", createAccountAccessRuleOptions.mode());
      }
      if (createAccountAccessRuleOptions.notes() != null) {
        contentJson.addProperty("notes", createAccountAccessRuleOptions.notes());
      }
      if (createAccountAccessRuleOptions.configuration() != null) {
        contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAccountAccessRuleOptions.configuration()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AccountAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccountAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create instance level firewall access rule.
   *
   * Create a new instance level firewall access rule for a given service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link AccountAccessRuleResp}
   */
  public ServiceCall<AccountAccessRuleResp> createAccountAccessRule() {
    return createAccountAccessRule(null);
  }

  /**
   * Delete instance level access rule.
   *
   * Delete an instance level access rule given its id.
   *
   * @param deleteAccountAccessRuleOptions the {@link DeleteAccountAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAccountAccessRuleResp}
   */
  public ServiceCall<DeleteAccountAccessRuleResp> deleteAccountAccessRule(DeleteAccountAccessRuleOptions deleteAccountAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAccountAccessRuleOptions,
      "deleteAccountAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, deleteAccountAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_access_rules", "v1", "deleteAccountAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAccountAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAccountAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get instance level firewall access rule.
   *
   * Get the details of an instance level firewall access rule for a given  service instance.
   *
   * @param getAccountAccessRuleOptions the {@link GetAccountAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccountAccessRuleResp}
   */
  public ServiceCall<AccountAccessRuleResp> getAccountAccessRule(GetAccountAccessRuleOptions getAccountAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAccountAccessRuleOptions,
      "getAccountAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, getAccountAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_access_rules", "v1", "getAccountAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AccountAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccountAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update instance level firewall access rule.
   *
   * Update an existing instance level firewall access rule for a given service instance.
   *
   * @param updateAccountAccessRuleOptions the {@link UpdateAccountAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccountAccessRuleResp}
   */
  public ServiceCall<AccountAccessRuleResp> updateAccountAccessRule(UpdateAccountAccessRuleOptions updateAccountAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAccountAccessRuleOptions,
      "updateAccountAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, updateAccountAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_access_rules", "v1", "updateAccountAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAccountAccessRuleOptions.mode() != null) {
      contentJson.addProperty("mode", updateAccountAccessRuleOptions.mode());
    }
    if (updateAccountAccessRuleOptions.notes() != null) {
      contentJson.addProperty("notes", updateAccountAccessRuleOptions.notes());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccountAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccountAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
