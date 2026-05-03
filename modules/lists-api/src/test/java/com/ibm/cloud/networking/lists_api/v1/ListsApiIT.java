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

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

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
import com.ibm.cloud.networking.lists_api.v1.model.ListItem;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListItemsResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListOperationResp;
import com.ibm.cloud.networking.lists_api.v1.model.ListOperationRespResult;
import com.ibm.cloud.networking.lists_api.v1.model.ManagedListsResp;
import com.ibm.cloud.networking.lists_api.v1.model.ManagedListsResultItem;
import com.ibm.cloud.networking.lists_api.v1.model.OperationStatusResp;
import com.ibm.cloud.networking.lists_api.v1.model.OperationStatusRespResult;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateCustomListOptions;
import com.ibm.cloud.networking.lists_api.v1.model.UpdateListItemsOptions;
import com.ibm.cloud.networking.lists_api.v1.utils.TestUtilities;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ListsApiIT extends SdkIntegrationTestBase {
    public ListsApi listsApiService = null;
    public static Map<String, String> config = null;
    final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
    final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

    String crn = null;
    String itemId = null;
    String listId = null;
    String operationId = null;

    /**
     * This method provides our config filename to the base class.
     */
    public String getConfigFilename() {
        return "../../cloud_internet_services.env";
    }

    @BeforeClass
    public void constructService() {
        // Ask super if we should skip the tests.
        if (skipTests()) {
            return;
        }

        final String serviceName = "cloud_internet_services";

        // Load up the config properties for this service.
        config = CredentialUtils.getServiceProperties(serviceName);

        // Load Config
        crn = config.get("CRN");
        itemId = "00000000000000000000000000000001";
        listId = "00000000000000000000000000000001";
        operationId = "00000000000000000000000000000001";

        // set mock values for global params
        try {
            listsApiService = ListsApi.newInstance(crn, itemId, listId, operationId, serviceName);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Setup complete.");
    }

    @Test(priority = 1)
    public void testGetManagedListsWOptions() throws Exception {
        try {
            GetManagedListsOptions getManagedListsOptionsModel = new GetManagedListsOptions();

            // Invoke operation
            Response<ManagedListsResp> response = listsApiService.getManagedLists(getManagedListsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ManagedListsResp managedListsRespResult = response.getResult();
            List<ManagedListsResultItem> managedListsItems = managedListsRespResult.getResult();

            assertNotNull(managedListsRespResult);
            assertNotNull(managedListsItems);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 2)
    public void testGetCustomListsWOptions() throws Exception {
        try {
            GetCustomListsOptions getCustomListsOptionsModel = new GetCustomListsOptions();

            // Invoke operation
            Response<CustomListsResp> response = listsApiService.getCustomLists(getCustomListsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            CustomListsResp customListsRespResult = response.getResult();
            List<CustomListResult> customListsItems = customListsRespResult.getResult();

            assertNotNull(customListsRespResult);
            assertNotNull(customListsItems);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 3)
    public void testCreateCustomListsWOptions() throws Exception {
        try {
            CreateCustomListsOptions createCustomListsOptionsModel = new CreateCustomListsOptions.Builder()
                    .kind("ip")
                    .name("test_custom_list")
                    .description("A test custom list for integration testing")
                    .build();

            // Invoke operation
            Response<CustomListResp> response = listsApiService.createCustomLists(createCustomListsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            CustomListResp customListRespResult = response.getResult();
            CustomListResult createdList = customListRespResult.getResult();
            listId = createdList.getId();
            listsApiService.setListId(listId);

            assertNotNull(customListRespResult);
            assertNotNull(createdList);
            assertNotNull(listId);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 4)
    public void testGetCustomListWOptions() throws Exception {
        try {
            GetCustomListOptions getCustomListOptionsModel = new GetCustomListOptions();

            // Invoke operation
            Response<CustomListResp> response = listsApiService.getCustomList(getCustomListOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            CustomListResp customListRespResult = response.getResult();
            CustomListResult customList = customListRespResult.getResult();

            assertNotNull(customListRespResult);
            assertNotNull(customList);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 5)
    public void testUpdateCustomListWOptions() throws Exception {
        try {
            UpdateCustomListOptions updateCustomListOptionsModel = new UpdateCustomListOptions.Builder()
                    .description("Updated description for test custom list")
                    .build();

            // Invoke operation
            Response<CustomListResp> response = listsApiService.updateCustomList(updateCustomListOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            CustomListResp customListRespResult = response.getResult();
            CustomListResult updatedList = customListRespResult.getResult();

            assertNotNull(customListRespResult);
            assertNotNull(updatedList);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 6)
    public void testCreateListItemsWOptions() throws Exception {
        try {
            CreateListItemsReqItem createListItemsReqItemModel = new CreateListItemsReqItem.Builder()
                    .ip("192.168.1.1")
                    .comment("Test IP address")
                    .build();

            CreateListItemsOptions createListItemsOptionsModel = new CreateListItemsOptions.Builder()
                    .createListItemsReqItem(new java.util.ArrayList<CreateListItemsReqItem>(
                            java.util.Arrays.asList(createListItemsReqItemModel)))
                    .build();

            // Invoke operation
            Response<ListOperationResp> response = listsApiService.createListItems(createListItemsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ListOperationResp listOperationRespResult = response.getResult();
            ListOperationRespResult operationResult = listOperationRespResult.getResult();
            operationId = operationResult.getOperationId();
            listsApiService.setOperationId(operationId);

            assertNotNull(listOperationRespResult);
            assertNotNull(operationResult);
            assertNotNull(operationId);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 7)
    public void testGetOperationStatusWOptions() throws Exception {
        try {
            GetOperationStatusOptions getOperationStatusOptionsModel = new GetOperationStatusOptions();

            // Invoke operation
            Response<OperationStatusResp> response = listsApiService.getOperationStatus(getOperationStatusOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            OperationStatusResp operationStatusRespResult = response.getResult();
            OperationStatusRespResult operationStatus = operationStatusRespResult.getResult();

            assertNotNull(operationStatusRespResult);
            assertNotNull(operationStatus);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 8)
    public void testGetListItemsWOptions() throws Exception {
        try {
            GetListItemsOptions getListItemsOptionsModel = new GetListItemsOptions.Builder()
                    .perPage(Long.valueOf("25"))
                    .build();

            // Invoke operation
            Response<ListItemsResp> response = listsApiService.getListItems(getListItemsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ListItemsResp listItemsRespResult = response.getResult();
            List<ListItem> listItems = listItemsRespResult.getResult();

            assertNotNull(listItemsRespResult);
            assertNotNull(listItems);

            // Capture an item ID for subsequent tests
            if (listItems != null && !listItems.isEmpty()) {
                itemId = listItems.get(0).getId();
                listsApiService.setItemId(itemId);
            }
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 9)
    public void testGetListItemWOptions() throws Exception {
        try {
            GetListItemOptions getListItemOptionsModel = new GetListItemOptions();

            // Invoke operation
            Response<ListItemResp> response = listsApiService.getListItem(getListItemOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ListItemResp listItemRespResult = response.getResult();
            ListItem listItem = listItemRespResult.getResult();

            assertNotNull(listItemRespResult);
            assertNotNull(listItem);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 10)
    public void testUpdateListItemsWOptions() throws Exception {
        try {
            CreateListItemsReqItem createListItemsReqItemModel = new CreateListItemsReqItem.Builder()
                    .ip("192.168.1.2")
                    .comment("Updated test IP address")
                    .build();

            UpdateListItemsOptions updateListItemsOptionsModel = new UpdateListItemsOptions.Builder()
                    .createListItemsReqItem(new java.util.ArrayList<CreateListItemsReqItem>(
                            java.util.Arrays.asList(createListItemsReqItemModel)))
                    .build();

            // Invoke operation
            Response<ListOperationResp> response = listsApiService.updateListItems(updateListItemsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ListOperationResp listOperationRespResult = response.getResult();
            ListOperationRespResult operationResult = listOperationRespResult.getResult();

            assertNotNull(listOperationRespResult);
            assertNotNull(operationResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 11)
    public void testDeleteListItemsWOptions() throws Exception {
        try {
            DeleteListItemsReqItemsItem deleteListItemsReqItemsItemModel = new DeleteListItemsReqItemsItem.Builder()
                    .id(itemId)
                    .build();

            DeleteListItemsOptions deleteListItemsOptionsModel = new DeleteListItemsOptions.Builder()
                    .items(new java.util.ArrayList<DeleteListItemsReqItemsItem>(
                            java.util.Arrays.asList(deleteListItemsReqItemsItemModel)))
                    .build();

            // Invoke operation
            Response<ListOperationResp> response = listsApiService.deleteListItems(deleteListItemsOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            ListOperationResp listOperationRespResult = response.getResult();
            ListOperationRespResult operationResult = listOperationRespResult.getResult();

            assertNotNull(listOperationRespResult);
            assertNotNull(operationResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @Test(priority = 12)
    public void testDeleteCustomListWOptions() throws Exception {
        try {
            DeleteCustomListOptions deleteCustomListOptionsModel = new DeleteCustomListOptions();

            // Invoke operation
            Response<DeleteResourceResp> response = listsApiService.deleteCustomList(deleteCustomListOptionsModel).execute();
            // Validate response
            assertNotNull(response);
            assertEquals(response.getStatusCode(), 200);

            DeleteResourceResp deleteResourceRespResult = response.getResult();
            DeleteResourceRespResult deleteResult = deleteResourceRespResult.getResult();

            assertNotNull(deleteResourceRespResult);
            assertNotNull(deleteResult);
        } catch (ServiceResponseException e) {
            fail(String.format("Service returned status code %d: %s\nError details: %s",
                    e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
        }
    }

    @AfterClass
    public void tearDown() {
        // Add any clean up logic here
        System.out.println("Clean up complete.");
    }
}
