/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigActionTemplate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayBfdConfigActionTemplate model.
 */
public class GatewayBfdConfigActionTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayBfdConfigActionTemplate() throws Throwable {
    GatewayBfdConfigActionTemplate gatewayBfdConfigActionTemplateModel = new GatewayBfdConfigActionTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdConfigActionTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigActionTemplateModel.multiplier(), Long.valueOf("10"));

    String json = TestUtilities.serialize(gatewayBfdConfigActionTemplateModel);

    GatewayBfdConfigActionTemplate gatewayBfdConfigActionTemplateModelNew = TestUtilities.deserialize(json, GatewayBfdConfigActionTemplate.class);
    assertTrue(gatewayBfdConfigActionTemplateModelNew instanceof GatewayBfdConfigActionTemplate);
    assertEquals(gatewayBfdConfigActionTemplateModelNew.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigActionTemplateModelNew.multiplier(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayBfdConfigActionTemplateError() throws Throwable {
    new GatewayBfdConfigActionTemplate.Builder().build();
  }

}