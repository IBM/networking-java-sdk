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
 * The createTransitGatewayConnectionActions options.
 */
public class CreateTransitGatewayConnectionActionsOptions extends GenericModel {

  /**
   * The action that is to be performed against the connection request.
   */
  public interface Action {
    /** approve. */
    String APPROVE = "approve";
    /** reject. */
    String REJECT = "reject";
  }

  protected String transitGatewayId;
  protected String id;
  protected String action;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String action;

    private Builder(CreateTransitGatewayConnectionActionsOptions createTransitGatewayConnectionActionsOptions) {
      this.transitGatewayId = createTransitGatewayConnectionActionsOptions.transitGatewayId;
      this.id = createTransitGatewayConnectionActionsOptions.id;
      this.action = createTransitGatewayConnectionActionsOptions.action;
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
     * @param action the action
     */
    public Builder(String transitGatewayId, String id, String action) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.action = action;
    }

    /**
     * Builds a CreateTransitGatewayConnectionActionsOptions.
     *
     * @return the new CreateTransitGatewayConnectionActionsOptions instance
     */
    public CreateTransitGatewayConnectionActionsOptions build() {
      return new CreateTransitGatewayConnectionActionsOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayConnectionActionsOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateTransitGatewayConnectionActionsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateTransitGatewayConnectionActionsOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }
  }

  protected CreateTransitGatewayConnectionActionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    action = builder.action;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayConnectionActionsOptions builder
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
   * Gets the action.
   *
   * The action that is to be performed against the connection request.
   *
   * @return the action
   */
  public String action() {
    return action;
  }
}

