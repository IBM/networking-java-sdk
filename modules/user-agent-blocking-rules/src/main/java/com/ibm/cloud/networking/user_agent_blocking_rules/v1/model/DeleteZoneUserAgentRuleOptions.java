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
package com.ibm.cloud.networking.user_agent_blocking_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteZoneUserAgentRule options.
 */
public class DeleteZoneUserAgentRuleOptions extends GenericModel {

  protected String useragentRuleIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String useragentRuleIdentifier;

    private Builder(DeleteZoneUserAgentRuleOptions deleteZoneUserAgentRuleOptions) {
      this.useragentRuleIdentifier = deleteZoneUserAgentRuleOptions.useragentRuleIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param useragentRuleIdentifier the useragentRuleIdentifier
     */
    public Builder(String useragentRuleIdentifier) {
      this.useragentRuleIdentifier = useragentRuleIdentifier;
    }

    /**
     * Builds a DeleteZoneUserAgentRuleOptions.
     *
     * @return the new DeleteZoneUserAgentRuleOptions instance
     */
    public DeleteZoneUserAgentRuleOptions build() {
      return new DeleteZoneUserAgentRuleOptions(this);
    }

    /**
     * Set the useragentRuleIdentifier.
     *
     * @param useragentRuleIdentifier the useragentRuleIdentifier
     * @return the DeleteZoneUserAgentRuleOptions builder
     */
    public Builder useragentRuleIdentifier(String useragentRuleIdentifier) {
      this.useragentRuleIdentifier = useragentRuleIdentifier;
      return this;
    }
  }

  protected DeleteZoneUserAgentRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.useragentRuleIdentifier,
      "useragentRuleIdentifier cannot be empty");
    useragentRuleIdentifier = builder.useragentRuleIdentifier;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneUserAgentRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the useragentRuleIdentifier.
   *
   * Identifier of the user-agent rule to be deleted.
   *
   * @return the useragentRuleIdentifier
   */
  public String useragentRuleIdentifier() {
    return useragentRuleIdentifier;
  }
}

