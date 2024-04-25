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
 * The createTransitGatewayConnection options.
 */
public class CreateTransitGatewayConnectionOptions extends GenericModel {

  protected String transitGatewayId;
  protected TransitGatewayConnectionTemplate transitGatewayConnectionTemplate;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private TransitGatewayConnectionTemplate transitGatewayConnectionTemplate;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayConnectionOptions instance.
     *
     * @param createTransitGatewayConnectionOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptions) {
      this.transitGatewayId = createTransitGatewayConnectionOptions.transitGatewayId;
      this.transitGatewayConnectionTemplate = createTransitGatewayConnectionOptions.transitGatewayConnectionTemplate;
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
     * @param transitGatewayConnectionTemplate the transitGatewayConnectionTemplate
     */
    public Builder(String transitGatewayId, TransitGatewayConnectionTemplate transitGatewayConnectionTemplate) {
      this.transitGatewayId = transitGatewayId;
      this.transitGatewayConnectionTemplate = transitGatewayConnectionTemplate;
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
     * Set the transitGatewayConnectionTemplate.
     *
     * @param transitGatewayConnectionTemplate the transitGatewayConnectionTemplate
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder transitGatewayConnectionTemplate(TransitGatewayConnectionTemplate transitGatewayConnectionTemplate) {
      this.transitGatewayConnectionTemplate = transitGatewayConnectionTemplate;
      return this;
    }
  }

  protected CreateTransitGatewayConnectionOptions() { }

  protected CreateTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.transitGatewayConnectionTemplate,
      "transitGatewayConnectionTemplate cannot be null");
    transitGatewayId = builder.transitGatewayId;
    transitGatewayConnectionTemplate = builder.transitGatewayConnectionTemplate;
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
   * Gets the transitGatewayConnectionTemplate.
   *
   * The connection template.
   *
   * @return the transitGatewayConnectionTemplate
   */
  public TransitGatewayConnectionTemplate transitGatewayConnectionTemplate() {
    return transitGatewayConnectionTemplate;
  }
}

