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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteTransitGatewayConnectionTunnels options.
 */
public class DeleteTransitGatewayConnectionTunnelsOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected String greTunnelId;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String greTunnelId;

    /**
     * Instantiates a new Builder from an existing DeleteTransitGatewayConnectionTunnelsOptions instance.
     *
     * @param deleteTransitGatewayConnectionTunnelsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteTransitGatewayConnectionTunnelsOptions deleteTransitGatewayConnectionTunnelsOptions) {
      this.transitGatewayId = deleteTransitGatewayConnectionTunnelsOptions.transitGatewayId;
      this.id = deleteTransitGatewayConnectionTunnelsOptions.id;
      this.greTunnelId = deleteTransitGatewayConnectionTunnelsOptions.greTunnelId;
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
     */
    public Builder(String transitGatewayId, String id, String greTunnelId) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.greTunnelId = greTunnelId;
    }

    /**
     * Builds a DeleteTransitGatewayConnectionTunnelsOptions.
     *
     * @return the new DeleteTransitGatewayConnectionTunnelsOptions instance
     */
    public DeleteTransitGatewayConnectionTunnelsOptions build() {
      return new DeleteTransitGatewayConnectionTunnelsOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the DeleteTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the greTunnelId.
     *
     * @param greTunnelId the greTunnelId
     * @return the DeleteTransitGatewayConnectionTunnelsOptions builder
     */
    public Builder greTunnelId(String greTunnelId) {
      this.greTunnelId = greTunnelId;
      return this;
    }
  }

  protected DeleteTransitGatewayConnectionTunnelsOptions() { }

  protected DeleteTransitGatewayConnectionTunnelsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.greTunnelId,
      "greTunnelId cannot be empty");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    greTunnelId = builder.greTunnelId;
  }

  /**
   * New builder.
   *
   * @return a DeleteTransitGatewayConnectionTunnelsOptions builder
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
}

