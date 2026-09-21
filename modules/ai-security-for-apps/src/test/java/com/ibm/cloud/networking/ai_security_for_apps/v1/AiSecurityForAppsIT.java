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

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.AiSecuritySettingsResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayDiscoveryResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationItemResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewaySchemasResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.CreateApiGatewayOperationItemOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DeleteZoneApiGatewayOperationOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.DiscoveryOperationsListResp;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetAiSecuritySettingsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewayDiscoveryOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.GetApiGatewaySchemasOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneAiSecuritySettingsOptions;
import com.ibm.cloud.networking.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
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
        config = CredentialUtils.getServiceProperties(AiSecurityForApps.DEFAULT_SERVICE_NAME);
        assertNotNull(config);
        String crn = config.get("CRN");
        String zoneIdentifier = config.get("ZONE_ID");
        service = AiSecurityForApps.newInstance(crn, zoneIdentifier);
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
}
