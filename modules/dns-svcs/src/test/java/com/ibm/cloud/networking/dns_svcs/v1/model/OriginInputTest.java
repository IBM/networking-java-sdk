/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.dns_svcs.v1.model.OriginInput;
import com.ibm.cloud.networking.dns_svcs.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OriginInput model.
 */
public class OriginInputTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOriginInput() throws Throwable {
    OriginInput originInputModel = new OriginInput.Builder()
      .name("app-server-1")
      .description("description of the origin server")
      .address("10.10.16.8")
      .enabled(true)
      .build();
    assertEquals(originInputModel.name(), "app-server-1");
    assertEquals(originInputModel.description(), "description of the origin server");
    assertEquals(originInputModel.address(), "10.10.16.8");
    assertEquals(originInputModel.enabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(originInputModel);

    OriginInput originInputModelNew = TestUtilities.deserialize(json, OriginInput.class);
    assertTrue(originInputModelNew instanceof OriginInput);
    assertEquals(originInputModelNew.name(), "app-server-1");
    assertEquals(originInputModelNew.description(), "description of the origin server");
    assertEquals(originInputModelNew.address(), "10.10.16.8");
    assertEquals(originInputModelNew.enabled(), Boolean.valueOf(true));
  }
}