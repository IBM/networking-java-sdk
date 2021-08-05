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
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCustomResolverOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateCustomResolverOptions model.
 */
public class UpdateCustomResolverOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateCustomResolverOptions() throws Throwable {
    UpdateCustomResolverOptions updateCustomResolverOptionsModel = new UpdateCustomResolverOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .name("my-resolver")
      .description("custom resolver")
      .enabled(false)
      .xCorrelationId("testString")
      .build();
    assertEquals(updateCustomResolverOptionsModel.instanceId(), "testString");
    assertEquals(updateCustomResolverOptionsModel.resolverId(), "testString");
    assertEquals(updateCustomResolverOptionsModel.name(), "my-resolver");
    assertEquals(updateCustomResolverOptionsModel.description(), "custom resolver");
    assertEquals(updateCustomResolverOptionsModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateCustomResolverOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCustomResolverOptionsError() throws Throwable {
    new UpdateCustomResolverOptions.Builder().build();
  }

}