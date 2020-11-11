/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.cloud.networking.waf_rules_api.v1.model;

import com.ibm.cloud.networking.waf_rules_api.v1.model.UpdateWafRuleOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyCis;
import com.ibm.cloud.networking.waf_rules_api.v1.model.WafRuleBodyOwasp;
import com.ibm.cloud.networking.waf_rules_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateWafRuleOptions model.
 */
public class UpdateWafRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateWafRuleOptions() throws Throwable {
    WafRuleBodyCis wafRuleBodyCisModel = new WafRuleBodyCis.Builder()
      .mode("default")
      .build();
    assertEquals(wafRuleBodyCisModel.mode(), "default");

    WafRuleBodyOwasp wafRuleBodyOwaspModel = new WafRuleBodyOwasp.Builder()
      .mode("on")
      .build();
    assertEquals(wafRuleBodyOwaspModel.mode(), "on");

    UpdateWafRuleOptions updateWafRuleOptionsModel = new UpdateWafRuleOptions.Builder()
      .packageId("testString")
      .identifier("testString")
      .cis(wafRuleBodyCisModel)
      .owasp(wafRuleBodyOwaspModel)
      .build();
    assertEquals(updateWafRuleOptionsModel.packageId(), "testString");
    assertEquals(updateWafRuleOptionsModel.identifier(), "testString");
    assertEquals(updateWafRuleOptionsModel.cis(), wafRuleBodyCisModel);
    assertEquals(updateWafRuleOptionsModel.owasp(), wafRuleBodyOwaspModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWafRuleOptionsError() throws Throwable {
    new UpdateWafRuleOptions.Builder().build();
  }

}