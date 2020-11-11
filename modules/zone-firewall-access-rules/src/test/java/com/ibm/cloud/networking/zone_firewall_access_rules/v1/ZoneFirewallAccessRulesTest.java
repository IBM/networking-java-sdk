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
package com.ibm.cloud.networking.zone_firewall_access_rules.v1;

import com.ibm.cloud.networking.zone_firewall_access_rules.v1.ZoneFirewallAccessRules;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.CreateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.DeleteZoneAccessRuleRespResult;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.GetZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListAllZoneAccessRulesOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListZoneAccessRulesResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ListZoneAccessRulesRespResultInfo;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.UpdateZoneAccessRuleOptions;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleInputConfiguration;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObject;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObjectConfiguration;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleObjectScope;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.model.ZoneAccessRuleResp;
import com.ibm.cloud.networking.zone_firewall_access_rules.v1.utils.TestUtilities;
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
 * Unit test class for the ZoneFirewallAccessRules service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class ZoneFirewallAccessRulesTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ZoneFirewallAccessRules zoneFirewallAccessRulesService;

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

    zoneFirewallAccessRulesService = ZoneFirewallAccessRules.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    zoneFirewallAccessRulesService.setServiceUrl(url);
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

    new ZoneFirewallAccessRules(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(zoneFirewallAccessRulesService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(zoneFirewallAccessRulesService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllZoneAccessRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllZoneAccessRulesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/access_rules/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllZoneAccessRulesOptions model
    ListAllZoneAccessRulesOptions listAllZoneAccessRulesOptionsModel = new ListAllZoneAccessRulesOptions.Builder()
    .notes("testString")
    .mode("block")
    .configurationTarget("ip")
    .configurationValue("1.2.3.4")
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .order("configuration.target")
    .direction("asc")
    .match("any")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListZoneAccessRulesResp> response = zoneFirewallAccessRulesService.listAllZoneAccessRules(listAllZoneAccessRulesOptionsModel).execute();
    assertNotNull(response);
    ListZoneAccessRulesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("notes"), "testString");
    assertEquals(query.get("mode"), "block");
    assertEquals(query.get("configuration.target"), "ip");
    assertEquals(query.get("configuration.value"), "1.2.3.4");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("5"));
    assertEquals(query.get("order"), "configuration.target");
    assertEquals(query.get("direction"), "asc");
    assertEquals(query.get("match"), "any");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllZoneAccessRulesPath);
  }

  @Test
  public void testCreateZoneAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String createZoneAccessRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/access_rules/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ZoneAccessRuleInputConfiguration model
    ZoneAccessRuleInputConfiguration zoneAccessRuleInputConfigurationModel = new ZoneAccessRuleInputConfiguration.Builder()
    .target("ip")
    .value("ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ")
    .build();

    // Construct an instance of the CreateZoneAccessRuleOptions model
    CreateZoneAccessRuleOptions createZoneAccessRuleOptionsModel = new CreateZoneAccessRuleOptions.Builder()
    .mode("block")
    .notes("This rule is added because of event X that occurred on date xyz")
    .configuration(zoneAccessRuleInputConfigurationModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneAccessRuleResp> response = zoneFirewallAccessRulesService.createZoneAccessRule(createZoneAccessRuleOptionsModel).execute();
    assertNotNull(response);
    ZoneAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createZoneAccessRulePath);
  }

  @Test
  public void testDeleteZoneAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZoneAccessRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteZoneAccessRuleOptions model
    DeleteZoneAccessRuleOptions deleteZoneAccessRuleOptionsModel = new DeleteZoneAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteZoneAccessRuleResp> response = zoneFirewallAccessRulesService.deleteZoneAccessRule(deleteZoneAccessRuleOptionsModel).execute();
    assertNotNull(response);
    DeleteZoneAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteZoneAccessRulePath);
  }

  // Test the deleteZoneAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneFirewallAccessRulesService.deleteZoneAccessRule(null).execute();
  }

  @Test
  public void testGetZoneAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String getZoneAccessRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetZoneAccessRuleOptions model
    GetZoneAccessRuleOptions getZoneAccessRuleOptionsModel = new GetZoneAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneAccessRuleResp> response = zoneFirewallAccessRulesService.getZoneAccessRule(getZoneAccessRuleOptionsModel).execute();
    assertNotNull(response);
    ZoneAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getZoneAccessRulePath);
  }

  // Test the getZoneAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneFirewallAccessRulesService.getZoneAccessRule(null).execute();
  }

  @Test
  public void testUpdateZoneAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2014-01-01T05:20:00.12345Z\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String updateZoneAccessRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateZoneAccessRuleOptions model
    UpdateZoneAccessRuleOptions updateZoneAccessRuleOptionsModel = new UpdateZoneAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .mode("block")
    .notes("This rule is added because of event X that occurred on date xyz")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ZoneAccessRuleResp> response = zoneFirewallAccessRulesService.updateZoneAccessRule(updateZoneAccessRuleOptionsModel).execute();
    assertNotNull(response);
    ZoneAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateZoneAccessRulePath);
  }

  // Test the updateZoneAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    zoneFirewallAccessRulesService.updateZoneAccessRule(null).execute();
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
    zoneFirewallAccessRulesService = null;
  }
}