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
package com.ibm.cloud.networking.custom_pages.v1;

import com.ibm.cloud.networking.custom_pages.v1.CustomPages;
import com.ibm.cloud.networking.custom_pages.v1.model.CustomPageObject;
import com.ibm.cloud.networking.custom_pages.v1.model.CustomPageSpecificResp;
import com.ibm.cloud.networking.custom_pages.v1.model.GetInstanceCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.GetZoneCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.ListCustomPagesResp;
import com.ibm.cloud.networking.custom_pages.v1.model.ListCustomPagesRespResultInfo;
import com.ibm.cloud.networking.custom_pages.v1.model.ListInstanceCustomPagesOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.ListZoneCustomPagesOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.UpdateInstanceCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.model.UpdateZoneCustomPageOptions;
import com.ibm.cloud.networking.custom_pages.v1.utils.TestUtilities;
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
 * Unit test class for the CustomPages service.
 */
public class CustomPagesTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected CustomPages customPagesService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    customPagesService = CustomPages.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    customPagesService.setServiceUrl(url);
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

    new CustomPages(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(customPagesService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(customPagesService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListInstanceCustomPagesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"total_pages\": 1, \"count\": 10, \"total_count\": 10}}";
    String listInstanceCustomPagesPath = java.net.URLEncoder.encode("/v1/testString/custom_pages", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInstanceCustomPagesOptions model
    ListInstanceCustomPagesOptions listInstanceCustomPagesOptionsModel = new ListInstanceCustomPagesOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListCustomPagesResp> response = customPagesService.listInstanceCustomPages(listInstanceCustomPagesOptionsModel).execute();
    assertNotNull(response);
    ListCustomPagesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listInstanceCustomPagesPath);
  }

  @Test
  public void testGetInstanceCustomPageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}}";
    String getInstanceCustomPagePath = java.net.URLEncoder.encode("/v1/testString/custom_pages/basic_challenge", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInstanceCustomPageOptions model
    GetInstanceCustomPageOptions getInstanceCustomPageOptionsModel = new GetInstanceCustomPageOptions.Builder()
    .pageIdentifier("basic_challenge")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomPageSpecificResp> response = customPagesService.getInstanceCustomPage(getInstanceCustomPageOptionsModel).execute();
    assertNotNull(response);
    CustomPageSpecificResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getInstanceCustomPagePath);
  }

  // Test the getInstanceCustomPage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceCustomPageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    customPagesService.getInstanceCustomPage(null).execute();
  }

  @Test
  public void testUpdateInstanceCustomPageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}}";
    String updateInstanceCustomPagePath = java.net.URLEncoder.encode("/v1/testString/custom_pages/basic_challenge", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateInstanceCustomPageOptions model
    UpdateInstanceCustomPageOptions updateInstanceCustomPageOptionsModel = new UpdateInstanceCustomPageOptions.Builder()
    .pageIdentifier("basic_challenge")
    .url("https://www.example.com/basic_challenge_error.html")
    .state("customized")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomPageSpecificResp> response = customPagesService.updateInstanceCustomPage(updateInstanceCustomPageOptionsModel).execute();
    assertNotNull(response);
    CustomPageSpecificResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateInstanceCustomPagePath);
  }

  // Test the updateInstanceCustomPage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceCustomPageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    customPagesService.updateInstanceCustomPage(null).execute();
  }

  @Test
  public void testListZoneCustomPagesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}], \"result_info\": {\"page\": 1, \"per_page\": 20, \"total_pages\": 1, \"count\": 10, \"total_count\": 10}}";
    String listZoneCustomPagesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_pages", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListZoneCustomPagesOptions model
    ListZoneCustomPagesOptions listZoneCustomPagesOptionsModel = new ListZoneCustomPagesOptions();

    // Invoke operation with valid options model (positive test)
    Response<ListCustomPagesResp> response = customPagesService.listZoneCustomPages(listZoneCustomPagesOptionsModel).execute();
    assertNotNull(response);
    ListCustomPagesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listZoneCustomPagesPath);
  }

  @Test
  public void testGetZoneCustomPageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}}";
    String getZoneCustomPagePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_pages/basic_challenge", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetZoneCustomPageOptions model
    GetZoneCustomPageOptions getZoneCustomPageOptionsModel = new GetZoneCustomPageOptions.Builder()
    .pageIdentifier("basic_challenge")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomPageSpecificResp> response = customPagesService.getZoneCustomPage(getZoneCustomPageOptionsModel).execute();
    assertNotNull(response);
    CustomPageSpecificResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getZoneCustomPagePath);
  }

  // Test the getZoneCustomPage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneCustomPageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    customPagesService.getZoneCustomPage(null).execute();
  }

  @Test
  public void testUpdateZoneCustomPageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"basic_challenge\", \"description\": \"Basic Challenge\", \"required_tokens\": [\"::CAPTCHA_BOX::\"], \"preview_target\": \"block:basic-sec-captcha\", \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"url\": \"https://www.example.com/basic_challenge_error.html\", \"state\": \"customized\"}}";
    String updateZoneCustomPagePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/custom_pages/basic_challenge", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateZoneCustomPageOptions model
    UpdateZoneCustomPageOptions updateZoneCustomPageOptionsModel = new UpdateZoneCustomPageOptions.Builder()
    .pageIdentifier("basic_challenge")
    .url("https://www.example.com/basic_challenge_error.html")
    .state("customized")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CustomPageSpecificResp> response = customPagesService.updateZoneCustomPage(updateZoneCustomPageOptionsModel).execute();
    assertNotNull(response);
    CustomPageSpecificResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateZoneCustomPagePath);
  }

  // Test the updateZoneCustomPage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneCustomPageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    customPagesService.updateZoneCustomPage(null).execute();
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
    customPagesService = null;
  }
}