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

package com.ibm.cloud.networking.zones.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.zones.v1.model.CreateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneResp;
import com.ibm.cloud.networking.zones.v1.model.GetZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesResp;
import com.ibm.cloud.networking.zones.v1.model.UpdateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationCheckOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckResp;
import com.ibm.cloud.networking.zones.v1.model.ZoneResp;
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
 * CIS Zones.
 *
 * @version v1
 */
public class Zones extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "zones";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

 /**
   * Class method which constructs an instance of the `Zones` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @return an instance of the `Zones` client using external configuration
   */
  public static Zones newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Zones` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Zones` client using external configuration
   */
  public static Zones newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Zones service = new Zones(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Zones` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Zones(String crn, String serviceName, Authenticator authenticator) {
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
   * List all zones.
   *
   * List all zones for a service instance.
   *
   * @param listZonesOptions the {@link ListZonesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListZonesResp}
   */
  public ServiceCall<ListZonesResp> listZones(ListZonesOptions listZonesOptions) {
    String[] pathSegments = { "v1", "zones" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "listZones");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListZonesResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListZonesResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all zones.
   *
   * List all zones for a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListZonesResp}
   */
  public ServiceCall<ListZonesResp> listZones() {
    return listZones(null);
  }

  /**
   * Create zone.
   *
   * Add a new zone for a given service instance.
   *
   * @param createZoneOptions the {@link CreateZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneResp}
   */
  public ServiceCall<ZoneResp> createZone(CreateZoneOptions createZoneOptions) {
    boolean skipBody = false;
    if (createZoneOptions == null) {
      createZoneOptions = new CreateZoneOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones" };
    String[] pathParameters = { this.crn };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "createZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createZoneOptions.name() != null) {
        contentJson.addProperty("name", createZoneOptions.name());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<ZoneResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create zone.
   *
   * Add a new zone for a given service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ZoneResp}
   */
  public ServiceCall<ZoneResp> createZone() {
    return createZone(null);
  }

  /**
   * Delete zone.
   *
   * Delete a zone given its id.
   *
   * @param deleteZoneOptions the {@link DeleteZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteZoneResp}
   */
  public ServiceCall<DeleteZoneResp> deleteZone(DeleteZoneOptions deleteZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteZoneOptions,
      "deleteZoneOptions cannot be null");
    String[] pathSegments = { "v1", "zones" };
    String[] pathParameters = { this.crn, deleteZoneOptions.zoneIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "deleteZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteZoneResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteZoneResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get zone.
   *
   * Get the details of a zone for a given service instance and given zone id.
   *
   * @param getZoneOptions the {@link GetZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneResp}
   */
  public ServiceCall<ZoneResp> getZone(GetZoneOptions getZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getZoneOptions,
      "getZoneOptions cannot be null");
    String[] pathSegments = { "v1", "zones" };
    String[] pathParameters = { this.crn, getZoneOptions.zoneIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "getZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ZoneResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update zone.
   *
   * Update the paused field of the zone.
   *
   * @param updateZoneOptions the {@link UpdateZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneResp}
   */
  public ServiceCall<ZoneResp> updateZone(UpdateZoneOptions updateZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateZoneOptions,
      "updateZoneOptions cannot be null");
    String[] pathSegments = { "v1", "zones" };
    String[] pathParameters = { this.crn, updateZoneOptions.zoneIdentifier() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "updateZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateZoneOptions.paused() != null) {
      contentJson.addProperty("paused", updateZoneOptions.paused());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ZoneResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check zone.
   *
   * Perform activation check on zone for status.
   *
   * @param zoneActivationCheckOptions the {@link ZoneActivationCheckOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ZoneActivationcheckResp}
   */
  public ServiceCall<ZoneActivationcheckResp> zoneActivationCheck(ZoneActivationCheckOptions zoneActivationCheckOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(zoneActivationCheckOptions,
      "zoneActivationCheckOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "activation_check" };
    String[] pathParameters = { this.crn, zoneActivationCheckOptions.zoneIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("zones", "v1", "zoneActivationCheck");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ZoneActivationcheckResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ZoneActivationcheckResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
