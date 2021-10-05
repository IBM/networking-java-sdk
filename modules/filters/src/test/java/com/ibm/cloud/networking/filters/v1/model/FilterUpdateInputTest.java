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
import com.ibm.cloud.networking.filters.v1.model.FilterUpdateInput;
import com.ibm.cloud.networking.filters.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FilterUpdateInput model.
 */
public class FilterUpdateInputTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFilterUpdateInput() throws Throwable {
    FilterUpdateInput filterUpdateInputModel = new FilterUpdateInput.Builder()
      .id("f2a64520581a4209aab12187a0081364")
      .expression("\"not http.request.uri.path matches \"^/api/.*$\"\"")
      .description("not /api")
      .paused(false)
      .build();
    assertEquals(filterUpdateInputModel.id(), "f2a64520581a4209aab12187a0081364");
    assertEquals(filterUpdateInputModel.expression(), "\"not http.request.uri.path matches \"^/api/.*$\"\"");
    assertEquals(filterUpdateInputModel.description(), "not /api");
    assertEquals(filterUpdateInputModel.paused(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(filterUpdateInputModel);

    FilterUpdateInput filterUpdateInputModelNew = TestUtilities.deserialize(json, FilterUpdateInput.class);
    assertTrue(filterUpdateInputModelNew instanceof FilterUpdateInput);
    assertEquals(filterUpdateInputModelNew.id(), "f2a64520581a4209aab12187a0081364");
    assertEquals(filterUpdateInputModelNew.expression(), "\"not http.request.uri.path matches \"^/api/.*$\"\"");
    assertEquals(filterUpdateInputModelNew.description(), "not /api");
    assertEquals(filterUpdateInputModelNew.paused(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFilterUpdateInputError() throws Throwable {
    new FilterUpdateInput.Builder().build();
  }

}