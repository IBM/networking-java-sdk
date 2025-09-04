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
 * The deleteZoneRulesetRule options.
 */
public class DeleteZoneRulesetRuleOptions extends GenericModel {

  protected String rulesetId;
  protected String ruleId;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetId;
    private String ruleId;

    /**
     * Instantiates a new Builder from an existing DeleteZoneRulesetRuleOptions instance.
     *
     * @param deleteZoneRulesetRuleOptions the instance to initialize the Builder with
     */
    private Builder(DeleteZoneRulesetRuleOptions deleteZoneRulesetRuleOptions) {
      this.rulesetId = deleteZoneRulesetRuleOptions.rulesetId;
      this.ruleId = deleteZoneRulesetRuleOptions.ruleId;
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
     * @param ruleId the ruleId
     */
    public Builder(String rulesetId, String ruleId) {
      this.rulesetId = rulesetId;
      this.ruleId = ruleId;
    }

    /**
     * Builds a DeleteZoneRulesetRuleOptions.
     *
     * @return the new DeleteZoneRulesetRuleOptions instance
     */
    public DeleteZoneRulesetRuleOptions build() {
      return new DeleteZoneRulesetRuleOptions(this);
    }

    /**
     * Set the rulesetId.
     *
     * @param rulesetId the rulesetId
     * @return the DeleteZoneRulesetRuleOptions builder
     */
    public Builder rulesetId(String rulesetId) {
      this.rulesetId = rulesetId;
      return this;
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the DeleteZoneRulesetRuleOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }
  }

  protected DeleteZoneRulesetRuleOptions() { }

  protected DeleteZoneRulesetRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetId,
      "rulesetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ruleId,
      "ruleId cannot be empty");
    rulesetId = builder.rulesetId;
    ruleId = builder.ruleId;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneRulesetRuleOptions builder
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
   * Gets the ruleId.
   *
   * ID of a specific rule.
   *
   * @return the ruleId
   */
  public String ruleId() {
    return ruleId;
  }
}

