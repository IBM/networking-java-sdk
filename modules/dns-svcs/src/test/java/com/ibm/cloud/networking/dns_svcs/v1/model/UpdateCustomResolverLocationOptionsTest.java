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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverLocationOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateCustomResolverLocationOptions model.
 */
public class UpdateCustomResolverLocationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateCustomResolverLocationOptions() throws Throwable {
    UpdateCustomResolverLocationOptions updateCustomResolverLocationOptionsModel = new UpdateCustomResolverLocationOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .locationId("testString")
      .enabled(false)
      .subnetCrn("crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04")
      .xCorrelationId("testString")
      .build();
    assertEquals(updateCustomResolverLocationOptionsModel.instanceId(), "testString");
    assertEquals(updateCustomResolverLocationOptionsModel.resolverId(), "testString");
    assertEquals(updateCustomResolverLocationOptionsModel.locationId(), "testString");
    assertEquals(updateCustomResolverLocationOptionsModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateCustomResolverLocationOptionsModel.subnetCrn(), "crn:v1:bluemix:public:is:us-south-1:a/01652b251c3ae2787110a995d8db0135::subnet:0716-b49ef064-0f89-4fb1-8212-135b12568f04");
    assertEquals(updateCustomResolverLocationOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverLocationOptionsError() throws Throwable {
    new UpdateCustomResolverLocationOptions.Builder().build();
  }

}