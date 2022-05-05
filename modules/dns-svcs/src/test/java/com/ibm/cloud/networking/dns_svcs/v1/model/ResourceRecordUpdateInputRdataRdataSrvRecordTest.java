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
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataSrvRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordUpdateInputRdataRdataSrvRecord model.
 */
public class ResourceRecordUpdateInputRdataRdataSrvRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordUpdateInputRdataRdataSrvRecord() throws Throwable {
    ResourceRecordUpdateInputRdataRdataSrvRecord resourceRecordUpdateInputRdataRdataSrvRecordModel = new ResourceRecordUpdateInputRdataRdataSrvRecord.Builder()
      .port(Long.valueOf("80"))
      .priority(Long.valueOf("10"))
      .target("www.example.com")
      .weight(Long.valueOf("10"))
      .build();
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModel.port(), Long.valueOf("80"));
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModel.priority(), Long.valueOf("10"));
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModel.target(), "www.example.com");
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModel.weight(), Long.valueOf("10"));

    String json = TestUtilities.serialize(resourceRecordUpdateInputRdataRdataSrvRecordModel);

    ResourceRecordUpdateInputRdataRdataSrvRecord resourceRecordUpdateInputRdataRdataSrvRecordModelNew = TestUtilities.deserialize(json, ResourceRecordUpdateInputRdataRdataSrvRecord.class);
    assertTrue(resourceRecordUpdateInputRdataRdataSrvRecordModelNew instanceof ResourceRecordUpdateInputRdataRdataSrvRecord);
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModelNew.port(), Long.valueOf("80"));
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModelNew.priority(), Long.valueOf("10"));
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModelNew.target(), "www.example.com");
    assertEquals(resourceRecordUpdateInputRdataRdataSrvRecordModelNew.weight(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordUpdateInputRdataRdataSrvRecordError() throws Throwable {
    new ResourceRecordUpdateInputRdataRdataSrvRecord.Builder().build();
  }

}