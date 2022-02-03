/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPatchTemplatePrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayMacsecConfigPatchTemplatePrimaryCak model.
 */
public class GatewayMacsecConfigPatchTemplatePrimaryCakTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayMacsecConfigPatchTemplatePrimaryCak() throws Throwable {
    GatewayMacsecConfigPatchTemplatePrimaryCak gatewayMacsecConfigPatchTemplatePrimaryCakModel = new GatewayMacsecConfigPatchTemplatePrimaryCak.Builder()
      .crn("crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222")
      .build();
    assertEquals(gatewayMacsecConfigPatchTemplatePrimaryCakModel.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");

    String json = TestUtilities.serialize(gatewayMacsecConfigPatchTemplatePrimaryCakModel);

    GatewayMacsecConfigPatchTemplatePrimaryCak gatewayMacsecConfigPatchTemplatePrimaryCakModelNew = TestUtilities.deserialize(json, GatewayMacsecConfigPatchTemplatePrimaryCak.class);
    assertTrue(gatewayMacsecConfigPatchTemplatePrimaryCakModelNew instanceof GatewayMacsecConfigPatchTemplatePrimaryCak);
    assertEquals(gatewayMacsecConfigPatchTemplatePrimaryCakModelNew.crn(), "crn:v1:bluemix:public:hs-crypto:us-south:a/4111d05f36894e3cb9b46a43556d9000:abc111b8-37aa-4034-9def-f2607c87aaaa:key:bbb222bc-430a-4de9-9aad-84e5bb022222");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayMacsecConfigPatchTemplatePrimaryCakError() throws Throwable {
    new GatewayMacsecConfigPatchTemplatePrimaryCak.Builder().build();
  }

}