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
 * The getTransitGatewayRouteReport options.
 */
public class GetTransitGatewayRouteReportOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetTransitGatewayRouteReportOptions instance.
     *
     * @param getTransitGatewayRouteReportOptions the instance to initialize the Builder with
     */
    private Builder(GetTransitGatewayRouteReportOptions getTransitGatewayRouteReportOptions) {
      this.transitGatewayId = getTransitGatewayRouteReportOptions.transitGatewayId;
      this.id = getTransitGatewayRouteReportOptions.id;
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
     * Builds a GetTransitGatewayRouteReportOptions.
     *
     * @return the new GetTransitGatewayRouteReportOptions instance
     */
    public GetTransitGatewayRouteReportOptions build() {
      return new GetTransitGatewayRouteReportOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the GetTransitGatewayRouteReportOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetTransitGatewayRouteReportOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetTransitGatewayRouteReportOptions() { }

  protected GetTransitGatewayRouteReportOptions(Builder builder) {
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
   * @return a GetTransitGatewayRouteReportOptions builder
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
   * Route report identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

