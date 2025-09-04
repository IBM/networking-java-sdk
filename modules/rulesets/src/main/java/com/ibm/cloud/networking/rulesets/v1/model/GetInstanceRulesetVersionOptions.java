/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getInstanceRulesetVersion options.
 */
public class GetInstanceRulesetVersionOptions extends GenericModel {

  protected String rulesetId;
  protected String rulesetVersion;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetId;
    private String rulesetVersion;

    /**
     * Instantiates a new Builder from an existing GetInstanceRulesetVersionOptions instance.
     *
     * @param getInstanceRulesetVersionOptions the instance to initialize the Builder with
     */
    private Builder(GetInstanceRulesetVersionOptions getInstanceRulesetVersionOptions) {
      this.rulesetId = getInstanceRulesetVersionOptions.rulesetId;
      this.rulesetVersion = getInstanceRulesetVersionOptions.rulesetVersion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rulesetId the rulesetId
     * @param rulesetVersion the rulesetVersion
     */
    public Builder(String rulesetId, String rulesetVersion) {
      this.rulesetId = rulesetId;
      this.rulesetVersion = rulesetVersion;
    }

    /**
     * Builds a GetInstanceRulesetVersionOptions.
     *
     * @return the new GetInstanceRulesetVersionOptions instance
     */
    public GetInstanceRulesetVersionOptions build() {
      return new GetInstanceRulesetVersionOptions(this);
    }

    /**
     * Set the rulesetId.
     *
     * @param rulesetId the rulesetId
     * @return the GetInstanceRulesetVersionOptions builder
     */
    public Builder rulesetId(String rulesetId) {
      this.rulesetId = rulesetId;
      return this;
    }

    /**
     * Set the rulesetVersion.
     *
     * @param rulesetVersion the rulesetVersion
     * @return the GetInstanceRulesetVersionOptions builder
     */
    public Builder rulesetVersion(String rulesetVersion) {
      this.rulesetVersion = rulesetVersion;
      return this;
    }
  }

  protected GetInstanceRulesetVersionOptions() { }

  protected GetInstanceRulesetVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetId,
      "rulesetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetVersion,
      "rulesetVersion cannot be empty");
    rulesetId = builder.rulesetId;
    rulesetVersion = builder.rulesetVersion;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceRulesetVersionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rulesetId.
   *
   * ID of a specific ruleset.
   *
   * @return the rulesetId
   */
  public String rulesetId() {
    return rulesetId;
  }

  /**
   * Gets the rulesetVersion.
   *
   * The version of the ruleset.
   *
   * @return the rulesetVersion
   */
  public String rulesetVersion() {
    return rulesetVersion;
  }
}

