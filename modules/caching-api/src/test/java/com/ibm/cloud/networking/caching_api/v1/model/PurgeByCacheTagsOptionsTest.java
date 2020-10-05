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

package com.ibm.cloud.networking.caching_api.v1.model;

import com.ibm.cloud.networking.caching_api.v1.model.PurgeByCacheTagsOptions;
import com.ibm.cloud.networking.caching_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PurgeByCacheTagsOptions model.
 */
public class PurgeByCacheTagsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPurgeByCacheTagsOptions() throws Throwable {
    PurgeByCacheTagsOptions purgeByCacheTagsOptionsModel = new PurgeByCacheTagsOptions.Builder()
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("some-tag")))
      .build();
    assertEquals(purgeByCacheTagsOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("some-tag")));
  }
}