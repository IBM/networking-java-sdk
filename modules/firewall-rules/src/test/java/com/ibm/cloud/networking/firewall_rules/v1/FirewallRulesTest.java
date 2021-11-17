/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.firewall_rules.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.firewall_rules.v1.FirewallRules;
import com.ibm.cloud.networking.firewall_rules.v1.model.CreateFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRuleRespResult;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesRespResultItem;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterId;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterIdFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleObject;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleObjectFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleUpdateInputFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItem;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItemFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.GetFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListAllFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListFirewallRulesResp;
import com.ibm.cloud.networking.firewall_rules.v1.model.ListFirewallRulesRespResultInfo;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewllRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
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
 * Unit test class for the FirewallRules service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class FirewallRulesTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected FirewallRules firewallRulesService;

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

    firewallRulesService = FirewallRules.newInstance(serviceName);
    String url = server.url("/").toString();
    firewallRulesService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new FirewallRules(serviceName, null);
  }

  @Test
  public void testListAllFirewallRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"52161eb6af4241bb9d4b32394be72fdf\", \"paused\": false, \"description\": \"JS challenge site\", \"action\": \"js_challenge\", \"filter\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\"}, \"created_on\": \"2019-01-01T05:20:00.123Z\", \"modified_on\": \"2019-01-01T05:20:00.123Z\"}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllFirewallRulesPath = "/v1/testString/zones/testString/firewall/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllFirewallRulesOptions model
    ListAllFirewallRulesOptions listAllFirewallRulesOptionsModel = new ListAllFirewallRulesOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListFirewallRulesResp> response = firewallRulesService.listAllFirewallRules(listAllFirewallRulesOptionsModel).execute();
    assertNotNull(response);
    ListFirewallRulesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllFirewallRulesPath);
  }
  
  // public void testListAllFirewallRulesWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testListAllFirewallRulesWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testListAllFirewallRulesWOptions();

  //   // Disable retries and run testListAllFirewallRulesWOptions.
  //   firewallRulesService.disableRetries();
  //   testListAllFirewallRulesWOptions();
  // }  

  // Test the listAllFirewallRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAllFirewallRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.listAllFirewallRules(null).execute();
  }

  @Test
  public void testCreateFirewallRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"52161eb6af4241bb9d4b32394be72fdf\", \"paused\": false, \"description\": \"JS challenge site\", \"action\": \"js_challenge\", \"filter\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\"}, \"created_on\": \"2019-01-01T05:20:00.123Z\", \"modified_on\": \"2019-01-01T05:20:00.123Z\"}]}";
    String createFirewallRulesPath = "/v1/testString/zones/testString/firewall/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FirewallRuleInputWithFilterIdFilter model
    FirewallRuleInputWithFilterIdFilter firewallRuleInputWithFilterIdFilterModel = new FirewallRuleInputWithFilterIdFilter.Builder()
    .id("6f58318e7fa2477a23112e8118c66f61")
    .build();

    // Construct an instance of the FirewallRuleInputWithFilterId model
    FirewallRuleInputWithFilterId firewallRuleInputWithFilterIdModel = new FirewallRuleInputWithFilterId.Builder()
    .filter(firewallRuleInputWithFilterIdFilterModel)
    .action("js_challenge")
    .description("JS challenge site")
    .build();

    // Construct an instance of the CreateFirewallRulesOptions model
    CreateFirewallRulesOptions createFirewallRulesOptionsModel = new CreateFirewallRulesOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .firewallRuleInputWithFilterId(new java.util.ArrayList<FirewallRuleInputWithFilterId>(java.util.Arrays.asList(firewallRuleInputWithFilterIdModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FirewallRulesResp> response = firewallRulesService.createFirewallRules(createFirewallRulesOptionsModel).execute();
    assertNotNull(response);
    FirewallRulesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createFirewallRulesPath);
  }
  
  // public void testCreateFirewallRulesWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testCreateFirewallRulesWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testCreateFirewallRulesWOptions();

  //   // Disable retries and run testCreateFirewallRulesWOptions.
  //   firewallRulesService.disableRetries();
  //   testCreateFirewallRulesWOptions();
  // }  

  // Test the createFirewallRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFirewallRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.createFirewallRules(null).execute();
  }

  @Test
  public void testUpdateFirewllRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"52161eb6af4241bb9d4b32394be72fdf\", \"paused\": false, \"description\": \"JS challenge site\", \"action\": \"js_challenge\", \"filter\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\"}, \"created_on\": \"2019-01-01T05:20:00.123Z\", \"modified_on\": \"2019-01-01T05:20:00.123Z\"}]}";
    String updateFirewllRulesPath = "/v1/testString/zones/testString/firewall/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FirewallRulesUpdateInputItemFilter model
    FirewallRulesUpdateInputItemFilter firewallRulesUpdateInputItemFilterModel = new FirewallRulesUpdateInputItemFilter.Builder()
    .id("6f58318e7fa2477a23112e8118c66f61")
    .build();

    // Construct an instance of the FirewallRulesUpdateInputItem model
    FirewallRulesUpdateInputItem firewallRulesUpdateInputItemModel = new FirewallRulesUpdateInputItem.Builder()
    .id("52161eb6af4241bb9d4b32394be72fdf")
    .action("js_challenge")
    .paused(false)
    .description("JS challenge site")
    .filter(firewallRulesUpdateInputItemFilterModel)
    .build();

    // Construct an instance of the UpdateFirewllRulesOptions model
    UpdateFirewllRulesOptions updateFirewllRulesOptionsModel = new UpdateFirewllRulesOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .firewallRulesUpdateInputItem(new java.util.ArrayList<FirewallRulesUpdateInputItem>(java.util.Arrays.asList(firewallRulesUpdateInputItemModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FirewallRulesResp> response = firewallRulesService.updateFirewllRules(updateFirewllRulesOptionsModel).execute();
    assertNotNull(response);
    FirewallRulesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFirewllRulesPath);
  }
  
  // public void testUpdateFirewllRulesWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testUpdateFirewllRulesWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testUpdateFirewllRulesWOptions();

  //   // Disable retries and run testUpdateFirewllRulesWOptions.
  //   firewallRulesService.disableRetries();
  //   testUpdateFirewllRulesWOptions();
  // }  

  // Test the updateFirewllRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFirewllRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.updateFirewllRules(null).execute();
  }

  @Test
  public void testDeleteFirewallRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"f2d427378e7542acb295380d352e2ebd\"}]}";
    String deleteFirewallRulesPath = "/v1/testString/zones/testString/firewall/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFirewallRulesOptions model
    DeleteFirewallRulesOptions deleteFirewallRulesOptionsModel = new DeleteFirewallRulesOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .id("f2d427378e7542acb295380d352e2ebd")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteFirewallRulesResp> response = firewallRulesService.deleteFirewallRules(deleteFirewallRulesOptionsModel).execute();
    assertNotNull(response);
    DeleteFirewallRulesResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("id"), "f2d427378e7542acb295380d352e2ebd");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFirewallRulesPath);
  }
  
  // public void testDeleteFirewallRulesWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testDeleteFirewallRulesWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testDeleteFirewallRulesWOptions();

  //   // Disable retries and run testDeleteFirewallRulesWOptions.
  //   firewallRulesService.disableRetries();
  //   testDeleteFirewallRulesWOptions();
  // }  

  // Test the deleteFirewallRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFirewallRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.deleteFirewallRules(null).execute();
  }

  @Test
  public void testDeleteFirewallRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f2d427378e7542acb295380d352e2ebd\"}}";
    String deleteFirewallRulePath = "/v1/testString/zones/testString/firewall/rules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFirewallRuleOptions model
    DeleteFirewallRuleOptions deleteFirewallRuleOptionsModel = new DeleteFirewallRuleOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .firewallRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteFirewallRuleResp> response = firewallRulesService.deleteFirewallRule(deleteFirewallRuleOptionsModel).execute();
    assertNotNull(response);
    DeleteFirewallRuleResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFirewallRulePath);
  }
  
  // public void testDeleteFirewallRuleWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testDeleteFirewallRuleWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testDeleteFirewallRuleWOptions();

  //   // Disable retries and run testDeleteFirewallRuleWOptions.
  //   firewallRulesService.disableRetries();
  //   testDeleteFirewallRuleWOptions();
  // }  

  // Test the deleteFirewallRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFirewallRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.deleteFirewallRule(null).execute();
  }

  @Test
  public void testGetFirewallRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"52161eb6af4241bb9d4b32394be72fdf\", \"paused\": false, \"description\": \"JS challenge site\", \"action\": \"js_challenge\", \"filter\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\"}, \"created_on\": \"2019-01-01T05:20:00.123Z\", \"modified_on\": \"2019-01-01T05:20:00.123Z\"}}";
    String getFirewallRulePath = "/v1/testString/zones/testString/firewall/rules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFirewallRuleOptions model
    GetFirewallRuleOptions getFirewallRuleOptionsModel = new GetFirewallRuleOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .firewallRuleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FirewallRuleResp> response = firewallRulesService.getFirewallRule(getFirewallRuleOptionsModel).execute();
    assertNotNull(response);
    FirewallRuleResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFirewallRulePath);
  }
  
  // public void testGetFirewallRuleWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testGetFirewallRuleWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testGetFirewallRuleWOptions();

  //   // Disable retries and run testGetFirewallRuleWOptions.
  //   firewallRulesService.disableRetries();
  //   testGetFirewallRuleWOptions();
  // }  

  // Test the getFirewallRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFirewallRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.getFirewallRule(null).execute();
  }

  @Test
  public void testUpdateFirewallRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"52161eb6af4241bb9d4b32394be72fdf\", \"paused\": false, \"description\": \"JS challenge site\", \"action\": \"js_challenge\", \"filter\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\"}, \"created_on\": \"2019-01-01T05:20:00.123Z\", \"modified_on\": \"2019-01-01T05:20:00.123Z\"}}";
    String updateFirewallRulePath = "/v1/testString/zones/testString/firewall/rules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FirewallRuleUpdateInputFilter model
    FirewallRuleUpdateInputFilter firewallRuleUpdateInputFilterModel = new FirewallRuleUpdateInputFilter.Builder()
    .id("6f58318e7fa2477a23112e8118c66f61")
    .build();

    // Construct an instance of the UpdateFirewallRuleOptions model
    UpdateFirewallRuleOptions updateFirewallRuleOptionsModel = new UpdateFirewallRuleOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .firewallRuleIdentifier("testString")
    .action("js_challenge")
    .paused(false)
    .description("JS challenge site")
    .filter(firewallRuleUpdateInputFilterModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FirewallRuleResp> response = firewallRulesService.updateFirewallRule(updateFirewallRuleOptionsModel).execute();
    assertNotNull(response);
    FirewallRuleResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("X-Auth-User-Token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFirewallRulePath);
  }
  
  // public void testUpdateFirewallRuleWOptionsWRetries() throws Throwable {
  //   // Enable retries and run testUpdateFirewallRuleWOptions.
  //   firewallRulesService.enableRetries(4, 30);
  //   testUpdateFirewallRuleWOptions();

  //   // Disable retries and run testUpdateFirewallRuleWOptions.
  //   firewallRulesService.disableRetries();
  //   testUpdateFirewallRuleWOptions();
  // }  

  // Test the updateFirewallRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFirewallRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallRulesService.updateFirewallRule(null).execute();
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
    firewallRulesService = null;
  }
}