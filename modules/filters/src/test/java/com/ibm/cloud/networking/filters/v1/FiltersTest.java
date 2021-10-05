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
package com.ibm.cloud.networking.filters.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.networking.filters.v1.Filters;
import com.ibm.cloud.networking.filters.v1.model.CreateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterResp;
import com.ibm.cloud.networking.filters.v1.model.DeleteFilterRespResult;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersRespResultItem;
import com.ibm.cloud.networking.filters.v1.model.FilterInput;
import com.ibm.cloud.networking.filters.v1.model.FilterObject;
import com.ibm.cloud.networking.filters.v1.model.FilterResp;
import com.ibm.cloud.networking.filters.v1.model.FilterUpdateInput;
import com.ibm.cloud.networking.filters.v1.model.FiltersResp;
import com.ibm.cloud.networking.filters.v1.model.GetFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.ListAllFiltersOptions;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersResp;
import com.ibm.cloud.networking.filters.v1.model.ListFiltersRespResultInfo;
import com.ibm.cloud.networking.filters.v1.model.UpdateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.UpdateFiltersOptions;
import com.ibm.cloud.networking.filters.v1.utils.TestUtilities;
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
 * Unit test class for the Filters service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class FiltersTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Filters filtersService;

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

    filtersService = Filters.newInstance(serviceName);
    String url = server.url("/").toString();
    filtersService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new Filters(serviceName, null);
  }

  @Test
  public void testListAllFiltersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\", \"created_on\": \"2018-01-01T05:20:00.123Z\", \"modified_on\": \"2018-01-01T05:20:00.123Z\"}], \"result_info\": {\"page\": 1, \"per_page\": 2, \"count\": 1, \"total_count\": 200}}";
    String listAllFiltersPath = "/v1/testString/zones/testString/filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAllFiltersOptions model
    ListAllFiltersOptions listAllFiltersOptionsModel = new ListAllFiltersOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ListFiltersResp> response = filtersService.listAllFilters(listAllFiltersOptionsModel).execute();
    assertNotNull(response);
    ListFiltersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, listAllFiltersPath);
  }

  // Test the listAllFilters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAllFiltersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.listAllFilters(null).execute();
  }

  @Test
  public void testCreateFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\", \"created_on\": \"2018-01-01T05:20:00.123Z\", \"modified_on\": \"2018-01-01T05:20:00.123Z\"}]}";
    String createFilterPath = "/v1/testString/zones/testString/filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FilterInput model
    FilterInput filterInputModel = new FilterInput.Builder()
    .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
    .paused(false)
    .description("not /api")
    .build();

    // Construct an instance of the CreateFilterOptions model
    CreateFilterOptions createFilterOptionsModel = new CreateFilterOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .filterInput(new java.util.ArrayList<FilterInput>(java.util.Arrays.asList(filterInputModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FiltersResp> response = filtersService.createFilter(createFilterOptionsModel).execute();
    assertNotNull(response);
    FiltersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, createFilterPath);
  }

  // Test the createFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.createFilter(null).execute();
  }

  @Test
  public void testUpdateFiltersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\", \"created_on\": \"2018-01-01T05:20:00.123Z\", \"modified_on\": \"2018-01-01T05:20:00.123Z\"}]}";
    String updateFiltersPath = "/v1/testString/zones/testString/filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the FilterUpdateInput model
    FilterUpdateInput filterUpdateInputModel = new FilterUpdateInput.Builder()
    .id("f2a64520581a4209aab12187a0081364")
    .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
    .description("not /api")
    .paused(false)
    .build();

    // Construct an instance of the UpdateFiltersOptions model
    UpdateFiltersOptions updateFiltersOptionsModel = new UpdateFiltersOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .filterUpdateInput(new java.util.ArrayList<FilterUpdateInput>(java.util.Arrays.asList(filterUpdateInputModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FiltersResp> response = filtersService.updateFilters(updateFiltersOptionsModel).execute();
    assertNotNull(response);
    FiltersResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateFiltersPath);
  }

  // Test the updateFilters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFiltersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.updateFilters(null).execute();
  }

  @Test
  public void testDeleteFiltersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"b7ff25282d394be7b945e23c7106ce8a\"}]}";
    String deleteFiltersPath = "/v1/testString/zones/testString/filters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFiltersOptions model
    DeleteFiltersOptions deleteFiltersOptionsModel = new DeleteFiltersOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .id("b7ff25282d394be7b945e23c7106ce8a")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteFiltersResp> response = filtersService.deleteFilters(deleteFiltersOptionsModel).execute();
    assertNotNull(response);
    DeleteFiltersResp responseObj = response.getResult();
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
    assertEquals(query.get("id"), "b7ff25282d394be7b945e23c7106ce8a");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFiltersPath);
  }

  // Test the deleteFilters operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFiltersNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.deleteFilters(null).execute();
  }

  @Test
  public void testDeleteFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"b7ff25282d394be7b945e23c7106ce8a\"}}";
    String deleteFilterPath = "/v1/testString/zones/testString/filters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFilterOptions model
    DeleteFilterOptions deleteFilterOptionsModel = new DeleteFilterOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .filterIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DeleteFilterResp> response = filtersService.deleteFilter(deleteFilterOptionsModel).execute();
    assertNotNull(response);
    DeleteFilterResp responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteFilterPath);
  }

  // Test the deleteFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.deleteFilter(null).execute();
  }

  @Test
  public void testGetFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\", \"created_on\": \"2018-01-01T05:20:00.123Z\", \"modified_on\": \"2018-01-01T05:20:00.123Z\"}}";
    String getFilterPath = "/v1/testString/zones/testString/filters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFilterOptions model
    GetFilterOptions getFilterOptionsModel = new GetFilterOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .filterIdentifier("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FilterResp> response = filtersService.getFilter(getFilterOptionsModel).execute();
    assertNotNull(response);
    FilterResp responseObj = response.getResult();
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
    assertEquals(parsedPath, getFilterPath);
  }

  // Test the getFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.getFilter(null).execute();
  }

  @Test
  public void testUpdateFilterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"6f58318e7fa2477a23112e8118c66f61\", \"paused\": true, \"description\": \"Login from office\", \"expression\": \"ip.src eq 93.184.216.0 and (http.request.uri.path ~ \\\"^.*/wp-login.php$\\\" or http.request.uri.path ~ \\\"^.*/xmlrpc.php$\\\")\", \"created_on\": \"2018-01-01T05:20:00.123Z\", \"modified_on\": \"2018-01-01T05:20:00.123Z\"}}";
    String updateFilterPath = "/v1/testString/zones/testString/filters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateFilterOptions model
    UpdateFilterOptions updateFilterOptionsModel = new UpdateFilterOptions.Builder()
    .xAuthUserToken("testString")
    .crn("testString")
    .zoneIdentifier("testString")
    .filterIdentifier("testString")
    .id("f2a64520581a4209aab12187a0081364")
    .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
    .description("not /api")
    .paused(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<FilterResp> response = filtersService.updateFilter(updateFilterOptionsModel).execute();
    assertNotNull(response);
    FilterResp responseObj = response.getResult();
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
    assertEquals(parsedPath, updateFilterPath);
  }

  // Test the updateFilter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFilterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    filtersService.updateFilter(null).execute();
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
    filtersService = null;
  }
}