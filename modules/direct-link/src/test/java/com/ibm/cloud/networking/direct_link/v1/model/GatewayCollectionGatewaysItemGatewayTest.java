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

package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.networking.direct_link.v1.model.AsPrepend;
import com.ibm.cloud.networking.direct_link.v1.model.AuthenticationKeyReferenceKeyProtectAuthenticationKeyReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayCreate;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayCollectionGatewaysItemGateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecStatusReason;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusReason;
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
 * Unit test class for the GatewayCollectionGatewaysItemGateway model.
 */
public class GatewayCollectionGatewaysItemGatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGatewayCollectionGatewaysItemGateway() throws Throwable {
    GatewayCollectionGatewaysItemGateway gatewayCollectionGatewaysItemGatewayModel = new GatewayCollectionGatewaysItemGateway();
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getAsPrepends());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getAuthenticationKey());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBfdConfig());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpAsn());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpBaseCidr());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpCerCidr());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpIbmAsn());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpIbmCidr());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpStatus());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getBgpStatusUpdatedAt());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCarrierName());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getChangeRequest());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCompletionNoticeRejectReason());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getConnectionMode());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCreatedAt());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCrn());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.isCrossAccount());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCrossConnectRouter());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getCustomerName());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getDefaultExportRouteFilter());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getDefaultImportRouteFilter());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.isGlobal());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getId());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getLinkStatus());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getLinkStatusUpdatedAt());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getLocationDisplayName());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getLocationName());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getMacsec());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getMacsecCapability());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.isMetered());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getName());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getOperationalStatus());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getOperationalStatusReasons());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getPatchPanelCompletionNotice());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getPort());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.isProviderApiManaged());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getResourceGroup());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getSpeedMbps());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getType());
    assertNull(gatewayCollectionGatewaysItemGatewayModel.getVlan());
  }
}