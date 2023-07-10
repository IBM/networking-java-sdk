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
import com.ibm.cloud.networking.mtls.v1.model.AccessCertSettingsInputArray;
import com.ibm.cloud.networking.mtls.v1.model.UpdateAccessCertSettingsOptions;
import com.ibm.cloud.networking.mtls.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAccessCertSettingsOptions model.
 */
public class UpdateAccessCertSettingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAccessCertSettingsOptions() throws Throwable {
    AccessCertSettingsInputArray accessCertSettingsInputArrayModel = new AccessCertSettingsInputArray.Builder()
      .hostname("test.example.com")
      .clientCertificateForwarding(true)
      .build();
    assertEquals(accessCertSettingsInputArrayModel.hostname(), "test.example.com");
    assertEquals(accessCertSettingsInputArrayModel.clientCertificateForwarding(), Boolean.valueOf(true));

    UpdateAccessCertSettingsOptions updateAccessCertSettingsOptionsModel = new UpdateAccessCertSettingsOptions.Builder()
      .zoneId("testString")
      .settings(java.util.Arrays.asList(accessCertSettingsInputArrayModel))
      .build();
    assertEquals(updateAccessCertSettingsOptionsModel.zoneId(), "testString");
    assertEquals(updateAccessCertSettingsOptionsModel.settings(), java.util.Arrays.asList(accessCertSettingsInputArrayModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAccessCertSettingsOptionsError() throws Throwable {
    new UpdateAccessCertSettingsOptions.Builder().build();
  }

}