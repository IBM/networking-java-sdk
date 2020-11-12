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
package com.ibm.cloud.networking.page_rule_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deletePageRule options.
 */
public class DeletePageRuleOptions extends GenericModel {

  protected String ruleId;

  /**
   * Builder.
   */
  public static class Builder {
    private String ruleId;

    private Builder(DeletePageRuleOptions deletePageRuleOptions) {
      this.ruleId = deletePageRuleOptions.ruleId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ruleId the ruleId
     */
    public Builder(String ruleId) {
      this.ruleId = ruleId;
    }

    /**
     * Builds a DeletePageRuleOptions.
     *
     * @return the new DeletePageRuleOptions instance
     */
    public DeletePageRuleOptions build() {
      return new DeletePageRuleOptions(this);
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the DeletePageRuleOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }
  }

  protected DeletePageRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ruleId,
      "ruleId cannot be empty");
    ruleId = builder.ruleId;
  }

  /**
   * New builder.
   *
   * @return a DeletePageRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ruleId.
   *
   * rule id.
   *
   * @return the ruleId
   */
  public String ruleId() {
    return ruleId;
  }
}

