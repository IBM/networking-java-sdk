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

package com.ibm.cloud.networking.dns_svcs.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.Dnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszones;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLoadBalancers;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLoadBalancersOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListMonitors;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListMonitorsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPermittedNetworks;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPermittedNetworksOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPools;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListPoolsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListResourceRecords;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancer;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;
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
 * DNS Services API.
 *
 * @version v1
 */
public class DnsSvcs extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "dns_svcs";

  public static final String DEFAULT_SERVICE_URL = "https://api.dns-svcs.cloud.ibm.com/v1";

 /**
   * Class method which constructs an instance of the `DnsSvcs` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `DnsSvcs` client using external configuration
   */
  public static DnsSvcs newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `DnsSvcs` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `DnsSvcs` client using external configuration
   */
  public static DnsSvcs newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    DnsSvcs service = new DnsSvcs(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `DnsSvcs` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public DnsSvcs(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List DNS zones.
   *
   * List the DNS zones for a given service instance.
   *
   * @param listDnszonesOptions the {@link ListDnszonesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListDnszones}
   */
  public ServiceCall<ListDnszones> listDnszones(ListDnszonesOptions listDnszonesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDnszonesOptions,
      "listDnszonesOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones" };
    String[] pathParameters = { listDnszonesOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listDnszones");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDnszonesOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listDnszonesOptions.xCorrelationId());
    }
    if (listDnszonesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDnszonesOptions.offset()));
    }
    if (listDnszonesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDnszonesOptions.limit()));
    }
    ResponseConverter<ListDnszones> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListDnszones>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a DNS zone.
   *
   * Create a DNS zone for a given service instance.
   *
   * @param createDnszoneOptions the {@link CreateDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> createDnszone(CreateDnszoneOptions createDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDnszoneOptions,
      "createDnszoneOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones" };
    String[] pathParameters = { createDnszoneOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createDnszone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDnszoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createDnszoneOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createDnszoneOptions.name() != null) {
      contentJson.addProperty("name", createDnszoneOptions.name());
    }
    if (createDnszoneOptions.description() != null) {
      contentJson.addProperty("description", createDnszoneOptions.description());
    }
    if (createDnszoneOptions.label() != null) {
      contentJson.addProperty("label", createDnszoneOptions.label());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Dnszone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dnszone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a DNS zone.
   *
   * Delete a DNS zone.
   *
   * @param deleteDnszoneOptions the {@link DeleteDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDnszone(DeleteDnszoneOptions deleteDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDnszoneOptions,
      "deleteDnszoneOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones" };
    String[] pathParameters = { deleteDnszoneOptions.instanceId(), deleteDnszoneOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteDnszone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDnszoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteDnszoneOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a DNS zone.
   *
   * Get details of a DNS zone.
   *
   * @param getDnszoneOptions the {@link GetDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> getDnszone(GetDnszoneOptions getDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDnszoneOptions,
      "getDnszoneOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones" };
    String[] pathParameters = { getDnszoneOptions.instanceId(), getDnszoneOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getDnszone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDnszoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getDnszoneOptions.xCorrelationId());
    }
    ResponseConverter<Dnszone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dnszone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a DNS zone.
   *
   * Update the properties of a DNS zone.
   *
   * @param updateDnszoneOptions the {@link UpdateDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> updateDnszone(UpdateDnszoneOptions updateDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDnszoneOptions,
      "updateDnszoneOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones" };
    String[] pathParameters = { updateDnszoneOptions.instanceId(), updateDnszoneOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateDnszone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDnszoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateDnszoneOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateDnszoneOptions.description() != null) {
      contentJson.addProperty("description", updateDnszoneOptions.description());
    }
    if (updateDnszoneOptions.label() != null) {
      contentJson.addProperty("label", updateDnszoneOptions.label());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Dnszone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dnszone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Resource Records.
   *
   * List the Resource Records for a given DNS zone.
   *
   * @param listResourceRecordsOptions the {@link ListResourceRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListResourceRecords}
   */
  public ServiceCall<ListResourceRecords> listResourceRecords(ListResourceRecordsOptions listResourceRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listResourceRecordsOptions,
      "listResourceRecordsOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "resource_records" };
    String[] pathParameters = { listResourceRecordsOptions.instanceId(), listResourceRecordsOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listResourceRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourceRecordsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listResourceRecordsOptions.xCorrelationId());
    }
    if (listResourceRecordsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listResourceRecordsOptions.offset()));
    }
    if (listResourceRecordsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listResourceRecordsOptions.limit()));
    }
    ResponseConverter<ListResourceRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListResourceRecords>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a resource record.
   *
   * Create a resource record for a given DNS zone.
   *
   * @param createResourceRecordOptions the {@link CreateResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> createResourceRecord(CreateResourceRecordOptions createResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createResourceRecordOptions,
      "createResourceRecordOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "resource_records" };
    String[] pathParameters = { createResourceRecordOptions.instanceId(), createResourceRecordOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createResourceRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createResourceRecordOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createResourceRecordOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createResourceRecordOptions.name() != null) {
      contentJson.addProperty("name", createResourceRecordOptions.name());
    }
    if (createResourceRecordOptions.type() != null) {
      contentJson.addProperty("type", createResourceRecordOptions.type());
    }
    if (createResourceRecordOptions.rdata() != null) {
      contentJson.add("rdata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createResourceRecordOptions.rdata()));
    }
    if (createResourceRecordOptions.ttl() != null) {
      contentJson.addProperty("ttl", createResourceRecordOptions.ttl());
    }
    if (createResourceRecordOptions.service() != null) {
      contentJson.addProperty("service", createResourceRecordOptions.service());
    }
    if (createResourceRecordOptions.protocol() != null) {
      contentJson.addProperty("protocol", createResourceRecordOptions.protocol());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a resource record.
   *
   * Delete a resource record.
   *
   * @param deleteResourceRecordOptions the {@link DeleteResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteResourceRecord(DeleteResourceRecordOptions deleteResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteResourceRecordOptions,
      "deleteResourceRecordOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "resource_records" };
    String[] pathParameters = { deleteResourceRecordOptions.instanceId(), deleteResourceRecordOptions.dnszoneId(), deleteResourceRecordOptions.recordId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteResourceRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteResourceRecordOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteResourceRecordOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a resource record.
   *
   * Get details of a resource record.
   *
   * @param getResourceRecordOptions the {@link GetResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> getResourceRecord(GetResourceRecordOptions getResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourceRecordOptions,
      "getResourceRecordOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "resource_records" };
    String[] pathParameters = { getResourceRecordOptions.instanceId(), getResourceRecordOptions.dnszoneId(), getResourceRecordOptions.recordId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getResourceRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getResourceRecordOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getResourceRecordOptions.xCorrelationId());
    }
    ResponseConverter<ResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a resource record.
   *
   * Update the properties of a resource record.
   *
   * @param updateResourceRecordOptions the {@link UpdateResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> updateResourceRecord(UpdateResourceRecordOptions updateResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateResourceRecordOptions,
      "updateResourceRecordOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "resource_records" };
    String[] pathParameters = { updateResourceRecordOptions.instanceId(), updateResourceRecordOptions.dnszoneId(), updateResourceRecordOptions.recordId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateResourceRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateResourceRecordOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateResourceRecordOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateResourceRecordOptions.name() != null) {
      contentJson.addProperty("name", updateResourceRecordOptions.name());
    }
    if (updateResourceRecordOptions.rdata() != null) {
      contentJson.add("rdata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateResourceRecordOptions.rdata()));
    }
    if (updateResourceRecordOptions.ttl() != null) {
      contentJson.addProperty("ttl", updateResourceRecordOptions.ttl());
    }
    if (updateResourceRecordOptions.service() != null) {
      contentJson.addProperty("service", updateResourceRecordOptions.service());
    }
    if (updateResourceRecordOptions.protocol() != null) {
      contentJson.addProperty("protocol", updateResourceRecordOptions.protocol());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List permitted networks.
   *
   * List the permitted networks for a given DNS zone.
   *
   * @param listPermittedNetworksOptions the {@link ListPermittedNetworksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListPermittedNetworks}
   */
  public ServiceCall<ListPermittedNetworks> listPermittedNetworks(ListPermittedNetworksOptions listPermittedNetworksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPermittedNetworksOptions,
      "listPermittedNetworksOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "permitted_networks" };
    String[] pathParameters = { listPermittedNetworksOptions.instanceId(), listPermittedNetworksOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listPermittedNetworks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPermittedNetworksOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listPermittedNetworksOptions.xCorrelationId());
    }
    if (listPermittedNetworksOptions.offset() != null) {
      builder.query("offset", String.valueOf(listPermittedNetworksOptions.offset()));
    }
    if (listPermittedNetworksOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPermittedNetworksOptions.limit()));
    }
    ResponseConverter<ListPermittedNetworks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPermittedNetworks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a permitted network.
   *
   * Create a permitted network for a given DNS zone.
   *
   * @param createPermittedNetworkOptions the {@link CreatePermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> createPermittedNetwork(CreatePermittedNetworkOptions createPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPermittedNetworkOptions,
      "createPermittedNetworkOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "permitted_networks" };
    String[] pathParameters = { createPermittedNetworkOptions.instanceId(), createPermittedNetworkOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createPermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createPermittedNetworkOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPermittedNetworkOptions.type() != null) {
      contentJson.addProperty("type", createPermittedNetworkOptions.type());
    }
    if (createPermittedNetworkOptions.permittedNetwork() != null) {
      contentJson.add("permitted_network", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPermittedNetworkOptions.permittedNetwork()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a permitted network.
   *
   * Remove a permitted network.
   *
   * @param deletePermittedNetworkOptions the {@link DeletePermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> deletePermittedNetwork(DeletePermittedNetworkOptions deletePermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePermittedNetworkOptions,
      "deletePermittedNetworkOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "permitted_networks" };
    String[] pathParameters = { deletePermittedNetworkOptions.instanceId(), deletePermittedNetworkOptions.dnszoneId(), deletePermittedNetworkOptions.permittedNetworkId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deletePermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deletePermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deletePermittedNetworkOptions.xCorrelationId());
    }
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a permitted network.
   *
   * Get details of a permitted network.
   *
   * @param getPermittedNetworkOptions the {@link GetPermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> getPermittedNetwork(GetPermittedNetworkOptions getPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPermittedNetworkOptions,
      "getPermittedNetworkOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "permitted_networks" };
    String[] pathParameters = { getPermittedNetworkOptions.instanceId(), getPermittedNetworkOptions.dnszoneId(), getPermittedNetworkOptions.permittedNetworkId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getPermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getPermittedNetworkOptions.xCorrelationId());
    }
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancers.
   *
   * List the Global Load Balancers for a given DNS zone.
   *
   * @param listLoadBalancersOptions the {@link ListLoadBalancersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListLoadBalancers}
   */
  public ServiceCall<ListLoadBalancers> listLoadBalancers(ListLoadBalancersOptions listLoadBalancersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLoadBalancersOptions,
      "listLoadBalancersOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "load_balancers" };
    String[] pathParameters = { listLoadBalancersOptions.instanceId(), listLoadBalancersOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listLoadBalancers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listLoadBalancersOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listLoadBalancersOptions.xCorrelationId());
    }
    ResponseConverter<ListLoadBalancers> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLoadBalancers>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a load balancer.
   *
   * Create a load balancer for a given DNS zone.
   *
   * @param createLoadBalancerOptions the {@link CreateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> createLoadBalancer(CreateLoadBalancerOptions createLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerOptions,
      "createLoadBalancerOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "load_balancers" };
    String[] pathParameters = { createLoadBalancerOptions.instanceId(), createLoadBalancerOptions.dnszoneId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createLoadBalancerOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createLoadBalancerOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createLoadBalancerOptions.name() != null) {
      contentJson.addProperty("name", createLoadBalancerOptions.name());
    }
    if (createLoadBalancerOptions.description() != null) {
      contentJson.addProperty("description", createLoadBalancerOptions.description());
    }
    if (createLoadBalancerOptions.enabled() != null) {
      contentJson.addProperty("enabled", createLoadBalancerOptions.enabled());
    }
    if (createLoadBalancerOptions.ttl() != null) {
      contentJson.addProperty("ttl", createLoadBalancerOptions.ttl());
    }
    if (createLoadBalancerOptions.fallbackPool() != null) {
      contentJson.addProperty("fallback_pool", createLoadBalancerOptions.fallbackPool());
    }
    if (createLoadBalancerOptions.defaultPools() != null) {
      contentJson.add("default_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.defaultPools()));
    }
    if (createLoadBalancerOptions.azPools() != null) {
      contentJson.add("az_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createLoadBalancerOptions.azPools()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer.
   *
   * Delete a load balancer.
   *
   * @param deleteLoadBalancerOptions the {@link DeleteLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancer(DeleteLoadBalancerOptions deleteLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerOptions,
      "deleteLoadBalancerOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "load_balancers" };
    String[] pathParameters = { deleteLoadBalancerOptions.instanceId(), deleteLoadBalancerOptions.dnszoneId(), deleteLoadBalancerOptions.lbId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteLoadBalancerOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteLoadBalancerOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a load balancer.
   *
   * Get details of a load balancer.
   *
   * @param getLoadBalancerOptions the {@link GetLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> getLoadBalancer(GetLoadBalancerOptions getLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerOptions,
      "getLoadBalancerOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "load_balancers" };
    String[] pathParameters = { getLoadBalancerOptions.instanceId(), getLoadBalancerOptions.dnszoneId(), getLoadBalancerOptions.lbId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getLoadBalancerOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getLoadBalancerOptions.xCorrelationId());
    }
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a load balancer.
   *
   * Update the properties of a load balancer.
   *
   * @param updateLoadBalancerOptions the {@link UpdateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> updateLoadBalancer(UpdateLoadBalancerOptions updateLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerOptions,
      "updateLoadBalancerOptions cannot be null");
    String[] pathSegments = { "instances", "dnszones", "load_balancers" };
    String[] pathParameters = { updateLoadBalancerOptions.instanceId(), updateLoadBalancerOptions.dnszoneId(), updateLoadBalancerOptions.lbId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateLoadBalancer");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateLoadBalancerOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateLoadBalancerOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateLoadBalancerOptions.name() != null) {
      contentJson.addProperty("name", updateLoadBalancerOptions.name());
    }
    if (updateLoadBalancerOptions.description() != null) {
      contentJson.addProperty("description", updateLoadBalancerOptions.description());
    }
    if (updateLoadBalancerOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateLoadBalancerOptions.enabled());
    }
    if (updateLoadBalancerOptions.ttl() != null) {
      contentJson.addProperty("ttl", updateLoadBalancerOptions.ttl());
    }
    if (updateLoadBalancerOptions.fallbackPool() != null) {
      contentJson.addProperty("fallback_pool", updateLoadBalancerOptions.fallbackPool());
    }
    if (updateLoadBalancerOptions.defaultPools() != null) {
      contentJson.add("default_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateLoadBalancerOptions.defaultPools()));
    }
    if (updateLoadBalancerOptions.azPools() != null) {
      contentJson.add("az_pools", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateLoadBalancerOptions.azPools()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LoadBalancer> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LoadBalancer>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancer pools.
   *
   * List the load balancer pools.
   *
   * @param listPoolsOptions the {@link ListPoolsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListPools}
   */
  public ServiceCall<ListPools> listPools(ListPoolsOptions listPoolsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPoolsOptions,
      "listPoolsOptions cannot be null");
    String[] pathSegments = { "instances", "pools" };
    String[] pathParameters = { listPoolsOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listPools");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPoolsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listPoolsOptions.xCorrelationId());
    }
    ResponseConverter<ListPools> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPools>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a load balancer pool.
   *
   * Create a load balancer pool.
   *
   * @param createPoolOptions the {@link CreatePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> createPool(CreatePoolOptions createPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPoolOptions,
      "createPoolOptions cannot be null");
    String[] pathSegments = { "instances", "pools" };
    String[] pathParameters = { createPoolOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createPoolOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createPoolOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createPoolOptions.name() != null) {
      contentJson.addProperty("name", createPoolOptions.name());
    }
    if (createPoolOptions.description() != null) {
      contentJson.addProperty("description", createPoolOptions.description());
    }
    if (createPoolOptions.enabled() != null) {
      contentJson.addProperty("enabled", createPoolOptions.enabled());
    }
    if (createPoolOptions.healthyOriginsThreshold() != null) {
      contentJson.addProperty("healthy_origins_threshold", createPoolOptions.healthyOriginsThreshold());
    }
    if (createPoolOptions.origins() != null) {
      contentJson.add("origins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPoolOptions.origins()));
    }
    if (createPoolOptions.monitor() != null) {
      contentJson.addProperty("monitor", createPoolOptions.monitor());
    }
    if (createPoolOptions.notificationChannel() != null) {
      contentJson.addProperty("notification_channel", createPoolOptions.notificationChannel());
    }
    if (createPoolOptions.healthcheckRegion() != null) {
      contentJson.addProperty("healthcheck_region", createPoolOptions.healthcheckRegion());
    }
    if (createPoolOptions.healthcheckSubnets() != null) {
      contentJson.add("healthcheck_subnets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPoolOptions.healthcheckSubnets()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Pool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Pool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer pool.
   *
   * Delete a load balancer pool.
   *
   * @param deletePoolOptions the {@link DeletePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePool(DeletePoolOptions deletePoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePoolOptions,
      "deletePoolOptions cannot be null");
    String[] pathSegments = { "instances", "pools" };
    String[] pathParameters = { deletePoolOptions.instanceId(), deletePoolOptions.poolId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deletePool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deletePoolOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deletePoolOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a load balancer pool.
   *
   * Get details of a load balancer pool.
   *
   * @param getPoolOptions the {@link GetPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> getPool(GetPoolOptions getPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPoolOptions,
      "getPoolOptions cannot be null");
    String[] pathSegments = { "instances", "pools" };
    String[] pathParameters = { getPoolOptions.instanceId(), getPoolOptions.poolId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getPool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPoolOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getPoolOptions.xCorrelationId());
    }
    ResponseConverter<Pool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Pool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a load balancer pool.
   *
   * Update the properties of a load balancer pool.
   *
   * @param updatePoolOptions the {@link UpdatePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> updatePool(UpdatePoolOptions updatePoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePoolOptions,
      "updatePoolOptions cannot be null");
    String[] pathSegments = { "instances", "pools" };
    String[] pathParameters = { updatePoolOptions.instanceId(), updatePoolOptions.poolId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updatePool");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updatePoolOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updatePoolOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updatePoolOptions.name() != null) {
      contentJson.addProperty("name", updatePoolOptions.name());
    }
    if (updatePoolOptions.description() != null) {
      contentJson.addProperty("description", updatePoolOptions.description());
    }
    if (updatePoolOptions.enabled() != null) {
      contentJson.addProperty("enabled", updatePoolOptions.enabled());
    }
    if (updatePoolOptions.healthyOriginsThreshold() != null) {
      contentJson.addProperty("healthy_origins_threshold", updatePoolOptions.healthyOriginsThreshold());
    }
    if (updatePoolOptions.origins() != null) {
      contentJson.add("origins", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePoolOptions.origins()));
    }
    if (updatePoolOptions.monitor() != null) {
      contentJson.addProperty("monitor", updatePoolOptions.monitor());
    }
    if (updatePoolOptions.notificationChannel() != null) {
      contentJson.addProperty("notification_channel", updatePoolOptions.notificationChannel());
    }
    if (updatePoolOptions.healthcheckRegion() != null) {
      contentJson.addProperty("healthcheck_region", updatePoolOptions.healthcheckRegion());
    }
    if (updatePoolOptions.healthcheckSubnets() != null) {
      contentJson.add("healthcheck_subnets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePoolOptions.healthcheckSubnets()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Pool> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Pool>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List load balancer monitors.
   *
   * List the load balancer monitors.
   *
   * @param listMonitorsOptions the {@link ListMonitorsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListMonitors}
   */
  public ServiceCall<ListMonitors> listMonitors(ListMonitorsOptions listMonitorsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMonitorsOptions,
      "listMonitorsOptions cannot be null");
    String[] pathSegments = { "instances", "monitors" };
    String[] pathParameters = { listMonitorsOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listMonitors");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMonitorsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listMonitorsOptions.xCorrelationId());
    }
    ResponseConverter<ListMonitors> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListMonitors>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a load balancer monitor.
   *
   * Create a load balancer monitor.
   *
   * @param createMonitorOptions the {@link CreateMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> createMonitor(CreateMonitorOptions createMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMonitorOptions,
      "createMonitorOptions cannot be null");
    String[] pathSegments = { "instances", "monitors" };
    String[] pathParameters = { createMonitorOptions.instanceId() };
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMonitorOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createMonitorOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createMonitorOptions.name() != null) {
      contentJson.addProperty("name", createMonitorOptions.name());
    }
    if (createMonitorOptions.description() != null) {
      contentJson.addProperty("description", createMonitorOptions.description());
    }
    if (createMonitorOptions.type() != null) {
      contentJson.addProperty("type", createMonitorOptions.type());
    }
    if (createMonitorOptions.port() != null) {
      contentJson.addProperty("port", createMonitorOptions.port());
    }
    if (createMonitorOptions.interval() != null) {
      contentJson.addProperty("interval", createMonitorOptions.interval());
    }
    if (createMonitorOptions.retries() != null) {
      contentJson.addProperty("retries", createMonitorOptions.retries());
    }
    if (createMonitorOptions.timeout() != null) {
      contentJson.addProperty("timeout", createMonitorOptions.timeout());
    }
    if (createMonitorOptions.method() != null) {
      contentJson.addProperty("method", createMonitorOptions.method());
    }
    if (createMonitorOptions.path() != null) {
      contentJson.addProperty("path", createMonitorOptions.path());
    }
    if (createMonitorOptions.headers() != null) {
      contentJson.add("headers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMonitorOptions.headers()));
    }
    if (createMonitorOptions.allowInsecure() != null) {
      contentJson.addProperty("allow_insecure", createMonitorOptions.allowInsecure());
    }
    if (createMonitorOptions.expectedCodes() != null) {
      contentJson.addProperty("expected_codes", createMonitorOptions.expectedCodes());
    }
    if (createMonitorOptions.expectedBody() != null) {
      contentJson.addProperty("expected_body", createMonitorOptions.expectedBody());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Monitor> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Monitor>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a load balancer monitor.
   *
   * Delete a load balancer monitor.
   *
   * @param deleteMonitorOptions the {@link DeleteMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteMonitor(DeleteMonitorOptions deleteMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMonitorOptions,
      "deleteMonitorOptions cannot be null");
    String[] pathSegments = { "instances", "monitors" };
    String[] pathParameters = { deleteMonitorOptions.instanceId(), deleteMonitorOptions.monitorId() };
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteMonitorOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteMonitorOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a load balancer monitor.
   *
   * Get details of a load balancer monitor.
   *
   * @param getMonitorOptions the {@link GetMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> getMonitor(GetMonitorOptions getMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMonitorOptions,
      "getMonitorOptions cannot be null");
    String[] pathSegments = { "instances", "monitors" };
    String[] pathParameters = { getMonitorOptions.instanceId(), getMonitorOptions.monitorId() };
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMonitorOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getMonitorOptions.xCorrelationId());
    }
    ResponseConverter<Monitor> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Monitor>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a load balancer monitor.
   *
   * Update the properties of a load balancer monitor.
   *
   * @param updateMonitorOptions the {@link UpdateMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> updateMonitor(UpdateMonitorOptions updateMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMonitorOptions,
      "updateMonitorOptions cannot be null");
    String[] pathSegments = { "instances", "monitors" };
    String[] pathParameters = { updateMonitorOptions.instanceId(), updateMonitorOptions.monitorId() };
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.constructHttpUrl(getServiceUrl(), pathSegments, pathParameters));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateMonitor");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMonitorOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateMonitorOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateMonitorOptions.name() != null) {
      contentJson.addProperty("name", updateMonitorOptions.name());
    }
    if (updateMonitorOptions.description() != null) {
      contentJson.addProperty("description", updateMonitorOptions.description());
    }
    if (updateMonitorOptions.type() != null) {
      contentJson.addProperty("type", updateMonitorOptions.type());
    }
    if (updateMonitorOptions.port() != null) {
      contentJson.addProperty("port", updateMonitorOptions.port());
    }
    if (updateMonitorOptions.interval() != null) {
      contentJson.addProperty("interval", updateMonitorOptions.interval());
    }
    if (updateMonitorOptions.retries() != null) {
      contentJson.addProperty("retries", updateMonitorOptions.retries());
    }
    if (updateMonitorOptions.timeout() != null) {
      contentJson.addProperty("timeout", updateMonitorOptions.timeout());
    }
    if (updateMonitorOptions.method() != null) {
      contentJson.addProperty("method", updateMonitorOptions.method());
    }
    if (updateMonitorOptions.path() != null) {
      contentJson.addProperty("path", updateMonitorOptions.path());
    }
    if (updateMonitorOptions.headers() != null) {
      contentJson.add("headers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateMonitorOptions.headers()));
    }
    if (updateMonitorOptions.allowInsecure() != null) {
      contentJson.addProperty("allow_insecure", updateMonitorOptions.allowInsecure());
    }
    if (updateMonitorOptions.expectedCodes() != null) {
      contentJson.addProperty("expected_codes", updateMonitorOptions.expectedCodes());
    }
    if (updateMonitorOptions.expectedBody() != null) {
      contentJson.addProperty("expected_body", updateMonitorOptions.expectedBody());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Monitor> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Monitor>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
