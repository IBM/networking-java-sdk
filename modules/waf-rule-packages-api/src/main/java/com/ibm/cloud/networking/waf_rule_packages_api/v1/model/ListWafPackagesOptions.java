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
package com.ibm.cloud.networking.waf_rule_packages_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listWafPackages options.
 */
public class ListWafPackagesOptions extends GenericModel {

  /**
   * Direction to order packages.
   */
  public interface Direction {
    /** desc. */
    String DESC = "desc";
    /** asc. */
    String ASC = "asc";
  }

  /**
   * Whether to match all search requirements or at least one (any).
   */
  public interface Match {
    /** all. */
    String ALL = "all";
    /** any. */
    String ANY = "any";
  }

  protected String name;
  protected Long page;
  protected Long perPage;
  protected String order;
  protected String direction;
  protected String match;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Long page;
    private Long perPage;
    private String order;
    private String direction;
    private String match;

    private Builder(ListWafPackagesOptions listWafPackagesOptions) {
      this.name = listWafPackagesOptions.name;
      this.page = listWafPackagesOptions.page;
      this.perPage = listWafPackagesOptions.perPage;
      this.order = listWafPackagesOptions.order;
      this.direction = listWafPackagesOptions.direction;
      this.match = listWafPackagesOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListWafPackagesOptions.
     *
     * @return the new ListWafPackagesOptions instance
     */
    public ListWafPackagesOptions build() {
      return new ListWafPackagesOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListWafPackagesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListWafPackagesOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListWafPackagesOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListWafPackagesOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListWafPackagesOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListWafPackagesOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }
  }

  protected ListWafPackagesOptions(Builder builder) {
    name = builder.name;
    page = builder.page;
    perPage = builder.perPage;
    order = builder.order;
    direction = builder.direction;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a ListWafPackagesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the firewall package.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Number of packages per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }

  /**
   * Gets the order.
   *
   * Field to order packages by.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the direction.
   *
   * Direction to order packages.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the match.
   *
   * Whether to match all search requirements or at least one (any).
   *
   * @return the match
   */
  public String match() {
    return match;
  }
}

