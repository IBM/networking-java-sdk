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
 * The createGateway options.
 */
public class CreateGatewayOptions extends GenericModel {

  protected GatewayTemplate gatewayTemplate;

  /**
   * Builder.
   */
  public static class Builder {
    private GatewayTemplate gatewayTemplate;

    private Builder(CreateGatewayOptions createGatewayOptions) {
      this.gatewayTemplate = createGatewayOptions.gatewayTemplate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayTemplate the gatewayTemplate
     */
    public Builder(GatewayTemplate gatewayTemplate) {
      this.gatewayTemplate = gatewayTemplate;
    }

    /**
     * Builds a CreateGatewayOptions.
     *
     * @return the new CreateGatewayOptions instance
     */
    public CreateGatewayOptions build() {
      return new CreateGatewayOptions(this);
    }

    /**
     * Set the gatewayTemplate.
     *
     * @param gatewayTemplate the gatewayTemplate
     * @return the CreateGatewayOptions builder
     */
    public Builder gatewayTemplate(GatewayTemplate gatewayTemplate) {
      this.gatewayTemplate = gatewayTemplate;
      return this;
    }
  }

  protected CreateGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gatewayTemplate,
      "gatewayTemplate cannot be null");
    gatewayTemplate = builder.gatewayTemplate;
  }

  /**
   * New builder.
   *
   * @return a CreateGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayTemplate.
   *
   * The Direct Link Gateway template.
   *
   * @return the gatewayTemplate
   */
  public GatewayTemplate gatewayTemplate() {
    return gatewayTemplate;
  }
}

