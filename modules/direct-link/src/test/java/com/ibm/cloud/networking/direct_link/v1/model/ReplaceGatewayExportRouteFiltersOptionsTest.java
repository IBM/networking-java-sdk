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
import com.ibm.cloud.networking.direct_link.v1.model.GatewayTemplateRouteFilter;
import com.ibm.cloud.networking.direct_link.v1.model.ReplaceGatewayExportRouteFiltersOptions;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceGatewayExportRouteFiltersOptions model.
 */
public class ReplaceGatewayExportRouteFiltersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceGatewayExportRouteFiltersOptions() throws Throwable {
    GatewayTemplateRouteFilter gatewayTemplateRouteFilterModel = new GatewayTemplateRouteFilter.Builder()
      .action("permit")
      .ge(Long.valueOf("25"))
      .le(Long.valueOf("30"))
      .prefix("192.168.100.0/24")
      .build();
    assertEquals(gatewayTemplateRouteFilterModel.action(), "permit");
    assertEquals(gatewayTemplateRouteFilterModel.ge(), Long.valueOf("25"));
    assertEquals(gatewayTemplateRouteFilterModel.le(), Long.valueOf("30"));
    assertEquals(gatewayTemplateRouteFilterModel.prefix(), "192.168.100.0/24");

    ReplaceGatewayExportRouteFiltersOptions replaceGatewayExportRouteFiltersOptionsModel = new ReplaceGatewayExportRouteFiltersOptions.Builder()
      .gatewayId("0a06fb9b-820f-4c44-8a31-77f1f0806d28")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .exportRouteFilters(java.util.Arrays.asList(gatewayTemplateRouteFilterModel))
      .build();
    assertEquals(replaceGatewayExportRouteFiltersOptionsModel.gatewayId(), "0a06fb9b-820f-4c44-8a31-77f1f0806d28");
    assertEquals(replaceGatewayExportRouteFiltersOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
    assertEquals(replaceGatewayExportRouteFiltersOptionsModel.exportRouteFilters(), java.util.Arrays.asList(gatewayTemplateRouteFilterModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceGatewayExportRouteFiltersOptionsError() throws Throwable {
    new ReplaceGatewayExportRouteFiltersOptions.Builder().build();
  }

}