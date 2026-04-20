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

import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPatchesItem;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BatchDnsRecordsRequestPatchesItem model.
 */
public class BatchDnsRecordsRequestPatchesItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBatchDnsRecordsRequestPatchesItem() throws Throwable {
    BatchDnsRecordsRequestPatchesItem batchDnsRecordsRequestPatchesItemModel = new BatchDnsRecordsRequestPatchesItem.Builder()
      .id("testString")
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(batchDnsRecordsRequestPatchesItemModel.id(), "testString");
    assertEquals(batchDnsRecordsRequestPatchesItemModel.name(), "host-1.test-example.com");
    assertEquals(batchDnsRecordsRequestPatchesItemModel.type(), "A");
    assertEquals(batchDnsRecordsRequestPatchesItemModel.ttl(), Long.valueOf("120"));
    assertEquals(batchDnsRecordsRequestPatchesItemModel.content(), "1.2.3.4");
    assertEquals(batchDnsRecordsRequestPatchesItemModel.priority(), Long.valueOf("5"));
    assertEquals(batchDnsRecordsRequestPatchesItemModel.proxied(), Boolean.valueOf(false));
    assertEquals(batchDnsRecordsRequestPatchesItemModel.data(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(batchDnsRecordsRequestPatchesItemModel);

    BatchDnsRecordsRequestPatchesItem batchDnsRecordsRequestPatchesItemModelNew = TestUtilities.deserialize(json, BatchDnsRecordsRequestPatchesItem.class);
    assertTrue(batchDnsRecordsRequestPatchesItemModelNew instanceof BatchDnsRecordsRequestPatchesItem);
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.id(), "testString");
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.name(), "host-1.test-example.com");
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.type(), "A");
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.ttl(), Long.valueOf("120"));
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.content(), "1.2.3.4");
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.priority(), Long.valueOf("5"));
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.proxied(), Boolean.valueOf(false));
    assertEquals(batchDnsRecordsRequestPatchesItemModelNew.data().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBatchDnsRecordsRequestPatchesItemError() throws Throwable {
    new BatchDnsRecordsRequestPatchesItem.Builder().build();
  }

}