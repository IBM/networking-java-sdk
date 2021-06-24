/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Location of GRE tunnel.  This field only applies to network type 'gre_tunnel' connections.
 */
public class TransitGatewayConnectionCustZone extends GenericModel {

  protected String name;

  /**
   * Gets the name.
   *
   * Availability zone name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

