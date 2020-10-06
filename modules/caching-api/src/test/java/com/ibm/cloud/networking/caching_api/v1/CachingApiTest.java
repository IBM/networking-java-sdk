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
package com.ibm.cloud.networking.caching_api.v1;

import com.ibm.cloud.networking.caching_api.v1.CachingApi;
import com.ibm.cloud.networking.caching_api.v1.model.BrowserTTLResponse;
import com.ibm.cloud.networking.caching_api.v1.model.BrowserTTLResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.CacheLevelResponse;
import com.ibm.cloud.networking.caching_api.v1.model.CacheLevelResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.DeveopmentModeResponse;
import com.ibm.cloud.networking.caching_api.v1.model.DeveopmentModeResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.EnableQueryStringSortResponse;
import com.ibm.cloud.networking.caching_api.v1.model.EnableQueryStringSortResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.GetBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.GetQueryStringSortOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllResponse;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeAllResponseResult;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByCacheTagsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByHostsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.PurgeByUrlsOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateBrowserCacheTtlOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateCacheLevelOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateDevelopmentModeOptions;
import com.ibm.cloud.networking.caching_api.v1.model.UpdateQueryStringSortOptions;
import com.ibm.cloud.networking.caching_api.v1.utils.TestUtilities;
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
 * Unit test class for the CachingApi service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class CachingApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected CachingApi cachingApiService;

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

    cachingApiService = CachingApi.newInstance(crn, zoneId, serviceName);
    String url = server.url("/").toString();
    cachingApiService.setServiceUrl(url);
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

    new CachingApi(crn, zoneId, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(cachingApiService.getCrn(), "testString");
  }


  @Test
  public void testGetZoneId() throws Throwable {
    constructClientService();
    assertEquals(cachingApiService.getZoneId(), "testString");
  }

  @Test
  public void testPurgeAllWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"62d26b178b67c0eda0613891f3f51b0a\"}}";
    String purgeAllPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/purge_cache/purge_all", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PurgeAllOptions model
    PurgeAllOptions purgeAllOptionsModel = new PurgeAllOptions();

    // Invoke operation with valid options model (positive test)
    Response<PurgeAllResponse> response = cachingApiService.purgeAll(purgeAllOptionsModel).execute();
    assertNotNull(response);
    PurgeAllResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, purgeAllPath);
  }

  @Test
  public void testPurgeByUrlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"62d26b178b67c0eda0613891f3f51b0a\"}}";
    String purgeByUrlsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/purge_cache/purge_by_urls", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PurgeByUrlsOptions model
    PurgeByUrlsOptions purgeByUrlsOptionsModel = new PurgeByUrlsOptions.Builder()
    .files(new java.util.ArrayList<String>(java.util.Arrays.asList("http://www.example.com/cat_picture.jpg")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PurgeAllResponse> response = cachingApiService.purgeByUrls(purgeByUrlsOptionsModel).execute();
    assertNotNull(response);
    PurgeAllResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, purgeByUrlsPath);
  }

  @Test
  public void testPurgeByCacheTagsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"62d26b178b67c0eda0613891f3f51b0a\"}}";
    String purgeByCacheTagsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/purge_cache/purge_by_cache_tags", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PurgeByCacheTagsOptions model
    PurgeByCacheTagsOptions purgeByCacheTagsOptionsModel = new PurgeByCacheTagsOptions.Builder()
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("some-tag")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PurgeAllResponse> response = cachingApiService.purgeByCacheTags(purgeByCacheTagsOptionsModel).execute();
    assertNotNull(response);
    PurgeAllResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, purgeByCacheTagsPath);
  }

  @Test
  public void testPurgeByHostsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"62d26b178b67c0eda0613891f3f51b0a\"}}";
    String purgeByHostsPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/purge_cache/purge_by_hosts", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PurgeByHostsOptions model
    PurgeByHostsOptions purgeByHostsOptionsModel = new PurgeByHostsOptions.Builder()
    .hosts(new java.util.ArrayList<String>(java.util.Arrays.asList("www.example.com")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PurgeAllResponse> response = cachingApiService.purgeByHosts(purgeByHostsOptionsModel).execute();
    assertNotNull(response);
    PurgeAllResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, purgeByHostsPath);
  }

  @Test
  public void testGetBrowserCacheTtlWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"browser_cache_ttl\", \"value\": 14400, \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String getBrowserCacheTtlPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/browser_cache_ttl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetBrowserCacheTtlOptions model
    GetBrowserCacheTtlOptions getBrowserCacheTtlOptionsModel = new GetBrowserCacheTtlOptions();

    // Invoke operation with valid options model (positive test)
    Response<BrowserTTLResponse> response = cachingApiService.getBrowserCacheTtl(getBrowserCacheTtlOptionsModel).execute();
    assertNotNull(response);
    BrowserTTLResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getBrowserCacheTtlPath);
  }

  @Test
  public void testUpdateBrowserCacheTtlWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"browser_cache_ttl\", \"value\": 14400, \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String updateBrowserCacheTtlPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/browser_cache_ttl", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateBrowserCacheTtlOptions model
    UpdateBrowserCacheTtlOptions updateBrowserCacheTtlOptionsModel = new UpdateBrowserCacheTtlOptions.Builder()
    .value(Long.valueOf("14400"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<BrowserTTLResponse> response = cachingApiService.updateBrowserCacheTtl(updateBrowserCacheTtlOptionsModel).execute();
    assertNotNull(response);
    BrowserTTLResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateBrowserCacheTtlPath);
  }

  @Test
  public void testGetDevelopmentModeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"development_mode\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String getDevelopmentModePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/development_mode", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDevelopmentModeOptions model
    GetDevelopmentModeOptions getDevelopmentModeOptionsModel = new GetDevelopmentModeOptions();

    // Invoke operation with valid options model (positive test)
    Response<DeveopmentModeResponse> response = cachingApiService.getDevelopmentMode(getDevelopmentModeOptionsModel).execute();
    assertNotNull(response);
    DeveopmentModeResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getDevelopmentModePath);
  }

  @Test
  public void testUpdateDevelopmentModeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"development_mode\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String updateDevelopmentModePath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/development_mode", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateDevelopmentModeOptions model
    UpdateDevelopmentModeOptions updateDevelopmentModeOptionsModel = new UpdateDevelopmentModeOptions.Builder()
    .value("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeveopmentModeResponse> response = cachingApiService.updateDevelopmentMode(updateDevelopmentModeOptionsModel).execute();
    assertNotNull(response);
    DeveopmentModeResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateDevelopmentModePath);
  }

  @Test
  public void testGetQueryStringSortWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"sort_query_string_for_cache\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String getQueryStringSortPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/sort_query_string_for_cache", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetQueryStringSortOptions model
    GetQueryStringSortOptions getQueryStringSortOptionsModel = new GetQueryStringSortOptions();

    // Invoke operation with valid options model (positive test)
    Response<EnableQueryStringSortResponse> response = cachingApiService.getQueryStringSort(getQueryStringSortOptionsModel).execute();
    assertNotNull(response);
    EnableQueryStringSortResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getQueryStringSortPath);
  }

  @Test
  public void testUpdateQueryStringSortWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"sort_query_string_for_cache\", \"value\": \"off\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String updateQueryStringSortPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/sort_query_string_for_cache", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateQueryStringSortOptions model
    UpdateQueryStringSortOptions updateQueryStringSortOptionsModel = new UpdateQueryStringSortOptions.Builder()
    .value("off")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<EnableQueryStringSortResponse> response = cachingApiService.updateQueryStringSort(updateQueryStringSortOptionsModel).execute();
    assertNotNull(response);
    EnableQueryStringSortResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateQueryStringSortPath);
  }

  @Test
  public void testGetCacheLevelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cache_level\", \"value\": \"aggressive\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String getCacheLevelPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/cache_level", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCacheLevelOptions model
    GetCacheLevelOptions getCacheLevelOptionsModel = new GetCacheLevelOptions();

    // Invoke operation with valid options model (positive test)
    Response<CacheLevelResponse> response = cachingApiService.getCacheLevel(getCacheLevelOptionsModel).execute();
    assertNotNull(response);
    CacheLevelResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getCacheLevelPath);
  }

  @Test
  public void testUpdateCacheLevelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"cache_level\", \"value\": \"aggressive\", \"editable\": true, \"modified_on\": \"2014-01-01T05:20:00.12345Z\"}}";
    String updateCacheLevelPath = java.net.URLEncoder.encode("/v1/testString/zones/testString/settings/cache_level", "UTF-8").replace("%2F", "/");

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateCacheLevelOptions model
    UpdateCacheLevelOptions updateCacheLevelOptionsModel = new UpdateCacheLevelOptions.Builder()
    .value("aggressive")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CacheLevelResponse> response = cachingApiService.updateCacheLevel(updateCacheLevelOptionsModel).execute();
    assertNotNull(response);
    CacheLevelResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, updateCacheLevelPath);
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
    cachingApiService = null;
  }
}