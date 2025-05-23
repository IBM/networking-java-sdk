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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listTransitGateways options.
 */
public class ListTransitGatewaysOptions extends GenericModel {

  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListTransitGatewaysOptions instance.
     *
     * @param listTransitGatewaysOptions the instance to initialize the Builder with
     */
    private Builder(ListTransitGatewaysOptions listTransitGatewaysOptions) {
      this.limit = listTransitGatewaysOptions.limit;
      this.start = listTransitGatewaysOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListTransitGatewaysOptions.
     *
     * @return the new ListTransitGatewaysOptions instance
     */
    public ListTransitGatewaysOptions build() {
      return new ListTransitGatewaysOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListTransitGatewaysOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListTransitGatewaysOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListTransitGatewaysOptions() { }

  protected ListTransitGatewaysOptions(Builder builder) {
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListTransitGatewaysOptions builder
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
}

