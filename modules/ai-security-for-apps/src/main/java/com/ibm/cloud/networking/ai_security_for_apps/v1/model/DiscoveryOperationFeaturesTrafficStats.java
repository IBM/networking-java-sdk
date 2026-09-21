/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DiscoveryOperationFeaturesTrafficStats.
 */
public class DiscoveryOperationFeaturesTrafficStats extends GenericModel {

  @SerializedName("last_updated")
  protected Date lastUpdated;
  @SerializedName("period_seconds")
  protected Long periodSeconds;
  protected Double requests;

  protected DiscoveryOperationFeaturesTrafficStats() { }

  /**
   * Gets the lastUpdated.
   *
   * @return the lastUpdated
   */
  public Date getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Gets the periodSeconds.
   *
   * The period in seconds over which statistics were computed.
   *
   * @return the periodSeconds
   */
  public Long getPeriodSeconds() {
    return periodSeconds;
  }

  /**
   * Gets the requests.
   *
   * The average number of requests seen during this period.
   *
   * @return the requests
   */
  public Double getRequests() {
    return requests;
  }
}

