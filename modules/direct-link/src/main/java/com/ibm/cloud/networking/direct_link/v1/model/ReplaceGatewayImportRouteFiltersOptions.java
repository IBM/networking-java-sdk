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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceGatewayImportRouteFilters options.
 */
public class ReplaceGatewayImportRouteFiltersOptions extends GenericModel {

  protected String gatewayId;
  protected String ifMatch;
  protected List<GatewayTemplateRouteFilter> importRouteFilters;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String ifMatch;
    private List<GatewayTemplateRouteFilter> importRouteFilters;

    /**
     * Instantiates a new Builder from an existing ReplaceGatewayImportRouteFiltersOptions instance.
     *
     * @param replaceGatewayImportRouteFiltersOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceGatewayImportRouteFiltersOptions replaceGatewayImportRouteFiltersOptions) {
      this.gatewayId = replaceGatewayImportRouteFiltersOptions.gatewayId;
      this.ifMatch = replaceGatewayImportRouteFiltersOptions.ifMatch;
      this.importRouteFilters = replaceGatewayImportRouteFiltersOptions.importRouteFilters;
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
     * @param ifMatch the ifMatch
     */
    public Builder(String gatewayId, String ifMatch) {
      this.gatewayId = gatewayId;
      this.ifMatch = ifMatch;
    }

    /**
     * Builds a ReplaceGatewayImportRouteFiltersOptions.
     *
     * @return the new ReplaceGatewayImportRouteFiltersOptions instance
     */
    public ReplaceGatewayImportRouteFiltersOptions build() {
      return new ReplaceGatewayImportRouteFiltersOptions(this);
    }

    /**
     * Adds an importRouteFilters to importRouteFilters.
     *
     * @param importRouteFilters the new importRouteFilters
     * @return the ReplaceGatewayImportRouteFiltersOptions builder
     */
    public Builder addImportRouteFilters(GatewayTemplateRouteFilter importRouteFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(importRouteFilters,
        "importRouteFilters cannot be null");
      if (this.importRouteFilters == null) {
        this.importRouteFilters = new ArrayList<GatewayTemplateRouteFilter>();
      }
      this.importRouteFilters.add(importRouteFilters);
      return this;
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the ReplaceGatewayImportRouteFiltersOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplaceGatewayImportRouteFiltersOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the importRouteFilters.
     * Existing importRouteFilters will be replaced.
     *
     * @param importRouteFilters the importRouteFilters
     * @return the ReplaceGatewayImportRouteFiltersOptions builder
     */
    public Builder importRouteFilters(List<GatewayTemplateRouteFilter> importRouteFilters) {
      this.importRouteFilters = importRouteFilters;
      return this;
    }
  }

  protected ReplaceGatewayImportRouteFiltersOptions() { }

  protected ReplaceGatewayImportRouteFiltersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    gatewayId = builder.gatewayId;
    ifMatch = builder.ifMatch;
    importRouteFilters = builder.importRouteFilters;
  }

  /**
   * New builder.
   *
   * @return a ReplaceGatewayImportRouteFiltersOptions builder
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
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }

  /**
   * Gets the importRouteFilters.
   *
   * Array of directional route filters for a Direct Link gateway. When creating a gateway or replacing existing route
   * filters, the order of the items in the array will set the ordering of the list of route filters.
   *
   * @return the importRouteFilters
   */
  public List<GatewayTemplateRouteFilter> importRouteFilters() {
    return importRouteFilters;
  }
}

