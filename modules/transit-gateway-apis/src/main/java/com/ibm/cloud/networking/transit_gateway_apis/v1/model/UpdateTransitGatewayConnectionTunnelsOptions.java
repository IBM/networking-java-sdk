/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTransitGatewayConnectionTunnels options.
 */
public class UpdateTransitGatewayConnectionTunnelsOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected String greTunnelId;
  protected Map<String, Object> transitGatewayTunnelPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String greTunnelId;
    private Map<String, Object> transitGatewayTunnelPatch;

    /**
     * Instantiates a new Builder from an existing UpdateTransitGatewayConnectionTunnelsOptions instance.
     *
     * @param updateTransitGatewayConnectionTunnelsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateTransitGatewayConnectionTunnelsOptions updateTransitGatewayConnectionTunnelsOptions) {
      this.transitGatewayId = updateTransitGatewayConnectionTunnelsOptions.transitGatewayId;
      this.id = updateTransitGatewayConnectionTunnelsOptions.id;
      this.greTunnelId = updateTransitGatewayConnectionTunnelsOptions.greTunnelId;
      this.transitGatewayTunnelPatch = updateTransitGatewayConnectionTunnelsOptions.transitGatewayTunnelPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param transitGatewayId the transitGatewayId
     * @param id the id
     * @param greTunnelId the greTunnelId
     * @param transitGatewayTunnelPatch the transitGatewayTunnelPatch
     */
    public Builder(String transitGatewayId, String id, String greTunnelId, Map<String, Object> transitGatewayTunnelPatch) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.greTunnelId = greTunnelId;
      this.transitGatewayTunnelPatch = transitGatewayTunnelPatch;
    }

    /**
     * Builds a UpdateTransitGatewayConnectionTunnelsOptions.
     *
     * @return the new UpdateTransitGatewayConnectionTunnelsOptions instance
     */
    public UpdateTransitGatewayConnectionTunnelsOptions build() {
      return new UpdateTransitGatewayConnectionTunnelsOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the UpdateTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the greTunnelId.
     *
     * @param greTunnelId the greTunnelId
     * @return the UpdateTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder greTunnelId(String greTunnelId) {
      this.greTunnelId = greTunnelId;
      return this;
    }

    /**
     * Set the transitGatewayTunnelPatch.
     *
     * @param transitGatewayTunnelPatch the transitGatewayTunnelPatch
     * @return the UpdateTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder transitGatewayTunnelPatch(Map<String, Object> transitGatewayTunnelPatch) {
      this.transitGatewayTunnelPatch = transitGatewayTunnelPatch;
      return this;
    }
  }

  protected UpdateTransitGatewayConnectionTunnelsOptions() { }

  protected UpdateTransitGatewayConnectionTunnelsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.greTunnelId,
      "greTunnelId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.transitGatewayTunnelPatch,
      "transitGatewayTunnelPatch cannot be null");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    greTunnelId = builder.greTunnelId;
    transitGatewayTunnelPatch = builder.transitGatewayTunnelPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateTransitGatewayConnectionTunnelsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the transitGatewayId.
   *
   * The Transit Gateway identifier.
   *
   * @return the transitGatewayId
   */
  public String transitGatewayId() {
    return transitGatewayId;
  }

  /**
   * Gets the id.
   *
   * The connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the greTunnelId.
   *
   * The tunnel identifier.
   *
   * @return the greTunnelId
   */
  public String greTunnelId() {
    return greTunnelId;
  }

  /**
   * Gets the transitGatewayTunnelPatch.
   *
   * The update connection tunnel template.
   *
   * @return the transitGatewayTunnelPatch
   */
  public Map<String, Object> transitGatewayTunnelPatch() {
    return transitGatewayTunnelPatch;
  }
}

