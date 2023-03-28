/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateRouteFilterTemplate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateRouteFilterTemplate model.
 */
public class UpdateRouteFilterTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateRouteFilterTemplate() throws Throwable {
    UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
      .action("permit")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(updateRouteFilterTemplateModel.action(), "permit");
    assertEquals(updateRouteFilterTemplateModel.before(), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertEquals(updateRouteFilterTemplateModel.ge(), Long.valueOf("25"));
    assertEquals(updateRouteFilterTemplateModel.le(), Long.valueOf("30"));
    assertEquals(updateRouteFilterTemplateModel.prefix(), "192.168.100.0/24");

    String json = TestUtilities.serialize(updateRouteFilterTemplateModel);

    UpdateRouteFilterTemplate updateRouteFilterTemplateModelNew = TestUtilities.deserialize(json, UpdateRouteFilterTemplate.class);
    assertTrue(updateRouteFilterTemplateModelNew instanceof UpdateRouteFilterTemplate);
    assertEquals(updateRouteFilterTemplateModelNew.action(), "permit");
    assertEquals(updateRouteFilterTemplateModelNew.before(), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertEquals(updateRouteFilterTemplateModelNew.ge(), Long.valueOf("25"));
    assertEquals(updateRouteFilterTemplateModelNew.le(), Long.valueOf("30"));
    assertEquals(updateRouteFilterTemplateModelNew.prefix(), "192.168.100.0/24");
  }
  @Test
  public void testUpdateRouteFilterTemplateAsPatch() throws Throwable {
    UpdateRouteFilterTemplate updateRouteFilterTemplateModel = new UpdateRouteFilterTemplate.Builder()
      .action("permit")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();

    Map<String, Object> mergePatch = updateRouteFilterTemplateModel.asPatch();

    assertEquals(mergePatch.get("action"), "permit");
    assertEquals(mergePatch.get("before"), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertTrue(mergePatch.containsKey("ge"));
    assertTrue(mergePatch.containsKey("le"));
    assertEquals(mergePatch.get("prefix"), "192.168.100.0/24");
  }

}