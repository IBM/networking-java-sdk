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
package com.ibm.cloud.networking.waf_rule_groups_api.v1;

import com.ibm.cloud.networking.waf_rule_groups_api.v1.WafRuleGroupsApi;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.GetWafRuleGroupOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.ListWafRuleGroupsOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.UpdateWafRuleGroupOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupResponse;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupResponseResultInfo;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupsResponse;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafGroupsResponseResultInfo;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.WafRuleProperties;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.utils.TestUtilities;
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
 * Unit test class for the WafRuleGroupsApi service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class WafRuleGroupsApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WafRuleGroupsApi wafRuleGroupsApiService;

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
    String zoneId = "testString";

    wafRuleGroupsApiService = WafRuleGroupsApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    wafRuleGroupsApiService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneId = "testString";

    new WafRuleGroupsApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(wafRuleGroupsApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(wafRuleGroupsApiService.getZoneId(), "testString");
  }

  @Test
  public void testListWafRuleGroupsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"Project Honey Pot\", \"description\": \"Group designed to protect against IP addresses that are a threat and typically used to launch DDoS attacks\", \"rules_count\": 10, \"modified_rules_count\": 10, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"mode\": \"on\", \"allowed_modes\": [\"allowedModes\"]}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listWafRuleGroupsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/groups", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWafRuleGroupsOptions model
    ListWafRuleGroupsOptions listWafRuleGroupsOptionsModel = new ListWafRuleGroupsOptions.Builder()
    .pkgId("testString")
    .name("Wordpress-rules")
    .mode("true")
    .rulesCount("10")
    .page(Long.valueOf("1"))
    .perPage(Long.valueOf("50"))
    .order("status")
    .direction("desc")
    .match("all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafGroupsResponse> response = wafRuleGroupsApiService.listWafRuleGroups(listWafRuleGroupsOptionsModel).execute();
    assertNotNull(response);
    WafGroupsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("name"), "Wordpress-rules");
    assertEquals(query.get("mode"), "true");
    assertEquals(query.get("rules_count"), "10");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("50"));
    assertEquals(query.get("order"), "status");
    assertEquals(query.get("direction"), "desc");
    assertEquals(query.get("match"), "all");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWafRuleGroupsPath);
  }

  // Test the listWafRuleGroups operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWafRuleGroupsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRuleGroupsApiService.listWafRuleGroups(null).execute();
  }

  @Test
  public void testGetWafRuleGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"Project Honey Pot\", \"description\": \"Group designed to protect against IP addresses that are a threat and typically used to launch DDoS attacks\", \"rules_count\": 10, \"modified_rules_count\": 10, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"mode\": \"on\", \"allowed_modes\": [\"allowedModes\"]}, \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String getWafRuleGroupPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWafRuleGroupOptions model
    GetWafRuleGroupOptions getWafRuleGroupOptionsModel = new GetWafRuleGroupOptions.Builder()
    .pkgId("testString")
    .groupId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafGroupResponse> response = wafRuleGroupsApiService.getWafRuleGroup(getWafRuleGroupOptionsModel).execute();
    assertNotNull(response);
    WafGroupResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getWafRuleGroupPath);
  }

  // Test the getWafRuleGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWafRuleGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRuleGroupsApiService.getWafRuleGroup(null).execute();
  }

  @Test
  public void testUpdateWafRuleGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"Project Honey Pot\", \"description\": \"Group designed to protect against IP addresses that are a threat and typically used to launch DDoS attacks\", \"rules_count\": 10, \"modified_rules_count\": 10, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"mode\": \"on\", \"allowed_modes\": [\"allowedModes\"]}, \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String updateWafRuleGroupPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/groups/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateWafRuleGroupOptions model
    UpdateWafRuleGroupOptions updateWafRuleGroupOptionsModel = new UpdateWafRuleGroupOptions.Builder()
    .pkgId("testString")
    .groupId("testString")
    .mode("on")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafGroupResponse> response = wafRuleGroupsApiService.updateWafRuleGroup(updateWafRuleGroupOptionsModel).execute();
    assertNotNull(response);
    WafGroupResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateWafRuleGroupPath);
  }

  // Test the updateWafRuleGroup operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWafRuleGroupNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRuleGroupsApiService.updateWafRuleGroup(null).execute();
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
    wafRuleGroupsApiService = null;
  }
}