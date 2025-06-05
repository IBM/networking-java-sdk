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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * overlapping route details.
 */
public class RouteReportOverlappingRoute extends GenericModel {

  @SerializedName("connection_id")
  protected String connectionId;
  protected String prefix;

  protected RouteReportOverlappingRoute() { }

  /**
   * Gets the connectionId.
   *
   * connection ID.
   *
   * @return the connectionId
   */
  public String getConnectionId() {
    return connectionId;
  }

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
}

