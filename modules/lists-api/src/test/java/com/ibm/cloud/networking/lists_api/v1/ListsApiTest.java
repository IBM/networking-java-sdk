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

package com.ibm.cloud.networking.lists_api.v1;

import com.ibm.cloud.networking.lists_api.v1.ListsApi;
import com.ibm.cloud.networking.lists_api.v1.model.CreateCustomListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.CreateListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.CreateListItemsReqItem;
import com.ibm.cloud.networking.lists_api.v1.model.CustomListResp;
import com.ibm.cloud.networking.lists_api.v1.model.CustomListResult;
import com.ibm.cloud.networking.lists_api.v1.model.CustomListsResp;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteListItemsReqItemsItem;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteResourceResp;
import com.ibm.cloud.networking.lists_api.v1.model.DeleteResourceRespResult;
import com.ibm.cloud.networking.lists_api.v1.model.GetCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetCustomListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetListItemOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetManagedListsOptions;
import com.ibm.cloud.networking.lists_api.v1.model.GetOperationStatusOptions;
import com.ibm.cloud.networking.lists_api.v1.model.ListCursor;
import com.ibm.cloud.networking.lists_api.v1.model.ListItem;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemsResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemsResultInfo;
import com.ibm.cloud.networking.lists_api.v1.model.ListOperationResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListOperationRespResult;
import com.ibm.cloud.networking.lists_api.v1.model.ManagedListsResp;
import com.ibm.cloud.networking.lists_api.v1.model.ManagedListsResultItem;
import com.ibm.cloud.networking.lists_api.v1.model.OperationStatusResp;
import com.ibm.cloud.networking.lists_api.v1.model.OperationStatusRespResult;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.utils.TestUtilities;
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
 * Unit test class for the ListsApi service.
 */
