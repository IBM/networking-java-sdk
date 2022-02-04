/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayVirtualConnectionOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateGatewayVirtualConnectionOptions model.
 */
public class CreateGatewayVirtualConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateGatewayVirtualConnectionOptions() throws Throwable {
    CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptionsModel = new CreateGatewayVirtualConnectionOptions.Builder()
      .gatewayId("testString")
      .name("newVC")
      .type("vpc")
      .networkId("crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb")
      .build();
    assertEquals(createGatewayVirtualConnectionOptionsModel.gatewayId(), "testString");
    assertEquals(createGatewayVirtualConnectionOptionsModel.name(), "newVC");
    assertEquals(createGatewayVirtualConnectionOptionsModel.type(), "vpc");
    assertEquals(createGatewayVirtualConnectionOptionsModel.networkId(), "crn:v1:bluemix:public:is:us-east:a/28e4d90ac7504be69447111122223333::vpc:aaa81ac8-5e96-42a0-a4b7-6c2e2d1bbbbb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayVirtualConnectionOptionsError() throws Throwable {
    new CreateGatewayVirtualConnectionOptions.Builder().build();
  }

}