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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.networking.direct_link.v1.model.CreateGatewayExportRouteFilterOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateGatewayExportRouteFilterOptions model.
 */
public class CreateGatewayExportRouteFilterOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateGatewayExportRouteFilterOptions() throws Throwable {
    CreateGatewayExportRouteFilterOptions createGatewayExportRouteFilterOptionsModel = new CreateGatewayExportRouteFilterOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .action("permit")
      .prefix("192.168.100.0/24")
      .before("1a15dcab-7e40-45e1-b7c5-bc690eaa9782")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .build();
    assertEquals(createGatewayExportRouteFilterOptionsModel.gatewayId(), "0a06fb9b-820f-4c44-8a31-77f1f0806d28");
    assertEquals(createGatewayExportRouteFilterOptionsModel.action(), "permit");
    assertEquals(createGatewayExportRouteFilterOptionsModel.prefix(), "192.168.100.0/24");
    assertEquals(createGatewayExportRouteFilterOptionsModel.before(), "1a15dcab-7e40-45e1-b7c5-bc690eaa9782");
    assertEquals(createGatewayExportRouteFilterOptionsModel.ge(), Long.valueOf("25"));
    assertEquals(createGatewayExportRouteFilterOptionsModel.le(), Long.valueOf("30"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGatewayExportRouteFilterOptionsError() throws Throwable {
    new CreateGatewayExportRouteFilterOptions.Builder().build();
  }

}