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

package com.ibm.cloud.networking.webhooks.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.webhooks.v1.model.CreateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.DeleteWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.GetAlertWebhookResp;
import com.ibm.cloud.networking.webhooks.v1.model.GetWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.ListAlertWebhooksResp;
import com.ibm.cloud.networking.webhooks.v1.model.ListWebhooksOptions;
import com.ibm.cloud.networking.webhooks.v1.model.UpdateAlertWebhookOptions;
import com.ibm.cloud.networking.webhooks.v1.model.WebhookSuccessResp;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * CIS Alert Webhooks.
 *
 * API Version: 1.0.0
 */
public class Webhooks extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "webhooks";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `Webhooks` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @return an instance of the `Webhooks` client using external configuration
   */
  public static Webhooks newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Webhooks` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Webhooks` client using external configuration
   */
  public static Webhooks newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Webhooks service = new Webhooks(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Webhooks` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Webhooks(String crn, String serviceName, Authenticator authenticator) {
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
   * List alert webhooks.
   *
   * List configured alert webhooks for the CIS instance.
   *
   * @param listWebhooksOptions the {@link ListWebhooksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListAlertWebhooksResp}
   */
  public ServiceCall<ListAlertWebhooksResp> listWebhooks(ListWebhooksOptions listWebhooksOptions) {
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/destinations/webhooks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("webhooks", "v1", "listWebhooks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListAlertWebhooksResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListAlertWebhooksResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List alert webhooks.
   *
   * List configured alert webhooks for the CIS instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListAlertWebhooksResp}
   */
  public ServiceCall<ListAlertWebhooksResp> listWebhooks() {
    return listWebhooks(null);
  }

  /**
   * Create an alert webhook.
   *
   * Create a new alert webhook for the CIS instance.
   *
   * @param createAlertWebhookOptions the {@link CreateAlertWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebhookSuccessResp}
   */
  public ServiceCall<WebhookSuccessResp> createAlertWebhook(CreateAlertWebhookOptions createAlertWebhookOptions) {
    boolean skipBody = false;
    if (createAlertWebhookOptions == null) {
      createAlertWebhookOptions = new CreateAlertWebhookOptions.Builder().build();
      skipBody = true;
    }
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/destinations/webhooks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("webhooks", "v1", "createAlertWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createAlertWebhookOptions.name() != null) {
        contentJson.addProperty("name", createAlertWebhookOptions.name());
      }
      if (createAlertWebhookOptions.url() != null) {
        contentJson.addProperty("url", createAlertWebhookOptions.url());
      }
      if (createAlertWebhookOptions.secret() != null) {
        contentJson.addProperty("secret", createAlertWebhookOptions.secret());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<WebhookSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebhookSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an alert webhook.
   *
   * Create a new alert webhook for the CIS instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link WebhookSuccessResp}
   */
  public ServiceCall<WebhookSuccessResp> createAlertWebhook() {
    return createAlertWebhook(null);
  }

  /**
   * Get an alert webhook.
   *
   * Get an alert webhook for the CIS instance.
   *
   * @param getWebhookOptions the {@link GetWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetAlertWebhookResp}
   */
  public ServiceCall<GetAlertWebhookResp> getWebhook(GetWebhookOptions getWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWebhookOptions,
      "getWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("webhook_id", getWebhookOptions.webhookId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/destinations/webhooks/{webhook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("webhooks", "v1", "getWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<GetAlertWebhookResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetAlertWebhookResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an alert webhook.
   *
   * Update an existing alert webhook for the CIS instance.
   *
   * @param updateAlertWebhookOptions the {@link UpdateAlertWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebhookSuccessResp}
   */
  public ServiceCall<WebhookSuccessResp> updateAlertWebhook(UpdateAlertWebhookOptions updateAlertWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAlertWebhookOptions,
      "updateAlertWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("webhook_id", updateAlertWebhookOptions.webhookId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/destinations/webhooks/{webhook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("webhooks", "v1", "updateAlertWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateAlertWebhookOptions.name() != null) {
      contentJson.addProperty("name", updateAlertWebhookOptions.name());
    }
    if (updateAlertWebhookOptions.url() != null) {
      contentJson.addProperty("url", updateAlertWebhookOptions.url());
    }
    if (updateAlertWebhookOptions.secret() != null) {
      contentJson.addProperty("secret", updateAlertWebhookOptions.secret());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WebhookSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebhookSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an alert webhook.
   *
   * Delete an alert webhook for the CIS instance.
   *
   * @param deleteWebhookOptions the {@link DeleteWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebhookSuccessResp}
   */
  public ServiceCall<WebhookSuccessResp> deleteWebhook(DeleteWebhookOptions deleteWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWebhookOptions,
      "deleteWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("crn", this.crn);
    pathParamsMap.put("webhook_id", deleteWebhookOptions.webhookId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/{crn}/alerting/destinations/webhooks/{webhook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("webhooks", "v1", "deleteWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WebhookSuccessResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebhookSuccessResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}