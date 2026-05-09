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
 * IBM OpenAPI SDK Code Generator Version: 3.114.0-a902401e-20260427-192904
 */

package com.ibm.cloud.networking.logpush_jobs_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogRetentionOptions;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.CreateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.DeleteLogpushJobResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.DeleteLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushJobsV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogpushOwnershipV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.GetLogsRetentionOptions;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListFieldsForDatasetV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListFieldsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListLogpushJobsForDatasetV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ListLogpushJobsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogRetentionResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.LogpushJobsResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.OwnershipChallengeResp;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.OwnershipChallengeValidateResult;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.UpdateLogpushJobV2Options;
import com.ibm.cloud.networking.logpush_jobs_api.v1.model.ValidateLogpushOwnershipChallengeV2Options;
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
 * CIS Logpush Jobs.
 *
 * API Version: 1.0.0
 */
public class LogpushJobsApi extends BaseService {

  /**
   * Default service name used when configuring the `LogpushJobsApi` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "logpush_jobs_api";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String dataset;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `LogpushJobsApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param dataset The dataset.
   * @param zoneId Zone identifier.
   * @return an instance of the `LogpushJobsApi` client using external configuration
   */
  public static LogpushJobsApi newInstance(String crn, String dataset, String zoneId) {
    return newInstance(crn, dataset, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `LogpushJobsApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param dataset The dataset.
   * @param zoneId Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `LogpushJobsApi` client using external configuration
   */
  public static LogpushJobsApi newInstance(String crn, String dataset, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    LogpushJobsApi service = new LogpushJobsApi(crn, dataset, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `LogpushJobsApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full URL-encoded CRN of the service instance.
   * @param dataset The dataset.
   * @param zoneId Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public LogpushJobsApi(String crn, String dataset, String zoneId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setDataset(dataset);
    setZoneId(zoneId);
  }

  /**
   * Gets the crn.
   *
   * Full URL-encoded CRN of the service instance.
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
   * Gets the dataset.
   *
   * The dataset.
   *
   * @return the dataset
   */
  public String getDataset() {
    return this.dataset;
  }

  /**
   * Sets the dataset.
   *
   * @param dataset the new dataset
   */
  public void setDataset(final String dataset) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(dataset, "dataset cannot be empty.");
    this.dataset = dataset;
  }

  /**
   * Gets the zoneId.
   *
   * Zone identifier.
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
   * List logpush jobs.
   *
   * List configured logpush jobs for your domain.
   *
   * @param getLogpushJobsV2Options the {@link GetLogpushJobsV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListLogpushJobsResp}
   */
  public ServiceCall<ListLogpushJobsResp> getLogpushJobsV2(GetLogpushJobsV2Options getLogpushJobsV2Options) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "getLogpushJobsV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListLogpushJobsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLogpushJobsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List logpush jobs.
   *
   * List configured logpush jobs for your domain.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListLogpushJobsResp}
   */
  public ServiceCall<ListLogpushJobsResp> getLogpushJobsV2() {
    return getLogpushJobsV2(null);
  }

