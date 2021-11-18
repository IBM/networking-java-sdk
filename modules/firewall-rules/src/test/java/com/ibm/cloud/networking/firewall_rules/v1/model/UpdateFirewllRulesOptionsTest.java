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
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewllRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateFirewllRulesOptions model.
 */
public class UpdateFirewllRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateFirewllRulesOptions() throws Throwable {
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

    UpdateFirewllRulesOptions updateFirewllRulesOptionsModel = new UpdateFirewllRulesOptions.Builder()
      .xAuthUserToken("testString")
      .crn("testString")
      .zoneIdentifier("testString")
      .firewallRulesUpdateInputItem(new java.util.ArrayList<FirewallRulesUpdateInputItem>(java.util.Arrays.asList(firewallRulesUpdateInputItemModel)))
      .build();
    assertEquals(updateFirewllRulesOptionsModel.xAuthUserToken(), "testString");
    assertEquals(updateFirewllRulesOptionsModel.crn(), "testString");
    assertEquals(updateFirewllRulesOptionsModel.zoneIdentifier(), "testString");
    assertEquals(updateFirewllRulesOptionsModel.firewallRulesUpdateInputItem(), new java.util.ArrayList<FirewallRulesUpdateInputItem>(java.util.Arrays.asList(firewallRulesUpdateInputItemModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFirewllRulesOptionsError() throws Throwable {
    new UpdateFirewllRulesOptions.Builder().build();
  }

}