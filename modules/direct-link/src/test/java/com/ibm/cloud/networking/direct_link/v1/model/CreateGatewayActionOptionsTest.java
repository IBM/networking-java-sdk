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

import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigActionTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateGatewayActionOptions model.
 */
public class CreateGatewayActionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateGatewayActionOptions() throws Throwable {
    GatewayActionTemplateAuthenticationKey gatewayActionTemplateAuthenticationKeyModel = new GatewayActionTemplateAuthenticationKey.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
      .build();
    assertEquals(gatewayActionTemplateAuthenticationKeyModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c");

    GatewayBfdConfigActionTemplate gatewayBfdConfigActionTemplateModel = new GatewayBfdConfigActionTemplate.Builder()
      .interval(Long.valueOf("2000"))
      .multiplier(Long.valueOf("10"))
      .build();
    assertEquals(gatewayBfdConfigActionTemplateModel.interval(), Long.valueOf("2000"));
    assertEquals(gatewayBfdConfigActionTemplateModel.multiplier(), Long.valueOf("10"));

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate gatewayActionTemplateUpdatesItemModel = new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.Builder()
      .speedMbps(Long.valueOf("500"))
      .build();
    assertEquals(gatewayActionTemplateUpdatesItemModel.speedMbps(), Long.valueOf("500"));

    CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
      .id("testString")
      .action("create_gateway_approve")
      .authenticationKey(gatewayActionTemplateAuthenticationKeyModel)
      .bfdConfig(gatewayBfdConfigActionTemplateModel)
      .connectionMode("transit")
      .global(true)
      .metered(false)
      .resourceGroup(resourceGroupIdentityModel)
      .updates(new java.util.ArrayList<GatewayActionTemplateUpdatesItem>(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel)))
      .build();
    assertEquals(createGatewayActionOptionsModel.id(), "testString");
    assertEquals(createGatewayActionOptionsModel.action(), "create_gateway_approve");
    assertEquals(createGatewayActionOptionsModel.authenticationKey(), gatewayActionTemplateAuthenticationKeyModel);
    assertEquals(createGatewayActionOptionsModel.bfdConfig(), gatewayBfdConfigActionTemplateModel);
    assertEquals(createGatewayActionOptionsModel.connectionMode(), "transit");
    assertEquals(createGatewayActionOptionsModel.global(), Boolean.valueOf(true));
    assertEquals(createGatewayActionOptionsModel.metered(), Boolean.valueOf(false));
    assertEquals(createGatewayActionOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createGatewayActionOptionsModel.updates(), new java.util.ArrayList<GatewayActionTemplateUpdatesItem>(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionOptionsError() throws Throwable {
    new CreateGatewayActionOptions.Builder().build();
  }

}