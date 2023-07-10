/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.mtls.v1.model;

/**
 * Policy rule of common name.
 */
public class PolicyRulePolicyCnRule extends PolicyRule {


  /**
   * Builder.
   */
  public static class Builder {
    private PolicyCnRuleCommonName commonName;

    /**
     * Instantiates a new Builder from an existing PolicyRulePolicyCnRule instance.
     *
     * @param policyRulePolicyCnRule the instance to initialize the Builder with
     */
    public Builder(PolicyRule policyRulePolicyCnRule) {
      this.commonName = policyRulePolicyCnRule.commonName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param commonName the commonName
     */
    public Builder(PolicyCnRuleCommonName commonName) {
      this.commonName = commonName;
    }

    /**
     * Builds a PolicyRulePolicyCnRule.
     *
     * @return the new PolicyRulePolicyCnRule instance
     */
    public PolicyRulePolicyCnRule build() {
      return new PolicyRulePolicyCnRule(this);
    }

    /**
     * Set the commonName.
     *
     * @param commonName the commonName
     * @return the PolicyRulePolicyCnRule builder
     */
    public Builder commonName(PolicyCnRuleCommonName commonName) {
      this.commonName = commonName;
      return this;
    }
  }

  protected PolicyRulePolicyCnRule() { }

  protected PolicyRulePolicyCnRule(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
      "commonName cannot be null");
    commonName = builder.commonName;
  }

  /**
   * New builder.
   *
   * @return a PolicyRulePolicyCnRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

