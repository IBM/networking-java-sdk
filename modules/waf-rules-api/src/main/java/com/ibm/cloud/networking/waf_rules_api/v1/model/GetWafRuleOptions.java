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
 * The getWafRule options.
 */
public class GetWafRuleOptions extends GenericModel {

  protected String packageId;
  protected String identifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String packageId;
    private String identifier;

    private Builder(GetWafRuleOptions getWafRuleOptions) {
      this.packageId = getWafRuleOptions.packageId;
      this.identifier = getWafRuleOptions.identifier;
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
     * Builds a GetWafRuleOptions.
     *
     * @return the new GetWafRuleOptions instance
     */
    public GetWafRuleOptions build() {
      return new GetWafRuleOptions(this);
    }

    /**
     * Set the packageId.
     *
     * @param packageId the packageId
     * @return the GetWafRuleOptions builder
     */
    public Builder packageId(String packageId) {
      this.packageId = packageId;
      return this;
    }

    /**
     * Set the identifier.
     *
     * @param identifier the identifier
     * @return the GetWafRuleOptions builder
     */
    public Builder identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }
  }

  protected GetWafRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.packageId,
      "packageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.identifier,
      "identifier cannot be empty");
    packageId = builder.packageId;
    identifier = builder.identifier;
  }

  /**
   * New builder.
   *
   * @return a GetWafRuleOptions builder
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
}

