/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.networking.direct_link_provider.v2.model.ProviderGatewayPortIdentity;
import com.ibm.cloud.networking.direct_link_provider.v2.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ProviderGatewayPortIdentity model.
 */
public class ProviderGatewayPortIdentityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProviderGatewayPortIdentity() throws Throwable {
    ProviderGatewayPortIdentity providerGatewayPortIdentityModel = new ProviderGatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(providerGatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    String json = TestUtilities.serialize(providerGatewayPortIdentityModel);

    ProviderGatewayPortIdentity providerGatewayPortIdentityModelNew = TestUtilities.deserialize(json, ProviderGatewayPortIdentity.class);
    assertTrue(providerGatewayPortIdentityModelNew instanceof ProviderGatewayPortIdentity);
    assertEquals(providerGatewayPortIdentityModelNew.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testProviderGatewayPortIdentityError() throws Throwable {
    new ProviderGatewayPortIdentity.Builder().build();
  }

}