  /**
   * Create a logpush jobs.
   *
   * Create a new logpush job for the domain.
   *
   * @param createLogpushJobV2Options the {@link CreateLogpushJobV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> createLogpushJobV2(CreateLogpushJobV2Options createLogpushJobV2Options) {
    if (createLogpushJobV2Options == null) {
      createLogpushJobV2Options = new CreateLogpushJobV2Options.Builder().build();
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "createLogpushJobV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createLogpushJobV2Options.createLogpushJobV2Request() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createLogpushJobV2Options.createLogpushJobV2Request()), "application/json");
    }
    ResponseConverter<LogpushJobsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogpushJobsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a logpush jobs.
   *
   * Create a new logpush job for the domain.
   *
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> createLogpushJobV2() {
    return createLogpushJobV2(null);
  }

  /**
   * Get a logpush job.
   *
   * Get a logpush job  for a given zone.
   *
   * @param getLogpushJobV2Options the {@link GetLogpushJobV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> getLogpushJobV2(GetLogpushJobV2Options getLogpushJobV2Options) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLogpushJobV2Options,
      "getLogpushJobV2Options cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    pathParamsMap.put("job_id", getLogpushJobV2Options.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "getLogpushJobV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LogpushJobsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogpushJobsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a logpush job.
   *
   * Update an existing logpush job for a given zone.
   *
   * @param updateLogpushJobV2Options the {@link UpdateLogpushJobV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> updateLogpushJobV2(UpdateLogpushJobV2Options updateLogpushJobV2Options) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLogpushJobV2Options,
      "updateLogpushJobV2Options cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    pathParamsMap.put("job_id", updateLogpushJobV2Options.jobId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "updateLogpushJobV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateLogpushJobV2Options.updateLogpushJobV2Request() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateLogpushJobV2Options.updateLogpushJobV2Request()), "application/json");
    }
    ResponseConverter<LogpushJobsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogpushJobsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a logpush job.
   *
   * Delete a logpush job for a zone.
   *
   * @param deleteLogpushJobV2Options the {@link DeleteLogpushJobV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteLogpushJobResp}
   */
  public ServiceCall<DeleteLogpushJobResp> deleteLogpushJobV2(DeleteLogpushJobV2Options deleteLogpushJobV2Options) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLogpushJobV2Options,
      "deleteLogpushJobV2Options cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    pathParamsMap.put("job_id", deleteLogpushJobV2Options.jobId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "deleteLogpushJobV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteLogpushJobResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteLogpushJobResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a new ownership challenge sent to your destination.
   *
   * Get a new ownership challenge.
   *
   * @param getLogpushOwnershipV2Options the {@link GetLogpushOwnershipV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OwnershipChallengeResp}
   */
  public ServiceCall<OwnershipChallengeResp> getLogpushOwnershipV2(GetLogpushOwnershipV2Options getLogpushOwnershipV2Options) {
    boolean skipBody = false;
    if (getLogpushOwnershipV2Options == null) {
      getLogpushOwnershipV2Options = new GetLogpushOwnershipV2Options.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/ownership", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "getLogpushOwnershipV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (getLogpushOwnershipV2Options.cos() != null) {
        contentJson.add("cos", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getLogpushOwnershipV2Options.cos()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<OwnershipChallengeResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OwnershipChallengeResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a new ownership challenge sent to your destination.
   *
   * Get a new ownership challenge.
   *
   * @return a {@link ServiceCall} with a result of type {@link OwnershipChallengeResp}
   */
  public ServiceCall<OwnershipChallengeResp> getLogpushOwnershipV2() {
    return getLogpushOwnershipV2(null);
  }

  /**
   * Validate ownership challenge of the destination.
   *
   * Validate ownership challenge of the destination.
   *
   * @param validateLogpushOwnershipChallengeV2Options the {@link ValidateLogpushOwnershipChallengeV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OwnershipChallengeValidateResult}
   */
  public ServiceCall<OwnershipChallengeValidateResult> validateLogpushOwnershipChallengeV2(ValidateLogpushOwnershipChallengeV2Options validateLogpushOwnershipChallengeV2Options) {
    boolean skipBody = false;
    if (validateLogpushOwnershipChallengeV2Options == null) {
      validateLogpushOwnershipChallengeV2Options = new ValidateLogpushOwnershipChallengeV2Options.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/ownership/validate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "validateLogpushOwnershipChallengeV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (validateLogpushOwnershipChallengeV2Options.cos() != null) {
        contentJson.add("cos", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateLogpushOwnershipChallengeV2Options.cos()));
      }
      if (validateLogpushOwnershipChallengeV2Options.ownershipChallenge() != null) {
        contentJson.addProperty("ownership_challenge", validateLogpushOwnershipChallengeV2Options.ownershipChallenge());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<OwnershipChallengeValidateResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OwnershipChallengeValidateResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Validate ownership challenge of the destination.
   *
   * Validate ownership challenge of the destination.
   *
   * @return a {@link ServiceCall} with a result of type {@link OwnershipChallengeValidateResult}
   */
  public ServiceCall<OwnershipChallengeValidateResult> validateLogpushOwnershipChallengeV2() {
    return validateLogpushOwnershipChallengeV2(null);
  }

  /**
   * The list of all fields available for a dataset.
   *
   * The list of all fields available for a dataset.
   *
   * @param listFieldsForDatasetV2Options the {@link ListFieldsForDatasetV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListFieldsResp}
   */
  public ServiceCall<ListFieldsResp> listFieldsForDatasetV2(ListFieldsForDatasetV2Options listFieldsForDatasetV2Options) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    pathParamsMap.put("dataset", this.dataset);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/datasets/{dataset}/fields", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "listFieldsForDatasetV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListFieldsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListFieldsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * The list of all fields available for a dataset.
   *
   * The list of all fields available for a dataset.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListFieldsResp}
   */
  public ServiceCall<ListFieldsResp> listFieldsForDatasetV2() {
    return listFieldsForDatasetV2(null);
  }

  /**
   * List logpush jobs for dataset.
   *
   * List configured logpush jobs for a dataset.
   *
   * @param listLogpushJobsForDatasetV2Options the {@link ListLogpushJobsForDatasetV2Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> listLogpushJobsForDatasetV2(ListLogpushJobsForDatasetV2Options listLogpushJobsForDatasetV2Options) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    pathParamsMap.put("dataset", this.dataset);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/{crn}/zones/{zone_id}/logpush/datasets/{dataset}/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "listLogpushJobsForDatasetV2");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LogpushJobsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogpushJobsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List logpush jobs for dataset.
   *
   * List configured logpush jobs for a dataset.
   *
   * @return a {@link ServiceCall} with a result of type {@link LogpushJobsResp}
   */
  public ServiceCall<LogpushJobsResp> listLogpushJobsForDatasetV2() {
    return listLogpushJobsForDatasetV2(null);
  }

  /**
   * Get log retention.
   *
   * Get log retention setting for Logpull/Logpush on your domain.
   *
   * @param getLogsRetentionOptions the {@link GetLogsRetentionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogRetentionResp}
   */
  public ServiceCall<LogRetentionResp> getLogsRetention(GetLogsRetentionOptions getLogsRetentionOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/logs/retention", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "getLogsRetention");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LogRetentionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogRetentionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get log retention.
   *
   * Get log retention setting for Logpull/Logpush on your domain.
   *
   * @return a {@link ServiceCall} with a result of type {@link LogRetentionResp}
   */
  public ServiceCall<LogRetentionResp> getLogsRetention() {
    return getLogsRetention(null);
  }

  /**
   * Update log retention.
   *
   * Update log retention flag for Logpull/Logpush.
   *
   * @param createLogRetentionOptions the {@link CreateLogRetentionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogRetentionResp}
   */
  public ServiceCall<LogRetentionResp> createLogRetention(CreateLogRetentionOptions createLogRetentionOptions) {
    boolean skipBody = false;
    if (createLogRetentionOptions == null) {
      createLogRetentionOptions = new CreateLogRetentionOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("zone_id", this.zoneId);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/zones/{zone_id}/logs/retention", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("logpush_jobs_api", "v1", "createLogRetention");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createLogRetentionOptions.flag() != null) {
        contentJson.addProperty("flag", createLogRetentionOptions.flag());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<LogRetentionResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogRetentionResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update log retention.
   *
   * Update log retention flag for Logpull/Logpush.
   *
   * @return a {@link ServiceCall} with a result of type {@link LogRetentionResp}
   */
  public ServiceCall<LogRetentionResp> createLogRetention() {
    return createLogRetention(null);
  }

}
