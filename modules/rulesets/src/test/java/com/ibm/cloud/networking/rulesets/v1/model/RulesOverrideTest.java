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

import com.ibm.cloud.networking.rulesets.v1.model.RulesOverride;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RulesOverride model.
 */
public class RulesOverrideTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRulesOverride() throws Throwable {
    RulesOverride rulesOverrideModel = new RulesOverride.Builder()
      .id("testString")
      .enabled(true)
      .action("testString")
      .sensitivityLevel("high")
      .scoreThreshold(Long.valueOf("60"))
      .build();
    assertEquals(rulesOverrideModel.id(), "testString");
    assertEquals(rulesOverrideModel.enabled(), Boolean.valueOf(true));
    assertEquals(rulesOverrideModel.action(), "testString");
    assertEquals(rulesOverrideModel.sensitivityLevel(), "high");
    assertEquals(rulesOverrideModel.scoreThreshold(), Long.valueOf("60"));

    String json = TestUtilities.serialize(rulesOverrideModel);

    RulesOverride rulesOverrideModelNew = TestUtilities.deserialize(json, RulesOverride.class);
    assertTrue(rulesOverrideModelNew instanceof RulesOverride);
    assertEquals(rulesOverrideModelNew.id(), "testString");
    assertEquals(rulesOverrideModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(rulesOverrideModelNew.action(), "testString");
    assertEquals(rulesOverrideModelNew.sensitivityLevel(), "high");
    assertEquals(rulesOverrideModelNew.scoreThreshold(), Long.valueOf("60"));
  }
}