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

package com.ibm.cloud.networking.ssl_certificate_api.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeCertificatePriorityOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ChangeUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.CustomCertResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DedicatedCertificatePack;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.DeleteCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetSslSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls12SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetTls13SettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.GetUniversalCertificateSettingOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificateResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertificatesOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.ListCustomCertsResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.OrderCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls13SettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UniversalSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UpdateCustomCertificateOptions;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.UploadCustomCertificateOptions;
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
 * SSL Certificate.
 *
 * @version v1
 */
public class SslCertificateApi extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "ssl_certificate_api";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `SslCertificateApi` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @return an instance of the `SslCertificateApi` client using external configuration
   */
  public static SslCertificateApi newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `SslCertificateApi` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `SslCertificateApi` client using external configuration
   */
  public static SslCertificateApi newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    SslCertificateApi service = new SslCertificateApi(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `SslCertificateApi` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn cloud resource name.
   * @param zoneIdentifier zone identifier.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public SslCertificateApi(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
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
   * List all certificates.
   *
   * CIS automatically add an active DNS zone to a universal SSL certificate, shared among multiple customers. Customer
   * may order dedicated certificates for the owning zones. This API list all certificates for a given zone, including
   * shared and dedicated certificates.
   *
   * @param listCertificatesOptions the {@link ListCertificatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListCertificateResp}
   */
  public ServiceCall<ListCertificateResp> listCertificates(ListCertificatesOptions listCertificatesOptions) {
    if (listCertificatesOptions == null) {
      listCertificatesOptions = new ListCertificatesOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "ssl/certificate_packs" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "listCertificates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCertificatesOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listCertificatesOptions.xCorrelationId());
    }
    ResponseConverter<ListCertificateResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListCertificateResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all certificates.
   *
   * CIS automatically add an active DNS zone to a universal SSL certificate, shared among multiple customers. Customer
   * may order dedicated certificates for the owning zones. This API list all certificates for a given zone, including
   * shared and dedicated certificates.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListCertificateResp}
   */
  public ServiceCall<ListCertificateResp> listCertificates() {
    return listCertificates(null);
  }

  /**
   * Order dedicated certificate.
   *
   * Order a dedicated certificate for a given zone. The zone should be active before placing an order of a dedicated
   * certificate.
   *
   * @param orderCertificateOptions the {@link OrderCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DedicatedCertificatePack}
   */
  public ServiceCall<DedicatedCertificatePack> orderCertificate(OrderCertificateOptions orderCertificateOptions) {
    boolean skipBody = false;
    if (orderCertificateOptions == null) {
      orderCertificateOptions = new OrderCertificateOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "ssl/certificate_packs" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "orderCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (orderCertificateOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", orderCertificateOptions.xCorrelationId());
    }
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (orderCertificateOptions.type() != null) {
        contentJson.addProperty("type", orderCertificateOptions.type());
      }
      if (orderCertificateOptions.hosts() != null) {
        contentJson.add("hosts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(orderCertificateOptions.hosts()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<DedicatedCertificatePack> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DedicatedCertificatePack>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Order dedicated certificate.
   *
   * Order a dedicated certificate for a given zone. The zone should be active before placing an order of a dedicated
   * certificate.
   *
   * @return a {@link ServiceCall} with a result of type {@link DedicatedCertificatePack}
   */
  public ServiceCall<DedicatedCertificatePack> orderCertificate() {
    return orderCertificate(null);
  }

  /**
   * Delete a certificate.
   *
   * Delete a given certificate.
   *
   * @param deleteCertificateOptions the {@link DeleteCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCertificate(DeleteCertificateOptions deleteCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCertificateOptions,
      "deleteCertificateOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "ssl/certificate_packs" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteCertificateOptions.certIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "deleteCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCertificateOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteCertificateOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get SSL setting.
   *
   * For a given zone identifier, get SSL setting.
   *
   * @param getSslSettingOptions the {@link GetSslSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SslSettingResp}
   */
  public ServiceCall<SslSettingResp> getSslSetting(GetSslSettingOptions getSslSettingOptions) {
    String[] pathSegments = { "v1", "zones", "settings/ssl" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "getSslSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SslSettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SslSettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get SSL setting.
   *
   * For a given zone identifier, get SSL setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link SslSettingResp}
   */
  public ServiceCall<SslSettingResp> getSslSetting() {
    return getSslSetting(null);
  }

  /**
   * Change SSL setting.
   *
   * For a given zone identifier, change SSL setting.
   *
   * @param changeSslSettingOptions the {@link ChangeSslSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SslSettingResp}
   */
  public ServiceCall<SslSettingResp> changeSslSetting(ChangeSslSettingOptions changeSslSettingOptions) {
    boolean skipBody = false;
    if (changeSslSettingOptions == null) {
      changeSslSettingOptions = new ChangeSslSettingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/ssl" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "changeSslSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (changeSslSettingOptions.value() != null) {
        contentJson.addProperty("value", changeSslSettingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SslSettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SslSettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Change SSL setting.
   *
   * For a given zone identifier, change SSL setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link SslSettingResp}
   */
  public ServiceCall<SslSettingResp> changeSslSetting() {
    return changeSslSetting(null);
  }

  /**
   * List all custom certificates.
   *
   * For a given zone identifier, list all custom certificates.
   *
   * @param listCustomCertificatesOptions the {@link ListCustomCertificatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListCustomCertsResp}
   */
  public ServiceCall<ListCustomCertsResp> listCustomCertificates(ListCustomCertificatesOptions listCustomCertificatesOptions) {
    String[] pathSegments = { "v1", "zones", "custom_certificates" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "listCustomCertificates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListCustomCertsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListCustomCertsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all custom certificates.
   *
   * For a given zone identifier, list all custom certificates.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListCustomCertsResp}
   */
  public ServiceCall<ListCustomCertsResp> listCustomCertificates() {
    return listCustomCertificates(null);
  }

  /**
   * Upload a custom certificate.
   *
   * For a given zone identifier, upload a custom certificates.
   *
   * @param uploadCustomCertificateOptions the {@link UploadCustomCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomCertResp}
   */
  public ServiceCall<CustomCertResp> uploadCustomCertificate(UploadCustomCertificateOptions uploadCustomCertificateOptions) {
    boolean skipBody = false;
    if (uploadCustomCertificateOptions == null) {
      uploadCustomCertificateOptions = new UploadCustomCertificateOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "custom_certificates" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "uploadCustomCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (uploadCustomCertificateOptions.certificate() != null) {
        contentJson.addProperty("certificate", uploadCustomCertificateOptions.certificate());
      }
      if (uploadCustomCertificateOptions.privateKey() != null) {
        contentJson.addProperty("private_key", uploadCustomCertificateOptions.privateKey());
      }
      if (uploadCustomCertificateOptions.bundleMethod() != null) {
        contentJson.addProperty("bundle_method", uploadCustomCertificateOptions.bundleMethod());
      }
      if (uploadCustomCertificateOptions.geoRestrictions() != null) {
        contentJson.add("geo_restrictions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(uploadCustomCertificateOptions.geoRestrictions()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<CustomCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a custom certificate.
   *
   * For a given zone identifier, upload a custom certificates.
   *
   * @return a {@link ServiceCall} with a result of type {@link CustomCertResp}
   */
  public ServiceCall<CustomCertResp> uploadCustomCertificate() {
    return uploadCustomCertificate(null);
  }

  /**
   * Get custom certificate.
   *
   * For a given zone identifier, get a custom certificates.
   *
   * @param getCustomCertificateOptions the {@link GetCustomCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomCertResp}
   */
  public ServiceCall<CustomCertResp> getCustomCertificate(GetCustomCertificateOptions getCustomCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCustomCertificateOptions,
      "getCustomCertificateOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "custom_certificates" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getCustomCertificateOptions.customCertId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "getCustomCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CustomCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update custom certificate.
   *
   * For a given zone identifier, update a custom certificates.
   *
   * @param updateCustomCertificateOptions the {@link UpdateCustomCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomCertResp}
   */
  public ServiceCall<CustomCertResp> updateCustomCertificate(UpdateCustomCertificateOptions updateCustomCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCustomCertificateOptions,
      "updateCustomCertificateOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "custom_certificates" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateCustomCertificateOptions.customCertId() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "updateCustomCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateCustomCertificateOptions.certificate() != null) {
      contentJson.addProperty("certificate", updateCustomCertificateOptions.certificate());
    }
    if (updateCustomCertificateOptions.privateKey() != null) {
      contentJson.addProperty("private_key", updateCustomCertificateOptions.privateKey());
    }
    if (updateCustomCertificateOptions.bundleMethod() != null) {
      contentJson.addProperty("bundle_method", updateCustomCertificateOptions.bundleMethod());
    }
    if (updateCustomCertificateOptions.geoRestrictions() != null) {
      contentJson.add("geo_restrictions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCustomCertificateOptions.geoRestrictions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomCertResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomCertResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete custom certificate.
   *
   * For a given zone identifier, delete a custom certificates.
   *
   * @param deleteCustomCertificateOptions the {@link DeleteCustomCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCustomCertificate(DeleteCustomCertificateOptions deleteCustomCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCustomCertificateOptions,
      "deleteCustomCertificateOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "custom_certificates" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteCustomCertificateOptions.customCertId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "deleteCustomCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set certificate priority.
   *
   * For a given zone identifier, set priority of certificates.
   *
   * @param changeCertificatePriorityOptions the {@link ChangeCertificatePriorityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> changeCertificatePriority(ChangeCertificatePriorityOptions changeCertificatePriorityOptions) {
    boolean skipBody = false;
    if (changeCertificatePriorityOptions == null) {
      changeCertificatePriorityOptions = new ChangeCertificatePriorityOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "custom_certificates/prioritize" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "changeCertificatePriority");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (changeCertificatePriorityOptions.certificates() != null) {
        contentJson.add("certificates", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(changeCertificatePriorityOptions.certificates()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set certificate priority.
   *
   * For a given zone identifier, set priority of certificates.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> changeCertificatePriority() {
    return changeCertificatePriority(null);
  }

  /**
   * Get details of universal certificate.
   *
   * For a given zone identifier, get universal certificate.
   *
   * @param getUniversalCertificateSettingOptions the {@link GetUniversalCertificateSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UniversalSettingResp}
   */
  public ServiceCall<UniversalSettingResp> getUniversalCertificateSetting(GetUniversalCertificateSettingOptions getUniversalCertificateSettingOptions) {
    String[] pathSegments = { "v1", "zones", "ssl/universal/settings" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "getUniversalCertificateSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<UniversalSettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UniversalSettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get details of universal certificate.
   *
   * For a given zone identifier, get universal certificate.
   *
   * @return a {@link ServiceCall} with a result of type {@link UniversalSettingResp}
   */
  public ServiceCall<UniversalSettingResp> getUniversalCertificateSetting() {
    return getUniversalCertificateSetting(null);
  }

  /**
   * Enable or Disable universal certificate.
   *
   * change universal certificate setting.
   *
   * @param changeUniversalCertificateSettingOptions the {@link ChangeUniversalCertificateSettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> changeUniversalCertificateSetting(ChangeUniversalCertificateSettingOptions changeUniversalCertificateSettingOptions) {
    boolean skipBody = false;
    if (changeUniversalCertificateSettingOptions == null) {
      changeUniversalCertificateSettingOptions = new ChangeUniversalCertificateSettingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "ssl/universal/settings" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "changeUniversalCertificateSetting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (changeUniversalCertificateSettingOptions.enabled() != null) {
        contentJson.addProperty("enabled", changeUniversalCertificateSettingOptions.enabled());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Enable or Disable universal certificate.
   *
   * change universal certificate setting.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> changeUniversalCertificateSetting() {
    return changeUniversalCertificateSetting(null);
  }

  /**
   * Get TLS 1.2 only setting.
   *
   * For a given zone identifier, get TLS 1.2 only setting.
   *
   * @param getTls12SettingOptions the {@link GetTls12SettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Tls12SettingResp}
   */
  public ServiceCall<Tls12SettingResp> getTls12Setting(GetTls12SettingOptions getTls12SettingOptions) {
    String[] pathSegments = { "v1", "zones", "settings/tls_1_2_only" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "getTls12Setting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Tls12SettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Tls12SettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get TLS 1.2 only setting.
   *
   * For a given zone identifier, get TLS 1.2 only setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link Tls12SettingResp}
   */
  public ServiceCall<Tls12SettingResp> getTls12Setting() {
    return getTls12Setting(null);
  }

  /**
   * Set TLS 1.2 setting.
   *
   * For a given zone identifier, set TLS 1.2 setting.
   *
   * @param changeTls12SettingOptions the {@link ChangeTls12SettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Tls12SettingResp}
   */
  public ServiceCall<Tls12SettingResp> changeTls12Setting(ChangeTls12SettingOptions changeTls12SettingOptions) {
    boolean skipBody = false;
    if (changeTls12SettingOptions == null) {
      changeTls12SettingOptions = new ChangeTls12SettingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/tls_1_2_only" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "changeTls12Setting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (changeTls12SettingOptions.value() != null) {
        contentJson.addProperty("value", changeTls12SettingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Tls12SettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Tls12SettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set TLS 1.2 setting.
   *
   * For a given zone identifier, set TLS 1.2 setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link Tls12SettingResp}
   */
  public ServiceCall<Tls12SettingResp> changeTls12Setting() {
    return changeTls12Setting(null);
  }

  /**
   * Get TLS 1.3 setting.
   *
   * For a given zone identifier, get TLS 1.3 setting.
   *
   * @param getTls13SettingOptions the {@link GetTls13SettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Tls13SettingResp}
   */
  public ServiceCall<Tls13SettingResp> getTls13Setting(GetTls13SettingOptions getTls13SettingOptions) {
    String[] pathSegments = { "v1", "zones", "settings/tls_1_3" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "getTls13Setting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Tls13SettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Tls13SettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get TLS 1.3 setting.
   *
   * For a given zone identifier, get TLS 1.3 setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link Tls13SettingResp}
   */
  public ServiceCall<Tls13SettingResp> getTls13Setting() {
    return getTls13Setting(null);
  }

  /**
   * Set TLS 1.3 setting.
   *
   * For a given zone identifier, set TLS 1.3 setting.
   *
   * @param changeTls13SettingOptions the {@link ChangeTls13SettingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Tls13SettingResp}
   */
  public ServiceCall<Tls13SettingResp> changeTls13Setting(ChangeTls13SettingOptions changeTls13SettingOptions) {
    boolean skipBody = false;
    if (changeTls13SettingOptions == null) {
      changeTls13SettingOptions = new ChangeTls13SettingOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "settings/tls_1_3" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("ssl_certificate_api", "v1", "changeTls13Setting");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (changeTls13SettingOptions.value() != null) {
        contentJson.addProperty("value", changeTls13SettingOptions.value());
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Tls13SettingResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Tls13SettingResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Set TLS 1.3 setting.
   *
   * For a given zone identifier, set TLS 1.3 setting.
   *
   * @return a {@link ServiceCall} with a result of type {@link Tls13SettingResp}
   */
  public ServiceCall<Tls13SettingResp> changeTls13Setting() {
    return changeTls13Setting(null);
  }

}
