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
 * on-prem route.
 */
public class RouteReportOnPremRoute extends GenericModel {

  @SerializedName("as_path")
  protected String asPath;
  @SerializedName("next_hop")
  protected String nextHop;
  protected String prefix;

  protected RouteReportOnPremRoute() { }

  /**
   * Gets the asPath.
   *
   * The BGP AS path of the route.
   *
   * @return the asPath
   */
  public String getAsPath() {
    return asPath;
  }

  /**
   * Gets the nextHop.
   *
   * Next hop address.
   *
   * @return the nextHop
   */
  public String getNextHop() {
    return nextHop;
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

