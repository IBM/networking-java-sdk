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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionCust;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayTunnel;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.ZoneReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TransitGatewayConnectionCust model.
 */
public class TransitGatewayConnectionCustTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitGatewayConnectionCust() throws Throwable {
    TransitGatewayConnectionCust transitGatewayConnectionCustModel = new TransitGatewayConnectionCust();
    assertNull(transitGatewayConnectionCustModel.getBaseConnectionId());
    assertNull(transitGatewayConnectionCustModel.getBaseNetworkType());
    assertNull(transitGatewayConnectionCustModel.getCidr());
    assertNull(transitGatewayConnectionCustModel.getCreatedAt());
    assertNull(transitGatewayConnectionCustModel.getId());
    assertNull(transitGatewayConnectionCustModel.getLocalBgpAsn());
    assertNull(transitGatewayConnectionCustModel.getLocalGatewayIp());
    assertNull(transitGatewayConnectionCustModel.getLocalTunnelIp());
    assertNull(transitGatewayConnectionCustModel.getMtu());
    assertNull(transitGatewayConnectionCustModel.getName());
    assertNull(transitGatewayConnectionCustModel.getNetworkAccountId());
    assertNull(transitGatewayConnectionCustModel.getNetworkId());
    assertNull(transitGatewayConnectionCustModel.getNetworkType());
    assertNull(transitGatewayConnectionCustModel.getPrefixFilters());
    assertNull(transitGatewayConnectionCustModel.getPrefixFiltersDefault());
    assertNull(transitGatewayConnectionCustModel.getRemoteBgpAsn());
    assertNull(transitGatewayConnectionCustModel.getRemoteGatewayIp());
    assertNull(transitGatewayConnectionCustModel.getRemoteTunnelIp());
    assertNull(transitGatewayConnectionCustModel.getRequestStatus());
    assertNull(transitGatewayConnectionCustModel.getStatus());
    assertNull(transitGatewayConnectionCustModel.getTunnels());
    assertNull(transitGatewayConnectionCustModel.getUpdatedAt());
    assertNull(transitGatewayConnectionCustModel.getZone());
  }
}