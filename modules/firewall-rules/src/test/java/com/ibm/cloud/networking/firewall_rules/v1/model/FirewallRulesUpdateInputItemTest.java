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

package com.ibm.cloud.networking.firewall_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItem;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRulesUpdateInputItemFilter;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FirewallRulesUpdateInputItem model.
 */
public class FirewallRulesUpdateInputItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFirewallRulesUpdateInputItem() throws Throwable {
    FirewallRulesUpdateInputItemFilter firewallRulesUpdateInputItemFilterModel = new FirewallRulesUpdateInputItemFilter.Builder()
      .id("6f58318e7fa2477a23112e8118c66f61")
      .build();
    assertEquals(firewallRulesUpdateInputItemFilterModel.id(), "6f58318e7fa2477a23112e8118c66f61");

    FirewallRulesUpdateInputItem firewallRulesUpdateInputItemModel = new FirewallRulesUpdateInputItem.Builder()
      .id("52161eb6af4241bb9d4b32394be72fdf")
      .action("js_challenge")
      .paused(false)
      .description("JS challenge site")
      .filter(firewallRulesUpdateInputItemFilterModel)
      .build();
    assertEquals(firewallRulesUpdateInputItemModel.id(), "52161eb6af4241bb9d4b32394be72fdf");
    assertEquals(firewallRulesUpdateInputItemModel.action(), "js_challenge");
    assertEquals(firewallRulesUpdateInputItemModel.paused(), Boolean.valueOf(false));
    assertEquals(firewallRulesUpdateInputItemModel.description(), "JS challenge site");
    assertEquals(firewallRulesUpdateInputItemModel.filter(), firewallRulesUpdateInputItemFilterModel);

    String json = TestUtilities.serialize(firewallRulesUpdateInputItemModel);

    FirewallRulesUpdateInputItem firewallRulesUpdateInputItemModelNew = TestUtilities.deserialize(json, FirewallRulesUpdateInputItem.class);
    assertTrue(firewallRulesUpdateInputItemModelNew instanceof FirewallRulesUpdateInputItem);
    assertEquals(firewallRulesUpdateInputItemModelNew.id(), "52161eb6af4241bb9d4b32394be72fdf");
    assertEquals(firewallRulesUpdateInputItemModelNew.action(), "js_challenge");
    assertEquals(firewallRulesUpdateInputItemModelNew.paused(), Boolean.valueOf(false));
    assertEquals(firewallRulesUpdateInputItemModelNew.description(), "JS challenge site");
    assertEquals(firewallRulesUpdateInputItemModelNew.filter().toString(), firewallRulesUpdateInputItemFilterModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFirewallRulesUpdateInputItemError() throws Throwable {
    new FirewallRulesUpdateInputItem.Builder().build();
  }

}