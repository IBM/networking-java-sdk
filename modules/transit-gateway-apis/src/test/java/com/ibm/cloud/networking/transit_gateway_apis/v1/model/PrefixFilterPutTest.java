/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PrefixFilterPut;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrefixFilterPut model.
 */
public class PrefixFilterPutTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrefixFilterPut() throws Throwable {
    PrefixFilterPut prefixFilterPutModel = new PrefixFilterPut.Builder()
      .action("permit")
      .ge(Long.valueOf("0"))
      .le(Long.valueOf("32"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(prefixFilterPutModel.action(), "permit");
    assertEquals(prefixFilterPutModel.ge(), Long.valueOf("0"));
    assertEquals(prefixFilterPutModel.le(), Long.valueOf("32"));
    assertEquals(prefixFilterPutModel.prefix(), "192.168.100.0/24");

    String json = TestUtilities.serialize(prefixFilterPutModel);

    PrefixFilterPut prefixFilterPutModelNew = TestUtilities.deserialize(json, PrefixFilterPut.class);
    assertTrue(prefixFilterPutModelNew instanceof PrefixFilterPut);
    assertEquals(prefixFilterPutModelNew.action(), "permit");
    assertEquals(prefixFilterPutModelNew.ge(), Long.valueOf("0"));
    assertEquals(prefixFilterPutModelNew.le(), Long.valueOf("32"));
    assertEquals(prefixFilterPutModelNew.prefix(), "192.168.100.0/24");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrefixFilterPutError() throws Throwable {
    new PrefixFilterPut.Builder().build();
  }

}