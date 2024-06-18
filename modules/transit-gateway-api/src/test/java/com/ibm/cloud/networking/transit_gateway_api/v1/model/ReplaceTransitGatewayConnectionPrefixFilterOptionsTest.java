/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.networking.transit_gateway_api.v1.model;

import com.ibm.cloud.networking.transit_gateway_api.v1.model.PrefixFilterPut;
import com.ibm.cloud.networking.transit_gateway_api.v1.model.ReplaceTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceTransitGatewayConnectionPrefixFilterOptions model.
 */
public class ReplaceTransitGatewayConnectionPrefixFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceTransitGatewayConnectionPrefixFilterOptions() throws Throwable {
    PrefixFilterPut prefixFilterPutModel = new PrefixFilterPut.Builder()
      .action("permit")
      .ge(Long.valueOf("0"))
      .le(Long.valueOf("32"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(prefixFilterPutModel.action(), "permit");
    assertEquals(prefixFilterPutModel.ge(), Long.valueOf("0"));
    assertEquals(prefixFilterPutModel.le(), Long.valueOf("32"));
    assertEquals(prefixFilterPutModel.prefix(), "192.168.100.0/24");

    ReplaceTransitGatewayConnectionPrefixFilterOptions replaceTransitGatewayConnectionPrefixFilterOptionsModel = new ReplaceTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .prefixFilters(java.util.Arrays.asList(prefixFilterPutModel))
      .build();
    assertEquals(replaceTransitGatewayConnectionPrefixFilterOptionsModel.transitGatewayId(), "testString");
    assertEquals(replaceTransitGatewayConnectionPrefixFilterOptionsModel.id(), "testString");
    assertEquals(replaceTransitGatewayConnectionPrefixFilterOptionsModel.prefixFilters(), java.util.Arrays.asList(prefixFilterPutModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTransitGatewayConnectionPrefixFilterOptionsError() throws Throwable {
    new ReplaceTransitGatewayConnectionPrefixFilterOptions.Builder().build();
  }

}