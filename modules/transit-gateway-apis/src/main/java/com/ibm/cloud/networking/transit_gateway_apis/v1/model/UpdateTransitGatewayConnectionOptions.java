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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTransitGatewayConnection options.
 */
public class UpdateTransitGatewayConnectionOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String name;

    private Builder(UpdateTransitGatewayConnectionOptions updateTransitGatewayConnectionOptions) {
      this.transitGatewayId = updateTransitGatewayConnectionOptions.transitGatewayId;
      this.id = updateTransitGatewayConnectionOptions.id;
      this.name = updateTransitGatewayConnectionOptions.name;
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
     */
    public Builder(String transitGatewayId, String id) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
    }

    /**
     * Builds a UpdateTransitGatewayConnectionOptions.
     *
     * @return the new UpdateTransitGatewayConnectionOptions instance
     */
    public UpdateTransitGatewayConnectionOptions build() {
      return new UpdateTransitGatewayConnectionOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the UpdateTransitGatewayConnectionOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateTransitGatewayConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateTransitGatewayConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected UpdateTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateTransitGatewayConnectionOptions builder
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
   * Gets the name.
   *
   * The user-defined name for this transit gateway. If specified as empty string or nil,  the name will be the network
   * name (the name of the VPC in the case of network type 'vpc',  and the word Classic, in the case of network type
   * 'classic').
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

