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

import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4Resp;
import com.ibm.cloud.networking.zones_settings.v1.model.PseudoIpv4RespResult;
import com.ibm.cloud.networking.zones_settings.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PseudoIpv4Resp model.
 */
public class PseudoIpv4RespTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPseudoIpv4Resp() throws Throwable {
    PseudoIpv4Resp pseudoIpv4RespModel = new PseudoIpv4Resp();
    assertNull(pseudoIpv4RespModel.getResult());
    assertNull(pseudoIpv4RespModel.isSuccess());
    assertNull(pseudoIpv4RespModel.getErrors());
    assertNull(pseudoIpv4RespModel.getMessages());
  }
}