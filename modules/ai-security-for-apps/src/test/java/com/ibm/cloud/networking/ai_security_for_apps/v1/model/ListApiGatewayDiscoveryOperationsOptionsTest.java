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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import com.ibm.cloud.networking.ai_security_for_apps.v1.model.ListApiGatewayDiscoveryOperationsOptions;
import com.ibm.cloud.networking.ai_security_for_apps.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListApiGatewayDiscoveryOperationsOptions model.
 */
public class ListApiGatewayDiscoveryOperationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListApiGatewayDiscoveryOperationsOptions() throws Throwable {
    ListApiGatewayDiscoveryOperationsOptions listApiGatewayDiscoveryOperationsOptionsModel = new ListApiGatewayDiscoveryOperationsOptions.Builder()
      .diff(true)
      .direction("asc")
      .endpoint("testString")
      .host(java.util.Arrays.asList("testString"))
      .method(java.util.Arrays.asList("testString"))
      .order("host")
      .origin("ML")
      .state("review")
      .page(Long.valueOf("1"))
      .perPage(Long.valueOf("1"))
      .build();
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.diff(), Boolean.valueOf(true));
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.direction(), "asc");
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.endpoint(), "testString");
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.host(), java.util.Arrays.asList("testString"));
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.method(), java.util.Arrays.asList("testString"));
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.order(), "host");
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.origin(), "ML");
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.state(), "review");
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.page(), Long.valueOf("1"));
    assertEquals(listApiGatewayDiscoveryOperationsOptionsModel.perPage(), Long.valueOf("1"));
  }
}