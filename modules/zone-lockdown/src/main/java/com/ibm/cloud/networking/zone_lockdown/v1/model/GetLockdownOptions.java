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
package com.ibm.cloud.networking.zone_lockdown.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getLockdown options.
 */
public class GetLockdownOptions extends GenericModel {

  protected String lockdownRuleIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String lockdownRuleIdentifier;

    private Builder(GetLockdownOptions getLockdownOptions) {
      this.lockdownRuleIdentifier = getLockdownOptions.lockdownRuleIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param lockdownRuleIdentifier the lockdownRuleIdentifier
     */
    public Builder(String lockdownRuleIdentifier) {
      this.lockdownRuleIdentifier = lockdownRuleIdentifier;
    }

    /**
     * Builds a GetLockdownOptions.
     *
     * @return the new GetLockdownOptions instance
     */
    public GetLockdownOptions build() {
      return new GetLockdownOptions(this);
    }

    /**
     * Set the lockdownRuleIdentifier.
     *
     * @param lockdownRuleIdentifier the lockdownRuleIdentifier
     * @return the GetLockdownOptions builder
     */
    public Builder lockdownRuleIdentifier(String lockdownRuleIdentifier) {
      this.lockdownRuleIdentifier = lockdownRuleIdentifier;
      return this;
    }
  }

  protected GetLockdownOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lockdownRuleIdentifier,
      "lockdownRuleIdentifier cannot be empty");
    lockdownRuleIdentifier = builder.lockdownRuleIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetLockdownOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the lockdownRuleIdentifier.
   *
   * Identifier of lockdown rule for the given zone.
   *
   * @return the lockdownRuleIdentifier
   */
  public String lockdownRuleIdentifier() {
    return lockdownRuleIdentifier;
  }
}

