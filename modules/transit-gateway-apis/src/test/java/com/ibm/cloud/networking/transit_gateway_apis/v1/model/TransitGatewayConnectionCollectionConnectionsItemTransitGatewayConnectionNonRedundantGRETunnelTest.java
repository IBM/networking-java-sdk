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
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel model.
 */
public class TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel() throws Throwable {
    TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel = new TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel();
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getBaseNetworkType());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getName());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getNetworkId());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getNetworkType());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getId());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getBaseConnectionId());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getCreatedAt());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getLocalBgpAsn());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getLocalGatewayIp());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getLocalTunnelIp());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getMtu());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getNetworkAccountId());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getPrefixFilters());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getPrefixFiltersDefault());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getRemoteBgpAsn());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getRemoteGatewayIp());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getRemoteTunnelIp());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getRequestStatus());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getStatus());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getUpdatedAt());
    assertNull(transitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGreTunnelModel.getZone());
  }
}