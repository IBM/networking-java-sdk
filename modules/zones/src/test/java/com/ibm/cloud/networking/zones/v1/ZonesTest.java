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
package com.ibm.cloud.networking.zones.v1;

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
 * Unit test class for the Zones service.
 */
public class ZonesTest

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Zones zonesService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    zonesService = Zones.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    zonesService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new Zones(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(zonesService.getCrn(), "testString");
  }

  @Test
  public void testListZonesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"]}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listZonesPath = java.net.URLEncoder.encode("/v1/testString/zones", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListZonesOptions model
    ListZonesOptions listZonesOptionsModel = new ListZonesOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListZonesResp> response = zonesService.listZones(listZonesOptionsModel).execute();
    assertNotNull(response);
    ListZonesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listZonesPath);
  }

  @Test
  public void testCreateZoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"]}}";
    String createZonePath = java.net.URLEncoder.encode("/v1/testString/zones", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateZoneOptions model
    CreateZoneOptions createZoneOptionsModel = new CreateZoneOptions.Builder()
    .name("test-example.com")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneResp> response = zonesService.createZone(createZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createZonePath);
  }

  @Test
  public void testDeleteZoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZonePath = java.net.URLEncoder.encode("/v1/testString/zones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteZoneOptions model
    DeleteZoneOptions deleteZoneOptionsModel = new DeleteZoneOptions.Builder()
    .zoneIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteZoneResp> response = zonesService.deleteZone(deleteZoneOptionsModel).execute();
    assertNotNull(response);
    DeleteZoneResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteZonePath);
  }

  // Test the deleteZone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zonesService.deleteZone(null).execute();
  }

  @Test
  public void testGetZoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"]}}";
    String getZonePath = java.net.URLEncoder.encode("/v1/testString/zones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetZoneOptions model
    GetZoneOptions getZoneOptionsModel = new GetZoneOptions.Builder()
    .zoneIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneResp> response = zonesService.getZone(getZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getZonePath);
  }

  // Test the getZone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zonesService.getZone(null).execute();
  }

  @Test
  public void testUpdateZoneWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\", \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"name\": \"test-example.com\", \"original_registrar\": \"GoDaddy\", \"original_dnshost\": \"NameCheap\", \"status\": \"active\", \"paused\": false, \"original_name_servers\": [\"ns1.originaldnshost.com\"], \"name_servers\": [\"ns001.name.cloud.ibm.com\"]}}";
    String updateZonePath = java.net.URLEncoder.encode("/v1/testString/zones/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateZoneOptions model
    UpdateZoneOptions updateZoneOptionsModel = new UpdateZoneOptions.Builder()
    .zoneIdentifier("testString")
    .paused(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneResp> response = zonesService.updateZone(updateZoneOptionsModel).execute();
    assertNotNull(response);
    ZoneResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateZonePath);
  }

  // Test the updateZone operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zonesService.updateZone(null).execute();
  }

  @Test
  public void testZoneActivationCheckWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String zoneActivationCheckPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/activation_check", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ZoneActivationCheckOptions model
    ZoneActivationCheckOptions zoneActivationCheckOptionsModel = new ZoneActivationCheckOptions.Builder()
    .zoneIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneActivationcheckResp> response = zonesService.zoneActivationCheck(zoneActivationCheckOptionsModel).execute();
    assertNotNull(response);
    ZoneActivationcheckResp responseObj = response.getResult();
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
    assertEquals(parsedPath, zoneActivationCheckPath);
  }

  // Test the zoneActivationCheck operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testZoneActivationCheckNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zonesService.zoneActivationCheck(null).execute();
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
    zonesService = null;
  }
}