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
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterId;
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleInputWithFilterIdFilter;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FirewallRuleInputWithFilterId model.
 */
public class FirewallRuleInputWithFilterIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFirewallRuleInputWithFilterId() throws Throwable {
    FirewallRuleInputWithFilterIdFilter firewallRuleInputWithFilterIdFilterModel = new FirewallRuleInputWithFilterIdFilter.Builder()
      .id("6f58318e7fa2477a23112e8118c66f61")
      .build();
    assertEquals(firewallRuleInputWithFilterIdFilterModel.id(), "6f58318e7fa2477a23112e8118c66f61");

    FirewallRuleInputWithFilterId firewallRuleInputWithFilterIdModel = new FirewallRuleInputWithFilterId.Builder()
      .filter(firewallRuleInputWithFilterIdFilterModel)
      .action("js_challenge")
      .description("JS challenge site")
      .build();
    assertEquals(firewallRuleInputWithFilterIdModel.filter(), firewallRuleInputWithFilterIdFilterModel);
    assertEquals(firewallRuleInputWithFilterIdModel.action(), "js_challenge");
    assertEquals(firewallRuleInputWithFilterIdModel.description(), "JS challenge site");

    String json = TestUtilities.serialize(firewallRuleInputWithFilterIdModel);

    FirewallRuleInputWithFilterId firewallRuleInputWithFilterIdModelNew = TestUtilities.deserialize(json, FirewallRuleInputWithFilterId.class);
    assertTrue(firewallRuleInputWithFilterIdModelNew instanceof FirewallRuleInputWithFilterId);
    assertEquals(firewallRuleInputWithFilterIdModelNew.filter().toString(), firewallRuleInputWithFilterIdFilterModel.toString());
    assertEquals(firewallRuleInputWithFilterIdModelNew.action(), "js_challenge");
    assertEquals(firewallRuleInputWithFilterIdModelNew.description(), "JS challenge site");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFirewallRuleInputWithFilterIdError() throws Throwable {
    new FirewallRuleInputWithFilterId.Builder().build();
  }

}