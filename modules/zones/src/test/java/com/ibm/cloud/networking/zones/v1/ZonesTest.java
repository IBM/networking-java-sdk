/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.zones.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.zones.v1.Zones;
import com.ibm.cloud.networking.zones.v1.model.CreateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneResp;
import com.ibm.cloud.networking.zones.v1.model.DeleteZoneRespResult;
import com.ibm.cloud.networking.zones.v1.model.GetZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesOptions;
import com.ibm.cloud.networking.zones.v1.model.ListZonesResp;
import com.ibm.cloud.networking.zones.v1.model.ResultInfo;
import com.ibm.cloud.networking.zones.v1.model.UpdateZoneOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationCheckOptions;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckResp;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckRespResult;
import com.ibm.cloud.networking.zones.v1.model.ZoneDetails;
import com.ibm.cloud.networking.zones.v1.model.ZoneResp;
import com.ibm.cloud.networking.zones.v1.utils.TestUtilities;
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
 * Unit test class for the Zones service.
 */
public class ZonesTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Zones zonesService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    new Zones(crn, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(zonesService.getCrn(), "testString");
  }

  // Test the listZones operation with a valid options model parameter
  @Test
  public void testListZonesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"], \"type\": \"full\", \"verification_key\": \"476754457-428595283\", \"cname_suffix\": \"cdn.cloudflare.net\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listZonesPath = "/v1/testString/zones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListZonesOptions model
    ListZonesOptions listZonesOptionsModel = new ListZonesOptions.Builder()
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("20"))
      .build();

    // Invoke listZones() with a valid options model and verify the result
    Response<ListZonesResp> response = zonesService.listZones(listZonesOptionsModel).execute();
    assertNotNull(response);
    ListZonesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listZonesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("20"));
  }

  // Test the listZones operation with and without retries enabled
  @Test
  public void testListZonesWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testListZonesWOptions();

    zonesService.disableRetries();
    testListZonesWOptions();
  }

  // Test the createZone operation with a valid options model parameter
  @Test
  public void testCreateZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"], \"type\": \"full\", \"verification_key\": \"476754457-428595283\", \"cname_suffix\": \"cdn.cloudflare.net\"}}";
    String createZonePath = "/v1/testString/zones";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateZoneOptions model
    CreateZoneOptions createZoneOptionsModel = new CreateZoneOptions.Builder()
      .name("test-example.com")
      .type("full")
      .build();

    // Invoke createZone() with a valid options model and verify the result
    Response<ZoneResp> response = zonesService.createZone(createZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createZone operation with and without retries enabled
  @Test
  public void testCreateZoneWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testCreateZoneWOptions();

    zonesService.disableRetries();
    testCreateZoneWOptions();
  }

  // Test the deleteZone operation with a valid options model parameter
  @Test
  public void testDeleteZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZonePath = "/v1/testString/zones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteZoneOptions model
    DeleteZoneOptions deleteZoneOptionsModel = new DeleteZoneOptions.Builder()
      .zoneIdentifier("testString")
      .build();

    // Invoke deleteZone() with a valid options model and verify the result
    Response<DeleteZoneResp> response = zonesService.deleteZone(deleteZoneOptionsModel).execute();
    assertNotNull(response);
    DeleteZoneResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteZone operation with and without retries enabled
  @Test
  public void testDeleteZoneWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testDeleteZoneWOptions();

    zonesService.disableRetries();
    testDeleteZoneWOptions();
  }

  // Test the deleteZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesService.deleteZone(null).execute();
  }

  // Test the getZone operation with a valid options model parameter
  @Test
  public void testGetZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"], \"type\": \"full\", \"verification_key\": \"476754457-428595283\", \"cname_suffix\": \"cdn.cloudflare.net\"}}";
    String getZonePath = "/v1/testString/zones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneOptions model
    GetZoneOptions getZoneOptionsModel = new GetZoneOptions.Builder()
      .zoneIdentifier("testString")
      .build();

    // Invoke getZone() with a valid options model and verify the result
    Response<ZoneResp> response = zonesService.getZone(getZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZone operation with and without retries enabled
  @Test
  public void testGetZoneWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testGetZoneWOptions();

    zonesService.disableRetries();
    testGetZoneWOptions();
  }

  // Test the getZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesService.getZone(null).execute();
  }

  // Test the updateZone operation with a valid options model parameter
  @Test
  public void testUpdateZoneWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"], \"type\": \"full\", \"verification_key\": \"476754457-428595283\", \"cname_suffix\": \"cdn.cloudflare.net\"}}";
    String updateZonePath = "/v1/testString/zones/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateZoneOptions model
    UpdateZoneOptions updateZoneOptionsModel = new UpdateZoneOptions.Builder()
      .zoneIdentifier("testString")
      .paused(false)
      .build();

    // Invoke updateZone() with a valid options model and verify the result
    Response<ZoneResp> response = zonesService.updateZone(updateZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZonePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZone operation with and without retries enabled
  @Test
  public void testUpdateZoneWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testUpdateZoneWOptions();

    zonesService.disableRetries();
    testUpdateZoneWOptions();
  }

  // Test the updateZone operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesService.updateZone(null).execute();
  }

  // Test the zoneActivationCheck operation with a valid options model parameter
  @Test
  public void testZoneActivationCheckWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String zoneActivationCheckPath = "/v1/testString/zones/testString/activation_check";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ZoneActivationCheckOptions model
    ZoneActivationCheckOptions zoneActivationCheckOptionsModel = new ZoneActivationCheckOptions.Builder()
      .zoneIdentifier("testString")
      .build();

    // Invoke zoneActivationCheck() with a valid options model and verify the result
    Response<ZoneActivationcheckResp> response = zonesService.zoneActivationCheck(zoneActivationCheckOptionsModel).execute();
    assertNotNull(response);
    ZoneActivationcheckResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, zoneActivationCheckPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the zoneActivationCheck operation with and without retries enabled
  @Test
  public void testZoneActivationCheckWRetries() throws Throwable {
    zonesService.enableRetries(4, 30);
    testZoneActivationCheckWOptions();

    zonesService.disableRetries();
    testZoneActivationCheckWOptions();
  }

  // Test the zoneActivationCheck operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testZoneActivationCheckNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    zonesService.zoneActivationCheck(null).execute();
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
    zonesService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    zonesService = Zones.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    zonesService.setServiceUrl(url);
  }
}