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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of all tunnels for `redundant_gre` and `vpn_gateway` connections.
 */
public class TransitGatewayTunnelCollection extends GenericModel {

  protected List<TransitGatewayTunnel> tunnels;

  protected TransitGatewayTunnelCollection() { }

  /**
   * Gets the tunnels.
   *
   * Collection of all tunnels for `redundant_gre` and `vpn_gateway` connections.
   *
   * @return the tunnels
   */
  public List<TransitGatewayTunnel> getTunnels() {
    return tunnels;
  }
}

