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

import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestDeletesItem;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPatchesItem;
import com.ibm.cloud.networking.dns_records.v1.model.BatchDnsRecordsRequestPutsItem;
import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordInput;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BatchDnsRecordsOptions model.
 */
public class BatchDnsRecordsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBatchDnsRecordsOptions() throws Throwable {
    BatchDnsRecordsRequestDeletesItem batchDnsRecordsRequestDeletesItemModel = new BatchDnsRecordsRequestDeletesItem.Builder()
      .id("testString")
      .build();
    assertEquals(batchDnsRecordsRequestDeletesItemModel.id(), "testString");

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

    DnsrecordInput dnsrecordInputModel = new DnsrecordInput.Builder()
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .proxied(false)
      .data(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(dnsrecordInputModel.name(), "host-1.test-example.com");
    assertEquals(dnsrecordInputModel.type(), "A");
    assertEquals(dnsrecordInputModel.ttl(), Long.valueOf("120"));
    assertEquals(dnsrecordInputModel.content(), "1.2.3.4");
    assertEquals(dnsrecordInputModel.priority(), Long.valueOf("5"));
    assertEquals(dnsrecordInputModel.proxied(), Boolean.valueOf(false));
    assertEquals(dnsrecordInputModel.data(), java.util.Collections.singletonMap("anyKey", "anyValue"));

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

    BatchDnsRecordsOptions batchDnsRecordsOptionsModel = new BatchDnsRecordsOptions.Builder()
      .deletes(java.util.Arrays.asList(batchDnsRecordsRequestDeletesItemModel))
      .patches(java.util.Arrays.asList(batchDnsRecordsRequestPatchesItemModel))
      .posts(java.util.Arrays.asList(dnsrecordInputModel))
      .puts(java.util.Arrays.asList(batchDnsRecordsRequestPutsItemModel))
      .build();
    assertEquals(batchDnsRecordsOptionsModel.deletes(), java.util.Arrays.asList(batchDnsRecordsRequestDeletesItemModel));
    assertEquals(batchDnsRecordsOptionsModel.patches(), java.util.Arrays.asList(batchDnsRecordsRequestPatchesItemModel));
    assertEquals(batchDnsRecordsOptionsModel.posts(), java.util.Arrays.asList(dnsrecordInputModel));
    assertEquals(batchDnsRecordsOptionsModel.puts(), java.util.Arrays.asList(batchDnsRecordsRequestPutsItemModel));
  }
}