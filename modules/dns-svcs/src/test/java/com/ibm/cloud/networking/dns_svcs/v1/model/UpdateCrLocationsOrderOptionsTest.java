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
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateCrLocationsOrderOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateCrLocationsOrderOptions model.
 */
public class UpdateCrLocationsOrderOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateCrLocationsOrderOptions() throws Throwable {
    UpdateCrLocationsOrderOptions updateCrLocationsOrderOptionsModel = new UpdateCrLocationsOrderOptions.Builder()
      .instanceId("testString")
      .resolverId("testString")
      .locations(new java.util.ArrayList<String>(java.util.Arrays.asList("9a234ede-c2b6-4c39-bc27-d39ec139ecdb")))
      .xCorrelationId("testString")
      .build();
    assertEquals(updateCrLocationsOrderOptionsModel.instanceId(), "testString");
    assertEquals(updateCrLocationsOrderOptionsModel.resolverId(), "testString");
    assertEquals(updateCrLocationsOrderOptionsModel.locations(), new java.util.ArrayList<String>(java.util.Arrays.asList("9a234ede-c2b6-4c39-bc27-d39ec139ecdb")));
    assertEquals(updateCrLocationsOrderOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCrLocationsOrderOptionsError() throws Throwable {
    new UpdateCrLocationsOrderOptions.Builder().build();
  }

}