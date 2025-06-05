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
 * The updateGatewayVirtualConnection options.
 */
public class UpdateGatewayVirtualConnectionOptions extends GenericModel {

  protected String gatewayId;
  protected String id;
  protected Map<String, Object> gatewayVirtualConnectionPatchTemplatePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String id;
    private Map<String, Object> gatewayVirtualConnectionPatchTemplatePatch;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayVirtualConnectionOptions instance.
     *
     * @param updateGatewayVirtualConnectionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptions) {
      this.gatewayId = updateGatewayVirtualConnectionOptions.gatewayId;
      this.id = updateGatewayVirtualConnectionOptions.id;
      this.gatewayVirtualConnectionPatchTemplatePatch = updateGatewayVirtualConnectionOptions.gatewayVirtualConnectionPatchTemplatePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayId the gatewayId
     * @param id the id
     * @param gatewayVirtualConnectionPatchTemplatePatch the gatewayVirtualConnectionPatchTemplatePatch
     */
    public Builder(String gatewayId, String id, Map<String, Object> gatewayVirtualConnectionPatchTemplatePatch) {
      this.gatewayId = gatewayId;
      this.id = id;
      this.gatewayVirtualConnectionPatchTemplatePatch = gatewayVirtualConnectionPatchTemplatePatch;
    }

    /**
     * Builds a UpdateGatewayVirtualConnectionOptions.
     *
     * @return the new UpdateGatewayVirtualConnectionOptions instance
     */
    public UpdateGatewayVirtualConnectionOptions build() {
      return new UpdateGatewayVirtualConnectionOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the gatewayVirtualConnectionPatchTemplatePatch.
     *
     * @param gatewayVirtualConnectionPatchTemplatePatch the gatewayVirtualConnectionPatchTemplatePatch
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder gatewayVirtualConnectionPatchTemplatePatch(Map<String, Object> gatewayVirtualConnectionPatchTemplatePatch) {
      this.gatewayVirtualConnectionPatchTemplatePatch = gatewayVirtualConnectionPatchTemplatePatch;
      return this;
    }
  }

  protected UpdateGatewayVirtualConnectionOptions() { }

  protected UpdateGatewayVirtualConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gatewayVirtualConnectionPatchTemplatePatch,
      "gatewayVirtualConnectionPatchTemplatePatch cannot be null");
    gatewayId = builder.gatewayId;
    id = builder.id;
    gatewayVirtualConnectionPatchTemplatePatch = builder.gatewayVirtualConnectionPatchTemplatePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayVirtualConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayId.
   *
   * Direct Link gateway identifier.
   *
   * @return the gatewayId
   */
  public String gatewayId() {
    return gatewayId;
  }

  /**
   * Gets the id.
   *
   * The virtual connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the gatewayVirtualConnectionPatchTemplatePatch.
   *
   * The virtual connection patch template.
   *
   * @return the gatewayVirtualConnectionPatchTemplatePatch
   */
  public Map<String, Object> gatewayVirtualConnectionPatchTemplatePatch() {
    return gatewayVirtualConnectionPatchTemplatePatch;
  }
}

