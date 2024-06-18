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
 * The createTransitGateway options.
 */
public class CreateTransitGatewayOptions extends GenericModel {

  protected String location;
  protected String name;
  protected Boolean global;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String location;
    private String name;
    private Boolean global;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayOptions instance.
     *
     * @param createTransitGatewayOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayOptions createTransitGatewayOptions) {
      this.location = createTransitGatewayOptions.location;
      this.name = createTransitGatewayOptions.name;
      this.global = createTransitGatewayOptions.global;
      this.resourceGroup = createTransitGatewayOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param location the location
     * @param name the name
     */
    public Builder(String location, String name) {
      this.location = location;
      this.name = name;
    }

    /**
     * Builds a CreateTransitGatewayOptions.
     *
     * @return the new CreateTransitGatewayOptions instance
     */
    public CreateTransitGatewayOptions build() {
      return new CreateTransitGatewayOptions(this);
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateTransitGatewayOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTransitGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the CreateTransitGatewayOptions builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateTransitGatewayOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateTransitGatewayOptions() { }

  protected CreateTransitGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.location,
      "location cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    location = builder.location;
    name = builder.name;
    global = builder.global;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the location.
   *
   * Location of Transit Gateway Services.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the name.
   *
   * Name Transit Gateway Services.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the global.
   *
   * Allow global routing for a Transit Gateway. If unspecified, the default value is false.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://console.bluemix.net/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

