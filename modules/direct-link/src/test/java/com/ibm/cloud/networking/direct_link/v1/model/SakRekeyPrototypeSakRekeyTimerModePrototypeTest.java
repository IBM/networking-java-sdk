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

import com.ibm.cloud.networking.direct_link.v1.model.SakRekeyPrototypeSakRekeyTimerModePrototype;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SakRekeyPrototypeSakRekeyTimerModePrototype model.
 */
public class SakRekeyPrototypeSakRekeyTimerModePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSakRekeyPrototypeSakRekeyTimerModePrototype() throws Throwable {
    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeSakRekeyTimerModePrototypeModel = new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder()
      .interval(Long.valueOf("3600"))
      .mode("timer")
      .build();
    assertEquals(sakRekeyPrototypeSakRekeyTimerModePrototypeModel.interval(), Long.valueOf("3600"));
    assertEquals(sakRekeyPrototypeSakRekeyTimerModePrototypeModel.mode(), "timer");

    String json = TestUtilities.serialize(sakRekeyPrototypeSakRekeyTimerModePrototypeModel);

    SakRekeyPrototypeSakRekeyTimerModePrototype sakRekeyPrototypeSakRekeyTimerModePrototypeModelNew = TestUtilities.deserialize(json, SakRekeyPrototypeSakRekeyTimerModePrototype.class);
    assertTrue(sakRekeyPrototypeSakRekeyTimerModePrototypeModelNew instanceof SakRekeyPrototypeSakRekeyTimerModePrototype);
    assertEquals(sakRekeyPrototypeSakRekeyTimerModePrototypeModelNew.interval(), Long.valueOf("3600"));
    assertEquals(sakRekeyPrototypeSakRekeyTimerModePrototypeModelNew.mode(), "timer");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSakRekeyPrototypeSakRekeyTimerModePrototypeError() throws Throwable {
    new SakRekeyPrototypeSakRekeyTimerModePrototype.Builder().build();
  }

}