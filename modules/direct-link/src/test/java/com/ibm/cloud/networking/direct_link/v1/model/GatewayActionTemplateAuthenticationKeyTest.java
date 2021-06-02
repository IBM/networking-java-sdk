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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayActionTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayActionTemplateAuthenticationKey model.
 */
public class GatewayActionTemplateAuthenticationKeyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayActionTemplateAuthenticationKey() throws Throwable {
    GatewayActionTemplateAuthenticationKey gatewayActionTemplateAuthenticationKeyModel = new GatewayActionTemplateAuthenticationKey.Builder()
      .crn("crn:v1:staging:public:kms:us-south:a/3b1bd7fa2bc3406ea70ba4ade8aa3f1b:6f2b3d69-9e70-46e6-bcaa-f96ecc232cbc:key:4f9d186a-5cc1-4305-94fc-af183ddf65bc")
      .build();
    assertEquals(gatewayActionTemplateAuthenticationKeyModel.crn(), "crn:v1:staging:public:kms:us-south:a/3b1bd7fa2bc3406ea70ba4ade8aa3f1b:6f2b3d69-9e70-46e6-bcaa-f96ecc232cbc:key:4f9d186a-5cc1-4305-94fc-af183ddf65bc");

    String json = TestUtilities.serialize(gatewayActionTemplateAuthenticationKeyModel);

    GatewayActionTemplateAuthenticationKey gatewayActionTemplateAuthenticationKeyModelNew = TestUtilities.deserialize(json, GatewayActionTemplateAuthenticationKey.class);
    assertTrue(gatewayActionTemplateAuthenticationKeyModelNew instanceof GatewayActionTemplateAuthenticationKey);
    assertEquals(gatewayActionTemplateAuthenticationKeyModelNew.crn(), "crn:v1:staging:public:kms:us-south:a/3b1bd7fa2bc3406ea70ba4ade8aa3f1b:6f2b3d69-9e70-46e6-bcaa-f96ecc232cbc:key:4f9d186a-5cc1-4305-94fc-af183ddf65bc");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayActionTemplateAuthenticationKeyError() throws Throwable {
    new GatewayActionTemplateAuthenticationKey.Builder().build();
  }

}