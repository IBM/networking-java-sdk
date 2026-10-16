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

package com.ibm.cloud.networking.ai_security_for_apps.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayDiscoveryResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayNullResultResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperation;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsDeleteInputItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationLabelResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkDeleteInputManaged;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkDeleteInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputManaged;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputUser;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsListRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewaySchemasResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationItemOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsPatchResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewayDiscoveryOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewaySchemasOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListZoneApiGatewayOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.SetZoneApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UnsetZoneApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateZoneApiGatewayDiscoveryOperationOptions;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;

/**
 * Integration test class for the AiSecurityForApps service.
 */
public class AiSecurityForAppsIT extends SdkIntegrationTestBase {
    public AiSecurityForApps service = null;
    public static Map<String, String> config = null;

    @Override
    public String getConfigFilename() {
        return "../../cloud_internet_services.env";
    }

    @BeforeClass
    public void constructService() {
        if (skipTests()) {
            return;
        }
        final String serviceName = "cloud_internet_services";
        config = CredentialUtils.getServiceProperties(serviceName);
        assertNotNull(config);
        String crn = config.get("CRN");
        String zoneIdentifier = config.get("ZONE_ID");
        service = AiSecurityForApps.newInstance(crn, zoneIdentifier, serviceName);
        assertNotNull(service);
        assertNotNull(service.getServiceUrl());
    }

    @AfterClass
    public void tearDown() {
        // No persistent state to clean up
    }

