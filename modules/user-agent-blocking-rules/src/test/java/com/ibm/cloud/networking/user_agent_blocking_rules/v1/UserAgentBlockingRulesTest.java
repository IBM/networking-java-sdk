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
package com.ibm.cloud.networking.user_agent_blocking_rules.v1;

import com.ibm.cloud.networking.user_agent_blocking_rules.v1.UserAgentBlockingRules;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.CreateZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteUseragentRuleResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteUseragentRuleRespResult;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.DeleteZoneUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.GetUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListAllZoneUserAgentRulesOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListUseragentRulesResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.ListUseragentRulesRespResultInfo;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UpdateUserAgentRuleOptions;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleInputConfiguration;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleObject;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleObjectConfiguration;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.model.UseragentRuleResp;
import com.ibm.cloud.networking.user_agent_blocking_rules.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
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
 * Unit test class for the UserAgentBlockingRules service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class UserAgentBlockingRulesTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected UserAgentBlockingRules userAgentBlockingRulesService;

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

    userAgentBlockingRulesService = UserAgentBlockingRules.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    userAgentBlockingRulesService.setServiceUrl(url);
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

    new UserAgentBlockingRules(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(userAgentBlockingRulesService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(userAgentBlockingRulesService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testListAllZoneUserAgentRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"paused\": true, \"description\": \"Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack\", \"mode\": \"block\", \"configuration\": {\"target\": \"ua\", \"value\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4\"}}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllZoneUserAgentRulesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/ua_rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllZoneUserAgentRulesOptions model
    ListAllZoneUserAgentRulesOptions listAllZoneUserAgentRulesOptionsModel = new ListAllZoneUserAgentRulesOptions.Builder()
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListUseragentRulesResp> response = userAgentBlockingRulesService.listAllZoneUserAgentRules(listAllZoneUserAgentRulesOptionsModel).execute();
    assertNotNull(response);
    ListUseragentRulesResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listAllZoneUserAgentRulesPath);
  }

  @Test
  public void testCreateZoneUserAgentRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"paused\": true, \"description\": \"Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack\", \"mode\": \"block\", \"configuration\": {\"target\": \"ua\", \"value\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4\"}}}";
    String createZoneUserAgentRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/ua_rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UseragentRuleInputConfiguration model
    UseragentRuleInputConfiguration useragentRuleInputConfigurationModel = new UseragentRuleInputConfiguration.Builder()
    .target("ua")
    .value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4")
    .build();

    // Construct an instance of the CreateZoneUserAgentRuleOptions model
    CreateZoneUserAgentRuleOptions createZoneUserAgentRuleOptionsModel = new CreateZoneUserAgentRuleOptions.Builder()
    .paused(true)
    .description("Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack")
    .mode("block")
    .configuration(useragentRuleInputConfigurationModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<UseragentRuleResp> response = userAgentBlockingRulesService.createZoneUserAgentRule(createZoneUserAgentRuleOptionsModel).execute();
    assertNotNull(response);
    UseragentRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createZoneUserAgentRulePath);
  }

  @Test
  public void testDeleteZoneUserAgentRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteZoneUserAgentRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/ua_rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteZoneUserAgentRuleOptions model
    DeleteZoneUserAgentRuleOptions deleteZoneUserAgentRuleOptionsModel = new DeleteZoneUserAgentRuleOptions.Builder()
    .useragentRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteUseragentRuleResp> response = userAgentBlockingRulesService.deleteZoneUserAgentRule(deleteZoneUserAgentRuleOptionsModel).execute();
    assertNotNull(response);
    DeleteUseragentRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteZoneUserAgentRulePath);
  }

  // Test the deleteZoneUserAgentRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteZoneUserAgentRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    userAgentBlockingRulesService.deleteZoneUserAgentRule(null).execute();
  }

  @Test
  public void testGetUserAgentRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"paused\": true, \"description\": \"Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack\", \"mode\": \"block\", \"configuration\": {\"target\": \"ua\", \"value\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4\"}}}";
    String getUserAgentRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/ua_rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetUserAgentRuleOptions model
    GetUserAgentRuleOptions getUserAgentRuleOptionsModel = new GetUserAgentRuleOptions.Builder()
    .useragentRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<UseragentRuleResp> response = userAgentBlockingRulesService.getUserAgentRule(getUserAgentRuleOptionsModel).execute();
    assertNotNull(response);
    UseragentRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getUserAgentRulePath);
  }

  // Test the getUserAgentRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetUserAgentRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    userAgentBlockingRulesService.getUserAgentRule(null).execute();
  }

  @Test
  public void testUpdateUserAgentRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"paused\": true, \"description\": \"Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack\", \"mode\": \"block\", \"configuration\": {\"target\": \"ua\", \"value\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4\"}}}";
    String updateUserAgentRulePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/ua_rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UseragentRuleInputConfiguration model
    UseragentRuleInputConfiguration useragentRuleInputConfigurationModel = new UseragentRuleInputConfiguration.Builder()
    .target("ua")
    .value("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4")
    .build();

    // Construct an instance of the UpdateUserAgentRuleOptions model
    UpdateUserAgentRuleOptions updateUserAgentRuleOptionsModel = new UpdateUserAgentRuleOptions.Builder()
    .useragentRuleIdentifier("testString")
    .paused(true)
    .description("Prevent access from abusive clients identified by this UserAgent to mitigate DDoS attack")
    .mode("block")
    .configuration(useragentRuleInputConfigurationModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<UseragentRuleResp> response = userAgentBlockingRulesService.updateUserAgentRule(updateUserAgentRuleOptionsModel).execute();
    assertNotNull(response);
    UseragentRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateUserAgentRulePath);
  }

  // Test the updateUserAgentRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateUserAgentRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    userAgentBlockingRulesService.updateUserAgentRule(null).execute();
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
    userAgentBlockingRulesService = null;
  }
}