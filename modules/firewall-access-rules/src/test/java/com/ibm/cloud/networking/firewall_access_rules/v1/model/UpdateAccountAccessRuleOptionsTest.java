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

package com.ibm.cloud.networking.firewall_access_rules.v1.model;

import com.ibm.cloud.networking.firewall_access_rules.v1.model.UpdateAccountAccessRuleOptions;
import com.ibm.cloud.networking.firewall_access_rules.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAccountAccessRuleOptions model.
 */
public class UpdateAccountAccessRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAccountAccessRuleOptions() throws Throwable {
    UpdateAccountAccessRuleOptions updateAccountAccessRuleOptionsModel = new UpdateAccountAccessRuleOptions.Builder()
      .accessruleIdentifier("testString")
      .mode("block")
      .notes("This rule is added because of event X that occurred on date xyz")
      .build();
    assertEquals(updateAccountAccessRuleOptionsModel.accessruleIdentifier(), "testString");
    assertEquals(updateAccountAccessRuleOptionsModel.mode(), "block");
    assertEquals(updateAccountAccessRuleOptionsModel.notes(), "This rule is added because of event X that occurred on date xyz");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccountAccessRuleOptionsError() throws Throwable {
    new UpdateAccountAccessRuleOptions.Builder().build();
  }

}