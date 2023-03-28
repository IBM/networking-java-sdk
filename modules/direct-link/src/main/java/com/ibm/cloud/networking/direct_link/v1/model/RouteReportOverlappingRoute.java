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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * overlapping route details.
 *
 * Classes which extend this class:
 * - RouteReportOverlappingRouteForConnection
 * - RouteReportOverlappingRouteForOthers
 */
public class RouteReportOverlappingRoute extends GenericModel {

  /**
   * type of the route.
   */
  public interface Type {
    /** virtual_connection. */
    String VIRTUAL_CONNECTION = "virtual_connection";
  }

  protected String prefix;
  protected String type;
  @SerializedName("virtual_connection_id")
  protected String virtualConnectionId;

  protected RouteReportOverlappingRoute() { }

  /**
   * Gets the prefix.
   *
   * overlapping prefix.
   *
   * @return the prefix
   */
  public String getPrefix() {
    return prefix;
  }

  /**
   * Gets the type.
   *
   * type of the route.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the virtualConnectionId.
   *
   * virtual connection ID.
   *
   * @return the virtualConnectionId
   */
  public String getVirtualConnectionId() {
    return virtualConnectionId;
  }
}

