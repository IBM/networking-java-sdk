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
package com.ibm.cloud.networking.waf_rule_groups_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listWafRuleGroups options.
 */
public class ListWafRuleGroupsOptions extends GenericModel {

  /**
   * Whether or not the rules contained within this group are configurable/usable.
   */
  public interface Mode {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

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

  protected String pkgId;
  protected String name;
  protected String mode;
  protected String rulesCount;
  protected Long page;
  protected Long perPage;
  protected String order;
  protected String direction;
  protected String match;

  /**
   * Builder.
   */
  public static class Builder {
    private String pkgId;
    private String name;
    private String mode;
    private String rulesCount;
    private Long page;
    private Long perPage;
    private String order;
    private String direction;
    private String match;

    private Builder(ListWafRuleGroupsOptions listWafRuleGroupsOptions) {
      this.pkgId = listWafRuleGroupsOptions.pkgId;
      this.name = listWafRuleGroupsOptions.name;
      this.mode = listWafRuleGroupsOptions.mode;
      this.rulesCount = listWafRuleGroupsOptions.rulesCount;
      this.page = listWafRuleGroupsOptions.page;
      this.perPage = listWafRuleGroupsOptions.perPage;
      this.order = listWafRuleGroupsOptions.order;
      this.direction = listWafRuleGroupsOptions.direction;
      this.match = listWafRuleGroupsOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pkgId the pkgId
     */
    public Builder(String pkgId) {
      this.pkgId = pkgId;
    }

    /**
     * Builds a ListWafRuleGroupsOptions.
     *
     * @return the new ListWafRuleGroupsOptions instance
     */
    public ListWafRuleGroupsOptions build() {
      return new ListWafRuleGroupsOptions(this);
    }

    /**
     * Set the pkgId.
     *
     * @param pkgId the pkgId
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder pkgId(String pkgId) {
      this.pkgId = pkgId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the rulesCount.
     *
     * @param rulesCount the rulesCount
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder rulesCount(String rulesCount) {
      this.rulesCount = rulesCount;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListWafRuleGroupsOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }
  }

  protected ListWafRuleGroupsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pkgId,
      "pkgId cannot be empty");
    pkgId = builder.pkgId;
    name = builder.name;
    mode = builder.mode;
    rulesCount = builder.rulesCount;
    page = builder.page;
    perPage = builder.perPage;
    order = builder.order;
    direction = builder.direction;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a ListWafRuleGroupsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pkgId.
   *
   * Package ID.
   *
   * @return the pkgId
   */
  public String pkgId() {
    return pkgId;
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
   * Gets the mode.
   *
   * Whether or not the rules contained within this group are configurable/usable.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the rulesCount.
   *
   * How many rules are contained within this group.
   *
   * @return the rulesCount
   */
  public String rulesCount() {
    return rulesCount;
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

