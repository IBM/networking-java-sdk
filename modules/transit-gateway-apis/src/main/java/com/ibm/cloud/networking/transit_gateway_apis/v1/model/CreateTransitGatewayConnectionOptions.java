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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayConnection options.
 */
public class CreateTransitGatewayConnectionOptions extends GenericModel {

  /**
   * Defines what type of network is connected via this connection.
   */
  public interface NetworkType {
    /** vpc. */
    String VPC = "vpc";
    /** classic. */
    String CLASSIC = "classic";
  }

  protected String transitGatewayId;
  protected String networkType;
  protected String name;
  protected String networkId;
  protected String networkAccountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String networkType;
    private String name;
    private String networkId;
    private String networkAccountId;

    private Builder(CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptions) {
      this.transitGatewayId = createTransitGatewayConnectionOptions.transitGatewayId;
      this.networkType = createTransitGatewayConnectionOptions.networkType;
      this.name = createTransitGatewayConnectionOptions.name;
      this.networkId = createTransitGatewayConnectionOptions.networkId;
      this.networkAccountId = createTransitGatewayConnectionOptions.networkAccountId;
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
     * @param networkType the networkType
     */
    public Builder(String transitGatewayId, String networkType) {
      this.transitGatewayId = transitGatewayId;
      this.networkType = networkType;
    }

    /**
     * Builds a CreateTransitGatewayConnectionOptions.
     *
     * @return the new CreateTransitGatewayConnectionOptions instance
     */
    public CreateTransitGatewayConnectionOptions build() {
      return new CreateTransitGatewayConnectionOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the networkType.
     *
     * @param networkType the networkType
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkType(String networkType) {
      this.networkType = networkType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }

    /**
     * Set the networkAccountId.
     *
     * @param networkAccountId the networkAccountId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkAccountId(String networkAccountId) {
      this.networkAccountId = networkAccountId;
      return this;
    }
  }

  protected CreateTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkType,
      "networkType cannot be null");
    transitGatewayId = builder.transitGatewayId;
    networkType = builder.networkType;
    name = builder.name;
    networkId = builder.networkId;
    networkAccountId = builder.networkAccountId;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayConnectionOptions builder
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
   * Gets the networkType.
   *
   * Defines what type of network is connected via this connection.
   *
   * @return the networkType
   */
  public String networkType() {
    return networkType;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway. If unspecified, the name will be the network name (the name of the
   * VPC in the case of network type 'vpc', and the word Classic, in the case of network type 'classic').
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. This field is required for some types, such as 'vpc'.
   * For network type 'vpc' this is the CRN of the VPC to be connected. This field is required to be unspecified for
   * network type 'classic'.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }

  /**
   * Gets the networkAccountId.
   *
   * The ID of the account which owns the network that is being connected. Generally only used if the network is in a
   * different account than the gateway.
   *
   * @return the networkAccountId
   */
  public String networkAccountId() {
    return networkAccountId;
  }
}

