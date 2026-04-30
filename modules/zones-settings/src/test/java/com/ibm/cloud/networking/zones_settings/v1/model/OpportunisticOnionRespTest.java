/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticOnionResp;
import com.ibm.cloud.networking.zones_settings.v1.model.OpportunisticOnionRespResult;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OpportunisticOnionResp model.
 */
public class OpportunisticOnionRespTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOpportunisticOnionResp() throws Throwable {
    OpportunisticOnionResp opportunisticOnionRespModel = new OpportunisticOnionResp();
    assertNull(opportunisticOnionRespModel.getResult());
    assertNull(opportunisticOnionRespModel.isSuccess());
    assertNull(opportunisticOnionRespModel.getErrors());
    assertNull(opportunisticOnionRespModel.getMessages());
  }
}