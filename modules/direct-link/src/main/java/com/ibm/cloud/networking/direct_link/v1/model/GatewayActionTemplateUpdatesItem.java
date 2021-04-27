/*
 * (C) Copyright IBM Corp. 2021.
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
 * GatewayActionTemplateUpdatesItem.
 *
 * Classes which extend this class:
 * - GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate
 */
public class GatewayActionTemplateUpdatesItem extends GenericModel {

  @SerializedName("speed_mbps")
  protected Long speedMbps;

  protected GatewayActionTemplateUpdatesItem() {
  }

  /**
   * Gets the speedMbps.
   *
   * New gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long speedMbps() {
    return speedMbps;
  }
}

