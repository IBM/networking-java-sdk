/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import com.ibm.cloud.networking.rulesets.v1.model.Ratelimit;
import com.ibm.cloud.networking.rulesets.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Ratelimit model.
 */
public class RatelimitTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRatelimit() throws Throwable {
    Ratelimit ratelimitModel = new Ratelimit.Builder()
      .characteristics(java.util.Arrays.asList("testString"))
      .countingExpression("testString")
      .mitigationTimeout(Long.valueOf("26"))
      .period(Long.valueOf("26"))
      .requestsPerPeriod(Long.valueOf("26"))
      .build();
    assertEquals(ratelimitModel.characteristics(), java.util.Arrays.asList("testString"));
    assertEquals(ratelimitModel.countingExpression(), "testString");
    assertEquals(ratelimitModel.mitigationTimeout(), Long.valueOf("26"));
    assertEquals(ratelimitModel.period(), Long.valueOf("26"));
    assertEquals(ratelimitModel.requestsPerPeriod(), Long.valueOf("26"));

    String json = TestUtilities.serialize(ratelimitModel);

    Ratelimit ratelimitModelNew = TestUtilities.deserialize(json, Ratelimit.class);
    assertTrue(ratelimitModelNew instanceof Ratelimit);
    assertEquals(ratelimitModelNew.countingExpression(), "testString");
    assertEquals(ratelimitModelNew.mitigationTimeout(), Long.valueOf("26"));
    assertEquals(ratelimitModelNew.period(), Long.valueOf("26"));
    assertEquals(ratelimitModelNew.requestsPerPeriod(), Long.valueOf("26"));
  }
}