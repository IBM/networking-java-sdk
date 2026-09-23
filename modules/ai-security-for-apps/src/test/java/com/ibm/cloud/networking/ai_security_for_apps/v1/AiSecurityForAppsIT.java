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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayDiscoveryResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperation;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputManaged;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsRespResultItem;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewaySchemasResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationItemOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewayDiscoveryOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewaySchemasOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.UpdateApiGatewayOperationLabelsOptions;
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
        ApiGatewayOperationsLabelsInputSelectorInclude allInclude =
            new ApiGatewayOperationsLabelsInputSelectorInclude.Builder()
                .operationIds(bulkOperationIDs)
                .build();
        ApiGatewayOperationsLabelsInputSelector allSelector =
            new ApiGatewayOperationsLabelsInputSelector.Builder()
                .include(allInclude)
                .build();
        ApiGatewayOperationsLabelsInputManaged managedLabelsAll =
            new ApiGatewayOperationsLabelsInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        UpdateApiGatewayOperationLabelsOptions addToAllOptions =
            new UpdateApiGatewayOperationLabelsOptions.Builder()
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
                .anyMatch(l -> managedLabel.equals(l.get("name")));
            assertTrue(found,
                "Expected label '" + managedLabel + "' on operation " + item.getOperationId());
        }

        // Narrow selector to 2nd and 3rd IDs only, apply same managed label again
        List<String> reducedIds = bulkOperationIDs.subList(1, 3);
        ApiGatewayOperationsLabelsInputSelectorInclude reducedInclude =
            new ApiGatewayOperationsLabelsInputSelectorInclude.Builder()
                .operationIds(reducedIds)
                .build();
        ApiGatewayOperationsLabelsInputSelector reducedSelector =
            new ApiGatewayOperationsLabelsInputSelector.Builder()
                .include(reducedInclude)
                .build();
        ApiGatewayOperationsLabelsInputManaged managedLabelsReduced =
            new ApiGatewayOperationsLabelsInputManaged.Builder()
                .addLabels(managedLabel)
                .build();
        UpdateApiGatewayOperationLabelsOptions reducedLabelOptions =
            new UpdateApiGatewayOperationLabelsOptions.Builder()
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
                .anyMatch(l -> managedLabel.equals(l.get("name")));
            assertTrue(found,
                "Expected label '" + managedLabel + "' to persist on operation " + item.getOperationId());
        }
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
