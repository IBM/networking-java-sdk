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

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ApiGatewayOperation;
import com.ibm.cloud.networking.ai_security_for_apps.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ApiGatewayOperation model.
 */
public class ApiGatewayOperationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testApiGatewayOperation() throws Throwable {
    ApiGatewayOperation apiGatewayOperationModel = new ApiGatewayOperation.Builder()
      .method("POST")
      .host("api.example.com")
      .endpoint("/v1/messages")
      .build();
    assertEquals(apiGatewayOperationModel.method(), "POST");
    assertEquals(apiGatewayOperationModel.host(), "api.example.com");
    assertEquals(apiGatewayOperationModel.endpoint(), "/v1/messages");

    String json = TestUtilities.serialize(apiGatewayOperationModel);

    ApiGatewayOperation apiGatewayOperationModelNew = TestUtilities.deserialize(json, ApiGatewayOperation.class);
    assertTrue(apiGatewayOperationModelNew instanceof ApiGatewayOperation);
    assertEquals(apiGatewayOperationModelNew.method(), "POST");
    assertEquals(apiGatewayOperationModelNew.host(), "api.example.com");
    assertEquals(apiGatewayOperationModelNew.endpoint(), "/v1/messages");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testApiGatewayOperationError() throws Throwable {
    new ApiGatewayOperation.Builder().build();
  }

}