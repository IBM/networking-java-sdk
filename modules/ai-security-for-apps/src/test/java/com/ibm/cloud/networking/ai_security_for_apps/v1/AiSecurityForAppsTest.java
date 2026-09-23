/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.ai_security_for_apps.v1;

import com.ibm.cloud.networking.ai_security_for_apps.v1.AiSecurityForApps;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsRespResult;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayDiscoveryResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperation;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemRespResult;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputManaged;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputUser;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewaySchemasResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationItemOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperation;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationFeatures;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationFeaturesTrafficStats;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsPatchResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewayDiscoveryOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewaySchemasOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ResultInfo;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateZoneApiGatewayDiscoveryOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
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
 * Unit test class for the AiSecurityForApps service.
 */
public class AiSecurityForAppsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected AiSecurityForApps aiSecurityForAppsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";
    new AiSecurityForApps(crn, zoneIdentifier, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(aiSecurityForAppsService.getCrn(), "testString");
  }


  // Test the getter for the zoneIdentifier global parameter
  @Test
  public void testGetZoneIdentifier() throws Throwable {
    assertEquals(aiSecurityForAppsService.getZoneIdentifier(), "testString");
  }

  // Test the getAiSecuritySettings operation with a valid options model parameter
  @Test
  public void testGetAiSecuritySettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"enabled\": false}}";
    String getAiSecuritySettingsPath = "/v1/testString/zones/testString/ai_security/settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAiSecuritySettingsOptions model
    GetAiSecuritySettingsOptions getAiSecuritySettingsOptionsModel = new GetAiSecuritySettingsOptions();

    // Invoke getAiSecuritySettings() with a valid options model and verify the result
    Response<AiSecuritySettingsResp> response = aiSecurityForAppsService.getAiSecuritySettings(getAiSecuritySettingsOptionsModel).execute();
    assertNotNull(response);
    AiSecuritySettingsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAiSecuritySettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getAiSecuritySettings operation with and without retries enabled
  @Test
  public void testGetAiSecuritySettingsWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testGetAiSecuritySettingsWOptions();

    aiSecurityForAppsService.disableRetries();
    testGetAiSecuritySettingsWOptions();
  }

  // Test the replaceZoneAiSecuritySettings operation with a valid options model parameter
  @Test
  public void testReplaceZoneAiSecuritySettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"enabled\": false}}";
    String replaceZoneAiSecuritySettingsPath = "/v1/testString/zones/testString/ai_security/settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceZoneAiSecuritySettingsOptions model
    ReplaceZoneAiSecuritySettingsOptions replaceZoneAiSecuritySettingsOptionsModel = new ReplaceZoneAiSecuritySettingsOptions.Builder()
      .enabled(true)
      .build();

    // Invoke replaceZoneAiSecuritySettings() with a valid options model and verify the result
    Response<AiSecuritySettingsResp> response = aiSecurityForAppsService.replaceZoneAiSecuritySettings(replaceZoneAiSecuritySettingsOptionsModel).execute();
    assertNotNull(response);
    AiSecuritySettingsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceZoneAiSecuritySettingsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceZoneAiSecuritySettings operation with and without retries enabled
  @Test
  public void testReplaceZoneAiSecuritySettingsWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testReplaceZoneAiSecuritySettingsWOptions();

    aiSecurityForAppsService.disableRetries();
    testReplaceZoneAiSecuritySettingsWOptions();
  }

  // Test the getApiGatewayDiscovery operation with a valid options model parameter
  @Test
  public void testGetApiGatewayDiscoveryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"anyKey\": \"anyValue\"}}";
    String getApiGatewayDiscoveryPath = "/v1/testString/zones/testString/api_gateway/discovery";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetApiGatewayDiscoveryOptions model
    GetApiGatewayDiscoveryOptions getApiGatewayDiscoveryOptionsModel = new GetApiGatewayDiscoveryOptions();

    // Invoke getApiGatewayDiscovery() with a valid options model and verify the result
    Response<ApiGatewayDiscoveryResp> response = aiSecurityForAppsService.getApiGatewayDiscovery(getApiGatewayDiscoveryOptionsModel).execute();
    assertNotNull(response);
    ApiGatewayDiscoveryResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getApiGatewayDiscoveryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getApiGatewayDiscovery operation with and without retries enabled
  @Test
  public void testGetApiGatewayDiscoveryWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testGetApiGatewayDiscoveryWOptions();

    aiSecurityForAppsService.disableRetries();
    testGetApiGatewayDiscoveryWOptions();
  }

  // Test the listApiGatewayDiscoveryOperations operation with a valid options model parameter
  @Test
  public void testListApiGatewayDiscoveryOperationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"endpoint\": \"/v1/messages\", \"host\": \"api.example.com\", \"method\": \"POST\", \"last_updated\": \"2024-01-01T00:00:00.000Z\", \"origin\": [\"ML\"], \"state\": \"review\", \"features\": {\"traffic_stats\": {\"last_updated\": \"2019-01-01T12:00:00.000Z\", \"period_seconds\": 13, \"requests\": 8}}}], \"result_info\": {\"count\": 5, \"page\": 4, \"per_page\": 7, \"total_count\": 10}}";
    String listApiGatewayDiscoveryOperationsPath = "/v1/testString/zones/testString/api_gateway/discovery/operations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListApiGatewayDiscoveryOperationsOptions model
    ListApiGatewayDiscoveryOperationsOptions listApiGatewayDiscoveryOperationsOptionsModel = new ListApiGatewayDiscoveryOperationsOptions.Builder()
      .diff(true)
      .direction("asc")
      .endpoint("testString")
      .host(java.util.Arrays.asList("testString"))
      .method(java.util.Arrays.asList("testString"))
      .order("host")
      .origin("ML")
      .state("review")
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("1"))
      .build();

    // Invoke listApiGatewayDiscoveryOperations() with a valid options model and verify the result
    Response<DiscoveryOperationsListResp> response = aiSecurityForAppsService.listApiGatewayDiscoveryOperations(listApiGatewayDiscoveryOperationsOptionsModel).execute();
    assertNotNull(response);
    DiscoveryOperationsListResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listApiGatewayDiscoveryOperationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("diff")), Boolean.valueOf(true));
    assertEquals(query.get("direction"), "asc");
    assertEquals(query.get("endpoint"), "testString");
    assertEquals(query.get("host"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("method"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("order"), "host");
    assertEquals(query.get("origin"), "ML");
    assertEquals(query.get("state"), "review");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("1"));
  }

  // Test the listApiGatewayDiscoveryOperations operation with and without retries enabled
  @Test
  public void testListApiGatewayDiscoveryOperationsWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testListApiGatewayDiscoveryOperationsWOptions();

    aiSecurityForAppsService.disableRetries();
    testListApiGatewayDiscoveryOperationsWOptions();
  }

  // Test the updateZoneApiGatewayDiscoveryOperation operation with a valid options model parameter
  @Test
  public void testUpdateZoneApiGatewayDiscoveryOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"endpoint\": \"/v1/messages\", \"host\": \"api.example.com\", \"method\": \"POST\", \"last_updated\": \"2024-01-01T00:00:00.000Z\", \"origin\": [\"ML\"], \"state\": \"review\", \"features\": {\"traffic_stats\": {\"last_updated\": \"2019-01-01T12:00:00.000Z\", \"period_seconds\": 13, \"requests\": 8}}}]}";
    String updateZoneApiGatewayDiscoveryOperationPath = "/v1/testString/zones/testString/api_gateway/discovery/operations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateZoneApiGatewayDiscoveryOperationOptions model
    UpdateZoneApiGatewayDiscoveryOperationOptions updateZoneApiGatewayDiscoveryOperationOptionsModel = new UpdateZoneApiGatewayDiscoveryOperationOptions.Builder()
      .requestBody(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke updateZoneApiGatewayDiscoveryOperation() with a valid options model and verify the result
    Response<DiscoveryOperationsPatchResp> response = aiSecurityForAppsService.updateZoneApiGatewayDiscoveryOperation(updateZoneApiGatewayDiscoveryOperationOptionsModel).execute();
    assertNotNull(response);
    DiscoveryOperationsPatchResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneApiGatewayDiscoveryOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneApiGatewayDiscoveryOperation operation with and without retries enabled
  @Test
  public void testUpdateZoneApiGatewayDiscoveryOperationWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testUpdateZoneApiGatewayDiscoveryOperationWOptions();

    aiSecurityForAppsService.disableRetries();
    testUpdateZoneApiGatewayDiscoveryOperationWOptions();
  }

  // Test the createZoneApiGatewayOperation operation with a valid options model parameter
  @Test
  public void testCreateZoneApiGatewayOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"operation_id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"method\": \"POST\", \"host\": \"api.example.com\", \"endpoint\": \"/v1/messages\"}]}";
    String createZoneApiGatewayOperationPath = "/v1/testString/zones/testString/api_gateway/operations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ApiGatewayOperation model
    ApiGatewayOperation apiGatewayOperationModel = new ApiGatewayOperation.Builder()
      .method("POST")
      .host("api.example.com")
      .endpoint("/v1/messages")
      .build();

    // Construct an instance of the CreateZoneApiGatewayOperationOptions model
    CreateZoneApiGatewayOperationOptions createZoneApiGatewayOperationOptionsModel = new CreateZoneApiGatewayOperationOptions.Builder()
      .apiGatewayOperation(java.util.Arrays.asList(apiGatewayOperationModel))
      .build();

    // Invoke createZoneApiGatewayOperation() with a valid options model and verify the result
    Response<ApiGatewayOperationsResp> response = aiSecurityForAppsService.createZoneApiGatewayOperation(createZoneApiGatewayOperationOptionsModel).execute();
    assertNotNull(response);
    ApiGatewayOperationsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createZoneApiGatewayOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createZoneApiGatewayOperation operation with and without retries enabled
  @Test
  public void testCreateZoneApiGatewayOperationWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testCreateZoneApiGatewayOperationWOptions();

    aiSecurityForAppsService.disableRetries();
    testCreateZoneApiGatewayOperationWOptions();
  }

  // Test the createApiGatewayOperationItem operation with a valid options model parameter
  @Test
  public void testCreateApiGatewayOperationItemWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"operation_id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"method\": \"POST\", \"host\": \"api.example.com\", \"endpoint\": \"/v1/messages\"}}";
    String createApiGatewayOperationItemPath = "/v1/testString/zones/testString/api_gateway/operations/item";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateApiGatewayOperationItemOptions model
    CreateApiGatewayOperationItemOptions createApiGatewayOperationItemOptionsModel = new CreateApiGatewayOperationItemOptions.Builder()
      .method("POST")
      .host("api.example.com")
      .endpoint("/v1/messages")
      .build();

    // Invoke createApiGatewayOperationItem() with a valid options model and verify the result
    Response<ApiGatewayOperationItemResp> response = aiSecurityForAppsService.createApiGatewayOperationItem(createApiGatewayOperationItemOptionsModel).execute();
    assertNotNull(response);
    ApiGatewayOperationItemResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createApiGatewayOperationItemPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createApiGatewayOperationItem operation with and without retries enabled
  @Test
  public void testCreateApiGatewayOperationItemWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testCreateApiGatewayOperationItemWOptions();

    aiSecurityForAppsService.disableRetries();
    testCreateApiGatewayOperationItemWOptions();
  }

  // Test the updateApiGatewayOperationLabels operation with a valid options model parameter
  @Test
  public void testUpdateApiGatewayOperationLabelsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"operation_id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"labels\": [{\"name\": \"cf-llm\", \"source\": \"managed\"}]}]}";
    String updateApiGatewayOperationLabelsPath = "/v1/testString/zones/testString/api_gateway/operations/labels";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ApiGatewayOperationsLabelsInputUser model
    ApiGatewayOperationsLabelsInputUser apiGatewayOperationsLabelsInputUserModel = new ApiGatewayOperationsLabelsInputUser.Builder()
      .labels(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ApiGatewayOperationsLabelsInputManaged model
    ApiGatewayOperationsLabelsInputManaged apiGatewayOperationsLabelsInputManagedModel = new ApiGatewayOperationsLabelsInputManaged.Builder()
      .labels(java.util.Arrays.asList("cf-llm"))
      .build();

    // Construct an instance of the ApiGatewayOperationsLabelsInputSelectorInclude model
    ApiGatewayOperationsLabelsInputSelectorInclude apiGatewayOperationsLabelsInputSelectorIncludeModel = new ApiGatewayOperationsLabelsInputSelectorInclude.Builder()
      .operationIds(java.util.Arrays.asList("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"))
      .build();

    // Construct an instance of the ApiGatewayOperationsLabelsInputSelector model
    ApiGatewayOperationsLabelsInputSelector apiGatewayOperationsLabelsInputSelectorModel = new ApiGatewayOperationsLabelsInputSelector.Builder()
      .include(apiGatewayOperationsLabelsInputSelectorIncludeModel)
      .build();

    // Construct an instance of the UpdateApiGatewayOperationLabelsOptions model
    UpdateApiGatewayOperationLabelsOptions updateApiGatewayOperationLabelsOptionsModel = new UpdateApiGatewayOperationLabelsOptions.Builder()
      .user(apiGatewayOperationsLabelsInputUserModel)
      .managed(apiGatewayOperationsLabelsInputManagedModel)
      .selector(apiGatewayOperationsLabelsInputSelectorModel)
      .build();

    // Invoke updateApiGatewayOperationLabels() with a valid options model and verify the result
    Response<ApiGatewayOperationsLabelsResp> response = aiSecurityForAppsService.updateApiGatewayOperationLabels(updateApiGatewayOperationLabelsOptionsModel).execute();
    assertNotNull(response);
    ApiGatewayOperationsLabelsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateApiGatewayOperationLabelsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateApiGatewayOperationLabels operation with and without retries enabled
  @Test
  public void testUpdateApiGatewayOperationLabelsWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testUpdateApiGatewayOperationLabelsWOptions();

    aiSecurityForAppsService.disableRetries();
    testUpdateApiGatewayOperationLabelsWOptions();
  }

  // Test the getZoneApiGatewayOperation operation with a valid options model parameter
  @Test
  public void testGetZoneApiGatewayOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"operation_id\": \"f174e90a-fafe-4643-bbbc-4a0ed4fc8415\", \"method\": \"POST\", \"host\": \"api.example.com\", \"endpoint\": \"/v1/messages\"}}";
    String getZoneApiGatewayOperationPath = "/v1/testString/zones/testString/api_gateway/operations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneApiGatewayOperationOptions model
    GetZoneApiGatewayOperationOptions getZoneApiGatewayOperationOptionsModel = new GetZoneApiGatewayOperationOptions.Builder()
      .operationId("testString")
      .build();

    // Invoke getZoneApiGatewayOperation() with a valid options model and verify the result
    Response<ApiGatewayOperationItemResp> response = aiSecurityForAppsService.getZoneApiGatewayOperation(getZoneApiGatewayOperationOptionsModel).execute();
    assertNotNull(response);
    ApiGatewayOperationItemResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneApiGatewayOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneApiGatewayOperation operation with and without retries enabled
  @Test
  public void testGetZoneApiGatewayOperationWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testGetZoneApiGatewayOperationWOptions();

    aiSecurityForAppsService.disableRetries();
    testGetZoneApiGatewayOperationWOptions();
  }

  // Test the getZoneApiGatewayOperation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneApiGatewayOperationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    aiSecurityForAppsService.getZoneApiGatewayOperation(null).execute();
  }

  // Test the deleteZoneApiGatewayOperation operation with a valid options model parameter
  @Test
  public void testDeleteZoneApiGatewayOperationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteZoneApiGatewayOperationPath = "/v1/testString/zones/testString/api_gateway/operations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteZoneApiGatewayOperationOptions model
    DeleteZoneApiGatewayOperationOptions deleteZoneApiGatewayOperationOptionsModel = new DeleteZoneApiGatewayOperationOptions.Builder()
      .operationId("testString")
      .build();

    // Invoke deleteZoneApiGatewayOperation() with a valid options model and verify the result
    Response<Void> response = aiSecurityForAppsService.deleteZoneApiGatewayOperation(deleteZoneApiGatewayOperationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZoneApiGatewayOperationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteZoneApiGatewayOperation operation with and without retries enabled
  @Test
  public void testDeleteZoneApiGatewayOperationWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testDeleteZoneApiGatewayOperationWOptions();

    aiSecurityForAppsService.disableRetries();
    testDeleteZoneApiGatewayOperationWOptions();
  }

  // Test the deleteZoneApiGatewayOperation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneApiGatewayOperationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    aiSecurityForAppsService.deleteZoneApiGatewayOperation(null).execute();
  }

  // Test the getApiGatewaySchemas operation with a valid options model parameter
  @Test
  public void testGetApiGatewaySchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"anyKey\": \"anyValue\"}}";
    String getApiGatewaySchemasPath = "/v1/testString/zones/testString/api_gateway/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetApiGatewaySchemasOptions model
    GetApiGatewaySchemasOptions getApiGatewaySchemasOptionsModel = new GetApiGatewaySchemasOptions();

    // Invoke getApiGatewaySchemas() with a valid options model and verify the result
    Response<ApiGatewaySchemasResp> response = aiSecurityForAppsService.getApiGatewaySchemas(getApiGatewaySchemasOptionsModel).execute();
    assertNotNull(response);
    ApiGatewaySchemasResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getApiGatewaySchemasPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getApiGatewaySchemas operation with and without retries enabled
  @Test
  public void testGetApiGatewaySchemasWRetries() throws Throwable {
    aiSecurityForAppsService.enableRetries(4, 30);
    testGetApiGatewaySchemasWOptions();

    aiSecurityForAppsService.disableRetries();
    testGetApiGatewaySchemasWOptions();
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
    aiSecurityForAppsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    aiSecurityForAppsService = AiSecurityForApps.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    aiSecurityForAppsService.setServiceUrl(url);
  }
}