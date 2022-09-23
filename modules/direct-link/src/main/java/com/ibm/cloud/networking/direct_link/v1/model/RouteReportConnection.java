/*
 * (C) Copyright IBM Corp. 2022.
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
 * Routes of a virtual connection.
 */
public class RouteReportConnection extends GenericModel {

  protected List<RouteReportRoute> routes;
  @SerializedName("virtual_connection_id")
  protected String virtualConnectionId;
  @SerializedName("virtual_connection_name")
  protected String virtualConnectionName;
  @SerializedName("virtual_connection_type")
  protected String virtualConnectionType;

  /**
   * Gets the routes.
   *
   * Array of virtual connection's routes.
   *
   * @return the routes
   */
  public List<RouteReportRoute> getRoutes() {
    return routes;
  }

  /**
   * Gets the virtualConnectionId.
   *
   * ID of virtual connection.
   *
   * @return the virtualConnectionId
   */
  public String getVirtualConnectionId() {
    return virtualConnectionId;
  }

  /**
   * Gets the virtualConnectionName.
   *
   * name of virtual connection.
   *
   * @return the virtualConnectionName
   */
  public String getVirtualConnectionName() {
    return virtualConnectionName;
  }

  /**
   * Gets the virtualConnectionType.
   *
   * type of virtual connection.
   *
   * @return the virtualConnectionType
   */
  public String getVirtualConnectionType() {
    return virtualConnectionType;
  }
}

