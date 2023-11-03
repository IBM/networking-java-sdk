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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listConnections options.
 */
public class ListConnectionsOptions extends GenericModel {

  protected Long limit;
  protected String start;
  protected String networkId;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private String start;
    private String networkId;

    /**
     * Instantiates a new Builder from an existing ListConnectionsOptions instance.
     *
     * @param listConnectionsOptions the instance to initialize the Builder with
     */
    private Builder(ListConnectionsOptions listConnectionsOptions) {
      this.limit = listConnectionsOptions.limit;
      this.start = listConnectionsOptions.start;
      this.networkId = listConnectionsOptions.networkId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListConnectionsOptions.
     *
     * @return the new ListConnectionsOptions instance
     */
    public ListConnectionsOptions build() {
      return new ListConnectionsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListConnectionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListConnectionsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the ListConnectionsOptions builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }
  }

  protected ListConnectionsOptions() { }

  protected ListConnectionsOptions(Builder builder) {
    limit = builder.limit;
    start = builder.start;
    networkId = builder.networkId;
  }

  /**
   * New builder.
   *
   * @return a ListConnectionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources to return per page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * A server supplied token determining which resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the networkId.
   *
   * Search for connections with the given network_id value.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }
}

