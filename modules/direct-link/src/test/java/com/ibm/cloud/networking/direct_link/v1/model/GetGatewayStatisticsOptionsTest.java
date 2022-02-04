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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayStatisticsOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetGatewayStatisticsOptions model.
 */
public class GetGatewayStatisticsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetGatewayStatisticsOptions() throws Throwable {
    GetGatewayStatisticsOptions getGatewayStatisticsOptionsModel = new GetGatewayStatisticsOptions.Builder()
      .id("testString")
      .type("macsec_mka_session")
      .build();
    assertEquals(getGatewayStatisticsOptionsModel.id(), "testString");
    assertEquals(getGatewayStatisticsOptionsModel.type(), "macsec_mka_session");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGatewayStatisticsOptionsError() throws Throwable {
    new GetGatewayStatisticsOptions.Builder().build();
  }

}