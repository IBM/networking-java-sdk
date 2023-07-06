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

import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateSecondaryZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSecondaryZoneOptions model.
 */
public class UpdateSecondaryZoneOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateSecondaryZoneOptions() throws Throwable {
    UpdateSecondaryZoneOptions updateSecondaryZoneOptionsModel = new UpdateSecondaryZoneOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .secondaryZoneId("testString")
      .description("secondary zone")
      .enabled(false)
      .transferFrom(java.util.Arrays.asList("10.0.0.7"))
      .xCorrelationId("testString")
      .build();
    assertEquals(updateSecondaryZoneOptionsModel.instanceId(), "testString");
    assertEquals(updateSecondaryZoneOptionsModel.resolverId(), "testString");
    assertEquals(updateSecondaryZoneOptionsModel.secondaryZoneId(), "testString");
    assertEquals(updateSecondaryZoneOptionsModel.description(), "secondary zone");
    assertEquals(updateSecondaryZoneOptionsModel.enabled(), Boolean.valueOf(false));
    assertEquals(updateSecondaryZoneOptionsModel.transferFrom(), java.util.Arrays.asList("10.0.0.7"));
    assertEquals(updateSecondaryZoneOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecondaryZoneOptionsError() throws Throwable {
    new UpdateSecondaryZoneOptions.Builder().build();
  }

}