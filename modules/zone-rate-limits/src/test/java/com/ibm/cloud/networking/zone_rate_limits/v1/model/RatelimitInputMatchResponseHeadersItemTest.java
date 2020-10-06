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

import com.ibm.cloud.networking.zone_rate_limits.v1.model.RatelimitInputMatchResponseHeadersItem;
import com.ibm.cloud.networking.zone_rate_limits.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RatelimitInputMatchResponseHeadersItem model.
 */
public class RatelimitInputMatchResponseHeadersItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRatelimitInputMatchResponseHeadersItem() throws Throwable {
    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModel = new RatelimitInputMatchResponseHeadersItem.Builder()
      .name("Cf-Cache-Status")
      .op("ne")
      .value("HIT")
      .build();
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.name(), "Cf-Cache-Status");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.op(), "ne");
    assertEquals(ratelimitInputMatchResponseHeadersItemModel.value(), "HIT");

    String json = TestUtilities.serialize(ratelimitInputMatchResponseHeadersItemModel);

    RatelimitInputMatchResponseHeadersItem ratelimitInputMatchResponseHeadersItemModelNew = TestUtilities.deserialize(json, RatelimitInputMatchResponseHeadersItem.class);
    assertTrue(ratelimitInputMatchResponseHeadersItemModelNew instanceof RatelimitInputMatchResponseHeadersItem);
    assertEquals(ratelimitInputMatchResponseHeadersItemModelNew.name(), "Cf-Cache-Status");
    assertEquals(ratelimitInputMatchResponseHeadersItemModelNew.op(), "ne");
    assertEquals(ratelimitInputMatchResponseHeadersItemModelNew.value(), "HIT");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRatelimitInputMatchResponseHeadersItemError() throws Throwable {
    new RatelimitInputMatchResponseHeadersItem.Builder().build();
  }

}