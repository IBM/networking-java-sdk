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
 * The getWafRuleGroup options.
 */
public class GetWafRuleGroupOptions extends GenericModel {

  protected String pkgId;
  protected String groupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String pkgId;
    private String groupId;

    private Builder(GetWafRuleGroupOptions getWafRuleGroupOptions) {
      this.pkgId = getWafRuleGroupOptions.pkgId;
      this.groupId = getWafRuleGroupOptions.groupId;
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
     * Builds a GetWafRuleGroupOptions.
     *
     * @return the new GetWafRuleGroupOptions instance
     */
    public GetWafRuleGroupOptions build() {
      return new GetWafRuleGroupOptions(this);
    }

    /**
     * Set the pkgId.
     *
     * @param pkgId the pkgId
     * @return the GetWafRuleGroupOptions builder
     */
    public Builder pkgId(String pkgId) {
      this.pkgId = pkgId;
      return this;
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the GetWafRuleGroupOptions builder
     */
    public Builder groupId(String groupId) {
      this.groupId = groupId;
      return this;
    }
  }

  protected GetWafRuleGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pkgId,
      "pkgId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.groupId,
      "groupId cannot be empty");
    pkgId = builder.pkgId;
    groupId = builder.groupId;
  }

  /**
   * New builder.
   *
   * @return a GetWafRuleGroupOptions builder
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
}

