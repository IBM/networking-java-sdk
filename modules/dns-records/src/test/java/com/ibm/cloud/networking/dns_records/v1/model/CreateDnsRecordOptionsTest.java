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

package com.ibm.cloud.networking.dns_records.v1.model;

import com.ibm.cloud.networking.dns_records.v1.model.CreateDnsRecordOptions;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDnsRecordOptions model.
 */
public class CreateDnsRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDnsRecordOptions() throws Throwable {
    CreateDnsRecordOptions createDnsRecordOptionsModel = new CreateDnsRecordOptions.Builder()
      .name("host-1.test-example.com")
      .type("A")
      .ttl(Long.valueOf("120"))
      .content("1.2.3.4")
      .priority(Long.valueOf("5"))
      .data(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(createDnsRecordOptionsModel.name(), "host-1.test-example.com");
    assertEquals(createDnsRecordOptionsModel.type(), "A");
    assertEquals(createDnsRecordOptionsModel.ttl(), Long.valueOf("120"));
    assertEquals(createDnsRecordOptionsModel.content(), "1.2.3.4");
    assertEquals(createDnsRecordOptionsModel.priority(), Long.valueOf("5"));
    assertEquals(createDnsRecordOptionsModel.data(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
  }
}