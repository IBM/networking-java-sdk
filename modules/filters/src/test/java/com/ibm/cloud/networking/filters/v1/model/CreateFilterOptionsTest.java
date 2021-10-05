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
import com.ibm.cloud.networking.filters.v1.model.CreateFilterOptions;
import com.ibm.cloud.networking.filters.v1.model.FilterInput;
import com.ibm.cloud.networking.filters.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateFilterOptions model.
 */
public class CreateFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateFilterOptions() throws Throwable {
    FilterInput filterInputModel = new FilterInput.Builder()
      .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
      .paused(false)
      .description("not /api")
      .build();
    assertEquals(filterInputModel.expression(), "\"not http.request.uri.path matches \"^/api/.*$\"\"");
    assertEquals(filterInputModel.paused(), Boolean.valueOf(false));
    assertEquals(filterInputModel.description(), "not /api");

    CreateFilterOptions createFilterOptionsModel = new CreateFilterOptions.Builder()
      .xAuthUserToken("testString")
      .crn("testString")
      .zoneIdentifier("testString")
      .filterInput(new java.util.ArrayList<FilterInput>(java.util.Arrays.asList(filterInputModel)))
      .build();
    assertEquals(createFilterOptionsModel.xAuthUserToken(), "testString");
    assertEquals(createFilterOptionsModel.crn(), "testString");
    assertEquals(createFilterOptionsModel.zoneIdentifier(), "testString");
    assertEquals(createFilterOptionsModel.filterInput(), new java.util.ArrayList<FilterInput>(java.util.Arrays.asList(filterInputModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFilterOptionsError() throws Throwable {
    new CreateFilterOptions.Builder().build();
  }

}