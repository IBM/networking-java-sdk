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

import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLinkedZoneOptions model.
 */
public class UpdateLinkedZoneOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLinkedZoneOptions() throws Throwable {
    UpdateLinkedZoneOptions updateLinkedZoneOptionsModel = new UpdateLinkedZoneOptions.Builder()
      .instanceId("testString")
      .linkedDnszoneId("testString")
      .description("linked zone example")
      .label("dev")
      .xCorrelationId("testString")
      .build();
    assertEquals(updateLinkedZoneOptionsModel.instanceId(), "testString");
    assertEquals(updateLinkedZoneOptionsModel.linkedDnszoneId(), "testString");
    assertEquals(updateLinkedZoneOptionsModel.description(), "linked zone example");
    assertEquals(updateLinkedZoneOptionsModel.label(), "dev");
    assertEquals(updateLinkedZoneOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLinkedZoneOptionsError() throws Throwable {
    new UpdateLinkedZoneOptions.Builder().build();
  }

}