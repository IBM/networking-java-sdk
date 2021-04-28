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
 * Select Port Label for new type=connect gateway.
 */
public class GatewayPortIdentity extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    private Builder(GatewayPortIdentity gatewayPortIdentity) {
      this.id = gatewayPortIdentity.id;
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
     * Builds a GatewayPortIdentity.
     *
     * @return the new GatewayPortIdentity instance
     */
    public GatewayPortIdentity build() {
      return new GatewayPortIdentity(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GatewayPortIdentity builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GatewayPortIdentity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GatewayPortIdentity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * port id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

