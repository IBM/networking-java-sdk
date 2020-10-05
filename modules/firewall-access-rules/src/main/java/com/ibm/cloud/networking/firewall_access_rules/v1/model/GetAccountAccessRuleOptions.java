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
 * The getAccountAccessRule options.
 */
public class GetAccountAccessRuleOptions extends GenericModel {

  protected String accessruleIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessruleIdentifier;

    private Builder(GetAccountAccessRuleOptions getAccountAccessRuleOptions) {
      this.accessruleIdentifier = getAccountAccessRuleOptions.accessruleIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accessruleIdentifier the accessruleIdentifier
     */
    public Builder(String accessruleIdentifier) {
      this.accessruleIdentifier = accessruleIdentifier;
    }

    /**
     * Builds a GetAccountAccessRuleOptions.
     *
     * @return the new GetAccountAccessRuleOptions instance
     */
    public GetAccountAccessRuleOptions build() {
      return new GetAccountAccessRuleOptions(this);
    }

    /**
     * Set the accessruleIdentifier.
     *
     * @param accessruleIdentifier the accessruleIdentifier
     * @return the GetAccountAccessRuleOptions builder
     */
    public Builder accessruleIdentifier(String accessruleIdentifier) {
      this.accessruleIdentifier = accessruleIdentifier;
      return this;
    }
  }

  protected GetAccountAccessRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.accessruleIdentifier,
      "accessruleIdentifier cannot be empty");
    accessruleIdentifier = builder.accessruleIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetAccountAccessRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessruleIdentifier.
   *
   * Identifier of firewall access rule for the given zone.
   *
   * @return the accessruleIdentifier
   */
  public String accessruleIdentifier() {
    return accessruleIdentifier;
  }
}

