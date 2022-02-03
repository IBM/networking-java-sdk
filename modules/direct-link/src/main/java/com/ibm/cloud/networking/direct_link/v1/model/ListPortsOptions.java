/*
 * (C) Copyright IBM Corp. 2022.
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
 * The listPorts options.
 */
public class ListPortsOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String locationName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String locationName;

    private Builder(ListPortsOptions listPortsOptions) {
      this.start = listPortsOptions.start;
      this.limit = listPortsOptions.limit;
      this.locationName = listPortsOptions.locationName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListPortsOptions.
     *
     * @return the new ListPortsOptions instance
     */
    public ListPortsOptions build() {
      return new ListPortsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListPortsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListPortsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the locationName.
     *
     * @param locationName the locationName
     * @return the ListPortsOptions builder
     */
    public Builder locationName(String locationName) {
      this.locationName = locationName;
      return this;
    }
  }

  protected ListPortsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    locationName = builder.locationName;
  }

  /**
   * New builder.
   *
   * @return a ListPortsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the start.
   *
   * A server-supplied token determining which resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the locationName.
   *
   * Direct Link location short name.
   *
   * @return the locationName
   */
  public String locationName() {
    return locationName;
  }
}

