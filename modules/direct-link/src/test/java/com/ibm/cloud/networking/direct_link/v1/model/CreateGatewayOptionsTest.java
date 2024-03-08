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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplateFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
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
    AsPrependTemplate asPrependTemplateModel = new AsPrependTemplate.Builder()
      .length(Long.valueOf("4"))
      .policy("import")
      .prefix("172.17.0.0/16")
      .specificPrefixes(java.util.Arrays.asList("192.168.3.0/24"))
      .build();
    assertEquals(asPrependTemplateModel.length(), Long.valueOf("4"));
    assertEquals(asPrependTemplateModel.policy(), "import");
    assertEquals(asPrependTemplateModel.prefix(), "172.17.0.0/16");
    assertEquals(asPrependTemplateModel.specificPrefixes(), java.util.Arrays.asList("192.168.3.0/24"));

    GatewayTemplateAuthenticationKey gatewayTemplateAuthenticationKeyModel = new GatewayTemplateAuthenticationKey.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
      .build();
    assertEquals(gatewayTemplateAuthenticationKeyModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c");

    GatewayBfdConfigTemplate gatewayBfdConfigTemplateModel = new GatewayBfdConfigTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdConfigTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigTemplateModel.multiplier(), Long.valueOf("10"));

    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(gatewayTemplateRouteFilterModel.action(), "permit");
    assertEquals(gatewayTemplateRouteFilterModel.ge(), Long.valueOf("25"));
    assertEquals(gatewayTemplateRouteFilterModel.le(), Long.valueOf("30"));
    assertEquals(gatewayTemplateRouteFilterModel.prefix(), "192.168.100.0/24");

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

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

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
      .asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
      .authenticationKey(gatewayTemplateAuthenticationKeyModel)
      .bfdConfig(gatewayBfdConfigTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpBaseCidr("testString")
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .global(true)
      .importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .metered(false)
      .name("myGateway")
      .patchPanelCompletionNotice("patch panel configuration details")
      .resourceGroup(resourceGroupIdentityModel)
      .speedMbps(Long.valueOf("1000"))
      .type("dedicated")
      .carrierName("myCarrierName")
      .crossConnectRouter("xcr01.dal03")
      .customerName("newCustomerName")
      .locationName("dal03")
      .macsecConfig(gatewayMacsecConfigTemplateModel)
      .vlan(Long.valueOf("10"))
      .build();
    assertEquals(gatewayTemplateModel.asPrepends(), java.util.Arrays.asList(asPrependTemplateModel));
    assertEquals(gatewayTemplateModel.authenticationKey(), gatewayTemplateAuthenticationKeyModel);
    assertEquals(gatewayTemplateModel.bfdConfig(), gatewayBfdConfigTemplateModel);
    assertEquals(gatewayTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateModel.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateModel.connectionMode(), "transit");
    assertEquals(gatewayTemplateModel.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayTemplateModel.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayTemplateModel.exportRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateModel.importRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateModel.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateModel.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateModel.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateModel.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateModel.locationName(), "dal03");
    assertEquals(gatewayTemplateModel.macsecConfig(), gatewayMacsecConfigTemplateModel);
    assertEquals(gatewayTemplateModel.vlan(), Long.valueOf("10"));

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