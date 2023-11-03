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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

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

  protected List<RouteReportConnection> connections;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  @SerializedName("overlapping_routes")
  protected List<RouteReportOverlappingRouteGroup> overlappingRoutes;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected RouteReport() { }

  /**
   * Gets the connections.
   *
   * Array of connections with their routes.
   *
   * @return the connections
   */
  public List<RouteReportConnection> getConnections() {
    return connections;
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
}

