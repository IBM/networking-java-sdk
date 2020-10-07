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
package com.ibm.cloud.networking.dns_records.v1;

import com.ibm.cloud.networking.dns_records.v1.DnsRecords;
import com.ibm.cloud.networking.dns_records.v1.model.CreateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordResp;
import com.ibm.cloud.networking.dns_records.v1.model.DeleteDnsrecordRespResult;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordDetails;
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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DnsRecords service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class DnsRecordsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DnsRecords dnsRecordsService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    dnsRecordsService = DnsRecords.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    dnsRecordsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    new DnsRecords(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(dnsRecordsService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(dnsRecordsService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllDnsRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"mapKey\": \"anyValue\"}}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listAllDnsRecordsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllDnsRecordsOptions model
    ListAllDnsRecordsOptions listAllDnsRecordsOptionsModel = new ListAllDnsRecordsOptions.Builder()
    .type("testString")
    .name("host1.test-example.com")
    .content("1.2.3.4")
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .order("type")
    .direction("asc")
    .match("any")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListDnsrecordsResp> response = dnsRecordsService.listAllDnsRecords(listAllDnsRecordsOptionsModel).execute();
    assertNotNull(response);
    ListDnsrecordsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("type"), "testString");
    assertEquals(query.get("name"), "host1.test-example.com");
    assertEquals(query.get("content"), "1.2.3.4");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("5"));
    assertEquals(query.get("order"), "type");
    assertEquals(query.get("direction"), "asc");
    assertEquals(query.get("match"), "any");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllDnsRecordsPath);
  }

  @Test
  public void testCreateDnsRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"mapKey\": \"anyValue\"}}}";
    String createDnsRecordPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateDnsRecordOptions model
    CreateDnsRecordOptions createDnsRecordOptionsModel = new CreateDnsRecordOptions.Builder()
    .name("host-1.test-example.com")
    .type("A")
    .ttl(Long.valueOf("120"))
    .content("1.2.3.4")
    .priority(Long.valueOf("5"))
    .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DnsrecordResp> response = dnsRecordsService.createDnsRecord(createDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createDnsRecordPath);
  }

  @Test
  public void testDeleteDnsRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteDnsRecordPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDnsRecordOptions model
    DeleteDnsRecordOptions deleteDnsRecordOptionsModel = new DeleteDnsRecordOptions.Builder()
    .dnsrecordIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteDnsrecordResp> response = dnsRecordsService.deleteDnsRecord(deleteDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DeleteDnsrecordResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteDnsRecordPath);
  }

  // Test the deleteDnsRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDnsRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsRecordsService.deleteDnsRecord(null).execute();
  }

  @Test
  public void testGetDnsRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"mapKey\": \"anyValue\"}}}";
    String getDnsRecordPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDnsRecordOptions model
    GetDnsRecordOptions getDnsRecordOptionsModel = new GetDnsRecordOptions.Builder()
    .dnsrecordIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DnsrecordResp> response = dnsRecordsService.getDnsRecord(getDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getDnsRecordPath);
  }

  // Test the getDnsRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDnsRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsRecordsService.getDnsRecord(null).execute();
  }

  @Test
  public void testUpdateDnsRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"host-1.test-example.com\", \"type\": \"A\", \"content\": \"169.154.10.10\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"zone_name\": \"test-example.com\", \"proxiable\": true, \"proxied\": false, \"ttl\": 120, \"priority\": 5, \"data\": {\"mapKey\": \"anyValue\"}}}";
    String updateDnsRecordPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateDnsRecordOptions model
    UpdateDnsRecordOptions updateDnsRecordOptionsModel = new UpdateDnsRecordOptions.Builder()
    .dnsrecordIdentifier("testString")
    .name("host-1.test-example.com")
    .type("A")
    .ttl(Long.valueOf("120"))
    .content("1.2.3.4")
    .priority(Long.valueOf("5"))
    .proxied(false)
    .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DnsrecordResp> response = dnsRecordsService.updateDnsRecord(updateDnsRecordOptionsModel).execute();
    assertNotNull(response);
    DnsrecordResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateDnsRecordPath);
  }

  // Test the updateDnsRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDnsRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    dnsRecordsService.updateDnsRecord(null).execute();
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
    dnsRecordsService = null;
  }
}