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

package com.ibm.cloud.networking.routing.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.routing.v1.model.GetSmartRoutingOptions;
import com.ibm.cloud.networking.routing.v1.model.SmartRoutingResp;
import com.ibm.cloud.networking.routing.v1.model.UpdateSmartRoutingOptions;
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
 * Routing.
 *
 * @version v1
 */
public class Routing extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "routing";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `Routing` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @return an instance of the `Routing` client using external configuration
   */
  public static Routing newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Routing` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Routing` client using external configuration
   */
  public static Routing newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Routing service = new Routing(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Routing` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneIdentifier Zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Routing(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
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
   * Gets the zoneIdentifier.
   *
   * Zone identifier.
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
   * Get Routing feature smart routing setting.
   *
   * Get Routing feature smart routing setting for a zone.
   *
   * @param getSmartRoutingOptions the {@link GetSmartRoutingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SmartRoutingResp}
   */
  public ServiceCall<SmartRoutingResp> getSmartRouting(GetSmartRoutingOptions getSmartRoutingOptions) {
    String[] pathSegments = { "v1", "zones", "routing/smart_routing" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("routing", "v1", "getSmartRouting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SmartRoutingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SmartRoutingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Routing feature smart routing setting.
   *
   * Get Routing feature smart routing setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link SmartRoutingResp}
   */
  public ServiceCall<SmartRoutingResp> getSmartRouting() {
    return getSmartRouting(null);
  }

  /**
   * Update Routing feature smart route setting.
   *
   * Update Routing feature smart route setting for a zone.
   *
   * @param updateSmartRoutingOptions the {@link UpdateSmartRoutingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SmartRoutingResp}
   */
  public ServiceCall<SmartRoutingResp> updateSmartRouting(UpdateSmartRoutingOptions updateSmartRoutingOptions) {
    boolean skipBody = false;
    if (updateSmartRoutingOptions == null) {
      updateSmartRoutingOptions = new UpdateSmartRoutingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "routing/smart_routing" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("routing", "v1", "updateSmartRouting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (updateSmartRoutingOptions.value() != null) {
        contentJson.addProperty("value", updateSmartRoutingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SmartRoutingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SmartRoutingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update Routing feature smart route setting.
   *
   * Update Routing feature smart route setting for a zone.
   *
   * @return a {@link ServiceCall} with a result of type {@link SmartRoutingResp}
   */
  public ServiceCall<SmartRoutingResp> updateSmartRouting() {
    return updateSmartRouting(null);
  }

}
