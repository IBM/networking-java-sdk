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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependPrefixArrayTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayAsPrependsOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceGatewayAsPrependsOptions model.
 */
public class ReplaceGatewayAsPrependsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceGatewayAsPrependsOptions() throws Throwable {
    AsPrependPrefixArrayTemplate asPrependPrefixArrayTemplateModel = new AsPrependPrefixArrayTemplate.Builder()
      .length(Long.valueOf("4"))
      .policy("import")
      .specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
      .build();
    assertEquals(asPrependPrefixArrayTemplateModel.length(), Long.valueOf("4"));
    assertEquals(asPrependPrefixArrayTemplateModel.policy(), "import");
    assertEquals(asPrependPrefixArrayTemplateModel.specificPrefixes(), java.util.Arrays.asList("192.168.3.0/24"));

    ReplaceGatewayAsPrependsOptions replaceGatewayAsPrependsOptionsModel = new ReplaceGatewayAsPrependsOptions.Builder()
      .gatewayId("testString")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .asPrepends(java.util.Arrays.asList(asPrependPrefixArrayTemplateModel))
      .build();
    assertEquals(replaceGatewayAsPrependsOptionsModel.gatewayId(), "testString");
    assertEquals(replaceGatewayAsPrependsOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
    assertEquals(replaceGatewayAsPrependsOptionsModel.asPrepends(), java.util.Arrays.asList(asPrependPrefixArrayTemplateModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceGatewayAsPrependsOptionsError() throws Throwable {
    new ReplaceGatewayAsPrependsOptions.Builder().build();
  }

}