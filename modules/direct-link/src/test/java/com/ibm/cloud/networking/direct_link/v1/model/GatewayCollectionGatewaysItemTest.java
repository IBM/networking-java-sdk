/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.networking.direct_link.v1.model.AsPrepend;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayAuthenticationKey;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayCreate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItem;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigActiveCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigFallbackCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecConfigPrimaryCak;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPort;
import com.ibm.cloud.networking.direct_link.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GatewayCollectionGatewaysItem model.
 */
public class GatewayCollectionGatewaysItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  // TODO: Add tests for models that are abstract
  @Test
  public void testGatewayCollectionGatewaysItem() throws Throwable {
    GatewayCollectionGatewaysItem gatewayCollectionGatewaysItemModel = new GatewayCollectionGatewaysItem();
    assertNotNull(gatewayCollectionGatewaysItemModel);
  }
}