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
 * The updateUserAgentRule options.
 */
public class UpdateUserAgentRuleOptions extends GenericModel {

  /**
   * The type of action to perform.
   */
  public interface Mode {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  protected String useragentRuleIdentifier;
  protected Boolean paused;
  protected String description;
  protected String mode;
  protected UseragentRuleInputConfiguration configuration;

  /**
   * Builder.
   */
  public static class Builder {
    private String useragentRuleIdentifier;
    private Boolean paused;
    private String description;
    private String mode;
    private UseragentRuleInputConfiguration configuration;

    private Builder(UpdateUserAgentRuleOptions updateUserAgentRuleOptions) {
      this.useragentRuleIdentifier = updateUserAgentRuleOptions.useragentRuleIdentifier;
      this.paused = updateUserAgentRuleOptions.paused;
      this.description = updateUserAgentRuleOptions.description;
      this.mode = updateUserAgentRuleOptions.mode;
      this.configuration = updateUserAgentRuleOptions.configuration;
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
     * Builds a UpdateUserAgentRuleOptions.
     *
     * @return the new UpdateUserAgentRuleOptions instance
     */
    public UpdateUserAgentRuleOptions build() {
      return new UpdateUserAgentRuleOptions(this);
    }

    /**
     * Set the useragentRuleIdentifier.
     *
     * @param useragentRuleIdentifier the useragentRuleIdentifier
     * @return the UpdateUserAgentRuleOptions builder
     */
    public Builder useragentRuleIdentifier(String useragentRuleIdentifier) {
      this.useragentRuleIdentifier = useragentRuleIdentifier;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the UpdateUserAgentRuleOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateUserAgentRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the UpdateUserAgentRuleOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the UpdateUserAgentRuleOptions builder
     */
    public Builder configuration(UseragentRuleInputConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }
  }

  protected UpdateUserAgentRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.useragentRuleIdentifier,
      "useragentRuleIdentifier cannot be empty");
    useragentRuleIdentifier = builder.useragentRuleIdentifier;
    paused = builder.paused;
    description = builder.description;
    mode = builder.mode;
    configuration = builder.configuration;
  }

  /**
   * New builder.
   *
   * @return a UpdateUserAgentRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the useragentRuleIdentifier.
   *
   * Identifier of user-agent rule.
   *
   * @return the useragentRuleIdentifier
   */
  public String useragentRuleIdentifier() {
    return useragentRuleIdentifier;
  }

  /**
   * Gets the paused.
   *
   * Whether this user-agent rule is currently disabled.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * Some useful information about this rule to help identify the purpose of it.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the mode.
   *
   * The type of action to perform.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the configuration.
   *
   * Target/Value pair to use for this rule. The value is the exact UserAgent to match.
   *
   * @return the configuration
   */
  public UseragentRuleInputConfiguration configuration() {
    return configuration;
  }
}

