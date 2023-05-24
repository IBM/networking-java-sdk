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
package com.ibm.cloud.networking.waf_rules_api.v1;

import com.ibm.cloud.networking.waf_rules_api.v1.WafRulesApi;
import com.ibm.cloud.networking.waf_rules_api.v1.model.GetWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.ListWafRulesOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.UpdateWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyCis;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyOwasp;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponse;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponseResult;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleResponseResultGroup;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponse;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultInfo;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultItem;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRulesResponseResultItemGroup;
import com.ibm.cloud.networking.waf_rules_api.v1.utils.TestUtilities;
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
 * Unit test class for the WafRulesApi service.
 */
public class WafRulesApiTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WafRulesApi wafRulesApiService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneId = "testString";

    wafRulesApiService = WafRulesApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    wafRulesApiService.setServiceUrl(url);
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

    new WafRulesApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(wafRulesApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(wafRulesApiService.getZoneId(), "testString");
  }

  @Test
  public void testListWafRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f939de3be84e66e757adcdcb87908023\", \"description\": \"SQL-injection-prevention-for-SELECT-statements\", \"priority\": \"5\", \"group\": {\"id\": \"de677e5818985db1285d0e80225f06e5\", \"name\": \"Project abc\"}, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"allowed_modes\": [\"allowedModes\"], \"mode\": \"on\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"count\": 1, \"total_count\": 2000}}";
    String listWafRulesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWafRulesOptions model
    ListWafRulesOptions listWafRulesOptionsModel = new ListWafRulesOptions.Builder()
    .packageId("testString")
    .mode("on")
    .priority("5")
    .match("all")
    .order("status")
    .groupId("de677e5818985db1285d0e80225f06e5")
    .description("SQL-injection-prevention-for-SELECT-statements")
    .direction("desc")
    .page(Long.valueOf("1"))
    .perPage(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafRulesResponse> response = wafRulesApiService.listWafRules(listWafRulesOptionsModel).execute();
    assertNotNull(response);
    WafRulesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("mode"), "on");
    assertEquals(query.get("priority"), "5");
    assertEquals(query.get("match"), "all");
    assertEquals(query.get("order"), "status");
    assertEquals(query.get("group_id"), "de677e5818985db1285d0e80225f06e5");
    assertEquals(query.get("description"), "SQL-injection-prevention-for-SELECT-statements");
    assertEquals(query.get("direction"), "desc");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("50"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWafRulesPath);
  }

  // Test the listWafRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWafRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRulesApiService.listWafRules(null).execute();
  }

  @Test
  public void testGetWafRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f939de3be84e66e757adcdcb87908023\", \"description\": \"SQL-injection-prevention-for-SELECT-statements\", \"priority\": \"5\", \"group\": {\"id\": \"de677e5818985db1285d0e80225f06e5\", \"name\": \"Project abc\"}, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"allowed_modes\": [\"allowedModes\"], \"mode\": \"on\"}}";
    String getWafRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWafRuleOptions model
    GetWafRuleOptions getWafRuleOptionsModel = new GetWafRuleOptions.Builder()
    .packageId("testString")
    .identifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafRuleResponse> response = wafRulesApiService.getWafRule(getWafRuleOptionsModel).execute();
    assertNotNull(response);
    WafRuleResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getWafRulePath);
  }

  // Test the getWafRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWafRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRulesApiService.getWafRule(null).execute();
  }

  @Test
  public void testUpdateWafRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f939de3be84e66e757adcdcb87908023\", \"description\": \"SQL-injection-prevention-for-SELECT-statements\", \"priority\": \"5\", \"group\": {\"id\": \"de677e5818985db1285d0e80225f06e5\", \"name\": \"Project abc\"}, \"package_id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"allowed_modes\": [\"allowedModes\"], \"mode\": \"on\"}}";
    String updateWafRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the WafRuleBodyCis model
    WafRuleBodyCis wafRuleBodyCisModel = new WafRuleBodyCis.Builder()
    .mode("default")
    .build();

    // Construct an instance of the WafRuleBodyOwasp model
    WafRuleBodyOwasp wafRuleBodyOwaspModel = new WafRuleBodyOwasp.Builder()
    .mode("on")
    .build();

    // Construct an instance of the UpdateWafRuleOptions model
    UpdateWafRuleOptions updateWafRuleOptionsModel = new UpdateWafRuleOptions.Builder()
    .packageId("testString")
    .identifier("testString")
    .cis(wafRuleBodyCisModel)
    .owasp(wafRuleBodyOwaspModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafRuleResponse> response = wafRulesApiService.updateWafRule(updateWafRuleOptionsModel).execute();
    assertNotNull(response);
    WafRuleResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateWafRulePath);
  }

  // Test the updateWafRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWafRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRulesApiService.updateWafRule(null).execute();
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
    wafRulesApiService = null;
  }
}