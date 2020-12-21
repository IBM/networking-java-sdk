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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataMxRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordUpdateInputRdataRdataMxRecord model.
 */
public class ResourceRecordUpdateInputRdataRdataMxRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordUpdateInputRdataRdataMxRecord() throws Throwable {
    ResourceRecordUpdateInputRdataRdataMxRecord resourceRecordUpdateInputRdataRdataMxRecordModel = new ResourceRecordUpdateInputRdataRdataMxRecord.Builder()
      .exchange("mail.example.com")
      .preference(Long.valueOf("10"))
      .build();
    assertEquals(resourceRecordUpdateInputRdataRdataMxRecordModel.exchange(), "mail.example.com");
    assertEquals(resourceRecordUpdateInputRdataRdataMxRecordModel.preference(), Long.valueOf("10"));

    String json = TestUtilities.serialize(resourceRecordUpdateInputRdataRdataMxRecordModel);

    ResourceRecordUpdateInputRdataRdataMxRecord resourceRecordUpdateInputRdataRdataMxRecordModelNew = TestUtilities.deserialize(json, ResourceRecordUpdateInputRdataRdataMxRecord.class);
    assertTrue(resourceRecordUpdateInputRdataRdataMxRecordModelNew instanceof ResourceRecordUpdateInputRdataRdataMxRecord);
    assertEquals(resourceRecordUpdateInputRdataRdataMxRecordModelNew.exchange(), "mail.example.com");
    assertEquals(resourceRecordUpdateInputRdataRdataMxRecordModelNew.preference(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordUpdateInputRdataRdataMxRecordError() throws Throwable {
    new ResourceRecordUpdateInputRdataRdataMxRecord.Builder().build();
  }

}