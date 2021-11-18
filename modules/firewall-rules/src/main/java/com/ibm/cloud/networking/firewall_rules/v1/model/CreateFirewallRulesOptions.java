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
 * The createFirewallRules options.
 */
public class CreateFirewallRulesOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected List<FirewallRuleInputWithFilterId> firewallRuleInputWithFilterId;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private List<FirewallRuleInputWithFilterId> firewallRuleInputWithFilterId;

    private Builder(CreateFirewallRulesOptions createFirewallRulesOptions) {
      this.xAuthUserToken = createFirewallRulesOptions.xAuthUserToken;
      this.crn = createFirewallRulesOptions.crn;
      this.zoneIdentifier = createFirewallRulesOptions.zoneIdentifier;
      this.firewallRuleInputWithFilterId = createFirewallRulesOptions.firewallRuleInputWithFilterId;
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
     * Builds a CreateFirewallRulesOptions.
     *
     * @return the new CreateFirewallRulesOptions instance
     */
    public CreateFirewallRulesOptions build() {
      return new CreateFirewallRulesOptions(this);
    }

    /**
     * Adds an firewallRuleInputWithFilterId to firewallRuleInputWithFilterId.
     *
     * @param firewallRuleInputWithFilterId the new firewallRuleInputWithFilterId
     * @return the CreateFirewallRulesOptions builder
     */
    public Builder addFirewallRuleInputWithFilterId(FirewallRuleInputWithFilterId firewallRuleInputWithFilterId) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(firewallRuleInputWithFilterId,
        "firewallRuleInputWithFilterId cannot be null");
      if (this.firewallRuleInputWithFilterId == null) {
        this.firewallRuleInputWithFilterId = new ArrayList<FirewallRuleInputWithFilterId>();
      }
      this.firewallRuleInputWithFilterId.add(firewallRuleInputWithFilterId);
      return this;
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the CreateFirewallRulesOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateFirewallRulesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the CreateFirewallRulesOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the firewallRuleInputWithFilterId.
     * Existing firewallRuleInputWithFilterId will be replaced.
     *
     * @param firewallRuleInputWithFilterId the firewallRuleInputWithFilterId
     * @return the CreateFirewallRulesOptions builder
     */
    public Builder firewallRuleInputWithFilterId(List<FirewallRuleInputWithFilterId> firewallRuleInputWithFilterId) {
      this.firewallRuleInputWithFilterId = firewallRuleInputWithFilterId;
      return this;
    }
  }

  protected CreateFirewallRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    firewallRuleInputWithFilterId = builder.firewallRuleInputWithFilterId;
  }

  /**
   * New builder.
   *
   * @return a CreateFirewallRulesOptions builder
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
   * Full url-encoded cloud resource name (CRN) of resource instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Zone identifier of the zone for which firewall rules are created.
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the firewallRuleInputWithFilterId.
   *
   * Json objects which are used to create firewall rules.
   *
   * @return the firewallRuleInputWithFilterId
   */
  public List<FirewallRuleInputWithFilterId> firewallRuleInputWithFilterId() {
    return firewallRuleInputWithFilterId;
  }
}

