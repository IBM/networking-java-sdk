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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateFirewllRules options.
 */
public class UpdateFirewllRulesOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected List<FirewallRulesUpdateInputItem> firewallRulesUpdateInputItem;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private List<FirewallRulesUpdateInputItem> firewallRulesUpdateInputItem;

    private Builder(UpdateFirewllRulesOptions updateFirewllRulesOptions) {
      this.xAuthUserToken = updateFirewllRulesOptions.xAuthUserToken;
      this.crn = updateFirewllRulesOptions.crn;
      this.zoneIdentifier = updateFirewllRulesOptions.zoneIdentifier;
      this.firewallRulesUpdateInputItem = updateFirewllRulesOptions.firewallRulesUpdateInputItem;
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
     */
    public Builder(String xAuthUserToken, String crn, String zoneIdentifier) {
      this.xAuthUserToken = xAuthUserToken;
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
    }

    /**
     * Builds a UpdateFirewllRulesOptions.
     *
     * @return the new UpdateFirewllRulesOptions instance
     */
    public UpdateFirewllRulesOptions build() {
      return new UpdateFirewllRulesOptions(this);
    }

    /**
     * Adds an firewallRulesUpdateInputItem to firewallRulesUpdateInputItem.
     *
     * @param firewallRulesUpdateInputItem the new firewallRulesUpdateInputItem
     * @return the UpdateFirewllRulesOptions builder
     */
    public Builder addFirewallRulesUpdateInputItem(FirewallRulesUpdateInputItem firewallRulesUpdateInputItem) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(firewallRulesUpdateInputItem,
        "firewallRulesUpdateInputItem cannot be null");
      if (this.firewallRulesUpdateInputItem == null) {
        this.firewallRulesUpdateInputItem = new ArrayList<FirewallRulesUpdateInputItem>();
      }
      this.firewallRulesUpdateInputItem.add(firewallRulesUpdateInputItem);
      return this;
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the UpdateFirewllRulesOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the UpdateFirewllRulesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the UpdateFirewllRulesOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the firewallRulesUpdateInputItem.
     * Existing firewallRulesUpdateInputItem will be replaced.
     *
     * @param firewallRulesUpdateInputItem the firewallRulesUpdateInputItem
     * @return the UpdateFirewllRulesOptions builder
     */
    public Builder firewallRulesUpdateInputItem(List<FirewallRulesUpdateInputItem> firewallRulesUpdateInputItem) {
      this.firewallRulesUpdateInputItem = firewallRulesUpdateInputItem;
      return this;
    }
  }

  protected UpdateFirewllRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    firewallRulesUpdateInputItem = builder.firewallRulesUpdateInputItem;
  }

  /**
   * New builder.
   *
   * @return a UpdateFirewllRulesOptions builder
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
   * Gets the firewallRulesUpdateInputItem.
   *
   * @return the firewallRulesUpdateInputItem
   */
  public List<FirewallRulesUpdateInputItem> firewallRulesUpdateInputItem() {
    return firewallRulesUpdateInputItem;
  }
}

