/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listRangeApps options.
 */
public class ListRangeAppsOptions extends GenericModel {

  /**
   * Field by which to order the list of Range applications.
   */
  public interface Order {
    /** protocol. */
    String PROTOCOL = "protocol";
    /** app_id. */
    String APP_ID = "app_id";
    /** created_on. */
    String CREATED_ON = "created_on";
    /** modified_on. */
    String MODIFIED_ON = "modified_on";
    /** dns. */
    String DNS = "dns";
  }

  /**
   * Direction in which to order results [ascending/descending order].
   */
  public interface Direction {
    /** asc. */
    String ASC = "asc";
    /** desc. */
    String DESC = "desc";
  }

  protected Long page;
  protected Long perPage;
  protected String order;
  protected String direction;

  /**
   * Builder.
   */
  public static class Builder {
    private Long page;
    private Long perPage;
    private String order;
    private String direction;

    private Builder(ListRangeAppsOptions listRangeAppsOptions) {
      this.page = listRangeAppsOptions.page;
      this.perPage = listRangeAppsOptions.perPage;
      this.order = listRangeAppsOptions.order;
      this.direction = listRangeAppsOptions.direction;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListRangeAppsOptions.
     *
     * @return the new ListRangeAppsOptions instance
     */
    public ListRangeAppsOptions build() {
      return new ListRangeAppsOptions(this);
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListRangeAppsOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListRangeAppsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListRangeAppsOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListRangeAppsOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }
  }

  protected ListRangeAppsOptions(Builder builder) {
    page = builder.page;
    perPage = builder.perPage;
    order = builder.order;
    direction = builder.direction;
  }

  /**
   * New builder.
   *
   * @return a ListRangeAppsOptions builder
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
   * Maximum number of Range applications per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }

  /**
   * Gets the order.
   *
   * Field by which to order the list of Range applications.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the direction.
   *
   * Direction in which to order results [ascending/descending order].
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }
}

