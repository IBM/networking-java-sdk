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

package com.ibm.cloud.networking.global_load_balancer_events.v1;

import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.GetLoadBalancerEventsOptions;
import com.ibm.cloud.networking.global_load_balancer_events.v1.model.ListEventsResp;
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
 * Global Load Balancer Healthcheck Events.
 *
 * @version v1
 */
public class GlobalLoadBalancerEvents extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "global_load_balancer_events";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `GlobalLoadBalancerEvents` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @return an instance of the `GlobalLoadBalancerEvents` client using external configuration
   */
  public static GlobalLoadBalancerEvents newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `GlobalLoadBalancerEvents` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `GlobalLoadBalancerEvents` client using external configuration
   */
  public static GlobalLoadBalancerEvents newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    GlobalLoadBalancerEvents service = new GlobalLoadBalancerEvents(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `GlobalLoadBalancerEvents` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public GlobalLoadBalancerEvents(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
  }

  /**
   * Gets the crn.
   *
   * Full url-encoded cloud resource name (CRN) of resource instance.
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
   * List all load balancer events.
   *
   * Get load balancer events for all origins.
   *
   * @param getLoadBalancerEventsOptions the {@link GetLoadBalancerEventsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListEventsResp}
   */
  public ServiceCall<ListEventsResp> getLoadBalancerEvents(GetLoadBalancerEventsOptions getLoadBalancerEventsOptions) {
    String[] pathSegments = { "v1", "load_balancers/events" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("global_load_balancer_events", "v1", "getLoadBalancerEvents");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListEventsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListEventsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all load balancer events.
   *
   * Get load balancer events for all origins.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListEventsResp}
   */
  public ServiceCall<ListEventsResp> getLoadBalancerEvents() {
    return getLoadBalancerEvents(null);
  }

}
