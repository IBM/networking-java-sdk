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
 * GatewayStatus.
 *
 * Classes which extend this class:
 * - GatewayStatusGatewayBGPStatus
 * - GatewayStatusGatewayBFDStatus
 * - GatewayStatusGatewayLinkStatus
 */
public class GatewayStatus extends GenericModel {

  /**
   * Status type.
   */
  public interface Type {
    /** bgp. */
    String BGP = "bgp";
  }

  /**
   * Status.
   */
  public interface Value {
    /** active. */
    String ACTIVE = "active";
    /** connect. */
    String CONNECT = "connect";
    /** established. */
    String ESTABLISHED = "established";
    /** idle. */
    String IDLE = "idle";
  }

  protected String type;
  @SerializedName("updated_at")
  protected Date updatedAt;
  protected String value;

  protected GatewayStatus() {
  }

  /**
   * Gets the type.
   *
   * Status type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the updatedAt.
   *
   * Date and time status was collected.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the value.
   *
   * Status.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

