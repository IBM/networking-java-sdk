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

import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationFirstConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.PaginationNextConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitConnectionCollection;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayConnectionPrefixFilterReference;
import com.ibm.cloud.networking.transit_gateway_apis.v1.model.TransitGatewayReference;
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
 * Unit test class for the TransitConnectionCollection model.
 */
public class TransitConnectionCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTransitConnectionCollection() throws Throwable {
    TransitConnectionCollection transitConnectionCollectionModel = new TransitConnectionCollection();
    assertNull(transitConnectionCollectionModel.getConnections());
    assertNull(transitConnectionCollectionModel.getFirst());
    assertNull(transitConnectionCollectionModel.getLimit());
    assertNull(transitConnectionCollectionModel.getNext());
  }
}