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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateAuthenticationKey;
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

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(gatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    GatewayTemplateGatewayTypeConnectTemplate gatewayTemplateGatewayTypeConnectTemplateModel = new GatewayTemplateGatewayTypeConnectTemplate.Builder()
      .authenticationKey(gatewayTemplateAuthenticationKeyModel)
      .bfdConfig(gatewayBfdConfigTemplateModel)
      .bgpAsn(Long.valueOf("64999"))
      .bgpBaseCidr("testString")
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .connectionMode("transit")
      .global(true)
      .metered(false)
      .name("myGateway")
      .patchPanelCompletionNotice("patch panel configuration details")
      .resourceGroup(resourceGroupIdentityModel)
      .speedMbps(Long.valueOf("1000"))
      .type("dedicated")
      .port(gatewayPortIdentityModel)
      .build();
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.authenticationKey(), gatewayTemplateAuthenticationKeyModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bfdConfig(), gatewayBfdConfigTemplateModel);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.connectionMode(), "transit");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModel.global(), Boolean.valueOf(true));
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
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.authenticationKey().toString(), gatewayTemplateAuthenticationKeyModel.toString());
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bfdConfig().toString(), gatewayBfdConfigTemplateModel.toString());
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpAsn(), Long.valueOf("64999"));
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpBaseCidr(), "testString");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateModelNew.connectionMode(), "transit");
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