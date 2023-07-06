/*
 * (C) Copyright IBM Corp. 2023.
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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * route report.
 */
public class RouteReport extends GenericModel {

  /**
   * Route report status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field must tolerate unexpected values.
   */
  public interface Status {
    /** complete. */
    String COMPLETE = "complete";
    /** pending. */
    String PENDING = "pending";
  }

  @SerializedName("advertised_routes")
  protected List<RouteReportAdvertisedRoute> advertisedRoutes;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("gateway_routes")
  protected List<RouteReportRoute> gatewayRoutes;
  protected String id;
  @SerializedName("on_prem_routes")
  protected List<RouteReportOnPremRoute> onPremRoutes;
  @SerializedName("overlapping_routes")
  protected List<RouteReportOverlappingRouteGroup> overlappingRoutes;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("virtual_connection_routes")
  protected List<RouteReportConnection> virtualConnectionRoutes;

  protected RouteReport() { }

  /**
   * Gets the advertisedRoutes.
   *
   * Array of connection prefixes advertised to the on-prem network. This parameter is not returned when the route
   * report was generated prior to inclusion of this parameter.
   *
   * @return the advertisedRoutes
   */
  public List<RouteReportAdvertisedRoute> getAdvertisedRoutes() {
    return advertisedRoutes;
  }

  /**
   * Gets the createdAt.
   *
   * Date and time route report was requested.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the gatewayRoutes.
   *
   * Array of local/direct routes.
   *
   * @return the gatewayRoutes
   */
  public List<RouteReportRoute> getGatewayRoutes() {
    return gatewayRoutes;
  }

  /**
   * Gets the id.
   *
   * Report identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the onPremRoutes.
   *
   * Array of on premises routes.
   *
   * @return the onPremRoutes
   */
  public List<RouteReportOnPremRoute> getOnPremRoutes() {
    return onPremRoutes;
  }

  /**
   * Gets the overlappingRoutes.
   *
   * Array of overlapping routes.
   *
   * @return the overlappingRoutes
   */
  public List<RouteReportOverlappingRouteGroup> getOverlappingRoutes() {
    return overlappingRoutes;
  }

  /**
   * Gets the status.
   *
   * Route report status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field must tolerate unexpected values.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the updatedAt.
   *
   * Date and time route report was last modified.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the virtualConnectionRoutes.
   *
   * Array of routes on virtual connections.
   *
   * @return the virtualConnectionRoutes
   */
  public List<RouteReportConnection> getVirtualConnectionRoutes() {
    return virtualConnectionRoutes;
  }
}

