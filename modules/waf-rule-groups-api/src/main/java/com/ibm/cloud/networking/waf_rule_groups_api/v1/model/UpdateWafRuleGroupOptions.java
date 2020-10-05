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
package com.ibm.cloud.networking.waf_rule_groups_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateWafRuleGroup options.
 */
public class UpdateWafRuleGroupOptions extends GenericModel {

  /**
   * Whether or not the rules contained within this group are configurable/usable.
   */
  public interface Mode {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String pkgId;
  protected String groupId;
  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String pkgId;
    private String groupId;
    private String mode;

    private Builder(UpdateWafRuleGroupOptions updateWafRuleGroupOptions) {
      this.pkgId = updateWafRuleGroupOptions.pkgId;
      this.groupId = updateWafRuleGroupOptions.groupId;
      this.mode = updateWafRuleGroupOptions.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pkgId the pkgId
     * @param groupId the groupId
     */
    public Builder(String pkgId, String groupId) {
      this.pkgId = pkgId;
      this.groupId = groupId;
    }

    /**
     * Builds a UpdateWafRuleGroupOptions.
     *
     * @return the new UpdateWafRuleGroupOptions instance
     */
    public UpdateWafRuleGroupOptions build() {
      return new UpdateWafRuleGroupOptions(this);
    }

    /**
     * Set the pkgId.
     *
     * @param pkgId the pkgId
     * @return the UpdateWafRuleGroupOptions builder
     */
    public Builder pkgId(String pkgId) {
      this.pkgId = pkgId;
      return this;
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the UpdateWafRuleGroupOptions builder
     */
    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the UpdateWafRuleGroupOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected UpdateWafRuleGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pkgId,
      "pkgId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.groupId,
      "groupId cannot be empty");
    pkgId = builder.pkgId;
    groupId = builder.groupId;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a UpdateWafRuleGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pkgId.
   *
   * Package ID.
   *
   * @return the pkgId
   */
  public String pkgId() {
    return pkgId;
  }

  /**
   * Gets the groupId.
   *
   * Group ID.
   *
   * @return the groupId
   */
  public String groupId() {
    return groupId;
  }

  /**
   * Gets the mode.
   *
   * Whether or not the rules contained within this group are configurable/usable.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

