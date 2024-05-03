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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.GreTunnelZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.RgreTunnelZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayRedundantGRETunnelReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGatewayConnection model.
 */
public class TransitGatewayConnectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnection() throws Throwable {
    TransitGatewayConnection transitGatewayConnectionModel = new TransitGatewayConnection();
    assertNull(transitGatewayConnectionModel.getBaseNetworkType());
    assertNull(transitGatewayConnectionModel.getName());
    assertNull(transitGatewayConnectionModel.getNetworkId());
    assertNull(transitGatewayConnectionModel.getNetworkType());
    assertNull(transitGatewayConnectionModel.getId());
    assertNull(transitGatewayConnectionModel.getBaseConnectionId());
    assertNull(transitGatewayConnectionModel.getCreatedAt());
    assertNull(transitGatewayConnectionModel.getLocalBgpAsn());
    assertNull(transitGatewayConnectionModel.getLocalGatewayIp());
    assertNull(transitGatewayConnectionModel.getLocalTunnelIp());
    assertNull(transitGatewayConnectionModel.getMtu());
    assertNull(transitGatewayConnectionModel.getNetworkAccountId());
    assertNull(transitGatewayConnectionModel.getPrefixFilters());
    assertNull(transitGatewayConnectionModel.getPrefixFiltersDefault());
    assertNull(transitGatewayConnectionModel.getRemoteBgpAsn());
    assertNull(transitGatewayConnectionModel.getRemoteGatewayIp());
    assertNull(transitGatewayConnectionModel.getRemoteTunnelIp());
    assertNull(transitGatewayConnectionModel.getRequestStatus());
    assertNull(transitGatewayConnectionModel.getStatus());
    assertNull(transitGatewayConnectionModel.getTunnels());
    assertNull(transitGatewayConnectionModel.getUpdatedAt());
    assertNull(transitGatewayConnectionModel.getZone());
  }
}