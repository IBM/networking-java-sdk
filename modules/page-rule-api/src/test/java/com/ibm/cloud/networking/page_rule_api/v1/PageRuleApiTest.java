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
package com.ibm.cloud.networking.page_rule_api.v1;

import com.ibm.cloud.networking.page_rule_api.v1.PageRuleApi;
import com.ibm.cloud.networking.page_rule_api.v1.model.ChangePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.CreatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.DeletePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.GetPageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.ListPageRulesOptions;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRuleResult;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesDeleteResponse;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesDeleteResponseResult;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseListAll;
import com.ibm.cloud.networking.page_rule_api.v1.model.PageRulesResponseWithoutResultInfo;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItem;
import com.ibm.cloud.networking.page_rule_api.v1.model.TargetsItemConstraint;
import com.ibm.cloud.networking.page_rule_api.v1.model.UpdatePageRuleOptions;
import com.ibm.cloud.networking.page_rule_api.v1.utils.TestUtilities;
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
 * Unit test class for the PageRuleApi service.
 */
public class PageRuleApiTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected PageRuleApi testService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    // set mock values for global params
    String zoneId = "testString";

    testService = PageRuleApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    testService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    // set mock values for global params
    String zoneId = "testString";

    new PageRuleApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(testService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(testService.getZoneId(), "testString");
  }

  @Test
  public void testGetPageRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"9a7806061c88ada191ed06f989cc3dac\", \"targets\": [{\"target\": \"url\", \"constraint\": {\"operator\": \"matches\", \"value\": \"*example.com/images/*\"}}], \"actions\": [\"anyValue\"], \"priority\": 1, \"status\": \"active\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"created_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String getPageRulePath = "/v1/testString/zones/testString/pagerules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPageRuleOptions model
    GetPageRuleOptions getPageRuleOptionsModel = new GetPageRuleOptions.Builder()
    .ruleId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesResponseWithoutResultInfo> response = testService.getPageRule(getPageRuleOptionsModel).execute();
    assertNotNull(response);
    PageRulesResponseWithoutResultInfo responseObj = response.getResult();
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
    assertEquals(parsedPath, getPageRulePath);
  }

  // Test the getPageRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPageRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.getPageRule(null).execute();
  }

  @Test
  public void testChangePageRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"9a7806061c88ada191ed06f989cc3dac\", \"targets\": [{\"target\": \"url\", \"constraint\": {\"operator\": \"matches\", \"value\": \"*example.com/images/*\"}}], \"actions\": [\"anyValue\"], \"priority\": 1, \"status\": \"active\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"created_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String changePageRulePath = "/v1/testString/zones/testString/pagerules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the TargetsItemConstraint model
    TargetsItemConstraint targetsItemConstraintModel = new TargetsItemConstraint.Builder()
    .operator("matches")
    .value("*example.com/images/*")
    .build();

    // Construct an instance of the TargetsItem model
    TargetsItem targetsItemModel = new TargetsItem.Builder()
    .target("url")
    .constraint(targetsItemConstraintModel)
    .build();

    // Construct an instance of the ChangePageRuleOptions model
    ChangePageRuleOptions changePageRuleOptionsModel = new ChangePageRuleOptions.Builder()
    .ruleId("testString")
    .targets(new java.util.ArrayList<TargetsItem>(java.util.Arrays.asList(targetsItemModel)))
    .actions(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .priority(Long.valueOf("1"))
    .status("active")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesResponseWithoutResultInfo> response = testService.changePageRule(changePageRuleOptionsModel).execute();
    assertNotNull(response);
    PageRulesResponseWithoutResultInfo responseObj = response.getResult();
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
    assertEquals(parsedPath, changePageRulePath);
  }

  // Test the changePageRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testChangePageRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.changePageRule(null).execute();
  }

  @Test
  public void testUpdatePageRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"9a7806061c88ada191ed06f989cc3dac\", \"targets\": [{\"target\": \"url\", \"constraint\": {\"operator\": \"matches\", \"value\": \"*example.com/images/*\"}}], \"actions\": [\"anyValue\"], \"priority\": 1, \"status\": \"active\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"created_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String updatePageRulePath = "/v1/testString/zones/testString/pagerules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the TargetsItemConstraint model
    TargetsItemConstraint targetsItemConstraintModel = new TargetsItemConstraint.Builder()
    .operator("matches")
    .value("*example.com/images/*")
    .build();

    // Construct an instance of the TargetsItem model
    TargetsItem targetsItemModel = new TargetsItem.Builder()
    .target("url")
    .constraint(targetsItemConstraintModel)
    .build();

    // Construct an instance of the UpdatePageRuleOptions model
    UpdatePageRuleOptions updatePageRuleOptionsModel = new UpdatePageRuleOptions.Builder()
    .ruleId("testString")
    .targets(new java.util.ArrayList<TargetsItem>(java.util.Arrays.asList(targetsItemModel)))
    .actions(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .priority(Long.valueOf("1"))
    .status("active")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesResponseWithoutResultInfo> response = testService.updatePageRule(updatePageRuleOptionsModel).execute();
    assertNotNull(response);
    PageRulesResponseWithoutResultInfo responseObj = response.getResult();
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
    assertEquals(parsedPath, updatePageRulePath);
  }

  // Test the updatePageRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePageRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.updatePageRule(null).execute();
  }

  @Test
  public void testDeletePageRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"9a7806061c88ada191ed06f989cc3dac\"}}";
    String deletePageRulePath = "/v1/testString/zones/testString/pagerules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeletePageRuleOptions model
    DeletePageRuleOptions deletePageRuleOptionsModel = new DeletePageRuleOptions.Builder()
    .ruleId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesDeleteResponse> response = testService.deletePageRule(deletePageRuleOptionsModel).execute();
    assertNotNull(response);
    PageRulesDeleteResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, deletePageRulePath);
  }

  // Test the deletePageRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePageRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    testService.deletePageRule(null).execute();
  }

  @Test
  public void testListPageRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"9a7806061c88ada191ed06f989cc3dac\", \"targets\": [{\"target\": \"url\", \"constraint\": {\"operator\": \"matches\", \"value\": \"*example.com/images/*\"}}], \"actions\": [\"anyValue\"], \"priority\": 1, \"status\": \"active\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"created_on\": \"2014-01-01T05:20:00.12345Z\"}]}";
    String listPageRulesPath = "/v1/testString/zones/testString/pagerules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListPageRulesOptions model
    ListPageRulesOptions listPageRulesOptionsModel = new ListPageRulesOptions.Builder()
    .status("active")
    .order("status")
    .direction("desc")
    .match("all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesResponseListAll> response = testService.listPageRules(listPageRulesOptionsModel).execute();
    assertNotNull(response);
    PageRulesResponseListAll responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("status"), "active");
    assertEquals(query.get("order"), "status");
    assertEquals(query.get("direction"), "desc");
    assertEquals(query.get("match"), "all");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPageRulesPath);
  }

  @Test
  public void testCreatePageRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"9a7806061c88ada191ed06f989cc3dac\", \"targets\": [{\"target\": \"url\", \"constraint\": {\"operator\": \"matches\", \"value\": \"*example.com/images/*\"}}], \"actions\": [\"anyValue\"], \"priority\": 1, \"status\": \"active\", \"modified_on\": \"2014-01-01T05:20:00.12345Z\", \"created_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String createPageRulePath = "/v1/testString/zones/testString/pagerules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the TargetsItemConstraint model
    TargetsItemConstraint targetsItemConstraintModel = new TargetsItemConstraint.Builder()
    .operator("matches")
    .value("*example.com/images/*")
    .build();

    // Construct an instance of the TargetsItem model
    TargetsItem targetsItemModel = new TargetsItem.Builder()
    .target("url")
    .constraint(targetsItemConstraintModel)
    .build();

    // Construct an instance of the CreatePageRuleOptions model
    CreatePageRuleOptions createPageRuleOptionsModel = new CreatePageRuleOptions.Builder()
    .targets(new java.util.ArrayList<TargetsItem>(java.util.Arrays.asList(targetsItemModel)))
    .actions(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .priority(Long.valueOf("1"))
    .status("active")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PageRulesResponseWithoutResultInfo> response = testService.createPageRule(createPageRuleOptionsModel).execute();
    assertNotNull(response);
    PageRulesResponseWithoutResultInfo responseObj = response.getResult();
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
    assertEquals(parsedPath, createPageRulePath);
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
    testService = null;
  }
}