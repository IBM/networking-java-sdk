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

package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponse;
import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponseHeadersItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RatelimitInputMatchResponse model.
 */
public class RatelimitInputMatchResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRatelimitInputMatchResponse() throws Throwable {
    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
      .name("Cf-Cache-Status")
      .op("ne")
      .value("HIT")
      .build();
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.name(), "Cf-Cache-Status");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.op(), "ne");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.value(), "HIT");

    RatelimitInputMatchResponse ratelimitInputMatchResponseModel = new RatelimitInputMatchResponse.Builder()
      .status(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))))
      .headers(new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)))
      .originTraffic(false)
      .build();
    assertEquals(ratelimitInputMatchResponseModel.status(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("403"))));
    assertEquals(ratelimitInputMatchResponseModel.headers(), new java.util.ArrayList<RatelimitInputMatchResponseHeadersItem>(java.util.Arrays.asList(ratelimitInputMatchResponseHeadersItemModel)));
    assertEquals(ratelimitInputMatchResponseModel.originTraffic(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(ratelimitInputMatchResponseModel);

    RatelimitInputMatchResponse ratelimitInputMatchResponseModelNew = TestUtilities.deserialize(json, RatelimitInputMatchResponse.class);
    assertTrue(ratelimitInputMatchResponseModelNew instanceof RatelimitInputMatchResponse);
    assertEquals(ratelimitInputMatchResponseModelNew.originTraffic(), Boolean.valueOf(false));
  }
}