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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayRedundantGRETunnelTemplate;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGatewayRedundantGRETunnelTemplate model.
 */
public class TransitGatewayRedundantGRETunnelTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayRedundantGRETunnelTemplate() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    TransitGatewayRedundantGRETunnelTemplate transitGatewayRedundantGreTunnelTemplateModel = new TransitGatewayRedundantGRETunnelTemplate.Builder()
      .localGatewayIp("10.242.63.12")
      .localTunnelIp("192.168.100.20")
      .name("gre1")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.33.22")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
      .build();
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.localGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.localTunnelIp(), "192.168.100.20");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.name(), "gre1");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.remoteGatewayIp(), "10.242.33.22");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(transitGatewayRedundantGreTunnelTemplateModel);

    TransitGatewayRedundantGRETunnelTemplate transitGatewayRedundantGreTunnelTemplateModelNew = TestUtilities.deserialize(json, TransitGatewayRedundantGRETunnelTemplate.class);
    assertTrue(transitGatewayRedundantGreTunnelTemplateModelNew instanceof TransitGatewayRedundantGRETunnelTemplate);
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.localGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.localTunnelIp(), "192.168.100.20");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.name(), "gre1");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.remoteGatewayIp(), "10.242.33.22");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayRedundantGreTunnelTemplateModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTransitGatewayRedundantGRETunnelTemplateError() throws Throwable {
    new TransitGatewayRedundantGRETunnelTemplate.Builder().build();
  }

}