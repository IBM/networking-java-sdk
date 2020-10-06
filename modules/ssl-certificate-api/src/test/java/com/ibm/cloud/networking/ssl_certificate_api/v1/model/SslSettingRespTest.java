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

package com.ibm.cloud.networking.ssl_certificate_api.v1.model;

import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSetting;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.SslSettingResp;
import com.ibm.cloud.networking.ssl_certificate_api.v1.model.Tls12SettingRespMessagesItem;
import com.ibm.cloud.networking.ssl_certificate_api.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SslSettingResp model.
 */
public class SslSettingRespTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSslSettingResp() throws Throwable {
    SslSettingResp sslSettingRespModel = new SslSettingResp();
    assertNull(sslSettingRespModel.isSuccess());
    assertNull(sslSettingRespModel.getResult());
    assertNull(sslSettingRespModel.getErrors());
    assertNull(sslSettingRespModel.getMessages());
  }
}