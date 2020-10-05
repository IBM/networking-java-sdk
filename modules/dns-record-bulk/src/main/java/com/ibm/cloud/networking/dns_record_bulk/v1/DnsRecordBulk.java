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

package com.ibm.cloud.networking.dns_record_bulk.v1;

import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObject;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.GetDnsRecordsBulkOptions;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.PostDnsRecordsBulkOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * Import/Export zone files.
 *
 * @version v1
 */
public class DnsRecordBulk extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "dns_record_bulk";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `DnsRecordBulk` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Identifier of zone.
   * @return an instance of the `DnsRecordBulk` client using external configuration
   */
  public static DnsRecordBulk newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `DnsRecordBulk` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Identifier of zone.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `DnsRecordBulk` client using external configuration
   */
  public static DnsRecordBulk newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    DnsRecordBulk service = new DnsRecordBulk(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `DnsRecordBulk` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full url-encoded CRN of the service instance.
   * @param zoneIdentifier Identifier of zone.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public DnsRecordBulk(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
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
   * Gets the zoneIdentifier.
   *
   * Identifier of zone.
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
   * Export zone file.
   *
   * Export zone file.
   *
   * @param getDnsRecordsBulkOptions the {@link GetDnsRecordsBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDnsRecordsBulk(GetDnsRecordsBulkOptions getDnsRecordsBulkOptions) {
    String[] pathSegments = { "v1", "zones", "dns_records_bulk" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_record_bulk", "v1", "getDnsRecordsBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "text/plain; charset=utf-8");
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Export zone file.
   *
   * Export zone file.
   *
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDnsRecordsBulk() {
    return getDnsRecordsBulk(null);
  }

  /**
   * Import zone file.
   *
   * Import zone file.
   *
   * @param postDnsRecordsBulkOptions the {@link PostDnsRecordsBulkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DnsRecordsObject}
   */
  public ServiceCall<DnsRecordsObject> postDnsRecordsBulk(PostDnsRecordsBulkOptions postDnsRecordsBulkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postDnsRecordsBulkOptions,
      "postDnsRecordsBulkOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((postDnsRecordsBulkOptions.file() != null), "At least one of  or file must be supplied.");
    String[] pathSegments = { "v1", "zones", "dns_records_bulk" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_record_bulk", "v1", "postDnsRecordsBulk");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (postDnsRecordsBulkOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(postDnsRecordsBulkOptions.file(), postDnsRecordsBulkOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<DnsRecordsObject> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DnsRecordsObject>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import zone file.
   *
   * Import zone file.
   *
   * @return a {@link ServiceCall} with a result of type {@link DnsRecordsObject}
   */
  public ServiceCall<DnsRecordsObject> postDnsRecordsBulk() {
    return postDnsRecordsBulk(null);
  }

}
