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
import com.ibm.cloud.networking.firewall_rules.v1.model.FirewallRuleUpdateInputFilter;
import com.ibm.cloud.networking.firewall_rules.v1.model.UpdateFirewallRuleOptions;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateFirewallRuleOptions model.
 */
public class UpdateFirewallRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateFirewallRuleOptions() throws Throwable {
    FirewallRuleUpdateInputFilter firewallRuleUpdateInputFilterModel = new FirewallRuleUpdateInputFilter.Builder()
      .id("6f58318e7fa2477a23112e8118c66f61")
      .build();
    assertEquals(firewallRuleUpdateInputFilterModel.id(), "6f58318e7fa2477a23112e8118c66f61");

    UpdateFirewallRuleOptions updateFirewallRuleOptionsModel = new UpdateFirewallRuleOptions.Builder()
      .xAuthUserToken("testString")
      .crn("testString")
      .zoneIdentifier("testString")
      .firewallRuleIdentifier("testString")
      .action("js_challenge")
      .paused(false)
      .description("JS challenge site")
      .filter(firewallRuleUpdateInputFilterModel)
      .build();
    assertEquals(updateFirewallRuleOptionsModel.xAuthUserToken(), "testString");
    assertEquals(updateFirewallRuleOptionsModel.crn(), "testString");
    assertEquals(updateFirewallRuleOptionsModel.zoneIdentifier(), "testString");
    assertEquals(updateFirewallRuleOptionsModel.firewallRuleIdentifier(), "testString");
    assertEquals(updateFirewallRuleOptionsModel.action(), "js_challenge");
    assertEquals(updateFirewallRuleOptionsModel.paused(), Boolean.valueOf(false));
    assertEquals(updateFirewallRuleOptionsModel.description(), "JS challenge site");
    assertEquals(updateFirewallRuleOptionsModel.filter(), firewallRuleUpdateInputFilterModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFirewallRuleOptionsError() throws Throwable {
    new UpdateFirewallRuleOptions.Builder().build();
  }

}