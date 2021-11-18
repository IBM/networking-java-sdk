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
import com.ibm.cloud.networking.firewall_rules.v1.model.DeleteFirewallRulesOptions;
import com.ibm.cloud.networking.firewall_rules.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteFirewallRulesOptions model.
 */
public class DeleteFirewallRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteFirewallRulesOptions() throws Throwable {
    DeleteFirewallRulesOptions deleteFirewallRulesOptionsModel = new DeleteFirewallRulesOptions.Builder()
      .xAuthUserToken("testString")
      .crn("testString")
      .zoneIdentifier("testString")
      .id("f2d427378e7542acb295380d352e2ebd")
      .build();
    assertEquals(deleteFirewallRulesOptionsModel.xAuthUserToken(), "testString");
    assertEquals(deleteFirewallRulesOptionsModel.crn(), "testString");
    assertEquals(deleteFirewallRulesOptionsModel.zoneIdentifier(), "testString");
    assertEquals(deleteFirewallRulesOptionsModel.id(), "f2d427378e7542acb295380d352e2ebd");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFirewallRulesOptionsError() throws Throwable {
    new DeleteFirewallRulesOptions.Builder().build();
  }

}