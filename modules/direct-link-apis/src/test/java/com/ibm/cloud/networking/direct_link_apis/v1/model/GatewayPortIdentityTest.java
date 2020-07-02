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

package com.ibm.cloud.networking.direct_link_apis.v1.model;

import com.ibm.cloud.networking.direct_link_apis.v1.model.GatewayPortIdentity;
import com.ibm.cloud.networking.direct_link_apis.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayPortIdentity model.
 */
public class GatewayPortIdentityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayPortIdentity() throws Throwable {
    GatewayPortIdentity gatewayPortIdentityModel = new GatewayPortIdentity.Builder()
      .id("fffdcb1a-fee4-41c7-9e11-9cd99e65c777")
      .build();
    assertEquals(gatewayPortIdentityModel.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");

    String json = TestUtilities.serialize(gatewayPortIdentityModel);

    GatewayPortIdentity gatewayPortIdentityModelNew = TestUtilities.deserialize(json, GatewayPortIdentity.class);
    assertTrue(gatewayPortIdentityModelNew instanceof GatewayPortIdentity);
    assertEquals(gatewayPortIdentityModelNew.id(), "fffdcb1a-fee4-41c7-9e11-9cd99e65c777");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayPortIdentityError() throws Throwable {
    new GatewayPortIdentity.Builder().build();
  }

}