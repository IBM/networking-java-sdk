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

package com.ibm.cloud.networking.global_load_balancer_monitor.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.CreateLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.DeleteMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.EditLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.GetLoadBalancerMonitorOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListAllLoadBalancerMonitorsOptions;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.ListMonitorResp;
import com.ibm.cloud.networking.global_load_balancer_monitor.v1.model.MonitorResp;
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
 * Global Load Balancer Monitor.
 *
 * @version v1
 */
public class GlobalLoadBalancerMonitor extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "global_load_balancer_monitor";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `GlobalLoadBalancerMonitor` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @return an instance of the `GlobalLoadBalancerMonitor` client using external configuration
   */
  public static GlobalLoadBalancerMonitor newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `GlobalLoadBalancerMonitor` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `GlobalLoadBalancerMonitor` client using external configuration
   */
  public static GlobalLoadBalancerMonitor newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    GlobalLoadBalancerMonitor service = new GlobalLoadBalancerMonitor(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `GlobalLoadBalancerMonitor` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public GlobalLoadBalancerMonitor(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
  }

  /**
   * Gets the crn.
   *
   * Full CRN of the service instance.
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
   * List all load balancer monitors.
   *
   * List configured load balancer monitors for a user.
   *
   * @param listAllLoadBalancerMonitorsOptions the {@link ListAllLoadBalancerMonitorsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListMonitorResp}
   */
  public ServiceCall<ListMonitorResp> listAllLoadBalancerMonitors(ListAllLoadBalancerMonitorsOptions listAllLoadBalancerMonitorsOptions) {
    String[] pathSegments = { "v1", "load_balancers/monitors" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_monitor", "v1", "listAllLoadBalancerMonitors");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListMonitorResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListMonitorResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all load balancer monitors.
   *
   * List configured load balancer monitors for a user.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListMonitorResp}
   */
  public ServiceCall<ListMonitorResp> listAllLoadBalancerMonitors() {
    return listAllLoadBalancerMonitors(null);
  }

  /**
   * Create load balancer monitor.
   *
   * Create a load balancer monitor for a given service instance.
   *
   * @param createLoadBalancerMonitorOptions the {@link CreateLoadBalancerMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MonitorResp}
   */
  public ServiceCall<MonitorResp> createLoadBalancerMonitor(CreateLoadBalancerMonitorOptions createLoadBalancerMonitorOptions) {
    boolean skipBody = false;
    if (createLoadBalancerMonitorOptions == null) {
      createLoadBalancerMonitorOptions = new CreateLoadBalancerMonitorOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "load_balancers/monitors" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_monitor", "v1", "createLoadBalancerMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createLoadBalancerMonitorOptions.type() != null) {
        contentJson.addProperty("type", createLoadBalancerMonitorOptions.type());
      }
      if (createLoadBalancerMonitorOptions.description() != null) {
        contentJson.addProperty("description", createLoadBalancerMonitorOptions.description());
      }
      if (createLoadBalancerMonitorOptions.method() != null) {
        contentJson.addProperty("method", createLoadBalancerMonitorOptions.method());
      }
      if (createLoadBalancerMonitorOptions.port() != null) {
        contentJson.addProperty("port", createLoadBalancerMonitorOptions.port());
      }
      if (createLoadBalancerMonitorOptions.path() != null) {
        contentJson.addProperty("path", createLoadBalancerMonitorOptions.path());
      }
      if (createLoadBalancerMonitorOptions.timeout() != null) {
        contentJson.addProperty("timeout", createLoadBalancerMonitorOptions.timeout());
      }
      if (createLoadBalancerMonitorOptions.retries() != null) {
        contentJson.addProperty("retries", createLoadBalancerMonitorOptions.retries());
      }
      if (createLoadBalancerMonitorOptions.interval() != null) {
        contentJson.addProperty("interval", createLoadBalancerMonitorOptions.interval());
      }
      if (createLoadBalancerMonitorOptions.expectedCodes() != null) {
        contentJson.addProperty("expected_codes", createLoadBalancerMonitorOptions.expectedCodes());
      }
      if (createLoadBalancerMonitorOptions.followRedirects() != null) {
        contentJson.addProperty("follow_redirects", createLoadBalancerMonitorOptions.followRedirects());
      }
      if (createLoadBalancerMonitorOptions.expectedBody() != null) {
        contentJson.addProperty("expected_body", createLoadBalancerMonitorOptions.expectedBody());
      }
      if (createLoadBalancerMonitorOptions.allowInsecure() != null) {
        contentJson.addProperty("allow_insecure", createLoadBalancerMonitorOptions.allowInsecure());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<MonitorResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MonitorResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create load balancer monitor.
   *
   * Create a load balancer monitor for a given service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link MonitorResp}
   */
  public ServiceCall<MonitorResp> createLoadBalancerMonitor() {
    return createLoadBalancerMonitor(null);
  }

  /**
   * Edit load balancer monitor.
   *
   * Edit porperties of an existing load balancer monitor.
   *
   * @param editLoadBalancerMonitorOptions the {@link EditLoadBalancerMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MonitorResp}
   */
  public ServiceCall<MonitorResp> editLoadBalancerMonitor(EditLoadBalancerMonitorOptions editLoadBalancerMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editLoadBalancerMonitorOptions,
      "editLoadBalancerMonitorOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/monitors" };
    String[] pathParameters = { this.crn, editLoadBalancerMonitorOptions.monitorIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_monitor", "v1", "editLoadBalancerMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editLoadBalancerMonitorOptions.type() != null) {
      contentJson.addProperty("type", editLoadBalancerMonitorOptions.type());
    }
    if (editLoadBalancerMonitorOptions.description() != null) {
      contentJson.addProperty("description", editLoadBalancerMonitorOptions.description());
    }
    if (editLoadBalancerMonitorOptions.method() != null) {
      contentJson.addProperty("method", editLoadBalancerMonitorOptions.method());
    }
    if (editLoadBalancerMonitorOptions.port() != null) {
      contentJson.addProperty("port", editLoadBalancerMonitorOptions.port());
    }
    if (editLoadBalancerMonitorOptions.path() != null) {
      contentJson.addProperty("path", editLoadBalancerMonitorOptions.path());
    }
    if (editLoadBalancerMonitorOptions.timeout() != null) {
      contentJson.addProperty("timeout", editLoadBalancerMonitorOptions.timeout());
    }
    if (editLoadBalancerMonitorOptions.retries() != null) {
      contentJson.addProperty("retries", editLoadBalancerMonitorOptions.retries());
    }
    if (editLoadBalancerMonitorOptions.interval() != null) {
      contentJson.addProperty("interval", editLoadBalancerMonitorOptions.interval());
    }
    if (editLoadBalancerMonitorOptions.expectedCodes() != null) {
      contentJson.addProperty("expected_codes", editLoadBalancerMonitorOptions.expectedCodes());
    }
    if (editLoadBalancerMonitorOptions.followRedirects() != null) {
      contentJson.addProperty("follow_redirects", editLoadBalancerMonitorOptions.followRedirects());
    }
    if (editLoadBalancerMonitorOptions.expectedBody() != null) {
      contentJson.addProperty("expected_body", editLoadBalancerMonitorOptions.expectedBody());
    }
    if (editLoadBalancerMonitorOptions.allowInsecure() != null) {
      contentJson.addProperty("allow_insecure", editLoadBalancerMonitorOptions.allowInsecure());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MonitorResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MonitorResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete load balancer monitor.
   *
   * Delete a load balancer monitor.
   *
   * @param deleteLoadBalancerMonitorOptions the {@link DeleteLoadBalancerMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteMonitorResp}
   */
  public ServiceCall<DeleteMonitorResp> deleteLoadBalancerMonitor(DeleteLoadBalancerMonitorOptions deleteLoadBalancerMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerMonitorOptions,
      "deleteLoadBalancerMonitorOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/monitors" };
    String[] pathParameters = { this.crn, deleteLoadBalancerMonitorOptions.monitorIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_monitor", "v1", "deleteLoadBalancerMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteMonitorResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteMonitorResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get load balancer monitor.
   *
   * For a given service instance and load balancer monitor id, get the monitor details.
   *
   * @param getLoadBalancerMonitorOptions the {@link GetLoadBalancerMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MonitorResp}
   */
  public ServiceCall<MonitorResp> getLoadBalancerMonitor(GetLoadBalancerMonitorOptions getLoadBalancerMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerMonitorOptions,
      "getLoadBalancerMonitorOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/monitors" };
    String[] pathParameters = { this.crn, getLoadBalancerMonitorOptions.monitorIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_monitor", "v1", "getLoadBalancerMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<MonitorResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MonitorResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
