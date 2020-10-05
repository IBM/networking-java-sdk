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

import com.ibm.cloud.networking.waf_rules_api.v1.model.ListWafRulesOptions;
import com.ibm.cloud.networking.waf_rules_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListWafRulesOptions model.
 */
public class ListWafRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListWafRulesOptions() throws Throwable {
    ListWafRulesOptions listWafRulesOptionsModel = new ListWafRulesOptions.Builder()
      .packageId("testString")
      .mode("on")
      .priority("5")
      .match("all")
      .order("status")
      .groupId("de677e5818985db1285d0e80225f06e5")
      .description("SQL-injection-prevention-for-SELECT-statements")
      .direction("desc")
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("50"))
      .build();
    assertEquals(listWafRulesOptionsModel.packageId(), "testString");
    assertEquals(listWafRulesOptionsModel.mode(), "on");
    assertEquals(listWafRulesOptionsModel.priority(), "5");
    assertEquals(listWafRulesOptionsModel.match(), "all");
    assertEquals(listWafRulesOptionsModel.order(), "status");
    assertEquals(listWafRulesOptionsModel.groupId(), "de677e5818985db1285d0e80225f06e5");
    assertEquals(listWafRulesOptionsModel.description(), "SQL-injection-prevention-for-SELECT-statements");
    assertEquals(listWafRulesOptionsModel.direction(), "desc");
    assertEquals(listWafRulesOptionsModel.page(), Long.valueOf("1"));
    assertEquals(listWafRulesOptionsModel.perPage(), Long.valueOf("50"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWafRulesOptionsError() throws Throwable {
    new ListWafRulesOptions.Builder().build();
  }

}