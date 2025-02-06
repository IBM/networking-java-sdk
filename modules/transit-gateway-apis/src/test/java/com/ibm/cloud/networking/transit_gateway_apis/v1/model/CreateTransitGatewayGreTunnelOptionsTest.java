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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayGreTunnelOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTransitGatewayGreTunnelOptions model.
 */
public class CreateTransitGatewayGreTunnelOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTransitGatewayGreTunnelOptions() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    CreateTransitGatewayGreTunnelOptions createTransitGatewayGreTunnelOptionsModel = new CreateTransitGatewayGreTunnelOptions.Builder()
      .transitGatewayId("testString")
      .id("testString")
      .localGatewayIp("10.242.63.12")
      .localTunnelIp("192.168.100.20")
      .name("gre1")
      .remoteGatewayIp("10.242.33.22")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
      .remoteBgpAsn(Long.valueOf("65010"))
      .build();
    assertEquals(createTransitGatewayGreTunnelOptionsModel.transitGatewayId(), "testString");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.id(), "testString");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.localGatewayIp(), "10.242.63.12");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.localTunnelIp(), "192.168.100.20");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.name(), "gre1");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.remoteGatewayIp(), "10.242.33.22");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(createTransitGatewayGreTunnelOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createTransitGatewayGreTunnelOptionsModel.remoteBgpAsn(), Long.valueOf("65010"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayGreTunnelOptionsError() throws Throwable {
    new CreateTransitGatewayGreTunnelOptions.Builder().build();
  }

}