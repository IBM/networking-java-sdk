/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.direct_link.v1.model.AsPrependTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayActionOptions;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfigActionTemplate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupIdentity;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import java.io.InputStream;
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

    GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate gatewayActionTemplateUpdatesItemModel = new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.Builder()
      .speedMbps(Long.valueOf("500"))
      .build();
    assertEquals(gatewayActionTemplateUpdatesItemModel.speedMbps(), Long.valueOf("500"));

    CreateGatewayActionOptions createGatewayActionOptionsModel = new CreateGatewayActionOptions.Builder()
      .id("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .action("create_gateway_approve")
      .asPrepends(java.util.Arrays.asList(asPrependTemplateModel))
      .authenticationKey(gatewayActionTemplateAuthenticationKeyModel)
      .bfdConfig(gatewayBfdConfigActionTemplateModel)
      .connectionMode("transit")
      .defaultExportRouteFilter("permit")
      .defaultImportRouteFilter("permit")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .global(true)
      .importRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .metered(false)
      .resourceGroup(resourceGroupIdentityModel)
      .updates(java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel))
      .build();
    assertEquals(createGatewayActionOptionsModel.id(), "0a06fb9b-820f-4c44-8a31-77f1f0806d28");
    assertEquals(createGatewayActionOptionsModel.action(), "create_gateway_approve");
    assertEquals(createGatewayActionOptionsModel.asPrepends(), java.util.Arrays.asList(asPrependTemplateModel));
    assertEquals(createGatewayActionOptionsModel.authenticationKey(), gatewayActionTemplateAuthenticationKeyModel);
    assertEquals(createGatewayActionOptionsModel.bfdConfig(), gatewayBfdConfigActionTemplateModel);
    assertEquals(createGatewayActionOptionsModel.connectionMode(), "transit");
    assertEquals(createGatewayActionOptionsModel.defaultExportRouteFilter(), "permit");
    assertEquals(createGatewayActionOptionsModel.defaultImportRouteFilter(), "permit");
    assertEquals(createGatewayActionOptionsModel.exportRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(createGatewayActionOptionsModel.global(), Boolean.valueOf(true));
    assertEquals(createGatewayActionOptionsModel.importRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
    assertEquals(createGatewayActionOptionsModel.metered(), Boolean.valueOf(false));
    assertEquals(createGatewayActionOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createGatewayActionOptionsModel.updates(), java.util.Arrays.asList(gatewayActionTemplateUpdatesItemModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayActionOptionsError() throws Throwable {
    new CreateGatewayActionOptions.Builder().build();
  }

}