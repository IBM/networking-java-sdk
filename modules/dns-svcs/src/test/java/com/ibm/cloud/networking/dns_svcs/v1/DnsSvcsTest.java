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
package com.ibm.cloud.networking.dns_svcs.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.dns_svcs.v1.DnsSvcs;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequest;
import com.ibm.cloud.networking.dns_svcs.v1.model.AccessRequestRequestor;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsResp;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkPermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedZone;
import com.ibm.cloud.networking.dns_svcs.v1.model.LinkedZoneLinkedTo;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.LoadBalancerAzPoolsItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.Location;
import com.ibm.cloud.networking.dns_svcs.v1.model.LocationInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.Monitor;
import com.ibm.cloud.networking.dns_svcs.v1.model.Origin;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.model.PaginationRef;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetwork;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetworkVpc;
import com.ibm.cloud.networking.dns_svcs.v1.model.Pool;
import com.ibm.cloud.networking.dns_svcs.v1.model.PoolHealthcheckVsisItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordStatsByType;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportErrorModel;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportErrorModelError;
import com.ibm.cloud.networking.dns_svcs.v1.model.RecordsImportMessageModel;
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
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrRuleInputTransferFromItem;
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrRuleList;
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrSourceOutputItem;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DnsSvcs service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class DnsSvcsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DnsSvcs dnsSvcsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new DnsSvcs(serviceName, null);
  }

  // Test the listDnszones operation with a valid options model parameter
  @Test
  public void testListDnszonesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"dnszones\": [{\"id\": \"2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listDnszonesPath = "/instances/testString/dnszones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDnszonesOptions model
    ListDnszonesOptions listDnszonesOptionsModel = new ListDnszonesOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listDnszones() with a valid options model and verify the result
    Response<ListDnszones> response = dnsSvcsService.listDnszones(listDnszonesOptionsModel).execute();
    assertNotNull(response);
    ListDnszones responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDnszonesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listDnszones operation with and without retries enabled
  @Test
  public void testListDnszonesWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListDnszonesWOptions();

    dnsSvcsService.disableRetries();
    testListDnszonesWOptions();
  }

  // Test the listDnszones operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDnszonesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listDnszones(null).execute();
  }

  // Test the createDnszone operation with a valid options model parameter
  @Test
  public void testCreateDnszoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String createDnszonePath = "/instances/testString/dnszones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDnszoneOptions model
    CreateDnszoneOptions createDnszoneOptionsModel = new CreateDnszoneOptions.Builder()
      .instanceId("testString")
      .name("example.com")
      .description("The DNS zone is used for VPCs in us-east region")
      .label("us-east")
      .xCorrelationId("testString")
      .build();

    // Invoke createDnszone() with a valid options model and verify the result
    Response<Dnszone> response = dnsSvcsService.createDnszone(createDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDnszonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDnszone operation with and without retries enabled
  @Test
  public void testCreateDnszoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateDnszoneWOptions();

    dnsSvcsService.disableRetries();
    testCreateDnszoneWOptions();
  }

  // Test the createDnszone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDnszoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createDnszone(null).execute();
  }

  // Test the deleteDnszone operation with a valid options model parameter
  @Test
  public void testDeleteDnszoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDnszonePath = "/instances/testString/dnszones/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDnszoneOptions model
    DeleteDnszoneOptions deleteDnszoneOptionsModel = new DeleteDnszoneOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteDnszone() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteDnszone(deleteDnszoneOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDnszonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDnszone operation with and without retries enabled
  @Test
  public void testDeleteDnszoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteDnszoneWOptions();

    dnsSvcsService.disableRetries();
    testDeleteDnszoneWOptions();
  }

  // Test the deleteDnszone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDnszoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteDnszone(null).execute();
  }

  // Test the getDnszone operation with a valid options model parameter
  @Test
  public void testGetDnszoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String getDnszonePath = "/instances/testString/dnszones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDnszoneOptions model
    GetDnszoneOptions getDnszoneOptionsModel = new GetDnszoneOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getDnszone() with a valid options model and verify the result
    Response<Dnszone> response = dnsSvcsService.getDnszone(getDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDnszonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDnszone operation with and without retries enabled
  @Test
  public void testGetDnszoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetDnszoneWOptions();

    dnsSvcsService.disableRetries();
    testGetDnszoneWOptions();
  }

  // Test the getDnszone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDnszoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getDnszone(null).execute();
  }

  // Test the updateDnszone operation with a valid options model parameter
  @Test
  public void testUpdateDnszoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"2d0f862b-67cc-41f3-b6a2-59860d0aa90e\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"instance_id\": \"1407a753-a93f-4bb0-9784-bcfc269ee1b3\", \"name\": \"example.com\", \"description\": \"The DNS zone is used for VPCs in us-east region\", \"state\": \"pending_network_add\", \"label\": \"us-east\"}";
    String updateDnszonePath = "/instances/testString/dnszones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateDnszoneOptions model
    UpdateDnszoneOptions updateDnszoneOptionsModel = new UpdateDnszoneOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .description("The DNS zone is used for VPCs in us-east region")
      .label("us-east")
      .xCorrelationId("testString")
      .build();

    // Invoke updateDnszone() with a valid options model and verify the result
    Response<Dnszone> response = dnsSvcsService.updateDnszone(updateDnszoneOptionsModel).execute();
    assertNotNull(response);
    Dnszone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDnszonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDnszone operation with and without retries enabled
  @Test
  public void testUpdateDnszoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateDnszoneWOptions();

    dnsSvcsService.disableRetries();
    testUpdateDnszoneWOptions();
  }

  // Test the updateDnszone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnszoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateDnszone(null).execute();
  }

  // Test the listResourceRecords operation with a valid options model parameter
  @Test
  public void testListResourceRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"resource_records\": [{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listResourceRecordsPath = "/instances/testString/dnszones/testString/resource_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListResourceRecordsOptions model
    ListResourceRecordsOptions listResourceRecordsOptionsModel = new ListResourceRecordsOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listResourceRecords() with a valid options model and verify the result
    Response<ListResourceRecords> response = dnsSvcsService.listResourceRecords(listResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    ListResourceRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listResourceRecords operation with and without retries enabled
  @Test
  public void testListResourceRecordsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListResourceRecordsWOptions();

    dnsSvcsService.disableRetries();
    testListResourceRecordsWOptions();
  }

  // Test the listResourceRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListResourceRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listResourceRecords(null).execute();
  }

  // Test the createResourceRecord operation with a valid options model parameter
  @Test
  public void testCreateResourceRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String createResourceRecordPath = "/instances/testString/dnszones/testString/resource_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createResourceRecord() with a valid options model and verify the result
    Response<ResourceRecord> response = dnsSvcsService.createResourceRecord(createResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createResourceRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createResourceRecord operation with and without retries enabled
  @Test
  public void testCreateResourceRecordWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateResourceRecordWOptions();

    dnsSvcsService.disableRetries();
    testCreateResourceRecordWOptions();
  }

  // Test the createResourceRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateResourceRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createResourceRecord(null).execute();
  }

  // Test the deleteResourceRecord operation with a valid options model parameter
  @Test
  public void testDeleteResourceRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteResourceRecordPath = "/instances/testString/dnszones/testString/resource_records/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteResourceRecordOptions model
    DeleteResourceRecordOptions deleteResourceRecordOptionsModel = new DeleteResourceRecordOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .recordId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteResourceRecord() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteResourceRecord(deleteResourceRecordOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteResourceRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteResourceRecord operation with and without retries enabled
  @Test
  public void testDeleteResourceRecordWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteResourceRecordWOptions();

    dnsSvcsService.disableRetries();
    testDeleteResourceRecordWOptions();
  }

  // Test the deleteResourceRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteResourceRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteResourceRecord(null).execute();
  }

  // Test the getResourceRecord operation with a valid options model parameter
  @Test
  public void testGetResourceRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String getResourceRecordPath = "/instances/testString/dnszones/testString/resource_records/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetResourceRecordOptions model
    GetResourceRecordOptions getResourceRecordOptionsModel = new GetResourceRecordOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .recordId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getResourceRecord() with a valid options model and verify the result
    Response<ResourceRecord> response = dnsSvcsService.getResourceRecord(getResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getResourceRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getResourceRecord operation with and without retries enabled
  @Test
  public void testGetResourceRecordWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetResourceRecordWOptions();

    dnsSvcsService.disableRetries();
    testGetResourceRecordWOptions();
  }

  // Test the getResourceRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetResourceRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getResourceRecord(null).execute();
  }

  // Test the updateResourceRecord operation with a valid options model parameter
  @Test
  public void testUpdateResourceRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"SRV:5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"name\": \"_sip._udp.test.example.com\", \"type\": \"SRV\", \"ttl\": 120, \"rdata\": {\"mapKey\": \"anyValue\"}, \"service\": \"_sip\", \"protocol\": \"udp\"}";
    String updateResourceRecordPath = "/instances/testString/dnszones/testString/resource_records/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke updateResourceRecord() with a valid options model and verify the result
    Response<ResourceRecord> response = dnsSvcsService.updateResourceRecord(updateResourceRecordOptionsModel).execute();
    assertNotNull(response);
    ResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateResourceRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateResourceRecord operation with and without retries enabled
  @Test
  public void testUpdateResourceRecordWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateResourceRecordWOptions();

    dnsSvcsService.disableRetries();
    testUpdateResourceRecordWOptions();
  }

  // Test the updateResourceRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateResourceRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateResourceRecord(null).execute();
  }

  // Test the exportResourceRecords operation with a valid options model parameter
  @Test
  public void testExportResourceRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String exportResourceRecordsPath = "/instances/testString/dnszones/testString/export_resource_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "text/plain; charset=utf-8")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ExportResourceRecordsOptions model
    ExportResourceRecordsOptions exportResourceRecordsOptionsModel = new ExportResourceRecordsOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke exportResourceRecords() with a valid options model and verify the result
    Response<InputStream> response = dnsSvcsService.exportResourceRecords(exportResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, exportResourceRecordsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the exportResourceRecords operation with and without retries enabled
  @Test
  public void testExportResourceRecordsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testExportResourceRecordsWOptions();

    dnsSvcsService.disableRetries();
    testExportResourceRecordsWOptions();
  }

  // Test the exportResourceRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExportResourceRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.exportResourceRecords(null).execute();
  }

  // Test the importResourceRecords operation with a valid options model parameter
  @Test
  public void testImportResourceRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_records_parsed\": 10, \"records_added\": 2, \"records_failed\": 0, \"records_added_by_type\": {\"A\": 10, \"AAAA\": 10, \"CNAME\": 10, \"SRV\": 10, \"TXT\": 10, \"MX\": 10, \"PTR\": 10}, \"records_failed_by_type\": {\"A\": 10, \"AAAA\": 10, \"CNAME\": 10, \"SRV\": 10, \"TXT\": 10, \"MX\": 10, \"PTR\": 10}, \"messages\": [{\"code\": \"conflict\", \"message\": \"A type record conflict with other records\"}], \"errors\": [{\"resource_record\": \"test.example.com A 1.1.1.1\", \"error\": {\"code\": \"internal_server_error\", \"message\": \"An internal error occurred. Try again later.\"}}]}";
    String importResourceRecordsPath = "/instances/testString/dnszones/testString/import_resource_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ImportResourceRecordsOptions model
    ImportResourceRecordsOptions importResourceRecordsOptionsModel = new ImportResourceRecordsOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .file(TestUtilities.createMockStream("This is a mock file."))
      .fileContentType("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke importResourceRecords() with a valid options model and verify the result
    Response<ImportResourceRecordsResp> response = dnsSvcsService.importResourceRecords(importResourceRecordsOptionsModel).execute();
    assertNotNull(response);
    ImportResourceRecordsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importResourceRecordsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the importResourceRecords operation with and without retries enabled
  @Test
  public void testImportResourceRecordsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testImportResourceRecordsWOptions();

    dnsSvcsService.disableRetries();
    testImportResourceRecordsWOptions();
  }

  // Test the importResourceRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportResourceRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.importResourceRecords(null).execute();
  }

  // Test the listPermittedNetworks operation with a valid options model parameter
  @Test
  public void testListPermittedNetworksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"permitted_networks\": [{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}]}";
    String listPermittedNetworksPath = "/instances/testString/dnszones/testString/permitted_networks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPermittedNetworksOptions model
    ListPermittedNetworksOptions listPermittedNetworksOptionsModel = new ListPermittedNetworksOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke listPermittedNetworks() with a valid options model and verify the result
    Response<ListPermittedNetworks> response = dnsSvcsService.listPermittedNetworks(listPermittedNetworksOptionsModel).execute();
    assertNotNull(response);
    ListPermittedNetworks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPermittedNetworksPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPermittedNetworks operation with and without retries enabled
  @Test
  public void testListPermittedNetworksWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListPermittedNetworksWOptions();

    dnsSvcsService.disableRetries();
    testListPermittedNetworksWOptions();
  }

  // Test the listPermittedNetworks operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPermittedNetworksNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listPermittedNetworks(null).execute();
  }

  // Test the createPermittedNetwork operation with a valid options model parameter
  @Test
  public void testCreatePermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String createPermittedNetworkPath = "/instances/testString/dnszones/testString/permitted_networks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createPermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.createPermittedNetwork(createPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPermittedNetwork operation with and without retries enabled
  @Test
  public void testCreatePermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreatePermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testCreatePermittedNetworkWOptions();
  }

  // Test the createPermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createPermittedNetwork(null).execute();
  }

  // Test the deletePermittedNetwork operation with a valid options model parameter
  @Test
  public void testDeletePermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String deletePermittedNetworkPath = "/instances/testString/dnszones/testString/permitted_networks/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePermittedNetworkOptions model
    DeletePermittedNetworkOptions deletePermittedNetworkOptionsModel = new DeletePermittedNetworkOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .permittedNetworkId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deletePermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.deletePermittedNetwork(deletePermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePermittedNetwork operation with and without retries enabled
  @Test
  public void testDeletePermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeletePermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testDeletePermittedNetworkWOptions();
  }

  // Test the deletePermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deletePermittedNetwork(null).execute();
  }

  // Test the getPermittedNetwork operation with a valid options model parameter
  @Test
  public void testGetPermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String getPermittedNetworkPath = "/instances/testString/dnszones/testString/permitted_networks/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPermittedNetworkOptions model
    GetPermittedNetworkOptions getPermittedNetworkOptionsModel = new GetPermittedNetworkOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .permittedNetworkId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getPermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.getPermittedNetwork(getPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPermittedNetwork operation with and without retries enabled
  @Test
  public void testGetPermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetPermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testGetPermittedNetworkWOptions();
  }

  // Test the getPermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getPermittedNetwork(null).execute();
  }

  // Test the listLoadBalancers operation with a valid options model parameter
  @Test
  public void testListLoadBalancersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"load_balancers\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listLoadBalancersPath = "/instances/testString/dnszones/testString/load_balancers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListLoadBalancersOptions model
    ListLoadBalancersOptions listLoadBalancersOptionsModel = new ListLoadBalancersOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listLoadBalancers() with a valid options model and verify the result
    Response<ListLoadBalancers> response = dnsSvcsService.listLoadBalancers(listLoadBalancersOptionsModel).execute();
    assertNotNull(response);
    ListLoadBalancers responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLoadBalancersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listLoadBalancers operation with and without retries enabled
  @Test
  public void testListLoadBalancersWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListLoadBalancersWOptions();

    dnsSvcsService.disableRetries();
    testListLoadBalancersWOptions();
  }

  // Test the listLoadBalancers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLoadBalancersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listLoadBalancers(null).execute();
  }

  // Test the createLoadBalancer operation with a valid options model parameter
  @Test
  public void testCreateLoadBalancerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createLoadBalancerPath = "/instances/testString/dnszones/testString/load_balancers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74")))
      .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
      .xCorrelationId("testString")
      .build();

    // Invoke createLoadBalancer() with a valid options model and verify the result
    Response<LoadBalancer> response = dnsSvcsService.createLoadBalancer(createLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLoadBalancerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createLoadBalancer operation with and without retries enabled
  @Test
  public void testCreateLoadBalancerWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateLoadBalancerWOptions();

    dnsSvcsService.disableRetries();
    testCreateLoadBalancerWOptions();
  }

  // Test the createLoadBalancer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createLoadBalancer(null).execute();
  }

  // Test the deleteLoadBalancer operation with a valid options model parameter
  @Test
  public void testDeleteLoadBalancerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteLoadBalancerPath = "/instances/testString/dnszones/testString/load_balancers/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteLoadBalancerOptions model
    DeleteLoadBalancerOptions deleteLoadBalancerOptionsModel = new DeleteLoadBalancerOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .lbId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteLoadBalancer() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteLoadBalancer(deleteLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLoadBalancerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteLoadBalancer operation with and without retries enabled
  @Test
  public void testDeleteLoadBalancerWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteLoadBalancerWOptions();

    dnsSvcsService.disableRetries();
    testDeleteLoadBalancerWOptions();
  }

  // Test the deleteLoadBalancer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLoadBalancerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteLoadBalancer(null).execute();
  }

  // Test the getLoadBalancer operation with a valid options model parameter
  @Test
  public void testGetLoadBalancerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getLoadBalancerPath = "/instances/testString/dnszones/testString/load_balancers/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLoadBalancerOptions model
    GetLoadBalancerOptions getLoadBalancerOptionsModel = new GetLoadBalancerOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .lbId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getLoadBalancer() with a valid options model and verify the result
    Response<LoadBalancer> response = dnsSvcsService.getLoadBalancer(getLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLoadBalancerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLoadBalancer operation with and without retries enabled
  @Test
  public void testGetLoadBalancerWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetLoadBalancerWOptions();

    dnsSvcsService.disableRetries();
    testGetLoadBalancerWOptions();
  }

  // Test the getLoadBalancer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getLoadBalancer(null).execute();
  }

  // Test the updateLoadBalancer operation with a valid options model parameter
  @Test
  public void testUpdateLoadBalancerWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"glb.example.com\", \"description\": \"Load balancer for glb.example.com.\", \"enabled\": true, \"ttl\": 120, \"health\": \"DEGRADED\", \"fallback_pool\": \"24ccf79a-4ae0-4769-b4c8-17f8f230072e\", \"default_pools\": [\"defaultPools\"], \"az_pools\": [{\"availability_zone\": \"us-south-1\", \"pools\": [\"0fc0bb7c-2fab-476e-8b9b-40fa14bf8e3d\"]}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updateLoadBalancerPath = "/instances/testString/dnszones/testString/load_balancers/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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
      .defaultPools(new java.util.ArrayList<String>(java.util.Arrays.asList("24ccf79a-4ae0-4769-b4c8-17f8f230072e", "13fa7d9e-aeff-4e14-8300-58021db9ee74")))
      .azPools(new java.util.ArrayList<LoadBalancerAzPoolsItem>(java.util.Arrays.asList(loadBalancerAzPoolsItemModel)))
      .xCorrelationId("testString")
      .build();

    // Invoke updateLoadBalancer() with a valid options model and verify the result
    Response<LoadBalancer> response = dnsSvcsService.updateLoadBalancer(updateLoadBalancerOptionsModel).execute();
    assertNotNull(response);
    LoadBalancer responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLoadBalancerPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateLoadBalancer operation with and without retries enabled
  @Test
  public void testUpdateLoadBalancerWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateLoadBalancerWOptions();

    dnsSvcsService.disableRetries();
    testUpdateLoadBalancerWOptions();
  }

  // Test the updateLoadBalancer operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateLoadBalancer(null).execute();
  }

  // Test the listPools operation with a valid options model parameter
  @Test
  public void testListPoolsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pools\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"healthcheck_vsis\": [{\"subnet\": \"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"ipv4_address\": \"10.10.16.8\", \"ipv4_cidr_block\": \"10.10.16.0/24\", \"vpc\": \"crn:v1:staging:public:is:us-south:a/01652b251c3ae2787110a995d8db0135::vpc:r134-8c426a0a-ec74-4c97-9c02-f6194c224d8a\"}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listPoolsPath = "/instances/testString/pools";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPoolsOptions model
    ListPoolsOptions listPoolsOptionsModel = new ListPoolsOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listPools() with a valid options model and verify the result
    Response<ListPools> response = dnsSvcsService.listPools(listPoolsOptionsModel).execute();
    assertNotNull(response);
    ListPools responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPoolsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listPools operation with and without retries enabled
  @Test
  public void testListPoolsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListPoolsWOptions();

    dnsSvcsService.disableRetries();
    testListPoolsWOptions();
  }

  // Test the listPools operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPoolsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listPools(null).execute();
  }

  // Test the createPool operation with a valid options model parameter
  @Test
  public void testCreatePoolWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"healthcheck_vsis\": [{\"subnet\": \"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"ipv4_address\": \"10.10.16.8\", \"ipv4_cidr_block\": \"10.10.16.0/24\", \"vpc\": \"crn:v1:staging:public:is:us-south:a/01652b251c3ae2787110a995d8db0135::vpc:r134-8c426a0a-ec74-4c97-9c02-f6194c224d8a\"}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createPoolPath = "/instances/testString/pools";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createPool() with a valid options model and verify the result
    Response<Pool> response = dnsSvcsService.createPool(createPoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPoolPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPool operation with and without retries enabled
  @Test
  public void testCreatePoolWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreatePoolWOptions();

    dnsSvcsService.disableRetries();
    testCreatePoolWOptions();
  }

  // Test the createPool operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePoolNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createPool(null).execute();
  }

  // Test the deletePool operation with a valid options model parameter
  @Test
  public void testDeletePoolWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePoolPath = "/instances/testString/pools/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePoolOptions model
    DeletePoolOptions deletePoolOptionsModel = new DeletePoolOptions.Builder()
      .instanceId("testString")
      .poolId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deletePool() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deletePool(deletePoolOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePoolPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePool operation with and without retries enabled
  @Test
  public void testDeletePoolWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeletePoolWOptions();

    dnsSvcsService.disableRetries();
    testDeletePoolWOptions();
  }

  // Test the deletePool operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePoolNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deletePool(null).execute();
  }

  // Test the getPool operation with a valid options model parameter
  @Test
  public void testGetPoolWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"healthcheck_vsis\": [{\"subnet\": \"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"ipv4_address\": \"10.10.16.8\", \"ipv4_cidr_block\": \"10.10.16.0/24\", \"vpc\": \"crn:v1:staging:public:is:us-south:a/01652b251c3ae2787110a995d8db0135::vpc:r134-8c426a0a-ec74-4c97-9c02-f6194c224d8a\"}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getPoolPath = "/instances/testString/pools/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPoolOptions model
    GetPoolOptions getPoolOptionsModel = new GetPoolOptions.Builder()
      .instanceId("testString")
      .poolId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getPool() with a valid options model and verify the result
    Response<Pool> response = dnsSvcsService.getPool(getPoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPoolPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPool operation with and without retries enabled
  @Test
  public void testGetPoolWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetPoolWOptions();

    dnsSvcsService.disableRetries();
    testGetPoolWOptions();
  }

  // Test the getPool operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPoolNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getPool(null).execute();
  }

  // Test the updatePool operation with a valid options model parameter
  @Test
  public void testUpdatePoolWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"dal10-az-pool\", \"description\": \"Load balancer pool for dal10 availability zone.\", \"enabled\": true, \"healthy_origins_threshold\": 1, \"origins\": [{\"name\": \"app-server-1\", \"description\": \"description of the origin server\", \"address\": \"10.10.16.8\", \"enabled\": true, \"health\": true, \"health_failure_reason\": \"healthFailureReason\"}], \"monitor\": \"7dd6841c-264e-11ea-88df-062967242a6a\", \"notification_channel\": \"https://mywebsite.com/dns/webhook\", \"health\": \"HEALTHY\", \"healthcheck_region\": \"us-south\", \"healthcheck_subnets\": [\"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\"], \"healthcheck_vsis\": [{\"subnet\": \"crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"ipv4_address\": \"10.10.16.8\", \"ipv4_cidr_block\": \"10.10.16.0/24\", \"vpc\": \"crn:v1:staging:public:is:us-south:a/01652b251c3ae2787110a995d8db0135::vpc:r134-8c426a0a-ec74-4c97-9c02-f6194c224d8a\"}], \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updatePoolPath = "/instances/testString/pools/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke updatePool() with a valid options model and verify the result
    Response<Pool> response = dnsSvcsService.updatePool(updatePoolOptionsModel).execute();
    assertNotNull(response);
    Pool responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePoolPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePool operation with and without retries enabled
  @Test
  public void testUpdatePoolWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdatePoolWOptions();

    dnsSvcsService.disableRetries();
    testUpdatePoolWOptions();
  }

  // Test the updatePool operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePoolNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updatePool(null).execute();
  }

  // Test the listMonitors operation with a valid options model parameter
  @Test
  public void testListMonitorsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"monitors\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listMonitorsPath = "/instances/testString/monitors";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMonitorsOptions model
    ListMonitorsOptions listMonitorsOptionsModel = new ListMonitorsOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listMonitors() with a valid options model and verify the result
    Response<ListMonitors> response = dnsSvcsService.listMonitors(listMonitorsOptionsModel).execute();
    assertNotNull(response);
    ListMonitors responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMonitorsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listMonitors operation with and without retries enabled
  @Test
  public void testListMonitorsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListMonitorsWOptions();

    dnsSvcsService.disableRetries();
    testListMonitorsWOptions();
  }

  // Test the listMonitors operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMonitorsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listMonitors(null).execute();
  }

  // Test the createMonitor operation with a valid options model parameter
  @Test
  public void testCreateMonitorWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String createMonitorPath = "/instances/testString/monitors";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createMonitor() with a valid options model and verify the result
    Response<Monitor> response = dnsSvcsService.createMonitor(createMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMonitorPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMonitor operation with and without retries enabled
  @Test
  public void testCreateMonitorWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateMonitorWOptions();

    dnsSvcsService.disableRetries();
    testCreateMonitorWOptions();
  }

  // Test the createMonitor operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMonitorNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createMonitor(null).execute();
  }

  // Test the deleteMonitor operation with a valid options model parameter
  @Test
  public void testDeleteMonitorWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteMonitorPath = "/instances/testString/monitors/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteMonitorOptions model
    DeleteMonitorOptions deleteMonitorOptionsModel = new DeleteMonitorOptions.Builder()
      .instanceId("testString")
      .monitorId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteMonitor() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteMonitor(deleteMonitorOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMonitorPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteMonitor operation with and without retries enabled
  @Test
  public void testDeleteMonitorWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteMonitorWOptions();

    dnsSvcsService.disableRetries();
    testDeleteMonitorWOptions();
  }

  // Test the deleteMonitor operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMonitorNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteMonitor(null).execute();
  }

  // Test the getMonitor operation with a valid options model parameter
  @Test
  public void testGetMonitorWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String getMonitorPath = "/instances/testString/monitors/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMonitorOptions model
    GetMonitorOptions getMonitorOptionsModel = new GetMonitorOptions.Builder()
      .instanceId("testString")
      .monitorId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getMonitor() with a valid options model and verify the result
    Response<Monitor> response = dnsSvcsService.getMonitor(getMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMonitorPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMonitor operation with and without retries enabled
  @Test
  public void testGetMonitorWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetMonitorWOptions();

    dnsSvcsService.disableRetries();
    testGetMonitorWOptions();
  }

  // Test the getMonitor operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMonitorNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getMonitor(null).execute();
  }

  // Test the updateMonitor operation with a valid options model parameter
  @Test
  public void testUpdateMonitorWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"healthcheck-monitor\", \"description\": \"Load balancer monitor for glb.example.com.\", \"type\": \"HTTPS\", \"port\": 8080, \"interval\": 60, \"retries\": 2, \"timeout\": 5, \"method\": \"GET\", \"path\": \"/health\", \"headers\": [{\"name\": \"Host\", \"value\": [\"origin.example.com\"]}], \"allow_insecure\": false, \"expected_codes\": \"200\", \"expected_body\": \"alive\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\"}";
    String updateMonitorPath = "/instances/testString/monitors/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke updateMonitor() with a valid options model and verify the result
    Response<Monitor> response = dnsSvcsService.updateMonitor(updateMonitorOptionsModel).execute();
    assertNotNull(response);
    Monitor responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMonitorPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMonitor operation with and without retries enabled
  @Test
  public void testUpdateMonitorWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateMonitorWOptions();

    dnsSvcsService.disableRetries();
    testUpdateMonitorWOptions();
  }

  // Test the updateMonitor operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMonitorNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateMonitor(null).execute();
  }

  // Test the listCustomResolvers operation with a valid options model parameter
  @Test
  public void testListCustomResolversWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"custom_resolvers\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}]}";
    String listCustomResolversPath = "/instances/testString/custom_resolvers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCustomResolversOptions model
    ListCustomResolversOptions listCustomResolversOptionsModel = new ListCustomResolversOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke listCustomResolvers() with a valid options model and verify the result
    Response<CustomResolverList> response = dnsSvcsService.listCustomResolvers(listCustomResolversOptionsModel).execute();
    assertNotNull(response);
    CustomResolverList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCustomResolversPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listCustomResolvers operation with and without retries enabled
  @Test
  public void testListCustomResolversWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListCustomResolversWOptions();

    dnsSvcsService.disableRetries();
    testListCustomResolversWOptions();
  }

  // Test the listCustomResolvers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCustomResolversNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listCustomResolvers(null).execute();
  }

  // Test the createCustomResolver operation with a valid options model parameter
  @Test
  public void testCreateCustomResolverWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String createCustomResolverPath = "/instances/testString/custom_resolvers";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createCustomResolver() with a valid options model and verify the result
    Response<CustomResolver> response = dnsSvcsService.createCustomResolver(createCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCustomResolverPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createCustomResolver operation with and without retries enabled
  @Test
  public void testCreateCustomResolverWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateCustomResolverWOptions();

    dnsSvcsService.disableRetries();
    testCreateCustomResolverWOptions();
  }

  // Test the createCustomResolver operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCustomResolverNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createCustomResolver(null).execute();
  }

  // Test the deleteCustomResolver operation with a valid options model parameter
  @Test
  public void testDeleteCustomResolverWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCustomResolverPath = "/instances/testString/custom_resolvers/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCustomResolverOptions model
    DeleteCustomResolverOptions deleteCustomResolverOptionsModel = new DeleteCustomResolverOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteCustomResolver() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteCustomResolver(deleteCustomResolverOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomResolverPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteCustomResolver operation with and without retries enabled
  @Test
  public void testDeleteCustomResolverWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteCustomResolverWOptions();

    dnsSvcsService.disableRetries();
    testDeleteCustomResolverWOptions();
  }

  // Test the deleteCustomResolver operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCustomResolverNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteCustomResolver(null).execute();
  }

  // Test the getCustomResolver operation with a valid options model parameter
  @Test
  public void testGetCustomResolverWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String getCustomResolverPath = "/instances/testString/custom_resolvers/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCustomResolverOptions model
    GetCustomResolverOptions getCustomResolverOptionsModel = new GetCustomResolverOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getCustomResolver() with a valid options model and verify the result
    Response<CustomResolver> response = dnsSvcsService.getCustomResolver(getCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCustomResolverPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCustomResolver operation with and without retries enabled
  @Test
  public void testGetCustomResolverWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetCustomResolverWOptions();

    dnsSvcsService.disableRetries();
    testGetCustomResolverWOptions();
  }

  // Test the getCustomResolver operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCustomResolverNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getCustomResolver(null).execute();
  }

  // Test the updateCustomResolver operation with a valid options model parameter
  @Test
  public void testUpdateCustomResolverWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String updateCustomResolverPath = "/instances/testString/custom_resolvers/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateCustomResolverOptions model
    UpdateCustomResolverOptions updateCustomResolverOptionsModel = new UpdateCustomResolverOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .name("my-resolver")
      .description("custom resolver")
      .enabled(false)
      .xCorrelationId("testString")
      .build();

    // Invoke updateCustomResolver() with a valid options model and verify the result
    Response<CustomResolver> response = dnsSvcsService.updateCustomResolver(updateCustomResolverOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomResolverPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCustomResolver operation with and without retries enabled
  @Test
  public void testUpdateCustomResolverWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateCustomResolverWOptions();

    dnsSvcsService.disableRetries();
    testUpdateCustomResolverWOptions();
  }

  // Test the updateCustomResolver operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateCustomResolver(null).execute();
  }

  // Test the updateCrLocationsOrder operation with a valid options model parameter
  @Test
  public void testUpdateCrLocationsOrderWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"name\": \"my-resolver\", \"description\": \"custom resolver\", \"enabled\": false, \"health\": \"HEALTHY\", \"locations\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String updateCrLocationsOrderPath = "/instances/testString/custom_resolvers/testString/locations_order";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateCrLocationsOrderOptions model
    UpdateCrLocationsOrderOptions updateCrLocationsOrderOptionsModel = new UpdateCrLocationsOrderOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .locations(new java.util.ArrayList<String>(java.util.Arrays.asList("9a234ede-c2b6-4c39-bc27-d39ec139ecdb")))
      .xCorrelationId("testString")
      .build();

    // Invoke updateCrLocationsOrder() with a valid options model and verify the result
    Response<CustomResolver> response = dnsSvcsService.updateCrLocationsOrder(updateCrLocationsOrderOptionsModel).execute();
    assertNotNull(response);
    CustomResolver responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCrLocationsOrderPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCrLocationsOrder operation with and without retries enabled
  @Test
  public void testUpdateCrLocationsOrderWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateCrLocationsOrderWOptions();

    dnsSvcsService.disableRetries();
    testUpdateCrLocationsOrderWOptions();
  }

  // Test the updateCrLocationsOrder operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCrLocationsOrderNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateCrLocationsOrder(null).execute();
  }

  // Test the addCustomResolverLocation operation with a valid options model parameter
  @Test
  public void testAddCustomResolverLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}";
    String addCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AddCustomResolverLocationOptions model
    AddCustomResolverLocationOptions addCustomResolverLocationOptionsModel = new AddCustomResolverLocationOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
      .enabled(false)
      .xCorrelationId("testString")
      .build();

    // Invoke addCustomResolverLocation() with a valid options model and verify the result
    Response<Location> response = dnsSvcsService.addCustomResolverLocation(addCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Location responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addCustomResolverLocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the addCustomResolverLocation operation with and without retries enabled
  @Test
  public void testAddCustomResolverLocationWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testAddCustomResolverLocationWOptions();

    dnsSvcsService.disableRetries();
    testAddCustomResolverLocationWOptions();
  }

  // Test the addCustomResolverLocation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddCustomResolverLocationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.addCustomResolverLocation(null).execute();
  }

  // Test the updateCustomResolverLocation operation with a valid options model parameter
  @Test
  public void testUpdateCustomResolverLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"subnet_crn\": \"crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04\", \"enabled\": true, \"healthy\": true, \"dns_server_ip\": \"10.10.16.8\"}";
    String updateCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateCustomResolverLocationOptions model
    UpdateCustomResolverLocationOptions updateCustomResolverLocationOptionsModel = new UpdateCustomResolverLocationOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .locationId("testString")
      .enabled(false)
      .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
      .xCorrelationId("testString")
      .build();

    // Invoke updateCustomResolverLocation() with a valid options model and verify the result
    Response<Location> response = dnsSvcsService.updateCustomResolverLocation(updateCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Location responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomResolverLocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCustomResolverLocation operation with and without retries enabled
  @Test
  public void testUpdateCustomResolverLocationWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateCustomResolverLocationWOptions();

    dnsSvcsService.disableRetries();
    testUpdateCustomResolverLocationWOptions();
  }

  // Test the updateCustomResolverLocation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverLocationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateCustomResolverLocation(null).execute();
  }

  // Test the deleteCustomResolverLocation operation with a valid options model parameter
  @Test
  public void testDeleteCustomResolverLocationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCustomResolverLocationPath = "/instances/testString/custom_resolvers/testString/locations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCustomResolverLocationOptions model
    DeleteCustomResolverLocationOptions deleteCustomResolverLocationOptionsModel = new DeleteCustomResolverLocationOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .locationId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteCustomResolverLocation() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteCustomResolverLocation(deleteCustomResolverLocationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomResolverLocationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteCustomResolverLocation operation with and without retries enabled
  @Test
  public void testDeleteCustomResolverLocationWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteCustomResolverLocationWOptions();

    dnsSvcsService.disableRetries();
    testDeleteCustomResolverLocationWOptions();
  }

  // Test the deleteCustomResolverLocation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCustomResolverLocationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteCustomResolverLocation(null).execute();
  }

  // Test the listForwardingRules operation with a valid options model parameter
  @Test
  public void testListForwardingRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"forwarding_rules\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}]}";
    String listForwardingRulesPath = "/instances/testString/custom_resolvers/testString/forwarding_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListForwardingRulesOptions model
    ListForwardingRulesOptions listForwardingRulesOptionsModel = new ListForwardingRulesOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke listForwardingRules() with a valid options model and verify the result
    Response<ForwardingRuleList> response = dnsSvcsService.listForwardingRules(listForwardingRulesOptionsModel).execute();
    assertNotNull(response);
    ForwardingRuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listForwardingRulesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listForwardingRules operation with and without retries enabled
  @Test
  public void testListForwardingRulesWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListForwardingRulesWOptions();

    dnsSvcsService.disableRetries();
    testListForwardingRulesWOptions();
  }

  // Test the listForwardingRules operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListForwardingRulesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listForwardingRules(null).execute();
  }

  // Test the createForwardingRule operation with a valid options model parameter
  @Test
  public void testCreateForwardingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String createForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke createForwardingRule() with a valid options model and verify the result
    Response<ForwardingRule> response = dnsSvcsService.createForwardingRule(createForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createForwardingRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createForwardingRule operation with and without retries enabled
  @Test
  public void testCreateForwardingRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateForwardingRuleWOptions();

    dnsSvcsService.disableRetries();
    testCreateForwardingRuleWOptions();
  }

  // Test the createForwardingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateForwardingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createForwardingRule(null).execute();
  }

  // Test the deleteForwardingRule operation with a valid options model parameter
  @Test
  public void testDeleteForwardingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteForwardingRuleOptions model
    DeleteForwardingRuleOptions deleteForwardingRuleOptionsModel = new DeleteForwardingRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteForwardingRule() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteForwardingRule(deleteForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteForwardingRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteForwardingRule operation with and without retries enabled
  @Test
  public void testDeleteForwardingRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteForwardingRuleWOptions();

    dnsSvcsService.disableRetries();
    testDeleteForwardingRuleWOptions();
  }

  // Test the deleteForwardingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteForwardingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteForwardingRule(null).execute();
  }

  // Test the getForwardingRule operation with a valid options model parameter
  @Test
  public void testGetForwardingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String getForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetForwardingRuleOptions model
    GetForwardingRuleOptions getForwardingRuleOptionsModel = new GetForwardingRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getForwardingRule() with a valid options model and verify the result
    Response<ForwardingRule> response = dnsSvcsService.getForwardingRule(getForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getForwardingRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getForwardingRule operation with and without retries enabled
  @Test
  public void testGetForwardingRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetForwardingRuleWOptions();

    dnsSvcsService.disableRetries();
    testGetForwardingRuleWOptions();
  }

  // Test the getForwardingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetForwardingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getForwardingRule(null).execute();
  }

  // Test the updateForwardingRule operation with a valid options model parameter
  @Test
  public void testUpdateForwardingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"description\": \"forwarding rule\", \"type\": \"zone\", \"match\": \"example.com\", \"forward_to\": [\"161.26.0.7\"], \"created_on\": \"2021-04-21T08:18:25.000Z\", \"modified_on\": \"2021-04-21T08:18:25.000Z\"}";
    String updateForwardingRulePath = "/instances/testString/custom_resolvers/testString/forwarding_rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

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

    // Invoke updateForwardingRule() with a valid options model and verify the result
    Response<ForwardingRule> response = dnsSvcsService.updateForwardingRule(updateForwardingRuleOptionsModel).execute();
    assertNotNull(response);
    ForwardingRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateForwardingRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateForwardingRule operation with and without retries enabled
  @Test
  public void testUpdateForwardingRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateForwardingRuleWOptions();

    dnsSvcsService.disableRetries();
    testUpdateForwardingRuleWOptions();
  }

  // Test the updateForwardingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateForwardingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateForwardingRule(null).execute();
  }

  // Test the createXfrRule operation with a valid options model parameter
  @Test
  public void testCreateXfrRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"f97ef698-d5fa-4f91-bc5a-33f17d143b7d\", \"description\": \"xfr rule\", \"zone\": \"example.com\", \"enabled\": false, \"transfer_from\": [{\"address\": \"10.0.0.7\", \"port\": 53}], \"created_on\": \"2022-03-16T08:18:25Z\", \"modified_on\": \"2022-03-16T08:18:25Z\"}";
    String createXfrRulePath = "/instances/testString/custom_resolvers/testString/xfr_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the XfrRuleInputTransferFromItem model
    XfrRuleInputTransferFromItem xfrRuleInputTransferFromItemModel = new XfrRuleInputTransferFromItem.Builder()
      .address("10.0.0.7")
      .build();

    // Construct an instance of the CreateXfrRuleOptions model
    CreateXfrRuleOptions createXfrRuleOptionsModel = new CreateXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .description("xfr rule")
      .zone("example.com")
      .enabled(false)
      .transferFrom(new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)))
      .xCorrelationId("testString")
      .build();

    // Invoke createXfrRule() with a valid options model and verify the result
    Response<XfrRule> response = dnsSvcsService.createXfrRule(createXfrRuleOptionsModel).execute();
    assertNotNull(response);
    XfrRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createXfrRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createXfrRule operation with and without retries enabled
  @Test
  public void testCreateXfrRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateXfrRuleWOptions();

    dnsSvcsService.disableRetries();
    testCreateXfrRuleWOptions();
  }

  // Test the createXfrRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateXfrRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createXfrRule(null).execute();
  }

  // Test the listXfrRules operation with a valid options model parameter
  @Test
  public void testListXfrRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"xfr_rules\": [{\"id\": \"f97ef698-d5fa-4f91-bc5a-33f17d143b7d\", \"description\": \"xfr rule\", \"zone\": \"example.com\", \"enabled\": false, \"transfer_from\": [{\"address\": \"10.0.0.7\", \"port\": 53}], \"created_on\": \"2022-03-16T08:18:25Z\", \"modified_on\": \"2022-03-16T08:18:25Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listXfrRulesPath = "/instances/testString/custom_resolvers/testString/xfr_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListXfrRulesOptions model
    ListXfrRulesOptions listXfrRulesOptionsModel = new ListXfrRulesOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listXfrRules() with a valid options model and verify the result
    Response<XfrRuleList> response = dnsSvcsService.listXfrRules(listXfrRulesOptionsModel).execute();
    assertNotNull(response);
    XfrRuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listXfrRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listXfrRules operation with and without retries enabled
  @Test
  public void testListXfrRulesWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListXfrRulesWOptions();

    dnsSvcsService.disableRetries();
    testListXfrRulesWOptions();
  }

  // Test the listXfrRules operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListXfrRulesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listXfrRules(null).execute();
  }

  // Test the getXfrRule operation with a valid options model parameter
  @Test
  public void testGetXfrRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"f97ef698-d5fa-4f91-bc5a-33f17d143b7d\", \"description\": \"xfr rule\", \"zone\": \"example.com\", \"enabled\": false, \"transfer_from\": [{\"address\": \"10.0.0.7\", \"port\": 53}], \"created_on\": \"2022-03-16T08:18:25Z\", \"modified_on\": \"2022-03-16T08:18:25Z\"}";
    String getXfrRulePath = "/instances/testString/custom_resolvers/testString/xfr_rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetXfrRuleOptions model
    GetXfrRuleOptions getXfrRuleOptionsModel = new GetXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getXfrRule() with a valid options model and verify the result
    Response<XfrRule> response = dnsSvcsService.getXfrRule(getXfrRuleOptionsModel).execute();
    assertNotNull(response);
    XfrRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getXfrRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getXfrRule operation with and without retries enabled
  @Test
  public void testGetXfrRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetXfrRuleWOptions();

    dnsSvcsService.disableRetries();
    testGetXfrRuleWOptions();
  }

  // Test the getXfrRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetXfrRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getXfrRule(null).execute();
  }

  // Test the updateXfrRule operation with a valid options model parameter
  @Test
  public void testUpdateXfrRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"f97ef698-d5fa-4f91-bc5a-33f17d143b7d\", \"description\": \"xfr rule\", \"zone\": \"example.com\", \"enabled\": false, \"transfer_from\": [{\"address\": \"10.0.0.7\", \"port\": 53}], \"created_on\": \"2022-03-16T08:18:25Z\", \"modified_on\": \"2022-03-16T08:18:25Z\"}";
    String updateXfrRulePath = "/instances/testString/custom_resolvers/testString/xfr_rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the XfrRuleInputTransferFromItem model
    XfrRuleInputTransferFromItem xfrRuleInputTransferFromItemModel = new XfrRuleInputTransferFromItem.Builder()
      .address("10.0.0.7")
      .build();

    // Construct an instance of the UpdateXfrRuleOptions model
    UpdateXfrRuleOptions updateXfrRuleOptionsModel = new UpdateXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .description("xfr rule")
      .enabled(false)
      .transferFrom(new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)))
      .xCorrelationId("testString")
      .build();

    // Invoke updateXfrRule() with a valid options model and verify the result
    Response<XfrRule> response = dnsSvcsService.updateXfrRule(updateXfrRuleOptionsModel).execute();
    assertNotNull(response);
    XfrRule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateXfrRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateXfrRule operation with and without retries enabled
  @Test
  public void testUpdateXfrRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateXfrRuleWOptions();

    dnsSvcsService.disableRetries();
    testUpdateXfrRuleWOptions();
  }

  // Test the updateXfrRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateXfrRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateXfrRule(null).execute();
  }

  // Test the deleteXfrRule operation with a valid options model parameter
  @Test
  public void testDeleteXfrRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteXfrRulePath = "/instances/testString/custom_resolvers/testString/xfr_rules/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteXfrRuleOptions model
    DeleteXfrRuleOptions deleteXfrRuleOptionsModel = new DeleteXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteXfrRule() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteXfrRule(deleteXfrRuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteXfrRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteXfrRule operation with and without retries enabled
  @Test
  public void testDeleteXfrRuleWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteXfrRuleWOptions();

    dnsSvcsService.disableRetries();
    testDeleteXfrRuleWOptions();
  }

  // Test the deleteXfrRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteXfrRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteXfrRule(null).execute();
  }

  // Test the listLinkedZones operation with a valid options model parameter
  @Test
  public void testListLinkedZonesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"linked_zones\": [{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"instance_id\": \"5cbc3c1b-021c-4ad7-b9e4-a5dfefdecf85\", \"name\": \"example.com\", \"description\": \"linked zone example\", \"linked_to\": {\"instance_crn\": \"crn:v1:staging:public:pdnsdev:global:a/01652b251c3ae2787110a995d8db0135:abe30019-1c08-42dc-9ad9-a0682af70054::\", \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\"}, \"state\": \"APPROVAL_PENDING\", \"label\": \"dev\", \"approval_required_before\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listLinkedZonesPath = "/instances/testString/linked_dnszones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListLinkedZonesOptions model
    ListLinkedZonesOptions listLinkedZonesOptionsModel = new ListLinkedZonesOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listLinkedZones() with a valid options model and verify the result
    Response<LinkedZonesList> response = dnsSvcsService.listLinkedZones(listLinkedZonesOptionsModel).execute();
    assertNotNull(response);
    LinkedZonesList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLinkedZonesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listLinkedZones operation with and without retries enabled
  @Test
  public void testListLinkedZonesWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListLinkedZonesWOptions();

    dnsSvcsService.disableRetries();
    testListLinkedZonesWOptions();
  }

  // Test the listLinkedZones operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLinkedZonesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listLinkedZones(null).execute();
  }

  // Test the createLinkedZone operation with a valid options model parameter
  @Test
  public void testCreateLinkedZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"instance_id\": \"5cbc3c1b-021c-4ad7-b9e4-a5dfefdecf85\", \"name\": \"example.com\", \"description\": \"linked zone example\", \"linked_to\": {\"instance_crn\": \"crn:v1:staging:public:pdnsdev:global:a/01652b251c3ae2787110a995d8db0135:abe30019-1c08-42dc-9ad9-a0682af70054::\", \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\"}, \"state\": \"APPROVAL_PENDING\", \"label\": \"dev\", \"approval_required_before\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}";
    String createLinkedZonePath = "/instances/testString/linked_dnszones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateLinkedZoneOptions model
    CreateLinkedZoneOptions createLinkedZoneOptionsModel = new CreateLinkedZoneOptions.Builder()
      .instanceId("testString")
      .ownerInstanceId("abe30019-1c08-42dc-9ad9-a0682af70054")
      .ownerZoneId("05855abe-3908-4cdc-bf0d-063e0b1c296d")
      .description("linked zone example")
      .label("dev")
      .xCorrelationId("testString")
      .build();

    // Invoke createLinkedZone() with a valid options model and verify the result
    Response<LinkedZone> response = dnsSvcsService.createLinkedZone(createLinkedZoneOptionsModel).execute();
    assertNotNull(response);
    LinkedZone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createLinkedZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createLinkedZone operation with and without retries enabled
  @Test
  public void testCreateLinkedZoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testCreateLinkedZoneWOptions();

    dnsSvcsService.disableRetries();
    testCreateLinkedZoneWOptions();
  }

  // Test the createLinkedZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLinkedZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.createLinkedZone(null).execute();
  }

  // Test the getLinkedZone operation with a valid options model parameter
  @Test
  public void testGetLinkedZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"instance_id\": \"5cbc3c1b-021c-4ad7-b9e4-a5dfefdecf85\", \"name\": \"example.com\", \"description\": \"linked zone example\", \"linked_to\": {\"instance_crn\": \"crn:v1:staging:public:pdnsdev:global:a/01652b251c3ae2787110a995d8db0135:abe30019-1c08-42dc-9ad9-a0682af70054::\", \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\"}, \"state\": \"APPROVAL_PENDING\", \"label\": \"dev\", \"approval_required_before\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}";
    String getLinkedZonePath = "/instances/testString/linked_dnszones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLinkedZoneOptions model
    GetLinkedZoneOptions getLinkedZoneOptionsModel = new GetLinkedZoneOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getLinkedZone() with a valid options model and verify the result
    Response<LinkedZone> response = dnsSvcsService.getLinkedZone(getLinkedZoneOptionsModel).execute();
    assertNotNull(response);
    LinkedZone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLinkedZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLinkedZone operation with and without retries enabled
  @Test
  public void testGetLinkedZoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetLinkedZoneWOptions();

    dnsSvcsService.disableRetries();
    testGetLinkedZoneWOptions();
  }

  // Test the getLinkedZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLinkedZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getLinkedZone(null).execute();
  }

  // Test the updateLinkedZone operation with a valid options model parameter
  @Test
  public void testUpdateLinkedZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5365b73c-ce6f-4d6f-ad9f-d9c131b26370\", \"instance_id\": \"5cbc3c1b-021c-4ad7-b9e4-a5dfefdecf85\", \"name\": \"example.com\", \"description\": \"linked zone example\", \"linked_to\": {\"instance_crn\": \"crn:v1:staging:public:pdnsdev:global:a/01652b251c3ae2787110a995d8db0135:abe30019-1c08-42dc-9ad9-a0682af70054::\", \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\"}, \"state\": \"APPROVAL_PENDING\", \"label\": \"dev\", \"approval_required_before\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}";
    String updateLinkedZonePath = "/instances/testString/linked_dnszones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateLinkedZoneOptions model
    UpdateLinkedZoneOptions updateLinkedZoneOptionsModel = new UpdateLinkedZoneOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .description("linked zone example")
      .label("dev")
      .xCorrelationId("testString")
      .build();

    // Invoke updateLinkedZone() with a valid options model and verify the result
    Response<LinkedZone> response = dnsSvcsService.updateLinkedZone(updateLinkedZoneOptionsModel).execute();
    assertNotNull(response);
    LinkedZone responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateLinkedZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateLinkedZone operation with and without retries enabled
  @Test
  public void testUpdateLinkedZoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateLinkedZoneWOptions();

    dnsSvcsService.disableRetries();
    testUpdateLinkedZoneWOptions();
  }

  // Test the updateLinkedZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLinkedZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateLinkedZone(null).execute();
  }

  // Test the deleteLinkedZone operation with a valid options model parameter
  @Test
  public void testDeleteLinkedZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteLinkedZonePath = "/instances/testString/linked_dnszones/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteLinkedZoneOptions model
    DeleteLinkedZoneOptions deleteLinkedZoneOptionsModel = new DeleteLinkedZoneOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke deleteLinkedZone() with a valid options model and verify the result
    Response<Void> response = dnsSvcsService.deleteLinkedZone(deleteLinkedZoneOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteLinkedZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteLinkedZone operation with and without retries enabled
  @Test
  public void testDeleteLinkedZoneWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testDeleteLinkedZoneWOptions();

    dnsSvcsService.disableRetries();
    testDeleteLinkedZoneWOptions();
  }

  // Test the deleteLinkedZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteLinkedZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.deleteLinkedZone(null).execute();
  }

  // Test the listDnszoneAccessRequests operation with a valid options model parameter
  @Test
  public void testListDnszoneAccessRequestsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"access_requests\": [{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"requestor\": {\"account\": \"01652b251c3ae2787110a995d8db0135\"}, \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\", \"zone_name\": \"example.com\", \"state\": \"PENDING\", \"expires_at\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}], \"offset\": 0, \"limit\": 200, \"count\": 1, \"total_count\": 1, \"first\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"last\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"previous\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}, \"next\": {\"href\": \"https://api.dns-svcs.cloud.ibm.com/v1/instances/434f6c3e-6014-4124-a61d-2e910bca19b1/dnszones?offset=0&limit=200\"}}";
    String listDnszoneAccessRequestsPath = "/instances/testString/access_requests";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDnszoneAccessRequestsOptions model
    ListDnszoneAccessRequestsOptions listDnszoneAccessRequestsOptionsModel = new ListDnszoneAccessRequestsOptions.Builder()
      .instanceId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke listDnszoneAccessRequests() with a valid options model and verify the result
    Response<AccessRequestsList> response = dnsSvcsService.listDnszoneAccessRequests(listDnszoneAccessRequestsOptionsModel).execute();
    assertNotNull(response);
    AccessRequestsList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDnszoneAccessRequestsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the listDnszoneAccessRequests operation with and without retries enabled
  @Test
  public void testListDnszoneAccessRequestsWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListDnszoneAccessRequestsWOptions();

    dnsSvcsService.disableRetries();
    testListDnszoneAccessRequestsWOptions();
  }

  // Test the listDnszoneAccessRequests operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDnszoneAccessRequestsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listDnszoneAccessRequests(null).execute();
  }

  // Test the getDnszoneAccessRequest operation with a valid options model parameter
  @Test
  public void testGetDnszoneAccessRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"requestor\": {\"account\": \"01652b251c3ae2787110a995d8db0135\"}, \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\", \"zone_name\": \"example.com\", \"state\": \"PENDING\", \"expires_at\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}";
    String getDnszoneAccessRequestPath = "/instances/testString/access_requests/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDnszoneAccessRequestOptions model
    GetDnszoneAccessRequestOptions getDnszoneAccessRequestOptionsModel = new GetDnszoneAccessRequestOptions.Builder()
      .instanceId("testString")
      .requestId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getDnszoneAccessRequest() with a valid options model and verify the result
    Response<AccessRequest> response = dnsSvcsService.getDnszoneAccessRequest(getDnszoneAccessRequestOptionsModel).execute();
    assertNotNull(response);
    AccessRequest responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDnszoneAccessRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDnszoneAccessRequest operation with and without retries enabled
  @Test
  public void testGetDnszoneAccessRequestWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetDnszoneAccessRequestWOptions();

    dnsSvcsService.disableRetries();
    testGetDnszoneAccessRequestWOptions();
  }

  // Test the getDnszoneAccessRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDnszoneAccessRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getDnszoneAccessRequest(null).execute();
  }

  // Test the updateDnszoneAccessRequest operation with a valid options model parameter
  @Test
  public void testUpdateDnszoneAccessRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9a234ede-c2b6-4c39-bc27-d39ec139ecdb\", \"requestor\": {\"account\": \"01652b251c3ae2787110a995d8db0135\"}, \"zone_id\": \"05855abe-3908-4cdc-bf0d-063e0b1c296d\", \"zone_name\": \"example.com\", \"state\": \"PENDING\", \"expires_at\": \"2022-03-16T07:23:25Z\", \"created_on\": \"2022-03-09T07:23:25Z\", \"modified_on\": \"2022-03-09T07:23:25Z\"}";
    String updateDnszoneAccessRequestPath = "/instances/testString/access_requests/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateDnszoneAccessRequestOptions model
    UpdateDnszoneAccessRequestOptions updateDnszoneAccessRequestOptionsModel = new UpdateDnszoneAccessRequestOptions.Builder()
      .instanceId("testString")
      .requestId("testString")
      .action("APPROVE")
      .xCorrelationId("testString")
      .build();

    // Invoke updateDnszoneAccessRequest() with a valid options model and verify the result
    Response<AccessRequest> response = dnsSvcsService.updateDnszoneAccessRequest(updateDnszoneAccessRequestOptionsModel).execute();
    assertNotNull(response);
    AccessRequest responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDnszoneAccessRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDnszoneAccessRequest operation with and without retries enabled
  @Test
  public void testUpdateDnszoneAccessRequestWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUpdateDnszoneAccessRequestWOptions();

    dnsSvcsService.disableRetries();
    testUpdateDnszoneAccessRequestWOptions();
  }

  // Test the updateDnszoneAccessRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnszoneAccessRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.updateDnszoneAccessRequest(null).execute();
  }

  // Test the listLinkedPermittedNetworks operation with a valid options model parameter
  @Test
  public void testListLinkedPermittedNetworksWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"permitted_networks\": [{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}]}";
    String listLinkedPermittedNetworksPath = "/instances/testString/linked_dnszones/testString/permitted_networks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListLinkedPermittedNetworksOptions model
    ListLinkedPermittedNetworksOptions listLinkedPermittedNetworksOptionsModel = new ListLinkedPermittedNetworksOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke listLinkedPermittedNetworks() with a valid options model and verify the result
    Response<ListPermittedNetworks> response = dnsSvcsService.listLinkedPermittedNetworks(listLinkedPermittedNetworksOptionsModel).execute();
    assertNotNull(response);
    ListPermittedNetworks responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLinkedPermittedNetworksPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listLinkedPermittedNetworks operation with and without retries enabled
  @Test
  public void testListLinkedPermittedNetworksWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testListLinkedPermittedNetworksWOptions();

    dnsSvcsService.disableRetries();
    testListLinkedPermittedNetworksWOptions();
  }

  // Test the listLinkedPermittedNetworks operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListLinkedPermittedNetworksNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.listLinkedPermittedNetworks(null).execute();
  }

  // Test the linkPermittedNetwork operation with a valid options model parameter
  @Test
  public void testLinkPermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String linkPermittedNetworkPath = "/instances/testString/linked_dnszones/testString/permitted_networks";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PermittedNetworkVpc model
    PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
      .vpcCrn("crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6")
      .build();

    // Construct an instance of the LinkPermittedNetworkOptions model
    LinkPermittedNetworkOptions linkPermittedNetworkOptionsModel = new LinkPermittedNetworkOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .type("vpc")
      .permittedNetwork(permittedNetworkVpcModel)
      .xCorrelationId("testString")
      .build();

    // Invoke linkPermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.linkPermittedNetwork(linkPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, linkPermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the linkPermittedNetwork operation with and without retries enabled
  @Test
  public void testLinkPermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testLinkPermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testLinkPermittedNetworkWOptions();
  }

  // Test the linkPermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLinkPermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.linkPermittedNetwork(null).execute();
  }

  // Test the unlinkPermittedNetwork operation with a valid options model parameter
  @Test
  public void testUnlinkPermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String unlinkPermittedNetworkPath = "/instances/testString/linked_dnszones/testString/permitted_networks/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the UnlinkPermittedNetworkOptions model
    UnlinkPermittedNetworkOptions unlinkPermittedNetworkOptionsModel = new UnlinkPermittedNetworkOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .permittedNetworkId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke unlinkPermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.unlinkPermittedNetwork(unlinkPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, unlinkPermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the unlinkPermittedNetwork operation with and without retries enabled
  @Test
  public void testUnlinkPermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testUnlinkPermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testUnlinkPermittedNetworkWOptions();
  }

  // Test the unlinkPermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUnlinkPermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.unlinkPermittedNetwork(null).execute();
  }

  // Test the getLinkedPermittedNetwork operation with a valid options model parameter
  @Test
  public void testGetLinkedPermittedNetworkWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fecd0173-3919-456b-b202-3029dfa1b0f7\", \"created_on\": \"2019-01-01T05:20:00.12345Z\", \"modified_on\": \"2019-01-01T05:20:00.12345Z\", \"permitted_network\": {\"vpc_crn\": \"crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6\"}, \"type\": \"vpc\", \"state\": \"ACTIVE\"}";
    String getLinkedPermittedNetworkPath = "/instances/testString/linked_dnszones/testString/permitted_networks/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetLinkedPermittedNetworkOptions model
    GetLinkedPermittedNetworkOptions getLinkedPermittedNetworkOptionsModel = new GetLinkedPermittedNetworkOptions.Builder()
      .instanceId("testString")
      .lzId("testString")
      .permittedNetworkId("testString")
      .xCorrelationId("testString")
      .build();

    // Invoke getLinkedPermittedNetwork() with a valid options model and verify the result
    Response<PermittedNetwork> response = dnsSvcsService.getLinkedPermittedNetwork(getLinkedPermittedNetworkOptionsModel).execute();
    assertNotNull(response);
    PermittedNetwork responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getLinkedPermittedNetworkPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getLinkedPermittedNetwork operation with and without retries enabled
  @Test
  public void testGetLinkedPermittedNetworkWRetries() throws Throwable {
    dnsSvcsService.enableRetries(4, 30);
    testGetLinkedPermittedNetworkWOptions();

    dnsSvcsService.disableRetries();
    testGetLinkedPermittedNetworkWOptions();
  }

  // Test the getLinkedPermittedNetwork operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLinkedPermittedNetworkNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsSvcsService.getLinkedPermittedNetwork(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    dnsSvcsService = null;
  }

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv()
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    dnsSvcsService = DnsSvcs.newInstance(serviceName);
    String url = server.url("/").toString();
    dnsSvcsService.setServiceUrl(url);
  }
}