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
package com.ibm.cloud.networking.cis_range_applications.v1;

import com.ibm.cloud.networking.cis_range_applications.v1.CisRangeApplications;
import com.ibm.cloud.networking.cis_range_applications.v1.model.CreateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.DeleteRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.GetRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.ListRangeAppsOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqEdgeIps;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeAppReqOriginDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObject;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObjectDns;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationObjectEdgeIps;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplicationResp;
import com.ibm.cloud.networking.cis_range_applications.v1.model.RangeApplications;
import com.ibm.cloud.networking.cis_range_applications.v1.model.UpdateRangeAppOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.utils.TestUtilities;
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
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CisRangeApplications service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class CisRangeApplicationsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected CisRangeApplications cisRangeApplicationsService;

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

    cisRangeApplicationsService = CisRangeApplications.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    cisRangeApplicationsService.setServiceUrl(url);
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

    new CisRangeApplications(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(cisRangeApplicationsService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(cisRangeApplicationsService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListRangeAppsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"ea95132c15732412d22c1476fa83f27a\", \"protocol\": \"tcp/22\", \"dns\": {\"type\": \"CNAME\", \"name\": \"ssh.example.com\"}, \"origin_direct\": [\"originDirect\"], \"ip_firewall\": true, \"proxy_protocol\": \"v1\", \"edge_ips\": {\"type\": \"dynamic\", \"connectivity\": \"ipv4\"}, \"tls\": \"flexible\", \"traffic_type\": \"direct\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\"}]}";
    String listRangeAppsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/range/apps", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListRangeAppsOptions model
    ListRangeAppsOptions listRangeAppsOptionsModel = new ListRangeAppsOptions.Builder()
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("1"))
    .order("protocol")
    .direction("asc")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RangeApplications> response = cisRangeApplicationsService.listRangeApps(listRangeAppsOptionsModel).execute();
    assertNotNull(response);
    RangeApplications responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("1"));
    assertEquals(query.get("order"), "protocol");
    assertEquals(query.get("direction"), "asc");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listRangeAppsPath);
  }

  @Test
  public void testCreateRangeAppWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"ea95132c15732412d22c1476fa83f27a\", \"protocol\": \"tcp/22\", \"dns\": {\"type\": \"CNAME\", \"name\": \"ssh.example.com\"}, \"origin_direct\": [\"originDirect\"], \"ip_firewall\": true, \"proxy_protocol\": \"v1\", \"edge_ips\": {\"type\": \"dynamic\", \"connectivity\": \"ipv4\"}, \"tls\": \"flexible\", \"traffic_type\": \"direct\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\"}}";
    String createRangeAppPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/range/apps", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RangeAppReqDns model
    RangeAppReqDns rangeAppReqDnsModel = new RangeAppReqDns.Builder()
    .type("CNAME")
    .name("ssh.example.com")
    .build();

    // Construct an instance of the RangeAppReqOriginDns model
    RangeAppReqOriginDns rangeAppReqOriginDnsModel = new RangeAppReqOriginDns.Builder()
    .name("origin.net")
    .build();

    // Construct an instance of the RangeAppReqEdgeIps model
    RangeAppReqEdgeIps rangeAppReqEdgeIpsModel = new RangeAppReqEdgeIps.Builder()
    .type("dynamic")
    .connectivity("all")
    .build();

    // Construct an instance of the CreateRangeAppOptions model
    CreateRangeAppOptions createRangeAppOptionsModel = new CreateRangeAppOptions.Builder()
    .protocol("tcp/22")
    .dns(rangeAppReqDnsModel)
    .originDirect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .originDns(rangeAppReqOriginDnsModel)
    .originPort(Long.valueOf("22"))
    .ipFirewall(true)
    .proxyProtocol("off")
    .edgeIps(rangeAppReqEdgeIpsModel)
    .trafficType("direct")
    .tls("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RangeApplicationResp> response = cisRangeApplicationsService.createRangeApp(createRangeAppOptionsModel).execute();
    assertNotNull(response);
    RangeApplicationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createRangeAppPath);
  }

  // Test the createRangeApp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateRangeAppNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    cisRangeApplicationsService.createRangeApp(null).execute();
  }

  @Test
  public void testGetRangeAppWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"ea95132c15732412d22c1476fa83f27a\", \"protocol\": \"tcp/22\", \"dns\": {\"type\": \"CNAME\", \"name\": \"ssh.example.com\"}, \"origin_direct\": [\"originDirect\"], \"ip_firewall\": true, \"proxy_protocol\": \"v1\", \"edge_ips\": {\"type\": \"dynamic\", \"connectivity\": \"ipv4\"}, \"tls\": \"flexible\", \"traffic_type\": \"direct\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\"}}";
    String getRangeAppPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/range/apps/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetRangeAppOptions model
    GetRangeAppOptions getRangeAppOptionsModel = new GetRangeAppOptions.Builder()
    .appIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RangeApplicationResp> response = cisRangeApplicationsService.getRangeApp(getRangeAppOptionsModel).execute();
    assertNotNull(response);
    RangeApplicationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getRangeAppPath);
  }

  // Test the getRangeApp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRangeAppNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    cisRangeApplicationsService.getRangeApp(null).execute();
  }

  @Test
  public void testUpdateRangeAppWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"ea95132c15732412d22c1476fa83f27a\", \"protocol\": \"tcp/22\", \"dns\": {\"type\": \"CNAME\", \"name\": \"ssh.example.com\"}, \"origin_direct\": [\"originDirect\"], \"ip_firewall\": true, \"proxy_protocol\": \"v1\", \"edge_ips\": {\"type\": \"dynamic\", \"connectivity\": \"ipv4\"}, \"tls\": \"flexible\", \"traffic_type\": \"direct\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\"}}";
    String updateRangeAppPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/range/apps/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RangeAppReqDns model
    RangeAppReqDns rangeAppReqDnsModel = new RangeAppReqDns.Builder()
    .type("CNAME")
    .name("ssh.example.com")
    .build();

    // Construct an instance of the RangeAppReqOriginDns model
    RangeAppReqOriginDns rangeAppReqOriginDnsModel = new RangeAppReqOriginDns.Builder()
    .name("origin.net")
    .build();

    // Construct an instance of the RangeAppReqEdgeIps model
    RangeAppReqEdgeIps rangeAppReqEdgeIpsModel = new RangeAppReqEdgeIps.Builder()
    .type("dynamic")
    .connectivity("all")
    .build();

    // Construct an instance of the UpdateRangeAppOptions model
    UpdateRangeAppOptions updateRangeAppOptionsModel = new UpdateRangeAppOptions.Builder()
    .appIdentifier("testString")
    .protocol("tcp/22")
    .dns(rangeAppReqDnsModel)
    .originDirect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .originDns(rangeAppReqOriginDnsModel)
    .originPort(Long.valueOf("22"))
    .ipFirewall(true)
    .proxyProtocol("off")
    .edgeIps(rangeAppReqEdgeIpsModel)
    .trafficType("direct")
    .tls("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RangeApplicationResp> response = cisRangeApplicationsService.updateRangeApp(updateRangeAppOptionsModel).execute();
    assertNotNull(response);
    RangeApplicationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateRangeAppPath);
  }

  // Test the updateRangeApp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateRangeAppNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    cisRangeApplicationsService.updateRangeApp(null).execute();
  }

  @Test
  public void testDeleteRangeAppWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"ea95132c15732412d22c1476fa83f27a\", \"protocol\": \"tcp/22\", \"dns\": {\"type\": \"CNAME\", \"name\": \"ssh.example.com\"}, \"origin_direct\": [\"originDirect\"], \"ip_firewall\": true, \"proxy_protocol\": \"v1\", \"edge_ips\": {\"type\": \"dynamic\", \"connectivity\": \"ipv4\"}, \"tls\": \"flexible\", \"traffic_type\": \"direct\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\"}}";
    String deleteRangeAppPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/range/apps/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteRangeAppOptions model
    DeleteRangeAppOptions deleteRangeAppOptionsModel = new DeleteRangeAppOptions.Builder()
    .appIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RangeApplicationResp> response = cisRangeApplicationsService.deleteRangeApp(deleteRangeAppOptionsModel).execute();
    assertNotNull(response);
    RangeApplicationResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteRangeAppPath);
  }

  // Test the deleteRangeApp operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteRangeAppNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    cisRangeApplicationsService.deleteRangeApp(null).execute();
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
    cisRangeApplicationsService = null;
  }
}