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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.CreateTransitGatewayConnectionOptions;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateTransitGatewayConnectionOptions model.
 */
public class CreateTransitGatewayConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateTransitGatewayConnectionOptions() throws Throwable {
    CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptionsModel = new CreateTransitGatewayConnectionOptions.Builder()
      .transitGatewayId("testString")
      .networkType("vpc")
      .name("Transit_Service_BWTN_SJ_DL")
      .networkId("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(createTransitGatewayConnectionOptionsModel.transitGatewayId(), "testString");
    assertEquals(createTransitGatewayConnectionOptionsModel.networkType(), "vpc");
    assertEquals(createTransitGatewayConnectionOptionsModel.name(), "Transit_Service_BWTN_SJ_DL");
    assertEquals(createTransitGatewayConnectionOptionsModel.networkId(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTransitGatewayConnectionOptionsError() throws Throwable {
    new CreateTransitGatewayConnectionOptions.Builder().build();
  }

}