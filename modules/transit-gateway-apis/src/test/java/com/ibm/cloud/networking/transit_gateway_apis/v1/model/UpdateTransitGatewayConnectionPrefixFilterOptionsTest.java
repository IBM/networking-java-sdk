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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.UpdateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateTransitGatewayConnectionPrefixFilterOptions model.
 */
public class UpdateTransitGatewayConnectionPrefixFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTransitGatewayConnectionPrefixFilterOptions() throws Throwable {
    UpdateTransitGatewayConnectionPrefixFilterOptions updateTransitGatewayConnectionPrefixFilterOptionsModel = new UpdateTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .filterId("testString")
      .action("permit")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("0"))
      .le(Long.valueOf("32"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.transitGatewayId(), "testString");
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.id(), "testString");
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.filterId(), "testString");
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.action(), "permit");
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.before(), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.ge(), Long.valueOf("0"));
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.le(), Long.valueOf("32"));
    assertEquals(updateTransitGatewayConnectionPrefixFilterOptionsModel.prefix(), "192.168.100.0/24");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTransitGatewayConnectionPrefixFilterOptionsError() throws Throwable {
    new UpdateTransitGatewayConnectionPrefixFilterOptions.Builder().build();
  }

}