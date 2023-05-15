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
package com.ibm.cloud.networking.dns_record_bulk.v1;

import com.ibm.cloud.networking.dns_record_bulk.v1.DnsRecordBulk;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObject;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectMessagesItem;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectResult;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.DnsRecordsObjectTiming;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.GetDnsRecordsBulkOptions;
import com.ibm.cloud.networking.dns_record_bulk.v1.model.PostDnsRecordsBulkOptions;
import com.ibm.cloud.networking.dns_record_bulk.v1.utils.TestUtilities;
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
 * Unit test class for the DnsRecordBulk service.
 */
public class DnsRecordBulkTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DnsRecordBulk dnsRecordBulkService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    dnsRecordBulkService = DnsRecordBulk.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    dnsRecordBulkService.setServiceUrl(url);
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

    new DnsRecordBulk(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(dnsRecordBulkService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(dnsRecordBulkService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testGetDnsRecordsBulkWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
    String getDnsRecordsBulkPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records_bulk", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "text/plain; charset=utf-8")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDnsRecordsBulkOptions model
    GetDnsRecordsBulkOptions getDnsRecordsBulkOptionsModel = new GetDnsRecordsBulkOptions();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = dnsRecordBulkService.getDnsRecordsBulk(getDnsRecordsBulkOptionsModel).execute();
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
    assertEquals(parsedPath, getDnsRecordsBulkPath);
  }

  @Test
  public void testPostDnsRecordsBulkWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"code\": 4, \"message\": \"message\"}], \"result\": {\"recs_added\": 5, \"total_records_parsed\": 5}, \"timing\": {\"start_time\": \"2014-03-01T12:20:00Z\", \"end_time\": \"2014-03-01T12:20:01Z\", \"process_time\": 1}}";
    String postDnsRecordsBulkPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/dns_records_bulk", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PostDnsRecordsBulkOptions model
    PostDnsRecordsBulkOptions postDnsRecordsBulkOptionsModel = new PostDnsRecordsBulkOptions.Builder()
    .file(TestUtilities.createMockStream("This is a mock file."))
    .fileContentType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DnsRecordsObject> response = dnsRecordBulkService.postDnsRecordsBulk(postDnsRecordsBulkOptionsModel).execute();
    assertNotNull(response);
    DnsRecordsObject responseObj = response.getResult();
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
    assertEquals(parsedPath, postDnsRecordsBulkPath);
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
    dnsRecordBulkService = null;
  }
}