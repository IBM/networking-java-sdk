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
 * The updateWafRule options.
 */
public class UpdateWafRuleOptions extends GenericModel {

  protected String packageId;
  protected String identifier;
  protected WafRuleBodyCis cis;
  protected WafRuleBodyOwasp owasp;

  /**
   * Builder.
   */
  public static class Builder {
    private String packageId;
    private String identifier;
    private WafRuleBodyCis cis;
    private WafRuleBodyOwasp owasp;

    private Builder(UpdateWafRuleOptions updateWafRuleOptions) {
      this.packageId = updateWafRuleOptions.packageId;
      this.identifier = updateWafRuleOptions.identifier;
      this.cis = updateWafRuleOptions.cis;
      this.owasp = updateWafRuleOptions.owasp;
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
     * @param identifier the identifier
     */
    public Builder(String packageId, String identifier) {
      this.packageId = packageId;
      this.identifier = identifier;
    }

    /**
     * Builds a UpdateWafRuleOptions.
     *
     * @return the new UpdateWafRuleOptions instance
     */
    public UpdateWafRuleOptions build() {
      return new UpdateWafRuleOptions(this);
    }

    /**
     * Set the packageId.
     *
     * @param packageId the packageId
     * @return the UpdateWafRuleOptions builder
     */
    public Builder packageId(String packageId) {
      this.packageId = packageId;
      return this;
    }

    /**
     * Set the identifier.
     *
     * @param identifier the identifier
     * @return the UpdateWafRuleOptions builder
     */
    public Builder identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    /**
     * Set the cis.
     *
     * @param cis the cis
     * @return the UpdateWafRuleOptions builder
     */
    public Builder cis(WafRuleBodyCis cis) {
      this.cis = cis;
      return this;
    }

    /**
     * Set the owasp.
     *
     * @param owasp the owasp
     * @return the UpdateWafRuleOptions builder
     */
    public Builder owasp(WafRuleBodyOwasp owasp) {
      this.owasp = owasp;
      return this;
    }
  }

  protected UpdateWafRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.packageId,
      "packageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.identifier,
      "identifier cannot be empty");
    packageId = builder.packageId;
    identifier = builder.identifier;
    cis = builder.cis;
    owasp = builder.owasp;
  }

  /**
   * New builder.
   *
   * @return a UpdateWafRuleOptions builder
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
   * Gets the identifier.
   *
   * rule identifier.
   *
   * @return the identifier
   */
  public String identifier() {
    return identifier;
  }

  /**
   * Gets the cis.
   *
   * cis package.
   *
   * @return the cis
   */
  public WafRuleBodyCis cis() {
    return cis;
  }

  /**
   * Gets the owasp.
   *
   * owasp package.
   *
   * @return the owasp
   */
  public WafRuleBodyOwasp owasp() {
    return owasp;
  }
}

