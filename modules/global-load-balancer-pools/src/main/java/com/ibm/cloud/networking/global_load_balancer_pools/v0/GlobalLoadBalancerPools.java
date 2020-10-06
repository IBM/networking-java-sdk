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

package com.ibm.cloud.networking.global_load_balancer_pools.v0;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.DeleteLoadBalancerPoolResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.EditLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.GetLoadBalancerPoolOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListAllLoadBalancerPoolsOptions;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.ListLoadBalancerPoolsResp;
import com.ibm.cloud.networking.global_load_balancer_pools.v0.model.LoadBalancerPoolResp;
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
 * GLB Pools.
 *
 * @version v0
 */
public class GlobalLoadBalancerPools extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "global_load_balancer_pools";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `GlobalLoadBalancerPools` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @return an instance of the `GlobalLoadBalancerPools` client using external configuration
   */
  public static GlobalLoadBalancerPools newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `GlobalLoadBalancerPools` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `GlobalLoadBalancerPools` client using external configuration
   */
  public static GlobalLoadBalancerPools newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    GlobalLoadBalancerPools service = new GlobalLoadBalancerPools(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `GlobalLoadBalancerPools` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public GlobalLoadBalancerPools(String crn, String serviceName, Authenticator authenticator) {
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
   * List all pools.
   *
   * List all configured load balancer pools.
   *
   * @param listAllLoadBalancerPoolsOptions the {@link ListAllLoadBalancerPoolsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListLoadBalancerPoolsResp}
   */
  public ServiceCall<ListLoadBalancerPoolsResp> listAllLoadBalancerPools(ListAllLoadBalancerPoolsOptions listAllLoadBalancerPoolsOptions) {
    String[] pathSegments = { "v1", "load_balancers/pools" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_pools", "v0", "listAllLoadBalancerPools");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListLoadBalancerPoolsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLoadBalancerPoolsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all pools.
   *
   * List all configured load balancer pools.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListLoadBalancerPoolsResp}
   */
  public ServiceCall<ListLoadBalancerPoolsResp> listAllLoadBalancerPools() {
    return listAllLoadBalancerPools(null);
  }

  /**
   * Create pool.
   *
   * Create a new load balancer pool.
   *
   * @param createLoadBalancerPoolOptions the {@link CreateLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolResp}
   */
  public ServiceCall<LoadBalancerPoolResp> createLoadBalancerPool(CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions) {
    boolean skipBody = false;
    if (createLoadBalancerPoolOptions == null) {
      createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "load_balancers/pools" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_pools", "v0", "createLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createLoadBalancerPoolOptions.name() != null) {
        contentJson.addProperty("name", createLoadBalancerPoolOptions.name());
      }
      if (createLoadBalancerPoolOptions.checkRegions() != null) {
        contentJson.add("check_regions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.checkRegions()));
      }
      if (createLoadBalancerPoolOptions.origins() != null) {
        contentJson.add("origins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerPoolOptions.origins()));
      }
      if (createLoadBalancerPoolOptions.description() != null) {
        contentJson.addProperty("description", createLoadBalancerPoolOptions.description());
      }
      if (createLoadBalancerPoolOptions.minimumOrigins() != null) {
        contentJson.addProperty("minimum_origins", createLoadBalancerPoolOptions.minimumOrigins());
      }
      if (createLoadBalancerPoolOptions.enabled() != null) {
        contentJson.addProperty("enabled", createLoadBalancerPoolOptions.enabled());
      }
      if (createLoadBalancerPoolOptions.monitor() != null) {
        contentJson.addProperty("monitor", createLoadBalancerPoolOptions.monitor());
      }
      if (createLoadBalancerPoolOptions.notificationEmail() != null) {
        contentJson.addProperty("notification_email", createLoadBalancerPoolOptions.notificationEmail());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<LoadBalancerPoolResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create pool.
   *
   * Create a new load balancer pool.
   *
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolResp}
   */
  public ServiceCall<LoadBalancerPoolResp> createLoadBalancerPool() {
    return createLoadBalancerPool(null);
  }

  /**
   * Get pool.
   *
   * Get a single configured load balancer pool.
   *
   * @param getLoadBalancerPoolOptions the {@link GetLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolResp}
   */
  public ServiceCall<LoadBalancerPoolResp> getLoadBalancerPool(GetLoadBalancerPoolOptions getLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerPoolOptions,
      "getLoadBalancerPoolOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/pools" };
    String[] pathParameters = { this.crn, getLoadBalancerPoolOptions.poolIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_pools", "v0", "getLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LoadBalancerPoolResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete pool.
   *
   * Delete a specific configured load balancer pool.
   *
   * @param deleteLoadBalancerPoolOptions the {@link DeleteLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteLoadBalancerPoolResp}
   */
  public ServiceCall<DeleteLoadBalancerPoolResp> deleteLoadBalancerPool(DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerPoolOptions,
      "deleteLoadBalancerPoolOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/pools" };
    String[] pathParameters = { this.crn, deleteLoadBalancerPoolOptions.poolIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_pools", "v0", "deleteLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteLoadBalancerPoolResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteLoadBalancerPoolResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Edit pool.
   *
   * Edit a specific configured load balancer pool.
   *
   * @param editLoadBalancerPoolOptions the {@link EditLoadBalancerPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancerPoolResp}
   */
  public ServiceCall<LoadBalancerPoolResp> editLoadBalancerPool(EditLoadBalancerPoolOptions editLoadBalancerPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editLoadBalancerPoolOptions,
      "editLoadBalancerPoolOptions cannot be null");
    String[] pathSegments = { "v1", "load_balancers/pools" };
    String[] pathParameters = { this.crn, editLoadBalancerPoolOptions.poolIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_pools", "v0", "editLoadBalancerPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editLoadBalancerPoolOptions.name() != null) {
      contentJson.addProperty("name", editLoadBalancerPoolOptions.name());
    }
    if (editLoadBalancerPoolOptions.checkRegions() != null) {
      contentJson.add("check_regions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editLoadBalancerPoolOptions.checkRegions()));
    }
    if (editLoadBalancerPoolOptions.origins() != null) {
      contentJson.add("origins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editLoadBalancerPoolOptions.origins()));
    }
    if (editLoadBalancerPoolOptions.description() != null) {
      contentJson.addProperty("description", editLoadBalancerPoolOptions.description());
    }
    if (editLoadBalancerPoolOptions.minimumOrigins() != null) {
      contentJson.addProperty("minimum_origins", editLoadBalancerPoolOptions.minimumOrigins());
    }
    if (editLoadBalancerPoolOptions.enabled() != null) {
      contentJson.addProperty("enabled", editLoadBalancerPoolOptions.enabled());
    }
    if (editLoadBalancerPoolOptions.monitor() != null) {
      contentJson.addProperty("monitor", editLoadBalancerPoolOptions.monitor());
    }
    if (editLoadBalancerPoolOptions.notificationEmail() != null) {
      contentJson.addProperty("notification_email", editLoadBalancerPoolOptions.notificationEmail());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancerPoolResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancerPoolResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
