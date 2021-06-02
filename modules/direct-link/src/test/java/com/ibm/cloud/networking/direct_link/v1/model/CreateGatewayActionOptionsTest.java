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

import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
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
      .crn("crn:v1:staging:public:kms:us-south:a/3b1bd7fa2bc3406ea70ba4ade8aa3f1b:6f2b3d69-9e70-46e6-bcaa-f96ecc232cbc:key:4f9d186a-5cc1-4305-94fc-af183ddf65bc")
      .build();
    assertEquals(gatewayActionTemplateAuthenticationKeyModel.crn(), "crn:v1:staging:public:kms:us-south:a/3b1bd7fa2bc3406ea70ba4ade8aa3f1b:6f2b3d69-9e70-46e6-bcaa-f96ecc232cbc:key:4f9d186a-5cc1-4305-94fc-af183ddf65bc");

    GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate gatewayActionTemplateUpdatesItemModel = new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.Builder()
      .speedMbps(Long.valueOf("500"))
      .build();
    assertEquals(gatewayActionTemplateUpdatesItemModel.speedMbps(), Long.valueOf("500"));

    ResourceGroupIdentity resourceGroupIdentityModel = new ResourceGroupIdentity.Builder()
      .id("56969d6043e9465c883cb9f7363e78e8")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "56969d6043e9465c883cb9f7363e78e8");

    CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
      .id("testString")
      .action("create_gateway_approve")
      .authenticationKey(gatewayActionTemplateAuthenticationKeyModel)
      .global(true)
      .metered(false)
      .resourceGroup(resourceGroupIdentityModel)
      .updates(new ArrayList<GatewayActionTemplateUpdatesItem>(Arrays.asList(gatewayActionTemplateUpdatesItemModel)))
      .build();
    assertEquals(createGatewayActionOptionsModel.id(), "testString");
    assertEquals(createGatewayActionOptionsModel.action(), "create_gateway_approve");
    assertEquals(createGatewayActionOptionsModel.authenticationKey(), gatewayActionTemplateAuthenticationKeyModel);
    assertEquals(createGatewayActionOptionsModel.global(), Boolean.valueOf(true));
    assertEquals(createGatewayActionOptionsModel.metered(), Boolean.valueOf(false));
    assertEquals(createGatewayActionOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createGatewayActionOptionsModel.updates(), new ArrayList<GatewayActionTemplateUpdatesItem>(Arrays.asList(gatewayActionTemplateUpdatesItemModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionOptionsError() throws Throwable {
    new CreateGatewayActionOptions.Builder().build();
  }

}