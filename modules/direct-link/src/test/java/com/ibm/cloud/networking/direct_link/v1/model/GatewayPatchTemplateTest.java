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

import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayPatchTemplate model.
 */
public class GatewayPatchTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayPatchTemplate() throws Throwable {
    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(authenticationKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayBfdPatchTemplate gatewayBfdPatchTemplateModel = new GatewayBfdPatchTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdPatchTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdPatchTemplateModel.multiplier(), Long.valueOf("10"));

    GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
      .authenticationKey(authenticationKeyIdentityModel)
      .bfdConfig(gatewayBfdPatchTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .global(true)
      .loaRejectReason("The port mentioned was incorrect")
      .metered(false)
      .name("testGateway")
      .operationalStatus("loa_accepted")
      .patchPanelCompletionNotice("patch panel configuration details")
      .speedMbps(Long.valueOf("1000"))
      .vlan(Long.valueOf("10"))
      .build();
    assertEquals(gatewayPatchTemplateModel.authenticationKey(), authenticationKeyIdentityModel);
    assertEquals(gatewayPatchTemplateModel.bfdConfig(), gatewayBfdPatchTemplateModel);
    assertEquals(gatewayPatchTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayPatchTemplateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayPatchTemplateModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayPatchTemplateModel.connectionMode(), "transit");
    assertEquals(gatewayPatchTemplateModel.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayPatchTemplateModel.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayPatchTemplateModel.global(), Boolean.valueOf(true));
    assertEquals(gatewayPatchTemplateModel.loaRejectReason(), "The port mentioned was incorrect");
    assertEquals(gatewayPatchTemplateModel.metered(), Boolean.valueOf(false));
    assertEquals(gatewayPatchTemplateModel.name(), "testGateway");
    assertEquals(gatewayPatchTemplateModel.operationalStatus(), "loa_accepted");
    assertEquals(gatewayPatchTemplateModel.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayPatchTemplateModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayPatchTemplateModel.vlan(), Long.valueOf("10"));

    String json = TestUtilities.serialize(gatewayPatchTemplateModel);

    GatewayPatchTemplate gatewayPatchTemplateModelNew = TestUtilities.deserialize(json, GatewayPatchTemplate.class);
    assertTrue(gatewayPatchTemplateModelNew instanceof GatewayPatchTemplate);
    assertEquals(gatewayPatchTemplateModelNew.authenticationKey().toString(), authenticationKeyIdentityModel.toString());
    assertEquals(gatewayPatchTemplateModelNew.bfdConfig().toString(), gatewayBfdPatchTemplateModel.toString());
    assertEquals(gatewayPatchTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayPatchTemplateModelNew.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayPatchTemplateModelNew.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayPatchTemplateModelNew.connectionMode(), "transit");
    assertEquals(gatewayPatchTemplateModelNew.defaultExportRouteFilter(), "permit");
    assertEquals(gatewayPatchTemplateModelNew.defaultImportRouteFilter(), "permit");
    assertEquals(gatewayPatchTemplateModelNew.global(), Boolean.valueOf(true));
    assertEquals(gatewayPatchTemplateModelNew.loaRejectReason(), "The port mentioned was incorrect");
    assertEquals(gatewayPatchTemplateModelNew.metered(), Boolean.valueOf(false));
    assertEquals(gatewayPatchTemplateModelNew.name(), "testGateway");
    assertEquals(gatewayPatchTemplateModelNew.operationalStatus(), "loa_accepted");
    assertEquals(gatewayPatchTemplateModelNew.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(gatewayPatchTemplateModelNew.speedMbps(), Long.valueOf("1000"));
    assertEquals(gatewayPatchTemplateModelNew.vlan(), Long.valueOf("10"));
  }
  @Test
  public void testGatewayPatchTemplateAsPatch() throws Throwable {
    AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity authenticationKeyIdentityModel = new AuthenticationKeyIdentityKeyProtectAuthenticationKeyIdentity.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();

    GatewayBfdPatchTemplate gatewayBfdPatchTemplateModel = new GatewayBfdPatchTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();

    GatewayPatchTemplate gatewayPatchTemplateModel = new GatewayPatchTemplate.Builder()
      .authenticationKey(authenticationKeyIdentityModel)
      .bfdConfig(gatewayBfdPatchTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .global(true)
      .loaRejectReason("The port mentioned was incorrect")
      .metered(false)
      .name("testGateway")
      .operationalStatus("loa_accepted")
      .patchPanelCompletionNotice("patch panel configuration details")
      .speedMbps(Long.valueOf("1000"))
      .vlan(Long.valueOf("10"))
      .build();

    Map<String, Object> mergePatch = gatewayPatchTemplateModel.asPatch();

    assertTrue(mergePatch.containsKey("authentication_key"));
    assertTrue(mergePatch.containsKey("bfd_config"));
    assertTrue(mergePatch.containsKey("bgp_asn"));
    assertEquals(mergePatch.get("bgp_cer_cidr"), "169.254.0.10/30");
    assertEquals(mergePatch.get("bgp_ibm_cidr"), "169.254.0.9/30");
    assertEquals(mergePatch.get("connection_mode"), "transit");
    assertEquals(mergePatch.get("default_export_route_filter"), "permit");
    assertEquals(mergePatch.get("default_import_route_filter"), "permit");
    assertTrue(mergePatch.containsKey("global"));
    assertEquals(mergePatch.get("loa_reject_reason"), "The port mentioned was incorrect");
    assertTrue(mergePatch.containsKey("metered"));
    assertEquals(mergePatch.get("name"), "testGateway");
    assertEquals(mergePatch.get("operational_status"), "loa_accepted");
    assertEquals(mergePatch.get("patch_panel_completion_notice"), "patch panel configuration details");
    assertTrue(mergePatch.containsKey("speed_mbps"));
    assertTrue(mergePatch.containsKey("vlan"));
  }

}