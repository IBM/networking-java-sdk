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
 * The updateTransitGateway options.
 */
public class UpdateTransitGatewayOptions extends GenericModel {

  protected String id;
  protected Boolean global;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean global;
    private String name;

    private Builder(UpdateTransitGatewayOptions updateTransitGatewayOptions) {
      this.id = updateTransitGatewayOptions.id;
      this.global = updateTransitGatewayOptions.global;
      this.name = updateTransitGatewayOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateTransitGatewayOptions.
     *
     * @return the new UpdateTransitGatewayOptions instance
     */
    public UpdateTransitGatewayOptions build() {
      return new UpdateTransitGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateTransitGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the UpdateTransitGatewayOptions builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateTransitGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected UpdateTransitGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    global = builder.global;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateTransitGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The Transit Gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the global.
   *
   * Allow global routing for a Transit Gateway.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

