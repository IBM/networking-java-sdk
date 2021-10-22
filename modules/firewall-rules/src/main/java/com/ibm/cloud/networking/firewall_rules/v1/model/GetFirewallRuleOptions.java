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
 * The getFirewallRule options.
 */
public class GetFirewallRuleOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected String firewallRuleIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private String firewallRuleIdentifier;

    private Builder(GetFirewallRuleOptions getFirewallRuleOptions) {
      this.xAuthUserToken = getFirewallRuleOptions.xAuthUserToken;
      this.crn = getFirewallRuleOptions.crn;
      this.zoneIdentifier = getFirewallRuleOptions.zoneIdentifier;
      this.firewallRuleIdentifier = getFirewallRuleOptions.firewallRuleIdentifier;
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
     * Builds a GetFirewallRuleOptions.
     *
     * @return the new GetFirewallRuleOptions instance
     */
    public GetFirewallRuleOptions build() {
      return new GetFirewallRuleOptions(this);
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the GetFirewallRuleOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetFirewallRuleOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the GetFirewallRuleOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the firewallRuleIdentifier.
     *
     * @param firewallRuleIdentifier the firewallRuleIdentifier
     * @return the GetFirewallRuleOptions builder
     */
    public Builder firewallRuleIdentifier(String firewallRuleIdentifier) {
      this.firewallRuleIdentifier = firewallRuleIdentifier;
      return this;
    }
  }

  protected GetFirewallRuleOptions(Builder builder) {
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
  }

  /**
   * New builder.
   *
   * @return a GetFirewallRuleOptions builder
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
   * Identifier of firewall rule for the given zone.
   *
   * @return the firewallRuleIdentifier
   */
  public String firewallRuleIdentifier() {
    return firewallRuleIdentifier;
  }
}

