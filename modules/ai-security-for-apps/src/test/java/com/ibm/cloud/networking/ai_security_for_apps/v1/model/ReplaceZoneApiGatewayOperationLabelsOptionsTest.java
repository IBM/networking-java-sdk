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

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputManaged;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelector;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputSelectorInclude;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperationsLabelsBulkInputUser;
import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ReplaceZoneApiGatewayOperationLabelsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceZoneApiGatewayOperationLabelsOptions model.
 */
public class ReplaceZoneApiGatewayOperationLabelsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceZoneApiGatewayOperationLabelsOptions() throws Throwable {
    ApiGatewayOperationsLabelsBulkInputSelectorInclude apiGatewayOperationsLabelsBulkInputSelectorIncludeModel = new ApiGatewayOperationsLabelsBulkInputSelectorInclude.Builder()
      .operationIds(java.util.Arrays.asList("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"))
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputSelectorIncludeModel.operationIds(), java.util.Arrays.asList("f174e90a-fafe-4643-bbbc-4a0ed4fc8415"));

    ApiGatewayOperationsLabelsBulkInputSelector apiGatewayOperationsLabelsBulkInputSelectorModel = new ApiGatewayOperationsLabelsBulkInputSelector.Builder()
      .include(apiGatewayOperationsLabelsBulkInputSelectorIncludeModel)
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputSelectorModel.include(), apiGatewayOperationsLabelsBulkInputSelectorIncludeModel);

    ApiGatewayOperationsLabelsBulkInputUser apiGatewayOperationsLabelsBulkInputUserModel = new ApiGatewayOperationsLabelsBulkInputUser.Builder()
      .labels(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputUserModel.labels(), java.util.Arrays.asList("testString"));

    ApiGatewayOperationsLabelsBulkInputManaged apiGatewayOperationsLabelsBulkInputManagedModel = new ApiGatewayOperationsLabelsBulkInputManaged.Builder()
      .labels(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(apiGatewayOperationsLabelsBulkInputManagedModel.labels(), java.util.Arrays.asList("testString"));

    ReplaceZoneApiGatewayOperationLabelsOptions replaceZoneApiGatewayOperationLabelsOptionsModel = new ReplaceZoneApiGatewayOperationLabelsOptions.Builder()
      .selector(apiGatewayOperationsLabelsBulkInputSelectorModel)
      .user(apiGatewayOperationsLabelsBulkInputUserModel)
      .managed(apiGatewayOperationsLabelsBulkInputManagedModel)
      .build();
    assertEquals(replaceZoneApiGatewayOperationLabelsOptionsModel.selector(), apiGatewayOperationsLabelsBulkInputSelectorModel);
    assertEquals(replaceZoneApiGatewayOperationLabelsOptionsModel.user(), apiGatewayOperationsLabelsBulkInputUserModel);
    assertEquals(replaceZoneApiGatewayOperationLabelsOptionsModel.managed(), apiGatewayOperationsLabelsBulkInputManagedModel);
  }
}