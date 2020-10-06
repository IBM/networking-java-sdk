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

package com.ibm.cloud.networking.zone_lockdown.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.zone_lockdown.v1.model.CreateZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.GetLockdownOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListAllZoneLockownRulesOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.UpdateLockdownRuleOptions;
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
 * Zone Lockdown.
 *
 * @version v1
 */
public class ZoneLockdown extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "zone_lockdown";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `ZoneLockdown` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @return an instance of the `ZoneLockdown` client using external configuration
   */
  public static ZoneLockdown newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `ZoneLockdown` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `ZoneLockdown` client using external configuration
   */
  public static ZoneLockdown newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    ZoneLockdown service = new ZoneLockdown(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `ZoneLockdown` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public ZoneLockdown(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
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
   * Gets the zoneIdentifier.
   *
   * Zone identifier (zone id).
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
   * List all lockdown rules.
   *
   * List all lockdown rules for a zone.
   *
   * @param listAllZoneLockownRulesOptions the {@link ListAllZoneLockownRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListLockdownResp}
   */
  public ServiceCall<ListLockdownResp> listAllZoneLockownRules(ListAllZoneLockownRulesOptions listAllZoneLockownRulesOptions) {
    if (listAllZoneLockownRulesOptions == null) {
      listAllZoneLockownRulesOptions = new ListAllZoneLockownRulesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "firewall/lockdowns" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_lockdown", "v1", "listAllZoneLockownRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllZoneLockownRulesOptions.page() != null) {
      builder.query("page", String.valueOf(listAllZoneLockownRulesOptions.page()));
    }
    if (listAllZoneLockownRulesOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllZoneLockownRulesOptions.perPage()));
    }
    ResponseConverter<ListLockdownResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLockdownResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all lockdown rules.
   *
   * List all lockdown rules for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListLockdownResp}
   */
  public ServiceCall<ListLockdownResp> listAllZoneLockownRules() {
    return listAllZoneLockownRules(null);
  }

  /**
   * Create lockdown rule.
   *
   * Create a new lockdown rule for a given zone under a service instance.
   *
   * @param createZoneLockdownRuleOptions the {@link CreateZoneLockdownRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LockdownResp}
   */
  public ServiceCall<LockdownResp> createZoneLockdownRule(CreateZoneLockdownRuleOptions createZoneLockdownRuleOptions) {
    boolean skipBody = false;
    if (createZoneLockdownRuleOptions == null) {
      createZoneLockdownRuleOptions = new CreateZoneLockdownRuleOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "firewall/lockdowns" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_lockdown", "v1", "createZoneLockdownRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createZoneLockdownRuleOptions.id() != null) {
        contentJson.addProperty("id", createZoneLockdownRuleOptions.id());
      }
      if (createZoneLockdownRuleOptions.paused() != null) {
        contentJson.addProperty("paused", createZoneLockdownRuleOptions.paused());
      }
      if (createZoneLockdownRuleOptions.description() != null) {
        contentJson.addProperty("description", createZoneLockdownRuleOptions.description());
      }
      if (createZoneLockdownRuleOptions.urls() != null) {
        contentJson.add("urls", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneLockdownRuleOptions.urls()));
      }
      if (createZoneLockdownRuleOptions.configurations() != null) {
        contentJson.add("configurations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneLockdownRuleOptions.configurations()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<LockdownResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LockdownResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create lockdown rule.
   *
   * Create a new lockdown rule for a given zone under a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link LockdownResp}
   */
  public ServiceCall<LockdownResp> createZoneLockdownRule() {
    return createZoneLockdownRule(null);
  }

  /**
   * Delete lockdown rule.
   *
   * Delete a lockdown rule for a particular zone, given its id.
   *
   * @param deleteZoneLockdownRuleOptions the {@link DeleteZoneLockdownRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteLockdownResp}
   */
  public ServiceCall<DeleteLockdownResp> deleteZoneLockdownRule(DeleteZoneLockdownRuleOptions deleteZoneLockdownRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneLockdownRuleOptions,
      "deleteZoneLockdownRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/lockdowns" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteZoneLockdownRuleOptions.lockdownRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_lockdown", "v1", "deleteZoneLockdownRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteLockdownResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteLockdownResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get lockdown rule.
   *
   * For a given service instance, zone id and lockdown rule id, get the lockdown rule details.
   *
   * @param getLockdownOptions the {@link GetLockdownOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LockdownResp}
   */
  public ServiceCall<LockdownResp> getLockdown(GetLockdownOptions getLockdownOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLockdownOptions,
      "getLockdownOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/lockdowns" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getLockdownOptions.lockdownRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_lockdown", "v1", "getLockdown");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LockdownResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LockdownResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update lockdown rule.
   *
   * Update an existing lockdown rule for a given zone under a given service instance.
   *
   * @param updateLockdownRuleOptions the {@link UpdateLockdownRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LockdownResp}
   */
  public ServiceCall<LockdownResp> updateLockdownRule(UpdateLockdownRuleOptions updateLockdownRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLockdownRuleOptions,
      "updateLockdownRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "firewall/lockdowns" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateLockdownRuleOptions.lockdownRuleIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zone_lockdown", "v1", "updateLockdownRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateLockdownRuleOptions.id() != null) {
      contentJson.addProperty("id", updateLockdownRuleOptions.id());
    }
    if (updateLockdownRuleOptions.paused() != null) {
      contentJson.addProperty("paused", updateLockdownRuleOptions.paused());
    }
    if (updateLockdownRuleOptions.description() != null) {
      contentJson.addProperty("description", updateLockdownRuleOptions.description());
    }
    if (updateLockdownRuleOptions.urls() != null) {
      contentJson.add("urls", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateLockdownRuleOptions.urls()));
    }
    if (updateLockdownRuleOptions.configurations() != null) {
      contentJson.add("configurations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateLockdownRuleOptions.configurations()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LockdownResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LockdownResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
