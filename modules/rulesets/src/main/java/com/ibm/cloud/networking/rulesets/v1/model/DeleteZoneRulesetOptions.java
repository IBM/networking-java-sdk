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
 * The deleteZoneRuleset options.
 */
public class DeleteZoneRulesetOptions extends GenericModel {

  protected String rulesetId;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetId;

    /**
     * Instantiates a new Builder from an existing DeleteZoneRulesetOptions instance.
     *
     * @param deleteZoneRulesetOptions the instance to initialize the Builder with
     */
    private Builder(DeleteZoneRulesetOptions deleteZoneRulesetOptions) {
      this.rulesetId = deleteZoneRulesetOptions.rulesetId;
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
     */
    public Builder(String rulesetId) {
      this.rulesetId = rulesetId;
    }

    /**
     * Builds a DeleteZoneRulesetOptions.
     *
     * @return the new DeleteZoneRulesetOptions instance
     */
    public DeleteZoneRulesetOptions build() {
      return new DeleteZoneRulesetOptions(this);
    }

    /**
     * Set the rulesetId.
     *
     * @param rulesetId the rulesetId
     * @return the DeleteZoneRulesetOptions builder
     */
    public Builder rulesetId(String rulesetId) {
      this.rulesetId = rulesetId;
      return this;
    }
  }

  protected DeleteZoneRulesetOptions() { }

  protected DeleteZoneRulesetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetId,
      "rulesetId cannot be empty");
    rulesetId = builder.rulesetId;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneRulesetOptions builder
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
}

