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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PolicyCnRuleCommonName.
 */
public class PolicyCnRuleCommonName extends GenericModel {

  @SerializedName("common_name")
  protected String commonName;

  /**
   * Builder.
   */
  public static class Builder {
    private String commonName;

    /**
     * Instantiates a new Builder from an existing PolicyCnRuleCommonName instance.
     *
     * @param policyCnRuleCommonName the instance to initialize the Builder with
     */
    private Builder(PolicyCnRuleCommonName policyCnRuleCommonName) {
      this.commonName = policyCnRuleCommonName.commonName;
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
    public Builder(String commonName) {
      this.commonName = commonName;
    }

    /**
     * Builds a PolicyCnRuleCommonName.
     *
     * @return the new PolicyCnRuleCommonName instance
     */
    public PolicyCnRuleCommonName build() {
      return new PolicyCnRuleCommonName(this);
    }

    /**
     * Set the commonName.
     *
     * @param commonName the commonName
     * @return the PolicyCnRuleCommonName builder
     */
    public Builder commonName(String commonName) {
      this.commonName = commonName;
      return this;
    }
  }

  protected PolicyCnRuleCommonName() { }

  protected PolicyCnRuleCommonName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.commonName,
      "commonName cannot be null");
    commonName = builder.commonName;
  }

  /**
   * New builder.
   *
   * @return a PolicyCnRuleCommonName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commonName.
   *
   * Common name of client certificate.
   *
   * @return the commonName
   */
  public String commonName() {
    return commonName;
  }
}

