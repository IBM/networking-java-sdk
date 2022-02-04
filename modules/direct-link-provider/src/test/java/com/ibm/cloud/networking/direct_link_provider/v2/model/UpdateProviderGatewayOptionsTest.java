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

package com.ibm.cloud.networking.direct_link_provider.v2.model;

import com.ibm.cloud.networking.direct_link_provider.v2.model.UpdateProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateProviderGatewayOptions model.
 */
public class UpdateProviderGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateProviderGatewayOptions() throws Throwable {
    UpdateProviderGatewayOptions updateProviderGatewayOptionsModel = new UpdateProviderGatewayOptions.Builder()
      .id("testString")
      .bgpAsn(Long.valueOf("64999"))
      .bgpCerCidr("169.254.0.10/30")
      .bgpIbmCidr("169.254.0.9/30")
      .name("myNewGateway")
      .speedMbps(Long.valueOf("1000"))
      .vlan(Long.valueOf("10"))
      .build();
    assertEquals(updateProviderGatewayOptionsModel.id(), "testString");
    assertEquals(updateProviderGatewayOptionsModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(updateProviderGatewayOptionsModel.bgpCerCidr(), "169.254.0.10/30");
    assertEquals(updateProviderGatewayOptionsModel.bgpIbmCidr(), "169.254.0.9/30");
    assertEquals(updateProviderGatewayOptionsModel.name(), "myNewGateway");
    assertEquals(updateProviderGatewayOptionsModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(updateProviderGatewayOptionsModel.vlan(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateProviderGatewayOptionsError() throws Throwable {
    new UpdateProviderGatewayOptions.Builder().build();
  }

}