/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.networking.dns_svcs.v1.model.ImportResourceRecordsOptions;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportResourceRecordsOptions model.
 */
public class ImportResourceRecordsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportResourceRecordsOptions() throws Throwable {
    ImportResourceRecordsOptions importResourceRecordsOptionsModel = new ImportResourceRecordsOptions.Builder()
      .instanceId("testString")
      .dnszoneId("testString")
      .file(TestUtilities.createMockStream("This is a mock file."))
      .fileContentType("testString")
      .xCorrelationId("testString")
      .build();
    assertEquals(importResourceRecordsOptionsModel.instanceId(), "testString");
    assertEquals(importResourceRecordsOptionsModel.dnszoneId(), "testString");
    assertEquals(IOUtils.toString(importResourceRecordsOptionsModel.file()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(importResourceRecordsOptionsModel.fileContentType(), "testString");
    assertEquals(importResourceRecordsOptionsModel.xCorrelationId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImportResourceRecordsOptionsError() throws Throwable {
    new ImportResourceRecordsOptions.Builder().build();
  }

}