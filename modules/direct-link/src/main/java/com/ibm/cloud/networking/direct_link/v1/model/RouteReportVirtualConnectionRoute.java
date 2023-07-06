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
 * A route originating from an attached virtual connection.
 */
public class RouteReportVirtualConnectionRoute extends GenericModel {

  protected Boolean active;
  @SerializedName("local_preference")
  protected String localPreference;
  protected String prefix;

  protected RouteReportVirtualConnectionRoute() { }

  /**
   * Gets the active.
   *
   * Indicates whether the route is the preferred path of the prefix.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the localPreference.
   *
   * The local preference of the route. This attribute can manipulate the chosen path on routes.
   *
   * @return the localPreference
   */
  public String getLocalPreference() {
    return localPreference;
  }

  /**
   * Gets the prefix.
   *
   * prefix.
   *
   * @return the prefix
   */
  public String getPrefix() {
    return prefix;
  }
}

