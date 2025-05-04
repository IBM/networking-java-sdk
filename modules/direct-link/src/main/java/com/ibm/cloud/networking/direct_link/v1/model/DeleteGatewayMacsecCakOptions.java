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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteGatewayMacsecCak options.
 */
public class DeleteGatewayMacsecCakOptions extends GenericModel {

  protected String id;
  protected String cakId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String cakId;

    /**
     * Instantiates a new Builder from an existing DeleteGatewayMacsecCakOptions instance.
     *
     * @param deleteGatewayMacsecCakOptions the instance to initialize the Builder with
     */
    private Builder(DeleteGatewayMacsecCakOptions deleteGatewayMacsecCakOptions) {
      this.id = deleteGatewayMacsecCakOptions.id;
      this.cakId = deleteGatewayMacsecCakOptions.cakId;
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
     */
    public Builder(String id, String cakId) {
      this.id = id;
      this.cakId = cakId;
    }

    /**
     * Builds a DeleteGatewayMacsecCakOptions.
     *
     * @return the new DeleteGatewayMacsecCakOptions instance
     */
    public DeleteGatewayMacsecCakOptions build() {
      return new DeleteGatewayMacsecCakOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteGatewayMacsecCakOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cakId.
     *
     * @param cakId the cakId
     * @return the DeleteGatewayMacsecCakOptions builder
     */
    public Builder cakId(String cakId) {
      this.cakId = cakId;
      return this;
    }
  }

  protected DeleteGatewayMacsecCakOptions() { }

  protected DeleteGatewayMacsecCakOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.cakId,
      "cakId cannot be empty");
    id = builder.id;
    cakId = builder.cakId;
  }

  /**
   * New builder.
   *
   * @return a DeleteGatewayMacsecCakOptions builder
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
}

