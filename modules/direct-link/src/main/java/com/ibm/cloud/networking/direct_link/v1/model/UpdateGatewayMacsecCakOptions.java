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
 * The updateGatewayMacsecCak options.
 */
public class UpdateGatewayMacsecCakOptions extends GenericModel {

  protected String id;
  protected String cakId;
  protected Map<String, Object> gatewayMacsecCakPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String cakId;
    private Map<String, Object> gatewayMacsecCakPatch;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayMacsecCakOptions instance.
     *
     * @param updateGatewayMacsecCakOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayMacsecCakOptions updateGatewayMacsecCakOptions) {
      this.id = updateGatewayMacsecCakOptions.id;
      this.cakId = updateGatewayMacsecCakOptions.cakId;
      this.gatewayMacsecCakPatch = updateGatewayMacsecCakOptions.gatewayMacsecCakPatch;
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
     * @param cakId the cakId
     * @param gatewayMacsecCakPatch the gatewayMacsecCakPatch
     */
    public Builder(String id, String cakId, Map<String, Object> gatewayMacsecCakPatch) {
      this.id = id;
      this.cakId = cakId;
      this.gatewayMacsecCakPatch = gatewayMacsecCakPatch;
    }

    /**
     * Builds a UpdateGatewayMacsecCakOptions.
     *
     * @return the new UpdateGatewayMacsecCakOptions instance
     */
    public UpdateGatewayMacsecCakOptions build() {
      return new UpdateGatewayMacsecCakOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayMacsecCakOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cakId.
     *
     * @param cakId the cakId
     * @return the UpdateGatewayMacsecCakOptions builder
     */
    public Builder cakId(String cakId) {
      this.cakId = cakId;
      return this;
    }

    /**
     * Set the gatewayMacsecCakPatch.
     *
     * @param gatewayMacsecCakPatch the gatewayMacsecCakPatch
     * @return the UpdateGatewayMacsecCakOptions builder
     */
    public Builder gatewayMacsecCakPatch(Map<String, Object> gatewayMacsecCakPatch) {
      this.gatewayMacsecCakPatch = gatewayMacsecCakPatch;
      return this;
    }
  }

  protected UpdateGatewayMacsecCakOptions() { }

  protected UpdateGatewayMacsecCakOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.cakId,
      "cakId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.gatewayMacsecCakPatch,
      "gatewayMacsecCakPatch cannot be null");
    id = builder.id;
    cakId = builder.cakId;
    gatewayMacsecCakPatch = builder.gatewayMacsecCakPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayMacsecCakOptions builder
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
   * Gets the cakId.
   *
   * MACsec CAK identifier.
   *
   * @return the cakId
   */
  public String cakId() {
    return cakId;
  }

  /**
   * Gets the gatewayMacsecCakPatch.
   *
   * The MACsec CAK patch.
   *
   * @return the gatewayMacsecCakPatch
   */
  public Map<String, Object> gatewayMacsecCakPatch() {
    return gatewayMacsecCakPatch;
  }
}

