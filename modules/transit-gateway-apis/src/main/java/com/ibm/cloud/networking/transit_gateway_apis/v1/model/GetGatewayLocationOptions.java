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
 * The getGatewayLocation options.
 */
public class GetGatewayLocationOptions extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing GetGatewayLocationOptions instance.
     *
     * @param getGatewayLocationOptions the instance to initialize the Builder with
     */
    private Builder(GetGatewayLocationOptions getGatewayLocationOptions) {
      this.name = getGatewayLocationOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a GetGatewayLocationOptions.
     *
     * @return the new GetGatewayLocationOptions instance
     */
    public GetGatewayLocationOptions build() {
      return new GetGatewayLocationOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetGatewayLocationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetGatewayLocationOptions() { }

  protected GetGatewayLocationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetGatewayLocationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The Transit Gateway location Name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

