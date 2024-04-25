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
 * Unit test class for the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate model.
 */
public class TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate() throws Throwable {
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

    TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel = new TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate.Builder()
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
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.baseConnectionId(), "975f58c1-afe7-469a-9727-7f3d720f2d32");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.baseNetworkType(), "classic");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.localGatewayIp(), "192.168.100.1");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.localTunnelIp(), "192.168.129.2");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.networkAccountId(), "testString");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.networkType(), "vpc");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.prefixFilters(), java.util.Arrays.asList(transitGatewayConnectionPrefixFilterModel));
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.prefixFiltersDefault(), "permit");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.remoteGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModel);

    TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew = TestUtilities.deserialize(json, TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate.class);
    assertTrue(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew instanceof TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate);
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.baseConnectionId(), "975f58c1-afe7-469a-9727-7f3d720f2d32");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.baseNetworkType(), "classic");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.localGatewayIp(), "192.168.100.1");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.localTunnelIp(), "192.168.129.2");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.networkAccountId(), "testString");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.networkType(), "vpc");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.prefixFiltersDefault(), "permit");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.remoteBgpAsn(), Long.valueOf("65010"));
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.remoteGatewayIp(), "10.242.63.12");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.remoteTunnelIp(), "192.168.129.1");
    assertEquals(transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplateModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplateError() throws Throwable {
    new TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate.Builder().build();
  }

}