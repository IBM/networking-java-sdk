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
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayMacsecStatusReason;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayPortReference;
import com.ibm.cloud.networking.direct_link.v1.model.GatewayStatusReason;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponseGateway;
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
 * Unit test class for the GetGatewayResponseGateway model.
 */
public class GetGatewayResponseGatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetGatewayResponseGateway() throws Throwable {
    GetGatewayResponseGateway getGatewayResponseGatewayModel = new GetGatewayResponseGateway();
    assertNull(getGatewayResponseGatewayModel.getAsPrepends());
    assertNull(getGatewayResponseGatewayModel.getAuthenticationKey());
    assertNull(getGatewayResponseGatewayModel.getBfdConfig());
    assertNull(getGatewayResponseGatewayModel.getBgpAsn());
    assertNull(getGatewayResponseGatewayModel.getBgpBaseCidr());
    assertNull(getGatewayResponseGatewayModel.getBgpCerCidr());
    assertNull(getGatewayResponseGatewayModel.getBgpIbmAsn());
    assertNull(getGatewayResponseGatewayModel.getBgpIbmCidr());
    assertNull(getGatewayResponseGatewayModel.getBgpStatus());
    assertNull(getGatewayResponseGatewayModel.getBgpStatusUpdatedAt());
    assertNull(getGatewayResponseGatewayModel.getCarrierName());
    assertNull(getGatewayResponseGatewayModel.getChangeRequest());
    assertNull(getGatewayResponseGatewayModel.getCompletionNoticeRejectReason());
    assertNull(getGatewayResponseGatewayModel.getConnectionMode());
    assertNull(getGatewayResponseGatewayModel.getCreatedAt());
    assertNull(getGatewayResponseGatewayModel.getCrn());
    assertNull(getGatewayResponseGatewayModel.isCrossAccount());
    assertNull(getGatewayResponseGatewayModel.getCrossConnectRouter());
    assertNull(getGatewayResponseGatewayModel.getCustomerName());
    assertNull(getGatewayResponseGatewayModel.getDefaultExportRouteFilter());
    assertNull(getGatewayResponseGatewayModel.getDefaultImportRouteFilter());
    assertNull(getGatewayResponseGatewayModel.isGlobal());
    assertNull(getGatewayResponseGatewayModel.getId());
    assertNull(getGatewayResponseGatewayModel.getLinkStatus());
    assertNull(getGatewayResponseGatewayModel.getLinkStatusUpdatedAt());
    assertNull(getGatewayResponseGatewayModel.getLocationDisplayName());
    assertNull(getGatewayResponseGatewayModel.getLocationName());
    assertNull(getGatewayResponseGatewayModel.getMacsec());
    assertNull(getGatewayResponseGatewayModel.getMacsecCapability());
    assertNull(getGatewayResponseGatewayModel.isMetered());
    assertNull(getGatewayResponseGatewayModel.getName());
    assertNull(getGatewayResponseGatewayModel.getOperationalStatus());
    assertNull(getGatewayResponseGatewayModel.getOperationalStatusReasons());
    assertNull(getGatewayResponseGatewayModel.getPatchPanelCompletionNotice());
    assertNull(getGatewayResponseGatewayModel.getPort());
    assertNull(getGatewayResponseGatewayModel.isProviderApiManaged());
    assertNull(getGatewayResponseGatewayModel.getResourceGroup());
    assertNull(getGatewayResponseGatewayModel.getSpeedMbps());
    assertNull(getGatewayResponseGatewayModel.getType());
    assertNull(getGatewayResponseGatewayModel.getVlan());
  }
}