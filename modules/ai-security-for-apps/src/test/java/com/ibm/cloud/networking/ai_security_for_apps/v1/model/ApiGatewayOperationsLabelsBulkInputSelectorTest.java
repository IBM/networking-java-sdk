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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ApiGatewayOperationsLabelsBulkInputSelector model.
 */
public class ApiGatewayOperationsLabelsBulkInputSelectorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testApiGatewayOperationsLabelsBulkInputSelector() throws Throwable {
    ApiGatewayOperationsLabelsBulkInputSelectorInclude apiGatewayOperationsLabelsBulkInputSelectorIncludeModel = new ApiGatewayOperationsLabelsBulkInputSelectorInclude.Builder()
      .operationIds(java.util.Arrays.asList("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"))
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputSelectorIncludeModel.operationIds(), java.util.Arrays.asList("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"));

    ApiGatewayOperationsLabelsBulkInputSelector apiGatewayOperationsLabelsBulkInputSelectorModel = new ApiGatewayOperationsLabelsBulkInputSelector.Builder()
      .include(apiGatewayOperationsLabelsBulkInputSelectorIncludeModel)
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputSelectorModel.include(), apiGatewayOperationsLabelsBulkInputSelectorIncludeModel);

    String json = TestUtilities.serialize(apiGatewayOperationsLabelsBulkInputSelectorModel);

    ApiGatewayOperationsLabelsBulkInputSelector apiGatewayOperationsLabelsBulkInputSelectorModelNew = TestUtilities.deserialize(json, ApiGatewayOperationsLabelsBulkInputSelector.class);
    assertTrue(apiGatewayOperationsLabelsBulkInputSelectorModelNew instanceof ApiGatewayOperationsLabelsBulkInputSelector);
    assertEquals(apiGatewayOperationsLabelsBulkInputSelectorModelNew.include().toString(), apiGatewayOperationsLabelsBulkInputSelectorIncludeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testApiGatewayOperationsLabelsBulkInputSelectorError() throws Throwable {
    new ApiGatewayOperationsLabelsBulkInputSelector.Builder().build();
  }

}