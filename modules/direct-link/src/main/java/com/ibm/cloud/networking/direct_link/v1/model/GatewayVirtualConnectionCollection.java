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
 * Virtual connection collection.
 */
public class GatewayVirtualConnectionCollection extends GenericModel {

  @SerializedName("virtual_connections")
  protected List<GatewayVirtualConnection> virtualConnections;

  /**
   * Gets the virtualConnections.
   *
   * virtual connection array.
   *
   * @return the virtualConnections
   */
  public List<GatewayVirtualConnection> getVirtualConnections() {
    return virtualConnections;
  }
}

