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
 * The updateFirewallRule options.
 */
public class UpdateFirewallRuleOptions extends GenericModel {

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

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected String firewallRuleIdentifier;
  protected String action;
  protected Boolean paused;
  protected String description;
  protected FirewallRuleUpdateInputFilter filter;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private String firewallRuleIdentifier;
    private String action;
    private Boolean paused;
    private String description;
    private FirewallRuleUpdateInputFilter filter;

    private Builder(UpdateFirewallRuleOptions updateFirewallRuleOptions) {
      this.xAuthUserToken = updateFirewallRuleOptions.xAuthUserToken;
      this.crn = updateFirewallRuleOptions.crn;
      this.zoneIdentifier = updateFirewallRuleOptions.zoneIdentifier;
      this.firewallRuleIdentifier = updateFirewallRuleOptions.firewallRuleIdentifier;
      this.action = updateFirewallRuleOptions.action;
      this.paused = updateFirewallRuleOptions.paused;
      this.description = updateFirewallRuleOptions.description;
      this.filter = updateFirewallRuleOptions.filter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @param crn the crn
     * @param zoneIdentifier the zoneIdentifier
     * @param firewallRuleIdentifier the firewallRuleIdentifier
     */
    public Builder(String xAuthUserToken, String crn, String zoneIdentifier, String firewallRuleIdentifier) {
      this.xAuthUserToken = xAuthUserToken;
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
      this.firewallRuleIdentifier = firewallRuleIdentifier;
    }

    /**
     * Builds a UpdateFirewallRuleOptions.
     *
     * @return the new UpdateFirewallRuleOptions instance
     */
    public UpdateFirewallRuleOptions build() {
      return new UpdateFirewallRuleOptions(this);
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the firewallRuleIdentifier.
     *
     * @param firewallRuleIdentifier the firewallRuleIdentifier
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder firewallRuleIdentifier(String firewallRuleIdentifier) {
      this.firewallRuleIdentifier = firewallRuleIdentifier;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the UpdateFirewallRuleOptions builder
     */
    public Builder filter(FirewallRuleUpdateInputFilter filter) {
      this.filter = filter;
      return this;
    }
  }

  protected UpdateFirewallRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.firewallRuleIdentifier,
      "firewallRuleIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    firewallRuleIdentifier = builder.firewallRuleIdentifier;
    action = builder.action;
    paused = builder.paused;
    description = builder.description;
    filter = builder.filter;
  }

  /**
   * New builder.
   *
   * @return a UpdateFirewallRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xAuthUserToken.
   *
   * IBM Cloud user IAM token.
   *
   * @return the xAuthUserToken
   */
  public String xAuthUserToken() {
    return xAuthUserToken;
  }

  /**
   * Gets the crn.
   *
   * Full crn of the service instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Zone identifier (zone id).
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the firewallRuleIdentifier.
   *
   * Identifier of firewall rule.
   *
   * @return the firewallRuleIdentifier
   */
  public String firewallRuleIdentifier() {
    return firewallRuleIdentifier;
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
  public FirewallRuleUpdateInputFilter filter() {
    return filter;
  }
}

