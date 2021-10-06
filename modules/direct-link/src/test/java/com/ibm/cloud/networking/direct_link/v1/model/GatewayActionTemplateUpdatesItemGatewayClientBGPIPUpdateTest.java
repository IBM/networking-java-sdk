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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate model.
 */
public class GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate() throws Throwable {
    GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModel = new GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate.Builder()
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .build();
    assertEquals(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModel.bgpIbmCidr(), "169.254.0.9/30");

    String json = TestUtilities.serialize(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModel);

    GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModelNew = TestUtilities.deserialize(json, GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate.class);
    assertTrue(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModelNew instanceof GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate);
    assertEquals(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModelNew.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdateModelNew.bgpIbmCidr(), "169.254.0.9/30");
  }
}