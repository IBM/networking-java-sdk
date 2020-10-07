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
 * The getUserAgentRule options.
 */
public class GetUserAgentRuleOptions extends GenericModel {

  protected String useragentRuleIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String useragentRuleIdentifier;

    private Builder(GetUserAgentRuleOptions getUserAgentRuleOptions) {
      this.useragentRuleIdentifier = getUserAgentRuleOptions.useragentRuleIdentifier;
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
     * Builds a GetUserAgentRuleOptions.
     *
     * @return the new GetUserAgentRuleOptions instance
     */
    public GetUserAgentRuleOptions build() {
      return new GetUserAgentRuleOptions(this);
    }

    /**
     * Set the useragentRuleIdentifier.
     *
     * @param useragentRuleIdentifier the useragentRuleIdentifier
     * @return the GetUserAgentRuleOptions builder
     */
    public Builder useragentRuleIdentifier(String useragentRuleIdentifier) {
      this.useragentRuleIdentifier = useragentRuleIdentifier;
      return this;
    }
  }

  protected GetUserAgentRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.useragentRuleIdentifier,
      "useragentRuleIdentifier cannot be empty");
    useragentRuleIdentifier = builder.useragentRuleIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetUserAgentRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the useragentRuleIdentifier.
   *
   * Identifier of user-agent blocking rule for the given zone.
   *
   * @return the useragentRuleIdentifier
   */
  public String useragentRuleIdentifier() {
    return useragentRuleIdentifier;
  }
}

