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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilter;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate;
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

    TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate transitGatewayConnectionTemplateModel = new TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate.Builder()
      .baseConnectionId("975f58c1-afe7-469a-9727-7f3d720f2d32")
      .baseNetworkType("classic")
      .localGatewayIp("192.168.100.1")
      .localTunnelIp("192.168.129.2")
      .name("Transit_Service_BWTN_SJ_DL")
      .networkAccountId("testString")
      .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .networkType("vpc")
      .prefixFilters(java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel))
      .prefixFiltersDefault("permit")
      .remoteBgpAsn(Long.valueOf("65010"))
      .remoteGatewayIp("10.242.63.12")
      .remoteTunnelIp("192.168.129.1")
      .zone(zoneIdentityModel)
      .build();
    assertEquals(transitGatewayConnectionTemplateModel.baseConnectionId(), "975f58c1-afe7-469a-9727-7f3d720f2d32");
    assertEquals(transitGatewayConnectionTemplateModel.baseNetworkType(), "classic");
    assertEquals(transitGatewayConnectionTemplateModel.localGatewayIp(), "192.168.100.1");
    assertEquals(transitGatewayConnectionTemplateModel.localTunnelIp(), "192.168.129.2");
    assertEquals(transitGatewayConnectionTemplateModel.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(transitGatewayConnectionTemplateModel.networkAccountId(), "testString");
    assertEquals(transitGatewayConnectionTemplateModel.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(transitGatewayConnectionTemplateModel.networkType(), "vpc");
    assertEquals(transitGatewayConnectionTemplateModel.prefixFilters(), java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel));
    assertEquals(transitGatewayConnectionTemplateModel.prefixFiltersDefault(), "permit");
    assertEquals(transitGatewayConnectionTemplateModel.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayConnectionTemplateModel.remoteGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayConnectionTemplateModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayConnectionTemplateModel.zone(), zoneIdentityModel);

    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .transitGatewayConnectionTemplate(transitGatewayConnectionTemplateModel)
      .build();
    assertEquals(createTransitGatewayConnectionOptionsModel.transitGatewayId(), "testString");
    assertEquals(createTransitGatewayConnectionOptionsModel.transitGatewayConnectionTemplate(), transitGatewayConnectionTemplateModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionOptionsError() throws Throwable {
    new CreateTransitGatewayConnectionOptions.Builder().build();
  }

}