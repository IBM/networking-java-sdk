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
 * The getGatewayMacsecCak options.
 */
public class GetGatewayMacsecCakOptions extends GenericModel {

  protected String id;
  protected String cakId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String cakId;

    /**
     * Instantiates a new Builder from an existing GetGatewayMacsecCakOptions instance.
     *
     * @param getGatewayMacsecCakOptions the instance to initialize the Builder with
     */
    private Builder(GetGatewayMacsecCakOptions getGatewayMacsecCakOptions) {
      this.id = getGatewayMacsecCakOptions.id;
      this.cakId = getGatewayMacsecCakOptions.cakId;
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
     * Builds a GetGatewayMacsecCakOptions.
     *
     * @return the new GetGatewayMacsecCakOptions instance
     */
    public GetGatewayMacsecCakOptions build() {
      return new GetGatewayMacsecCakOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetGatewayMacsecCakOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cakId.
     *
     * @param cakId the cakId
     * @return the GetGatewayMacsecCakOptions builder
     */
    public Builder cakId(String cakId) {
      this.cakId = cakId;
      return this;
    }
  }

  protected GetGatewayMacsecCakOptions() { }

  protected GetGatewayMacsecCakOptions(Builder builder) {
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
   * @return a GetGatewayMacsecCakOptions builder
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

