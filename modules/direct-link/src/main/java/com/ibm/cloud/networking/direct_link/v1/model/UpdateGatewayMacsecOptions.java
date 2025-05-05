/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGatewayMacsec options.
 */
public class UpdateGatewayMacsecOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> gatewayMacsecPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> gatewayMacsecPatch;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayMacsecOptions instance.
     *
     * @param updateGatewayMacsecOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayMacsecOptions updateGatewayMacsecOptions) {
      this.id = updateGatewayMacsecOptions.id;
      this.gatewayMacsecPatch = updateGatewayMacsecOptions.gatewayMacsecPatch;
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
     * @param gatewayMacsecPatch the gatewayMacsecPatch
     */
    public Builder(String id, Map<String, Object> gatewayMacsecPatch) {
      this.id = id;
      this.gatewayMacsecPatch = gatewayMacsecPatch;
    }

    /**
     * Builds a UpdateGatewayMacsecOptions.
     *
     * @return the new UpdateGatewayMacsecOptions instance
     */
    public UpdateGatewayMacsecOptions build() {
      return new UpdateGatewayMacsecOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayMacsecOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the gatewayMacsecPatch.
     *
     * @param gatewayMacsecPatch the gatewayMacsecPatch
     * @return the UpdateGatewayMacsecOptions builder
     */
    public Builder gatewayMacsecPatch(Map<String, Object> gatewayMacsecPatch) {
      this.gatewayMacsecPatch = gatewayMacsecPatch;
      return this;
    }
  }

  protected UpdateGatewayMacsecOptions() { }

  protected UpdateGatewayMacsecOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gatewayMacsecPatch,
      "gatewayMacsecPatch cannot be null");
    id = builder.id;
    gatewayMacsecPatch = builder.gatewayMacsecPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayMacsecOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the gatewayMacsecPatch.
   *
   * The MACsec configuration patch.
   *
   * @return the gatewayMacsecPatch
   */
  public Map<String, Object> gatewayMacsecPatch() {
    return gatewayMacsecPatch;
  }
}

