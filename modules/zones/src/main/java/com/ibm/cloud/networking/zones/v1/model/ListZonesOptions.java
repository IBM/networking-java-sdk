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
package com.ibm.cloud.networking.zones.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listZones options.
 */
public class ListZonesOptions extends GenericModel {

  protected Long page;
  protected Long perPage;

  /**
   * Builder.
   */
  public static class Builder {
    private Long page;
    private Long perPage;

    /**
     * Instantiates a new Builder from an existing ListZonesOptions instance.
     *
     * @param listZonesOptions the instance to initialize the Builder with
     */
    private Builder(ListZonesOptions listZonesOptions) {
      this.page = listZonesOptions.page;
      this.perPage = listZonesOptions.perPage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListZonesOptions.
     *
     * @return the new ListZonesOptions instance
     */
    public ListZonesOptions build() {
      return new ListZonesOptions(this);
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListZonesOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListZonesOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }
  }

  protected ListZonesOptions() { }

  protected ListZonesOptions(Builder builder) {
    page = builder.page;
    perPage = builder.perPage;
  }

  /**
   * New builder.
   *
   * @return a ListZonesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the page.
   *
   * Page number of paginated results.
   *
   * @return the page
   */
  public Long page() {
    return page;
  }

  /**
   * Gets the perPage.
   *
   * Maximum number of zones per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }
}

