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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Cross Connect Router details.
 */
public class CrossConnectRouter extends GenericModel {

  protected List<String> capabilities;
  @SerializedName("router_name")
  protected String routerName;
  @SerializedName("total_connections")
  protected Long totalConnections;

  /**
   * Gets the capabilities.
   *
   * Array of capabilities for this router.
   *
   * @return the capabilities
   */
  public List<String> getCapabilities() {
    return capabilities;
  }

  /**
   * Gets the routerName.
   *
   * The name of the Router.
   *
   * @return the routerName
   */
  public String getRouterName() {
    return routerName;
  }

  /**
   * Gets the totalConnections.
   *
   * Count of existing Direct Link Dedicated gateways on this router for this account.
   *
   * @return the totalConnections
   */
  public Long getTotalConnections() {
    return totalConnections;
  }
}

