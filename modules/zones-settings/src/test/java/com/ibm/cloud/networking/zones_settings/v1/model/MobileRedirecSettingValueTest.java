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

import com.ibm.cloud.networking.zones_settings.v1.model.MobileRedirecSettingValue;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MobileRedirecSettingValue model.
 */
public class MobileRedirecSettingValueTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMobileRedirecSettingValue() throws Throwable {
    MobileRedirecSettingValue mobileRedirecSettingValueModel = new MobileRedirecSettingValue.Builder()
      .status("true")
      .mobileSubdomain("m")
      .stripUri(false)
      .build();
    assertEquals(mobileRedirecSettingValueModel.status(), "true");
    assertEquals(mobileRedirecSettingValueModel.mobileSubdomain(), "m");
    assertEquals(mobileRedirecSettingValueModel.stripUri(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(mobileRedirecSettingValueModel);

    MobileRedirecSettingValue mobileRedirecSettingValueModelNew = TestUtilities.deserialize(json, MobileRedirecSettingValue.class);
    assertTrue(mobileRedirecSettingValueModelNew instanceof MobileRedirecSettingValue);
    assertEquals(mobileRedirecSettingValueModelNew.status(), "true");
    assertEquals(mobileRedirecSettingValueModelNew.mobileSubdomain(), "m");
    assertEquals(mobileRedirecSettingValueModelNew.stripUri(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMobileRedirecSettingValueError() throws Throwable {
    new MobileRedirecSettingValue.Builder().build();
  }

}