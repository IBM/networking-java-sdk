/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayBfdConfigTemplate model.
 */
public class GatewayBfdConfigTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayBfdConfigTemplate() throws Throwable {
    GatewayBfdConfigTemplate gatewayBfdConfigTemplateModel = new GatewayBfdConfigTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdConfigTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigTemplateModel.multiplier(), Long.valueOf("10"));

    String json = TestUtilities.serialize(gatewayBfdConfigTemplateModel);

    GatewayBfdConfigTemplate gatewayBfdConfigTemplateModelNew = TestUtilities.deserialize(json, GatewayBfdConfigTemplate.class);
    assertTrue(gatewayBfdConfigTemplateModelNew instanceof GatewayBfdConfigTemplate);
    assertEquals(gatewayBfdConfigTemplateModelNew.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigTemplateModelNew.multiplier(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayBfdConfigTemplateError() throws Throwable {
    new GatewayBfdConfigTemplate.Builder().build();
  }

}