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
package com.ibm.cloud.networking.firewall_api.v1;

import com.ibm.cloud.networking.firewall_api.v1.FirewallApi;
import com.ibm.cloud.networking.firewall_api.v1.model.GetSecurityLevelSettingOptions;
import com.ibm.cloud.networking.firewall_api.v1.model.ResultInfo;
import com.ibm.cloud.networking.firewall_api.v1.model.SecurityLevelSettingResp;
import com.ibm.cloud.networking.firewall_api.v1.model.SecurityLevelSettingRespMessagesItem;
import com.ibm.cloud.networking.firewall_api.v1.model.SecurityLevelSettingRespResult;
import com.ibm.cloud.networking.firewall_api.v1.model.SetSecurityLevelSettingOptions;
import com.ibm.cloud.networking.firewall_api.v1.utils.TestUtilities;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FirewallApi service.
 */
public class FirewallApiTest

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected FirewallApi firewallApiService;

  public void constructClientService() throws Throwable {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String zoneIdentifier = "testString";

    firewallApiService = FirewallApi.newInstance(crn, zoneIdentifier, serviceName);
    String url = server.url("/").toString();
    firewallApiService.setServiceUrl(url);
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

    new FirewallApi(crn, zoneIdentifier, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(firewallApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneIdentifier() throws Throwable {
    constructClientService();
    assertEquals(firewallApiService.getZoneIdentifier(), "testString");
  }

  @Test
  public void testGetSecurityLevelSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"security_level\", \"value\": \"medium\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}, \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String getSecurityLevelSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/security_level", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSecurityLevelSettingOptions model
    GetSecurityLevelSettingOptions getSecurityLevelSettingOptionsModel = new GetSecurityLevelSettingOptions();

    // Invoke operation with valid options model (positive test)
    Response<SecurityLevelSettingResp> response = firewallApiService.getSecurityLevelSetting(getSecurityLevelSettingOptionsModel).execute();
    assertNotNull(response);
    SecurityLevelSettingResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getSecurityLevelSettingPath);
  }

  @Test
  public void testSetSecurityLevelSettingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"result\": {\"id\": \"security_level\", \"value\": \"medium\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}, \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}, \"success\": true, \"errors\": [[\"errors\"]], \"messages\": [{\"status\": \"OK\"}]}";
    String setSecurityLevelSettingPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/security_level", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SetSecurityLevelSettingOptions model
    SetSecurityLevelSettingOptions setSecurityLevelSettingOptionsModel = new SetSecurityLevelSettingOptions.Builder()
    .value("under_attack")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SecurityLevelSettingResp> response = firewallApiService.setSecurityLevelSetting(setSecurityLevelSettingOptionsModel).execute();
    assertNotNull(response);
    SecurityLevelSettingResp responseObj = response.getResult();
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
    assertEquals(parsedPath, setSecurityLevelSettingPath);
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
    firewallApiService = null;
  }
}