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
import com.ibm.cloud.networking.direct_link.v1.model.Gateway;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayBfdConfig;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayChangeRequestGatewayClientGatewayCreate;
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
 * Unit test class for the Gateway model.
 */
public class GatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGateway() throws Throwable {
    Gateway gatewayModel = new Gateway();
    assertNull(gatewayModel.getAsPrepends());
    assertNull(gatewayModel.getAuthenticationKey());
    assertNull(gatewayModel.getBfdConfig());
    assertNull(gatewayModel.getBgpAsn());
    assertNull(gatewayModel.getBgpBaseCidr());
    assertNull(gatewayModel.getBgpCerCidr());
    assertNull(gatewayModel.getBgpIbmAsn());
    assertNull(gatewayModel.getBgpIbmCidr());
    assertNull(gatewayModel.getBgpStatus());
    assertNull(gatewayModel.getBgpStatusUpdatedAt());
    assertNull(gatewayModel.getCarrierName());
    assertNull(gatewayModel.getChangeRequest());
    assertNull(gatewayModel.getCompletionNoticeRejectReason());
    assertNull(gatewayModel.getConnectionMode());
    assertNull(gatewayModel.getCreatedAt());
    assertNull(gatewayModel.getCrn());
    assertNull(gatewayModel.isCrossAccount());
    assertNull(gatewayModel.getCrossConnectRouter());
    assertNull(gatewayModel.getCustomerName());
    assertNull(gatewayModel.getDefaultExportRouteFilter());
    assertNull(gatewayModel.getDefaultImportRouteFilter());
    assertNull(gatewayModel.isGlobal());
    assertNull(gatewayModel.getId());
    assertNull(gatewayModel.getLinkStatus());
    assertNull(gatewayModel.getLinkStatusUpdatedAt());
    assertNull(gatewayModel.getLocationDisplayName());
    assertNull(gatewayModel.getLocationName());
    assertNull(gatewayModel.getMacsec());
    assertNull(gatewayModel.getMacsecCapability());
    assertNull(gatewayModel.isMetered());
    assertNull(gatewayModel.getName());
    assertNull(gatewayModel.getOperationalStatus());
    assertNull(gatewayModel.getOperationalStatusReasons());
    assertNull(gatewayModel.getPatchPanelCompletionNotice());
    assertNull(gatewayModel.getPort());
    assertNull(gatewayModel.isProviderApiManaged());
    assertNull(gatewayModel.getResourceGroup());
    assertNull(gatewayModel.getSpeedMbps());
    assertNull(gatewayModel.getType());
    assertNull(gatewayModel.getVlan());
  }
}