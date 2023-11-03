/*
 * (C) Copyright IBM Corp. 2023.
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
 * The getTransitGatewayConnectionPrefixFilter options.
 */
public class GetTransitGatewayConnectionPrefixFilterOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected String filterId;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String filterId;

    /**
     * Instantiates a new Builder from an existing GetTransitGatewayConnectionPrefixFilterOptions instance.
     *
     * @param getTransitGatewayConnectionPrefixFilterOptions the instance to initialize the Builder with
     */
    private Builder(GetTransitGatewayConnectionPrefixFilterOptions getTransitGatewayConnectionPrefixFilterOptions) {
      this.transitGatewayId = getTransitGatewayConnectionPrefixFilterOptions.transitGatewayId;
      this.id = getTransitGatewayConnectionPrefixFilterOptions.id;
      this.filterId = getTransitGatewayConnectionPrefixFilterOptions.filterId;
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
     * @param filterId the filterId
     */
    public Builder(String transitGatewayId, String id, String filterId) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.filterId = filterId;
    }

    /**
     * Builds a GetTransitGatewayConnectionPrefixFilterOptions.
     *
     * @return the new GetTransitGatewayConnectionPrefixFilterOptions instance
     */
    public GetTransitGatewayConnectionPrefixFilterOptions build() {
      return new GetTransitGatewayConnectionPrefixFilterOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the GetTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the filterId.
     *
     * @param filterId the filterId
     * @return the GetTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder filterId(String filterId) {
      this.filterId = filterId;
      return this;
    }
  }

  protected GetTransitGatewayConnectionPrefixFilterOptions() { }

  protected GetTransitGatewayConnectionPrefixFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.filterId,
      "filterId cannot be empty");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    filterId = builder.filterId;
  }

  /**
   * New builder.
   *
   * @return a GetTransitGatewayConnectionPrefixFilterOptions builder
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
   * Gets the filterId.
   *
   * Prefix filter identifier.
   *
   * @return the filterId
   */
  public String filterId() {
    return filterId;
  }
}

