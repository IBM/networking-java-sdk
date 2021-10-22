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
 * Json objects which are used to create firewall rule.
 */
public class FirewallRuleInputWithFilterId extends GenericModel {

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

  protected FirewallRuleInputWithFilterIdFilter filter;
  protected String action;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private FirewallRuleInputWithFilterIdFilter filter;
    private String action;
    private String description;

    private Builder(FirewallRuleInputWithFilterId firewallRuleInputWithFilterId) {
      this.filter = firewallRuleInputWithFilterId.filter;
      this.action = firewallRuleInputWithFilterId.action;
      this.description = firewallRuleInputWithFilterId.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param filter the filter
     * @param action the action
     */
    public Builder(FirewallRuleInputWithFilterIdFilter filter, String action) {
      this.filter = filter;
      this.action = action;
    }

    /**
     * Builds a FirewallRuleInputWithFilterId.
     *
     * @return the new FirewallRuleInputWithFilterId instance
     */
    public FirewallRuleInputWithFilterId build() {
      return new FirewallRuleInputWithFilterId(this);
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the FirewallRuleInputWithFilterId builder
     */
    public Builder filter(FirewallRuleInputWithFilterIdFilter filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the FirewallRuleInputWithFilterId builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the FirewallRuleInputWithFilterId builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected FirewallRuleInputWithFilterId(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.filter,
      "filter cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    filter = builder.filter;
    action = builder.action;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a FirewallRuleInputWithFilterId builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the filter.
   *
   * An existing filter.
   *
   * @return the filter
   */
  public FirewallRuleInputWithFilterIdFilter filter() {
    return filter;
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
   * Gets the description.
   *
   * To briefly describe the firewall rule, omitted from object if empty.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

