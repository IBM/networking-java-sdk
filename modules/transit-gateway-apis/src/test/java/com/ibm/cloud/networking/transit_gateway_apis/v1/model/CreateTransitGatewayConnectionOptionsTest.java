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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilter;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayTunnelTemplate;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneIdentityByName;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTransitGatewayConnectionOptions model.
 */
public class CreateTransitGatewayConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTransitGatewayConnectionOptions() throws Throwable {
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

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    TransitGatewayTunnelTemplate transitGatewayTunnelTemplateModel = new TransitGatewayTunnelTemplate.Builder()
      .localGatewayIp("10.242.63.12")
      .localTunnelIp("192.168.100.20")
      .name("gre1")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.33.22")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
      .build();
    assertEquals(transitGatewayTunnelTemplateModel.localGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayTunnelTemplateModel.localTunnelIp(), "192.168.100.20");
    assertEquals(transitGatewayTunnelTemplateModel.name(), "gre1");
    assertEquals(transitGatewayTunnelTemplateModel.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayTunnelTemplateModel.remoteGatewayIp(), "10.242.33.22");
    assertEquals(transitGatewayTunnelTemplateModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayTunnelTemplateModel.zone(), zoneIdentityModel);

    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .networkType("vpc")
      .baseConnectionId("975f58c1-afe7-469a-9727-7f3d720f2d32")
      .baseNetworkType("classic")
      .cidr("192.168.0.0/24")
      .localGatewayIp("192.168.100.1")
      .localTunnelIp("192.168.129.2")
      .name("Transit_Service_BWTN_SJ_DL")
      .networkAccountId("testString")
      .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .prefixFilters(java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel))
      .prefixFiltersDefault("permit")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.63.12")
      .remoteTunnelIp("192.168.129.1")
      .tunnels(java.util.Arrays.asList(transitGatewayTunnelTemplateModel))
      .zone(zoneIdentityModel)
      .build();
    assertEquals(createTransitGatewayConnectionOptionsModel.transitGatewayId(), "testString");
    assertEquals(createTransitGatewayConnectionOptionsModel.networkType(), "vpc");
    assertEquals(createTransitGatewayConnectionOptionsModel.baseConnectionId(), "975f58c1-afe7-469a-9727-7f3d720f2d32");
    assertEquals(createTransitGatewayConnectionOptionsModel.baseNetworkType(), "classic");
    assertEquals(createTransitGatewayConnectionOptionsModel.cidr(), "192.168.0.0/24");
    assertEquals(createTransitGatewayConnectionOptionsModel.localGatewayIp(), "192.168.100.1");
    assertEquals(createTransitGatewayConnectionOptionsModel.localTunnelIp(), "192.168.129.2");
    assertEquals(createTransitGatewayConnectionOptionsModel.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(createTransitGatewayConnectionOptionsModel.networkAccountId(), "testString");
    assertEquals(createTransitGatewayConnectionOptionsModel.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(createTransitGatewayConnectionOptionsModel.prefixFilters(), java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel));
    assertEquals(createTransitGatewayConnectionOptionsModel.prefixFiltersDefault(), "permit");
    assertEquals(createTransitGatewayConnectionOptionsModel.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(createTransitGatewayConnectionOptionsModel.remoteGatewayIp(), "10.242.63.12");
    assertEquals(createTransitGatewayConnectionOptionsModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(createTransitGatewayConnectionOptionsModel.tunnels(), java.util.Arrays.asList(transitGatewayTunnelTemplateModel));
    assertEquals(createTransitGatewayConnectionOptionsModel.zone(), zoneIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionOptionsError() throws Throwable {
    new CreateTransitGatewayConnectionOptions.Builder().build();
  }

}