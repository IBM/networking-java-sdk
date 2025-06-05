/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecPatch;
import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPatchSakRekeyTimerModePatch;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayMacsecPatch model.
 */
public class GatewayMacsecPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayMacsecPatch() throws Throwable {
    SakRekeyPatchSakRekeyTimerModePatch sakRekeyPatchModel = new SakRekeyPatchSakRekeyTimerModePatch.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();
    assertEquals(sakRekeyPatchModel.interval(), Long.valueOf("3600"));
    assertEquals(sakRekeyPatchModel.mode(), "timer");

    GatewayMacsecPatch gatewayMacsecPatchModel = new GatewayMacsecPatch.Builder()
      .active(true)
      .sakRekey(sakRekeyPatchModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();
    assertEquals(gatewayMacsecPatchModel.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecPatchModel.sakRekey(), sakRekeyPatchModel);
    assertEquals(gatewayMacsecPatchModel.securityPolicy(), "must_secure");
    assertEquals(gatewayMacsecPatchModel.windowSize(), Long.valueOf("64"));

    String json = TestUtilities.serialize(gatewayMacsecPatchModel);

    GatewayMacsecPatch gatewayMacsecPatchModelNew = TestUtilities.deserialize(json, GatewayMacsecPatch.class);
    assertTrue(gatewayMacsecPatchModelNew instanceof GatewayMacsecPatch);
    assertEquals(gatewayMacsecPatchModelNew.active(), Boolean.valueOf(true));
    assertEquals(gatewayMacsecPatchModelNew.sakRekey().toString(), sakRekeyPatchModel.toString());
    assertEquals(gatewayMacsecPatchModelNew.securityPolicy(), "must_secure");
    assertEquals(gatewayMacsecPatchModelNew.windowSize(), Long.valueOf("64"));
  }
  @Test
  public void testGatewayMacsecPatchAsPatch() throws Throwable {
    SakRekeyPatchSakRekeyTimerModePatch sakRekeyPatchModel = new SakRekeyPatchSakRekeyTimerModePatch.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();

    GatewayMacsecPatch gatewayMacsecPatchModel = new GatewayMacsecPatch.Builder()
      .active(true)
      .sakRekey(sakRekeyPatchModel)
      .securityPolicy("must_secure")
      .windowSize(Long.valueOf("64"))
      .build();

    Map<String, Object> mergePatch = gatewayMacsecPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("active"));
    assertTrue(mergePatch.containsKey("sak_rekey"));
    assertEquals(mergePatch.get("security_policy"), "must_secure");
    assertTrue(mergePatch.containsKey("window_size"));
  }

}