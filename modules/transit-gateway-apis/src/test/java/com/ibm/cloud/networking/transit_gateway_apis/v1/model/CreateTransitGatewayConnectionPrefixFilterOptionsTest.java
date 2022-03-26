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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionPrefixFilterOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTransitGatewayConnectionPrefixFilterOptions model.
 */
public class CreateTransitGatewayConnectionPrefixFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTransitGatewayConnectionPrefixFilterOptions() throws Throwable {
    CreateTransitGatewayConnectionPrefixFilterOptions createTransitGatewayConnectionPrefixFilterOptionsModel = new CreateTransitGatewayConnectionPrefixFilterOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .action("permit")
      .prefix("192.168.100.0/24")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("0"))
      .le(Long.valueOf("32"))
      .build();
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.transitGatewayId(), "testString");
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.id(), "testString");
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.action(), "permit");
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.prefix(), "192.168.100.0/24");
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.before(), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.ge(), Long.valueOf("0"));
    assertEquals(createTransitGatewayConnectionPrefixFilterOptionsModel.le(), Long.valueOf("32"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionPrefixFilterOptionsError() throws Throwable {
    new CreateTransitGatewayConnectionPrefixFilterOptions.Builder().build();
  }

}