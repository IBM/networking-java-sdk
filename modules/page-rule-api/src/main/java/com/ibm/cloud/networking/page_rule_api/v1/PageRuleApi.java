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
package com.ibm.cloud.networking.page_rule_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.page_rule_api.v1.model.ChangePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.CreatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.DeletePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.GetPageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.ListPageRulesOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesDeleteResponse;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseListAll;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseWithoutResultInfo;
import com.ibm.cloud.networking.page_rule_api.v1.model.UpdatePageRuleOptions;
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
 * This document describes CIS Pagerule API.
 *
 * @version v1
 */
public class PageRuleApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "page_rule_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `PageRuleApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn instance id.
   * @param zoneId zone id.
   * @return an instance of the `PageRuleApi` client using external configuration
   */
  public static PageRuleApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `PageRuleApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn instance id.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `PageRuleApi` client using external configuration
   */
  public static PageRuleApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    PageRuleApi service = new PageRuleApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `PageRuleApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn instance id.
   * @param zoneId zone id.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public PageRuleApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneId(zoneId);
  }

  /**
   * Gets the crn.
   *
   * instance id.
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
   * Gets the zoneId.
   *
   * zone id.
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
   * Get page rule.
   *
   * Get a page rule details.
   *
   * @param getPageRuleOptions the {@link GetPageRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseWithoutResultInfo}
   */
  public ServiceCall<PageRulesResponseWithoutResultInfo> getPageRule(GetPageRuleOptions getPageRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPageRuleOptions,
      "getPageRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId, getPageRuleOptions.ruleId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "getPageRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");

    ResponseConverter<PageRulesResponseWithoutResultInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesResponseWithoutResultInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change page rule.
   *
   * Change a page rule.
   *
   * @param changePageRuleOptions the {@link ChangePageRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseWithoutResultInfo}
   */
  public ServiceCall<PageRulesResponseWithoutResultInfo> changePageRule(ChangePageRuleOptions changePageRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(changePageRuleOptions,
      "changePageRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId, changePageRuleOptions.ruleId() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "changePageRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (changePageRuleOptions.targets() != null) {
      contentJson.add("targets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(changePageRuleOptions.targets()));
    }
    if (changePageRuleOptions.actions() != null) {
      contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(changePageRuleOptions.actions()));
    }
    if (changePageRuleOptions.priority() != null) {
      contentJson.addProperty("priority", changePageRuleOptions.priority());
    }
    if (changePageRuleOptions.status() != null) {
      contentJson.addProperty("status", changePageRuleOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PageRulesResponseWithoutResultInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesResponseWithoutResultInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update page rule.
   *
   * Replace a page rule. The final rule will exactly match the data passed with this request.
   *
   * @param updatePageRuleOptions the {@link UpdatePageRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseWithoutResultInfo}
   */
  public ServiceCall<PageRulesResponseWithoutResultInfo> updatePageRule(UpdatePageRuleOptions updatePageRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePageRuleOptions,
      "updatePageRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId, updatePageRuleOptions.ruleId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "updatePageRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updatePageRuleOptions.targets() != null) {
      contentJson.add("targets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePageRuleOptions.targets()));
    }
    if (updatePageRuleOptions.actions() != null) {
      contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePageRuleOptions.actions()));
    }
    if (updatePageRuleOptions.priority() != null) {
      contentJson.addProperty("priority", updatePageRuleOptions.priority());
    }
    if (updatePageRuleOptions.status() != null) {
      contentJson.addProperty("status", updatePageRuleOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PageRulesResponseWithoutResultInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesResponseWithoutResultInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete page rule.
   *
   * Delete a page rule.
   *
   * @param deletePageRuleOptions the {@link DeletePageRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesDeleteResponse}
   */
  public ServiceCall<PageRulesDeleteResponse> deletePageRule(DeletePageRuleOptions deletePageRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePageRuleOptions,
      "deletePageRuleOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId, deletePageRuleOptions.ruleId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "deletePageRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");

    ResponseConverter<PageRulesDeleteResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesDeleteResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List page rules.
   *
   * List page rules.
   *
   * @param listPageRulesOptions the {@link ListPageRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseListAll}
   */
  public ServiceCall<PageRulesResponseListAll> listPageRules(ListPageRulesOptions listPageRulesOptions) {
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "listPageRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPageRulesOptions != null) {
      if (listPageRulesOptions.status() != null) {
        builder.query("status", listPageRulesOptions.status());
      }
      if (listPageRulesOptions.order() != null) {
        builder.query("order", listPageRulesOptions.order());
      }
      if (listPageRulesOptions.direction() != null) {
        builder.query("direction", listPageRulesOptions.direction());
      }
      if (listPageRulesOptions.match() != null) {
        builder.query("match", listPageRulesOptions.match());
      }
    }
    ResponseConverter<PageRulesResponseListAll> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesResponseListAll>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List page rules.
   *
   * List page rules.
   *
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseListAll}
   */
  public ServiceCall<PageRulesResponseListAll> listPageRules() {
    return listPageRules(null);
  }

  /**
   * Create page rule.
   *
   * Create a page rule.
   *
   * @param createPageRuleOptions the {@link CreatePageRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseWithoutResultInfo}
   */
  public ServiceCall<PageRulesResponseWithoutResultInfo> createPageRule(CreatePageRuleOptions createPageRuleOptions) {
    String[] pathSegments = { "v1", "zones", "pagerules" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("page_rule_api", "v1", "createPageRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPageRuleOptions != null) {
      final JsonObject contentJson = new JsonObject();
      if (createPageRuleOptions.targets() != null) {
        contentJson.add("targets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPageRuleOptions.targets()));
      }
      if (createPageRuleOptions.actions() != null) {
        contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPageRuleOptions.actions()));
      }
      if (createPageRuleOptions.priority() != null) {
        contentJson.addProperty("priority", createPageRuleOptions.priority());
      }
      if (createPageRuleOptions.status() != null) {
        contentJson.addProperty("status", createPageRuleOptions.status());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<PageRulesResponseWithoutResultInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PageRulesResponseWithoutResultInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create page rule.
   *
   * Create a page rule.
   *
   * @return a {@link ServiceCall} with a result of type {@link PageRulesResponseWithoutResultInfo}
   */
  public ServiceCall<PageRulesResponseWithoutResultInfo> createPageRule() {
    return createPageRule(null);
  }

}
