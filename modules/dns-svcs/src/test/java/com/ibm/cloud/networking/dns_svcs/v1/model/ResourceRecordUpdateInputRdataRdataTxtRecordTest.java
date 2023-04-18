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
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataTxtRecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceRecordUpdateInputRdataRdataTxtRecord model.
 */
public class ResourceRecordUpdateInputRdataRdataTxtRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceRecordUpdateInputRdataRdataTxtRecord() throws Throwable {
    ResourceRecordUpdateInputRdataRdataTxtRecord resourceRecordUpdateInputRdataRdataTxtRecordModel = new ResourceRecordUpdateInputRdataRdataTxtRecord.Builder()
      .text("This is a text record")
      .build();
    assertEquals(resourceRecordUpdateInputRdataRdataTxtRecordModel.text(), "This is a text record");

    String json = TestUtilities.serialize(resourceRecordUpdateInputRdataRdataTxtRecordModel);

    ResourceRecordUpdateInputRdataRdataTxtRecord resourceRecordUpdateInputRdataRdataTxtRecordModelNew = TestUtilities.deserialize(json, ResourceRecordUpdateInputRdataRdataTxtRecord.class);
    assertTrue(resourceRecordUpdateInputRdataRdataTxtRecordModelNew instanceof ResourceRecordUpdateInputRdataRdataTxtRecord);
    assertEquals(resourceRecordUpdateInputRdataRdataTxtRecordModelNew.text(), "This is a text record");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceRecordUpdateInputRdataRdataTxtRecordError() throws Throwable {
    new ResourceRecordUpdateInputRdataRdataTxtRecord.Builder().build();
  }

}