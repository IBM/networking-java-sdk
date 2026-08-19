/*
 * (C) Copyright IBM Corp. 2026.
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
  protected Boolean greEnhancedRoutePropagation;
  protected String name;
  protected String redundancyGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean global;
    private Boolean greEnhancedRoutePropagation;
    private String name;
    private String redundancyGroup;

    /**
     * Instantiates a new Builder from an existing UpdateTransitGatewayOptions instance.
     *
     * @param updateTransitGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdateTransitGatewayOptions updateTransitGatewayOptions) {
      this.id = updateTransitGatewayOptions.id;
      this.global = updateTransitGatewayOptions.global;
      this.greEnhancedRoutePropagation = updateTransitGatewayOptions.greEnhancedRoutePropagation;
      this.name = updateTransitGatewayOptions.name;
      this.redundancyGroup = updateTransitGatewayOptions.redundancyGroup;
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
     * Set the greEnhancedRoutePropagation.
     *
     * @param greEnhancedRoutePropagation the greEnhancedRoutePropagation
     * @return the UpdateTransitGatewayOptions builder
     */
    public Builder greEnhancedRoutePropagation(Boolean greEnhancedRoutePropagation) {
      this.greEnhancedRoutePropagation = greEnhancedRoutePropagation;
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

    /**
     * Set the redundancyGroup.
     *
     * @param redundancyGroup the redundancyGroup
     * @return the UpdateTransitGatewayOptions builder
     */
    public Builder redundancyGroup(String redundancyGroup) {
      this.redundancyGroup = redundancyGroup;
      return this;
    }
  }

  protected UpdateTransitGatewayOptions() { }

  protected UpdateTransitGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    global = builder.global;
    greEnhancedRoutePropagation = builder.greEnhancedRoutePropagation;
    name = builder.name;
    redundancyGroup = builder.redundancyGroup;
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
   * Allow global routing for a Transit Gateway. This property cannot be changed if the transit gateway has
   * redundancy_group set.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the greEnhancedRoutePropagation.
   *
   * Allow route propagation across all GREs connected to the same transit gateway. This affects connections on the
   * gateway of type `redundant_gre`, `unbound_gre_tunnel` and `gre_tunnel`. It takes a few minutes for the change to
   * take effect.
   *
   * @return the greEnhancedRoutePropagation
   */
  public Boolean greEnhancedRoutePropagation() {
    return greEnhancedRoutePropagation;
  }

  /**
   * Gets the name.
   *
   * A human readable name for a resource.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the redundancyGroup.
   *
   * Create a new redundancy group with this name and add the gateway to it. This property is only valid when the
   * gateway is global (or `global` is set to `true` in the same request), the gateway is not already a member of a
   * redundancy group, and no redundancy group with this name already exists in the account.
   *
   * @return the redundancyGroup
   */
  public String redundancyGroup() {
    return redundancyGroup;
  }
}

