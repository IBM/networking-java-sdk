/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplateFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPatchTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.UpdateGatewayOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateGatewayOptions model.
 */
public class UpdateGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateGatewayOptions() throws Throwable {
    GatewayPatchTemplateAuthenticationKey gatewayPatchTemplateAuthenticationKeyModel = new GatewayPatchTemplateAuthenticationKey.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
      .build();
    assertEquals(gatewayPatchTemplateAuthenticationKeyModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c");

    GatewayBfdPatchTemplate gatewayBfdPatchTemplateModel = new GatewayBfdPatchTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdPatchTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdPatchTemplateModel.multiplier(), Long.valueOf("10"));

    GatewayMacsecConfigPatchTemplateFallbackCak gatewayMacsecConfigPatchTemplateFallbackCakModel = new GatewayMacsecConfigPatchTemplateFallbackCak.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(gatewayMacsecConfigPatchTemplateFallbackCakModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecConfigPatchTemplatePrimaryCak gatewayMacsecConfigPatchTemplatePrimaryCakModel = new GatewayMacsecConfigPatchTemplatePrimaryCak.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(gatewayMacsecConfigPatchTemplatePrimaryCakModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    GatewayMacsecConfigPatchTemplate gatewayMacsecConfigPatchTemplateModel = new GatewayMacsecConfigPatchTemplate.Builder()
      .active(true)
      .fallbackCak(gatewayMacsecConfigPatchTemplateFallbackCakModel)
      .primaryCak(gatewayMacsecConfigPatchTemplatePrimaryCakModel)
      .windowSize(Long.valueOf("512"))
      .build();
    assertEquals(gatewayMacsecConfigPatchTemplateModel.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecConfigPatchTemplateModel.fallbackCak(), gatewayMacsecConfigPatchTemplateFallbackCakModel);
    assertEquals(gatewayMacsecConfigPatchTemplateModel.primaryCak(), gatewayMacsecConfigPatchTemplatePrimaryCakModel);
    assertEquals(gatewayMacsecConfigPatchTemplateModel.windowSize(), Long.valueOf("512"));

    UpdateGatewayOptions updateGatewayOptionsModel = new UpdateGatewayOptions.Builder()
      .id("testString")
      .authenticationKey(gatewayPatchTemplateAuthenticationKeyModel)
      .bfdConfig(gatewayBfdPatchTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .global(true)
      .loaRejectReason("The port mentioned was incorrect")
      .macsecConfig(gatewayMacsecConfigPatchTemplateModel)
      .metered(false)
      .name("testGateway")
      .operationalStatus("loa_accepted")
      .patchPanelCompletionNotice("patch panel configuration details")
      .speedMbps(Long.valueOf("1000"))
      .build();
    assertEquals(updateGatewayOptionsModel.id(), "testString");
    assertEquals(updateGatewayOptionsModel.authenticationKey(), gatewayPatchTemplateAuthenticationKeyModel);
    assertEquals(updateGatewayOptionsModel.bfdConfig(), gatewayBfdPatchTemplateModel);
    assertEquals(updateGatewayOptionsModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(updateGatewayOptionsModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(updateGatewayOptionsModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(updateGatewayOptionsModel.connectionMode(), "transit");
    assertEquals(updateGatewayOptionsModel.global(), Boolean.valueOf(true));
    assertEquals(updateGatewayOptionsModel.loaRejectReason(), "The port mentioned was incorrect");
    assertEquals(updateGatewayOptionsModel.macsecConfig(), gatewayMacsecConfigPatchTemplateModel);
    assertEquals(updateGatewayOptionsModel.metered(), Boolean.valueOf(false));
    assertEquals(updateGatewayOptionsModel.name(), "testGateway");
    assertEquals(updateGatewayOptionsModel.operationalStatus(), "loa_accepted");
    assertEquals(updateGatewayOptionsModel.patchPanelCompletionNotice(), "patch panel configuration details");
    assertEquals(updateGatewayOptionsModel.speedMbps(), Long.valueOf("1000"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateGatewayOptionsError() throws Throwable {
    new UpdateGatewayOptions.Builder().build();
  }

}