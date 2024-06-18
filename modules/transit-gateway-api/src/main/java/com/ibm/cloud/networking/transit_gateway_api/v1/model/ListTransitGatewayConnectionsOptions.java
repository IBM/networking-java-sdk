/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.networking.transit_gateway_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listTransitGatewayConnections options.
 */
public class ListTransitGatewayConnectionsOptions extends GenericModel {

  protected String transitGatewayId;
  protected String start;
  protected Long limit;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String start;
    private Long limit;
    private String name;

    /**
     * Instantiates a new Builder from an existing ListTransitGatewayConnectionsOptions instance.
     *
     * @param listTransitGatewayConnectionsOptions the instance to initialize the Builder with
     */
    private Builder(ListTransitGatewayConnectionsOptions listTransitGatewayConnectionsOptions) {
      this.transitGatewayId = listTransitGatewayConnectionsOptions.transitGatewayId;
      this.start = listTransitGatewayConnectionsOptions.start;
      this.limit = listTransitGatewayConnectionsOptions.limit;
      this.name = listTransitGatewayConnectionsOptions.name;
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
     */
    public Builder(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
    }

    /**
     * Builds a ListTransitGatewayConnectionsOptions.
     *
     * @return the new ListTransitGatewayConnectionsOptions instance
     */
    public ListTransitGatewayConnectionsOptions build() {
      return new ListTransitGatewayConnectionsOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the ListTransitGatewayConnectionsOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListTransitGatewayConnectionsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListTransitGatewayConnectionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListTransitGatewayConnectionsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ListTransitGatewayConnectionsOptions() { }

  protected ListTransitGatewayConnectionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    transitGatewayId = builder.transitGatewayId;
    start = builder.start;
    limit = builder.limit;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ListTransitGatewayConnectionsOptions builder
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
   * Gets the start.
   *
   * A server supplied token determining which resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources to return per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the name.
   *
   * Search for connections with the given name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

