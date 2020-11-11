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
package com.ibm.cloud.networking.waf_rule_packages_api.v1;

import com.ibm.cloud.networking.waf_rule_packages_api.v1.WafRulePackagesApi;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.GetWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.ListWafPackagesOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.UpdateWafPackageOptions;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackageResponseResult;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponse;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponseResultInfo;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.model.WafPackagesResponseResultItem;
import com.ibm.cloud.networking.waf_rule_packages_api.v1.utils.TestUtilities;
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
 * Unit test class for the WafRulePackagesApi service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class WafRulePackagesApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WafRulePackagesApi wafRulePackagesApiService;

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

    wafRulePackagesApiService = WafRulePackagesApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    wafRulePackagesApiService.setServiceUrl(url);
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

    new WafRulePackagesApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(wafRulePackagesApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(wafRulePackagesApiService.getZoneId(), "testString");
  }

  @Test
  public void testListWafPackagesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"WordPress rules\", \"description\": \"Common WordPress exploit protections\", \"detection_mode\": \"traditional\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"status\": \"active\"}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listWafPackagesPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWafPackagesOptions model
    ListWafPackagesOptions listWafPackagesOptionsModel = new ListWafPackagesOptions.Builder()
    .name("Wordpress-rules")
    .page(Long.valueOf("1"))
    .perPage(Long.valueOf("50"))
    .order("status")
    .direction("desc")
    .match("all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafPackagesResponse> response = wafRulePackagesApiService.listWafPackages(listWafPackagesOptionsModel).execute();
    assertNotNull(response);
    WafPackagesResponse responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("50"));
    assertEquals(query.get("order"), "status");
    assertEquals(query.get("direction"), "desc");
    assertEquals(query.get("match"), "all");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWafPackagesPath);
  }

  @Test
  public void testGetWafPackageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"WordPress rules\", \"description\": \"Common WordPress exploit protections\", \"detection_mode\": \"traditional\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"status\": \"active\", \"sensitivity\": \"high\", \"action_mode\": \"challenge\"}}";
    String getWafPackagePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWafPackageOptions model
    GetWafPackageOptions getWafPackageOptionsModel = new GetWafPackageOptions.Builder()
    .packageId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafPackageResponse> response = wafRulePackagesApiService.getWafPackage(getWafPackageOptionsModel).execute();
    assertNotNull(response);
    WafPackageResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getWafPackagePath);
  }

  // Test the getWafPackage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWafPackageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRulePackagesApiService.getWafPackage(null).execute();
  }

  @Test
  public void testUpdateWafPackageWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"a25a9a7e9c00afc1fb2e0245519d725b\", \"name\": \"WordPress rules\", \"description\": \"Common WordPress exploit protections\", \"detection_mode\": \"traditional\", \"zone_id\": \"023e105f4ecef8ad9ca31a8372d0c353\", \"status\": \"active\", \"sensitivity\": \"high\", \"action_mode\": \"challenge\"}}";
    String updateWafPackagePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/firewall/waf/packages/testString", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateWafPackageOptions model
    UpdateWafPackageOptions updateWafPackageOptionsModel = new UpdateWafPackageOptions.Builder()
    .packageId("testString")
    .sensitivity("high")
    .actionMode("simulate")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WafPackageResponse> response = wafRulePackagesApiService.updateWafPackage(updateWafPackageOptionsModel).execute();
    assertNotNull(response);
    WafPackageResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateWafPackagePath);
  }

  // Test the updateWafPackage operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWafPackageNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    wafRulePackagesApiService.updateWafPackage(null).execute();
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
    wafRulePackagesApiService = null;
  }
}