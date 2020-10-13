/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.networking.cis_range_applications.v1.model.ListRangeAppsOptions;
import com.ibm.cloud.networking.cis_range_applications.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListRangeAppsOptions model.
 */
public class ListRangeAppsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListRangeAppsOptions() throws Throwable {
    ListRangeAppsOptions listRangeAppsOptionsModel = new ListRangeAppsOptions.Builder()
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("1"))
      .order("protocol")
      .direction("asc")
      .build();
    assertEquals(listRangeAppsOptionsModel.page(), Long.valueOf("26"));
    assertEquals(listRangeAppsOptionsModel.perPage(), Long.valueOf("1"));
    assertEquals(listRangeAppsOptionsModel.order(), "protocol");
    assertEquals(listRangeAppsOptionsModel.direction(), "asc");
  }
}