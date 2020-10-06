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

package com.ibm.cloud.networking.zone_firewall_access_rules.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.CreateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.GetZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListAllZoneAccessRulesOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListZoneAccessRulesResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.UpdateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleResp;
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
 * Zone Firewall Access Rules.
 *
 * @version v1
 */
public class ZoneFirewallAccessRules extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "zone_firewall_access_rules";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `ZoneFirewallAccessRules` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which acess rule is created.
   * @return an instance of the `ZoneFirewallAccessRules` client using external configuration
   */
  public static ZoneFirewallAccessRules newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `ZoneFirewallAccessRules` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which acess rule is created.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `ZoneFirewallAccessRules` client using external configuration
   */
  public static ZoneFirewallAccessRules newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    ZoneFirewallAccessRules service = new ZoneFirewallAccessRules(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `ZoneFirewallAccessRules` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier of the zone for which acess rule is created.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public ZoneFirewallAccessRules(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * Zone identifier of the zone for which acess rule is created.
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
   * List all firewall access rules.
   *
   * List all firewall access rules for a zone.
   *
   * @param listAllZoneAccessRulesOptions the {@link ListAllZoneAccessRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListZoneAccessRulesResp}
   */
  public ServiceCall<ListZoneAccessRulesResp> listAllZoneAccessRules(ListAllZoneAccessRulesOptions listAllZoneAccessRulesOptions) {
    if (listAllZoneAccessRulesOptions == null) {
      listAllZoneAccessRulesOptions = new ListAllZoneAccessRulesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_firewall_access_rules", "v1", "listAllZoneAccessRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllZoneAccessRulesOptions.notes() != null) {
      builder.query("notes", String.valueOf(listAllZoneAccessRulesOptions.notes()));
    }
    if (listAllZoneAccessRulesOptions.mode() != null) {
      builder.query("mode", String.valueOf(listAllZoneAccessRulesOptions.mode()));
    }
    if (listAllZoneAccessRulesOptions.configurationTarget() != null) {
      builder.query("configuration.target", String.valueOf(listAllZoneAccessRulesOptions.configurationTarget()));
    }
    if (listAllZoneAccessRulesOptions.configurationValue() != null) {
      builder.query("configuration.value", String.valueOf(listAllZoneAccessRulesOptions.configurationValue()));
    }
    if (listAllZoneAccessRulesOptions.page() != null) {
      builder.query("page", String.valueOf(listAllZoneAccessRulesOptions.page()));
    }
    if (listAllZoneAccessRulesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllZoneAccessRulesOptions.perPage()));
    }
    if (listAllZoneAccessRulesOptions.order() != null) {
      builder.query("order", String.valueOf(listAllZoneAccessRulesOptions.order()));
    }
    if (listAllZoneAccessRulesOptions.direction() != null) {
      builder.query("direction", String.valueOf(listAllZoneAccessRulesOptions.direction()));
    }
    if (listAllZoneAccessRulesOptions.match() != null) {
      builder.query("match", String.valueOf(listAllZoneAccessRulesOptions.match()));
    }
    ResponseConverter<ListZoneAccessRulesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListZoneAccessRulesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all firewall access rules.
   *
   * List all firewall access rules for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListZoneAccessRulesResp}
   */
  public ServiceCall<ListZoneAccessRulesResp> listAllZoneAccessRules() {
    return listAllZoneAccessRules(null);
  }

  /**
   * Create firewall access rule.
   *
   * Create a new firewall access rule for a given zone under a service instance.
   *
   * @param createZoneAccessRuleOptions the {@link CreateZoneAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneAccessRuleResp}
   */
  public ServiceCall<ZoneAccessRuleResp> createZoneAccessRule(CreateZoneAccessRuleOptions createZoneAccessRuleOptions) {
    boolean skipBody = false;
    if (createZoneAccessRuleOptions == null) {
      createZoneAccessRuleOptions = new CreateZoneAccessRuleOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_firewall_access_rules", "v1", "createZoneAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createZoneAccessRuleOptions.mode() != null) {
        contentJson.addProperty("mode", createZoneAccessRuleOptions.mode());
      }
      if (createZoneAccessRuleOptions.notes() != null) {
        contentJson.addProperty("notes", createZoneAccessRuleOptions.notes());
      }
      if (createZoneAccessRuleOptions.configuration() != null) {
        contentJson.add("configuration", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneAccessRuleOptions.configuration()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ZoneAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create firewall access rule.
   *
   * Create a new firewall access rule for a given zone under a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZoneAccessRuleResp}
   */
  public ServiceCall<ZoneAccessRuleResp> createZoneAccessRule() {
    return createZoneAccessRule(null);
  }

  /**
   * Delete firewall access rule.
   *
   * Delete an access rule given its id.
   *
   * @param deleteZoneAccessRuleOptions the {@link DeleteZoneAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteZoneAccessRuleResp}
   */
  public ServiceCall<DeleteZoneAccessRuleResp> deleteZoneAccessRule(DeleteZoneAccessRuleOptions deleteZoneAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneAccessRuleOptions,
      "deleteZoneAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteZoneAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_firewall_access_rules", "v1", "deleteZoneAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteZoneAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteZoneAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get firewall access rule.
   *
   * Get the details of a firewall access rule for a given zone under a given service instance.
   *
   * @param getZoneAccessRuleOptions the {@link GetZoneAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneAccessRuleResp}
   */
  public ServiceCall<ZoneAccessRuleResp> getZoneAccessRule(GetZoneAccessRuleOptions getZoneAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneAccessRuleOptions,
      "getZoneAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getZoneAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_firewall_access_rules", "v1", "getZoneAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ZoneAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update firewall access rule.
   *
   * Update an existing firewall access rule for a given zone under a given service instance.
   *
   * @param updateZoneAccessRuleOptions the {@link UpdateZoneAccessRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneAccessRuleResp}
   */
  public ServiceCall<ZoneAccessRuleResp> updateZoneAccessRule(UpdateZoneAccessRuleOptions updateZoneAccessRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneAccessRuleOptions,
      "updateZoneAccessRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/access_rules/rules" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateZoneAccessRuleOptions.accessruleIdentifier() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_firewall_access_rules", "v1", "updateZoneAccessRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneAccessRuleOptions.mode() != null) {
      contentJson.addProperty("mode", updateZoneAccessRuleOptions.mode());
    }
    if (updateZoneAccessRuleOptions.notes() != null) {
      contentJson.addProperty("notes", updateZoneAccessRuleOptions.notes());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ZoneAccessRuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneAccessRuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
