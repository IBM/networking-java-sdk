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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.CreatePoolOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePoolOptions model.
 */
public class CreatePoolOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePoolOptions() throws Throwable {
    OriginInput originInputModel = new OriginInput.Builder()
      .name("app-server-1")
      .description("description of the origin server")
      .address("10.10.16.8")
      .enabled(true)
      .build();
    assertEquals(originInputModel.name(), "app-server-1");
    assertEquals(originInputModel.description(), "description of the origin server");
    assertEquals(originInputModel.address(), "10.10.16.8");
    assertEquals(originInputModel.enabled(), Boolean.valueOf(true));

    CreatePoolOptions createPoolOptionsModel = new CreatePoolOptions.Builder()
      .instanceId("testString")
      .name("dal10-az-pool")
      .description("Load balancer pool for dal10 availability zone.")
      .enabled(true)
      .healthyOriginsThreshold(Long.valueOf("1"))
      .origins(new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)))
      .monitor("7dd6841c-264e-11ea-88df-062967242a6a")
      .notificationChannel("https://mywebsite.com/dns/webhook")
      .healthcheckRegion("us-south")
      .healthcheckSubnets(new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")))
      .xCorrelationId("testString")
      .build();
    assertEquals(createPoolOptionsModel.instanceId(), "testString");
    assertEquals(createPoolOptionsModel.name(), "dal10-az-pool");
    assertEquals(createPoolOptionsModel.description(), "Load balancer pool for dal10 availability zone.");
    assertEquals(createPoolOptionsModel.enabled(), Boolean.valueOf(true));
    assertEquals(createPoolOptionsModel.healthyOriginsThreshold(), Long.valueOf("1"));
    assertEquals(createPoolOptionsModel.origins(), new java.util.ArrayList<OriginInput>(java.util.Arrays.asList(originInputModel)));
    assertEquals(createPoolOptionsModel.monitor(), "7dd6841c-264e-11ea-88df-062967242a6a");
    assertEquals(createPoolOptionsModel.notificationChannel(), "https://mywebsite.com/dns/webhook");
    assertEquals(createPoolOptionsModel.healthcheckRegion(), "us-south");
    assertEquals(createPoolOptionsModel.healthcheckSubnets(), new java.util.ArrayList<String>(java.util.Arrays.asList("crn:v1:staging:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")));
    assertEquals(createPoolOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePoolOptionsError() throws Throwable {
    new CreatePoolOptions.Builder().build();
  }

}