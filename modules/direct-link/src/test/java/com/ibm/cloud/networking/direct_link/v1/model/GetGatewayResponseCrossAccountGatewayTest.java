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

import com.ibm.cloud.networking.direct_link.v1.model.CrossAccountGatewayPort;
import com.ibm.cloud.networking.direct_link.v1.model.GetGatewayResponseCrossAccountGateway;
import com.ibm.cloud.networking.direct_link.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetGatewayResponseCrossAccountGateway model.
 */
public class GetGatewayResponseCrossAccountGatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetGatewayResponseCrossAccountGateway() throws Throwable {
    GetGatewayResponseCrossAccountGateway getGatewayResponseCrossAccountGatewayModel = new GetGatewayResponseCrossAccountGateway();
    assertNull(getGatewayResponseCrossAccountGatewayModel.getBgpStatus());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getBgpStatusUpdatedAt());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getConnectionMode());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getCreatedAt());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getCrn());
    assertNull(getGatewayResponseCrossAccountGatewayModel.isCrossAccount());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getCrossConnectRouter());
    assertNull(getGatewayResponseCrossAccountGatewayModel.isGlobal());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getId());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getLinkStatus());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getLinkStatusUpdatedAt());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getLocationDisplayName());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getLocationName());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getName());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getOperationalStatus());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getPort());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getSpeedMbps());
    assertNull(getGatewayResponseCrossAccountGatewayModel.getType());
  }
}