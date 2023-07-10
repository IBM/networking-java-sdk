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
import com.ibm.cloud.networking.mtls.v1.model.CreateAccessCertificateOptions;
import com.ibm.cloud.networking.mtls.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateAccessCertificateOptions model.
 */
public class CreateAccessCertificateOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateAccessCertificateOptions() throws Throwable {
    CreateAccessCertificateOptions createAccessCertificateOptionsModel = new CreateAccessCertificateOptions.Builder()
      .zoneId("testString")
      .name("test-cert")
      .certificate("-----BEGIN CERTIFICATE-----\nMIIGAjCCA+qgAwIBAgIJAI7kymlF7CWT...N4RI7KKB7nikiuUf8vhULKy5IX10\nDrUtmu/B\n-----END CERTIFICATE-----")
      .associatedHostnames(java.util.Arrays.asList("test.example.com"))
      .build();
    assertEquals(createAccessCertificateOptionsModel.zoneId(), "testString");
    assertEquals(createAccessCertificateOptionsModel.name(), "test-cert");
    assertEquals(createAccessCertificateOptionsModel.certificate(), "-----BEGIN CERTIFICATE-----\nMIIGAjCCA+qgAwIBAgIJAI7kymlF7CWT...N4RI7KKB7nikiuUf8vhULKy5IX10\nDrUtmu/B\n-----END CERTIFICATE-----");
    assertEquals(createAccessCertificateOptionsModel.associatedHostnames(), java.util.Arrays.asList("test.example.com"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAccessCertificateOptionsError() throws Throwable {
    new CreateAccessCertificateOptions.Builder().build();
  }

}