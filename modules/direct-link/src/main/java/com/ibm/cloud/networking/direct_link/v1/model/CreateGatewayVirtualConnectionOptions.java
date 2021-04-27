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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGatewayVirtualConnection options.
 */
public class CreateGatewayVirtualConnectionOptions extends GenericModel {

  /**
   * The type of virtual connection.
   */
  public interface Type {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
  }

  protected String gatewayId;
  protected String name;
  protected String type;
  protected String networkId;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String name;
    private String type;
    private String networkId;

    private Builder(CreateGatewayVirtualConnectionOptions createGatewayVirtualConnectionOptions) {
      this.gatewayId = createGatewayVirtualConnectionOptions.gatewayId;
      this.name = createGatewayVirtualConnectionOptions.name;
      this.type = createGatewayVirtualConnectionOptions.type;
      this.networkId = createGatewayVirtualConnectionOptions.networkId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayId the gatewayId
     * @param name the name
     * @param type the type
     */
    public Builder(String gatewayId, String name, String type) {
      this.gatewayId = gatewayId;
      this.name = name;
      this.type = type;
    }

    /**
     * Builds a CreateGatewayVirtualConnectionOptions.
     *
     * @return the new CreateGatewayVirtualConnectionOptions instance
     */
    public CreateGatewayVirtualConnectionOptions build() {
      return new CreateGatewayVirtualConnectionOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the CreateGatewayVirtualConnectionOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateGatewayVirtualConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateGatewayVirtualConnectionOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the CreateGatewayVirtualConnectionOptions builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }
  }

  protected CreateGatewayVirtualConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    gatewayId = builder.gatewayId;
    name = builder.name;
    type = builder.type;
    networkId = builder.networkId;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayVirtualConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayId.
   *
   * Direct Link gateway identifier.
   *
   * @return the gatewayId
   */
  public String gatewayId() {
    return gatewayId;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this virtual connection.  Virtual connection names are unique within a gateway.  This is
   * the name of the virtual connection itself, the network being connected may have its own name attribute.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of virtual connection.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the networkId.
   *
   * Unique identifier of the target network.  For type=vpc virtual connections this is the CRN of the target VPC.  This
   * field does not apply to type=classic connections.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }
}

