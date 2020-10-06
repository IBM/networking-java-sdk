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
package com.ibm.cloud.networking.global_load_balancer_events.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ListEventsRespResultItemOriginsItem.
 */
public class ListEventsRespResultItemOriginsItem extends GenericModel {

  protected String name;
  protected String address;
  protected String ip;
  protected Boolean enabled;
  protected Boolean healthy;
  @SerializedName("failure_reason")
  protected String failureReason;
  protected Boolean changed;

  /**
   * Gets the name.
   *
   * Origin name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the address.
   *
   * Origin address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the ip.
   *
   * Origin id.
   *
   * @return the ip
   */
  public String getIp() {
    return ip;
  }

  /**
   * Gets the enabled.
   *
   * Origin enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the healthy.
   *
   * Origin healthy.
   *
   * @return the healthy
   */
  public Boolean isHealthy() {
    return healthy;
  }

  /**
   * Gets the failureReason.
   *
   * Origin failure reason.
   *
   * @return the failureReason
   */
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Gets the changed.
   *
   * Origin changed.
   *
   * @return the changed
   */
  public Boolean isChanged() {
    return changed;
  }
}

