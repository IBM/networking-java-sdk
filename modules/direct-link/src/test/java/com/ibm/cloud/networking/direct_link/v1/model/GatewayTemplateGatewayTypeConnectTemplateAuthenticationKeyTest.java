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

import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey model.
 */
public class GatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayTemplateGatewayTypeConnectTemplateAuthenticationKey() throws Throwable {
    GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModel = new GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c")
      .build();
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c");

    String json = TestUtilities.serialize(gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModel);

    GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModelNew = TestUtilities.deserialize(json, GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey.class);
    assertTrue(gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModelNew instanceof GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey);
    assertEquals(gatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyModelNew.crn(), "crn:v1:bluemix:public:kms:us-south:a/766d8d374a484f029d0fca5a40a52a1c:5d343839-07d3-4213-a950-0f71ed45423f:key:7fc1a0ba-4633-48cb-997b-5749787c952c");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGatewayTemplateGatewayTypeConnectTemplateAuthenticationKeyError() throws Throwable {
    new GatewayTemplateGatewayTypeConnectTemplateAuthenticationKey.Builder().build();
  }

}