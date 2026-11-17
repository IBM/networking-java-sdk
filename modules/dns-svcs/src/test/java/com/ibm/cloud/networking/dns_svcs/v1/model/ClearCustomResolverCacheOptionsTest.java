/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.networking.dns_svcs.v1.model.ClearCustomResolverCacheOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClearCustomResolverCacheOptions model.
 */
public class ClearCustomResolverCacheOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClearCustomResolverCacheOptions() throws Throwable {
    ClearCustomResolverCacheOptions clearCustomResolverCacheOptionsModel = new ClearCustomResolverCacheOptions.Builder()
      .instanceId("2be5d4a7-78f0-4c62-a957-41dc15342777")
      .resolverId("ddbe7a53-7971-46dc-b021-420335c31562")
      .xCorrelationId("testString")
      .build();
    assertEquals(clearCustomResolverCacheOptionsModel.instanceId(), "2be5d4a7-78f0-4c62-a957-41dc15342777");
    assertEquals(clearCustomResolverCacheOptionsModel.resolverId(), "ddbe7a53-7971-46dc-b021-420335c31562");
    assertEquals(clearCustomResolverCacheOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClearCustomResolverCacheOptionsError() throws Throwable {
    new ClearCustomResolverCacheOptions.Builder().build();
  }

}
