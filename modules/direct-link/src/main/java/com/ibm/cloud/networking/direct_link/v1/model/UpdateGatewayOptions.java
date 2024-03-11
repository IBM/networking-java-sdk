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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGateway options.
 */
public class UpdateGatewayOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> gatewayPatchTemplatePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> gatewayPatchTemplatePatch;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayOptions instance.
     *
     * @param updateGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayOptions updateGatewayOptions) {
      this.id = updateGatewayOptions.id;
      this.gatewayPatchTemplatePatch = updateGatewayOptions.gatewayPatchTemplatePatch;
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
     * @param gatewayPatchTemplatePatch the gatewayPatchTemplatePatch
     */
    public Builder(String id, Map<String, Object> gatewayPatchTemplatePatch) {
      this.id = id;
      this.gatewayPatchTemplatePatch = gatewayPatchTemplatePatch;
    }

    /**
     * Builds a UpdateGatewayOptions.
     *
     * @return the new UpdateGatewayOptions instance
     */
    public UpdateGatewayOptions build() {
      return new UpdateGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the gatewayPatchTemplatePatch.
     *
     * @param gatewayPatchTemplatePatch the gatewayPatchTemplatePatch
     * @return the UpdateGatewayOptions builder
     */
    public Builder gatewayPatchTemplatePatch(Map<String, Object> gatewayPatchTemplatePatch) {
      this.gatewayPatchTemplatePatch = gatewayPatchTemplatePatch;
      return this;
    }
  }

  protected UpdateGatewayOptions() { }

  protected UpdateGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gatewayPatchTemplatePatch,
      "gatewayPatchTemplatePatch cannot be null");
    id = builder.id;
    gatewayPatchTemplatePatch = builder.gatewayPatchTemplatePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayOptions builder
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
   * Gets the gatewayPatchTemplatePatch.
   *
   * The Direct Link gateway patch.
   *
   * @return the gatewayPatchTemplatePatch
   */
  public Map<String, Object> gatewayPatchTemplatePatch() {
    return gatewayPatchTemplatePatch;
  }
}

