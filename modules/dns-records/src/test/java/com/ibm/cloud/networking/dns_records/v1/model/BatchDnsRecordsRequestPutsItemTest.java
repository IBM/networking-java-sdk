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

package com.ibm.cloud.networking.dns_records.v1.model;

import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPutsItem;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BatchDnsRecordsRequestPutsItem model.
 */
public class BatchDnsRecordsRequestPutsItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBatchDnsRecordsRequestPutsItem() throws Throwable {
    BatchDnsRecordsRequestPutsItem batchDnsRecordsRequestPutsItemModel = new BatchDnsRecordsRequestPutsItem.Builder()
      .id("testString")
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(batchDnsRecordsRequestPutsItemModel.id(), "testString");
    assertEquals(batchDnsRecordsRequestPutsItemModel.name(), "host-1.test-example.com");
    assertEquals(batchDnsRecordsRequestPutsItemModel.type(), "A");
    assertEquals(batchDnsRecordsRequestPutsItemModel.ttl(), Long.valueOf("120"));
    assertEquals(batchDnsRecordsRequestPutsItemModel.content(), "1.2.3.4");
    assertEquals(batchDnsRecordsRequestPutsItemModel.priority(), Long.valueOf("5"));
    assertEquals(batchDnsRecordsRequestPutsItemModel.proxied(), Boolean.valueOf(false));
    assertEquals(batchDnsRecordsRequestPutsItemModel.data(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(batchDnsRecordsRequestPutsItemModel);

    BatchDnsRecordsRequestPutsItem batchDnsRecordsRequestPutsItemModelNew = TestUtilities.deserialize(json, BatchDnsRecordsRequestPutsItem.class);
    assertTrue(batchDnsRecordsRequestPutsItemModelNew instanceof BatchDnsRecordsRequestPutsItem);
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.id(), "testString");
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.name(), "host-1.test-example.com");
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.type(), "A");
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.ttl(), Long.valueOf("120"));
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.content(), "1.2.3.4");
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.priority(), Long.valueOf("5"));
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.proxied(), Boolean.valueOf(false));
    assertEquals(batchDnsRecordsRequestPutsItemModelNew.data().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBatchDnsRecordsRequestPutsItemError() throws Throwable {
    new BatchDnsRecordsRequestPutsItem.Builder().build();
  }

}