public class ListsApiTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected ListsApi listsApiService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    String itemId = "testString";
    String listId = "testString";
    String operationId = "testString";
    new ListsApi(crn, itemId, listId, operationId, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(listsApiService.getCrn(), "testString");
  }


  // Test the getter for the itemId global parameter
  @Test
  public void testGetItemId() throws Throwable {
    assertEquals(listsApiService.getItemId(), "testString");
  }


  // Test the getter for the listId global parameter
  @Test
  public void testGetListId() throws Throwable {
    assertEquals(listsApiService.getListId(), "testString");
  }


  // Test the getter for the operationId global parameter
  @Test
  public void testGetOperationId() throws Throwable {
    assertEquals(listsApiService.getOperationId(), "testString");
  }

  // Test the getManagedLists operation with a valid options model parameter
  @Test
  public void testGetManagedListsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"name\": \"cf.malware\", \"description\": \"description\", \"kind\": \"ip\"}]}";
    String getManagedListsPath = "/v1/testString/rules/managed_lists";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetManagedListsOptions model
    GetManagedListsOptions getManagedListsOptionsModel = new GetManagedListsOptions();

    // Invoke getManagedLists() with a valid options model and verify the result
    Response<ManagedListsResp> response = listsApiService.getManagedLists(getManagedListsOptionsModel).execute();
    assertNotNull(response);
    ManagedListsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getManagedListsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getManagedLists operation with and without retries enabled
  @Test
  public void testGetManagedListsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetManagedListsWOptions();

    listsApiService.disableRetries();
    testGetManagedListsWOptions();
  }

  // Test the getCustomLists operation with a valid options model parameter
  @Test
  public void testGetCustomListsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"name\": \"good_ips\", \"id\": \"id\", \"description\": \"description\", \"kind\": \"ip\", \"num_items\": 10, \"num_referencing_filters\": 5}]}";
    String getCustomListsPath = "/v1/testString/rules/lists";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCustomListsOptions model
    GetCustomListsOptions getCustomListsOptionsModel = new GetCustomListsOptions();

    // Invoke getCustomLists() with a valid options model and verify the result
    Response<CustomListsResp> response = listsApiService.getCustomLists(getCustomListsOptionsModel).execute();
    assertNotNull(response);
    CustomListsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCustomListsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCustomLists operation with and without retries enabled
  @Test
  public void testGetCustomListsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetCustomListsWOptions();

    listsApiService.disableRetries();
    testGetCustomListsWOptions();
  }

  // Test the createCustomLists operation with a valid options model parameter
  @Test
  public void testCreateCustomListsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"name\": \"good_ips\", \"id\": \"id\", \"description\": \"description\", \"kind\": \"ip\", \"num_items\": 10, \"num_referencing_filters\": 5}}";
    String createCustomListsPath = "/v1/testString/rules/lists";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateCustomListsOptions model
    CreateCustomListsOptions createCustomListsOptionsModel = new CreateCustomListsOptions.Builder()
      .kind("ip")
      .name("testString")
      .description("testString")
      .build();

    // Invoke createCustomLists() with a valid options model and verify the result
    Response<CustomListResp> response = listsApiService.createCustomLists(createCustomListsOptionsModel).execute();
    assertNotNull(response);
    CustomListResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCustomListsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createCustomLists operation with and without retries enabled
  @Test
  public void testCreateCustomListsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testCreateCustomListsWOptions();

    listsApiService.disableRetries();
    testCreateCustomListsWOptions();
  }

  // Test the getCustomList operation with a valid options model parameter
  @Test
  public void testGetCustomListWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"name\": \"good_ips\", \"id\": \"id\", \"description\": \"description\", \"kind\": \"ip\", \"num_items\": 10, \"num_referencing_filters\": 5}}";
    String getCustomListPath = "/v1/testString/rules/lists/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCustomListOptions model
    GetCustomListOptions getCustomListOptionsModel = new GetCustomListOptions();

    // Invoke getCustomList() with a valid options model and verify the result
    Response<CustomListResp> response = listsApiService.getCustomList(getCustomListOptionsModel).execute();
    assertNotNull(response);
    CustomListResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCustomListPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCustomList operation with and without retries enabled
  @Test
  public void testGetCustomListWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetCustomListWOptions();

    listsApiService.disableRetries();
    testGetCustomListWOptions();
  }

  // Test the updateCustomList operation with a valid options model parameter
  @Test
  public void testUpdateCustomListWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"name\": \"good_ips\", \"id\": \"id\", \"description\": \"description\", \"kind\": \"ip\", \"num_items\": 10, \"num_referencing_filters\": 5}}";
    String updateCustomListPath = "/v1/testString/rules/lists/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateCustomListOptions model
    UpdateCustomListOptions updateCustomListOptionsModel = new UpdateCustomListOptions.Builder()
      .description("testString")
      .build();

    // Invoke updateCustomList() with a valid options model and verify the result
    Response<CustomListResp> response = listsApiService.updateCustomList(updateCustomListOptionsModel).execute();
    assertNotNull(response);
    CustomListResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCustomListPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCustomList operation with and without retries enabled
  @Test
  public void testUpdateCustomListWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testUpdateCustomListWOptions();

    listsApiService.disableRetries();
    testUpdateCustomListWOptions();
  }

  // Test the deleteCustomList operation with a valid options model parameter
  @Test
  public void testDeleteCustomListWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"34b12448945f11eaa1b71c4d701ab86e\"}}";
    String deleteCustomListPath = "/v1/testString/rules/lists/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCustomListOptions model
    DeleteCustomListOptions deleteCustomListOptionsModel = new DeleteCustomListOptions();

    // Invoke deleteCustomList() with a valid options model and verify the result
    Response<DeleteResourceResp> response = listsApiService.deleteCustomList(deleteCustomListOptionsModel).execute();
    assertNotNull(response);
    DeleteResourceResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCustomListPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteCustomList operation with and without retries enabled
  @Test
  public void testDeleteCustomListWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testDeleteCustomListWOptions();

    listsApiService.disableRetries();
    testDeleteCustomListWOptions();
  }

  // Test the getListItems operation with a valid options model parameter
  @Test
  public void testGetListItemsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": [{\"id\": \"70c2009751b24ffc9ed1ab462ba957b4\", \"asn\": 19604, \"comment\": \"My list of developer IPs.\", \"hostname\": \"cloud.ibm.com\", \"ip\": \"172.64.0.0/13\", \"created_on\": \"2025-03-21T16:19:21Z\", \"modified_on\": \"2025-03-21T16:19:37Z\"}], \"result_info\": {\"cursors\": {\"after\": \"yyy\", \"before\": \"xxx\"}}}";
    String getListItemsPath = "/v1/testString/rules/lists/testString/items";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetListItemsOptions model
    GetListItemsOptions getListItemsOptionsModel = new GetListItemsOptions.Builder()
      .cursor("testString")
      .perPage(Long.valueOf("1"))
      .search("testString")
      .build();

    // Invoke getListItems() with a valid options model and verify the result
    Response<ListItemsResp> response = listsApiService.getListItems(getListItemsOptionsModel).execute();
    assertNotNull(response);
    ListItemsResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getListItemsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("cursor"), "testString");
    assertEquals(Long.valueOf(query.get("per_page")), Long.valueOf("1"));
    assertEquals(query.get("search"), "testString");
  }

  // Test the getListItems operation with and without retries enabled
  @Test
  public void testGetListItemsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetListItemsWOptions();

    listsApiService.disableRetries();
    testGetListItemsWOptions();
  }

  // Test the createListItems operation with a valid options model parameter
  @Test
  public void testCreateListItemsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"operation_id\": \"53d73a83d33d4e3b8791764a9b9f2412\"}}";
    String createListItemsPath = "/v1/testString/rules/lists/testString/items";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateListItemsReqItem model
    CreateListItemsReqItem createListItemsReqItemModel = new CreateListItemsReqItem.Builder()
      .asn(Double.valueOf("19604"))
      .comment("My list of developer IPs.")
      .hostname("cloud.ibm.com")
      .ip("172.64.0.0/13")
      .build();

    // Construct an instance of the CreateListItemsOptions model
    CreateListItemsOptions createListItemsOptionsModel = new CreateListItemsOptions.Builder()
      .createListItemsReqItem(java.util.Arrays.asList(createListItemsReqItemModel))
      .build();

    // Invoke createListItems() with a valid options model and verify the result
    Response<ListOperationResp> response = listsApiService.createListItems(createListItemsOptionsModel).execute();
    assertNotNull(response);
    ListOperationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createListItemsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createListItems operation with and without retries enabled
  @Test
  public void testCreateListItemsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testCreateListItemsWOptions();

    listsApiService.disableRetries();
    testCreateListItemsWOptions();
  }

  // Test the deleteListItems operation with a valid options model parameter
  @Test
  public void testDeleteListItemsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"operation_id\": \"53d73a83d33d4e3b8791764a9b9f2412\"}}";
    String deleteListItemsPath = "/v1/testString/rules/lists/testString/items";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteListItemsReqItemsItem model
    DeleteListItemsReqItemsItem deleteListItemsReqItemsItemModel = new DeleteListItemsReqItemsItem.Builder()
      .id("70c2009751b24ffc9ed1ab462ba957b4")
      .build();

    // Construct an instance of the DeleteListItemsOptions model
    DeleteListItemsOptions deleteListItemsOptionsModel = new DeleteListItemsOptions.Builder()
      .items(java.util.Arrays.asList(deleteListItemsReqItemsItemModel))
      .build();

    // Invoke deleteListItems() with a valid options model and verify the result
    Response<ListOperationResp> response = listsApiService.deleteListItems(deleteListItemsOptionsModel).execute();
    assertNotNull(response);
    ListOperationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteListItemsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteListItems operation with and without retries enabled
  @Test
  public void testDeleteListItemsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testDeleteListItemsWOptions();

    listsApiService.disableRetries();
    testDeleteListItemsWOptions();
  }

  // Test the updateListItems operation with a valid options model parameter
  @Test
  public void testUpdateListItemsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"operation_id\": \"53d73a83d33d4e3b8791764a9b9f2412\"}}";
    String updateListItemsPath = "/v1/testString/rules/lists/testString/items";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateListItemsReqItem model
    CreateListItemsReqItem createListItemsReqItemModel = new CreateListItemsReqItem.Builder()
      .asn(Double.valueOf("19604"))
      .comment("My list of developer IPs.")
      .hostname("cloud.ibm.com")
      .ip("172.64.0.0/13")
      .build();

    // Construct an instance of the UpdateListItemsOptions model
    UpdateListItemsOptions updateListItemsOptionsModel = new UpdateListItemsOptions.Builder()
      .createListItemsReqItem(java.util.Arrays.asList(createListItemsReqItemModel))
      .build();

    // Invoke updateListItems() with a valid options model and verify the result
    Response<ListOperationResp> response = listsApiService.updateListItems(updateListItemsOptionsModel).execute();
    assertNotNull(response);
    ListOperationResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateListItemsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateListItems operation with and without retries enabled
  @Test
  public void testUpdateListItemsWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testUpdateListItemsWOptions();

    listsApiService.disableRetries();
    testUpdateListItemsWOptions();
  }

  // Test the getListItem operation with a valid options model parameter
  @Test
  public void testGetListItemWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"70c2009751b24ffc9ed1ab462ba957b4\", \"asn\": 19604, \"comment\": \"My list of developer IPs.\", \"hostname\": \"cloud.ibm.com\", \"ip\": \"172.64.0.0/13\", \"created_on\": \"2025-03-21T16:19:21Z\", \"modified_on\": \"2025-03-21T16:19:37Z\"}}";
    String getListItemPath = "/v1/testString/rules/lists/testString/items/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetListItemOptions model
    GetListItemOptions getListItemOptionsModel = new GetListItemOptions();

    // Invoke getListItem() with a valid options model and verify the result
    Response<ListItemResp> response = listsApiService.getListItem(getListItemOptionsModel).execute();
    assertNotNull(response);
    ListItemResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getListItemPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getListItem operation with and without retries enabled
  @Test
  public void testGetListItemWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetListItemWOptions();

    listsApiService.disableRetries();
    testGetListItemWOptions();
  }

  // Test the getOperationStatus operation with a valid options model parameter
  @Test
  public void testGetOperationStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"success\": true, \"errors\": [[\"errors\"]], \"messages\": [[\"messages\"]], \"result\": {\"id\": \"0147be950d5c42b8b47c07792c5015e3\", \"status\": \"completed\", \"completed\": \"2025-03-21T16:07:41.782564Z\", \"error\": \"error\"}}";
    String getOperationStatusPath = "/v1/testString/rules/lists/bulk_operations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetOperationStatusOptions model
    GetOperationStatusOptions getOperationStatusOptionsModel = new GetOperationStatusOptions();

    // Invoke getOperationStatus() with a valid options model and verify the result
    Response<OperationStatusResp> response = listsApiService.getOperationStatus(getOperationStatusOptionsModel).execute();
    assertNotNull(response);
    OperationStatusResp responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getOperationStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getOperationStatus operation with and without retries enabled
  @Test
  public void testGetOperationStatusWRetries() throws Throwable {
    listsApiService.enableRetries(4, 30);
    testGetOperationStatusWOptions();

    listsApiService.disableRetries();
    testGetOperationStatusWOptions();
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
    listsApiService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";
    String itemId = "testString";
    String listId = "testString";
    String operationId = "testString";

    listsApiService = ListsApi.newInstance(crn, itemId, listId, operationId, serviceName);
    String url = server.url("/").toString();
    listsApiService.setServiceUrl(url);
  }
}