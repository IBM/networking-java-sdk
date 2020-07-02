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
package com.ibm.cloud.networking.direct_link_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGateway options.
 */
public class UpdateGatewayOptions extends GenericModel {

  /**
   * Gateway operational status.
   *
   * For gateways pending LOA approval, patch operational_status to the appropriate value to approve or reject its LOA.
   * When rejecting an LOA, provide reject reasoning in `loa_reject_reason`.
   *
   * Only allowed for type=dedicated gateways.
   */
  public interface OperationalStatus {
    /** loa_accepted. */
    String LOA_ACCEPTED = "loa_accepted";
    /** loa_rejected. */
    String LOA_REJECTED = "loa_rejected";
  }

  protected String id;
  protected Boolean global;
  protected String loaRejectReason;
  protected Boolean metered;
  protected String name;
  protected String operationalStatus;
  protected Long speedMbps;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean global;
    private String loaRejectReason;
    private Boolean metered;
    private String name;
    private String operationalStatus;
    private Long speedMbps;

    private Builder(UpdateGatewayOptions updateGatewayOptions) {
      this.id = updateGatewayOptions.id;
      this.global = updateGatewayOptions.global;
      this.loaRejectReason = updateGatewayOptions.loaRejectReason;
      this.metered = updateGatewayOptions.metered;
      this.name = updateGatewayOptions.name;
      this.operationalStatus = updateGatewayOptions.operationalStatus;
      this.speedMbps = updateGatewayOptions.speedMbps;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateGatewayOptions.
     *
     * @return the new UpdateGatewayOptions instance
     */
    public UpdateGatewayOptions build() {
      return new UpdateGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the UpdateGatewayOptions builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the loaRejectReason.
     *
     * @param loaRejectReason the loaRejectReason
     * @return the UpdateGatewayOptions builder
     */
    public Builder loaRejectReason(String loaRejectReason) {
      this.loaRejectReason = loaRejectReason;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the UpdateGatewayOptions builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the operationalStatus.
     *
     * @param operationalStatus the operationalStatus
     * @return the UpdateGatewayOptions builder
     */
    public Builder operationalStatus(String operationalStatus) {
      this.operationalStatus = operationalStatus;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the UpdateGatewayOptions builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }
  }

  protected UpdateGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    global = builder.global;
    loaRejectReason = builder.loaRejectReason;
    metered = builder.metered;
    name = builder.name;
    operationalStatus = builder.operationalStatus;
    speedMbps = builder.speedMbps;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the global.
   *
   * Gateways with global routing (`true`) can connect to networks outside of their associated region.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the loaRejectReason.
   *
   * Use this field during LOA rejection to provide the reason for the rejection.
   *
   * Only allowed for type=dedicated gateways.
   *
   * @return the loaRejectReason
   */
  public String loaRejectReason() {
    return loaRejectReason;
  }

  /**
   * Gets the metered.
   *
   * Metered billing option.  When `true` gateway usage is billed per gigabyte.  When `false` there is no per gigabyte
   * usage charge, instead a flat rate is charged for the gateway.
   *
   * @return the metered
   */
  public Boolean metered() {
    return metered;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the operationalStatus.
   *
   * Gateway operational status.
   *
   * For gateways pending LOA approval, patch operational_status to the appropriate value to approve or reject its LOA.
   * When rejecting an LOA, provide reject reasoning in `loa_reject_reason`.
   *
   * Only allowed for type=dedicated gateways.
   *
   * @return the operationalStatus
   */
  public String operationalStatus() {
    return operationalStatus;
  }

  /**
   * Gets the speedMbps.
   *
   * Gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long speedMbps() {
    return speedMbps;
  }
}

