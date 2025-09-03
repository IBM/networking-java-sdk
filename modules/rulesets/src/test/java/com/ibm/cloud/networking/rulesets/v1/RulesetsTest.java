/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1;

import com.ibm.cloud.networking.rulesets.v1.Rulesets;
import com.ibm.cloud.networking.rulesets.v1.model.ActionParameters;
import com.ibm.cloud.networking.rulesets.v1.model.ActionParametersResponse;
import com.ibm.cloud.networking.rulesets.v1.model.CategoriesOverride;
import com.ibm.cloud.networking.rulesets.v1.model.CreateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.CreateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.DeleteZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionByTagOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetInstanceRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntryPointRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetVersionsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.GetZoneRulesetsOptions;
import com.ibm.cloud.networking.rulesets.v1.model.ListRulesetsResp;
import com.ibm.cloud.networking.rulesets.v1.model.ListedRuleset;
import com.ibm.cloud.networking.rulesets.v1.model.Logging;
import com.ibm.cloud.networking.rulesets.v1.model.Message;
import com.ibm.cloud.networking.rulesets.v1.model.MessageSource;
import com.ibm.cloud.networking.rulesets.v1.model.Overrides;
import com.ibm.cloud.networking.rulesets.v1.model.Position;
import com.ibm.cloud.networking.rulesets.v1.model.Ratelimit;
import com.ibm.cloud.networking.rulesets.v1.model.RuleCreate;
import com.ibm.cloud.networking.rulesets.v1.model.RuleDetails;
import com.ibm.cloud.networking.rulesets.v1.model.RuleResp;
import com.ibm.cloud.networking.rulesets.v1.model.RulesOverride;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetDetails;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetResp;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateInstanceRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneEntrypointRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetOptions;
import com.ibm.cloud.networking.rulesets.v1.model.UpdateZoneRulesetRuleOptions;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
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
 * Unit test class for the Rulesets service.
 */
