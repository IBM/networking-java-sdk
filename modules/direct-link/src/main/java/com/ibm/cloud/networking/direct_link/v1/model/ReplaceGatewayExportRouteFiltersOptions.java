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
 * The replaceGatewayExportRouteFilters options.
 */
public class ReplaceGatewayExportRouteFiltersOptions extends GenericModel {

  protected String gatewayId;
  protected String ifMatch;
  protected List<GatewayTemplateRouteFilter> exportRouteFilters;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String ifMatch;
    private List<GatewayTemplateRouteFilter> exportRouteFilters;

    /**
     * Instantiates a new Builder from an existing ReplaceGatewayExportRouteFiltersOptions instance.
     *
     * @param replaceGatewayExportRouteFiltersOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceGatewayExportRouteFiltersOptions replaceGatewayExportRouteFiltersOptions) {
      this.gatewayId = replaceGatewayExportRouteFiltersOptions.gatewayId;
      this.ifMatch = replaceGatewayExportRouteFiltersOptions.ifMatch;
      this.exportRouteFilters = replaceGatewayExportRouteFiltersOptions.exportRouteFilters;
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
     * Builds a ReplaceGatewayExportRouteFiltersOptions.
     *
     * @return the new ReplaceGatewayExportRouteFiltersOptions instance
     */
    public ReplaceGatewayExportRouteFiltersOptions build() {
      return new ReplaceGatewayExportRouteFiltersOptions(this);
    }

    /**
     * Adds an exportRouteFilters to exportRouteFilters.
     *
     * @param exportRouteFilters the new exportRouteFilters
     * @return the ReplaceGatewayExportRouteFiltersOptions builder
     */
    public Builder addExportRouteFilters(GatewayTemplateRouteFilter exportRouteFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(exportRouteFilters,
        "exportRouteFilters cannot be null");
      if (this.exportRouteFilters == null) {
        this.exportRouteFilters = new ArrayList<GatewayTemplateRouteFilter>();
      }
      this.exportRouteFilters.add(exportRouteFilters);
      return this;
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the ReplaceGatewayExportRouteFiltersOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the ReplaceGatewayExportRouteFiltersOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }

    /**
     * Set the exportRouteFilters.
     * Existing exportRouteFilters will be replaced.
     *
     * @param exportRouteFilters the exportRouteFilters
     * @return the ReplaceGatewayExportRouteFiltersOptions builder
     */
    public Builder exportRouteFilters(List<GatewayTemplateRouteFilter> exportRouteFilters) {
      this.exportRouteFilters = exportRouteFilters;
      return this;
    }
  }

  protected ReplaceGatewayExportRouteFiltersOptions() { }

  protected ReplaceGatewayExportRouteFiltersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ifMatch,
      "ifMatch cannot be null");
    gatewayId = builder.gatewayId;
    ifMatch = builder.ifMatch;
    exportRouteFilters = builder.exportRouteFilters;
  }

  /**
   * New builder.
   *
   * @return a ReplaceGatewayExportRouteFiltersOptions builder
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
   * Gets the exportRouteFilters.
   *
   * Array of directional route filters for a Direct Link gateway. When creating a gateway or replacing existing route
   * filters, the order of the items in the array will set the ordering of the list of route filters.
   *
   * @return the exportRouteFilters
   */
  public List<GatewayTemplateRouteFilter> exportRouteFilters() {
    return exportRouteFilters;
  }
}

