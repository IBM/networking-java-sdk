/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateXfrRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.XfrRuleInputTransferFromItem;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateXfrRuleOptions model.
 */
public class UpdateXfrRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateXfrRuleOptions() throws Throwable {
    XfrRuleInputTransferFromItem xfrRuleInputTransferFromItemModel = new XfrRuleInputTransferFromItem.Builder()
      .address("10.0.0.7")
      .build();
    assertEquals(xfrRuleInputTransferFromItemModel.address(), "10.0.0.7");

    UpdateXfrRuleOptions updateXfrRuleOptionsModel = new UpdateXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .ruleId("testString")
      .description("xfr rule")
      .enabled(false)
      .transferFrom(new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)))
      .xCorrelationId("testString")
      .build();
    assertEquals(updateXfrRuleOptionsModel.instanceId(), "testString");
    assertEquals(updateXfrRuleOptionsModel.resolverId(), "testString");
    assertEquals(updateXfrRuleOptionsModel.ruleId(), "testString");
    assertEquals(updateXfrRuleOptionsModel.description(), "xfr rule");
    assertEquals(updateXfrRuleOptionsModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateXfrRuleOptionsModel.transferFrom(), new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)));
    assertEquals(updateXfrRuleOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateXfrRuleOptionsError() throws Throwable {
    new UpdateXfrRuleOptions.Builder().build();
  }

}