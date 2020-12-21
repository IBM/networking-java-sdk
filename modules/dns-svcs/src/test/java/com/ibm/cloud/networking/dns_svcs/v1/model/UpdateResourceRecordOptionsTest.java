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

import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordUpdateInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.model.UpdateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateResourceRecordOptions model.
 */
public class UpdateResourceRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateResourceRecordOptions() throws Throwable {
    ResourceRecordUpdateInputRdataRdataARecord resourceRecordUpdateInputRdataModel = new ResourceRecordUpdateInputRdataRdataARecord.Builder()
      .ip("10.110.201.214")
      .build();
    assertEquals(resourceRecordUpdateInputRdataModel.ip(), "10.110.201.214");

    UpdateResourceRecordOptions updateResourceRecordOptionsModel = new UpdateResourceRecordOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .recordId("testString")
      .name("test.example.com")
      .rdata(resourceRecordUpdateInputRdataModel)
      .ttl(Long.valueOf("120"))
      .service("_sip")
      .protocol("udp")
      .xCorrelationId("testString")
      .build();
    assertEquals(updateResourceRecordOptionsModel.instanceId(), "testString");
    assertEquals(updateResourceRecordOptionsModel.dnszoneId(), "testString");
    assertEquals(updateResourceRecordOptionsModel.recordId(), "testString");
    assertEquals(updateResourceRecordOptionsModel.name(), "test.example.com");
    assertEquals(updateResourceRecordOptionsModel.rdata(), resourceRecordUpdateInputRdataModel);
    assertEquals(updateResourceRecordOptionsModel.ttl(), Long.valueOf("120"));
    assertEquals(updateResourceRecordOptionsModel.service(), "_sip");
    assertEquals(updateResourceRecordOptionsModel.protocol(), "udp");
    assertEquals(updateResourceRecordOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateResourceRecordOptionsError() throws Throwable {
    new UpdateResourceRecordOptions.Builder().build();
  }

}