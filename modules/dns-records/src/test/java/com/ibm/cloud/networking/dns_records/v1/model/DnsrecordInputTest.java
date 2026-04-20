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

import com.ibm.cloud.networking.dns_records.v1.model.DnsrecordInput;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DnsrecordInput model.
 */
public class DnsrecordInputTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDnsrecordInput() throws Throwable {
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

    String json = TestUtilities.serialize(dnsrecordInputModel);

    DnsrecordInput dnsrecordInputModelNew = TestUtilities.deserialize(json, DnsrecordInput.class);
    assertTrue(dnsrecordInputModelNew instanceof DnsrecordInput);
    assertEquals(dnsrecordInputModelNew.name(), "host-1.test-example.com");
    assertEquals(dnsrecordInputModelNew.type(), "A");
    assertEquals(dnsrecordInputModelNew.ttl(), Long.valueOf("120"));
    assertEquals(dnsrecordInputModelNew.content(), "1.2.3.4");
    assertEquals(dnsrecordInputModelNew.priority(), Long.valueOf("5"));
    assertEquals(dnsrecordInputModelNew.proxied(), Boolean.valueOf(false));
    assertEquals(dnsrecordInputModelNew.data().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDnsrecordInputError() throws Throwable {
    new DnsrecordInput.Builder().build();
  }

}