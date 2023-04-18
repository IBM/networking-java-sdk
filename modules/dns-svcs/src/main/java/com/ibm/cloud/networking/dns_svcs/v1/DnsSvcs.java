/*
 * (C) Copyright IBM Corp. 2022.
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
 * IBM OpenAPI SDK Code Generator Version: 3.46.0-a4e29da0-20220224-210428
 */

package com.ibm.cloud.networking.dns_svcs.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.networking.common.SdkCommon;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequest;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequestsList;
import com.ibm.cloud.networking.dns_svcs.v1.model.AddCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateXfrRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolver;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolverList;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteXfrRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.Dnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.ExportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRule;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRuleList;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneAccessRequestOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLinkedPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetXfrRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsResp;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedZone;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedZonesList;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListCustomResolversOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszoneAccessRequestsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszones;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListForwardingRulesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLinkedPermittedNetworksOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListLinkedZonesOptions;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.ListXfrRulesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancer;
import com.ibm.cloud.networking.dns_svcs.v1.model.Location;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.UnlinkPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCrLocationsOrderOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneAccessRequestOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateXfrRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrRule;
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrRuleList;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * DNS Services API.
 *
 * API Version: 1.0.0
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
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listDnszonesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones", pathParamsMap));
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
   * Create DNS zone.
   *
   * Create a DNS zone for a given service instance.
   *
   * @param createDnszoneOptions the {@link CreateDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> createDnszone(CreateDnszoneOptions createDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDnszoneOptions,
      "createDnszoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createDnszoneOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones", pathParamsMap));
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
   * Delete DNS zone.
   *
   * Delete a DNS zone.
   *
   * @param deleteDnszoneOptions the {@link DeleteDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDnszone(DeleteDnszoneOptions deleteDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDnszoneOptions,
      "deleteDnszoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteDnszoneOptions.instanceId());
    pathParamsMap.put("dnszone_id", deleteDnszoneOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}", pathParamsMap));
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
   * Get DNS zone.
   *
   * Get details of a DNS zone.
   *
   * @param getDnszoneOptions the {@link GetDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> getDnszone(GetDnszoneOptions getDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDnszoneOptions,
      "getDnszoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getDnszoneOptions.instanceId());
    pathParamsMap.put("dnszone_id", getDnszoneOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}", pathParamsMap));
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
   * Update DNS zone.
   *
   * Update the properties of a DNS zone.
   *
   * @param updateDnszoneOptions the {@link UpdateDnszoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dnszone}
   */
  public ServiceCall<Dnszone> updateDnszone(UpdateDnszoneOptions updateDnszoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDnszoneOptions,
      "updateDnszoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateDnszoneOptions.instanceId());
    pathParamsMap.put("dnszone_id", updateDnszoneOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}", pathParamsMap));
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
   * List resource records.
   *
   * List the Resource Records for a given DNS zone.
   *
   * @param listResourceRecordsOptions the {@link ListResourceRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListResourceRecords}
   */
  public ServiceCall<ListResourceRecords> listResourceRecords(ListResourceRecordsOptions listResourceRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listResourceRecordsOptions,
      "listResourceRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listResourceRecordsOptions.instanceId());
    pathParamsMap.put("dnszone_id", listResourceRecordsOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/resource_records", pathParamsMap));
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
   * Create resource record.
   *
   * Create a resource record for a given DNS zone.
   *
   * @param createResourceRecordOptions the {@link CreateResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> createResourceRecord(CreateResourceRecordOptions createResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createResourceRecordOptions,
      "createResourceRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createResourceRecordOptions.instanceId());
    pathParamsMap.put("dnszone_id", createResourceRecordOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/resource_records", pathParamsMap));
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
   * Delete resource record.
   *
   * Delete a resource record.
   *
   * @param deleteResourceRecordOptions the {@link DeleteResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteResourceRecord(DeleteResourceRecordOptions deleteResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteResourceRecordOptions,
      "deleteResourceRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteResourceRecordOptions.instanceId());
    pathParamsMap.put("dnszone_id", deleteResourceRecordOptions.dnszoneId());
    pathParamsMap.put("record_id", deleteResourceRecordOptions.recordId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/resource_records/{record_id}", pathParamsMap));
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
   * Get resource record.
   *
   * Get details of a resource record.
   *
   * @param getResourceRecordOptions the {@link GetResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> getResourceRecord(GetResourceRecordOptions getResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourceRecordOptions,
      "getResourceRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getResourceRecordOptions.instanceId());
    pathParamsMap.put("dnszone_id", getResourceRecordOptions.dnszoneId());
    pathParamsMap.put("record_id", getResourceRecordOptions.recordId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/resource_records/{record_id}", pathParamsMap));
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
   * Update resource record.
   *
   * Update the properties of a resource record.
   *
   * @param updateResourceRecordOptions the {@link UpdateResourceRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceRecord}
   */
  public ServiceCall<ResourceRecord> updateResourceRecord(UpdateResourceRecordOptions updateResourceRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateResourceRecordOptions,
      "updateResourceRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateResourceRecordOptions.instanceId());
    pathParamsMap.put("dnszone_id", updateResourceRecordOptions.dnszoneId());
    pathParamsMap.put("record_id", updateResourceRecordOptions.recordId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/resource_records/{record_id}", pathParamsMap));
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
   * Export resource records to a zone file.
   *
   * Export resource records to a zone file.
   *
   * @param exportResourceRecordsOptions the {@link ExportResourceRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> exportResourceRecords(ExportResourceRecordsOptions exportResourceRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(exportResourceRecordsOptions,
      "exportResourceRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", exportResourceRecordsOptions.instanceId());
    pathParamsMap.put("dnszone_id", exportResourceRecordsOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/export_resource_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "exportResourceRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "text/plain; charset=utf-8");
    if (exportResourceRecordsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", exportResourceRecordsOptions.xCorrelationId());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import resource records from a zone file. The maximum size of a zone file is 8MB.
   *
   * Import resource records from a zone file.
   *
   * @param importResourceRecordsOptions the {@link ImportResourceRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ImportResourceRecordsResp}
   */
  public ServiceCall<ImportResourceRecordsResp> importResourceRecords(ImportResourceRecordsOptions importResourceRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importResourceRecordsOptions,
      "importResourceRecordsOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((importResourceRecordsOptions.file() != null), "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", importResourceRecordsOptions.instanceId());
    pathParamsMap.put("dnszone_id", importResourceRecordsOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/import_resource_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "importResourceRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (importResourceRecordsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", importResourceRecordsOptions.xCorrelationId());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (importResourceRecordsOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(importResourceRecordsOptions.file(), importResourceRecordsOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<ImportResourceRecordsResp> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ImportResourceRecordsResp>() { }.getType());
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
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listPermittedNetworksOptions.instanceId());
    pathParamsMap.put("dnszone_id", listPermittedNetworksOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/permitted_networks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listPermittedNetworks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPermittedNetworksOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listPermittedNetworksOptions.xCorrelationId());
    }
    ResponseConverter<ListPermittedNetworks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPermittedNetworks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create permitted network.
   *
   * Create a permitted network for a given DNS zone.
   *
   * @param createPermittedNetworkOptions the {@link CreatePermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> createPermittedNetwork(CreatePermittedNetworkOptions createPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPermittedNetworkOptions,
      "createPermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createPermittedNetworkOptions.instanceId());
    pathParamsMap.put("dnszone_id", createPermittedNetworkOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/permitted_networks", pathParamsMap));
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
   * Remove permitted network.
   *
   * Remove a permitted network.
   *
   * @param deletePermittedNetworkOptions the {@link DeletePermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> deletePermittedNetwork(DeletePermittedNetworkOptions deletePermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePermittedNetworkOptions,
      "deletePermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deletePermittedNetworkOptions.instanceId());
    pathParamsMap.put("dnszone_id", deletePermittedNetworkOptions.dnszoneId());
    pathParamsMap.put("permitted_network_id", deletePermittedNetworkOptions.permittedNetworkId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/permitted_networks/{permitted_network_id}", pathParamsMap));
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
   * Get permitted network.
   *
   * Get details of a permitted network.
   *
   * @param getPermittedNetworkOptions the {@link GetPermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> getPermittedNetwork(GetPermittedNetworkOptions getPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPermittedNetworkOptions,
      "getPermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getPermittedNetworkOptions.instanceId());
    pathParamsMap.put("dnszone_id", getPermittedNetworkOptions.dnszoneId());
    pathParamsMap.put("permitted_network_id", getPermittedNetworkOptions.permittedNetworkId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/permitted_networks/{permitted_network_id}", pathParamsMap));
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
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listLoadBalancersOptions.instanceId());
    pathParamsMap.put("dnszone_id", listLoadBalancersOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/load_balancers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listLoadBalancers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listLoadBalancersOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listLoadBalancersOptions.xCorrelationId());
    }
    if (listLoadBalancersOptions.offset() != null) {
      builder.query("offset", String.valueOf(listLoadBalancersOptions.offset()));
    }
    if (listLoadBalancersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listLoadBalancersOptions.limit()));
    }
    ResponseConverter<ListLoadBalancers> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListLoadBalancers>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create load balancer.
   *
   * Create a load balancer for a given DNS zone.
   *
   * @param createLoadBalancerOptions the {@link CreateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> createLoadBalancer(CreateLoadBalancerOptions createLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLoadBalancerOptions,
      "createLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createLoadBalancerOptions.instanceId());
    pathParamsMap.put("dnszone_id", createLoadBalancerOptions.dnszoneId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/load_balancers", pathParamsMap));
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
   * Delete load balancer.
   *
   * Delete a load balancer.
   *
   * @param deleteLoadBalancerOptions the {@link DeleteLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLoadBalancer(DeleteLoadBalancerOptions deleteLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLoadBalancerOptions,
      "deleteLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteLoadBalancerOptions.instanceId());
    pathParamsMap.put("dnszone_id", deleteLoadBalancerOptions.dnszoneId());
    pathParamsMap.put("lb_id", deleteLoadBalancerOptions.lbId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/load_balancers/{lb_id}", pathParamsMap));
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
   * Get load balancer.
   *
   * Get details of a load balancer.
   *
   * @param getLoadBalancerOptions the {@link GetLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> getLoadBalancer(GetLoadBalancerOptions getLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLoadBalancerOptions,
      "getLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getLoadBalancerOptions.instanceId());
    pathParamsMap.put("dnszone_id", getLoadBalancerOptions.dnszoneId());
    pathParamsMap.put("lb_id", getLoadBalancerOptions.lbId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/load_balancers/{lb_id}", pathParamsMap));
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
   * Update load balancer.
   *
   * Update the properties of a load balancer.
   *
   * @param updateLoadBalancerOptions the {@link UpdateLoadBalancerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LoadBalancer}
   */
  public ServiceCall<LoadBalancer> updateLoadBalancer(UpdateLoadBalancerOptions updateLoadBalancerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLoadBalancerOptions,
      "updateLoadBalancerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateLoadBalancerOptions.instanceId());
    pathParamsMap.put("dnszone_id", updateLoadBalancerOptions.dnszoneId());
    pathParamsMap.put("lb_id", updateLoadBalancerOptions.lbId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/dnszones/{dnszone_id}/load_balancers/{lb_id}", pathParamsMap));
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
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listPoolsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/pools", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listPools");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPoolsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listPoolsOptions.xCorrelationId());
    }
    if (listPoolsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listPoolsOptions.offset()));
    }
    if (listPoolsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPoolsOptions.limit()));
    }
    ResponseConverter<ListPools> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPools>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create load balancer pool.
   *
   * Create a load balancer pool.
   *
   * @param createPoolOptions the {@link CreatePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> createPool(CreatePoolOptions createPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPoolOptions,
      "createPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createPoolOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/pools", pathParamsMap));
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
   * Delete load balancer pool.
   *
   * Delete a load balancer pool.
   *
   * @param deletePoolOptions the {@link DeletePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePool(DeletePoolOptions deletePoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePoolOptions,
      "deletePoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deletePoolOptions.instanceId());
    pathParamsMap.put("pool_id", deletePoolOptions.poolId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/pools/{pool_id}", pathParamsMap));
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
   * Get load balancer pool.
   *
   * Get details of a load balancer pool.
   *
   * @param getPoolOptions the {@link GetPoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> getPool(GetPoolOptions getPoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPoolOptions,
      "getPoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getPoolOptions.instanceId());
    pathParamsMap.put("pool_id", getPoolOptions.poolId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/pools/{pool_id}", pathParamsMap));
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
   * Update load balancer pool.
   *
   * Update the properties of a load balancer pool.
   *
   * @param updatePoolOptions the {@link UpdatePoolOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Pool}
   */
  public ServiceCall<Pool> updatePool(UpdatePoolOptions updatePoolOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePoolOptions,
      "updatePoolOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updatePoolOptions.instanceId());
    pathParamsMap.put("pool_id", updatePoolOptions.poolId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/pools/{pool_id}", pathParamsMap));
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
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listMonitorsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/monitors", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listMonitors");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listMonitorsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listMonitorsOptions.xCorrelationId());
    }
    if (listMonitorsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listMonitorsOptions.offset()));
    }
    if (listMonitorsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listMonitorsOptions.limit()));
    }
    ResponseConverter<ListMonitors> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListMonitors>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create load balancer monitor.
   *
   * Create a load balancer monitor.
   *
   * @param createMonitorOptions the {@link CreateMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> createMonitor(CreateMonitorOptions createMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMonitorOptions,
      "createMonitorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createMonitorOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/monitors", pathParamsMap));
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
   * Delete load balancer monitor.
   *
   * Delete a load balancer monitor.
   *
   * @param deleteMonitorOptions the {@link DeleteMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteMonitor(DeleteMonitorOptions deleteMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMonitorOptions,
      "deleteMonitorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteMonitorOptions.instanceId());
    pathParamsMap.put("monitor_id", deleteMonitorOptions.monitorId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/monitors/{monitor_id}", pathParamsMap));
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
   * Get load balancer monitor.
   *
   * Get details of a load balancer monitor.
   *
   * @param getMonitorOptions the {@link GetMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> getMonitor(GetMonitorOptions getMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMonitorOptions,
      "getMonitorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getMonitorOptions.instanceId());
    pathParamsMap.put("monitor_id", getMonitorOptions.monitorId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/monitors/{monitor_id}", pathParamsMap));
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
   * Update load balancer monitor.
   *
   * Update the properties of a load balancer monitor.
   *
   * @param updateMonitorOptions the {@link UpdateMonitorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Monitor}
   */
  public ServiceCall<Monitor> updateMonitor(UpdateMonitorOptions updateMonitorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMonitorOptions,
      "updateMonitorOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateMonitorOptions.instanceId());
    pathParamsMap.put("monitor_id", updateMonitorOptions.monitorId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/monitors/{monitor_id}", pathParamsMap));
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

  /**
   * List custom resolvers.
   *
   * List the custom resolvers.
   *
   * @param listCustomResolversOptions the {@link ListCustomResolversOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomResolverList}
   */
  public ServiceCall<CustomResolverList> listCustomResolvers(ListCustomResolversOptions listCustomResolversOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCustomResolversOptions,
      "listCustomResolversOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listCustomResolversOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listCustomResolvers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCustomResolversOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listCustomResolversOptions.xCorrelationId());
    }
    ResponseConverter<CustomResolverList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomResolverList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a custom resolver.
   *
   * Create a custom resolver.
   *
   * @param createCustomResolverOptions the {@link CreateCustomResolverOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomResolver}
   */
  public ServiceCall<CustomResolver> createCustomResolver(CreateCustomResolverOptions createCustomResolverOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCustomResolverOptions,
      "createCustomResolverOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createCustomResolverOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createCustomResolver");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createCustomResolverOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createCustomResolverOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createCustomResolverOptions.name() != null) {
      contentJson.addProperty("name", createCustomResolverOptions.name());
    }
    if (createCustomResolverOptions.description() != null) {
      contentJson.addProperty("description", createCustomResolverOptions.description());
    }
    if (createCustomResolverOptions.locations() != null) {
      contentJson.add("locations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCustomResolverOptions.locations()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomResolver> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomResolver>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a custom resolver.
   *
   * Delete a custom resolver.
   *
   * @param deleteCustomResolverOptions the {@link DeleteCustomResolverOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCustomResolver(DeleteCustomResolverOptions deleteCustomResolverOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCustomResolverOptions,
      "deleteCustomResolverOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteCustomResolverOptions.instanceId());
    pathParamsMap.put("resolver_id", deleteCustomResolverOptions.resolverId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteCustomResolver");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCustomResolverOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteCustomResolverOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a custom resolver.
   *
   * Get details of a custom resolver.
   *
   * @param getCustomResolverOptions the {@link GetCustomResolverOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomResolver}
   */
  public ServiceCall<CustomResolver> getCustomResolver(GetCustomResolverOptions getCustomResolverOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCustomResolverOptions,
      "getCustomResolverOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getCustomResolverOptions.instanceId());
    pathParamsMap.put("resolver_id", getCustomResolverOptions.resolverId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getCustomResolver");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCustomResolverOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getCustomResolverOptions.xCorrelationId());
    }
    ResponseConverter<CustomResolver> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomResolver>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a custom resolver.
   *
   * Update the properties of a custom resolver.
   *
   * @param updateCustomResolverOptions the {@link UpdateCustomResolverOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomResolver}
   */
  public ServiceCall<CustomResolver> updateCustomResolver(UpdateCustomResolverOptions updateCustomResolverOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCustomResolverOptions,
      "updateCustomResolverOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateCustomResolverOptions.instanceId());
    pathParamsMap.put("resolver_id", updateCustomResolverOptions.resolverId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateCustomResolver");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateCustomResolverOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateCustomResolverOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateCustomResolverOptions.name() != null) {
      contentJson.addProperty("name", updateCustomResolverOptions.name());
    }
    if (updateCustomResolverOptions.description() != null) {
      contentJson.addProperty("description", updateCustomResolverOptions.description());
    }
    if (updateCustomResolverOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateCustomResolverOptions.enabled());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomResolver> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomResolver>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the locations order of a custom resolver.
   *
   * Update the locations order of a custom resolver.
   *
   * @param updateCrLocationsOrderOptions the {@link UpdateCrLocationsOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CustomResolver}
   */
  public ServiceCall<CustomResolver> updateCrLocationsOrder(UpdateCrLocationsOrderOptions updateCrLocationsOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCrLocationsOrderOptions,
      "updateCrLocationsOrderOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateCrLocationsOrderOptions.instanceId());
    pathParamsMap.put("resolver_id", updateCrLocationsOrderOptions.resolverId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/locations_order", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateCrLocationsOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateCrLocationsOrderOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateCrLocationsOrderOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateCrLocationsOrderOptions.locations() != null) {
      contentJson.add("locations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCrLocationsOrderOptions.locations()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CustomResolver> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CustomResolver>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add custom resolver location.
   *
   * Add custom resolver location.
   *
   * @param addCustomResolverLocationOptions the {@link AddCustomResolverLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Location}
   */
  public ServiceCall<Location> addCustomResolverLocation(AddCustomResolverLocationOptions addCustomResolverLocationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addCustomResolverLocationOptions,
      "addCustomResolverLocationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", addCustomResolverLocationOptions.instanceId());
    pathParamsMap.put("resolver_id", addCustomResolverLocationOptions.resolverId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/locations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "addCustomResolverLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addCustomResolverLocationOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", addCustomResolverLocationOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (addCustomResolverLocationOptions.subnetCrn() != null) {
      contentJson.addProperty("subnet_crn", addCustomResolverLocationOptions.subnetCrn());
    }
    if (addCustomResolverLocationOptions.enabled() != null) {
      contentJson.addProperty("enabled", addCustomResolverLocationOptions.enabled());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Location> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Location>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update custom resolver location.
   *
   * Update custom resolver location.
   *
   * @param updateCustomResolverLocationOptions the {@link UpdateCustomResolverLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Location}
   */
  public ServiceCall<Location> updateCustomResolverLocation(UpdateCustomResolverLocationOptions updateCustomResolverLocationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCustomResolverLocationOptions,
      "updateCustomResolverLocationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateCustomResolverLocationOptions.instanceId());
    pathParamsMap.put("resolver_id", updateCustomResolverLocationOptions.resolverId());
    pathParamsMap.put("location_id", updateCustomResolverLocationOptions.locationId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/locations/{location_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateCustomResolverLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateCustomResolverLocationOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateCustomResolverLocationOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateCustomResolverLocationOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateCustomResolverLocationOptions.enabled());
    }
    if (updateCustomResolverLocationOptions.subnetCrn() != null) {
      contentJson.addProperty("subnet_crn", updateCustomResolverLocationOptions.subnetCrn());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Location> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Location>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete custom resolver location.
   *
   * Delete custom resolver location.
   *
   * @param deleteCustomResolverLocationOptions the {@link DeleteCustomResolverLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCustomResolverLocation(DeleteCustomResolverLocationOptions deleteCustomResolverLocationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCustomResolverLocationOptions,
      "deleteCustomResolverLocationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteCustomResolverLocationOptions.instanceId());
    pathParamsMap.put("resolver_id", deleteCustomResolverLocationOptions.resolverId());
    pathParamsMap.put("location_id", deleteCustomResolverLocationOptions.locationId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/locations/{location_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteCustomResolverLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCustomResolverLocationOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteCustomResolverLocationOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List forwarding rules.
   *
   * List the forwarding rules of the given custom resolver.
   *
   * @param listForwardingRulesOptions the {@link ListForwardingRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ForwardingRuleList}
   */
  public ServiceCall<ForwardingRuleList> listForwardingRules(ListForwardingRulesOptions listForwardingRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listForwardingRulesOptions,
      "listForwardingRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listForwardingRulesOptions.instanceId());
    pathParamsMap.put("resolver_id", listForwardingRulesOptions.resolverId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/forwarding_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listForwardingRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listForwardingRulesOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listForwardingRulesOptions.xCorrelationId());
    }
    ResponseConverter<ForwardingRuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ForwardingRuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a forwarding rule.
   *
   * Create a forwarding rule for the given custom resolver.
   *
   * @param createForwardingRuleOptions the {@link CreateForwardingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ForwardingRule}
   */
  public ServiceCall<ForwardingRule> createForwardingRule(CreateForwardingRuleOptions createForwardingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createForwardingRuleOptions,
      "createForwardingRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createForwardingRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", createForwardingRuleOptions.resolverId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/forwarding_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createForwardingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createForwardingRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createForwardingRuleOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createForwardingRuleOptions.description() != null) {
      contentJson.addProperty("description", createForwardingRuleOptions.description());
    }
    if (createForwardingRuleOptions.type() != null) {
      contentJson.addProperty("type", createForwardingRuleOptions.type());
    }
    if (createForwardingRuleOptions.match() != null) {
      contentJson.addProperty("match", createForwardingRuleOptions.match());
    }
    if (createForwardingRuleOptions.forwardTo() != null) {
      contentJson.add("forward_to", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createForwardingRuleOptions.forwardTo()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ForwardingRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ForwardingRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a forwarding rule.
   *
   * Delete a forwarding rule on the given custom resolver.
   *
   * @param deleteForwardingRuleOptions the {@link DeleteForwardingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteForwardingRule(DeleteForwardingRuleOptions deleteForwardingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteForwardingRuleOptions,
      "deleteForwardingRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteForwardingRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", deleteForwardingRuleOptions.resolverId());
    pathParamsMap.put("rule_id", deleteForwardingRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/forwarding_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteForwardingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteForwardingRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteForwardingRuleOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a forwarding rule.
   *
   * Get details of a forwarding rule on the given custom resolver.
   *
   * @param getForwardingRuleOptions the {@link GetForwardingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ForwardingRule}
   */
  public ServiceCall<ForwardingRule> getForwardingRule(GetForwardingRuleOptions getForwardingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getForwardingRuleOptions,
      "getForwardingRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getForwardingRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", getForwardingRuleOptions.resolverId());
    pathParamsMap.put("rule_id", getForwardingRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/forwarding_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getForwardingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getForwardingRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getForwardingRuleOptions.xCorrelationId());
    }
    ResponseConverter<ForwardingRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ForwardingRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a forwarding rule.
   *
   * Update the properties of a forwarding rule on the given custom resolver.
   *
   * @param updateForwardingRuleOptions the {@link UpdateForwardingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ForwardingRule}
   */
  public ServiceCall<ForwardingRule> updateForwardingRule(UpdateForwardingRuleOptions updateForwardingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateForwardingRuleOptions,
      "updateForwardingRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateForwardingRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", updateForwardingRuleOptions.resolverId());
    pathParamsMap.put("rule_id", updateForwardingRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/forwarding_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateForwardingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateForwardingRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateForwardingRuleOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateForwardingRuleOptions.description() != null) {
      contentJson.addProperty("description", updateForwardingRuleOptions.description());
    }
    if (updateForwardingRuleOptions.match() != null) {
      contentJson.addProperty("match", updateForwardingRuleOptions.match());
    }
    if (updateForwardingRuleOptions.forwardTo() != null) {
      contentJson.add("forward_to", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateForwardingRuleOptions.forwardTo()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ForwardingRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ForwardingRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an XFR rule.
   *
   * Create an XFR rule for a given custom resolver.
   *
   * @param createXfrRuleOptions the {@link CreateXfrRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link XfrRule}
   */
  public ServiceCall<XfrRule> createXfrRule(CreateXfrRuleOptions createXfrRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createXfrRuleOptions,
      "createXfrRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createXfrRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", createXfrRuleOptions.resolverId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/xfr_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createXfrRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createXfrRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createXfrRuleOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createXfrRuleOptions.description() != null) {
      contentJson.addProperty("description", createXfrRuleOptions.description());
    }
    if (createXfrRuleOptions.zone() != null) {
      contentJson.addProperty("zone", createXfrRuleOptions.zone());
    }
    if (createXfrRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", createXfrRuleOptions.enabled());
    }
    if (createXfrRuleOptions.transferFrom() != null) {
      contentJson.add("transfer_from", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createXfrRuleOptions.transferFrom()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<XfrRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<XfrRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List XFR rules.
   *
   * List XFR rules on a given custom resolver.
   *
   * @param listXfrRulesOptions the {@link ListXfrRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link XfrRuleList}
   */
  public ServiceCall<XfrRuleList> listXfrRules(ListXfrRulesOptions listXfrRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listXfrRulesOptions,
      "listXfrRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listXfrRulesOptions.instanceId());
    pathParamsMap.put("resolver_id", listXfrRulesOptions.resolverId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/xfr_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listXfrRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listXfrRulesOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listXfrRulesOptions.xCorrelationId());
    }
    if (listXfrRulesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listXfrRulesOptions.offset()));
    }
    if (listXfrRulesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listXfrRulesOptions.limit()));
    }
    ResponseConverter<XfrRuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<XfrRuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an XFR rule.
   *
   * Get details of an XFR rule on the given custom resolver.
   *
   * @param getXfrRuleOptions the {@link GetXfrRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link XfrRule}
   */
  public ServiceCall<XfrRule> getXfrRule(GetXfrRuleOptions getXfrRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getXfrRuleOptions,
      "getXfrRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getXfrRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", getXfrRuleOptions.resolverId());
    pathParamsMap.put("rule_id", getXfrRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/xfr_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getXfrRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getXfrRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getXfrRuleOptions.xCorrelationId());
    }
    ResponseConverter<XfrRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<XfrRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an XFR rule.
   *
   * Update the properties of an XFR rule on the given custom resolver.
   *
   * @param updateXfrRuleOptions the {@link UpdateXfrRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link XfrRule}
   */
  public ServiceCall<XfrRule> updateXfrRule(UpdateXfrRuleOptions updateXfrRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateXfrRuleOptions,
      "updateXfrRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateXfrRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", updateXfrRuleOptions.resolverId());
    pathParamsMap.put("rule_id", updateXfrRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/xfr_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateXfrRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateXfrRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateXfrRuleOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateXfrRuleOptions.description() != null) {
      contentJson.addProperty("description", updateXfrRuleOptions.description());
    }
    if (updateXfrRuleOptions.enabled() != null) {
      contentJson.addProperty("enabled", updateXfrRuleOptions.enabled());
    }
    if (updateXfrRuleOptions.transferFrom() != null) {
      contentJson.add("transfer_from", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateXfrRuleOptions.transferFrom()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<XfrRule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<XfrRule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an XFR rule.
   *
   * Delete an XFR rule on the given custom resolver.
   *
   * @param deleteXfrRuleOptions the {@link DeleteXfrRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteXfrRule(DeleteXfrRuleOptions deleteXfrRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteXfrRuleOptions,
      "deleteXfrRuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteXfrRuleOptions.instanceId());
    pathParamsMap.put("resolver_id", deleteXfrRuleOptions.resolverId());
    pathParamsMap.put("rule_id", deleteXfrRuleOptions.ruleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/custom_resolvers/{resolver_id}/xfr_rules/{rule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteXfrRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteXfrRuleOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteXfrRuleOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List linked zones.
   *
   * List linked zones in requestor's instance.
   *
   * @param listLinkedZonesOptions the {@link ListLinkedZonesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LinkedZonesList}
   */
  public ServiceCall<LinkedZonesList> listLinkedZones(ListLinkedZonesOptions listLinkedZonesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLinkedZonesOptions,
      "listLinkedZonesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listLinkedZonesOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listLinkedZones");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listLinkedZonesOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listLinkedZonesOptions.xCorrelationId());
    }
    if (listLinkedZonesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listLinkedZonesOptions.offset()));
    }
    if (listLinkedZonesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listLinkedZonesOptions.limit()));
    }
    ResponseConverter<LinkedZonesList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LinkedZonesList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a linked zone.
   *
   * Create a linked zone.
   *
   * @param createLinkedZoneOptions the {@link CreateLinkedZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LinkedZone}
   */
  public ServiceCall<LinkedZone> createLinkedZone(CreateLinkedZoneOptions createLinkedZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createLinkedZoneOptions,
      "createLinkedZoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createLinkedZoneOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "createLinkedZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createLinkedZoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", createLinkedZoneOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (createLinkedZoneOptions.ownerInstanceId() != null) {
      contentJson.addProperty("owner_instance_id", createLinkedZoneOptions.ownerInstanceId());
    }
    if (createLinkedZoneOptions.ownerZoneId() != null) {
      contentJson.addProperty("owner_zone_id", createLinkedZoneOptions.ownerZoneId());
    }
    if (createLinkedZoneOptions.description() != null) {
      contentJson.addProperty("description", createLinkedZoneOptions.description());
    }
    if (createLinkedZoneOptions.label() != null) {
      contentJson.addProperty("label", createLinkedZoneOptions.label());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LinkedZone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LinkedZone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a linked zone.
   *
   * Get details of a linked zone.
   *
   * @param getLinkedZoneOptions the {@link GetLinkedZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LinkedZone}
   */
  public ServiceCall<LinkedZone> getLinkedZone(GetLinkedZoneOptions getLinkedZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLinkedZoneOptions,
      "getLinkedZoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getLinkedZoneOptions.instanceId());
    pathParamsMap.put("lz_id", getLinkedZoneOptions.lzId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getLinkedZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getLinkedZoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getLinkedZoneOptions.xCorrelationId());
    }
    ResponseConverter<LinkedZone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LinkedZone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the properties of a linked zone.
   *
   * Update the properties of a linked zone.
   *
   * @param updateLinkedZoneOptions the {@link UpdateLinkedZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LinkedZone}
   */
  public ServiceCall<LinkedZone> updateLinkedZone(UpdateLinkedZoneOptions updateLinkedZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateLinkedZoneOptions,
      "updateLinkedZoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateLinkedZoneOptions.instanceId());
    pathParamsMap.put("lz_id", updateLinkedZoneOptions.lzId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateLinkedZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateLinkedZoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateLinkedZoneOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateLinkedZoneOptions.description() != null) {
      contentJson.addProperty("description", updateLinkedZoneOptions.description());
    }
    if (updateLinkedZoneOptions.label() != null) {
      contentJson.addProperty("label", updateLinkedZoneOptions.label());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<LinkedZone> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LinkedZone>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a linked zone.
   *
   * Delete a linked zone.
   *
   * @param deleteLinkedZoneOptions the {@link DeleteLinkedZoneOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteLinkedZone(DeleteLinkedZoneOptions deleteLinkedZoneOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteLinkedZoneOptions,
      "deleteLinkedZoneOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteLinkedZoneOptions.instanceId());
    pathParamsMap.put("lz_id", deleteLinkedZoneOptions.lzId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "deleteLinkedZone");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteLinkedZoneOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", deleteLinkedZoneOptions.xCorrelationId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Access Requests.
   *
   * List access requests in owner's instance.
   *
   * @param listDnszoneAccessRequestsOptions the {@link ListDnszoneAccessRequestsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessRequestsList}
   */
  public ServiceCall<AccessRequestsList> listDnszoneAccessRequests(ListDnszoneAccessRequestsOptions listDnszoneAccessRequestsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDnszoneAccessRequestsOptions,
      "listDnszoneAccessRequestsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listDnszoneAccessRequestsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/access_requests", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listDnszoneAccessRequests");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDnszoneAccessRequestsOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listDnszoneAccessRequestsOptions.xCorrelationId());
    }
    if (listDnszoneAccessRequestsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDnszoneAccessRequestsOptions.offset()));
    }
    if (listDnszoneAccessRequestsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDnszoneAccessRequestsOptions.limit()));
    }
    ResponseConverter<AccessRequestsList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessRequestsList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get an access request.
   *
   * Get details of an access request.
   *
   * @param getDnszoneAccessRequestOptions the {@link GetDnszoneAccessRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessRequest}
   */
  public ServiceCall<AccessRequest> getDnszoneAccessRequest(GetDnszoneAccessRequestOptions getDnszoneAccessRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDnszoneAccessRequestOptions,
      "getDnszoneAccessRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getDnszoneAccessRequestOptions.instanceId());
    pathParamsMap.put("request_id", getDnszoneAccessRequestOptions.requestId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/access_requests/{request_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getDnszoneAccessRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDnszoneAccessRequestOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getDnszoneAccessRequestOptions.xCorrelationId());
    }
    ResponseConverter<AccessRequest> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessRequest>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an access request.
   *
   * Update the state of an access request.
   *
   * @param updateDnszoneAccessRequestOptions the {@link UpdateDnszoneAccessRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AccessRequest}
   */
  public ServiceCall<AccessRequest> updateDnszoneAccessRequest(UpdateDnszoneAccessRequestOptions updateDnszoneAccessRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDnszoneAccessRequestOptions,
      "updateDnszoneAccessRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateDnszoneAccessRequestOptions.instanceId());
    pathParamsMap.put("request_id", updateDnszoneAccessRequestOptions.requestId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/access_requests/{request_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "updateDnszoneAccessRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDnszoneAccessRequestOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", updateDnszoneAccessRequestOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateDnszoneAccessRequestOptions.action() != null) {
      contentJson.addProperty("action", updateDnszoneAccessRequestOptions.action());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AccessRequest> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AccessRequest>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List permitted networks.
   *
   * List the permitted networks for a linked zone.
   *
   * @param listLinkedPermittedNetworksOptions the {@link ListLinkedPermittedNetworksOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListPermittedNetworks}
   */
  public ServiceCall<ListPermittedNetworks> listLinkedPermittedNetworks(ListLinkedPermittedNetworksOptions listLinkedPermittedNetworksOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listLinkedPermittedNetworksOptions,
      "listLinkedPermittedNetworksOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listLinkedPermittedNetworksOptions.instanceId());
    pathParamsMap.put("lz_id", listLinkedPermittedNetworksOptions.lzId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}/permitted_networks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "listLinkedPermittedNetworks");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listLinkedPermittedNetworksOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", listLinkedPermittedNetworksOptions.xCorrelationId());
    }
    ResponseConverter<ListPermittedNetworks> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPermittedNetworks>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a permitted network.
   *
   * Create a permitted network for a linked zone.
   *
   * @param linkPermittedNetworkOptions the {@link LinkPermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> linkPermittedNetwork(LinkPermittedNetworkOptions linkPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(linkPermittedNetworkOptions,
      "linkPermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", linkPermittedNetworkOptions.instanceId());
    pathParamsMap.put("lz_id", linkPermittedNetworkOptions.lzId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}/permitted_networks", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "linkPermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (linkPermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", linkPermittedNetworkOptions.xCorrelationId());
    }
    final JsonObject contentJson = new JsonObject();
    if (linkPermittedNetworkOptions.type() != null) {
      contentJson.addProperty("type", linkPermittedNetworkOptions.type());
    }
    if (linkPermittedNetworkOptions.permittedNetwork() != null) {
      contentJson.add("permitted_network", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(linkPermittedNetworkOptions.permittedNetwork()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove a permitted network.
   *
   * Remove a permitted network from a linked zone.
   *
   * @param unlinkPermittedNetworkOptions the {@link UnlinkPermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> unlinkPermittedNetwork(UnlinkPermittedNetworkOptions unlinkPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(unlinkPermittedNetworkOptions,
      "unlinkPermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", unlinkPermittedNetworkOptions.instanceId());
    pathParamsMap.put("lz_id", unlinkPermittedNetworkOptions.lzId());
    pathParamsMap.put("permitted_network_id", unlinkPermittedNetworkOptions.permittedNetworkId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}/permitted_networks/{permitted_network_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "unlinkPermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (unlinkPermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", unlinkPermittedNetworkOptions.xCorrelationId());
    }
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a permitted network.
   *
   * Get a permitted network of a linked zone.
   *
   * @param getLinkedPermittedNetworkOptions the {@link GetLinkedPermittedNetworkOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PermittedNetwork}
   */
  public ServiceCall<PermittedNetwork> getLinkedPermittedNetwork(GetLinkedPermittedNetworkOptions getLinkedPermittedNetworkOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getLinkedPermittedNetworkOptions,
      "getLinkedPermittedNetworkOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getLinkedPermittedNetworkOptions.instanceId());
    pathParamsMap.put("lz_id", getLinkedPermittedNetworkOptions.lzId());
    pathParamsMap.put("permitted_network_id", getLinkedPermittedNetworkOptions.permittedNetworkId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instances/{instance_id}/linked_dnszones/{lz_id}/permitted_networks/{permitted_network_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dns_svcs", "v1", "getLinkedPermittedNetwork");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getLinkedPermittedNetworkOptions.xCorrelationId() != null) {
      builder.header("X-Correlation-ID", getLinkedPermittedNetworkOptions.xCorrelationId());
    }
    ResponseConverter<PermittedNetwork> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PermittedNetwork>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
