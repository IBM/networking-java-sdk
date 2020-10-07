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

package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderSettingValue;
import com.ibm.cloud.networking.zones_settings.v1.model.SecurityHeaderSettingValueStrictTransportSecurity;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityHeaderSettingValue model.
 */
public class SecurityHeaderSettingValueTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityHeaderSettingValue() throws Throwable {
    SecurityHeaderSettingValueStrictTransportSecurity securityHeaderSettingValueStrictTransportSecurityModel = new SecurityHeaderSettingValueStrictTransportSecurity.Builder()
      .enabled(true)
      .maxAge(Long.valueOf("86400"))
      .includeSubdomains(true)
      .nosniff(true)
      .build();
    assertEquals(securityHeaderSettingValueStrictTransportSecurityModel.enabled(), Boolean.valueOf(true));
    assertEquals(securityHeaderSettingValueStrictTransportSecurityModel.maxAge(), Long.valueOf("86400"));
    assertEquals(securityHeaderSettingValueStrictTransportSecurityModel.includeSubdomains(), Boolean.valueOf(true));
    assertEquals(securityHeaderSettingValueStrictTransportSecurityModel.nosniff(), Boolean.valueOf(true));

    SecurityHeaderSettingValue securityHeaderSettingValueModel = new SecurityHeaderSettingValue.Builder()
      .strictTransportSecurity(securityHeaderSettingValueStrictTransportSecurityModel)
      .build();
    assertEquals(securityHeaderSettingValueModel.strictTransportSecurity(), securityHeaderSettingValueStrictTransportSecurityModel);

    String json = TestUtilities.serialize(securityHeaderSettingValueModel);

    SecurityHeaderSettingValue securityHeaderSettingValueModelNew = TestUtilities.deserialize(json, SecurityHeaderSettingValue.class);
    assertTrue(securityHeaderSettingValueModelNew instanceof SecurityHeaderSettingValue);
    assertEquals(securityHeaderSettingValueModelNew.strictTransportSecurity().toString(), securityHeaderSettingValueStrictTransportSecurityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityHeaderSettingValueError() throws Throwable {
    new SecurityHeaderSettingValue.Builder().build();
  }

}