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

package com.ibm.cloud.networking.waf_rule_groups_api.v1.model;

import com.ibm.cloud.networking.waf_rule_groups_api.v1.model.ListWafRuleGroupsOptions;
import com.ibm.cloud.networking.waf_rule_groups_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListWafRuleGroupsOptions model.
 */
public class ListWafRuleGroupsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListWafRuleGroupsOptions() throws Throwable {
    ListWafRuleGroupsOptions listWafRuleGroupsOptionsModel = new ListWafRuleGroupsOptions.Builder()
      .pkgId("testString")
      .name("Wordpress-rules")
      .mode("true")
      .rulesCount("10")
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("50"))
      .order("status")
      .direction("desc")
      .match("all")
      .build();
    assertEquals(listWafRuleGroupsOptionsModel.pkgId(), "testString");
    assertEquals(listWafRuleGroupsOptionsModel.name(), "Wordpress-rules");
    assertEquals(listWafRuleGroupsOptionsModel.mode(), "true");
    assertEquals(listWafRuleGroupsOptionsModel.rulesCount(), "10");
    assertEquals(listWafRuleGroupsOptionsModel.page(), Long.valueOf("1"));
    assertEquals(listWafRuleGroupsOptionsModel.perPage(), Long.valueOf("50"));
    assertEquals(listWafRuleGroupsOptionsModel.order(), "status");
    assertEquals(listWafRuleGroupsOptionsModel.direction(), "desc");
    assertEquals(listWafRuleGroupsOptionsModel.match(), "all");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWafRuleGroupsOptionsError() throws Throwable {
    new ListWafRuleGroupsOptions.Builder().build();
  }

}