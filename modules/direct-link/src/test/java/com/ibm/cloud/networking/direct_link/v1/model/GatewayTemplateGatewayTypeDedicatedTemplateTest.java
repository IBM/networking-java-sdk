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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplateFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayTemplateGatewayTypeDedicatedTemplate model.
 */
public class GatewayTemplateGatewayTypeDedicatedTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayTemplateGatewayTypeDedicatedTemplate() throws Throwable {
    GatewayMacsecConfigTemplateFallbackCak gatewayMacsecConfigTemplateFallbackCakModel = new GatewayMacsecConfigTemplateFallbackCak.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(gatewayMacsecConfigTemplateFallbackCakModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecConfigTemplatePrimaryCak gatewayMacsecConfigTemplatePrimaryCakModel = new GatewayMacsecConfigTemplatePrimaryCak.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(gatewayMacsecConfigTemplatePrimaryCakModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecConfigTemplate gatewayMacsecConfigTemplateModel = new GatewayMacsecConfigTemplate.Builder()
      .active(true)
      .fallbackCak(gatewayMacsecConfigTemplateFallbackCakModel)
      .primaryCak(gatewayMacsecConfigTemplatePrimaryCakModel)
      .windowSize(Long.valueOf("148809600"))
      .build();
    assertEquals(gatewayMacsecConfigTemplateModel.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecConfigTemplateModel.fallbackCak(), gatewayMacsecConfigTemplateFallbackCakModel);
    assertEquals(gatewayMacsecConfigTemplateModel.primaryCak(), gatewayMacsecConfigTemplatePrimaryCakModel);
    assertEquals(gatewayMacsecConfigTemplateModel.windowSize(), Long.valueOf("148809600"));

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateGatewayTypeDedicatedTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
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
      .locationName("dal03")
      .macsecConfig(gatewayMacsecConfigTemplateModel)
      .build();
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpBaseCidr(), "10.254.30.76/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.locationName(), "dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.macsecConfig(), gatewayMacsecConfigTemplateModel);

    String json = TestUtilities.serialize(gatewayTemplateGatewayTypeDedicatedTemplateModel);

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateGatewayTypeDedicatedTemplateModelNew = TestUtilities.deserialize(json, GatewayTemplateGatewayTypeDedicatedTemplate.class);
    assertTrue(gatewayTemplateGatewayTypeDedicatedTemplateModelNew instanceof GatewayTemplateGatewayTypeDedicatedTemplate);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpBaseCidr(), "10.254.30.76/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.locationName(), "dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.macsecConfig().toString(), gatewayMacsecConfigTemplateModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayTemplateGatewayTypeDedicatedTemplateError() throws Throwable {
    new GatewayTemplateGatewayTypeDedicatedTemplate.Builder().build();
  }

}