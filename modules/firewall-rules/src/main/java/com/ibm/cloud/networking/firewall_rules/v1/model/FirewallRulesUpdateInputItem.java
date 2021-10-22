/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.firewall_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * FirewallRulesUpdateInputItem.
 */
public class FirewallRulesUpdateInputItem extends GenericModel {

  /**
   * The firewall action to perform, "log" action is only available for enterprise plan instances.
   */
  public interface Action {
    /** log. */
    String LOG = "log";
    /** allow. */
    String ALLOW = "allow";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
    /** block. */
    String BLOCK = "block";
  }

  protected String id;
  protected String action;
  protected Boolean paused;
  protected String description;
  protected FirewallRulesUpdateInputItemFilter filter;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String action;
    private Boolean paused;
    private String description;
    private FirewallRulesUpdateInputItemFilter filter;

    private Builder(FirewallRulesUpdateInputItem firewallRulesUpdateInputItem) {
      this.id = firewallRulesUpdateInputItem.id;
      this.action = firewallRulesUpdateInputItem.action;
      this.paused = firewallRulesUpdateInputItem.paused;
      this.description = firewallRulesUpdateInputItem.description;
      this.filter = firewallRulesUpdateInputItem.filter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param action the action
     */
    public Builder(String id, String action) {
      this.id = id;
      this.action = action;
    }

    /**
     * Builds a FirewallRulesUpdateInputItem.
     *
     * @return the new FirewallRulesUpdateInputItem instance
     */
    public FirewallRulesUpdateInputItem build() {
      return new FirewallRulesUpdateInputItem(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the FirewallRulesUpdateInputItem builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the FirewallRulesUpdateInputItem builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the FirewallRulesUpdateInputItem builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the FirewallRulesUpdateInputItem builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the FirewallRulesUpdateInputItem builder
     */
    public Builder filter(FirewallRulesUpdateInputItemFilter filter) {
      this.filter = filter;
      return this;
    }
  }

  protected FirewallRulesUpdateInputItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    id = builder.id;
    action = builder.action;
    paused = builder.paused;
    description = builder.description;
    filter = builder.filter;
  }

  /**
   * New builder.
   *
   * @return a FirewallRulesUpdateInputItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Identifier of the firewall rule.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the action.
   *
   * The firewall action to perform, "log" action is only available for enterprise plan instances.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the paused.
   *
   * Indicates if the firewall rule is active.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * To briefly describe the firewall rule, omitted from object if empty.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the filter.
   *
   * An existing filter.
   *
   * @return the filter
   */
  public FirewallRulesUpdateInputItemFilter filter() {
    return filter;
  }
}

