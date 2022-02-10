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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getTransitGatewayConnection options.
 */
public class GetTransitGatewayConnectionOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;

    private Builder(GetTransitGatewayConnectionOptions getTransitGatewayConnectionOptions) {
      this.transitGatewayId = getTransitGatewayConnectionOptions.transitGatewayId;
      this.id = getTransitGatewayConnectionOptions.id;
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
     * Builds a GetTransitGatewayConnectionOptions.
     *
     * @return the new GetTransitGatewayConnectionOptions instance
     */
    public GetTransitGatewayConnectionOptions build() {
      return new GetTransitGatewayConnectionOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the GetTransitGatewayConnectionOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetTransitGatewayConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetTransitGatewayConnectionOptions builder
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
}