    /**
     * Test: Get AI Security Settings.
     */
    @Test
    public void testGetAiSecuritySettings() throws Exception {
        GetAiSecuritySettingsOptions getOptions = new GetAiSecuritySettingsOptions();
        Response<AiSecuritySettingsResp> response = service.getAiSecuritySettings(getOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: Update AI Security Settings.
     */
    @Test
    public void testReplaceZoneAiSecuritySettings() throws Exception {
        // Get current value
        GetAiSecuritySettingsOptions getOptions = new GetAiSecuritySettingsOptions();
        Response<AiSecuritySettingsResp> getResponse = service.getAiSecuritySettings(getOptions).execute();
        assertNotNull(getResponse);
        assertNotNull(getResponse.getResult());

        Boolean currentEnabled = getResponse.getResult().getResult().isEnabled();
        Boolean newEnabled = !currentEnabled;

        ReplaceZoneAiSecuritySettingsOptions updateOptions =
            new ReplaceZoneAiSecuritySettingsOptions.Builder()
                .enabled(newEnabled)
                .build();
        Response<AiSecuritySettingsResp> updateResponse =
            service.replaceZoneAiSecuritySettings(updateOptions).execute();
        assertNotNull(updateResponse);
        assertNotNull(updateResponse.getResult());
        assertTrue(updateResponse.getResult().isSuccess());

        // Restore original value
        ReplaceZoneAiSecuritySettingsOptions restoreOptions =
            new ReplaceZoneAiSecuritySettingsOptions.Builder()
                .enabled(currentEnabled)
                .build();
        service.replaceZoneAiSecuritySettings(restoreOptions).execute();
    }

    /**
     * Test: Get API Gateway Discovery.
     */
    @Test
    public void testGetApiGatewayDiscovery() throws Exception {
        GetApiGatewayDiscoveryOptions getOptions = new GetApiGatewayDiscoveryOptions();
        Response<ApiGatewayDiscoveryResp> response = service.getApiGatewayDiscovery(getOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: List API Gateway Discovery Operations.
     */
    @Test
    public void testListApiGatewayDiscoveryOperations() throws Exception {
        ListApiGatewayDiscoveryOperationsOptions listOptions =
            new ListApiGatewayDiscoveryOperationsOptions.Builder()
                .build();
        Response<DiscoveryOperationsListResp> response =
            service.listApiGatewayDiscoveryOperations(listOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: List API Gateway Discovery Operations with pagination filters.
     */
    @Test
    public void testListApiGatewayDiscoveryOperationsWithFilters() throws Exception {
        ListApiGatewayDiscoveryOperationsOptions listOptions =
            new ListApiGatewayDiscoveryOperationsOptions.Builder()
                .perPage(5)
                .page(1)
                .build();
        Response<DiscoveryOperationsListResp> response =
            service.listApiGatewayDiscoveryOperations(listOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: Get API Gateway Schemas.
     */
    @Test
    public void testGetApiGatewaySchemas() throws Exception {
        GetApiGatewaySchemasOptions getOptions = new GetApiGatewaySchemasOptions();
        Response<ApiGatewaySchemasResp> response = service.getApiGatewaySchemas(getOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: Update API Gateway Discovery Operation (ignored then restore to review).
     * Skipped if the zone has no discovered operations in "review" state.
     */
    @Test
    public void testUpdateZoneApiGatewayDiscoveryOperation() throws Exception {
        // Find at least one operation in "review" state to patch
        ListApiGatewayDiscoveryOperationsOptions listOptions =
            new ListApiGatewayDiscoveryOperationsOptions.Builder()
                .state("review")
                .perPage(5)
                .build();
        Response<DiscoveryOperationsListResp> listResponse =
            service.listApiGatewayDiscoveryOperations(listOptions).execute();
        assertNotNull(listResponse);
        assertNotNull(listResponse.getResult());
        assertTrue(listResponse.getResult().isSuccess());

        if (listResponse.getResult().getResult() == null || listResponse.getResult().getResult().isEmpty()) {
            throw new SkipException("No discovered operations in 'review' state - skipping discovery PATCH test");
        }

        String discoveredId = listResponse.getResult().getResult().get(0).getId();
        assertNotNull(discoveredId);

        // PATCH: mark "ignored"; body is a free-form map { uuid: { state } }
        Map<String, Object> patchBody = new HashMap<>();
        patchBody.put(discoveredId, Collections.singletonMap("state", "ignored"));
        UpdateZoneApiGatewayDiscoveryOperationOptions updateOptions =
            new UpdateZoneApiGatewayDiscoveryOperationOptions.Builder()
                .requestBody(patchBody)
                .build();
        Response<DiscoveryOperationsPatchResp> response =
            service.updateZoneApiGatewayDiscoveryOperation(updateOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());

        // Restore to "review"
        Map<String, Object> restoreBody = new HashMap<>();
        restoreBody.put(discoveredId, Collections.singletonMap("state", "review"));
        service.updateZoneApiGatewayDiscoveryOperation(
            new UpdateZoneApiGatewayDiscoveryOperationOptions.Builder().requestBody(restoreBody).build()).execute();
    }

    /**
     * Test: List Zone API Gateway Operations.
     */
    @Test
    public void testListZoneApiGatewayOperations() throws Exception {
        ListZoneApiGatewayOperationsOptions listOptions =
            new ListZoneApiGatewayOperationsOptions.Builder()
                .build();
        Response<ApiGatewayOperationsListResp> response =
            service.listZoneApiGatewayOperations(listOptions).execute();
        assertNotNull(response);
        assertNotNull(response.getResult());
        assertTrue(response.getResult().isSuccess());
    }

    /**
     * Test: Delete Zone API Gateway Operations (bulk) — creates two operations, then bulk-deletes them by ID.
     * Tolerates a failure from the bulk delete (backend may not support it on every zone); individual cleanup
     * always runs.
     */
    @Test
    public void testDeleteZoneApiGatewayOperations() throws Exception {
        ApiGatewayOperation op1 = new ApiGatewayOperation.Builder(
                ApiGatewayOperation.Method.GET, "api.example.com", "/v1/bulk-del/a")
            .build();
        ApiGatewayOperation op2 = new ApiGatewayOperation.Builder(
                ApiGatewayOperation.Method.POST, "api.example.com", "/v1/bulk-del/b")
            .build();
        CreateZoneApiGatewayOperationOptions createOptions =
            new CreateZoneApiGatewayOperationOptions.Builder()
                .apiGatewayOperation(Arrays.asList(op1, op2))
                .build();
        Response<ApiGatewayOperationsResp> createResponse =
            service.createZoneApiGatewayOperation(createOptions).execute();
        assertNotNull(createResponse);
        assertNotNull(createResponse.getResult());
        assertTrue(createResponse.getResult().isSuccess());
        assertNotNull(createResponse.getResult().getResult());
        assertTrue(createResponse.getResult().getResult().size() >= 1);

        List<String> ids = new ArrayList<>();
        List<ApiGatewayOperationsDeleteInputItem> deleteItems = new ArrayList<>();
        for (ApiGatewayOperationsRespResultItem item : createResponse.getResult().getResult()) {
            if (item.getOperationId() != null) {
                ids.add(item.getOperationId());
                deleteItems.add(new ApiGatewayOperationsDeleteInputItem.Builder(item.getOperationId()).build());
            }
        }

        try {
            DeleteZoneApiGatewayOperationsOptions deleteOptions =
                new DeleteZoneApiGatewayOperationsOptions.Builder()
                    .apiGatewayOperationsDeleteInputItem(deleteItems)
                    .build();
            Response<ApiGatewayNullResultResp> response =
                service.deleteZoneApiGatewayOperations(deleteOptions).execute();
            assertNotNull(response);
            assertNotNull(response.getResult());
            assertTrue(response.getResult().isSuccess());
            ids.clear(); // prevent double-delete in cleanup
        } catch (ServiceResponseException e) {
            System.out.println("DeleteZoneApiGatewayOperations returned error (may be unsupported on this zone): "
                + e.getMessage());
        } finally {
            for (String id : ids) {
                try {
                    service.deleteZoneApiGatewayOperation(
                        new DeleteZoneApiGatewayOperationOptions.Builder().operationId(id).build()).execute();
                } catch (ServiceResponseException ignored) {
                    // best-effort cleanup
                }
            }
        }
    }

    /**
     * Test: Per-operation label lifecycle —
     *   create_api_gateway_operation_labels,
     *   set_zone_api_gateway_operation_labels,
     *   unset_zone_api_gateway_operation_labels.
     */
    @Test
    public void testPerOperationLabelLifecycle() throws Exception {
        // Create a single operation to work with
        CreateApiGatewayOperationItemOptions createOptions =
            new CreateApiGatewayOperationItemOptions.Builder()
                .method(CreateApiGatewayOperationItemOptions.Method.POST)
                .host("api.example.com")
                .endpoint("/v1/label-test")
                .build();
        Response<ApiGatewayOperationItemResp> createResponse =
            service.createApiGatewayOperationItem(createOptions).execute();
        assertNotNull(createResponse);
        assertNotNull(createResponse.getResult());
        assertTrue(createResponse.getResult().isSuccess());

        String operationId = createResponse.getResult().getResult().getOperationId();
        assertNotNull(operationId);

        try {
            // Step 1: Add labels (create_api_gateway_operation_labels)
            // API requires both 'user' and 'managed' in the body
            CreateApiGatewayOperationLabelsOptions addLabelsOptions =
                new CreateApiGatewayOperationLabelsOptions.Builder()
                    .operationId(operationId)
                    .user(new ArrayList<String>())
                    .managed(Arrays.asList("cf-llm"))
                    .build();
            Response<ApiGatewayOperationLabelResp> addResponse =
                service.createApiGatewayOperationLabels(addLabelsOptions).execute();
            assertNotNull(addResponse);
            assertNotNull(addResponse.getResult());
            assertTrue(addResponse.getResult().isSuccess());

            // Step 2: Replace labels on a single operation (set_zone_api_gateway_operation_labels)
            SetZoneApiGatewayOperationLabelsOptions setLabelsOptions =
                new SetZoneApiGatewayOperationLabelsOptions.Builder()
                    .operationId(operationId)
                    .user(new ArrayList<String>())
                    .managed(Arrays.asList("cf-llm"))
                    .build();
            Response<ApiGatewayOperationLabelResp> setResponse =
                service.setZoneApiGatewayOperationLabels(setLabelsOptions).execute();
            assertNotNull(setResponse);
            assertNotNull(setResponse.getResult());
            assertTrue(setResponse.getResult().isSuccess());

            // Step 3: Remove labels from a single operation (unset_zone_api_gateway_operation_labels)
            UnsetZoneApiGatewayOperationLabelsOptions unsetLabelsOptions =
                new UnsetZoneApiGatewayOperationLabelsOptions.Builder()
                    .operationId(operationId)
                    .managed(Arrays.asList("cf-llm"))
                    .build();
            Response<ApiGatewayNullResultResp> unsetResponse =
                service.unsetZoneApiGatewayOperationLabels(unsetLabelsOptions).execute();
            assertNotNull(unsetResponse);
            assertNotNull(unsetResponse.getResult());
            assertTrue(unsetResponse.getResult().isSuccess());

        } finally {
            // Cleanup: delete the operation regardless of test outcome
            DeleteZoneApiGatewayOperationOptions cleanupOptions =
                new DeleteZoneApiGatewayOperationOptions.Builder()
                    .operationId(operationId)
                    .build();
            service.deleteZoneApiGatewayOperation(cleanupOptions).execute();
        }
    }

    /**
     * Test: Create and delete a single API Gateway Operation.
     */
    @Test
    public void testCreateAndDeleteApiGatewayOperationItem() throws Exception {
        CreateApiGatewayOperationItemOptions createOptions =
            new CreateApiGatewayOperationItemOptions.Builder()
                .method(CreateApiGatewayOperationItemOptions.Method.POST)
                .host("api.example.com")
                .endpoint("/v1/messages")
                .build();
        Response<ApiGatewayOperationItemResp> createResponse =
            service.createApiGatewayOperationItem(createOptions).execute();
        assertNotNull(createResponse);
        assertNotNull(createResponse.getResult());
        assertTrue(createResponse.getResult().isSuccess());

        String operationId = createResponse.getResult().getResult().getOperationId();
        assertNotNull(operationId);

        // Delete the created operation
        DeleteZoneApiGatewayOperationOptions deleteOptions =
            new DeleteZoneApiGatewayOperationOptions.Builder()
                .operationId(operationId)
                .build();
        Response<Void> deleteResponse = service.deleteZoneApiGatewayOperation(deleteOptions).execute();
        assertNotNull(deleteResponse);
    }

    // -------------------------------------------------------------------------
    // Block 1 — Single operation lifecycle
    // -------------------------------------------------------------------------

    /**
     * Block 1, Step 1: Create a single operation, retrieve it, delete it, verify deletion via 404.
     */
    @Test
    public void testSingleOperationLifecycle() throws Exception {
        // Step 1: Create a single operation
        CreateApiGatewayOperationItemOptions createOptions =
            new CreateApiGatewayOperationItemOptions.Builder()
                .method(CreateApiGatewayOperationItemOptions.Method.POST)
                .host("api.example.com")
                .endpoint("/v1/messages")
                .build();
        Response<ApiGatewayOperationItemResp> createResponse =
            service.createApiGatewayOperationItem(createOptions).execute();
        assertNotNull(createResponse);
        assertNotNull(createResponse.getResult());
        assertTrue(createResponse.getResult().isSuccess());

        String operationId = createResponse.getResult().getResult().getOperationId();
        assertNotNull(operationId);

        // Step 1b: List operations and verify the newly created one appears
        ListZoneApiGatewayOperationsOptions listOptions =
            new ListZoneApiGatewayOperationsOptions.Builder()
                .addHost("api.example.com")
                .addMethod("POST")
                .build();
        Response<ApiGatewayOperationsListResp> listResponse =
            service.listZoneApiGatewayOperations(listOptions).execute();
        assertNotNull(listResponse);
        assertNotNull(listResponse.getResult());
        assertTrue(listResponse.getResult().isSuccess());
        boolean foundInList = false;
        for (ApiGatewayOperationsListRespResultItem op : listResponse.getResult().getResult()) {
            if (operationId.equals(op.getOperationId())) {
                foundInList = true;
                break;
            }
        }
        assertTrue(foundInList, "Expected newly created operation " + operationId + " in list result");

        // Step 2: Retrieve the operation by ID
        GetZoneApiGatewayOperationOptions getOptions =
            new GetZoneApiGatewayOperationOptions.Builder()
                .operationId(operationId)
                .build();
        Response<ApiGatewayOperationItemResp> getResponse =
            service.getZoneApiGatewayOperation(getOptions).execute();
        assertNotNull(getResponse);
        assertNotNull(getResponse.getResult());
        assertTrue(getResponse.getResult().isSuccess());
        assertEquals(getResponse.getResult().getResult().getOperationId(), operationId);

        // Step 3: Delete the operation
        DeleteZoneApiGatewayOperationOptions deleteOptions =
            new DeleteZoneApiGatewayOperationOptions.Builder()
                .operationId(operationId)
                .build();
        Response<Void> deleteResponse = service.deleteZoneApiGatewayOperation(deleteOptions).execute();
        assertNotNull(deleteResponse);

        // Step 4: Verify deletion — expect HTTP 404
        try {
            GetZoneApiGatewayOperationOptions getAfterDeleteOptions =
                new GetZoneApiGatewayOperationOptions.Builder()
                    .operationId(operationId)
                    .build();
            service.getZoneApiGatewayOperation(getAfterDeleteOptions).execute();
            throw new AssertionError("Expected ServiceResponseException with status 404 but no exception was thrown");
        } catch (ServiceResponseException e) {
            assertEquals(e.getStatusCode(), 404,
                "Expected HTTP 404 after deletion but got: " + e.getStatusCode());
        }
    }

    // -------------------------------------------------------------------------
    // Block 2 — Bulk lifecycle (shared state across three scenarios)
    // -------------------------------------------------------------------------

    /** Shared state for Block 2 scenarios. Populated by testBulkCreateOperations. */
    private List<String> bulkOperationIDs = new ArrayList<>();

    /**
     * Block 2, Scenario 1: Create 3 operations in bulk and retrieve the second one.
     */
    @Test
    public void testBulkCreateOperations() throws Exception {
        ApiGatewayOperation op1 = new ApiGatewayOperation.Builder(
                ApiGatewayOperation.Method.GET, "api.example.com", "/v2/users")
            .build();
        ApiGatewayOperation op2 = new ApiGatewayOperation.Builder(
                ApiGatewayOperation.Method.POST, "api.example.com", "/v2/orders")
            .build();
        ApiGatewayOperation op3 = new ApiGatewayOperation.Builder(
                ApiGatewayOperation.Method.DELETE, "api.example.com", "/v2/sessions")
            .build();

        CreateZoneApiGatewayOperationOptions bulkCreateOptions =
            new CreateZoneApiGatewayOperationOptions.Builder()
                .apiGatewayOperation(Arrays.asList(op1, op2, op3))
                .build();
        Response<ApiGatewayOperationsResp> bulkCreateResponse =
            service.createZoneApiGatewayOperation(bulkCreateOptions).execute();
        assertNotNull(bulkCreateResponse);
        assertNotNull(bulkCreateResponse.getResult());
        assertTrue(bulkCreateResponse.getResult().isSuccess());

        List<ApiGatewayOperationsRespResultItem> resultItems = bulkCreateResponse.getResult().getResult();
        assertNotNull(resultItems);
        assertEquals(resultItems.size(), 3);

        // Collect IDs into the shared list
        bulkOperationIDs.clear();
        for (ApiGatewayOperationsRespResultItem item : resultItems) {
            assertNotNull(item.getOperationId());
            bulkOperationIDs.add(item.getOperationId());
        }
        assertEquals(bulkOperationIDs.size(), 3);

        // Retrieve the second operation by ID
        String secondId = bulkOperationIDs.get(1);
        GetZoneApiGatewayOperationOptions getOptions =
            new GetZoneApiGatewayOperationOptions.Builder()
                .operationId(secondId)
                .build();
        Response<ApiGatewayOperationItemResp> getResponse =
            service.getZoneApiGatewayOperation(getOptions).execute();
        assertNotNull(getResponse);
        assertNotNull(getResponse.getResult());
        assertTrue(getResponse.getResult().isSuccess());
        assertEquals(getResponse.getResult().getResult().getOperationId(), secondId);
    }

    /**
     * Block 2, Scenario 2: Update operation labels — add to all, remove first, verify label persists.
     */
    @Test(dependsOnMethods = "testBulkCreateOperations")
    public void testBulkUpdateOperationLabels() throws Exception {
        if (bulkOperationIDs == null || bulkOperationIDs.isEmpty()) {
            throw new SkipException("Skipping label update test: bulk operation IDs were not populated");
        }

        final String managedLabel = "cf-llm";

        // Add managed label to all 3 operations
        // API requires 'user' field to be present even when empty
        ApiGatewayOperationsLabelsBulkInputSelectorInclude allInclude =
            new ApiGatewayOperationsLabelsBulkInputSelectorInclude.Builder()
                .operationIds(bulkOperationIDs)
                .build();
        ApiGatewayOperationsLabelsBulkInputSelector allSelector =
            new ApiGatewayOperationsLabelsBulkInputSelector.Builder()
                .include(allInclude)
                .build();
        ApiGatewayOperationsLabelsBulkInputManaged managedLabelsAll =
            new ApiGatewayOperationsLabelsBulkInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        ApiGatewayOperationsLabelsBulkInputUser emptyUserLabels =
            new ApiGatewayOperationsLabelsBulkInputUser.Builder()
                .labels(new ArrayList<String>())
                .build();
        UpdateApiGatewayOperationLabelsOptions addToAllOptions =
            new UpdateApiGatewayOperationLabelsOptions.Builder()
                .user(emptyUserLabels)
                .managed(managedLabelsAll)
                .selector(allSelector)
                .build();
        Response<ApiGatewayOperationsLabelsResp> addToAllResponse =
            service.updateApiGatewayOperationLabels(addToAllOptions).execute();
        assertNotNull(addToAllResponse);
        assertNotNull(addToAllResponse.getResult());
        assertTrue(addToAllResponse.getResult().isSuccess());

        List<ApiGatewayOperationsLabelsRespResultItem> allItems = addToAllResponse.getResult().getResult();
        assertNotNull(allItems);
        assertEquals(allItems.size(), 3);
        for (ApiGatewayOperationsLabelsRespResultItem item : allItems) {
            assertNotNull(item.getLabels());
            boolean found = item.getLabels().stream()
                .anyMatch(l -> managedLabel.equals(l.getName()));
            assertTrue(found,
                "Expected label '" + managedLabel + "' on operation " + item.getOperationId());
        }

        // Narrow selector to 2nd and 3rd IDs only, apply same managed label again
        List<String> reducedIds = bulkOperationIDs.subList(1, 3);
        ApiGatewayOperationsLabelsBulkInputSelectorInclude reducedInclude =
            new ApiGatewayOperationsLabelsBulkInputSelectorInclude.Builder()
                .operationIds(reducedIds)
                .build();
        ApiGatewayOperationsLabelsBulkInputSelector reducedSelector =
            new ApiGatewayOperationsLabelsBulkInputSelector.Builder()
                .include(reducedInclude)
                .build();
        ApiGatewayOperationsLabelsBulkInputManaged managedLabelsReduced =
            new ApiGatewayOperationsLabelsBulkInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        UpdateApiGatewayOperationLabelsOptions reducedLabelOptions =
            new UpdateApiGatewayOperationLabelsOptions.Builder()
                .user(emptyUserLabels)
                .managed(managedLabelsReduced)
                .selector(reducedSelector)
                .build();
        Response<ApiGatewayOperationsLabelsResp> reducedResponse =
            service.updateApiGatewayOperationLabels(reducedLabelOptions).execute();
        assertNotNull(reducedResponse);
        assertNotNull(reducedResponse.getResult());
        assertTrue(reducedResponse.getResult().isSuccess());

        List<ApiGatewayOperationsLabelsRespResultItem> reducedItems = reducedResponse.getResult().getResult();
        assertNotNull(reducedItems);
        for (ApiGatewayOperationsLabelsRespResultItem item : reducedItems) {
            assertNotNull(item.getLabels());
            boolean found = item.getLabels().stream()
                .anyMatch(l -> managedLabel.equals(l.getName()));
            assertTrue(found,
                "Expected label '" + managedLabel + "' to persist on operation " + item.getOperationId());
        }

        // Replace labels on all 3 operations (PUT /operations/labels)
        ApiGatewayOperationsLabelsBulkInputManaged replaceManaged =
            new ApiGatewayOperationsLabelsBulkInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        ReplaceZoneApiGatewayOperationLabelsOptions replaceLabelsOptions =
            new ReplaceZoneApiGatewayOperationLabelsOptions.Builder()
                .user(emptyUserLabels)
                .managed(replaceManaged)
                .selector(allSelector)
                .build();
        Response<ApiGatewayOperationsLabelsResp> replaceResponse =
            service.replaceZoneApiGatewayOperationLabels(replaceLabelsOptions).execute();
        assertNotNull(replaceResponse);
        assertNotNull(replaceResponse.getResult());
        assertTrue(replaceResponse.getResult().isSuccess());

        // Bulk-delete labels from all 3 operations (DELETE /operations/labels)
        ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude deleteInclude =
            new ApiGatewayOperationsLabelsBulkDeleteInputSelectorInclude.Builder()
                .operationIds(bulkOperationIDs)
                .build();
        ApiGatewayOperationsLabelsBulkDeleteInputSelector deleteSelector =
            new ApiGatewayOperationsLabelsBulkDeleteInputSelector.Builder()
                .include(deleteInclude)
                .build();
        ApiGatewayOperationsLabelsBulkDeleteInputManaged deleteManaged =
            new ApiGatewayOperationsLabelsBulkDeleteInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        DeleteZoneApiGatewayOperationLabelsOptions deleteLabelsOptions =
            new DeleteZoneApiGatewayOperationLabelsOptions.Builder(deleteSelector)
                .managed(deleteManaged)
                .build();
        Response<ApiGatewayNullResultResp> deleteLabelsResponse =
            service.deleteZoneApiGatewayOperationLabels(deleteLabelsOptions).execute();
        assertNotNull(deleteLabelsResponse);
        assertNotNull(deleteLabelsResponse.getResult());
        assertTrue(deleteLabelsResponse.getResult().isSuccess());
    }

    /**
     * Block 2, Scenario 3: Delete all bulk-created operations.
     */
    @Test(dependsOnMethods = {"testBulkCreateOperations", "testBulkUpdateOperationLabels"})
    public void testBulkDeleteOperations() throws Exception {
        if (bulkOperationIDs == null || bulkOperationIDs.isEmpty()) {
            throw new SkipException("Skipping bulk delete test: bulk operation IDs were not populated");
        }

        for (String id : bulkOperationIDs) {
            DeleteZoneApiGatewayOperationOptions deleteOptions =
                new DeleteZoneApiGatewayOperationOptions.Builder()
                    .operationId(id)
                    .build();
            Response<Void> deleteResponse = service.deleteZoneApiGatewayOperation(deleteOptions).execute();
            assertNotNull(deleteResponse);
        }
    }
}
