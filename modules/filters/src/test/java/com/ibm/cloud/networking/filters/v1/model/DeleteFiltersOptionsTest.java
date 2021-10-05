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

package com.ibm.cloud.networking.filters.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.filters.v1.model.DeleteFiltersOptions;
import com.ibm.cloud.networking.filters.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteFiltersOptions model.
 */
public class DeleteFiltersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteFiltersOptions() throws Throwable {
    DeleteFiltersOptions deleteFiltersOptionsModel = new DeleteFiltersOptions.Builder()
      .xAuthUserToken("testString")
      .crn("testString")
      .zoneIdentifier("testString")
      .id("b7ff25282d394be7b945e23c7106ce8a")
      .build();
    assertEquals(deleteFiltersOptionsModel.xAuthUserToken(), "testString");
    assertEquals(deleteFiltersOptionsModel.crn(), "testString");
    assertEquals(deleteFiltersOptionsModel.zoneIdentifier(), "testString");
    assertEquals(deleteFiltersOptionsModel.id(), "b7ff25282d394be7b945e23c7106ce8a");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFiltersOptionsError() throws Throwable {
    new DeleteFiltersOptions.Builder().build();
  }

}