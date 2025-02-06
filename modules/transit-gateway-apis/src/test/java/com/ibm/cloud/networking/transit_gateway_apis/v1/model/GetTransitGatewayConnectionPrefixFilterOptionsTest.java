/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GetTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetTransitGatewayConnectionPrefixFilterOptions model.
 */
public class GetTransitGatewayConnectionPrefixFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetTransitGatewayConnectionPrefixFilterOptions() throws Throwable {
    GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptionsModel = new GetTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .filterId("testString")
      .build();
    assertEquals(getTransitGatewayConnectionPrefixFilterOptionsModel.transitGatewayId(), "testString");
    assertEquals(getTransitGatewayConnectionPrefixFilterOptionsModel.id(), "testString");
    assertEquals(getTransitGatewayConnectionPrefixFilterOptionsModel.filterId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTransitGatewayConnectionPrefixFilterOptionsError() throws Throwable {
    new GetTransitGatewayConnectionPrefixFilterOptions.Builder().build();
  }

}