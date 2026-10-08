/*
 * (C) Copyright IBM Corp. 2026.
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
 * IBM OpenAPI SDK Code Generator Version: 3.117.0-7f07c563-20260915-094553
 */

package com.ibm.cloud.networking.ai_security_for_apps.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayDiscoveryResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewaySchemasResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationItemOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsPatchResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewayDiscoveryOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewaySchemasOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateZoneApiGatewayDiscoveryOperationOptions;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * AI Security for Apps.
 *
 * API Version: 1.0.0
 */
public class AiSecurityForApps extends BaseService {

  /**
   * Default service name used when configuring the `AiSecurityForApps` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "ai_security_for_apps";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `AiSecurityForApps` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Zone identifier to identify the zone.
   * @return an instance of the `AiSecurityForApps` client using external configuration
   */
  public static AiSecurityForApps newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `AiSecurityForApps` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Zone identifier to identify the zone.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `AiSecurityForApps` client using external configuration
   */
  public static AiSecurityForApps newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    AiSecurityForApps service = new AiSecurityForApps(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `AiSecurityForApps` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Zone identifier to identify the zone.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public AiSecurityForApps(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * Zone identifier to identify the zone.
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
   * Get AI Security for Apps settings.
   *
   * Get AI Security for Apps enabled/disabled setting for a given zone.
   *
   * @param getAiSecuritySettingsOptions the {@link GetAiSecuritySettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AiSecuritySettingsResp}
   */
  public ServiceCall<AiSecuritySettingsResp> getAiSecuritySettings(GetAiSecuritySettingsOptions getAiSecuritySettingsOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/ai_security/settings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "getAiSecuritySettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AiSecuritySettingsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AiSecuritySettingsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get AI Security for Apps settings.
   *
   * Get AI Security for Apps enabled/disabled setting for a given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AiSecuritySettingsResp}
   */
  public ServiceCall<AiSecuritySettingsResp> getAiSecuritySettings() {
    return getAiSecuritySettings(null);
  }

  /**
   * Update AI Security for Apps settings.
   *
   * Enable or disable AI Security for Apps for a given zone.
   *
   * @param replaceZoneAiSecuritySettingsOptions the {@link ReplaceZoneAiSecuritySettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AiSecuritySettingsResp}
   */
  public ServiceCall<AiSecuritySettingsResp> replaceZoneAiSecuritySettings(ReplaceZoneAiSecuritySettingsOptions replaceZoneAiSecuritySettingsOptions) {
    boolean skipBody = false;
    if (replaceZoneAiSecuritySettingsOptions == null) {
      replaceZoneAiSecuritySettingsOptions = new ReplaceZoneAiSecuritySettingsOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/ai_security/settings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "replaceZoneAiSecuritySettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (replaceZoneAiSecuritySettingsOptions.enabled() != null) {
        contentJson.addProperty("enabled", replaceZoneAiSecuritySettingsOptions.enabled());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AiSecuritySettingsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AiSecuritySettingsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update AI Security for Apps settings.
   *
   * Enable or disable AI Security for Apps for a given zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link AiSecuritySettingsResp}
   */
  public ServiceCall<AiSecuritySettingsResp> replaceZoneAiSecuritySettings() {
    return replaceZoneAiSecuritySettings(null);
  }

  /**
   * Get API Gateway discovery.
   *
   * Retrieve discovered operations for a zone rendered as OpenAPI schemas. Use this to identify AI-powered endpoints,
   * save them to Endpoint Management, and label them to enable AI Security for Apps scanning.
   *
   * @param getApiGatewayDiscoveryOptions the {@link GetApiGatewayDiscoveryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayDiscoveryResp}
   */
  public ServiceCall<ApiGatewayDiscoveryResp> getApiGatewayDiscovery(GetApiGatewayDiscoveryOptions getApiGatewayDiscoveryOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/discovery", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "getApiGatewayDiscovery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ApiGatewayDiscoveryResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewayDiscoveryResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get API Gateway discovery.
   *
   * Retrieve discovered operations for a zone rendered as OpenAPI schemas. Use this to identify AI-powered endpoints,
   * save them to Endpoint Management, and label them to enable AI Security for Apps scanning.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayDiscoveryResp}
   */
  public ServiceCall<ApiGatewayDiscoveryResp> getApiGatewayDiscovery() {
    return getApiGatewayDiscovery(null);
  }

  /**
   * List API Gateway discovery operations.
   *
   * Retrieve the most up-to-date list of discovered operations for a zone.
   *
   * @param listApiGatewayDiscoveryOperationsOptions the {@link ListApiGatewayDiscoveryOperationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DiscoveryOperationsListResp}
   */
  public ServiceCall<DiscoveryOperationsListResp> listApiGatewayDiscoveryOperations(ListApiGatewayDiscoveryOperationsOptions listApiGatewayDiscoveryOperationsOptions) {
    if (listApiGatewayDiscoveryOperationsOptions == null) {
      listApiGatewayDiscoveryOperationsOptions = new ListApiGatewayDiscoveryOperationsOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/discovery/operations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "listApiGatewayDiscoveryOperations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listApiGatewayDiscoveryOperationsOptions.diff() != null) {
      builder.query("diff", String.valueOf(listApiGatewayDiscoveryOperationsOptions.diff()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.direction() != null) {
      builder.query("direction", String.valueOf(listApiGatewayDiscoveryOperationsOptions.direction()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.endpoint() != null) {
      builder.query("endpoint", String.valueOf(listApiGatewayDiscoveryOperationsOptions.endpoint()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.host() != null) {
      builder.query("host", RequestUtils.join(listApiGatewayDiscoveryOperationsOptions.host(), ","));
    }
    if (listApiGatewayDiscoveryOperationsOptions.method() != null) {
      builder.query("method", RequestUtils.join(listApiGatewayDiscoveryOperationsOptions.method(), ","));
    }
    if (listApiGatewayDiscoveryOperationsOptions.order() != null) {
      builder.query("order", String.valueOf(listApiGatewayDiscoveryOperationsOptions.order()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.origin() != null) {
      builder.query("origin", String.valueOf(listApiGatewayDiscoveryOperationsOptions.origin()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.state() != null) {
      builder.query("state", String.valueOf(listApiGatewayDiscoveryOperationsOptions.state()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.page() != null) {
      builder.query("page", String.valueOf(listApiGatewayDiscoveryOperationsOptions.page()));
    }
    if (listApiGatewayDiscoveryOperationsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listApiGatewayDiscoveryOperationsOptions.perPage()));
    }
    ResponseConverter<DiscoveryOperationsListResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DiscoveryOperationsListResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List API Gateway discovery operations.
   *
   * Retrieve the most up-to-date list of discovered operations for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link DiscoveryOperationsListResp}
   */
  public ServiceCall<DiscoveryOperationsListResp> listApiGatewayDiscoveryOperations() {
    return listApiGatewayDiscoveryOperations(null);
  }

  /**
   * Bulk update discovered operation states.
   *
   * Bulk update the state of one or more discovered operations. Use to mark operations as saved (promoting to Endpoint
   * Management) or ignored.
   *
   * @param updateZoneApiGatewayDiscoveryOperationOptions the {@link UpdateZoneApiGatewayDiscoveryOperationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DiscoveryOperationsPatchResp}
   */
  public ServiceCall<DiscoveryOperationsPatchResp> updateZoneApiGatewayDiscoveryOperation(UpdateZoneApiGatewayDiscoveryOperationOptions updateZoneApiGatewayDiscoveryOperationOptions) {
    if (updateZoneApiGatewayDiscoveryOperationOptions == null) {
      updateZoneApiGatewayDiscoveryOperationOptions = new UpdateZoneApiGatewayDiscoveryOperationOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/discovery/operations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "updateZoneApiGatewayDiscoveryOperation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateZoneApiGatewayDiscoveryOperationOptions.requestBody() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateZoneApiGatewayDiscoveryOperationOptions.requestBody()), "application/json");
    }
    ResponseConverter<DiscoveryOperationsPatchResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DiscoveryOperationsPatchResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk update discovered operation states.
   *
   * Bulk update the state of one or more discovered operations. Use to mark operations as saved (promoting to Endpoint
   * Management) or ignored.
   *
   * @return a {@link ServiceCall} with a result of type {@link DiscoveryOperationsPatchResp}
   */
  public ServiceCall<DiscoveryOperationsPatchResp> updateZoneApiGatewayDiscoveryOperation() {
    return updateZoneApiGatewayDiscoveryOperation(null);
  }

  /**
   * Create API Gateway operations in bulk.
   *
   * Create API Gateway operations in bulk for a zone, saving them to Endpoint Management.
   *
   * @param createZoneApiGatewayOperationOptions the {@link CreateZoneApiGatewayOperationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationsResp}
   */
  public ServiceCall<ApiGatewayOperationsResp> createZoneApiGatewayOperation(CreateZoneApiGatewayOperationOptions createZoneApiGatewayOperationOptions) {
    if (createZoneApiGatewayOperationOptions == null) {
      createZoneApiGatewayOperationOptions = new CreateZoneApiGatewayOperationOptions.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/operations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "createZoneApiGatewayOperation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createZoneApiGatewayOperationOptions.apiGatewayOperation() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createZoneApiGatewayOperationOptions.apiGatewayOperation()), "application/json");
    }
    ResponseConverter<ApiGatewayOperationsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewayOperationsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create API Gateway operations in bulk.
   *
   * Create API Gateway operations in bulk for a zone, saving them to Endpoint Management.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationsResp}
   */
  public ServiceCall<ApiGatewayOperationsResp> createZoneApiGatewayOperation() {
    return createZoneApiGatewayOperation(null);
  }

  /**
   * Create a single API Gateway operation.
   *
   * Create a single API Gateway operation for a zone, saving it to Endpoint Management.
   *
   * @param createApiGatewayOperationItemOptions the {@link CreateApiGatewayOperationItemOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationItemResp}
   */
  public ServiceCall<ApiGatewayOperationItemResp> createApiGatewayOperationItem(CreateApiGatewayOperationItemOptions createApiGatewayOperationItemOptions) {
    boolean skipBody = false;
    if (createApiGatewayOperationItemOptions == null) {
      createApiGatewayOperationItemOptions = new CreateApiGatewayOperationItemOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/operations/item", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "createApiGatewayOperationItem");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createApiGatewayOperationItemOptions.method() != null) {
        contentJson.addProperty("method", createApiGatewayOperationItemOptions.method());
      }
      if (createApiGatewayOperationItemOptions.host() != null) {
        contentJson.addProperty("host", createApiGatewayOperationItemOptions.host());
      }
      if (createApiGatewayOperationItemOptions.endpoint() != null) {
        contentJson.addProperty("endpoint", createApiGatewayOperationItemOptions.endpoint());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ApiGatewayOperationItemResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewayOperationItemResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a single API Gateway operation.
   *
   * Create a single API Gateway operation for a zone, saving it to Endpoint Management.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationItemResp}
   */
  public ServiceCall<ApiGatewayOperationItemResp> createApiGatewayOperationItem() {
    return createApiGatewayOperationItem(null);
  }

  /**
   * Add or remove labels from API Gateway operations.
   *
   * Add or remove labels from one or more API Gateway operations. Apply the built-in LLM label to endpoints that
   * receive LLM traffic to enable IBM AI Security for Apps to scan those endpoints for prompt injection, PII, and
   * unsafe topics.
   *
   * @param updateApiGatewayOperationLabelsOptions the {@link UpdateApiGatewayOperationLabelsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationsLabelsResp}
   */
  public ServiceCall<ApiGatewayOperationsLabelsResp> updateApiGatewayOperationLabels(UpdateApiGatewayOperationLabelsOptions updateApiGatewayOperationLabelsOptions) {
    boolean skipBody = false;
    if (updateApiGatewayOperationLabelsOptions == null) {
      updateApiGatewayOperationLabelsOptions = new UpdateApiGatewayOperationLabelsOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/operations/labels", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "updateApiGatewayOperationLabels");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateApiGatewayOperationLabelsOptions.user() != null) {
        contentJson.add("user", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateApiGatewayOperationLabelsOptions.user()));
      }
      if (updateApiGatewayOperationLabelsOptions.managed() != null) {
        contentJson.add("managed", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateApiGatewayOperationLabelsOptions.managed()));
      }
      if (updateApiGatewayOperationLabelsOptions.selector() != null) {
        contentJson.add("selector", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateApiGatewayOperationLabelsOptions.selector()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ApiGatewayOperationsLabelsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewayOperationsLabelsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add or remove labels from API Gateway operations.
   *
   * Add or remove labels from one or more API Gateway operations. Apply the built-in LLM label to endpoints that
   * receive LLM traffic to enable IBM AI Security for Apps to scan those endpoints for prompt injection, PII, and
   * unsafe topics.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationsLabelsResp}
   */
  public ServiceCall<ApiGatewayOperationsLabelsResp> updateApiGatewayOperationLabels() {
    return updateApiGatewayOperationLabels(null);
  }

  /**
   * Retrieve information about an operation.
   *
   * Retrieve information about a specific operation on a zone.
   *
   * @param getZoneApiGatewayOperationOptions the {@link GetZoneApiGatewayOperationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewayOperationItemResp}
   */
  public ServiceCall<ApiGatewayOperationItemResp> getZoneApiGatewayOperation(GetZoneApiGatewayOperationOptions getZoneApiGatewayOperationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneApiGatewayOperationOptions,
      "getZoneApiGatewayOperationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("operation_id", getZoneApiGatewayOperationOptions.operationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/operations/{operation_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "getZoneApiGatewayOperation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ApiGatewayOperationItemResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewayOperationItemResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an operation.
   *
   * Delete an operation from a zone.
   *
   * @param deleteZoneApiGatewayOperationOptions the {@link DeleteZoneApiGatewayOperationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteZoneApiGatewayOperation(DeleteZoneApiGatewayOperationOptions deleteZoneApiGatewayOperationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneApiGatewayOperationOptions,
      "deleteZoneApiGatewayOperationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    pathParamsMap.put("operation_id", deleteZoneApiGatewayOperationOptions.operationId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/operations/{operation_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "deleteZoneApiGatewayOperation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get API Gateway schemas.
   *
   * Retrieve API Gateway schemas for a specified zone rendered as OpenAPI schemas.
   *
   * @param getApiGatewaySchemasOptions the {@link GetApiGatewaySchemasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewaySchemasResp}
   */
  public ServiceCall<ApiGatewaySchemasResp> getApiGatewaySchemas(GetApiGatewaySchemasOptions getApiGatewaySchemasOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_identifier", this.zoneIdentifier);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_identifier}/api_gateway/schemas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ai_security_for_apps", "v1", "getApiGatewaySchemas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ApiGatewaySchemasResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ApiGatewaySchemasResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get API Gateway schemas.
   *
   * Retrieve API Gateway schemas for a specified zone rendered as OpenAPI schemas.
   *
   * @return a {@link ServiceCall} with a result of type {@link ApiGatewaySchemasResp}
   */
  public ServiceCall<ApiGatewaySchemasResp> getApiGatewaySchemas() {
    return getApiGatewaySchemas(null);
  }

}
