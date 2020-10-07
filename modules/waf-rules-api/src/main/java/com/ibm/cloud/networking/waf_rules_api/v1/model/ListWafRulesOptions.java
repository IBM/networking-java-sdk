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
package com.ibm.cloud.networking.waf_rules_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listWafRules options.
 */
public class ListWafRulesOptions extends GenericModel {

  /**
   * The Rule Mode.
   */
  public interface Mode {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String packageId;
  protected String mode;
  protected String priority;
  protected String match;
  protected String order;
  protected String groupId;
  protected String description;
  protected String direction;
  protected Long page;
  protected Long perPage;

  /**
   * Builder.
   */
  public static class Builder {
    private String packageId;
    private String mode;
    private String priority;
    private String match;
    private String order;
    private String groupId;
    private String description;
    private String direction;
    private Long page;
    private Long perPage;

    private Builder(ListWafRulesOptions listWafRulesOptions) {
      this.packageId = listWafRulesOptions.packageId;
      this.mode = listWafRulesOptions.mode;
      this.priority = listWafRulesOptions.priority;
      this.match = listWafRulesOptions.match;
      this.order = listWafRulesOptions.order;
      this.groupId = listWafRulesOptions.groupId;
      this.description = listWafRulesOptions.description;
      this.direction = listWafRulesOptions.direction;
      this.page = listWafRulesOptions.page;
      this.perPage = listWafRulesOptions.perPage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param packageId the packageId
     */
    public Builder(String packageId) {
      this.packageId = packageId;
    }

    /**
     * Builds a ListWafRulesOptions.
     *
     * @return the new ListWafRulesOptions instance
     */
    public ListWafRulesOptions build() {
      return new ListWafRulesOptions(this);
    }

    /**
     * Set the packageId.
     *
     * @param packageId the packageId
     * @return the ListWafRulesOptions builder
     */
    public Builder packageId(String packageId) {
      this.packageId = packageId;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the ListWafRulesOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the ListWafRulesOptions builder
     */
    public Builder priority(String priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListWafRulesOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListWafRulesOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the ListWafRulesOptions builder
     */
    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ListWafRulesOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListWafRulesOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListWafRulesOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListWafRulesOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }
  }

  protected ListWafRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.packageId,
      "packageId cannot be empty");
    packageId = builder.packageId;
    mode = builder.mode;
    priority = builder.priority;
    match = builder.match;
    order = builder.order;
    groupId = builder.groupId;
    description = builder.description;
    direction = builder.direction;
    page = builder.page;
    perPage = builder.perPage;
  }

  /**
   * New builder.
   *
   * @return a ListWafRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the packageId.
   *
   * package id.
   *
   * @return the packageId
   */
  public String packageId() {
    return packageId;
  }

  /**
   * Gets the mode.
   *
   * The Rule Mode.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the priority.
   *
   * The order in which the individual rule is executed within the related group.
   *
   * @return the priority
   */
  public String priority() {
    return priority;
  }

  /**
   * Gets the match.
   *
   * Whether to match all search requirements or at least one. default value: all. valid values: any, all.
   *
   * @return the match
   */
  public String match() {
    return match;
  }

  /**
   * Gets the order.
   *
   * Field to order rules by. valid values: priority, group_id, description.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the groupId.
   *
   * WAF group identifier tag. max length: 32; Read-only.
   *
   * @return the groupId
   */
  public String groupId() {
    return groupId;
  }

  /**
   * Gets the description.
   *
   * Public description of the rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the direction.
   *
   * Direction to order rules. valid values: asc, desc.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the page.
   *
   * Page number of paginated results. default value: 1; min value:1.
   *
   * @return the page
   */
  public Long page() {
    return page;
  }

  /**
   * Gets the perPage.
   *
   * Number of rules per page. default value: 50; min value:5; max value:100.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }
}

