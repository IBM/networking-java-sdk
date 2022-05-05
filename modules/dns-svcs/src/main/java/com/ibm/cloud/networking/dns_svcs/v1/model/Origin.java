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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Origin server.
 */
public class Origin extends GenericModel {

  protected String name;
  protected String description;
  protected String address;
  protected Boolean enabled;
  protected Boolean health;
  @SerializedName("health_failure_reason")
  protected String healthFailureReason;

  /**
   * Gets the name.
   *
   * The name of the origin server.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the origin server.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the address.
   *
   * The address of the origin server. It can be a hostname or an IP address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the enabled.
   *
   * Whether the origin server is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the health.
   *
   * The health state of the origin server.
   *
   * @return the health
   */
  public Boolean isHealth() {
    return health;
  }

  /**
   * Gets the healthFailureReason.
   *
   * The failure reason of the origin server if it is unhealthy.
   *
   * @return the healthFailureReason
   */
  public String getHealthFailureReason() {
    return healthFailureReason;
  }
}

