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

package com.ibm.cloud.networking.zones.v1.model;

import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckResp;
import com.ibm.cloud.networking.zones.v1.model.ZoneActivationcheckRespResult;
import com.ibm.cloud.networking.zones.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ZoneActivationcheckResp model.
 */
public class ZoneActivationcheckRespTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testZoneActivationcheckResp() throws Throwable {
    ZoneActivationcheckResp zoneActivationcheckRespModel = new ZoneActivationcheckResp();
    assertNull(zoneActivationcheckRespModel.isSuccess());
    assertNull(zoneActivationcheckRespModel.getErrors());
    assertNull(zoneActivationcheckRespModel.getMessages());
    assertNull(zoneActivationcheckRespModel.getResult());
  }
}