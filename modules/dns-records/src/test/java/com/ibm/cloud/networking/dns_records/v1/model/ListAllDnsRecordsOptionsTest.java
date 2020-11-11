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

import com.ibm.cloud.networking.dns_records.v1.model.ListAllDnsRecordsOptions;
import com.ibm.cloud.networking.dns_records.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListAllDnsRecordsOptions model.
 */
public class ListAllDnsRecordsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListAllDnsRecordsOptions() throws Throwable {
    ListAllDnsRecordsOptions listAllDnsRecordsOptionsModel = new ListAllDnsRecordsOptions.Builder()
      .type("testString")
      .name("host1.test-example.com")
      .content("1.2.3.4")
      .page(Long.valueOf("26"))
      .perPage(Long.valueOf("5"))
      .order("type")
      .direction("asc")
      .match("any")
      .build();
    assertEquals(listAllDnsRecordsOptionsModel.type(), "testString");
    assertEquals(listAllDnsRecordsOptionsModel.name(), "host1.test-example.com");
    assertEquals(listAllDnsRecordsOptionsModel.content(), "1.2.3.4");
    assertEquals(listAllDnsRecordsOptionsModel.page(), Long.valueOf("26"));
    assertEquals(listAllDnsRecordsOptionsModel.perPage(), Long.valueOf("5"));
    assertEquals(listAllDnsRecordsOptionsModel.order(), "type");
    assertEquals(listAllDnsRecordsOptionsModel.direction(), "asc");
    assertEquals(listAllDnsRecordsOptionsModel.match(), "any");
  }
}