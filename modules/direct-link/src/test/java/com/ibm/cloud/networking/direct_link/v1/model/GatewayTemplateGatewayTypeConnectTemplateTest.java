/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayTemplateGatewayTypeConnectTemplate model.
 */
public class GatewayTemplateGatewayTypeConnectTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayTemplateGatewayTypeConnectTemplate() throws Throwable {
    GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(gatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateGatewayTypeConnectTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
      .bgpAsn(Long.valueOf("64999"))
      .bgpBaseCidr("10.254.30.76/30")
      .bgpCerCidr("10.254.30.78/30")
      .bgpIbmCidr("10.254.30.77/30")
      .global(true)
      .metered(false)
      .name("myGateway")
      .resourceGroup(resourceGroupIdentityModel)
      .speedMbps(Long.valueOf("1000"))
      .type("dedicated")
      .port(gatewayPortIdentityModel)
      .build();
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpBaseCidr(), "10.254.30.76/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.port(), gatewayPortIdentityModel);

    String json = TestUtilities.serialize(gatewayTemplateGatewayTypeConnectTemplateModel);

    GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateGatewayTypeConnectTemplateModelNew = TestUtilities.deserialize(json, GatewayTemplateGatewayTypeConnectTemplate.class);
    assertTrue(gatewayTemplateGatewayTypeConnectTemplateModelNew instanceof GatewayTemplateGatewayTypeConnectTemplate);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpBaseCidr(), "10.254.30.76/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.port().toString(), gatewayPortIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayTemplateGatewayTypeConnectTemplateError() throws Throwable {
    new GatewayTemplateGatewayTypeConnectTemplate.Builder().build();
  }

}