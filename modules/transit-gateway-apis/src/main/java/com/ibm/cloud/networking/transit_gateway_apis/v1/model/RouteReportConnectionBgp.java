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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * connection bgp details.
 */
public class RouteReportConnectionBgp extends GenericModel {

  @SerializedName("as_path")
  protected String asPath;
  @SerializedName("is_used")
  protected Boolean isUsed;
  @SerializedName("local_preference")
  protected String localPreference;
  protected String prefix;

  /**
   * Gets the asPath.
   *
   * AS path.
   *
   * @return the asPath
   */
  public String getAsPath() {
    return asPath;
  }

  /**
   * Gets the isUsed.
   *
   * Indicates whether current route is used or not.
   *
   * @return the isUsed
   */
  public Boolean isIsUsed() {
    return isUsed;
  }

  /**
   * Gets the localPreference.
   *
   * local preference.
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

