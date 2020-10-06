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

package com.ibm.cloud.networking.dns_records.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.dns_records.v1.model.CreateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.GetDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListAllDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListDnsrecordsResp;
import com.ibm.cloud.networking.dns_records.v1.model.UpdateDnsRecordOptions;
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
 * DNS records.
 *
 * @version v1
 */
public class DnsRecords extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "dns_records";

  public static final String DEFAULT_SERVICE_URL = "https://api.cis.cloud.ibm.com";

  private String crn;

  private String zoneIdentifier;

 /**
   * Class method which constructs an instance of the `DnsRecords` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @return an instance of the `DnsRecords` client using external configuration
   */
  public static DnsRecords newInstance(String crn, String zoneIdentifier) {
    return newInstance(crn, zoneIdentifier, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `DnsRecords` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `DnsRecords` client using external configuration
   */
  public static DnsRecords newInstance(String crn, String zoneIdentifier, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    DnsRecords service = new DnsRecords(crn, zoneIdentifier, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `DnsRecords` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn Full crn of the service instance.
   * @param zoneIdentifier Zone identifier (zone id).
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public DnsRecords(String crn, String zoneIdentifier, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
    setZoneIdentifier(zoneIdentifier);
  }

  /**
   * Gets the crn.
   *
   * Full crn of the service instance.
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
   * Zone identifier (zone id).
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
   * List all DNS records.
   *
   * List all DNS records for a given zone of a service instance.
   *
   * @param listAllDnsRecordsOptions the {@link ListAllDnsRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListDnsrecordsResp}
   */
  public ServiceCall<ListDnsrecordsResp> listAllDnsRecords(ListAllDnsRecordsOptions listAllDnsRecordsOptions) {
    if (listAllDnsRecordsOptions == null) {
      listAllDnsRecordsOptions = new ListAllDnsRecordsOptions.Builder().build();
    }
    String[] pathSegments = { "v1", "zones", "dns_records" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_records", "v1", "listAllDnsRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAllDnsRecordsOptions.type() != null) {
      builder.query("type", String.valueOf(listAllDnsRecordsOptions.type()));
    }
    if (listAllDnsRecordsOptions.name() != null) {
      builder.query("name", String.valueOf(listAllDnsRecordsOptions.name()));
    }
    if (listAllDnsRecordsOptions.content() != null) {
      builder.query("content", String.valueOf(listAllDnsRecordsOptions.content()));
    }
    if (listAllDnsRecordsOptions.page() != null) {
      builder.query("page", String.valueOf(listAllDnsRecordsOptions.page()));
    }
    if (listAllDnsRecordsOptions.perPage() != null) {
      builder.query("per_page", String.valueOf(listAllDnsRecordsOptions.perPage()));
    }
    if (listAllDnsRecordsOptions.order() != null) {
      builder.query("order", String.valueOf(listAllDnsRecordsOptions.order()));
    }
    if (listAllDnsRecordsOptions.direction() != null) {
      builder.query("direction", String.valueOf(listAllDnsRecordsOptions.direction()));
    }
    if (listAllDnsRecordsOptions.match() != null) {
      builder.query("match", String.valueOf(listAllDnsRecordsOptions.match()));
    }
    ResponseConverter<ListDnsrecordsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListDnsrecordsResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all DNS records.
   *
   * List all DNS records for a given zone of a service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListDnsrecordsResp}
   */
  public ServiceCall<ListDnsrecordsResp> listAllDnsRecords() {
    return listAllDnsRecords(null);
  }

  /**
   * Create DNS record.
   *
   * Add a new DNS record for a given zone for a given service instance.
   *
   * @param createDnsRecordOptions the {@link CreateDnsRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DnsrecordResp}
   */
  public ServiceCall<DnsrecordResp> createDnsRecord(CreateDnsRecordOptions createDnsRecordOptions) {
    boolean skipBody = false;
    if (createDnsRecordOptions == null) {
      createDnsRecordOptions = new CreateDnsRecordOptions.Builder().build();
      skipBody = true;
    }
    String[] pathSegments = { "v1", "zones", "dns_records" };
    String[] pathParameters = { this.crn, this.zoneIdentifier };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_records", "v1", "createDnsRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (createDnsRecordOptions.name() != null) {
        contentJson.addProperty("name", createDnsRecordOptions.name());
      }
      if (createDnsRecordOptions.type() != null) {
        contentJson.addProperty("type", createDnsRecordOptions.type());
      }
      if (createDnsRecordOptions.ttl() != null) {
        contentJson.addProperty("ttl", createDnsRecordOptions.ttl());
      }
      if (createDnsRecordOptions.content() != null) {
        contentJson.addProperty("content", createDnsRecordOptions.content());
      }
      if (createDnsRecordOptions.priority() != null) {
        contentJson.addProperty("priority", createDnsRecordOptions.priority());
      }
      if (createDnsRecordOptions.data() != null) {
        contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDnsRecordOptions.data()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<DnsrecordResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DnsrecordResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create DNS record.
   *
   * Add a new DNS record for a given zone for a given service instance.
   *
   * @return a {@link ServiceCall} with a result of type {@link DnsrecordResp}
   */
  public ServiceCall<DnsrecordResp> createDnsRecord() {
    return createDnsRecord(null);
  }

  /**
   * Delete DNS record.
   *
   * Delete a DNS record given its id.
   *
   * @param deleteDnsRecordOptions the {@link DeleteDnsRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeleteDnsrecordResp}
   */
  public ServiceCall<DeleteDnsrecordResp> deleteDnsRecord(DeleteDnsRecordOptions deleteDnsRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDnsRecordOptions,
      "deleteDnsRecordOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "dns_records" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, deleteDnsRecordOptions.dnsrecordIdentifier() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_records", "v1", "deleteDnsRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DeleteDnsrecordResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeleteDnsrecordResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get DNS record.
   *
   * Get the details of a DNS record for a given zone under a given service instance.
   *
   * @param getDnsRecordOptions the {@link GetDnsRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DnsrecordResp}
   */
  public ServiceCall<DnsrecordResp> getDnsRecord(GetDnsRecordOptions getDnsRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDnsRecordOptions,
      "getDnsRecordOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "dns_records" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, getDnsRecordOptions.dnsrecordIdentifier() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_records", "v1", "getDnsRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DnsrecordResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DnsrecordResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update DNS record.
   *
   * Update an existing DNS record for a given zone under a given service instance.
   *
   * @param updateDnsRecordOptions the {@link UpdateDnsRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DnsrecordResp}
   */
  public ServiceCall<DnsrecordResp> updateDnsRecord(UpdateDnsRecordOptions updateDnsRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDnsRecordOptions,
      "updateDnsRecordOptions cannot be null");
    String[] pathSegments = { "v1", "zones", "dns_records" };
    String[] pathParameters = { this.crn, this.zoneIdentifier, updateDnsRecordOptions.dnsrecordIdentifier() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_records", "v1", "updateDnsRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateDnsRecordOptions.name() != null) {
      contentJson.addProperty("name", updateDnsRecordOptions.name());
    }
    if (updateDnsRecordOptions.type() != null) {
      contentJson.addProperty("type", updateDnsRecordOptions.type());
    }
    if (updateDnsRecordOptions.ttl() != null) {
      contentJson.addProperty("ttl", updateDnsRecordOptions.ttl());
    }
    if (updateDnsRecordOptions.content() != null) {
      contentJson.addProperty("content", updateDnsRecordOptions.content());
    }
    if (updateDnsRecordOptions.priority() != null) {
      contentJson.addProperty("priority", updateDnsRecordOptions.priority());
    }
    if (updateDnsRecordOptions.proxied() != null) {
      contentJson.addProperty("proxied", updateDnsRecordOptions.proxied());
    }
    if (updateDnsRecordOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDnsRecordOptions.data()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DnsrecordResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DnsrecordResp>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
