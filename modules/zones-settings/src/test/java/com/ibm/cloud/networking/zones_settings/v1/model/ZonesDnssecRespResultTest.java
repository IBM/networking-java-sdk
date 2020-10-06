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

import com.ibm.cloud.networking.zones_settings.v1.model.ZonesDnssecRespResult;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ZonesDnssecRespResult model.
 */
public class ZonesDnssecRespResultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testZonesDnssecRespResult() throws Throwable {
    ZonesDnssecRespResult zonesDnssecRespResultModel = new ZonesDnssecRespResult();
    assertNull(zonesDnssecRespResultModel.getStatus());
    assertNull(zonesDnssecRespResultModel.getFlags());
    assertNull(zonesDnssecRespResultModel.getAlgorithm());
    assertNull(zonesDnssecRespResultModel.getKeyType());
    assertNull(zonesDnssecRespResultModel.getDigestType());
    assertNull(zonesDnssecRespResultModel.getDigestAlgorithm());
    assertNull(zonesDnssecRespResultModel.getDigest());
    assertNull(zonesDnssecRespResultModel.getDs());
    assertNull(zonesDnssecRespResultModel.getKeyTag());
    assertNull(zonesDnssecRespResultModel.getPublicKey());
  }
}