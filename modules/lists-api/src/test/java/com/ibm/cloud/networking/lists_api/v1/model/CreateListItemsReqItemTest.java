/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.networking.lists_api.v1.model.CreateListItemsReqItem;
import com.ibm.cloud.networking.lists_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateListItemsReqItem model.
 */
public class CreateListItemsReqItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateListItemsReqItem() throws Throwable {
    CreateListItemsReqItem createListItemsReqItemModel = new CreateListItemsReqItem.Builder()
      .asn(Double.valueOf("19604"))
      .comment("My list of developer IPs.")
      .hostname("cloud.ibm.com")
      .ip("172.64.0.0/13")
      .build();
    assertEquals(createListItemsReqItemModel.asn(), Double.valueOf("19604"));
    assertEquals(createListItemsReqItemModel.comment(), "My list of developer IPs.");
    assertEquals(createListItemsReqItemModel.hostname(), "cloud.ibm.com");
    assertEquals(createListItemsReqItemModel.ip(), "172.64.0.0/13");

    String json = TestUtilities.serialize(createListItemsReqItemModel);

    CreateListItemsReqItem createListItemsReqItemModelNew = TestUtilities.deserialize(json, CreateListItemsReqItem.class);
    assertTrue(createListItemsReqItemModelNew instanceof CreateListItemsReqItem);
    assertEquals(createListItemsReqItemModelNew.asn(), Double.valueOf("19604"));
    assertEquals(createListItemsReqItemModelNew.comment(), "My list of developer IPs.");
    assertEquals(createListItemsReqItemModelNew.hostname(), "cloud.ibm.com");
    assertEquals(createListItemsReqItemModelNew.ip(), "172.64.0.0/13");
  }
}