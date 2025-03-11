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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilter;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGatewayConnectionPrefixFilter model.
 */
public class TransitGatewayConnectionPrefixFilterTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnectionPrefixFilter() throws Throwable {
    TransitGatewayConnectionPrefixFilter transitGatewayConnectionPrefixFilterModel = new TransitGatewayConnectionPrefixFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("0"))
      .le(Long.valueOf("32"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(transitGatewayConnectionPrefixFilterModel.action(), "permit");
    assertEquals(transitGatewayConnectionPrefixFilterModel.ge(), Long.valueOf("0"));
    assertEquals(transitGatewayConnectionPrefixFilterModel.le(), Long.valueOf("32"));
    assertEquals(transitGatewayConnectionPrefixFilterModel.prefix(), "192.168.100.0/24");

    String json = TestUtilities.serialize(transitGatewayConnectionPrefixFilterModel);

    TransitGatewayConnectionPrefixFilter transitGatewayConnectionPrefixFilterModelNew = TestUtilities.deserialize(json, TransitGatewayConnectionPrefixFilter.class);
    assertTrue(transitGatewayConnectionPrefixFilterModelNew instanceof TransitGatewayConnectionPrefixFilter);
    assertEquals(transitGatewayConnectionPrefixFilterModelNew.action(), "permit");
    assertEquals(transitGatewayConnectionPrefixFilterModelNew.ge(), Long.valueOf("0"));
    assertEquals(transitGatewayConnectionPrefixFilterModelNew.le(), Long.valueOf("32"));
    assertEquals(transitGatewayConnectionPrefixFilterModelNew.prefix(), "192.168.100.0/24");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTransitGatewayConnectionPrefixFilterError() throws Throwable {
    new TransitGatewayConnectionPrefixFilter.Builder().build();
  }

}