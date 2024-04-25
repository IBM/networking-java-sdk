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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate;
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
 * Unit test class for the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate model.
 */
public class TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate() throws Throwable {
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

    TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel = new TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate.Builder()
      .baseNetworkType("vpc")
      .name("Transit_Service_BWTN_SJ_DL")
      .networkAccountId("testString")
      .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .networkType("redundant_gre")
      .tunnels(java.util.Arrays.asList(transitGatewayRedundantGreTunnelTemplateModel))
      .build();
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.baseNetworkType(), "vpc");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.networkAccountId(), "testString");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.networkType(), "redundant_gre");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel.tunnels(), java.util.Arrays.asList(transitGatewayRedundantGreTunnelTemplateModel));

    String json = TestUtilities.serialize(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModel);

    TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew = TestUtilities.deserialize(json, TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate.class);
    assertTrue(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew instanceof TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate);
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew.baseNetworkType(), "vpc");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew.networkAccountId(), "testString");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplateModelNew.networkType(), "redundant_gre");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplateError() throws Throwable {
    new TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate.Builder().build();
  }

}