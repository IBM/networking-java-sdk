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
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataAaaaRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordUpdateInputRdataRdataAaaaRecord model.
 */
public class ResourceRecordUpdateInputRdataRdataAaaaRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordUpdateInputRdataRdataAaaaRecord() throws Throwable {
    ResourceRecordUpdateInputRdataRdataAaaaRecord resourceRecordUpdateInputRdataRdataAaaaRecordModel = new ResourceRecordUpdateInputRdataRdataAaaaRecord.Builder()
      .ip("2019::2019")
      .build();
    assertEquals(resourceRecordUpdateInputRdataRdataAaaaRecordModel.ip(), "2019::2019");

    String json = TestUtilities.serialize(resourceRecordUpdateInputRdataRdataAaaaRecordModel);

    ResourceRecordUpdateInputRdataRdataAaaaRecord resourceRecordUpdateInputRdataRdataAaaaRecordModelNew = TestUtilities.deserialize(json, ResourceRecordUpdateInputRdataRdataAaaaRecord.class);
    assertTrue(resourceRecordUpdateInputRdataRdataAaaaRecordModelNew instanceof ResourceRecordUpdateInputRdataRdataAaaaRecord);
    assertEquals(resourceRecordUpdateInputRdataRdataAaaaRecordModelNew.ip(), "2019::2019");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordUpdateInputRdataRdataAaaaRecordError() throws Throwable {
    new ResourceRecordUpdateInputRdataRdataAaaaRecord.Builder().build();
  }

}