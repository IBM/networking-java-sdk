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

package com.ibm.cloud.networking.global_load_balancer.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.global_load_balancer.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.DeleteLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.EditLoadBalancerOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.GetLoadBalancerSettingsOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListAllLoadBalancersOptions;
import com.ibm.cloud.networking.global_load_balancer.v1.model.ListLoadBalancersResp;
import com.ibm.cloud.networking.global_load_balancer.v1.model.LoadBalancersResp;
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
 * Global Load Balancer.
 *
 * @version v1
 */
public class GlobalLoadBalancer extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "global_load_balancer";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `GlobalLoadBalancer` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @return an instance of the `GlobalLoadBalancer` client using external configuration
   */
  public static GlobalLoadBalancer newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `GlobalLoadBalancer` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `GlobalLoadBalancer` client using external configuration
   */
  public static GlobalLoadBalancer newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    GlobalLoadBalancer service = new GlobalLoadBalancer(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `GlobalLoadBalancer` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full CRN of the service instance.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public GlobalLoadBalancer(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
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
   * List all load balancers.
   *
   * List configured load balancers.
   *
   * @param listAllLoadBalancersOptions the {@link ListAllLoadBalancersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListLoadBalancersResp}
   */
  public ServiceCall<ListLoadBalancersResp> listAllLoadBalancers(ListAllLoadBalancersOptions listAllLoadBalancersOptions) {
    String[] pathSegments = { "v1", "zones", "load_balancers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer", "v1", "listAllLoadBalancers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListLoadBalancersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLoadBalancersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all load balancers.
   *
   * List configured load balancers.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListLoadBalancersResp}
   */
  public ServiceCall<ListLoadBalancersResp> listAllLoadBalancers() {
    return listAllLoadBalancers(null);
  }

  /**
   * Create load balancer.
   *
   * Create a load balancer for a given zone. The zone should be active before placing an order of a load balancer.
   *
   * @param createLoadBalancerOptions the {@link CreateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancersResp}
   */
  public ServiceCall<LoadBalancersResp> createLoadBalancer(CreateLoadBalancerOptions createLoadBalancerOptions) {
    boolean skipBody = false;
    if (createLoadBalancerOptions == null) {
      createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "load_balancers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer", "v1", "createLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createLoadBalancerOptions.name() != null) {
        contentJson.addProperty("name", createLoadBalancerOptions.name());
      }
      if (createLoadBalancerOptions.fallbackPool() != null) {
        contentJson.addProperty("fallback_pool", createLoadBalancerOptions.fallbackPool());
      }
      if (createLoadBalancerOptions.defaultPools() != null) {
        contentJson.add("default_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.defaultPools()));
      }
      if (createLoadBalancerOptions.description() != null) {
        contentJson.addProperty("description", createLoadBalancerOptions.description());
      }
      if (createLoadBalancerOptions.ttl() != null) {
        contentJson.addProperty("ttl", createLoadBalancerOptions.ttl());
      }
      if (createLoadBalancerOptions.regionPools() != null) {
        contentJson.add("region_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.regionPools()));
      }
      if (createLoadBalancerOptions.popPools() != null) {
        contentJson.add("pop_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.popPools()));
      }
      if (createLoadBalancerOptions.proxied() != null) {
        contentJson.addProperty("proxied", createLoadBalancerOptions.proxied());
      }
      if (createLoadBalancerOptions.enabled() != null) {
        contentJson.addProperty("enabled", createLoadBalancerOptions.enabled());
      }
      if (createLoadBalancerOptions.sessionAffinity() != null) {
        contentJson.addProperty("session_affinity", createLoadBalancerOptions.sessionAffinity());
      }
      if (createLoadBalancerOptions.steeringPolicy() != null) {
        contentJson.addProperty("steering_policy", createLoadBalancerOptions.steeringPolicy());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<LoadBalancersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create load balancer.
   *
   * Create a load balancer for a given zone. The zone should be active before placing an order of a load balancer.
   *
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancersResp}
   */
  public ServiceCall<LoadBalancersResp> createLoadBalancer() {
    return createLoadBalancer(null);
  }

  /**
   * Edit load balancer.
   *
   * Edit porperties of an existing load balancer.
   *
   * @param editLoadBalancerOptions the {@link EditLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancersResp}
   */
  public ServiceCall<LoadBalancersResp> editLoadBalancer(EditLoadBalancerOptions editLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(editLoadBalancerOptions,
      "editLoadBalancerOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "load_balancers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, editLoadBalancerOptions.loadBalancerIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer", "v1", "editLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (editLoadBalancerOptions.name() != null) {
      contentJson.addProperty("name", editLoadBalancerOptions.name());
    }
    if (editLoadBalancerOptions.fallbackPool() != null) {
      contentJson.addProperty("fallback_pool", editLoadBalancerOptions.fallbackPool());
    }
    if (editLoadBalancerOptions.defaultPools() != null) {
      contentJson.add("default_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editLoadBalancerOptions.defaultPools()));
    }
    if (editLoadBalancerOptions.description() != null) {
      contentJson.addProperty("description", editLoadBalancerOptions.description());
    }
    if (editLoadBalancerOptions.ttl() != null) {
      contentJson.addProperty("ttl", editLoadBalancerOptions.ttl());
    }
    if (editLoadBalancerOptions.regionPools() != null) {
      contentJson.add("region_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editLoadBalancerOptions.regionPools()));
    }
    if (editLoadBalancerOptions.popPools() != null) {
      contentJson.add("pop_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(editLoadBalancerOptions.popPools()));
    }
    if (editLoadBalancerOptions.proxied() != null) {
      contentJson.addProperty("proxied", editLoadBalancerOptions.proxied());
    }
    if (editLoadBalancerOptions.enabled() != null) {
      contentJson.addProperty("enabled", editLoadBalancerOptions.enabled());
    }
    if (editLoadBalancerOptions.sessionAffinity() != null) {
      contentJson.addProperty("session_affinity", editLoadBalancerOptions.sessionAffinity());
    }
    if (editLoadBalancerOptions.steeringPolicy() != null) {
      contentJson.addProperty("steering_policy", editLoadBalancerOptions.steeringPolicy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete load balancer.
   *
   * Delete a load balancer.
   *
   * @param deleteLoadBalancerOptions the {@link DeleteLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteLoadBalancersResp}
   */
  public ServiceCall<DeleteLoadBalancersResp> deleteLoadBalancer(DeleteLoadBalancerOptions deleteLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerOptions,
      "deleteLoadBalancerOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "load_balancers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteLoadBalancerOptions.loadBalancerIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer", "v1", "deleteLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteLoadBalancersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteLoadBalancersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get load balancer.
   *
   * For a given zone identifier and load balancer id, get the load balancer settings.
   *
   * @param getLoadBalancerSettingsOptions the {@link GetLoadBalancerSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancersResp}
   */
  public ServiceCall<LoadBalancersResp> getLoadBalancerSettings(GetLoadBalancerSettingsOptions getLoadBalancerSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerSettingsOptions,
      "getLoadBalancerSettingsOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "load_balancers" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getLoadBalancerSettingsOptions.loadBalancerIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer", "v1", "getLoadBalancerSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LoadBalancersResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancersResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
