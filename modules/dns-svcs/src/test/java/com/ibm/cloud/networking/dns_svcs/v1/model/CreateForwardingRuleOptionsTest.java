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
import com.ibm.cloud.networking.dns_svcs.v1.model.CreateForwardingRuleOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateForwardingRuleOptions model.
 */
public class CreateForwardingRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateForwardingRuleOptions() throws Throwable {
    CreateForwardingRuleOptions createForwardingRuleOptionsModel = new CreateForwardingRuleOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .description("forwarding rule")
      .type("zone")
      .match("example.com")
      .forwardTo(new java.util.ArrayList<String>(java.util.Arrays.asList("161.26.0.7")))
      .xCorrelationId("testString")
      .build();
    assertEquals(createForwardingRuleOptionsModel.instanceId(), "testString");
    assertEquals(createForwardingRuleOptionsModel.resolverId(), "testString");
    assertEquals(createForwardingRuleOptionsModel.description(), "forwarding rule");
    assertEquals(createForwardingRuleOptionsModel.type(), "zone");
    assertEquals(createForwardingRuleOptionsModel.match(), "example.com");
    assertEquals(createForwardingRuleOptionsModel.forwardTo(), new java.util.ArrayList<String>(java.util.Arrays.asList("161.26.0.7")));
    assertEquals(createForwardingRuleOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateForwardingRuleOptionsError() throws Throwable {
    new CreateForwardingRuleOptions.Builder().build();
  }

}