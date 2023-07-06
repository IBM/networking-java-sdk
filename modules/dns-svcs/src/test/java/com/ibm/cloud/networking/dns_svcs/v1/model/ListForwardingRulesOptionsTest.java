/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.networking.dns_svcs.v1.model.ListForwardingRulesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListForwardingRulesOptions model.
 */
public class ListForwardingRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListForwardingRulesOptions() throws Throwable {
    ListForwardingRulesOptions listForwardingRulesOptionsModel = new ListForwardingRulesOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();
    assertEquals(listForwardingRulesOptionsModel.instanceId(), "testString");
    assertEquals(listForwardingRulesOptionsModel.resolverId(), "testString");
    assertEquals(listForwardingRulesOptionsModel.xCorrelationId(), "testString");
    assertEquals(listForwardingRulesOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(listForwardingRulesOptionsModel.limit(), Long.valueOf("200"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListForwardingRulesOptionsError() throws Throwable {
    new ListForwardingRulesOptions.Builder().build();
  }

}