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

import com.ibm.cloud.networking.dns_svcs.v1.model.CreateLinkedZoneOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLinkedZoneOptions model.
 */
public class CreateLinkedZoneOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLinkedZoneOptions() throws Throwable {
    CreateLinkedZoneOptions createLinkedZoneOptionsModel = new CreateLinkedZoneOptions.Builder()
      .instanceId("testString")
      .ownerInstanceId("abe30019-1c08-42dc-9ad9-a0682af70054")
      .ownerZoneId("05855abe-3908-4cdc-bf0d-063e0b1c296d")
      .description("linked zone example")
      .label("dev")
      .xCorrelationId("testString")
      .build();
    assertEquals(createLinkedZoneOptionsModel.instanceId(), "testString");
    assertEquals(createLinkedZoneOptionsModel.ownerInstanceId(), "abe30019-1c08-42dc-9ad9-a0682af70054");
    assertEquals(createLinkedZoneOptionsModel.ownerZoneId(), "05855abe-3908-4cdc-bf0d-063e0b1c296d");
    assertEquals(createLinkedZoneOptionsModel.description(), "linked zone example");
    assertEquals(createLinkedZoneOptionsModel.label(), "dev");
    assertEquals(createLinkedZoneOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLinkedZoneOptionsError() throws Throwable {
    new CreateLinkedZoneOptions.Builder().build();
  }

}