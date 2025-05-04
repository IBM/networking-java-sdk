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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.HpcsKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
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

    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(authenticationKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

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

    HpcsKeyIdentity hpcsKeyIdentityModel = new HpcsKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(hpcsKeyIdentityModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
      .key(hpcsKeyIdentityModel)
      .name("1000")
      .session("primary")
      .build();
    assertEquals(gatewayMacsecCakPrototypeModel.key(), hpcsKeyIdentityModel);
    assertEquals(gatewayMacsecCakPrototypeModel.name(), "1000");
    assertEquals(gatewayMacsecCakPrototypeModel.session(), "primary");

    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();
    assertEquals(sakRekeyPrototypeModel.interval(), Long.valueOf("3600"));
    assertEquals(sakRekeyPrototypeModel.mode(), "timer");

    GatewayMacsecPrototype gatewayMacsecPrototypeModel = new GatewayMacsecPrototype.Builder()
      .active(true)
      .caks(java.util.Arrays.asList(gatewayMacsecCakPrototypeModel))
      .sakRekey(sakRekeyPrototypeModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();
    assertEquals(gatewayMacsecPrototypeModel.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecPrototypeModel.caks(), java.util.Arrays.asList(gatewayMacsecCakPrototypeModel));
    assertEquals(gatewayMacsecPrototypeModel.sakRekey(), sakRekeyPrototypeModel);
    assertEquals(gatewayMacsecPrototypeModel.securityPolicy(), "must_secure");
    assertEquals(gatewayMacsecPrototypeModel.windowSize(), Long.valueOf("64"));

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
      .asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
      .authenticationKey(authenticationKeyIdentityModel)
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
      .macsec(gatewayMacsecPrototypeModel)
      .macsecCapability("non_macsec")
      .vlan(Long.valueOf("10"))
      .build();
    assertEquals(gatewayTemplateModel.asPrepends(), java.util.Arrays.asList(asPrependTemplateModel));
    assertEquals(gatewayTemplateModel.authenticationKey(), authenticationKeyIdentityModel);
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
    assertEquals(gatewayTemplateModel.macsec(), gatewayMacsecPrototypeModel);
    assertEquals(gatewayTemplateModel.macsecCapability(), "non_macsec");
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