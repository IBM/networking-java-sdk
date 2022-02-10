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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * route report connection.
 */
public class RouteReportConnection extends GenericModel {

  protected List<RouteReportConnectionBgp> bgps;
  protected String id;
  protected String name;
  protected List<RouteReportConnectionRoute> routes;
  protected String type;

  /**
   * Gets the bgps.
   *
   * Array of connection's bgps.
   *
   * @return the bgps
   */
  public List<RouteReportConnectionBgp> getBgps() {
    return bgps;
  }

  /**
   * Gets the id.
   *
   * connection ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * connection name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the routes.
   *
   * Array of connection's routes.
   *
   * @return the routes
   */
  public List<RouteReportConnectionRoute> getRoutes() {
    return routes;
  }

  /**
   * Gets the type.
   *
   * connection type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

