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
 * The listGatewayExportRouteFilters options.
 */
public class ListGatewayExportRouteFiltersOptions extends GenericModel {

  protected String gatewayId;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;

    /**
     * Instantiates a new Builder from an existing ListGatewayExportRouteFiltersOptions instance.
     *
     * @param listGatewayExportRouteFiltersOptions the instance to initialize the Builder with
     */
    private Builder(ListGatewayExportRouteFiltersOptions listGatewayExportRouteFiltersOptions) {
      this.gatewayId = listGatewayExportRouteFiltersOptions.gatewayId;
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
     */
    public Builder(String gatewayId) {
      this.gatewayId = gatewayId;
    }

    /**
     * Builds a ListGatewayExportRouteFiltersOptions.
     *
     * @return the new ListGatewayExportRouteFiltersOptions instance
     */
    public ListGatewayExportRouteFiltersOptions build() {
      return new ListGatewayExportRouteFiltersOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the ListGatewayExportRouteFiltersOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }
  }

  protected ListGatewayExportRouteFiltersOptions() { }

  protected ListGatewayExportRouteFiltersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    gatewayId = builder.gatewayId;
  }

  /**
   * New builder.
   *
   * @return a ListGatewayExportRouteFiltersOptions builder
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
}

