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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ResourceGroupReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGateway;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGateway model.
 */
public class TransitGatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGateway() throws Throwable {
    TransitGateway transitGatewayModel = new TransitGateway();
    assertNull(transitGatewayModel.getConnectionCount());
    assertNull(transitGatewayModel.isConnectionNeedsAttention());
    assertNull(transitGatewayModel.getCreatedAt());
    assertNull(transitGatewayModel.getCrn());
    assertNull(transitGatewayModel.isGlobal());
    assertNull(transitGatewayModel.isGreEnhancedRoutePropagation());
    assertNull(transitGatewayModel.getId());
    assertNull(transitGatewayModel.getLocation());
    assertNull(transitGatewayModel.getName());
    assertNull(transitGatewayModel.getResourceGroup());
    assertNull(transitGatewayModel.getStatus());
    assertNull(transitGatewayModel.getUpdatedAt());
  }
}