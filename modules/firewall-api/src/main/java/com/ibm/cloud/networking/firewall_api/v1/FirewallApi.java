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

package com.ibm.cloud.networking.firewall_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.firewall_api.v1.model.GetSecurityLevelSettingOptions;
import com.ibm.cloud.networking.firewall_api.v1.model.SecurityLevelSettingResp;
import com.ibm.cloud.networking.firewall_api.v1.model.SetSecurityLevelSettingOptions;
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
 * Firewall API.
 *
 * @version v1
 */
public class FirewallApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "firewall_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `FirewallApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @return an instance of the `FirewallApi` client using external configuration
   */
  public static FirewallApi newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `FirewallApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `FirewallApi` client using external configuration
   */
  public static FirewallApi newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    FirewallApi service = new FirewallApi(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `FirewallApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public FirewallApi(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
  }

  /**
   * Gets the crn.
   *
   * cloud resource name.
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
   * Get security level setting.
   *
   * For a given zone identifier, get security level setting.
   *
   * @param getSecurityLevelSettingOptions the {@link GetSecurityLevelSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityLevelSettingResp}
   */
  public ServiceCall<SecurityLevelSettingResp> getSecurityLevelSetting(GetSecurityLevelSettingOptions getSecurityLevelSettingOptions) {
    String[] pathSegments = { "v1", "zones", "settings/security_level" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_api", "v1", "getSecurityLevelSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SecurityLevelSettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityLevelSettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get security level setting.
   *
   * For a given zone identifier, get security level setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityLevelSettingResp}
   */
  public ServiceCall<SecurityLevelSettingResp> getSecurityLevelSetting() {
    return getSecurityLevelSetting(null);
  }

  /**
   * Set security level setting.
   *
   * For a given zone identifier, set security level setting.
   *
   * @param setSecurityLevelSettingOptions the {@link SetSecurityLevelSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityLevelSettingResp}
   */
  public ServiceCall<SecurityLevelSettingResp> setSecurityLevelSetting(SetSecurityLevelSettingOptions setSecurityLevelSettingOptions) {
    boolean skipBody = false;
    if (setSecurityLevelSettingOptions == null) {
      setSecurityLevelSettingOptions = new SetSecurityLevelSettingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/security_level" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("firewall_api", "v1", "setSecurityLevelSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (setSecurityLevelSettingOptions.value() != null) {
        contentJson.addProperty("value", setSecurityLevelSettingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SecurityLevelSettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityLevelSettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set security level setting.
   *
   * For a given zone identifier, set security level setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityLevelSettingResp}
   */
  public ServiceCall<SecurityLevelSettingResp> setSecurityLevelSetting() {
    return setSecurityLevelSetting(null);
  }

}
