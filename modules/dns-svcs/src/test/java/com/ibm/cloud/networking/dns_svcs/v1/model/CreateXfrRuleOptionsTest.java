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
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateXfrRuleOptions;
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
 * Unit test class for the CreateXfrRuleOptions model.
 */
public class CreateXfrRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateXfrRuleOptions() throws Throwable {
    XfrRuleInputTransferFromItem xfrRuleInputTransferFromItemModel = new XfrRuleInputTransferFromItem.Builder()
      .address("10.0.0.7")
      .build();
    assertEquals(xfrRuleInputTransferFromItemModel.address(), "10.0.0.7");

    CreateXfrRuleOptions createXfrRuleOptionsModel = new CreateXfrRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .description("xfr rule")
      .zone("example.com")
      .enabled(false)
      .transferFrom(new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)))
      .xCorrelationId("testString")
      .build();
    assertEquals(createXfrRuleOptionsModel.instanceId(), "testString");
    assertEquals(createXfrRuleOptionsModel.resolverId(), "testString");
    assertEquals(createXfrRuleOptionsModel.description(), "xfr rule");
    assertEquals(createXfrRuleOptionsModel.zone(), "example.com");
    assertEquals(createXfrRuleOptionsModel.enabled(), Boolean.valueOf(false));
    assertEquals(createXfrRuleOptionsModel.transferFrom(), new java.util.ArrayList<XfrRuleInputTransferFromItem>(java.util.Arrays.asList(xfrRuleInputTransferFromItemModel)));
    assertEquals(createXfrRuleOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateXfrRuleOptionsError() throws Throwable {
    new CreateXfrRuleOptions.Builder().build();
  }

}