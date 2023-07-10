/*
 * (C) Copyright IBM Corp. 2023.
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
 * IBM OpenAPI SDK Code Generator Version: 3.73.0-eeee85a9-20230607-165104
 */

package com.ibm.cloud.networking.mtls.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.mtls.v1.model.AccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessCertResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessCertSettingsResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessOrgResp;
import com.ibm.cloud.networking.mtls.v1.model.AccessPolicyResp;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessOrganizationOptions;
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessAppResp;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessCertResp;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.DeleteAccessPolicyResp;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessCertSettingsOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.GetAccessPolicyOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessApplicationsOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessAppsResp;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessCertificatesOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessCertsResp;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessPoliciesOptions;
import com.ibm.cloud.networking.mtls.v1.model.ListAccessPoliciesResp;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessApplicationOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertSettingsOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessPolicyOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * MTLS.
 *
 * API Version: 1.0.0
 */
public class Mtls extends BaseService {

  /**
   * Default service name used when configuring the `Mtls` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "mtls";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `Mtls` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @return an instance of the `Mtls` client using external configuration
   */
  public static Mtls newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Mtls` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Mtls` client using external configuration
   */
  public static Mtls newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Mtls service = new Mtls(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Mtls` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Cloud resource name.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Mtls(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
  }

  /**
   * Gets the crn.
   *
   * Cloud resource name.
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
   * List access certificates.
   *
   * List access certificates.
   *
   * @param listAccessCertificatesOptions the {@link ListAccessCertificatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAccessCertsResp}
   */
  public ServiceCall<ListAccessCertsResp> listAccessCertificates(ListAccessCertificatesOptions listAccessCertificatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAccessCertificatesOptions,
      "listAccessCertificatesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", listAccessCertificatesOptions.zoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "listAccessCertificates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListAccessCertsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAccessCertsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create access certificate.
   *
   * Create access certificate.
   *
   * @param createAccessCertificateOptions the {@link CreateAccessCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessCertResp}
   */
  public ServiceCall<AccessCertResp> createAccessCertificate(CreateAccessCertificateOptions createAccessCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAccessCertificateOptions,
      "createAccessCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", createAccessCertificateOptions.zoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "createAccessCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createAccessCertificateOptions.name() != null) {
      contentJson.addProperty("name", createAccessCertificateOptions.name());
    }
    if (createAccessCertificateOptions.certificate() != null) {
      contentJson.addProperty("certificate", createAccessCertificateOptions.certificate());
    }
    if (createAccessCertificateOptions.associatedHostnames() != null) {
      contentJson.add("associated_hostnames", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAccessCertificateOptions.associatedHostnames()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get access certificate.
   *
   * Get access certificate.
   *
   * @param getAccessCertificateOptions the {@link GetAccessCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessCertResp}
   */
  public ServiceCall<AccessCertResp> getAccessCertificate(GetAccessCertificateOptions getAccessCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAccessCertificateOptions,
      "getAccessCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", getAccessCertificateOptions.zoneId());
    pathParamsMap.put("cert_id", getAccessCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "getAccessCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AccessCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update access certificate.
   *
   * Update access certificate.
   *
   * @param updateAccessCertificateOptions the {@link UpdateAccessCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessCertResp}
   */
  public ServiceCall<AccessCertResp> updateAccessCertificate(UpdateAccessCertificateOptions updateAccessCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAccessCertificateOptions,
      "updateAccessCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", updateAccessCertificateOptions.zoneId());
    pathParamsMap.put("cert_id", updateAccessCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "updateAccessCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAccessCertificateOptions.name() != null) {
      contentJson.addProperty("name", updateAccessCertificateOptions.name());
    }
    if (updateAccessCertificateOptions.associatedHostnames() != null) {
      contentJson.add("associated_hostnames", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAccessCertificateOptions.associatedHostnames()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete access certificate.
   *
   * Delete access certificate.
   *
   * @param deleteAccessCertificateOptions the {@link DeleteAccessCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAccessCertResp}
   */
  public ServiceCall<DeleteAccessCertResp> deleteAccessCertificate(DeleteAccessCertificateOptions deleteAccessCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAccessCertificateOptions,
      "deleteAccessCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", deleteAccessCertificateOptions.zoneId());
    pathParamsMap.put("cert_id", deleteAccessCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "deleteAccessCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAccessCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAccessCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List access applications.
   *
   * List access applications.
   *
   * @param listAccessApplicationsOptions the {@link ListAccessApplicationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAccessAppsResp}
   */
  public ServiceCall<ListAccessAppsResp> listAccessApplications(ListAccessApplicationsOptions listAccessApplicationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAccessApplicationsOptions,
      "listAccessApplicationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", listAccessApplicationsOptions.zoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "listAccessApplications");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListAccessAppsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAccessAppsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create access application.
   *
   * Create access application.
   *
   * @param createAccessApplicationOptions the {@link CreateAccessApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateAccessAppResp}
   */
  public ServiceCall<CreateAccessAppResp> createAccessApplication(CreateAccessApplicationOptions createAccessApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAccessApplicationOptions,
      "createAccessApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", createAccessApplicationOptions.zoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "createAccessApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createAccessApplicationOptions.name() != null) {
      contentJson.addProperty("name", createAccessApplicationOptions.name());
    }
    if (createAccessApplicationOptions.domain() != null) {
      contentJson.addProperty("domain", createAccessApplicationOptions.domain());
    }
    if (createAccessApplicationOptions.sessionDuration() != null) {
      contentJson.addProperty("session_duration", createAccessApplicationOptions.sessionDuration());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CreateAccessAppResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateAccessAppResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get access application.
   *
   * Get access application.
   *
   * @param getAccessApplicationOptions the {@link GetAccessApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessAppResp}
   */
  public ServiceCall<AccessAppResp> getAccessApplication(GetAccessApplicationOptions getAccessApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAccessApplicationOptions,
      "getAccessApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", getAccessApplicationOptions.zoneId());
    pathParamsMap.put("app_id", getAccessApplicationOptions.appId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "getAccessApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AccessAppResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessAppResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update access application.
   *
   * Update access application.
   *
   * @param updateAccessApplicationOptions the {@link UpdateAccessApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessAppResp}
   */
  public ServiceCall<AccessAppResp> updateAccessApplication(UpdateAccessApplicationOptions updateAccessApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAccessApplicationOptions,
      "updateAccessApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", updateAccessApplicationOptions.zoneId());
    pathParamsMap.put("app_id", updateAccessApplicationOptions.appId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "updateAccessApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAccessApplicationOptions.name() != null) {
      contentJson.addProperty("name", updateAccessApplicationOptions.name());
    }
    if (updateAccessApplicationOptions.domain() != null) {
      contentJson.addProperty("domain", updateAccessApplicationOptions.domain());
    }
    if (updateAccessApplicationOptions.sessionDuration() != null) {
      contentJson.addProperty("session_duration", updateAccessApplicationOptions.sessionDuration());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessAppResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessAppResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete access application.
   *
   * Delete access application.
   *
   * @param deleteAccessApplicationOptions the {@link DeleteAccessApplicationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAccessAppResp}
   */
  public ServiceCall<DeleteAccessAppResp> deleteAccessApplication(DeleteAccessApplicationOptions deleteAccessApplicationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAccessApplicationOptions,
      "deleteAccessApplicationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", deleteAccessApplicationOptions.zoneId());
    pathParamsMap.put("app_id", deleteAccessApplicationOptions.appId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "deleteAccessApplication");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAccessAppResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAccessAppResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List access policies.
   *
   * List access policies.
   *
   * @param listAccessPoliciesOptions the {@link ListAccessPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAccessPoliciesResp}
   */
  public ServiceCall<ListAccessPoliciesResp> listAccessPolicies(ListAccessPoliciesOptions listAccessPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listAccessPoliciesOptions,
      "listAccessPoliciesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", listAccessPoliciesOptions.zoneId());
    pathParamsMap.put("app_id", listAccessPoliciesOptions.appId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "listAccessPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListAccessPoliciesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAccessPoliciesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create access policy.
   *
   * Create access policy.
   *
   * @param createAccessPolicyOptions the {@link CreateAccessPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicyResp}
   */
  public ServiceCall<AccessPolicyResp> createAccessPolicy(CreateAccessPolicyOptions createAccessPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAccessPolicyOptions,
      "createAccessPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", createAccessPolicyOptions.zoneId());
    pathParamsMap.put("app_id", createAccessPolicyOptions.appId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}/policies", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "createAccessPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createAccessPolicyOptions.name() != null) {
      contentJson.addProperty("name", createAccessPolicyOptions.name());
    }
    if (createAccessPolicyOptions.decision() != null) {
      contentJson.addProperty("decision", createAccessPolicyOptions.decision());
    }
    if (createAccessPolicyOptions.include() != null) {
      contentJson.add("include", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAccessPolicyOptions.include()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessPolicyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get access policy.
   *
   * Get access policy.
   *
   * @param getAccessPolicyOptions the {@link GetAccessPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicyResp}
   */
  public ServiceCall<AccessPolicyResp> getAccessPolicy(GetAccessPolicyOptions getAccessPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAccessPolicyOptions,
      "getAccessPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", getAccessPolicyOptions.zoneId());
    pathParamsMap.put("app_id", getAccessPolicyOptions.appId());
    pathParamsMap.put("policy_id", getAccessPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "getAccessPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AccessPolicyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update access policy.
   *
   * Update access policy.
   *
   * @param updateAccessPolicyOptions the {@link UpdateAccessPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessPolicyResp}
   */
  public ServiceCall<AccessPolicyResp> updateAccessPolicy(UpdateAccessPolicyOptions updateAccessPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAccessPolicyOptions,
      "updateAccessPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", updateAccessPolicyOptions.zoneId());
    pathParamsMap.put("app_id", updateAccessPolicyOptions.appId());
    pathParamsMap.put("policy_id", updateAccessPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "updateAccessPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAccessPolicyOptions.name() != null) {
      contentJson.addProperty("name", updateAccessPolicyOptions.name());
    }
    if (updateAccessPolicyOptions.decision() != null) {
      contentJson.addProperty("decision", updateAccessPolicyOptions.decision());
    }
    if (updateAccessPolicyOptions.include() != null) {
      contentJson.add("include", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAccessPolicyOptions.include()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessPolicyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessPolicyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete access policy.
   *
   * Delete access policy.
   *
   * @param deleteAccessPolicyOptions the {@link DeleteAccessPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteAccessPolicyResp}
   */
  public ServiceCall<DeleteAccessPolicyResp> deleteAccessPolicy(DeleteAccessPolicyOptions deleteAccessPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAccessPolicyOptions,
      "deleteAccessPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", deleteAccessPolicyOptions.zoneId());
    pathParamsMap.put("app_id", deleteAccessPolicyOptions.appId());
    pathParamsMap.put("policy_id", deleteAccessPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/apps/{app_id}/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "deleteAccessPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteAccessPolicyResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteAccessPolicyResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get access certificates settings.
   *
   * Get access certificates settings.
   *
   * @param getAccessCertSettingsOptions the {@link GetAccessCertSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessCertSettingsResp}
   */
  public ServiceCall<AccessCertSettingsResp> getAccessCertSettings(GetAccessCertSettingsOptions getAccessCertSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAccessCertSettingsOptions,
      "getAccessCertSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", getAccessCertSettingsOptions.zoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates/settings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "getAccessCertSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AccessCertSettingsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessCertSettingsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update access certificates settings.
   *
   * Update access certificates settings.
   *
   * @param updateAccessCertSettingsOptions the {@link UpdateAccessCertSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessCertSettingsResp}
   */
  public ServiceCall<AccessCertSettingsResp> updateAccessCertSettings(UpdateAccessCertSettingsOptions updateAccessCertSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAccessCertSettingsOptions,
      "updateAccessCertSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", updateAccessCertSettingsOptions.zoneId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/access/certificates/settings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "updateAccessCertSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAccessCertSettingsOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAccessCertSettingsOptions.settings()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessCertSettingsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessCertSettingsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create access organization.
   *
   * Create access organization.
   *
   * @param createAccessOrganizationOptions the {@link CreateAccessOrganizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessOrgResp}
   */
  public ServiceCall<AccessOrgResp> createAccessOrganization(CreateAccessOrganizationOptions createAccessOrganizationOptions) {
    boolean skipBody = false;
    if (createAccessOrganizationOptions == null) {
      createAccessOrganizationOptions = new CreateAccessOrganizationOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/access/organizations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mtls", "v1", "createAccessOrganization");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createAccessOrganizationOptions.name() != null) {
        contentJson.addProperty("name", createAccessOrganizationOptions.name());
      }
      if (createAccessOrganizationOptions.authDomain() != null) {
        contentJson.addProperty("auth_domain", createAccessOrganizationOptions.authDomain());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<AccessOrgResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessOrgResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create access organization.
   *
   * Create access organization.
   *
   * @return a {@link ServiceCall} with a result of type {@link AccessOrgResp}
   */
  public ServiceCall<AccessOrgResp> createAccessOrganization() {
    return createAccessOrganization(null);
  }

}
