/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.networking.mtls.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAccessCertificateOptions model.
 */
public class UpdateAccessCertificateOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAccessCertificateOptions() throws Throwable {
    UpdateAccessCertificateOptions updateAccessCertificateOptionsModel = new UpdateAccessCertificateOptions.Builder()
      .zoneId("testString")
      .certId("testString")
      .name("test-cert")
      .associatedHostnames(java.util.Arrays.asList("test.example.com"))
      .build();
    assertEquals(updateAccessCertificateOptionsModel.zoneId(), "testString");
    assertEquals(updateAccessCertificateOptionsModel.certId(), "testString");
    assertEquals(updateAccessCertificateOptionsModel.name(), "test-cert");
    assertEquals(updateAccessCertificateOptionsModel.associatedHostnames(), java.util.Arrays.asList("test.example.com"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessCertificateOptionsError() throws Throwable {
    new UpdateAccessCertificateOptions.Builder().build();
  }

}