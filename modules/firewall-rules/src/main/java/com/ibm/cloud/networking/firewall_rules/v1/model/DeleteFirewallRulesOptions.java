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
 * The deleteFirewallRules options.
 */
public class DeleteFirewallRulesOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private String id;

    private Builder(DeleteFirewallRulesOptions deleteFirewallRulesOptions) {
      this.xAuthUserToken = deleteFirewallRulesOptions.xAuthUserToken;
      this.crn = deleteFirewallRulesOptions.crn;
      this.zoneIdentifier = deleteFirewallRulesOptions.zoneIdentifier;
      this.id = deleteFirewallRulesOptions.id;
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
     * @param id the id
     */
    public Builder(String xAuthUserToken, String crn, String zoneIdentifier, String id) {
      this.xAuthUserToken = xAuthUserToken;
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
      this.id = id;
    }

    /**
     * Builds a DeleteFirewallRulesOptions.
     *
     * @return the new DeleteFirewallRulesOptions instance
     */
    public DeleteFirewallRulesOptions build() {
      return new DeleteFirewallRulesOptions(this);
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the DeleteFirewallRulesOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the DeleteFirewallRulesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the DeleteFirewallRulesOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteFirewallRulesOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteFirewallRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteFirewallRulesOptions builder
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
   * Identifier of zone whose firewall rules are to be deleted.
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the id.
   *
   * ids of firewall rules which will be deleted.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

