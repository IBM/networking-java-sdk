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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePermittedNetworkOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.PermittedNetworkVpc;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePermittedNetworkOptions model.
 */
public class CreatePermittedNetworkOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePermittedNetworkOptions() throws Throwable {
    PermittedNetworkVpc permittedNetworkVpcModel = new PermittedNetworkVpc.Builder()
      .vpcCrn("crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6")
      .build();
    assertEquals(permittedNetworkVpcModel.vpcCrn(), "crn:v1:bluemix:public:is:eu-de:a/bcf1865e99742d38d2d5fc3fb80a5496::vpc:6e6cc326-04d1-4c99-a289-efb3ae4193d6");

    CreatePermittedNetworkOptions createPermittedNetworkOptionsModel = new CreatePermittedNetworkOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .type("vpc")
      .permittedNetwork(permittedNetworkVpcModel)
      .accounts("testString")
      .xCorrelationId("testString")
      .build();
    assertEquals(createPermittedNetworkOptionsModel.instanceId(), "testString");
    assertEquals(createPermittedNetworkOptionsModel.dnszoneId(), "testString");
    assertEquals(createPermittedNetworkOptionsModel.type(), "vpc");
    assertEquals(createPermittedNetworkOptionsModel.permittedNetwork(), permittedNetworkVpcModel);
    assertEquals(createPermittedNetworkOptionsModel.accounts(), "testString");
    assertEquals(createPermittedNetworkOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePermittedNetworkOptionsError() throws Throwable {
    new CreatePermittedNetworkOptions.Builder().build();
  }

}