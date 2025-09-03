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
import com.ibm.cloud.networking.rulesets.v1.model.Position;
import com.ibm.cloud.networking.rulesets.v1.model.Ratelimit;
import com.ibm.cloud.networking.rulesets.v1.model.RuleCreate;
import com.ibm.cloud.networking.rulesets.v1.model.RulesOverride;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RuleCreate model.
 */
public class RuleCreateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRuleCreate() throws Throwable {
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

    CategoriesOverride categoriesOverrideModel = new CategoriesOverride.Builder()
      .category("testString")
      .enabled(true)
      .action("testString")
      .build();
    assertEquals(categoriesOverrideModel.category(), "testString");
    assertEquals(categoriesOverrideModel.enabled(), Boolean.valueOf(true));
    assertEquals(categoriesOverrideModel.action(), "testString");

    Overrides overridesModel = new Overrides.Builder()
      .action("testString")
      .enabled(true)
      .sensitivityLevel("high")
      .rules(java.util.Arrays.asList(rulesOverrideModel))
      .categories(java.util.Arrays.asList(categoriesOverrideModel))
      .build();
    assertEquals(overridesModel.action(), "testString");
    assertEquals(overridesModel.enabled(), Boolean.valueOf(true));
    assertEquals(overridesModel.sensitivityLevel(), "high");
    assertEquals(overridesModel.rules(), java.util.Arrays.asList(rulesOverrideModel));
    assertEquals(overridesModel.categories(), java.util.Arrays.asList(categoriesOverrideModel));

    ActionParametersResponse actionParametersResponseModel = new ActionParametersResponse.Builder()
      .content("{\"success\": false, \"error\": \"you have been blocked\"}")
      .contentType("application/json")
      .statusCode(Long.valueOf("400"))
      .build();
    assertEquals(actionParametersResponseModel.content(), "{\"success\": false, \"error\": \"you have been blocked\"}");
    assertEquals(actionParametersResponseModel.contentType(), "application/json");
    assertEquals(actionParametersResponseModel.statusCode(), Long.valueOf("400"));

    ActionParameters actionParametersModel = new ActionParameters.Builder()
      .id("testString")
      .overrides(overridesModel)
      .version("testString")
      .ruleset("testString")
      .rulesets(java.util.Arrays.asList("testString"))
      .phases(java.util.Arrays.asList("testString"))
      .products(java.util.Arrays.asList("testString"))
      .response(actionParametersResponseModel)
      .build();
    assertEquals(actionParametersModel.id(), "testString");
    assertEquals(actionParametersModel.overrides(), overridesModel);
    assertEquals(actionParametersModel.version(), "testString");
    assertEquals(actionParametersModel.ruleset(), "testString");
    assertEquals(actionParametersModel.rulesets(), java.util.Arrays.asList("testString"));
    assertEquals(actionParametersModel.phases(), java.util.Arrays.asList("testString"));
    assertEquals(actionParametersModel.products(), java.util.Arrays.asList("testString"));
    assertEquals(actionParametersModel.response(), actionParametersResponseModel);

    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();
    assertEquals(ratelimitModel.characteristics(), java.util.Arrays.asList("testString"));
    assertEquals(ratelimitModel.countingExpression(), "testString");
    assertEquals(ratelimitModel.mitigationTimeout(), Long.valueOf("26"));
    assertEquals(ratelimitModel.period(), Long.valueOf("26"));
    assertEquals(ratelimitModel.requestsPerPeriod(), Long.valueOf("26"));

    Logging loggingModel = new Logging.Builder()
      .enabled(true)
      .build();
    assertEquals(loggingModel.enabled(), Boolean.valueOf(true));

    Position positionModel = new Position.Builder()
      .before("testString")
      .after("testString")
      .index(Long.valueOf("0"))
      .build();
    assertEquals(positionModel.before(), "testString");
    assertEquals(positionModel.after(), "testString");
    assertEquals(positionModel.index(), Long.valueOf("0"));

    RuleCreate ruleCreateModel = new RuleCreate.Builder()
      .action("testString")
      .actionParameters(actionParametersModel)
      .ratelimit(ratelimitModel)
      .description("testString")
      .enabled(true)
      .expression("ip.src ne 1.1.1.1")
      .id("testString")
      .logging(loggingModel)
      .ref("my_ref")
      .position(positionModel)
      .build();
    assertEquals(ruleCreateModel.action(), "testString");
    assertEquals(ruleCreateModel.actionParameters(), actionParametersModel);
    assertEquals(ruleCreateModel.ratelimit(), ratelimitModel);
    assertEquals(ruleCreateModel.description(), "testString");
    assertEquals(ruleCreateModel.enabled(), Boolean.valueOf(true));
    assertEquals(ruleCreateModel.expression(), "ip.src ne 1.1.1.1");
    assertEquals(ruleCreateModel.id(), "testString");
    assertEquals(ruleCreateModel.logging(), loggingModel);
    assertEquals(ruleCreateModel.ref(), "my_ref");
    assertEquals(ruleCreateModel.position(), positionModel);

    String json = TestUtilities.serialize(ruleCreateModel);

    RuleCreate ruleCreateModelNew = TestUtilities.deserialize(json, RuleCreate.class);
    assertTrue(ruleCreateModelNew instanceof RuleCreate);
    assertEquals(ruleCreateModelNew.action(), "testString");
    assertEquals(ruleCreateModelNew.actionParameters().toString(), actionParametersModel.toString());
    assertEquals(ruleCreateModelNew.ratelimit().toString(), ratelimitModel.toString());
    assertEquals(ruleCreateModelNew.description(), "testString");
    assertEquals(ruleCreateModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(ruleCreateModelNew.expression(), "ip.src ne 1.1.1.1");
    assertEquals(ruleCreateModelNew.id(), "testString");
    assertEquals(ruleCreateModelNew.logging().toString(), loggingModel.toString());
    assertEquals(ruleCreateModelNew.ref(), "my_ref");
    assertEquals(ruleCreateModelNew.position().toString(), positionModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRuleCreateError() throws Throwable {
    new RuleCreate.Builder().build();
  }

}