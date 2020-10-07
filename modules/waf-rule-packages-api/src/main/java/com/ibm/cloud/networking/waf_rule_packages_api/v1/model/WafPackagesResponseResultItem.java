/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.waf_rule_packages_api.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WafPackagesResponseResultItem.
 */
public class WafPackagesResponseResultItem extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("detection_mode")
  protected String detectionMode;
  @SerializedName("zone_id")
  protected String zoneId;
  protected String status;

  /**
   * Gets the id.
   *
   * ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the detectionMode.
   *
   * Detection mode.
   *
   * @return the detectionMode
   */
  public String getDetectionMode() {
    return detectionMode;
  }

  /**
   * Gets the zoneId.
   *
   * Value.
   *
   * @return the zoneId
   */
  public String getZoneId() {
    return zoneId;
  }

  /**
   * Gets the status.
   *
   * Value.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

