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

import java.util.Map;

/**
 * Policy rule of certificate.
 */
public class PolicyRulePolicyCertRule extends PolicyRule {


  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> certificate;

    /**
     * Instantiates a new Builder from an existing PolicyRulePolicyCertRule instance.
     *
     * @param policyRulePolicyCertRule the instance to initialize the Builder with
     */
    public Builder(PolicyRule policyRulePolicyCertRule) {
      this.certificate = policyRulePolicyCertRule.certificate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PolicyRulePolicyCertRule.
     *
     * @return the new PolicyRulePolicyCertRule instance
     */
    public PolicyRulePolicyCertRule build() {
      return new PolicyRulePolicyCertRule(this);
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the PolicyRulePolicyCertRule builder
     */
    public Builder certificate(Map<String, Object> certificate) {
      this.certificate = certificate;
      return this;
    }
  }

  protected PolicyRulePolicyCertRule() { }

  protected PolicyRulePolicyCertRule(Builder builder) {
    certificate = builder.certificate;
  }

  /**
   * New builder.
   *
   * @return a PolicyRulePolicyCertRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

