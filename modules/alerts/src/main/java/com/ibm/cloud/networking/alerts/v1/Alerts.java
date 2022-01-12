/*
 * (C) Copyright IBM Corp. 2022.
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
 * IBM OpenAPI SDK Code Generator Version: 3.43.0-49eab5c7-20211117-152138
 */

package com.ibm.cloud.networking.alerts.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.alerts.v1.model.AlertSuccessResp;
import com.ibm.cloud.networking.alerts.v1.model.CreateAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.DeleteAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPoliciesOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyOptions;
import com.ibm.cloud.networking.alerts.v1.model.GetAlertPolicyResp;
import com.ibm.cloud.networking.alerts.v1.model.ListAlertPoliciesResp;
import com.ibm.cloud.networking.alerts.v1.model.UpdateAlertPolicyOptions;
import com.ibm.cloud.networking.common.SdkCommon;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * CIS Alert Policies.
 *
 * API Version: 1.0.0
 */
public class Alerts extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "alerts";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `Alerts` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @return an instance of the `Alerts` client using external configuration
   */
  public static Alerts newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Alerts` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Alerts` client using external configuration
   */
  public static Alerts newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Alerts service = new Alerts(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Alerts` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Alerts(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
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
   * List alert policies.
   *
   * List configured alert policies for the CIS instance.
   *
   * @param getAlertPoliciesOptions the {@link GetAlertPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAlertPoliciesResp}
   */
  public ServiceCall<ListAlertPoliciesResp> getAlertPolicies(GetAlertPoliciesOptions getAlertPoliciesOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("alerts", "v1", "getAlertPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListAlertPoliciesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAlertPoliciesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List alert policies.
   *
   * List configured alert policies for the CIS instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListAlertPoliciesResp}
   */
  public ServiceCall<ListAlertPoliciesResp> getAlertPolicies() {
    return getAlertPolicies(null);
  }

  /**
   * Create an alert policy.
   *
   * Create a new alert policy for the CIS instance.
   *
   * @param createAlertPolicyOptions the {@link CreateAlertPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlertSuccessResp}
   */
  public ServiceCall<AlertSuccessResp> createAlertPolicy(CreateAlertPolicyOptions createAlertPolicyOptions) {
    boolean skipBody = false;
    if (createAlertPolicyOptions == null) {
      createAlertPolicyOptions = new CreateAlertPolicyOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("alerts", "v1", "createAlertPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createAlertPolicyOptions.name() != null) {
        contentJson.addProperty("name", createAlertPolicyOptions.name());
      }
      if (createAlertPolicyOptions.description() != null) {
        contentJson.addProperty("description", createAlertPolicyOptions.description());
      }
      if (createAlertPolicyOptions.enabled() != null) {
        contentJson.addProperty("enabled", createAlertPolicyOptions.enabled());
      }
      if (createAlertPolicyOptions.alertType() != null) {
        contentJson.addProperty("alert_type", createAlertPolicyOptions.alertType());
      }
      if (createAlertPolicyOptions.mechanisms() != null) {
        contentJson.add("mechanisms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAlertPolicyOptions.mechanisms()));
      }
      if (createAlertPolicyOptions.filters() != null) {
        contentJson.add("filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAlertPolicyOptions.filters()));
      }
      if (createAlertPolicyOptions.conditions() != null) {
        contentJson.add("conditions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAlertPolicyOptions.conditions()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AlertSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlertSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an alert policy.
   *
   * Create a new alert policy for the CIS instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link AlertSuccessResp}
   */
  public ServiceCall<AlertSuccessResp> createAlertPolicy() {
    return createAlertPolicy(null);
  }

  /**
   * Get an alert policy.
   *
   * Get an alert policy for the CIS instance.
   *
   * @param getAlertPolicyOptions the {@link GetAlertPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetAlertPolicyResp}
   */
  public ServiceCall<GetAlertPolicyResp> getAlertPolicy(GetAlertPolicyOptions getAlertPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAlertPolicyOptions,
      "getAlertPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("policy_id", getAlertPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("alerts", "v1", "getAlertPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetAlertPolicyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetAlertPolicyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an alert policy.
   *
   * Update an existing alert policy for the CIS instance.
   *
   * @param updateAlertPolicyOptions the {@link UpdateAlertPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlertSuccessResp}
   */
  public ServiceCall<AlertSuccessResp> updateAlertPolicy(UpdateAlertPolicyOptions updateAlertPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAlertPolicyOptions,
      "updateAlertPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("policy_id", updateAlertPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("alerts", "v1", "updateAlertPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAlertPolicyOptions.name() != null) {
      contentJson.addProperty("name", updateAlertPolicyOptions.name());
    }
    if (updateAlertPolicyOptions.description() != null) {
      contentJson.addProperty("description", updateAlertPolicyOptions.description());
    }
    if (updateAlertPolicyOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateAlertPolicyOptions.enabled());
    }
    if (updateAlertPolicyOptions.alertType() != null) {
      contentJson.addProperty("alert_type", updateAlertPolicyOptions.alertType());
    }
    if (updateAlertPolicyOptions.mechanisms() != null) {
      contentJson.add("mechanisms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAlertPolicyOptions.mechanisms()));
    }
    if (updateAlertPolicyOptions.conditions() != null) {
      contentJson.add("conditions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAlertPolicyOptions.conditions()));
    }
    if (updateAlertPolicyOptions.filters() != null) {
      contentJson.add("filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAlertPolicyOptions.filters()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AlertSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlertSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an alert policy.
   *
   * Delete an alert policy for the CIS instance.
   *
   * @param deleteAlertPolicyOptions the {@link DeleteAlertPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlertSuccessResp}
   */
  public ServiceCall<AlertSuccessResp> deleteAlertPolicy(DeleteAlertPolicyOptions deleteAlertPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAlertPolicyOptions,
      "deleteAlertPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("policy_id", deleteAlertPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("alerts", "v1", "deleteAlertPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AlertSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlertSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
