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

import com.ibm.cloud.networking.dns_svcs.v1.model.CreateResourceRecordOptions;
import com.ibm.cloud.networking.dns_svcs.v1.model.ResourceRecordInputRdataRdataARecord;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateResourceRecordOptions model.
 */
public class CreateResourceRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateResourceRecordOptions() throws Throwable {
    ResourceRecordInputRdataRdataARecord resourceRecordInputRdataModel = new ResourceRecordInputRdataRdataARecord.Builder()
      .ip("10.110.201.214")
      .build();
    assertEquals(resourceRecordInputRdataModel.ip(), "10.110.201.214");

    CreateResourceRecordOptions createResourceRecordOptionsModel = new CreateResourceRecordOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .name("test.example.com")
      .type("SRV")
      .rdata(resourceRecordInputRdataModel)
      .ttl(Long.valueOf("120"))
      .service("_sip")
      .protocol("udp")
      .xCorrelationId("testString")
      .build();
    assertEquals(createResourceRecordOptionsModel.instanceId(), "testString");
    assertEquals(createResourceRecordOptionsModel.dnszoneId(), "testString");
    assertEquals(createResourceRecordOptionsModel.name(), "test.example.com");
    assertEquals(createResourceRecordOptionsModel.type(), "SRV");
    assertEquals(createResourceRecordOptionsModel.rdata(), resourceRecordInputRdataModel);
    assertEquals(createResourceRecordOptionsModel.ttl(), Long.valueOf("120"));
    assertEquals(createResourceRecordOptionsModel.service(), "_sip");
    assertEquals(createResourceRecordOptionsModel.protocol(), "udp");
    assertEquals(createResourceRecordOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateResourceRecordOptionsError() throws Throwable {
    new CreateResourceRecordOptions.Builder().build();
  }

}