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

import com.ibm.cloud.networking.rulesets.v1.model.ActionParameters;
import com.ibm.cloud.networking.rulesets.v1.model.ActionParametersResponse;
import com.ibm.cloud.networking.rulesets.v1.model.CategoriesOverride;
import com.ibm.cloud.networking.rulesets.v1.model.Logging;
import com.ibm.cloud.networking.rulesets.v1.model.Overrides;
import com.ibm.cloud.networking.rulesets.v1.model.RuleDetails;
import com.ibm.cloud.networking.rulesets.v1.model.RulesOverride;
import com.ibm.cloud.networking.rulesets.v1.model.RulesetDetails;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RulesetDetails model.
 */
public class RulesetDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRulesetDetails() throws Throwable {
    RulesetDetails rulesetDetailsModel = new RulesetDetails();
    assertNull(rulesetDetailsModel.getDescription());
    assertNull(rulesetDetailsModel.getId());
    assertNull(rulesetDetailsModel.getKind());
    assertNull(rulesetDetailsModel.getLastUpdated());
    assertNull(rulesetDetailsModel.getName());
    assertNull(rulesetDetailsModel.getPhase());
    assertNull(rulesetDetailsModel.getVersion());
    assertNull(rulesetDetailsModel.getRules());
  }
}