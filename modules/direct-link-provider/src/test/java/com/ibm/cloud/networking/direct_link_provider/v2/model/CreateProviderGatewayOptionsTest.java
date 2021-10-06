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

import com.ibm.cloud.networking.direct_link_provider.v2.model.CreateProviderGatewayOptions;
import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayPortIdentity;
import com.ibm.cloud.networking.direct_link_provider.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateProviderGatewayOptions model.
 */
public class CreateProviderGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateProviderGatewayOptions() throws Throwable {
    ProviderGatewayPortIdentity providerGatewayPortIdentityModel = new ProviderGatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(providerGatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    CreateProviderGatewayOptions createProviderGatewayOptionsModel = new CreateProviderGatewayOptions.Builder()
      .bgpAsn(Long.valueOf("64999"))
      .customerAccountId("4111d05f36894e3cb9b46a43556d9000")
      .name("myGateway")
      .port(providerGatewayPortIdentityModel)
      .speedMbps(Long.valueOf("1000"))
      .bgpCerCidr("10.254.30.78/30")
      .bgpIbmCidr("10.254.30.77/30")
      .checkOnly("testString")
      .build();
    assertEquals(createProviderGatewayOptionsModel.bgpAsn(), Long.valueOf("64999"));
    assertEquals(createProviderGatewayOptionsModel.customerAccountId(), "4111d05f36894e3cb9b46a43556d9000");
    assertEquals(createProviderGatewayOptionsModel.name(), "myGateway");
    assertEquals(createProviderGatewayOptionsModel.port(), providerGatewayPortIdentityModel);
    assertEquals(createProviderGatewayOptionsModel.speedMbps(), Long.valueOf("1000"));
    assertEquals(createProviderGatewayOptionsModel.bgpCerCidr(), "10.254.30.78/30");
    assertEquals(createProviderGatewayOptionsModel.bgpIbmCidr(), "10.254.30.77/30");
    assertEquals(createProviderGatewayOptionsModel.checkOnly(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateProviderGatewayOptionsError() throws Throwable {
    new CreateProviderGatewayOptions.Builder().build();
  }

}