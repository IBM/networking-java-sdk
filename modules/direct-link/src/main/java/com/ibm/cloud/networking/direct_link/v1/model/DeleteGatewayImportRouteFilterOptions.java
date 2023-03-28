/*
 * (C) Copyright IBM Corp. 2023.
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
 * The deleteGatewayImportRouteFilter options.
 */
public class DeleteGatewayImportRouteFilterOptions extends GenericModel {

  protected String gatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteGatewayImportRouteFilterOptions instance.
     *
     * @param deleteGatewayImportRouteFilterOptions the instance to initialize the Builder with
     */
    private Builder(DeleteGatewayImportRouteFilterOptions deleteGatewayImportRouteFilterOptions) {
      this.gatewayId = deleteGatewayImportRouteFilterOptions.gatewayId;
      this.id = deleteGatewayImportRouteFilterOptions.id;
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
     */
    public Builder(String gatewayId, String id) {
      this.gatewayId = gatewayId;
      this.id = id;
    }

    /**
     * Builds a DeleteGatewayImportRouteFilterOptions.
     *
     * @return the new DeleteGatewayImportRouteFilterOptions instance
     */
    public DeleteGatewayImportRouteFilterOptions build() {
      return new DeleteGatewayImportRouteFilterOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the DeleteGatewayImportRouteFilterOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteGatewayImportRouteFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteGatewayImportRouteFilterOptions() { }

  protected DeleteGatewayImportRouteFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    gatewayId = builder.gatewayId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteGatewayImportRouteFilterOptions builder
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
   * Identifier of an import route filter.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

