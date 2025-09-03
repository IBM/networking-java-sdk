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
 * The getInstanceRulesetVersionByTag options.
 */
public class GetInstanceRulesetVersionByTagOptions extends GenericModel {

  protected String rulesetId;
  protected String rulesetVersion;
  protected String ruleTag;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetId;
    private String rulesetVersion;
    private String ruleTag;

    /**
     * Instantiates a new Builder from an existing GetInstanceRulesetVersionByTagOptions instance.
     *
     * @param getInstanceRulesetVersionByTagOptions the instance to initialize the Builder with
     */
    private Builder(GetInstanceRulesetVersionByTagOptions getInstanceRulesetVersionByTagOptions) {
      this.rulesetId = getInstanceRulesetVersionByTagOptions.rulesetId;
      this.rulesetVersion = getInstanceRulesetVersionByTagOptions.rulesetVersion;
      this.ruleTag = getInstanceRulesetVersionByTagOptions.ruleTag;
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
     * @param ruleTag the ruleTag
     */
    public Builder(String rulesetId, String rulesetVersion, String ruleTag) {
      this.rulesetId = rulesetId;
      this.rulesetVersion = rulesetVersion;
      this.ruleTag = ruleTag;
    }

    /**
     * Builds a GetInstanceRulesetVersionByTagOptions.
     *
     * @return the new GetInstanceRulesetVersionByTagOptions instance
     */
    public GetInstanceRulesetVersionByTagOptions build() {
      return new GetInstanceRulesetVersionByTagOptions(this);
    }

    /**
     * Set the rulesetId.
     *
     * @param rulesetId the rulesetId
     * @return the GetInstanceRulesetVersionByTagOptions builder
     */
    public Builder rulesetId(String rulesetId) {
      this.rulesetId = rulesetId;
      return this;
    }

    /**
     * Set the rulesetVersion.
     *
     * @param rulesetVersion the rulesetVersion
     * @return the GetInstanceRulesetVersionByTagOptions builder
     */
    public Builder rulesetVersion(String rulesetVersion) {
      this.rulesetVersion = rulesetVersion;
      return this;
    }

    /**
     * Set the ruleTag.
     *
     * @param ruleTag the ruleTag
     * @return the GetInstanceRulesetVersionByTagOptions builder
     */
    public Builder ruleTag(String ruleTag) {
      this.ruleTag = ruleTag;
      return this;
    }
  }

  protected GetInstanceRulesetVersionByTagOptions() { }

  protected GetInstanceRulesetVersionByTagOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetId,
      "rulesetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetVersion,
      "rulesetVersion cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ruleTag,
      "ruleTag cannot be empty");
    rulesetId = builder.rulesetId;
    rulesetVersion = builder.rulesetVersion;
    ruleTag = builder.ruleTag;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceRulesetVersionByTagOptions builder
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

  /**
   * Gets the ruleTag.
   *
   * A category of the rule.
   *
   * @return the ruleTag
   */
  public String ruleTag() {
    return ruleTag;
  }
}

