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
import com.ibm.cloud.networking.dns_svcs.v1.model.ListXfrRulesOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListXfrRulesOptions model.
 */
public class ListXfrRulesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListXfrRulesOptions() throws Throwable {
    ListXfrRulesOptions listXfrRulesOptionsModel = new ListXfrRulesOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .xCorrelationId("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();
    assertEquals(listXfrRulesOptionsModel.instanceId(), "testString");
    assertEquals(listXfrRulesOptionsModel.resolverId(), "testString");
    assertEquals(listXfrRulesOptionsModel.xCorrelationId(), "testString");
    assertEquals(listXfrRulesOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(listXfrRulesOptionsModel.limit(), Long.valueOf("200"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListXfrRulesOptionsError() throws Throwable {
    new ListXfrRulesOptions.Builder().build();
  }

}