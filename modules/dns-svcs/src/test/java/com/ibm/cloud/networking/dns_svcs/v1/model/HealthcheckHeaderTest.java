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

import com.ibm.cloud.networking.dns_svcs.v1.model.HealthcheckHeader;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the HealthcheckHeader model.
 */
public class HealthcheckHeaderTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHealthcheckHeader() throws Throwable {
    HealthcheckHeader healthcheckHeaderModel = new HealthcheckHeader.Builder()
      .name("Host")
      .value(java.util.Arrays.asList("origin.example.com"))
      .build();
    assertEquals(healthcheckHeaderModel.name(), "Host");
    assertEquals(healthcheckHeaderModel.value(), java.util.Arrays.asList("origin.example.com"));

    String json = TestUtilities.serialize(healthcheckHeaderModel);

    HealthcheckHeader healthcheckHeaderModelNew = TestUtilities.deserialize(json, HealthcheckHeader.class);
    assertTrue(healthcheckHeaderModelNew instanceof HealthcheckHeader);
    assertEquals(healthcheckHeaderModelNew.name(), "Host");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHealthcheckHeaderError() throws Throwable {
    new HealthcheckHeader.Builder().build();
  }

}