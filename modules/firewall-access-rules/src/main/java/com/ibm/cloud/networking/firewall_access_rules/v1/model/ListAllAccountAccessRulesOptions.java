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
package com.ibm.cloud.networking.firewall_access_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAllAccountAccessRules options.
 */
public class ListAllAccountAccessRulesOptions extends GenericModel {

  /**
   * Search access rules by mode.
   */
  public interface Mode {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** whitelist. */
    String WHITELIST = "whitelist";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  /**
   * Search access rules by configuration target.
   */
  public interface ConfigurationTarget {
    /** ip. */
    String IP = "ip";
    /** ip_range. */
    String IP_RANGE = "ip_range";
    /** asn. */
    String ASN = "asn";
    /** country. */
    String COUNTRY = "country";
  }

  /**
   * Field by which to order list of access rules.
   */
  public interface Order {
    /** target. */
    String TARGET = "target";
    /** value. */
    String VALUE = "value";
    /** mode. */
    String MODE = "mode";
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

  /**
   * Whether to match all (all) or atleast one search parameter (any).
   */
  public interface Match {
    /** any. */
    String ANY = "any";
    /** all. */
    String ALL = "all";
  }

  protected String notes;
  protected String mode;
  protected String configurationTarget;
  protected String configurationValue;
  protected Long page;
  protected Long perPage;
  protected String order;
  protected String direction;
  protected String match;

  /**
   * Builder.
   */
  public static class Builder {
    private String notes;
    private String mode;
    private String configurationTarget;
    private String configurationValue;
    private Long page;
    private Long perPage;
    private String order;
    private String direction;
    private String match;

    private Builder(ListAllAccountAccessRulesOptions listAllAccountAccessRulesOptions) {
      this.notes = listAllAccountAccessRulesOptions.notes;
      this.mode = listAllAccountAccessRulesOptions.mode;
      this.configurationTarget = listAllAccountAccessRulesOptions.configurationTarget;
      this.configurationValue = listAllAccountAccessRulesOptions.configurationValue;
      this.page = listAllAccountAccessRulesOptions.page;
      this.perPage = listAllAccountAccessRulesOptions.perPage;
      this.order = listAllAccountAccessRulesOptions.order;
      this.direction = listAllAccountAccessRulesOptions.direction;
      this.match = listAllAccountAccessRulesOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListAllAccountAccessRulesOptions.
     *
     * @return the new ListAllAccountAccessRulesOptions instance
     */
    public ListAllAccountAccessRulesOptions build() {
      return new ListAllAccountAccessRulesOptions(this);
    }

    /**
     * Set the notes.
     *
     * @param notes the notes
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder notes(String notes) {
      this.notes = notes;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the configurationTarget.
     *
     * @param configurationTarget the configurationTarget
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder configurationTarget(String configurationTarget) {
      this.configurationTarget = configurationTarget;
      return this;
    }

    /**
     * Set the configurationValue.
     *
     * @param configurationValue the configurationValue
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder configurationValue(String configurationValue) {
      this.configurationValue = configurationValue;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListAllAccountAccessRulesOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }
  }

  protected ListAllAccountAccessRulesOptions(Builder builder) {
    notes = builder.notes;
    mode = builder.mode;
    configurationTarget = builder.configurationTarget;
    configurationValue = builder.configurationValue;
    page = builder.page;
    perPage = builder.perPage;
    order = builder.order;
    direction = builder.direction;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a ListAllAccountAccessRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the notes.
   *
   * Search access rules by note.(Not case sensitive).
   *
   * @return the notes
   */
  public String notes() {
    return notes;
  }

  /**
   * Gets the mode.
   *
   * Search access rules by mode.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the configurationTarget.
   *
   * Search access rules by configuration target.
   *
   * @return the configurationTarget
   */
  public String configurationTarget() {
    return configurationTarget;
  }

  /**
   * Gets the configurationValue.
   *
   * Search access rules by configuration value which can be IP, IPrange, or country code.
   *
   * @return the configurationValue
   */
  public String configurationValue() {
    return configurationValue;
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
   * Maximum number of access rules per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }

  /**
   * Gets the order.
   *
   * Field by which to order list of access rules.
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

  /**
   * Gets the match.
   *
   * Whether to match all (all) or atleast one search parameter (any).
   *
   * @return the match
   */
  public String match() {
    return match;
  }
}

