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

package com.ibm.cloud.networking.security_events_api.v1;

import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEvents;
import com.ibm.cloud.networking.security_events_api.v1.model.SecurityEventsOptions;
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
 * Security Events API.
 *
 * @version v1
 */
public class SecurityEventsApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "security_events_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneId;

 /**
   * Class method which constructs an instance of the `SecurityEventsApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneId zone identifier.
   * @return an instance of the `SecurityEventsApi` client using external configuration
   */
  public static SecurityEventsApi newInstance(String crn, String zoneId) {
    return newInstance(crn, zoneId, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `SecurityEventsApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneId zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `SecurityEventsApi` client using external configuration
   */
  public static SecurityEventsApi newInstance(String crn, String zoneId, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    SecurityEventsApi service = new SecurityEventsApi(crn, zoneId, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `SecurityEventsApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded cloud resource name (CRN) of resource instance.
   * @param zoneId zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public SecurityEventsApi(String crn, String zoneId, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneId(zoneId);
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
   * Gets the zoneId.
   *
   * zone identifier.
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
   * Logs of the mitigations performed by Firewall features.
   *
   * Provides a full log of the mitigations performed by the CIS Firewall features including; Firewall Rules, Rate
   * Limiting, Security Level, Access Rules (IP, IP Range, ASN, and Country), WAF (Web Application Firewall), User Agent
   * Blocking, Zone Lockdown, and Advanced DDoS Protection.
   *
   * @param securityEventsOptions the {@link SecurityEventsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SecurityEvents}
   */
  public ServiceCall<SecurityEvents> securityEvents(SecurityEventsOptions securityEventsOptions) {
    if (securityEventsOptions == null) {
      securityEventsOptions = new SecurityEventsOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "security/events" };
    String[] pathParameters = { this.crn, this.zoneId };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("security_events_api", "v1", "securityEvents");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (securityEventsOptions.ipClass() != null) {
      builder.query("ip_class", String.valueOf(securityEventsOptions.ipClass()));
    }
    if (securityEventsOptions.method() != null) {
      builder.query("method", String.valueOf(securityEventsOptions.method()));
    }
    if (securityEventsOptions.scheme() != null) {
      builder.query("scheme", String.valueOf(securityEventsOptions.scheme()));
    }
    if (securityEventsOptions.ip() != null) {
      builder.query("ip", String.valueOf(securityEventsOptions.ip()));
    }
    if (securityEventsOptions.host() != null) {
      builder.query("host", String.valueOf(securityEventsOptions.host()));
    }
    if (securityEventsOptions.proto() != null) {
      builder.query("proto", String.valueOf(securityEventsOptions.proto()));
    }
    if (securityEventsOptions.uri() != null) {
      builder.query("uri", String.valueOf(securityEventsOptions.uri()));
    }
    if (securityEventsOptions.ua() != null) {
      builder.query("ua", String.valueOf(securityEventsOptions.ua()));
    }
    if (securityEventsOptions.colo() != null) {
      builder.query("colo", String.valueOf(securityEventsOptions.colo()));
    }
    if (securityEventsOptions.rayId() != null) {
      builder.query("ray_id", String.valueOf(securityEventsOptions.rayId()));
    }
    if (securityEventsOptions.kind() != null) {
      builder.query("kind", String.valueOf(securityEventsOptions.kind()));
    }
    if (securityEventsOptions.action() != null) {
      builder.query("action", String.valueOf(securityEventsOptions.action()));
    }
    if (securityEventsOptions.cursor() != null) {
      builder.query("cursor", String.valueOf(securityEventsOptions.cursor()));
    }
    if (securityEventsOptions.country() != null) {
      builder.query("country", String.valueOf(securityEventsOptions.country()));
    }
    if (securityEventsOptions.since() != null) {
      builder.query("since", String.valueOf(securityEventsOptions.since()));
    }
    if (securityEventsOptions.source() != null) {
      builder.query("source", String.valueOf(securityEventsOptions.source()));
    }
    if (securityEventsOptions.limit() != null) {
      builder.query("limit", String.valueOf(securityEventsOptions.limit()));
    }
    if (securityEventsOptions.ruleId() != null) {
      builder.query("rule_id", String.valueOf(securityEventsOptions.ruleId()));
    }
    if (securityEventsOptions.until() != null) {
      builder.query("until", String.valueOf(securityEventsOptions.until()));
    }
    ResponseConverter<SecurityEvents> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SecurityEvents>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Logs of the mitigations performed by Firewall features.
   *
   * Provides a full log of the mitigations performed by the CIS Firewall features including; Firewall Rules, Rate
   * Limiting, Security Level, Access Rules (IP, IP Range, ASN, and Country), WAF (Web Application Firewall), User Agent
   * Blocking, Zone Lockdown, and Advanced DDoS Protection.
   *
   * @return a {@link ServiceCall} with a result of type {@link SecurityEvents}
   */
  public ServiceCall<SecurityEvents> securityEvents() {
    return securityEvents(null);
  }

}
