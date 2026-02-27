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
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPrototype;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeDedicatedTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecCakKeyReferenceHpcsCakKeyReference;
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
 * Unit test class for the GatewayTemplateGatewayTypeDedicatedTemplate model.
 */
public class GatewayTemplateGatewayTypeDedicatedTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayTemplateGatewayTypeDedicatedTemplate() throws Throwable {
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

    GatewayMacsecCakKeyReferenceHpcsCakKeyReference hpcsCakKeyReferenceModel = new GatewayMacsecCakKeyReferenceHpcsCakKeyReference.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(hpcsCakKeyReferenceModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecCakPrototype gatewayMacsecCakPrototypeModel = new GatewayMacsecCakPrototype.Builder()
      .key(hpcsCakKeyReferenceModel)
      .name("1000")
      .session("primary")
      .build();
    assertEquals(gatewayMacsecCakPrototypeModel.key(), hpcsCakKeyReferenceModel);
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

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateGatewayTypeDedicatedTemplateModel = new GatewayTemplateGatewayTypeDedicatedTemplate.Builder()
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
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.asPrepends(), java.util.Arrays.asList(asPrependTemplateModel));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.authenticationKey(), authenticationKeyIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bfdConfig(), gatewayBfdConfigTemplateModel);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.connectionMode(), "transit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.exportRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.importRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.locationName(), "dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.macsec(), gatewayMacsecPrototypeModel);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.macsecCapability(), "non_macsec");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModel.vlan(), Long.valueOf("10"));

    String json = TestUtilities.serialize(gatewayTemplateGatewayTypeDedicatedTemplateModel);

    GatewayTemplateGatewayTypeDedicatedTemplate gatewayTemplateGatewayTypeDedicatedTemplateModelNew = TestUtilities.deserialize(json, GatewayTemplateGatewayTypeDedicatedTemplate.class);
    assertTrue(gatewayTemplateGatewayTypeDedicatedTemplateModelNew instanceof GatewayTemplateGatewayTypeDedicatedTemplate);
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.authenticationKey().toString(), authenticationKeyIdentityModel.toString());
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bfdConfig().toString(), gatewayBfdConfigTemplateModel.toString());
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.connectionMode(), "transit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.carrierName(), "myCarrierName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.crossConnectRouter(), "xcr01.dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.customerName(), "newCustomerName");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.locationName(), "dal03");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.macsec().toString(), gatewayMacsecPrototypeModel.toString());
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.macsecCapability(), "non_macsec");
    assertEquals(gatewayTemplateGatewayTypeDedicatedTemplateModelNew.vlan(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayTemplateGatewayTypeDedicatedTemplateError() throws Throwable {
    new GatewayTemplateGatewayTypeDedicatedTemplate.Builder().build();
  }

}