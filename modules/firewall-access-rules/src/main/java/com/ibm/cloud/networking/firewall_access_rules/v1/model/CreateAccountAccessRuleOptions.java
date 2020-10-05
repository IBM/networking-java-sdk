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
package com.ibm.cloud.networking.firewall_access_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAccountAccessRule options.
 */
public class CreateAccountAccessRuleOptions extends GenericModel {

  /**
   * The action to apply to a matched request.
   */
  public interface Mode {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** whitelist. */
    String WHITELIST = "whitelist";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  protected String mode;
  protected String notes;
  protected AccountAccessRuleInputConfiguration configuration;

  /**
   * Builder.
   */
  public static class Builder {
    private String mode;
    private String notes;
    private AccountAccessRuleInputConfiguration configuration;

    private Builder(CreateAccountAccessRuleOptions createAccountAccessRuleOptions) {
      this.mode = createAccountAccessRuleOptions.mode;
      this.notes = createAccountAccessRuleOptions.notes;
      this.configuration = createAccountAccessRuleOptions.configuration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAccountAccessRuleOptions.
     *
     * @return the new CreateAccountAccessRuleOptions instance
     */
    public CreateAccountAccessRuleOptions build() {
      return new CreateAccountAccessRuleOptions(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the CreateAccountAccessRuleOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the notes.
     *
     * @param notes the notes
     * @return the CreateAccountAccessRuleOptions builder
     */
    public Builder notes(String notes) {
      this.notes = notes;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the CreateAccountAccessRuleOptions builder
     */
    public Builder configuration(AccountAccessRuleInputConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }
  }

  protected CreateAccountAccessRuleOptions(Builder builder) {
    mode = builder.mode;
    notes = builder.notes;
    configuration = builder.configuration;
  }

  /**
   * New builder.
   *
   * @return a CreateAccountAccessRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * The action to apply to a matched request.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the notes.
   *
   * A personal note about the rule. Typically used as a reminder or explanation for the rule.
   *
   * @return the notes
   */
  public String notes() {
    return notes;
  }

  /**
   * Gets the configuration.
   *
   * Configuration object specifying access rule.
   *
   * @return the configuration
   */
  public AccountAccessRuleInputConfiguration configuration() {
    return configuration;
  }
}

