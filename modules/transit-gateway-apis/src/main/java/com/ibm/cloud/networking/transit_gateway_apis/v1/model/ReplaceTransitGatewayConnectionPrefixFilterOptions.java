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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceTransitGatewayConnectionPrefixFilter options.
 */
public class ReplaceTransitGatewayConnectionPrefixFilterOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected List<PrefixFilterPut> prefixFilters;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private List<PrefixFilterPut> prefixFilters;

    /**
     * Instantiates a new Builder from an existing ReplaceTransitGatewayConnectionPrefixFilterOptions instance.
     *
     * @param replaceTransitGatewayConnectionPrefixFilterOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceTransitGatewayConnectionPrefixFilterOptions replaceTransitGatewayConnectionPrefixFilterOptions) {
      this.transitGatewayId = replaceTransitGatewayConnectionPrefixFilterOptions.transitGatewayId;
      this.id = replaceTransitGatewayConnectionPrefixFilterOptions.id;
      this.prefixFilters = replaceTransitGatewayConnectionPrefixFilterOptions.prefixFilters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param transitGatewayId the transitGatewayId
     * @param id the id
     * @param prefixFilters the prefixFilters
     */
    public Builder(String transitGatewayId, String id, List<PrefixFilterPut> prefixFilters) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.prefixFilters = prefixFilters;
    }

    /**
     * Builds a ReplaceTransitGatewayConnectionPrefixFilterOptions.
     *
     * @return the new ReplaceTransitGatewayConnectionPrefixFilterOptions instance
     */
    public ReplaceTransitGatewayConnectionPrefixFilterOptions build() {
      return new ReplaceTransitGatewayConnectionPrefixFilterOptions(this);
    }

    /**
     * Adds an prefixFilters to prefixFilters.
     *
     * @param prefixFilters the new prefixFilters
     * @return the ReplaceTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder addPrefixFilters(PrefixFilterPut prefixFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(prefixFilters,
        "prefixFilters cannot be null");
      if (this.prefixFilters == null) {
        this.prefixFilters = new ArrayList<PrefixFilterPut>();
      }
      this.prefixFilters.add(prefixFilters);
      return this;
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the ReplaceTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the prefixFilters.
     * Existing prefixFilters will be replaced.
     *
     * @param prefixFilters the prefixFilters
     * @return the ReplaceTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder prefixFilters(List<PrefixFilterPut> prefixFilters) {
      this.prefixFilters = prefixFilters;
      return this;
    }
  }

  protected ReplaceTransitGatewayConnectionPrefixFilterOptions() { }

  protected ReplaceTransitGatewayConnectionPrefixFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefixFilters,
      "prefixFilters cannot be null");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    prefixFilters = builder.prefixFilters;
  }

  /**
   * New builder.
   *
   * @return a ReplaceTransitGatewayConnectionPrefixFilterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the transitGatewayId.
   *
   * The Transit Gateway identifier.
   *
   * @return the transitGatewayId
   */
  public String transitGatewayId() {
    return transitGatewayId;
  }

  /**
   * Gets the id.
   *
   * The connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the prefixFilters.
   *
   * Array of prefix filters.
   *
   * @return the prefixFilters
   */
  public List<PrefixFilterPut> prefixFilters() {
    return prefixFilters;
  }
}