public class RulesetsTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Rulesets rulesetsService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";
    new Rulesets(crn, zoneIdentifier, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(rulesetsService.getCrn(), "testString");
  }


  // Test the getter for the zoneIdentifier global parameter
  @Test
  public void testGetZoneIdentifier() throws Throwable {
    assertEquals(rulesetsService.getZoneIdentifier(), "testString");
  }

  // Test the getInstanceRulesets operation with a valid options model parameter
  @Test
  public void testGetInstanceRulesetsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getInstanceRulesetsPath = "/v1/testString/rulesets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceRulesetsOptions model
    GetInstanceRulesetsOptions getInstanceRulesetsOptionsModel = new GetInstanceRulesetsOptions();

    // Invoke getInstanceRulesets() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getInstanceRulesets(getInstanceRulesetsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceRulesetsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceRulesets operation with and without retries enabled
  @Test
  public void testGetInstanceRulesetsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceRulesetsWOptions();

    rulesetsService.disableRetries();
    testGetInstanceRulesetsWOptions();
  }

  // Test the getInstanceRuleset operation with a valid options model parameter
  @Test
  public void testGetInstanceRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getInstanceRulesetPath = "/v1/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceRulesetOptions model
    GetInstanceRulesetOptions getInstanceRulesetOptionsModel = new GetInstanceRulesetOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke getInstanceRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getInstanceRuleset(getInstanceRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceRuleset operation with and without retries enabled
  @Test
  public void testGetInstanceRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceRulesetWOptions();

    rulesetsService.disableRetries();
    testGetInstanceRulesetWOptions();
  }

  // Test the getInstanceRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceRuleset(null).execute();
  }

  // Test the updateInstanceRuleset operation with a valid options model parameter
  @Test
  public void testUpdateInstanceRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateInstanceRulesetPath = "/v1/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the RuleCreate model
    RuleCreate ruleCreateModel = new RuleCreate.Builder()
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Construct an instance of the UpdateInstanceRulesetOptions model
    UpdateInstanceRulesetOptions updateInstanceRulesetOptionsModel = new UpdateInstanceRulesetOptions.Builder()
      .rulesetId("testString")
      .description("Custom instance ruleset")
      .kind("managed")
      .name("testString")
      .phase("ddos_l4")
      .rules(java.util.Arrays.asList(ruleCreateModel))
      .build();

    // Invoke updateInstanceRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateInstanceRuleset(updateInstanceRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceRuleset operation with and without retries enabled
  @Test
  public void testUpdateInstanceRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateInstanceRulesetWOptions();

    rulesetsService.disableRetries();
    testUpdateInstanceRulesetWOptions();
  }

  // Test the updateInstanceRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateInstanceRuleset(null).execute();
  }

  // Test the deleteInstanceRuleset operation with a valid options model parameter
  @Test
  public void testDeleteInstanceRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceRulesetPath = "/v1/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceRulesetOptions model
    DeleteInstanceRulesetOptions deleteInstanceRulesetOptionsModel = new DeleteInstanceRulesetOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke deleteInstanceRuleset() with a valid options model and verify the result
    Response<Void> response = rulesetsService.deleteInstanceRuleset(deleteInstanceRulesetOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceRuleset operation with and without retries enabled
  @Test
  public void testDeleteInstanceRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteInstanceRulesetWOptions();

    rulesetsService.disableRetries();
    testDeleteInstanceRulesetWOptions();
  }

  // Test the deleteInstanceRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteInstanceRuleset(null).execute();
  }

  // Test the getInstanceRulesetVersions operation with a valid options model parameter
  @Test
  public void testGetInstanceRulesetVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getInstanceRulesetVersionsPath = "/v1/testString/rulesets/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceRulesetVersionsOptions model
    GetInstanceRulesetVersionsOptions getInstanceRulesetVersionsOptionsModel = new GetInstanceRulesetVersionsOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke getInstanceRulesetVersions() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getInstanceRulesetVersions(getInstanceRulesetVersionsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceRulesetVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceRulesetVersions operation with and without retries enabled
  @Test
  public void testGetInstanceRulesetVersionsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceRulesetVersionsWOptions();

    rulesetsService.disableRetries();
    testGetInstanceRulesetVersionsWOptions();
  }

  // Test the getInstanceRulesetVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceRulesetVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceRulesetVersions(null).execute();
  }

  // Test the getInstanceRulesetVersion operation with a valid options model parameter
  @Test
  public void testGetInstanceRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getInstanceRulesetVersionPath = "/v1/testString/rulesets/testString/versions/1";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceRulesetVersionOptions model
    GetInstanceRulesetVersionOptions getInstanceRulesetVersionOptionsModel = new GetInstanceRulesetVersionOptions.Builder()
      .rulesetId("testString")
      .rulesetVersion("1")
      .build();

    // Invoke getInstanceRulesetVersion() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getInstanceRulesetVersion(getInstanceRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceRulesetVersion operation with and without retries enabled
  @Test
  public void testGetInstanceRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testGetInstanceRulesetVersionWOptions();
  }

  // Test the getInstanceRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceRulesetVersion(null).execute();
  }

  // Test the deleteInstanceRulesetVersion operation with a valid options model parameter
  @Test
  public void testDeleteInstanceRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceRulesetVersionPath = "/v1/testString/rulesets/testString/versions/1";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceRulesetVersionOptions model
    DeleteInstanceRulesetVersionOptions deleteInstanceRulesetVersionOptionsModel = new DeleteInstanceRulesetVersionOptions.Builder()
      .rulesetId("testString")
      .rulesetVersion("1")
      .build();

    // Invoke deleteInstanceRulesetVersion() with a valid options model and verify the result
    Response<Void> response = rulesetsService.deleteInstanceRulesetVersion(deleteInstanceRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceRulesetVersion operation with and without retries enabled
  @Test
  public void testDeleteInstanceRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteInstanceRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testDeleteInstanceRulesetVersionWOptions();
  }

  // Test the deleteInstanceRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteInstanceRulesetVersion(null).execute();
  }

  // Test the getInstanceEntrypointRuleset operation with a valid options model parameter
  @Test
  public void testGetInstanceEntrypointRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getInstanceEntrypointRulesetPath = "/v1/testString/rulesets/phases/ddos_l4/entrypoint";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceEntrypointRulesetOptions model
    GetInstanceEntrypointRulesetOptions getInstanceEntrypointRulesetOptionsModel = new GetInstanceEntrypointRulesetOptions.Builder()
      .rulesetPhase("ddos_l4")
      .build();

    // Invoke getInstanceEntrypointRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getInstanceEntrypointRuleset(getInstanceEntrypointRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceEntrypointRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceEntrypointRuleset operation with and without retries enabled
  @Test
  public void testGetInstanceEntrypointRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceEntrypointRulesetWOptions();

    rulesetsService.disableRetries();
    testGetInstanceEntrypointRulesetWOptions();
  }

  // Test the getInstanceEntrypointRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceEntrypointRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceEntrypointRuleset(null).execute();
  }

  // Test the updateInstanceEntrypointRuleset operation with a valid options model parameter
  @Test
  public void testUpdateInstanceEntrypointRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateInstanceEntrypointRulesetPath = "/v1/testString/rulesets/phases/ddos_l4/entrypoint";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the RuleCreate model
    RuleCreate ruleCreateModel = new RuleCreate.Builder()
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Construct an instance of the UpdateInstanceEntrypointRulesetOptions model
    UpdateInstanceEntrypointRulesetOptions updateInstanceEntrypointRulesetOptionsModel = new UpdateInstanceEntrypointRulesetOptions.Builder()
      .rulesetPhase("ddos_l4")
      .description("Custom instance ruleset")
      .kind("managed")
      .name("testString")
      .phase("ddos_l4")
      .rules(java.util.Arrays.asList(ruleCreateModel))
      .build();

    // Invoke updateInstanceEntrypointRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateInstanceEntrypointRuleset(updateInstanceEntrypointRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceEntrypointRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceEntrypointRuleset operation with and without retries enabled
  @Test
  public void testUpdateInstanceEntrypointRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateInstanceEntrypointRulesetWOptions();

    rulesetsService.disableRetries();
    testUpdateInstanceEntrypointRulesetWOptions();
  }

  // Test the updateInstanceEntrypointRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceEntrypointRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateInstanceEntrypointRuleset(null).execute();
  }

  // Test the getInstanceEntryPointRulesetVersions operation with a valid options model parameter
  @Test
  public void testGetInstanceEntryPointRulesetVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getInstanceEntryPointRulesetVersionsPath = "/v1/testString/rulesets/phases/ddos_l4/entrypoint/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceEntryPointRulesetVersionsOptions model
    GetInstanceEntryPointRulesetVersionsOptions getInstanceEntryPointRulesetVersionsOptionsModel = new GetInstanceEntryPointRulesetVersionsOptions.Builder()
      .rulesetPhase("ddos_l4")
      .build();

    // Invoke getInstanceEntryPointRulesetVersions() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getInstanceEntryPointRulesetVersions(getInstanceEntryPointRulesetVersionsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceEntryPointRulesetVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceEntryPointRulesetVersions operation with and without retries enabled
  @Test
  public void testGetInstanceEntryPointRulesetVersionsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceEntryPointRulesetVersionsWOptions();

    rulesetsService.disableRetries();
    testGetInstanceEntryPointRulesetVersionsWOptions();
  }

  // Test the getInstanceEntryPointRulesetVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceEntryPointRulesetVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceEntryPointRulesetVersions(null).execute();
  }

  // Test the getInstanceEntryPointRulesetVersion operation with a valid options model parameter
  @Test
  public void testGetInstanceEntryPointRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getInstanceEntryPointRulesetVersionPath = "/v1/testString/rulesets/phases/ddos_l4/entrypoint/versions/1";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceEntryPointRulesetVersionOptions model
    GetInstanceEntryPointRulesetVersionOptions getInstanceEntryPointRulesetVersionOptionsModel = new GetInstanceEntryPointRulesetVersionOptions.Builder()
      .rulesetPhase("ddos_l4")
      .rulesetVersion("1")
      .build();

    // Invoke getInstanceEntryPointRulesetVersion() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getInstanceEntryPointRulesetVersion(getInstanceEntryPointRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceEntryPointRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceEntryPointRulesetVersion operation with and without retries enabled
  @Test
  public void testGetInstanceEntryPointRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceEntryPointRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testGetInstanceEntryPointRulesetVersionWOptions();
  }

  // Test the getInstanceEntryPointRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceEntryPointRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceEntryPointRulesetVersion(null).execute();
  }

  // Test the createInstanceRulesetRule operation with a valid options model parameter
  @Test
  public void testCreateInstanceRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String createInstanceRulesetRulePath = "/v1/testString/rulesets/testString/rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the CreateInstanceRulesetRuleOptions model
    CreateInstanceRulesetRuleOptions createInstanceRulesetRuleOptionsModel = new CreateInstanceRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Invoke createInstanceRulesetRule() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.createInstanceRulesetRule(createInstanceRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceRulesetRule operation with and without retries enabled
  @Test
  public void testCreateInstanceRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testCreateInstanceRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testCreateInstanceRulesetRuleWOptions();
  }

  // Test the createInstanceRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.createInstanceRulesetRule(null).execute();
  }

  // Test the updateInstanceRulesetRule operation with a valid options model parameter
  @Test
  public void testUpdateInstanceRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateInstanceRulesetRulePath = "/v1/testString/rulesets/testString/rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the UpdateInstanceRulesetRuleOptions model
    UpdateInstanceRulesetRuleOptions updateInstanceRulesetRuleOptionsModel = new UpdateInstanceRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .ruleId("testString")
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Invoke updateInstanceRulesetRule() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateInstanceRulesetRule(updateInstanceRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceRulesetRule operation with and without retries enabled
  @Test
  public void testUpdateInstanceRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateInstanceRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testUpdateInstanceRulesetRuleWOptions();
  }

  // Test the updateInstanceRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateInstanceRulesetRule(null).execute();
  }

  // Test the deleteInstanceRulesetRule operation with a valid options model parameter
  @Test
  public void testDeleteInstanceRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}}";
    String deleteInstanceRulesetRulePath = "/v1/testString/rulesets/testString/rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceRulesetRuleOptions model
    DeleteInstanceRulesetRuleOptions deleteInstanceRulesetRuleOptionsModel = new DeleteInstanceRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .ruleId("testString")
      .build();

    // Invoke deleteInstanceRulesetRule() with a valid options model and verify the result
    Response<RuleResp> response = rulesetsService.deleteInstanceRulesetRule(deleteInstanceRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RuleResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceRulesetRule operation with and without retries enabled
  @Test
  public void testDeleteInstanceRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteInstanceRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testDeleteInstanceRulesetRuleWOptions();
  }

  // Test the deleteInstanceRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteInstanceRulesetRule(null).execute();
  }

  // Test the getInstanceRulesetVersionByTag operation with a valid options model parameter
  @Test
  public void testGetInstanceRulesetVersionByTagWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getInstanceRulesetVersionByTagPath = "/v1/testString/rulesets/testString/versions/1/by_tag/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceRulesetVersionByTagOptions model
    GetInstanceRulesetVersionByTagOptions getInstanceRulesetVersionByTagOptionsModel = new GetInstanceRulesetVersionByTagOptions.Builder()
      .rulesetId("testString")
      .rulesetVersion("1")
      .ruleTag("testString")
      .build();

    // Invoke getInstanceRulesetVersionByTag() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getInstanceRulesetVersionByTag(getInstanceRulesetVersionByTagOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceRulesetVersionByTagPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceRulesetVersionByTag operation with and without retries enabled
  @Test
  public void testGetInstanceRulesetVersionByTagWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetInstanceRulesetVersionByTagWOptions();

    rulesetsService.disableRetries();
    testGetInstanceRulesetVersionByTagWOptions();
  }

  // Test the getInstanceRulesetVersionByTag operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceRulesetVersionByTagNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getInstanceRulesetVersionByTag(null).execute();
  }

  // Test the getZoneRulesets operation with a valid options model parameter
  @Test
  public void testGetZoneRulesetsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getZoneRulesetsPath = "/v1/testString/zones/testString/rulesets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneRulesetsOptions model
    GetZoneRulesetsOptions getZoneRulesetsOptionsModel = new GetZoneRulesetsOptions();

    // Invoke getZoneRulesets() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getZoneRulesets(getZoneRulesetsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneRulesetsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneRulesets operation with and without retries enabled
  @Test
  public void testGetZoneRulesetsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneRulesetsWOptions();

    rulesetsService.disableRetries();
    testGetZoneRulesetsWOptions();
  }

  // Test the getZoneRuleset operation with a valid options model parameter
  @Test
  public void testGetZoneRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getZoneRulesetPath = "/v1/testString/zones/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneRulesetOptions model
    GetZoneRulesetOptions getZoneRulesetOptionsModel = new GetZoneRulesetOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke getZoneRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getZoneRuleset(getZoneRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneRuleset operation with and without retries enabled
  @Test
  public void testGetZoneRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneRulesetWOptions();

    rulesetsService.disableRetries();
    testGetZoneRulesetWOptions();
  }

  // Test the getZoneRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneRuleset(null).execute();
  }

  // Test the updateZoneRuleset operation with a valid options model parameter
  @Test
  public void testUpdateZoneRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateZoneRulesetPath = "/v1/testString/zones/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the RuleCreate model
    RuleCreate ruleCreateModel = new RuleCreate.Builder()
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Construct an instance of the UpdateZoneRulesetOptions model
    UpdateZoneRulesetOptions updateZoneRulesetOptionsModel = new UpdateZoneRulesetOptions.Builder()
      .rulesetId("testString")
      .description("Custom instance ruleset")
      .kind("managed")
      .name("testString")
      .phase("ddos_l4")
      .rules(java.util.Arrays.asList(ruleCreateModel))
      .build();

    // Invoke updateZoneRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateZoneRuleset(updateZoneRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneRuleset operation with and without retries enabled
  @Test
  public void testUpdateZoneRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateZoneRulesetWOptions();

    rulesetsService.disableRetries();
    testUpdateZoneRulesetWOptions();
  }

  // Test the updateZoneRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateZoneRuleset(null).execute();
  }

  // Test the deleteZoneRuleset operation with a valid options model parameter
  @Test
  public void testDeleteZoneRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteZoneRulesetPath = "/v1/testString/zones/testString/rulesets/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteZoneRulesetOptions model
    DeleteZoneRulesetOptions deleteZoneRulesetOptionsModel = new DeleteZoneRulesetOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke deleteZoneRuleset() with a valid options model and verify the result
    Response<Void> response = rulesetsService.deleteZoneRuleset(deleteZoneRulesetOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZoneRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteZoneRuleset operation with and without retries enabled
  @Test
  public void testDeleteZoneRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteZoneRulesetWOptions();

    rulesetsService.disableRetries();
    testDeleteZoneRulesetWOptions();
  }

  // Test the deleteZoneRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteZoneRuleset(null).execute();
  }

  // Test the getZoneRulesetVersions operation with a valid options model parameter
  @Test
  public void testGetZoneRulesetVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getZoneRulesetVersionsPath = "/v1/testString/zones/testString/rulesets/testString/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneRulesetVersionsOptions model
    GetZoneRulesetVersionsOptions getZoneRulesetVersionsOptionsModel = new GetZoneRulesetVersionsOptions.Builder()
      .rulesetId("testString")
      .build();

    // Invoke getZoneRulesetVersions() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getZoneRulesetVersions(getZoneRulesetVersionsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneRulesetVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneRulesetVersions operation with and without retries enabled
  @Test
  public void testGetZoneRulesetVersionsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneRulesetVersionsWOptions();

    rulesetsService.disableRetries();
    testGetZoneRulesetVersionsWOptions();
  }

  // Test the getZoneRulesetVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneRulesetVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneRulesetVersions(null).execute();
  }

  // Test the getZoneRulesetVersion operation with a valid options model parameter
  @Test
  public void testGetZoneRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getZoneRulesetVersionPath = "/v1/testString/zones/testString/rulesets/testString/versions/1";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneRulesetVersionOptions model
    GetZoneRulesetVersionOptions getZoneRulesetVersionOptionsModel = new GetZoneRulesetVersionOptions.Builder()
      .rulesetId("testString")
      .rulesetVersion("1")
      .build();

    // Invoke getZoneRulesetVersion() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getZoneRulesetVersion(getZoneRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneRulesetVersion operation with and without retries enabled
  @Test
  public void testGetZoneRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testGetZoneRulesetVersionWOptions();
  }

  // Test the getZoneRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneRulesetVersion(null).execute();
  }

  // Test the deleteZoneRulesetVersion operation with a valid options model parameter
  @Test
  public void testDeleteZoneRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteZoneRulesetVersionPath = "/v1/testString/zones/testString/rulesets/testString/versions/1";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteZoneRulesetVersionOptions model
    DeleteZoneRulesetVersionOptions deleteZoneRulesetVersionOptionsModel = new DeleteZoneRulesetVersionOptions.Builder()
      .rulesetId("testString")
      .rulesetVersion("1")
      .build();

    // Invoke deleteZoneRulesetVersion() with a valid options model and verify the result
    Response<Void> response = rulesetsService.deleteZoneRulesetVersion(deleteZoneRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZoneRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteZoneRulesetVersion operation with and without retries enabled
  @Test
  public void testDeleteZoneRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteZoneRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testDeleteZoneRulesetVersionWOptions();
  }

  // Test the deleteZoneRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteZoneRulesetVersion(null).execute();
  }

  // Test the getZoneEntrypointRuleset operation with a valid options model parameter
  @Test
  public void testGetZoneEntrypointRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getZoneEntrypointRulesetPath = "/v1/testString/zones/testString/rulesets/phases/ddos_l4/entrypoint";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneEntrypointRulesetOptions model
    GetZoneEntrypointRulesetOptions getZoneEntrypointRulesetOptionsModel = new GetZoneEntrypointRulesetOptions.Builder()
      .rulesetPhase("ddos_l4")
      .build();

    // Invoke getZoneEntrypointRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getZoneEntrypointRuleset(getZoneEntrypointRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneEntrypointRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneEntrypointRuleset operation with and without retries enabled
  @Test
  public void testGetZoneEntrypointRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneEntrypointRulesetWOptions();

    rulesetsService.disableRetries();
    testGetZoneEntrypointRulesetWOptions();
  }

  // Test the getZoneEntrypointRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneEntrypointRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneEntrypointRuleset(null).execute();
  }

  // Test the updateZoneEntrypointRuleset operation with a valid options model parameter
  @Test
  public void testUpdateZoneEntrypointRulesetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateZoneEntrypointRulesetPath = "/v1/testString/zones/testString/rulesets/phases/ddos_l4/entrypoint";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the RuleCreate model
    RuleCreate ruleCreateModel = new RuleCreate.Builder()
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Construct an instance of the UpdateZoneEntrypointRulesetOptions model
    UpdateZoneEntrypointRulesetOptions updateZoneEntrypointRulesetOptionsModel = new UpdateZoneEntrypointRulesetOptions.Builder()
      .rulesetPhase("ddos_l4")
      .description("Custom instance ruleset")
      .kind("managed")
      .name("testString")
      .phase("ddos_l4")
      .rules(java.util.Arrays.asList(ruleCreateModel))
      .build();

    // Invoke updateZoneEntrypointRuleset() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateZoneEntrypointRuleset(updateZoneEntrypointRulesetOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneEntrypointRulesetPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneEntrypointRuleset operation with and without retries enabled
  @Test
  public void testUpdateZoneEntrypointRulesetWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateZoneEntrypointRulesetWOptions();

    rulesetsService.disableRetries();
    testUpdateZoneEntrypointRulesetWOptions();
  }

  // Test the updateZoneEntrypointRuleset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneEntrypointRulesetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateZoneEntrypointRuleset(null).execute();
  }

  // Test the getZoneEntryPointRulesetVersions operation with a valid options model parameter
  @Test
  public void testGetZoneEntryPointRulesetVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": [{\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\"}]}";
    String getZoneEntryPointRulesetVersionsPath = "/v1/testString/zones/testString/rulesets/phases/ddos_l4/entrypoint/versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneEntryPointRulesetVersionsOptions model
    GetZoneEntryPointRulesetVersionsOptions getZoneEntryPointRulesetVersionsOptionsModel = new GetZoneEntryPointRulesetVersionsOptions.Builder()
      .rulesetPhase("ddos_l4")
      .build();

    // Invoke getZoneEntryPointRulesetVersions() with a valid options model and verify the result
    Response<ListRulesetsResp> response = rulesetsService.getZoneEntryPointRulesetVersions(getZoneEntryPointRulesetVersionsOptionsModel).execute();
    assertNotNull(response);
    ListRulesetsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneEntryPointRulesetVersionsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneEntryPointRulesetVersions operation with and without retries enabled
  @Test
  public void testGetZoneEntryPointRulesetVersionsWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneEntryPointRulesetVersionsWOptions();

    rulesetsService.disableRetries();
    testGetZoneEntryPointRulesetVersionsWOptions();
  }

  // Test the getZoneEntryPointRulesetVersions operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneEntryPointRulesetVersionsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneEntryPointRulesetVersions(null).execute();
  }

  // Test the getZoneEntryPointRulesetVersion operation with a valid options model parameter
  @Test
  public void testGetZoneEntryPointRulesetVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String getZoneEntryPointRulesetVersionPath = "/v1/testString/zones/testString/rulesets/phases/ddos_l4/entrypoint/versions/1";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetZoneEntryPointRulesetVersionOptions model
    GetZoneEntryPointRulesetVersionOptions getZoneEntryPointRulesetVersionOptionsModel = new GetZoneEntryPointRulesetVersionOptions.Builder()
      .rulesetPhase("ddos_l4")
      .rulesetVersion("1")
      .build();

    // Invoke getZoneEntryPointRulesetVersion() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.getZoneEntryPointRulesetVersion(getZoneEntryPointRulesetVersionOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getZoneEntryPointRulesetVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getZoneEntryPointRulesetVersion operation with and without retries enabled
  @Test
  public void testGetZoneEntryPointRulesetVersionWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testGetZoneEntryPointRulesetVersionWOptions();

    rulesetsService.disableRetries();
    testGetZoneEntryPointRulesetVersionWOptions();
  }

  // Test the getZoneEntryPointRulesetVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetZoneEntryPointRulesetVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.getZoneEntryPointRulesetVersion(null).execute();
  }

  // Test the createZoneRulesetRule operation with a valid options model parameter
  @Test
  public void testCreateZoneRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String createZoneRulesetRulePath = "/v1/testString/zones/testString/rulesets/testString/rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the CreateZoneRulesetRuleOptions model
    CreateZoneRulesetRuleOptions createZoneRulesetRuleOptionsModel = new CreateZoneRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Invoke createZoneRulesetRule() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.createZoneRulesetRule(createZoneRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createZoneRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createZoneRulesetRule operation with and without retries enabled
  @Test
  public void testCreateZoneRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testCreateZoneRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testCreateZoneRulesetRuleWOptions();
  }

  // Test the createZoneRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateZoneRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.createZoneRulesetRule(null).execute();
  }

  // Test the updateZoneRulesetRule operation with a valid options model parameter
  @Test
  public void testUpdateZoneRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"description\": \"Custom instance ruleset\", \"id\": \"id\", \"kind\": \"managed\", \"last_updated\": \"2000-01-01T00:00:00.000000Z\", \"name\": \"name\", \"phase\": \"ddos_l4\", \"version\": \"1\", \"rules\": [{\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}]}}";
    String updateZoneRulesetRulePath = "/v1/testString/zones/testString/rulesets/testString/rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesOverride model
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();

    // Construct an instance of the CategoriesOverride model
    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();

    // Construct an instance of the Overrides model
    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();

    // Construct an instance of the ActionParametersResponse model
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();

    // Construct an instance of the ActionParameters model
    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();

    // Construct an instance of the Ratelimit model
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();

    // Construct an instance of the Logging model
    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();

    // Construct an instance of the Position model
    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();

    // Construct an instance of the UpdateZoneRulesetRuleOptions model
    UpdateZoneRulesetRuleOptions updateZoneRulesetRuleOptionsModel = new UpdateZoneRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .ruleId("testString")
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();

    // Invoke updateZoneRulesetRule() with a valid options model and verify the result
    Response<RulesetResp> response = rulesetsService.updateZoneRulesetRule(updateZoneRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RulesetResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateZoneRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateZoneRulesetRule operation with and without retries enabled
  @Test
  public void testUpdateZoneRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testUpdateZoneRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testUpdateZoneRulesetRuleWOptions();
  }

  // Test the updateZoneRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateZoneRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.updateZoneRulesetRule(null).execute();
  }

  // Test the deleteZoneRulesetRule operation with a valid options model parameter
  @Test
  public void testDeleteZoneRulesetRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"messages\": [{\"code\": 10000, \"message\": \"something failed in the request\", \"source\": {\"pointer\": \"/rules/0/action\"}}], \"result\": {\"id\": \"id\", \"version\": \"version\", \"action\": \"action\", \"action_parameters\": {\"id\": \"id\", \"overrides\": {\"action\": \"action\", \"enabled\": false, \"sensitivity_level\": \"high\", \"rules\": [{\"id\": \"id\", \"enabled\": false, \"action\": \"action\", \"sensitivity_level\": \"high\", \"score_threshold\": 60}], \"categories\": [{\"category\": \"category\", \"enabled\": false, \"action\": \"action\"}]}, \"version\": \"version\", \"ruleset\": \"ruleset\", \"rulesets\": [\"rulesets\"], \"phases\": [\"phases\"], \"products\": [\"products\"], \"response\": {\"content\": \"{\\\"success\\\": false, \\\"error\\\": \\\"you have been blocked\\\"}\", \"content_type\": \"application/json\", \"status_code\": 400}}, \"categories\": [\"categories\"], \"enabled\": true, \"description\": \"description\", \"expression\": \"ip.src ne 1.1.1.1\", \"ref\": \"my_ref\", \"logging\": {\"enabled\": true}, \"last_updated\": \"2000-01-01T00:00:00.000000Z\"}}";
    String deleteZoneRulesetRulePath = "/v1/testString/zones/testString/rulesets/testString/rules/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteZoneRulesetRuleOptions model
    DeleteZoneRulesetRuleOptions deleteZoneRulesetRuleOptionsModel = new DeleteZoneRulesetRuleOptions.Builder()
      .rulesetId("testString")
      .ruleId("testString")
      .build();

    // Invoke deleteZoneRulesetRule() with a valid options model and verify the result
    Response<RuleResp> response = rulesetsService.deleteZoneRulesetRule(deleteZoneRulesetRuleOptionsModel).execute();
    assertNotNull(response);
    RuleResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteZoneRulesetRulePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteZoneRulesetRule operation with and without retries enabled
  @Test
  public void testDeleteZoneRulesetRuleWRetries() throws Throwable {
    rulesetsService.enableRetries(4, 30);
    testDeleteZoneRulesetRuleWOptions();

    rulesetsService.disableRetries();
    testDeleteZoneRulesetRuleWOptions();
  }

  // Test the deleteZoneRulesetRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneRulesetRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    rulesetsService.deleteZoneRulesetRule(null).execute();
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
    rulesetsService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    rulesetsService = Rulesets.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    rulesetsService.setServiceUrl(url);
  }
}