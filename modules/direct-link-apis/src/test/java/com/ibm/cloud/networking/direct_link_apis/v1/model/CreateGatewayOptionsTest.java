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

package com.ibm.cloud.networking.direct_link_apis.v1.model;

import com.ibm.cloud.networking.direct_link_apis.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link_apis.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link_apis.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateGatewayOptions model.
 */
public class CreateGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateGatewayOptions() throws Throwable {
    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
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
      .carrierName("myCarrierName")
      .crossConnectRouter("xcr01.dal03")
      .customerName("newCustomerName")
      .dedicatedHostingId("ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4")
      .locationName("dal03")
      .build();
    assertEquals(gatewayTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateModel.bgpBaseCidr(), "10.254.30.76/30");
    assertEquals(gatewayTemplateModel.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(gatewayTemplateModel.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(gatewayTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateModel.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateModel.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateModel.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateModel.dedicatedHostingId(), "ef4dcb1a-fee4-41c7-9e11-9cd99e65c1f4");
    assertEquals(gatewayTemplateModel.locationName(), "dal03");

    CreateGatewayOptions createGatewayOptionsModel = new CreateGatewayOptions.Builder()
      .gatewayTemplate(gatewayTemplateModel)
      .build();
    assertEquals(createGatewayOptionsModel.gatewayTemplate(), gatewayTemplateModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayOptionsError() throws Throwable {
    new CreateGatewayOptions.Builder().build();
  }

}