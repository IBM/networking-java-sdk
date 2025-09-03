/*
 * (C) Copyright IBM Corp. 2025.
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
 * IBM OpenAPI SDK Code Generator Version: 3.107.0-b68ebf7a-20250811-145645
 */

package com.ibm.cloud.networking.rulesets.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.rulesets.v1.model.CreateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.CreateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionByTagOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.ListRulesetsResp;
import com.ibm.cloud.networking.rulesets.v1.model.RuleResp;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetResp;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Rulesets Engine.
 *
 * API Version: 1.0.1
 */
public class Rulesets extends BaseService {

  /**
   * Default service name used when configuring the `Rulesets` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "rulesets";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `Rulesets` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @return an instance of the `Rulesets` client using external configuration
   */
  public static Rulesets newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Rulesets` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Rulesets` client using external configuration
   */
  public static Rulesets newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Rulesets service = new Rulesets(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Rulesets` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Rulesets(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
  }

  /**
   * Gets the crn.
   *
   * Full url-encoded CRN of the service instance.
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
   * zone identifier.
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
   * List Instance rulesets.
   *
   * List all rulesets at the instance level.
   *
   * @param getInstanceRulesetsOptions the {@link GetInstanceRulesetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getInstanceRulesets(GetInstanceRulesetsOptions getInstanceRulesetsOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceRulesets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Instance rulesets.
   *
   * List all rulesets at the instance level.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getInstanceRulesets() {
    return getInstanceRulesets(null);
  }

  /**
   * Get an instance ruleset.
   *
   * View a specific instance ruleset.
   *
   * @param getInstanceRulesetOptions the {@link GetInstanceRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getInstanceRuleset(GetInstanceRulesetOptions getInstanceRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceRulesetOptions,
      "getInstanceRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", getInstanceRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance ruleset.
   *
   * Update a specific instance ruleset.
   *
   * @param updateInstanceRulesetOptions the {@link UpdateInstanceRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateInstanceRuleset(UpdateInstanceRulesetOptions updateInstanceRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceRulesetOptions,
      "updateInstanceRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", updateInstanceRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateInstanceRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateInstanceRulesetOptions.description() != null) {
      contentJson.addProperty("description", updateInstanceRulesetOptions.description());
    }
    if (updateInstanceRulesetOptions.kind() != null) {
      contentJson.addProperty("kind", updateInstanceRulesetOptions.kind());
    }
    if (updateInstanceRulesetOptions.name() != null) {
      contentJson.addProperty("name", updateInstanceRulesetOptions.name());
    }
    if (updateInstanceRulesetOptions.phase() != null) {
      contentJson.addProperty("phase", updateInstanceRulesetOptions.phase());
    }
    if (updateInstanceRulesetOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceRulesetOptions.rules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance ruleset.
   *
   * Delete a specific instance ruleset.
   *
   * @param deleteInstanceRulesetOptions the {@link DeleteInstanceRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceRuleset(DeleteInstanceRulesetOptions deleteInstanceRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceRulesetOptions,
      "deleteInstanceRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", deleteInstanceRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteInstanceRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List version of an instance ruleset.
   *
   * List all versions of a specific instance ruleset.
   *
   * @param getInstanceRulesetVersionsOptions the {@link GetInstanceRulesetVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getInstanceRulesetVersions(GetInstanceRulesetVersionsOptions getInstanceRulesetVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceRulesetVersionsOptions,
      "getInstanceRulesetVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", getInstanceRulesetVersionsOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceRulesetVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a specific version of an instance ruleset.
   *
   * View a specific version of a specific instance ruleset.
   *
   * @param getInstanceRulesetVersionOptions the {@link GetInstanceRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getInstanceRulesetVersion(GetInstanceRulesetVersionOptions getInstanceRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceRulesetVersionOptions,
      "getInstanceRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", getInstanceRulesetVersionOptions.rulesetId());
    pathParamsMap.put("ruleset_version", getInstanceRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a specific version of an instance ruleset.
   *
   * Delete a specific version of a specific instance ruleset.
   *
   * @param deleteInstanceRulesetVersionOptions the {@link DeleteInstanceRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceRulesetVersion(DeleteInstanceRulesetVersionOptions deleteInstanceRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceRulesetVersionOptions,
      "deleteInstanceRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", deleteInstanceRulesetVersionOptions.rulesetId());
    pathParamsMap.put("ruleset_version", deleteInstanceRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteInstanceRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an instance entrypoint ruleset.
   *
   * Get the instance ruleset for the given phase's entrypoint.
   *
   * @param getInstanceEntrypointRulesetOptions the {@link GetInstanceEntrypointRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getInstanceEntrypointRuleset(GetInstanceEntrypointRulesetOptions getInstanceEntrypointRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceEntrypointRulesetOptions,
      "getInstanceEntrypointRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_phase", getInstanceEntrypointRulesetOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/phases/{ruleset_phase}/entrypoint", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceEntrypointRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance entrypoint ruleset.
   *
   * Updates the instance ruleset for the given phase's entry point.
   *
   * @param updateInstanceEntrypointRulesetOptions the {@link UpdateInstanceEntrypointRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateInstanceEntrypointRuleset(UpdateInstanceEntrypointRulesetOptions updateInstanceEntrypointRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceEntrypointRulesetOptions,
      "updateInstanceEntrypointRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_phase", updateInstanceEntrypointRulesetOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/phases/{ruleset_phase}/entrypoint", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateInstanceEntrypointRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateInstanceEntrypointRulesetOptions.description() != null) {
      contentJson.addProperty("description", updateInstanceEntrypointRulesetOptions.description());
    }
    if (updateInstanceEntrypointRulesetOptions.kind() != null) {
      contentJson.addProperty("kind", updateInstanceEntrypointRulesetOptions.kind());
    }
    if (updateInstanceEntrypointRulesetOptions.name() != null) {
      contentJson.addProperty("name", updateInstanceEntrypointRulesetOptions.name());
    }
    if (updateInstanceEntrypointRulesetOptions.phase() != null) {
      contentJson.addProperty("phase", updateInstanceEntrypointRulesetOptions.phase());
    }
    if (updateInstanceEntrypointRulesetOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceEntrypointRulesetOptions.rules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List an instance entry point ruleset's versions.
   *
   * Lists the instance ruleset versions for the given phase's entry point.
   *
   * @param getInstanceEntryPointRulesetVersionsOptions the {@link GetInstanceEntryPointRulesetVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getInstanceEntryPointRulesetVersions(GetInstanceEntryPointRulesetVersionsOptions getInstanceEntryPointRulesetVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceEntryPointRulesetVersionsOptions,
      "getInstanceEntryPointRulesetVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_phase", getInstanceEntryPointRulesetVersionsOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/phases/{ruleset_phase}/entrypoint/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceEntryPointRulesetVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an instance entry point ruleset version.
   *
   * Fetches a specific version of an instance entry point ruleset.
   *
   * @param getInstanceEntryPointRulesetVersionOptions the {@link GetInstanceEntryPointRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getInstanceEntryPointRulesetVersion(GetInstanceEntryPointRulesetVersionOptions getInstanceEntryPointRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceEntryPointRulesetVersionOptions,
      "getInstanceEntryPointRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_phase", getInstanceEntryPointRulesetVersionOptions.rulesetPhase());
    pathParamsMap.put("ruleset_version", getInstanceEntryPointRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceEntryPointRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an instance ruleset rule.
   *
   * Create an instance ruleset rule.
   *
   * @param createInstanceRulesetRuleOptions the {@link CreateInstanceRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> createInstanceRulesetRule(CreateInstanceRulesetRuleOptions createInstanceRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceRulesetRuleOptions,
      "createInstanceRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", createInstanceRulesetRuleOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "createInstanceRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createInstanceRulesetRuleOptions.action() != null) {
      contentJson.addProperty("action", createInstanceRulesetRuleOptions.action());
    }
    if (createInstanceRulesetRuleOptions.actionParameters() != null) {
      contentJson.add("action_parameters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceRulesetRuleOptions.actionParameters()));
    }
    if (createInstanceRulesetRuleOptions.ratelimit() != null) {
      contentJson.add("ratelimit", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceRulesetRuleOptions.ratelimit()));
    }
    if (createInstanceRulesetRuleOptions.description() != null) {
      contentJson.addProperty("description", createInstanceRulesetRuleOptions.description());
    }
    if (createInstanceRulesetRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", createInstanceRulesetRuleOptions.enabled());
    }
    if (createInstanceRulesetRuleOptions.expression() != null) {
      contentJson.addProperty("expression", createInstanceRulesetRuleOptions.expression());
    }
    if (createInstanceRulesetRuleOptions.id() != null) {
      contentJson.addProperty("id", createInstanceRulesetRuleOptions.id());
    }
    if (createInstanceRulesetRuleOptions.logging() != null) {
      contentJson.add("logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceRulesetRuleOptions.logging()));
    }
    if (createInstanceRulesetRuleOptions.ref() != null) {
      contentJson.addProperty("ref", createInstanceRulesetRuleOptions.ref());
    }
    if (createInstanceRulesetRuleOptions.position() != null) {
      contentJson.add("position", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceRulesetRuleOptions.position()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an instance ruleset rule.
   *
   * Update an instance ruleset rule.
   *
   * @param updateInstanceRulesetRuleOptions the {@link UpdateInstanceRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateInstanceRulesetRule(UpdateInstanceRulesetRuleOptions updateInstanceRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceRulesetRuleOptions,
      "updateInstanceRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", updateInstanceRulesetRuleOptions.rulesetId());
    pathParamsMap.put("rule_id", updateInstanceRulesetRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateInstanceRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateInstanceRulesetRuleOptions.action() != null) {
      contentJson.addProperty("action", updateInstanceRulesetRuleOptions.action());
    }
    if (updateInstanceRulesetRuleOptions.actionParameters() != null) {
      contentJson.add("action_parameters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceRulesetRuleOptions.actionParameters()));
    }
    if (updateInstanceRulesetRuleOptions.ratelimit() != null) {
      contentJson.add("ratelimit", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceRulesetRuleOptions.ratelimit()));
    }
    if (updateInstanceRulesetRuleOptions.description() != null) {
      contentJson.addProperty("description", updateInstanceRulesetRuleOptions.description());
    }
    if (updateInstanceRulesetRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateInstanceRulesetRuleOptions.enabled());
    }
    if (updateInstanceRulesetRuleOptions.expression() != null) {
      contentJson.addProperty("expression", updateInstanceRulesetRuleOptions.expression());
    }
    if (updateInstanceRulesetRuleOptions.id() != null) {
      contentJson.addProperty("id", updateInstanceRulesetRuleOptions.id());
    }
    if (updateInstanceRulesetRuleOptions.logging() != null) {
      contentJson.add("logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceRulesetRuleOptions.logging()));
    }
    if (updateInstanceRulesetRuleOptions.ref() != null) {
      contentJson.addProperty("ref", updateInstanceRulesetRuleOptions.ref());
    }
    if (updateInstanceRulesetRuleOptions.position() != null) {
      contentJson.add("position", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateInstanceRulesetRuleOptions.position()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an instance ruleset rule.
   *
   * Delete an instance ruleset rule.
   *
   * @param deleteInstanceRulesetRuleOptions the {@link DeleteInstanceRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RuleResp}
   */
  public ServiceCall<RuleResp> deleteInstanceRulesetRule(DeleteInstanceRulesetRuleOptions deleteInstanceRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceRulesetRuleOptions,
      "deleteInstanceRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", deleteInstanceRulesetRuleOptions.rulesetId());
    pathParamsMap.put("rule_id", deleteInstanceRulesetRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteInstanceRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List an instance ruleset verion's rules by tag.
   *
   * Lists rules by tag for a specific version of an instance ruleset.
   *
   * @param getInstanceRulesetVersionByTagOptions the {@link GetInstanceRulesetVersionByTagOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getInstanceRulesetVersionByTag(GetInstanceRulesetVersionByTagOptions getInstanceRulesetVersionByTagOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceRulesetVersionByTagOptions,
      "getInstanceRulesetVersionByTagOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("ruleset_id", getInstanceRulesetVersionByTagOptions.rulesetId());
    pathParamsMap.put("ruleset_version", getInstanceRulesetVersionByTagOptions.rulesetVersion());
    pathParamsMap.put("rule_tag", getInstanceRulesetVersionByTagOptions.ruleTag());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/rulesets/{ruleset_id}/versions/{ruleset_version}/by_tag/{rule_tag}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getInstanceRulesetVersionByTag");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List zone rulesets.
   *
   * List all rulesets at the zone level.
   *
   * @param getZoneRulesetsOptions the {@link GetZoneRulesetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getZoneRulesets(GetZoneRulesetsOptions getZoneRulesetsOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneRulesets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List zone rulesets.
   *
   * List all rulesets at the zone level.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getZoneRulesets() {
    return getZoneRulesets(null);
  }

  /**
   * Get a zone ruleset.
   *
   * View a specific zone ruleset.
   *
   * @param getZoneRulesetOptions the {@link GetZoneRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getZoneRuleset(GetZoneRulesetOptions getZoneRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneRulesetOptions,
      "getZoneRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", getZoneRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a zone ruleset.
   *
   * Update a specific zone ruleset.
   *
   * @param updateZoneRulesetOptions the {@link UpdateZoneRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateZoneRuleset(UpdateZoneRulesetOptions updateZoneRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneRulesetOptions,
      "updateZoneRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", updateZoneRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateZoneRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneRulesetOptions.description() != null) {
      contentJson.addProperty("description", updateZoneRulesetOptions.description());
    }
    if (updateZoneRulesetOptions.kind() != null) {
      contentJson.addProperty("kind", updateZoneRulesetOptions.kind());
    }
    if (updateZoneRulesetOptions.name() != null) {
      contentJson.addProperty("name", updateZoneRulesetOptions.name());
    }
    if (updateZoneRulesetOptions.phase() != null) {
      contentJson.addProperty("phase", updateZoneRulesetOptions.phase());
    }
    if (updateZoneRulesetOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneRulesetOptions.rules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a zone ruleset.
   *
   * Delete a specific zone ruleset.
   *
   * @param deleteZoneRulesetOptions the {@link DeleteZoneRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteZoneRuleset(DeleteZoneRulesetOptions deleteZoneRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneRulesetOptions,
      "deleteZoneRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", deleteZoneRulesetOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteZoneRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List version of a zone ruleset.
   *
   * List all versions of a specific zone ruleset.
   *
   * @param getZoneRulesetVersionsOptions the {@link GetZoneRulesetVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getZoneRulesetVersions(GetZoneRulesetVersionsOptions getZoneRulesetVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneRulesetVersionsOptions,
      "getZoneRulesetVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", getZoneRulesetVersionsOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneRulesetVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a specific version of a zone ruleset.
   *
   * View a specific version of a specific zone ruleset.
   *
   * @param getZoneRulesetVersionOptions the {@link GetZoneRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getZoneRulesetVersion(GetZoneRulesetVersionOptions getZoneRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneRulesetVersionOptions,
      "getZoneRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", getZoneRulesetVersionOptions.rulesetId());
    pathParamsMap.put("ruleset_version", getZoneRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a specific version of a zone ruleset.
   *
   * Delete a specific version of a specific zone ruleset.
   *
   * @param deleteZoneRulesetVersionOptions the {@link DeleteZoneRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteZoneRulesetVersion(DeleteZoneRulesetVersionOptions deleteZoneRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneRulesetVersionOptions,
      "deleteZoneRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", deleteZoneRulesetVersionOptions.rulesetId());
    pathParamsMap.put("ruleset_version", deleteZoneRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteZoneRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a zone entrypoint ruleset.
   *
   * Get the zone ruleset for the given phase's entrypoint.
   *
   * @param getZoneEntrypointRulesetOptions the {@link GetZoneEntrypointRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getZoneEntrypointRuleset(GetZoneEntrypointRulesetOptions getZoneEntrypointRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneEntrypointRulesetOptions,
      "getZoneEntrypointRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_phase", getZoneEntrypointRulesetOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/phases/{ruleset_phase}/entrypoint", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneEntrypointRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a zone entrypoint ruleset.
   *
   * Updates the instance ruleset for the given phase's entry point.
   *
   * @param updateZoneEntrypointRulesetOptions the {@link UpdateZoneEntrypointRulesetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateZoneEntrypointRuleset(UpdateZoneEntrypointRulesetOptions updateZoneEntrypointRulesetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneEntrypointRulesetOptions,
      "updateZoneEntrypointRulesetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_phase", updateZoneEntrypointRulesetOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/phases/{ruleset_phase}/entrypoint", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateZoneEntrypointRuleset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneEntrypointRulesetOptions.description() != null) {
      contentJson.addProperty("description", updateZoneEntrypointRulesetOptions.description());
    }
    if (updateZoneEntrypointRulesetOptions.kind() != null) {
      contentJson.addProperty("kind", updateZoneEntrypointRulesetOptions.kind());
    }
    if (updateZoneEntrypointRulesetOptions.name() != null) {
      contentJson.addProperty("name", updateZoneEntrypointRulesetOptions.name());
    }
    if (updateZoneEntrypointRulesetOptions.phase() != null) {
      contentJson.addProperty("phase", updateZoneEntrypointRulesetOptions.phase());
    }
    if (updateZoneEntrypointRulesetOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneEntrypointRulesetOptions.rules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List a zone entry point ruleset's versions.
   *
   * Lists the zone ruleset versions for the given phase's entry point.
   *
   * @param getZoneEntryPointRulesetVersionsOptions the {@link GetZoneEntryPointRulesetVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListRulesetsResp}
   */
  public ServiceCall<ListRulesetsResp> getZoneEntryPointRulesetVersions(GetZoneEntryPointRulesetVersionsOptions getZoneEntryPointRulesetVersionsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneEntryPointRulesetVersionsOptions,
      "getZoneEntryPointRulesetVersionsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_phase", getZoneEntryPointRulesetVersionsOptions.rulesetPhase());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/phases/{ruleset_phase}/entrypoint/versions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneEntryPointRulesetVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListRulesetsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListRulesetsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a zone entry point ruleset version.
   *
   * Fetches a specific version of a zone entry point ruleset.
   *
   * @param getZoneEntryPointRulesetVersionOptions the {@link GetZoneEntryPointRulesetVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> getZoneEntryPointRulesetVersion(GetZoneEntryPointRulesetVersionOptions getZoneEntryPointRulesetVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneEntryPointRulesetVersionOptions,
      "getZoneEntryPointRulesetVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_phase", getZoneEntryPointRulesetVersionOptions.rulesetPhase());
    pathParamsMap.put("ruleset_version", getZoneEntryPointRulesetVersionOptions.rulesetVersion());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "getZoneEntryPointRulesetVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a zone ruleset rule.
   *
   * Create a zone ruleset rule.
   *
   * @param createZoneRulesetRuleOptions the {@link CreateZoneRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> createZoneRulesetRule(CreateZoneRulesetRuleOptions createZoneRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createZoneRulesetRuleOptions,
      "createZoneRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", createZoneRulesetRuleOptions.rulesetId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "createZoneRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createZoneRulesetRuleOptions.action() != null) {
      contentJson.addProperty("action", createZoneRulesetRuleOptions.action());
    }
    if (createZoneRulesetRuleOptions.actionParameters() != null) {
      contentJson.add("action_parameters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRulesetRuleOptions.actionParameters()));
    }
    if (createZoneRulesetRuleOptions.ratelimit() != null) {
      contentJson.add("ratelimit", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRulesetRuleOptions.ratelimit()));
    }
    if (createZoneRulesetRuleOptions.description() != null) {
      contentJson.addProperty("description", createZoneRulesetRuleOptions.description());
    }
    if (createZoneRulesetRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", createZoneRulesetRuleOptions.enabled());
    }
    if (createZoneRulesetRuleOptions.expression() != null) {
      contentJson.addProperty("expression", createZoneRulesetRuleOptions.expression());
    }
    if (createZoneRulesetRuleOptions.id() != null) {
      contentJson.addProperty("id", createZoneRulesetRuleOptions.id());
    }
    if (createZoneRulesetRuleOptions.logging() != null) {
      contentJson.add("logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRulesetRuleOptions.logging()));
    }
    if (createZoneRulesetRuleOptions.ref() != null) {
      contentJson.addProperty("ref", createZoneRulesetRuleOptions.ref());
    }
    if (createZoneRulesetRuleOptions.position() != null) {
      contentJson.add("position", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createZoneRulesetRuleOptions.position()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a zone ruleset rule.
   *
   * Update a zone ruleset rule.
   *
   * @param updateZoneRulesetRuleOptions the {@link UpdateZoneRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesetResp}
   */
  public ServiceCall<RulesetResp> updateZoneRulesetRule(UpdateZoneRulesetRuleOptions updateZoneRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneRulesetRuleOptions,
      "updateZoneRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", updateZoneRulesetRuleOptions.rulesetId());
    pathParamsMap.put("rule_id", updateZoneRulesetRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "updateZoneRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneRulesetRuleOptions.action() != null) {
      contentJson.addProperty("action", updateZoneRulesetRuleOptions.action());
    }
    if (updateZoneRulesetRuleOptions.actionParameters() != null) {
      contentJson.add("action_parameters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneRulesetRuleOptions.actionParameters()));
    }
    if (updateZoneRulesetRuleOptions.ratelimit() != null) {
      contentJson.add("ratelimit", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneRulesetRuleOptions.ratelimit()));
    }
    if (updateZoneRulesetRuleOptions.description() != null) {
      contentJson.addProperty("description", updateZoneRulesetRuleOptions.description());
    }
    if (updateZoneRulesetRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateZoneRulesetRuleOptions.enabled());
    }
    if (updateZoneRulesetRuleOptions.expression() != null) {
      contentJson.addProperty("expression", updateZoneRulesetRuleOptions.expression());
    }
    if (updateZoneRulesetRuleOptions.id() != null) {
      contentJson.addProperty("id", updateZoneRulesetRuleOptions.id());
    }
    if (updateZoneRulesetRuleOptions.logging() != null) {
      contentJson.add("logging", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneRulesetRuleOptions.logging()));
    }
    if (updateZoneRulesetRuleOptions.ref() != null) {
      contentJson.addProperty("ref", updateZoneRulesetRuleOptions.ref());
    }
    if (updateZoneRulesetRuleOptions.position() != null) {
      contentJson.add("position", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateZoneRulesetRuleOptions.position()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RulesetResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesetResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a zone ruleset rule.
   *
   * Delete an instance ruleset rule.
   *
   * @param deleteZoneRulesetRuleOptions the {@link DeleteZoneRulesetRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RuleResp}
   */
  public ServiceCall<RuleResp> deleteZoneRulesetRule(DeleteZoneRulesetRuleOptions deleteZoneRulesetRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneRulesetRuleOptions,
      "deleteZoneRulesetRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("ruleset_id", deleteZoneRulesetRuleOptions.rulesetId());
    pathParamsMap.put("rule_id", deleteZoneRulesetRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/rulesets/{ruleset_id}/rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("rulesets", "v1", "deleteZoneRulesetRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<RuleResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RuleResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
