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
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplate;
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
 * Unit test class for the GatewayTemplateGatewayTypeConnectTemplate model.
 */
public class GatewayTemplateGatewayTypeConnectTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayTemplateGatewayTypeConnectTemplate() throws Throwable {
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

    GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(gatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateGatewayTypeConnectTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
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
      .port(gatewayPortIdentityModel)
      .build();
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.asPrepends(), java.util.Arrays.asList(asPrependTemplateModel));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.authenticationKey(), authenticationKeyIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bfdConfig(), gatewayBfdConfigTemplateModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.connectionMode(), "transit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.exportRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.importRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.type(), "dedicated");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.port(), gatewayPortIdentityModel);

    String json = TestUtilities.serialize(gatewayTemplateGatewayTypeConnectTemplateModel);

    GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateGatewayTypeConnectTemplateModelNew = TestUtilities.deserialize(json, GatewayTemplateGatewayTypeConnectTemplate.class);
    assertTrue(gatewayTemplateGatewayTypeConnectTemplateModelNew instanceof GatewayTemplateGatewayTypeConnectTemplate);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.authenticationKey().toString(), authenticationKeyIdentityModel.toString());
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bfdConfig().toString(), gatewayBfdConfigTemplateModel.toString());
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.connectionMode(), "transit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.global(), Boolean.valueOf(true));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.metered(), Boolean.valueOf(false));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.name(), "myGateway");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.patchPanelCompletionNotice(), "patch panel configuration details");
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