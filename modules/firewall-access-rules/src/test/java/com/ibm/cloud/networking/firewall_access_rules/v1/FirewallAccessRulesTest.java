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
package com.ibm.cloud.networking.firewall_access_rules.v1;

import com.ibm.cloud.networking.firewall_access_rules.v1.FirewallAccessRules;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleInputConfiguration;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObject;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObjectConfiguration;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleObjectScope;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.AccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.CreateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.DeleteAccountAccessRuleRespResult;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.GetAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAccountAccessRulesResp;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAccountAccessRulesRespResultInfo;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.ListAllAccountAccessRulesOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.model.UpdateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.utils.TestUtilities;
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
 * Unit test class for the FirewallAccessRules service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class FirewallAccessRulesTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected FirewallAccessRules firewallAccessRulesService;

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

    firewallAccessRulesService = FirewallAccessRules.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    firewallAccessRulesService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new FirewallAccessRules(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(firewallAccessRulesService.getCrn(), "testString");
  }

  @Test
  public void testListAllAccountAccessRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllAccountAccessRulesPath = java.net.URLEncoder.encode("/v1/testString/firewall/access_rules/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllAccountAccessRulesOptions model
    ListAllAccountAccessRulesOptions listAllAccountAccessRulesOptionsModel = new ListAllAccountAccessRulesOptions.Builder()
    .notes("testString")
    .mode("block")
    .configurationTarget("ip")
    .configurationValue("1.2.3.4")
    .page(Long.valueOf("26"))
    .perPage(Long.valueOf("5"))
    .order("target")
    .direction("asc")
    .match("any")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListAccountAccessRulesResp> response = firewallAccessRulesService.listAllAccountAccessRules(listAllAccountAccessRulesOptionsModel).execute();
    assertNotNull(response);
    ListAccountAccessRulesResp responseObj = response.getResult();
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
    assertEquals(query.get("order"), "target");
    assertEquals(query.get("direction"), "asc");
    assertEquals(query.get("match"), "any");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllAccountAccessRulesPath);
  }

  @Test
  public void testCreateAccountAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String createAccountAccessRulePath = java.net.URLEncoder.encode("/v1/testString/firewall/access_rules/rules", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AccountAccessRuleInputConfiguration model
    AccountAccessRuleInputConfiguration accountAccessRuleInputConfigurationModel = new AccountAccessRuleInputConfiguration.Builder()
    .target("ip")
    .value("ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ")
    .build();

    // Construct an instance of the CreateAccountAccessRuleOptions model
    CreateAccountAccessRuleOptions createAccountAccessRuleOptionsModel = new CreateAccountAccessRuleOptions.Builder()
    .mode("block")
    .notes("This rule is added because of event X that occurred on date xyz")
    .configuration(accountAccessRuleInputConfigurationModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AccountAccessRuleResp> response = firewallAccessRulesService.createAccountAccessRule(createAccountAccessRuleOptionsModel).execute();
    assertNotNull(response);
    AccountAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createAccountAccessRulePath);
  }

  @Test
  public void testDeleteAccountAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"f1aba936b94213e5b8dca0c0dbf1f9cc\"}}";
    String deleteAccountAccessRulePath = java.net.URLEncoder.encode("/v1/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAccountAccessRuleOptions model
    DeleteAccountAccessRuleOptions deleteAccountAccessRuleOptionsModel = new DeleteAccountAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteAccountAccessRuleResp> response = firewallAccessRulesService.deleteAccountAccessRule(deleteAccountAccessRuleOptionsModel).execute();
    assertNotNull(response);
    DeleteAccountAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteAccountAccessRulePath);
  }

  // Test the deleteAccountAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAccountAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallAccessRulesService.deleteAccountAccessRule(null).execute();
  }

  @Test
  public void testGetAccountAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String getAccountAccessRulePath = java.net.URLEncoder.encode("/v1/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAccountAccessRuleOptions model
    GetAccountAccessRuleOptions getAccountAccessRuleOptionsModel = new GetAccountAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AccountAccessRuleResp> response = firewallAccessRulesService.getAccountAccessRule(getAccountAccessRuleOptionsModel).execute();
    assertNotNull(response);
    AccountAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getAccountAccessRulePath);
  }

  // Test the getAccountAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAccountAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallAccessRulesService.getAccountAccessRule(null).execute();
  }

  @Test
  public void testUpdateAccountAccessRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"92f17202ed8bd63d69a66b86a49a8f6b\", \"notes\": \"This rule is set because of an event that occurred and caused X.\", \"allowed_modes\": [\"block\"], \"mode\": \"block\", \"scope\": {\"type\": \"account\"}, \"created_on\": \"2019-01-01T12:00:00\", \"modified_on\": \"2019-01-01T12:00:00\", \"configuration\": {\"target\": \"ip\", \"value\": \"ip example 198.51.100.4; ip_range example 198.51.100.4/16 ; asn example AS12345; country example AZ\"}}}";
    String updateAccountAccessRulePath = java.net.URLEncoder.encode("/v1/testString/firewall/access_rules/rules/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateAccountAccessRuleOptions model
    UpdateAccountAccessRuleOptions updateAccountAccessRuleOptionsModel = new UpdateAccountAccessRuleOptions.Builder()
    .accessruleIdentifier("testString")
    .mode("block")
    .notes("This rule is added because of event X that occurred on date xyz")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AccountAccessRuleResp> response = firewallAccessRulesService.updateAccountAccessRule(updateAccountAccessRuleOptionsModel).execute();
    assertNotNull(response);
    AccountAccessRuleResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateAccountAccessRulePath);
  }

  // Test the updateAccountAccessRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccountAccessRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    firewallAccessRulesService.updateAccountAccessRule(null).execute();
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
    firewallAccessRulesService = null;
  }
}