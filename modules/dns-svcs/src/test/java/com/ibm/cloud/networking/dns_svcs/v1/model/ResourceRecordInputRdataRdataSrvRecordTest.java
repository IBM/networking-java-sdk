/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordInputRdataRdataSrvRecord model.
 */
public class ResourceRecordInputRdataRdataSrvRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordInputRdataRdataSrvRecord() throws Throwable {
    ResourceRecordInputRdataRdataSrvRecord resourceRecordInputRdataRdataSrvRecordModel = new ResourceRecordInputRdataRdataSrvRecord.Builder()
      .port(Long.valueOf("80"))
      .priority(Long.valueOf("10"))
      .target("www.example.com")
      .weight(Long.valueOf("10"))
      .build();
    assertEquals(resourceRecordInputRdataRdataSrvRecordModel.port(), Long.valueOf("80"));
    assertEquals(resourceRecordInputRdataRdataSrvRecordModel.priority(), Long.valueOf("10"));
    assertEquals(resourceRecordInputRdataRdataSrvRecordModel.target(), "www.example.com");
    assertEquals(resourceRecordInputRdataRdataSrvRecordModel.weight(), Long.valueOf("10"));

    String json = TestUtilities.serialize(resourceRecordInputRdataRdataSrvRecordModel);

    ResourceRecordInputRdataRdataSrvRecord resourceRecordInputRdataRdataSrvRecordModelNew = TestUtilities.deserialize(json, ResourceRecordInputRdataRdataSrvRecord.class);
    assertTrue(resourceRecordInputRdataRdataSrvRecordModelNew instanceof ResourceRecordInputRdataRdataSrvRecord);
    assertEquals(resourceRecordInputRdataRdataSrvRecordModelNew.port(), Long.valueOf("80"));
    assertEquals(resourceRecordInputRdataRdataSrvRecordModelNew.priority(), Long.valueOf("10"));
    assertEquals(resourceRecordInputRdataRdataSrvRecordModelNew.target(), "www.example.com");
    assertEquals(resourceRecordInputRdataRdataSrvRecordModelNew.weight(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordInputRdataRdataSrvRecordError() throws Throwable {
    new ResourceRecordInputRdataRdataSrvRecord.Builder().build();
  }

}