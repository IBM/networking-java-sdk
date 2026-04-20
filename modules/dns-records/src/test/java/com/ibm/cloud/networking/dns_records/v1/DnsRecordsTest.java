/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.dns_records.v1;

import com.ibm.cloud.networking.dns_records.v1.DnsRecords;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordDetails;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestDeletesItem;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPatchesItem;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPutsItem;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsResponse;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsResponseResult;
import com.ibm.cloud.networking.dns_records.v1.model.CreateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordRespResult;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordDetails;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordInput;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.GetDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListAllDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.model.ListDnsrecordsResp;
import com.ibm.cloud.networking.dns_records.v1.model.ResultInfo;
import com.ibm.cloud.networking.dns_records.v1.model.UpdateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
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
 * Unit test class for the DnsRecords service.
 */
public class DnsRecordsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DnsRecords dnsRecordsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";
    new DnsRecords(crn, zoneIdentifier, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(dnsRecordsService.getCrn(), "testString");
  }


  // Test the getter for the zoneIdentifier global parameter
  @Test
  public void testGetZoneIdentifier() throws Throwable {
    assertEquals(dnsRecordsService.getZoneIdentifier(), "testString");
  }

  // Test the listAllDnsRecords operation with a valid options model parameter
  @Test
  public void testListAllDnsRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listAllDnsRecordsPath = "/v1/testString/zones/testString/dns_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllDnsRecordsOptions model
    ListAllDnsRecordsOptions listAllDnsRecordsOptionsModel = new ListAllDnsRecordsOptions.Builder()
      .type("testString")
      .name("host1.test-example.com")
      .content("1.2.3.4")
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("20"))
      .order("type")
      .direction("asc")
      .match("any")
      .build();

    // Invoke listAllDnsRecords() with a valid options model and verify the result
    Response<ListDnsrecordsResp> response = dnsRecordsService.listAllDnsRecords(listAllDnsRecordsOptionsModel).execute();
    assertNotNull(response);
    ListDnsrecordsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllDnsRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("type"), "testString");
    assertEquals(query.get("name"), "host1.test-example.com");
    assertEquals(query.get("content"), "1.2.3.4");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("20"));
    assertEquals(query.get("order"), "type");
    assertEquals(query.get("direction"), "asc");
    assertEquals(query.get("match"), "any");
  }

  // Test the listAllDnsRecords operation with and without retries enabled
  @Test
  public void testListAllDnsRecordsWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testListAllDnsRecordsWOptions();

    dnsRecordsService.disableRetries();
    testListAllDnsRecordsWOptions();
  }

  // Test the createDnsRecord operation with a valid options model parameter
  @Test
  public void testCreateDnsRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}}}";
    String createDnsRecordPath = "/v1/testString/zones/testString/dns_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDnsRecordOptions model
    CreateDnsRecordOptions createDnsRecordOptionsModel = new CreateDnsRecordOptions.Builder()
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke createDnsRecord() with a valid options model and verify the result
    Response<DnsrecordResp> response = dnsRecordsService.createDnsRecord(createDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDnsRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDnsRecord operation with and without retries enabled
  @Test
  public void testCreateDnsRecordWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testCreateDnsRecordWOptions();

    dnsRecordsService.disableRetries();
    testCreateDnsRecordWOptions();
  }

  // Test the deleteDnsRecord operation with a valid options model parameter
  @Test
  public void testDeleteDnsRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteDnsRecordPath = "/v1/testString/zones/testString/dns_records/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDnsRecordOptions model
    DeleteDnsRecordOptions deleteDnsRecordOptionsModel = new DeleteDnsRecordOptions.Builder()
      .dnsrecordIdentifier("testString")
      .build();

    // Invoke deleteDnsRecord() with a valid options model and verify the result
    Response<DeleteDnsrecordResp> response = dnsRecordsService.deleteDnsRecord(deleteDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DeleteDnsrecordResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDnsRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDnsRecord operation with and without retries enabled
  @Test
  public void testDeleteDnsRecordWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testDeleteDnsRecordWOptions();

    dnsRecordsService.disableRetries();
    testDeleteDnsRecordWOptions();
  }

  // Test the deleteDnsRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDnsRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsRecordsService.deleteDnsRecord(null).execute();
  }

  // Test the getDnsRecord operation with a valid options model parameter
  @Test
  public void testGetDnsRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}}}";
    String getDnsRecordPath = "/v1/testString/zones/testString/dns_records/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDnsRecordOptions model
    GetDnsRecordOptions getDnsRecordOptionsModel = new GetDnsRecordOptions.Builder()
      .dnsrecordIdentifier("testString")
      .build();

    // Invoke getDnsRecord() with a valid options model and verify the result
    Response<DnsrecordResp> response = dnsRecordsService.getDnsRecord(getDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDnsRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDnsRecord operation with and without retries enabled
  @Test
  public void testGetDnsRecordWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testGetDnsRecordWOptions();

    dnsRecordsService.disableRetries();
    testGetDnsRecordWOptions();
  }

  // Test the getDnsRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDnsRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsRecordsService.getDnsRecord(null).execute();
  }

  // Test the updateDnsRecord operation with a valid options model parameter
  @Test
  public void testUpdateDnsRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}}}";
    String updateDnsRecordPath = "/v1/testString/zones/testString/dns_records/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateDnsRecordOptions model
    UpdateDnsRecordOptions updateDnsRecordOptionsModel = new UpdateDnsRecordOptions.Builder()
      .dnsrecordIdentifier("testString")
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke updateDnsRecord() with a valid options model and verify the result
    Response<DnsrecordResp> response = dnsRecordsService.updateDnsRecord(updateDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDnsRecordPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDnsRecord operation with and without retries enabled
  @Test
  public void testUpdateDnsRecordWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testUpdateDnsRecordWOptions();

    dnsRecordsService.disableRetries();
    testUpdateDnsRecordWOptions();
  }

  // Test the updateDnsRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnsRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dnsRecordsService.updateDnsRecord(null).execute();
  }

  // Test the batchDnsRecords operation with a valid options model parameter
  @Test
  public void testBatchDnsRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"deletes\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"1.2.3.4\", \"proxiable\": false, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}, \"settings\": {\"anyKey\": \"anyValue\"}, \"meta\": {\"anyKey\": \"anyValue\"}, \"comment\": \"comment\", \"tags\": [\"tags\"]}], \"patches\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"1.2.3.4\", \"proxiable\": false, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}, \"settings\": {\"anyKey\": \"anyValue\"}, \"meta\": {\"anyKey\": \"anyValue\"}, \"comment\": \"comment\", \"tags\": [\"tags\"]}], \"posts\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"1.2.3.4\", \"proxiable\": false, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}, \"settings\": {\"anyKey\": \"anyValue\"}, \"meta\": {\"anyKey\": \"anyValue\"}, \"comment\": \"comment\", \"tags\": [\"tags\"]}], \"puts\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"1.2.3.4\", \"proxiable\": false, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"anyKey\": \"anyValue\"}, \"settings\": {\"anyKey\": \"anyValue\"}, \"meta\": {\"anyKey\": \"anyValue\"}, \"comment\": \"comment\", \"tags\": [\"tags\"]}]}}";
    String batchDnsRecordsPath = "/v1/testString/zones/testString/dns_records/batch";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BatchDnsRecordsRequestDeletesItem model
    BatchDnsRecordsRequestDeletesItem batchDnsRecordsRequestDeletesItemModel = new BatchDnsRecordsRequestDeletesItem.Builder()
      .id("testString")
      .build();

    // Construct an instance of the BatchDnsRecordsRequestPatchesItem model
    BatchDnsRecordsRequestPatchesItem batchDnsRecordsRequestPatchesItemModel = new BatchDnsRecordsRequestPatchesItem.Builder()
      .id("testString")
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the DnsrecordInput model
    DnsrecordInput dnsrecordInputModel = new DnsrecordInput.Builder()
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the BatchDnsRecordsRequestPutsItem model
    BatchDnsRecordsRequestPutsItem batchDnsRecordsRequestPutsItemModel = new BatchDnsRecordsRequestPutsItem.Builder()
      .id("testString")
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the BatchDnsRecordsOptions model
    BatchDnsRecordsOptions batchDnsRecordsOptionsModel = new BatchDnsRecordsOptions.Builder()
      .deletes(java.util.Arrays.asList(batchDnsRecordsRequestDeletesItemModel))
      .patches(java.util.Arrays.asList(batchDnsRecordsRequestPatchesItemModel))
      .posts(java.util.Arrays.asList(dnsrecordInputModel))
      .puts(java.util.Arrays.asList(batchDnsRecordsRequestPutsItemModel))
      .build();

    // Invoke batchDnsRecords() with a valid options model and verify the result
    Response<BatchDnsRecordsResponse> response = dnsRecordsService.batchDnsRecords(batchDnsRecordsOptionsModel).execute();
    assertNotNull(response);
    BatchDnsRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, batchDnsRecordsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the batchDnsRecords operation with and without retries enabled
  @Test
  public void testBatchDnsRecordsWRetries() throws Throwable {
    dnsRecordsService.enableRetries(4, 30);
    testBatchDnsRecordsWOptions();

    dnsRecordsService.disableRetries();
    testBatchDnsRecordsWOptions();
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
    dnsRecordsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    dnsRecordsService = DnsRecords.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    dnsRecordsService.setServiceUrl(url);
  }
}
