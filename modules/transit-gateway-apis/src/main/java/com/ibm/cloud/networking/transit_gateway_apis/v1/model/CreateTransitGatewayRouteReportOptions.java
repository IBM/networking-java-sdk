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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayRouteReport options.
 */
public class CreateTransitGatewayRouteReportOptions extends GenericModel {

  protected String transitGatewayId;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayRouteReportOptions instance.
     *
     * @param createTransitGatewayRouteReportOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayRouteReportOptions createTransitGatewayRouteReportOptions) {
      this.transitGatewayId = createTransitGatewayRouteReportOptions.transitGatewayId;
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
     * Builds a CreateTransitGatewayRouteReportOptions.
     *
     * @return the new CreateTransitGatewayRouteReportOptions instance
     */
    public CreateTransitGatewayRouteReportOptions build() {
      return new CreateTransitGatewayRouteReportOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayRouteReportOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }
  }

  protected CreateTransitGatewayRouteReportOptions() { }

  protected CreateTransitGatewayRouteReportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    transitGatewayId = builder.transitGatewayId;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayRouteReportOptions builder
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
}

