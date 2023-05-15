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
package com.ibm.cloud.networking.dns_svcs.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.dns_svcs.v1.DnsSvcs;
import com.ibm.cloud.networking.dns_svcs.v1.model.AddCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolver;
import com.ibm.cloud.networking.dns_svcs.v1.model.CustomResolverList;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeletePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.DeleteResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.Dnszone;
import com.ibm.cloud.networking.dns_svcs.v1.model.ExportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.FirstHref;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRule;
import com.ibm.cloud.networking.dns_svcs.v1.model.ForwardingRuleList;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetPoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.GetResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsResp;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListCustomResolversOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszones;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListDnszonesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ListForwardingRulesOptions;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancerAzPoolsItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.Location;
import com.ibm.cloud.networking.dns_svcs.v1.model.LocationInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.NextHref;
import com.ibm.cloud.networking.dns_svcs.v1.model.Origin;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetworkVpc;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdata;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataAaaaRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataCnameRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataPtrRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataTxtRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdata;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataAaaaRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataCnameRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataPtrRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataTxtRecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateDnszoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateMonitorOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;

import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DnsSvcs service.
 */
public class DnsSvcsTest

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DnsSvcs dnsSvcsService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    dnsSvcsService = DnsSvcs.newInstance(serviceName);
    String url = server.url("/").toString();
    dnsSvcsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new DnsSvcs(serviceName, null);
  }

  @Test
  public void testListDnszonesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"dnszones\": [{\"id\": \"example.com:2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}], \"offset\": 0, \"limit\": 10, \"total_count\": 10, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listDnszonesPath = java.net.URLEncoder.encode("/instances/testString/dnszones", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDnszonesOptions model
    ListDnszonesOptions listDnszonesOptionsModel = new ListDnszonesOptions.Builder()
    .instanceId("testString")
    .xCorrelationId("testString")
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("200"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListDnszones> response = dnsSvcsService.listDnszones(listDnszonesOptionsModel).execute();
    assertNotNull(response);
    ListDnszones responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDnszonesPath);
  }

  // Test the listDnszones operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDnszonesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listDnszones(null).execute();
  }

  @Test
  public void testCreateDnszoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"example.com:2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String createDnszonePath = java.net.URLEncoder.encode("/instances/testString/dnszones", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateDnszoneOptions model
    CreateDnszoneOptions createDnszoneOptionsModel = new CreateDnszoneOptions.Builder()
    .instanceId("testString")
    .name("example.com")
    .description("The DNS zone is used for VPCs in us-east region")
    .label("us-east")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dnszone> response = dnsSvcsService.createDnszone(createDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDnszonePath);
  }

  // Test the createDnszone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDnszoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createDnszone(null).execute();
  }

  @Test
  public void testDeleteDnszoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteDnszonePath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDnszoneOptions model
    DeleteDnszoneOptions deleteDnszoneOptionsModel = new DeleteDnszoneOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteDnszone(deleteDnszoneOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDnszonePath);
  }

  // Test the deleteDnszone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDnszoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteDnszone(null).execute();
  }

  @Test
  public void testGetDnszoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"example.com:2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String getDnszonePath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDnszoneOptions model
    GetDnszoneOptions getDnszoneOptionsModel = new GetDnszoneOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dnszone> response = dnsSvcsService.getDnszone(getDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDnszonePath);
  }

  // Test the getDnszone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDnszoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getDnszone(null).execute();
  }

  @Test
  public void testUpdateDnszoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"example.com:2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String updateDnszonePath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateDnszoneOptions model
    UpdateDnszoneOptions updateDnszoneOptionsModel = new UpdateDnszoneOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .description("The DNS zone is used for VPCs in us-east region")
    .label("us-east")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dnszone> response = dnsSvcsService.updateDnszone(updateDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDnszonePath);
  }

  // Test the updateDnszone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnszoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateDnszone(null).execute();
  }

  @Test
  public void testListResourceRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"resource_records\": [{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}], \"offset\": 0, \"limit\": 20, \"total_count\": 200, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listResourceRecordsPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/resource_records", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListResourceRecordsOptions model
    ListResourceRecordsOptions listResourceRecordsOptionsModel = new ListResourceRecordsOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("200"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListResourceRecords> response = dnsSvcsService.listResourceRecords(listResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    ListResourceRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceRecordsPath);
  }

  // Test the listResourceRecords operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListResourceRecordsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listResourceRecords(null).execute();
  }

  @Test
  public void testCreateResourceRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String createResourceRecordPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/resource_records", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceRecordInputRdataRdataARecord model
    ResourceRecordInputRdataRdataARecord resourceRecordInputRdataModel = new ResourceRecordInputRdataRdataARecord.Builder()
    .ip("10.110.201.214")
    .build();

    // Construct an instance of the CreateResourceRecordOptions model
    CreateResourceRecordOptions createResourceRecordOptionsModel = new CreateResourceRecordOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .name("test.example.com")
    .type("SRV")
    .rdata(resourceRecordInputRdataModel)
    .ttl(Long.valueOf("120"))
    .service("_sip")
    .protocol("udp")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceRecord> response = dnsSvcsService.createResourceRecord(createResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createResourceRecordPath);
  }

  // Test the createResourceRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateResourceRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createResourceRecord(null).execute();
  }

  @Test
  public void testDeleteResourceRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteResourceRecordPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/resource_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteResourceRecordOptions model
    DeleteResourceRecordOptions deleteResourceRecordOptionsModel = new DeleteResourceRecordOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .recordId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteResourceRecord(deleteResourceRecordOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteResourceRecordPath);
  }

  // Test the deleteResourceRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteResourceRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteResourceRecord(null).execute();
  }

  @Test
  public void testGetResourceRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String getResourceRecordPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/resource_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetResourceRecordOptions model
    GetResourceRecordOptions getResourceRecordOptionsModel = new GetResourceRecordOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .recordId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceRecord> response = dnsSvcsService.getResourceRecord(getResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getResourceRecordPath);
  }

  // Test the getResourceRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetResourceRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getResourceRecord(null).execute();
  }

  @Test
  public void testUpdateResourceRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String updateResourceRecordPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/resource_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceRecordUpdateInputRdataRdataARecord model
    ResourceRecordUpdateInputRdataRdataARecord resourceRecordUpdateInputRdataModel = new ResourceRecordUpdateInputRdataRdataARecord.Builder()
    .ip("10.110.201.214")
    .build();

    // Construct an instance of the UpdateResourceRecordOptions model
    UpdateResourceRecordOptions updateResourceRecordOptionsModel = new UpdateResourceRecordOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .recordId("testString")
    .name("test.example.com")
    .rdata(resourceRecordUpdateInputRdataModel)
    .ttl(Long.valueOf("120"))
    .service("_sip")
    .protocol("udp")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceRecord> response = dnsSvcsService.updateResourceRecord(updateResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateResourceRecordPath);
  }

  // Test the updateResourceRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateResourceRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateResourceRecord(null).execute();
  }
  
  @Test
  public void testExportResourceRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
    String exportResourceRecordsPath = "/instances/testString/dnszones/testString/export_resource_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "text/plain; charset=utf-8")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExportResourceRecordsOptions model
    ExportResourceRecordsOptions exportResourceRecordsOptionsModel = new ExportResourceRecordsOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = dnsSvcsService.exportResourceRecords(exportResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, exportResourceRecordsPath);
  }

  // Test the exportResourceRecords operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExportResourceRecordsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.exportResourceRecords(null).execute();
  }

  @Test
  public void testImportResourceRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_records_parsed\": 10, \"records_added\": 2, \"records_failed\": 0, \"records_added_by_type\": {\"A\": 10, \"AAAA\": 10, \"CNAME\": 10, \"SRV\": 10, \"TXT\": 10, \"MX\": 10, \"PTR\": 10}, \"records_failed_by_type\": {\"A\": 10, \"AAAA\": 10, \"CNAME\": 10, \"SRV\": 10, \"TXT\": 10, \"MX\": 10, \"PTR\": 10}, \"messages\": [{\"code\": \"conflict\", \"message\": \"A type record conflict with other records\"}], \"errors\": [{\"resource_record\": \"test.example.com A 1.1.1.1\", \"error\": {\"code\": \"internal_server_error\", \"message\": \"An internal error occurred. Try again later.\"}}]}";
    String importResourceRecordsPath = "/instances/testString/dnszones/testString/import_resource_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ImportResourceRecordsOptions model
    ImportResourceRecordsOptions importResourceRecordsOptionsModel = new ImportResourceRecordsOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .file(TestUtilities.createMockStream("This is a mock file."))
    .fileContentType("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ImportResourceRecordsResp> response = dnsSvcsService.importResourceRecords(importResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    ImportResourceRecordsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

      // Check query
     Map<String, String> query = TestUtilities.parseQueryString(request);
     assertNull(query);

      // Check request path
     String parsedPath = TestUtilities.parseReqPath(request);
     assertEquals(parsedPath, importResourceRecordsPath);
   }

    // Test the importResourceRecords operation with null options model parameter
   @Test(expectedExceptions = IllegalArgumentException.class)
   public void testImportResourceRecordsNoOptions() throws Throwable {
     // construct the service
     constructClientService();

      server.enqueue(new MockResponse());

      // Invoke operation with null options model (negative test)
     dnsSvcsService.importResourceRecords(null).execute();
   }

  @Test
  public void testListPermittedNetworksWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"permitted_networks\": [{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}], \"offset\": 0, \"limit\": 10, \"total_count\": 200, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listPermittedNetworksPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/permitted_networks", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListPermittedNetworksOptions model
    ListPermittedNetworksOptions listPermittedNetworksOptionsModel = new ListPermittedNetworksOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("200"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListPermittedNetworks> response = dnsSvcsService.listPermittedNetworks(listPermittedNetworksOptionsModel).execute();
    assertNotNull(response);
    ListPermittedNetworks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPermittedNetworksPath);
  }

  // Test the listPermittedNetworks operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPermittedNetworksNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listPermittedNetworks(null).execute();
  }

  @Test
  public void testCreatePermittedNetworkWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String createPermittedNetworkPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/permitted_networks", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PermittedNetworkVpc model
    PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
    .vpcCrn("crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6")
    .build();

    // Construct an instance of the CreatePermittedNetworkOptions model
    CreatePermittedNetworkOptions createPermittedNetworkOptionsModel = new CreatePermittedNetworkOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .type("vpc")
    .permittedNetwork(permittedNetworkVpcModel)
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PermittedNetwork> response = dnsSvcsService.createPermittedNetwork(createPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPermittedNetworkPath);
  }

  // Test the createPermittedNetwork operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePermittedNetworkNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createPermittedNetwork(null).execute();
  }

  @Test
  public void testDeletePermittedNetworkWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String deletePermittedNetworkPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/permitted_networks/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeletePermittedNetworkOptions model
    DeletePermittedNetworkOptions deletePermittedNetworkOptionsModel = new DeletePermittedNetworkOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .permittedNetworkId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PermittedNetwork> response = dnsSvcsService.deletePermittedNetwork(deletePermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePermittedNetworkPath);
  }

  // Test the deletePermittedNetwork operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePermittedNetworkNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deletePermittedNetwork(null).execute();
  }

  @Test
  public void testGetPermittedNetworkWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String getPermittedNetworkPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/permitted_networks/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPermittedNetworkOptions model
    GetPermittedNetworkOptions getPermittedNetworkOptionsModel = new GetPermittedNetworkOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .permittedNetworkId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PermittedNetwork> response = dnsSvcsService.getPermittedNetwork(getPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPermittedNetworkPath);
  }

  // Test the getPermittedNetwork operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPermittedNetworkNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getPermittedNetwork(null).execute();
  }

  @Test
  public void testListLoadBalancersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"load_balancers\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 1, \"limit\": 20, \"count\": 1, \"total_count\": 200, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listLoadBalancersPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLoadBalancersOptions model
    ListLoadBalancersOptions listLoadBalancersOptionsModel = new ListLoadBalancersOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListLoadBalancers> response = dnsSvcsService.listLoadBalancers(listLoadBalancersOptionsModel).execute();
    assertNotNull(response);
    ListLoadBalancers responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancersPath);
  }

  // Test the listLoadBalancers operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listLoadBalancers(null).execute();
  }

  @Test
  public void testCreateLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createLoadBalancerPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/load_balancers", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerAzPoolsItem model
    LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
    .availabilityZone("us-south-1")
    .pools(new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")))
    .build();

    // Construct an instance of the CreateLoadBalancerOptions model
    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .name("glb.example.com")
    .description("Load balancer for glb.example.com.")
    .enabled(true)
    .ttl(Long.valueOf("120"))
    .fallbackPool("24ccf79a-4ae0-4769-b4c8-17f8f230072e")
    .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = dnsSvcsService.createLoadBalancer(createLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerPath);
  }

  // Test the createLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createLoadBalancer(null).execute();
  }

  @Test
  public void testDeleteLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteLoadBalancerPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteLoadBalancerOptions model
    DeleteLoadBalancerOptions deleteLoadBalancerOptionsModel = new DeleteLoadBalancerOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .lbId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteLoadBalancer(deleteLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerPath);
  }

  // Test the deleteLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteLoadBalancer(null).execute();
  }

  @Test
  public void testGetLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getLoadBalancerPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLoadBalancerOptions model
    GetLoadBalancerOptions getLoadBalancerOptionsModel = new GetLoadBalancerOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .lbId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = dnsSvcsService.getLoadBalancer(getLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerPath);
  }

  // Test the getLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getLoadBalancer(null).execute();
  }

  @Test
  public void testUpdateLoadBalancerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updateLoadBalancerPath = java.net.URLEncoder.encode("/instances/testString/dnszones/testString/load_balancers/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LoadBalancerAzPoolsItem model
    LoadBalancerAzPoolsItem loadBalancerAzPoolsItemModel = new LoadBalancerAzPoolsItem.Builder()
    .availabilityZone("us-south-1")
    .pools(new java.util.ArrayList<String>(java.util.Arrays.asList("0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d")))
    .build();

    // Construct an instance of the UpdateLoadBalancerOptions model
    UpdateLoadBalancerOptions updateLoadBalancerOptionsModel = new UpdateLoadBalancerOptions.Builder()
    .instanceId("testString")
    .dnszoneId("testString")
    .lbId("testString")
    .name("glb.example.com")
    .description("Load balancer for glb.example.com.")
    .enabled(true)
    .ttl(Long.valueOf("120"))
    .fallbackPool("24ccf79a-4ae0-4769-b4c8-17f8f230072e")
    .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LoadBalancer> response = dnsSvcsService.updateLoadBalancer(updateLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerPath);
  }

  // Test the updateLoadBalancer operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateLoadBalancer(null).execute();
  }

  @Test
  public void testListPoolsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"pools\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 1, \"limit\": 20, \"count\": 1, \"total_count\": 200, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listPoolsPath = java.net.URLEncoder.encode("/instances/testString/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListPoolsOptions model
    ListPoolsOptions listPoolsOptionsModel = new ListPoolsOptions.Builder()
    .instanceId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListPools> response = dnsSvcsService.listPools(listPoolsOptionsModel).execute();
    assertNotNull(response);
    ListPools responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPoolsPath);
  }

  // Test the listPools operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPoolsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listPools(null).execute();
  }

  @Test
  public void testCreatePoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createPoolPath = java.net.URLEncoder.encode("/instances/testString/pools", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the OriginInput model
    OriginInput originInputModel = new OriginInput.Builder()
    .name("app-server-1")
    .description("description of the origin server")
    .address("10.10.16.8")
    .enabled(true)
    .build();

    // Construct an instance of the CreatePoolOptions model
    CreatePoolOptions createPoolOptionsModel = new CreatePoolOptions.Builder()
    .instanceId("testString")
    .name("dal10-az-pool")
    .description("Load balancer pool for dal10 availability zone.")
    .enabled(true)
    .healthyOriginsThreshold(Long.valueOf("1"))
    .origins(new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)))
    .monitor("7dd6841c-264e-11ea-88df-062967242a6a")
    .notificationChannel("https://mywebsite.com/dns/webhook")
    .healthcheckRegion("us-south")
    .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Pool> response = dnsSvcsService.createPool(createPoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPoolPath);
  }

  // Test the createPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createPool(null).execute();
  }

  @Test
  public void testDeletePoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deletePoolPath = java.net.URLEncoder.encode("/instances/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeletePoolOptions model
    DeletePoolOptions deletePoolOptionsModel = new DeletePoolOptions.Builder()
    .instanceId("testString")
    .poolId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deletePool(deletePoolOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePoolPath);
  }

  // Test the deletePool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deletePool(null).execute();
  }

  @Test
  public void testGetPoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getPoolPath = java.net.URLEncoder.encode("/instances/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPoolOptions model
    GetPoolOptions getPoolOptionsModel = new GetPoolOptions.Builder()
    .instanceId("testString")
    .poolId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Pool> response = dnsSvcsService.getPool(getPoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPoolPath);
  }

  // Test the getPool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getPool(null).execute();
  }

  @Test
  public void testUpdatePoolWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updatePoolPath = java.net.URLEncoder.encode("/instances/testString/pools/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the OriginInput model
    OriginInput originInputModel = new OriginInput.Builder()
    .name("app-server-1")
    .description("description of the origin server")
    .address("10.10.16.8")
    .enabled(true)
    .build();

    // Construct an instance of the UpdatePoolOptions model
    UpdatePoolOptions updatePoolOptionsModel = new UpdatePoolOptions.Builder()
    .instanceId("testString")
    .poolId("testString")
    .name("dal10-az-pool")
    .description("Load balancer pool for dal10 availability zone.")
    .enabled(true)
    .healthyOriginsThreshold(Long.valueOf("1"))
    .origins(new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)))
    .monitor("7dd6841c-264e-11ea-88df-062967242a6a")
    .notificationChannel("https://mywebsite.com/dns/webhook")
    .healthcheckRegion("us-south")
    .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Pool> response = dnsSvcsService.updatePool(updatePoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePoolPath);
  }

  // Test the updatePool operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePoolNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updatePool(null).execute();
  }

  @Test
  public void testListMonitorsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"monitors\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 1, \"limit\": 20, \"count\": 1, \"total_count\": 200, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?limit=20\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones/example.com:d04d3a7a-7f6d-47d4-b811-08c5478fa1a4/resource_records?offset=20&limit=20\"}}";
    String listMonitorsPath = java.net.URLEncoder.encode("/instances/testString/monitors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListMonitorsOptions model
    ListMonitorsOptions listMonitorsOptionsModel = new ListMonitorsOptions.Builder()
    .instanceId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListMonitors> response = dnsSvcsService.listMonitors(listMonitorsOptionsModel).execute();
    assertNotNull(response);
    ListMonitors responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMonitorsPath);
  }

  // Test the listMonitors operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMonitorsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listMonitors(null).execute();
  }

  @Test
  public void testCreateMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createMonitorPath = java.net.URLEncoder.encode("/instances/testString/monitors", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the HealthcheckHeader model
    HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
    .name("Host")
    .value(new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")))
    .build();

    // Construct an instance of the CreateMonitorOptions model
    CreateMonitorOptions createMonitorOptionsModel = new CreateMonitorOptions.Builder()
    .instanceId("testString")
    .name("healthcheck-monitor")
    .description("Load balancer monitor for glb.example.com.")
    .type("HTTPS")
    .port(Long.valueOf("8080"))
    .interval(Long.valueOf("60"))
    .retries(Long.valueOf("2"))
    .timeout(Long.valueOf("5"))
    .method("GET")
    .path("/health")
    .headers(new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)))
    .allowInsecure(false)
    .expectedCodes("200")
    .expectedBody("alive")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Monitor> response = dnsSvcsService.createMonitor(createMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMonitorPath);
  }

  // Test the createMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createMonitor(null).execute();
  }

  @Test
  public void testDeleteMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteMonitorPath = java.net.URLEncoder.encode("/instances/testString/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteMonitorOptions model
    DeleteMonitorOptions deleteMonitorOptionsModel = new DeleteMonitorOptions.Builder()
    .instanceId("testString")
    .monitorId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteMonitor(deleteMonitorOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMonitorPath);
  }

  // Test the deleteMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteMonitor(null).execute();
  }

  @Test
  public void testGetMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getMonitorPath = java.net.URLEncoder.encode("/instances/testString/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMonitorOptions model
    GetMonitorOptions getMonitorOptionsModel = new GetMonitorOptions.Builder()
    .instanceId("testString")
    .monitorId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Monitor> response = dnsSvcsService.getMonitor(getMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMonitorPath);
  }

  // Test the getMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getMonitor(null).execute();
  }

  @Test
  public void testUpdateMonitorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updateMonitorPath = java.net.URLEncoder.encode("/instances/testString/monitors/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the HealthcheckHeader model
    HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
    .name("Host")
    .value(new java.util.ArrayList<String>(java.util.Arrays.asList("origin.example.com")))
    .build();

    // Construct an instance of the UpdateMonitorOptions model
    UpdateMonitorOptions updateMonitorOptionsModel = new UpdateMonitorOptions.Builder()
    .instanceId("testString")
    .monitorId("testString")
    .name("healthcheck-monitor")
    .description("Load balancer monitor for glb.example.com.")
    .type("HTTPS")
    .port(Long.valueOf("8080"))
    .interval(Long.valueOf("60"))
    .retries(Long.valueOf("2"))
    .timeout(Long.valueOf("5"))
    .method("GET")
    .path("/health")
    .headers(new java.util.ArrayList<HealthcheckHeader>(java.util.Arrays.asList(healthcheckHeaderModel)))
    .allowInsecure(false)
    .expectedCodes("200")
    .expectedBody("alive")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Monitor> response = dnsSvcsService.updateMonitor(updateMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMonitorPath);
  }

  // Test the updateMonitor operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMonitorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateMonitor(null).execute();
  }

  @Test
  public void testListCustomResolversWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"custom_resolvers\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}]}";
    String listCustomResolversPath = "/instances/testString/custom_resolvers";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCustomResolversOptions model
    ListCustomResolversOptions listCustomResolversOptionsModel = new ListCustomResolversOptions.Builder()
    .instanceId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomResolverList> response = dnsSvcsService.listCustomResolvers(listCustomResolversOptionsModel).execute();
    assertNotNull(response);
    CustomResolverList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCustomResolversPath);
  }

  // Test the listCustomResolvers operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCustomResolversNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listCustomResolvers(null).execute();
  }

  @Test
  public void testCreateCustomResolverWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String createCustomResolverPath = "/instances/testString/custom_resolvers";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LocationInput model
    LocationInput locationInputModel = new LocationInput.Builder()
    .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
    .enabled(false)
    .build();

    // Construct an instance of the CreateCustomResolverOptions model
    CreateCustomResolverOptions createCustomResolverOptionsModel = new CreateCustomResolverOptions.Builder()
    .instanceId("testString")
    .name("my-resolver")
    .description("custom resolver")
    .locations(new java.util.ArrayList<LocationInput>(java.util.Arrays.asList(locationInputModel)))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomResolver> response = dnsSvcsService.createCustomResolver(createCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCustomResolverPath);
  }

  // Test the createCustomResolver operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCustomResolverNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createCustomResolver(null).execute();
  }

  @Test
  public void testDeleteCustomResolverWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCustomResolverPath = "/instances/testString/custom_resolvers/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCustomResolverOptions model
    DeleteCustomResolverOptions deleteCustomResolverOptionsModel = new DeleteCustomResolverOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteCustomResolver(deleteCustomResolverOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomResolverPath);
  }

  // Test the deleteCustomResolver operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCustomResolverNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteCustomResolver(null).execute();
  }

  @Test
  public void testGetCustomResolverWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String getCustomResolverPath = "/instances/testString/custom_resolvers/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCustomResolverOptions model
    GetCustomResolverOptions getCustomResolverOptionsModel = new GetCustomResolverOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomResolver> response = dnsSvcsService.getCustomResolver(getCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCustomResolverPath);
  }

  // Test the getCustomResolver operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCustomResolverNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getCustomResolver(null).execute();
  }

  @Test
  public void testUpdateCustomResolverWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String updateCustomResolverPath = "/instances/testString/custom_resolvers/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateCustomResolverOptions model
    UpdateCustomResolverOptions updateCustomResolverOptionsModel = new UpdateCustomResolverOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .name("my-resolver")
    .description("custom resolver")
    .enabled(false)
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomResolver> response = dnsSvcsService.updateCustomResolver(updateCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomResolverPath);
  }

  // Test the updateCustomResolver operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateCustomResolver(null).execute();
  }

  @Test
  public void testAddCustomResolverLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}";
    String addCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AddCustomResolverLocationOptions model
    AddCustomResolverLocationOptions addCustomResolverLocationOptionsModel = new AddCustomResolverLocationOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
    .enabled(false)
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Location> response = dnsSvcsService.addCustomResolverLocation(addCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Location responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addCustomResolverLocationPath);
  }

  // Test the addCustomResolverLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddCustomResolverLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.addCustomResolverLocation(null).execute();
  }

  @Test
  public void testUpdateCustomResolverLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}";
    String updateCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateCustomResolverLocationOptions model
    UpdateCustomResolverLocationOptions updateCustomResolverLocationOptionsModel = new UpdateCustomResolverLocationOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .locationId("testString")
    .enabled(false)
    .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Location> response = dnsSvcsService.updateCustomResolverLocation(updateCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Location responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomResolverLocationPath);
  }

  // Test the updateCustomResolverLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateCustomResolverLocation(null).execute();
  }

  @Test
  public void testDeleteCustomResolverLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCustomResolverLocationOptions model
    DeleteCustomResolverLocationOptions deleteCustomResolverLocationOptionsModel = new DeleteCustomResolverLocationOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .locationId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteCustomResolverLocation(deleteCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomResolverLocationPath);
  }

  // Test the deleteCustomResolverLocation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCustomResolverLocationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteCustomResolverLocation(null).execute();
  }

  @Test
  public void testListForwardingRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"forwarding_rules\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}]}";
    String listForwardingRulesPath = "/instances/testString/custom_resolvers/testString/forwarding_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListForwardingRulesOptions model
    ListForwardingRulesOptions listForwardingRulesOptionsModel = new ListForwardingRulesOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ForwardingRuleList> response = dnsSvcsService.listForwardingRules(listForwardingRulesOptionsModel).execute();
    assertNotNull(response);
    ForwardingRuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listForwardingRulesPath);
  }

  // Test the listForwardingRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListForwardingRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.listForwardingRules(null).execute();
  }

  @Test
  public void testCreateForwardingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String createForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateForwardingRuleOptions model
    CreateForwardingRuleOptions createForwardingRuleOptionsModel = new CreateForwardingRuleOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .description("forwarding rule")
    .type("zone")
    .match("example.com")
    .forwardTo(new java.util.ArrayList<String>(java.util.Arrays.asList("161.26.0.7")))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ForwardingRule> response = dnsSvcsService.createForwardingRule(createForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createForwardingRulePath);
  }

  // Test the createForwardingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateForwardingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.createForwardingRule(null).execute();
  }

  @Test
  public void testDeleteForwardingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteForwardingRuleOptions model
    DeleteForwardingRuleOptions deleteForwardingRuleOptionsModel = new DeleteForwardingRuleOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .ruleId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = dnsSvcsService.deleteForwardingRule(deleteForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteForwardingRulePath);
  }

  // Test the deleteForwardingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteForwardingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.deleteForwardingRule(null).execute();
  }

  @Test
  public void testGetForwardingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String getForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetForwardingRuleOptions model
    GetForwardingRuleOptions getForwardingRuleOptionsModel = new GetForwardingRuleOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .ruleId("testString")
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ForwardingRule> response = dnsSvcsService.getForwardingRule(getForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getForwardingRulePath);
  }

  // Test the getForwardingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetForwardingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.getForwardingRule(null).execute();
  }

  @Test
  public void testUpdateForwardingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String updateForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateForwardingRuleOptions model
    UpdateForwardingRuleOptions updateForwardingRuleOptionsModel = new UpdateForwardingRuleOptions.Builder()
    .instanceId("testString")
    .resolverId("testString")
    .ruleId("testString")
    .description("forwarding rule")
    .match("example.com")
    .forwardTo(new java.util.ArrayList<String>(java.util.Arrays.asList("161.26.0.7")))
    .xCorrelationId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ForwardingRule> response = dnsSvcsService.updateForwardingRule(updateForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateForwardingRulePath);
  }

  // Test the updateForwardingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateForwardingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsSvcsService.updateForwardingRule(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    dnsSvcsService = null;
  }
}