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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BFD configuration information.
 */
public class GatewayBfdConfig extends GenericModel {

  /**
   * Gateway BFD status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field must tolerate unexpected values.
   */
  public interface BfdStatus {
    /** init. */
    String INIT = "init";
    /** up. */
    String UP = "up";
    /** down. */
    String DOWN = "down";
  }

  @SerializedName("bfd_status")
  protected String bfdStatus;
  @SerializedName("bfd_status_updated_at")
  protected Date bfdStatusUpdatedAt;
  protected Long interval;
  protected Long multiplier;

  /**
   * Gets the bfdStatus.
   *
   * Gateway BFD status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field must tolerate unexpected values.
   *
   * @return the bfdStatus
   */
  public String getBfdStatus() {
    return bfdStatus;
  }

  /**
   * Gets the bfdStatusUpdatedAt.
   *
   * Date and time bfd status was updated.
   *
   * @return the bfdStatusUpdatedAt
   */
  public Date getBfdStatusUpdatedAt() {
    return bfdStatusUpdatedAt;
  }

  /**
   * Gets the interval.
   *
   * Minimum interval in milliseconds at which the local routing device transmits hello packets and then expects to
   * receive a reply from a neighbor with which it has established a BFD session.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the multiplier.
   *
   * The number of hello packets not received by a neighbor that causes the originating interface to be declared down.
   *
   * @return the multiplier
   */
  public Long getMultiplier() {
    return multiplier;
  }
}

