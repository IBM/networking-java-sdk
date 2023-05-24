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
package com.ibm.cloud.networking.zone_lockdown.v1;

import com.ibm.cloud.networking.zone_lockdown.v1.ZoneLockdown;
import com.ibm.cloud.networking.zone_lockdown.v1.model.CreateZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteLockdownRespResult;
import com.ibm.cloud.networking.zone_lockdown.v1.model.DeleteZoneLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.GetLockdownOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListAllZoneLockownRulesOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListLockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.ListLockdownRespResultInfo;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownInputConfigurationsItem;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownObject;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownObjectConfigurationsItem;
import com.ibm.cloud.networking.zone_lockdown.v1.model.LockdownResp;
import com.ibm.cloud.networking.zone_lockdown.v1.model.UpdateLockdownRuleOptions;
import com.ibm.cloud.networking.zone_lockdown.v1.utils.TestUtilities;
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
 * Unit test class for the ZoneLockdown service.
 */
public class ZoneLockdownTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ZoneLockdown zoneLockdownService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    zoneLockdownService = ZoneLockdown.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    zoneLockdownService.setServiceUrl(url);
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

    new ZoneLockdown(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(zoneLockdownService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(zoneLockdownService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllZoneLockownRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"372e67954025e0ba6aaa6d586b9e0b59\", \"paused\": false, \"description\": \"Restrict access to these endpoints to requests from a known IP address\", \"urls\": [\"api.mysite.com/some/endpoint*\"], \"configurations\": [{\"target\": \"ip\", \"value\": \"198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range\"}]}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllZoneLockownRulesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/lockdowns", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllZoneLockownRulesOptions model
    ListAllZoneLockownRulesOptions listAllZoneLockownRulesOptionsModel = new ListAllZoneLockownRulesOptions.Builder()
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListLockdownResp> response = zoneLockdownService.listAllZoneLockownRules(listAllZoneLockownRulesOptionsModel).execute();
    assertNotNull(response);
    ListLockdownResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("5"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllZoneLockownRulesPath);
  }

  @Test
  public void testCreateZoneLockdownRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"372e67954025e0ba6aaa6d586b9e0b59\", \"paused\": false, \"description\": \"Restrict access to these endpoints to requests from a known IP address\", \"urls\": [\"api.mysite.com/some/endpoint*\"], \"configurations\": [{\"target\": \"ip\", \"value\": \"198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range\"}]}}";
    String createZoneLockdownRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/lockdowns", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LockdownInputConfigurationsItem model
    LockdownInputConfigurationsItem lockdownInputConfigurationsItemModel = new LockdownInputConfigurationsItem.Builder()
    .target("ip")
    .value("198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range")
    .build();

    // Construct an instance of the CreateZoneLockdownRuleOptions model
    CreateZoneLockdownRuleOptions createZoneLockdownRuleOptionsModel = new CreateZoneLockdownRuleOptions.Builder()
    .id("372e67954025e0ba6aaa6d586b9e0b59")
    .paused(false)
    .description("Restrict access to these endpoints to requests from a known IP address")
    .urls(new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")))
    .configurations(new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LockdownResp> response = zoneLockdownService.createZoneLockdownRule(createZoneLockdownRuleOptionsModel).execute();
    assertNotNull(response);
    LockdownResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createZoneLockdownRulePath);
  }

  @Test
  public void testDeleteZoneLockdownRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZoneLockdownRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/lockdowns/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteZoneLockdownRuleOptions model
    DeleteZoneLockdownRuleOptions deleteZoneLockdownRuleOptionsModel = new DeleteZoneLockdownRuleOptions.Builder()
    .lockdownRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteLockdownResp> response = zoneLockdownService.deleteZoneLockdownRule(deleteZoneLockdownRuleOptionsModel).execute();
    assertNotNull(response);
    DeleteLockdownResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteZoneLockdownRulePath);
  }

  // Test the deleteZoneLockdownRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneLockdownRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneLockdownService.deleteZoneLockdownRule(null).execute();
  }

  @Test
  public void testGetLockdownWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"372e67954025e0ba6aaa6d586b9e0b59\", \"paused\": false, \"description\": \"Restrict access to these endpoints to requests from a known IP address\", \"urls\": [\"api.mysite.com/some/endpoint*\"], \"configurations\": [{\"target\": \"ip\", \"value\": \"198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range\"}]}}";
    String getLockdownPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/lockdowns/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetLockdownOptions model
    GetLockdownOptions getLockdownOptionsModel = new GetLockdownOptions.Builder()
    .lockdownRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LockdownResp> response = zoneLockdownService.getLockdown(getLockdownOptionsModel).execute();
    assertNotNull(response);
    LockdownResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getLockdownPath);
  }

  // Test the getLockdown operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLockdownNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneLockdownService.getLockdown(null).execute();
  }

  @Test
  public void testUpdateLockdownRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"372e67954025e0ba6aaa6d586b9e0b59\", \"paused\": false, \"description\": \"Restrict access to these endpoints to requests from a known IP address\", \"urls\": [\"api.mysite.com/some/endpoint*\"], \"configurations\": [{\"target\": \"ip\", \"value\": \"198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range\"}]}}";
    String updateLockdownRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/lockdowns/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the LockdownInputConfigurationsItem model
    LockdownInputConfigurationsItem lockdownInputConfigurationsItemModel = new LockdownInputConfigurationsItem.Builder()
    .target("ip")
    .value("198.51.100.4 if target=ip, 2.2.2.0/24 if target=ip_range")
    .build();

    // Construct an instance of the UpdateLockdownRuleOptions model
    UpdateLockdownRuleOptions updateLockdownRuleOptionsModel = new UpdateLockdownRuleOptions.Builder()
    .lockdownRuleIdentifier("testString")
    .id("372e67954025e0ba6aaa6d586b9e0b59")
    .paused(false)
    .description("Restrict access to these endpoints to requests from a known IP address")
    .urls(new java.util.ArrayList<String>(java.util.Arrays.asList("api.mysite.com/some/endpoint*")))
    .configurations(new java.util.ArrayList<LockdownInputConfigurationsItem>(java.util.Arrays.asList(lockdownInputConfigurationsItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LockdownResp> response = zoneLockdownService.updateLockdownRule(updateLockdownRuleOptionsModel).execute();
    assertNotNull(response);
    LockdownResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateLockdownRulePath);
  }

  // Test the updateLockdownRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLockdownRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneLockdownService.updateLockdownRule(null).execute();
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
    zoneLockdownService = null;
  }
}