/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import com.ibm.cloud.networking.rulesets.v1.model.ActionParametersResponse;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ActionParametersResponse model.
 */
public class ActionParametersResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testActionParametersResponse() throws Throwable {
    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();
    assertEquals(actionParametersResponseModel.content(), "{\"success\": false, \"error\": \"you have been blocked\"}");
    assertEquals(actionParametersResponseModel.contentType(), "application/json");
    assertEquals(actionParametersResponseModel.statusCode(), Long.valueOf("400"));

    String json = TestUtilities.serialize(actionParametersResponseModel);

    ActionParametersResponse actionParametersResponseModelNew = TestUtilities.deserialize(json, ActionParametersResponse.class);
    assertTrue(actionParametersResponseModelNew instanceof ActionParametersResponse);
    assertEquals(actionParametersResponseModelNew.content(), "{\"success\": false, \"error\": \"you have been blocked\"}");
    assertEquals(actionParametersResponseModelNew.contentType(), "application/json");
    assertEquals(actionParametersResponseModelNew.statusCode(), Long.valueOf("400"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testActionParametersResponseError() throws Throwable {
    new ActionParametersResponse.Builder().build();
  }

}