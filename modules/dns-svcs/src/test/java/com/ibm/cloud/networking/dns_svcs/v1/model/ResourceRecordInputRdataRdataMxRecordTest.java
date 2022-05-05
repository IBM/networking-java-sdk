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
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordInputRdataRdataMxRecord model.
 */
public class ResourceRecordInputRdataRdataMxRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordInputRdataRdataMxRecord() throws Throwable {
    ResourceRecordInputRdataRdataMxRecord resourceRecordInputRdataRdataMxRecordModel = new ResourceRecordInputRdataRdataMxRecord.Builder()
      .exchange("mail.example.com")
      .preference(Long.valueOf("10"))
      .build();
    assertEquals(resourceRecordInputRdataRdataMxRecordModel.exchange(), "mail.example.com");
    assertEquals(resourceRecordInputRdataRdataMxRecordModel.preference(), Long.valueOf("10"));

    String json = TestUtilities.serialize(resourceRecordInputRdataRdataMxRecordModel);

    ResourceRecordInputRdataRdataMxRecord resourceRecordInputRdataRdataMxRecordModelNew = TestUtilities.deserialize(json, ResourceRecordInputRdataRdataMxRecord.class);
    assertTrue(resourceRecordInputRdataRdataMxRecordModelNew instanceof ResourceRecordInputRdataRdataMxRecord);
    assertEquals(resourceRecordInputRdataRdataMxRecordModelNew.exchange(), "mail.example.com");
    assertEquals(resourceRecordInputRdataRdataMxRecordModelNew.preference(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordInputRdataRdataMxRecordError() throws Throwable {
    new ResourceRecordInputRdataRdataMxRecord.Builder().build();
  }

}