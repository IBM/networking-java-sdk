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
 * The updateAccountAccessRule options.
 */
public class UpdateAccountAccessRuleOptions extends GenericModel {

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

  protected String accessruleIdentifier;
  protected String mode;
  protected String notes;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessruleIdentifier;
    private String mode;
    private String notes;

    private Builder(UpdateAccountAccessRuleOptions updateAccountAccessRuleOptions) {
      this.accessruleIdentifier = updateAccountAccessRuleOptions.accessruleIdentifier;
      this.mode = updateAccountAccessRuleOptions.mode;
      this.notes = updateAccountAccessRuleOptions.notes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accessruleIdentifier the accessruleIdentifier
     */
    public Builder(String accessruleIdentifier) {
      this.accessruleIdentifier = accessruleIdentifier;
    }

    /**
     * Builds a UpdateAccountAccessRuleOptions.
     *
     * @return the new UpdateAccountAccessRuleOptions instance
     */
    public UpdateAccountAccessRuleOptions build() {
      return new UpdateAccountAccessRuleOptions(this);
    }

    /**
     * Set the accessruleIdentifier.
     *
     * @param accessruleIdentifier the accessruleIdentifier
     * @return the UpdateAccountAccessRuleOptions builder
     */
    public Builder accessruleIdentifier(String accessruleIdentifier) {
      this.accessruleIdentifier = accessruleIdentifier;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the UpdateAccountAccessRuleOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the notes.
     *
     * @param notes the notes
     * @return the UpdateAccountAccessRuleOptions builder
     */
    public Builder notes(String notes) {
      this.notes = notes;
      return this;
    }
  }

  protected UpdateAccountAccessRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.accessruleIdentifier,
      "accessruleIdentifier cannot be empty");
    accessruleIdentifier = builder.accessruleIdentifier;
    mode = builder.mode;
    notes = builder.notes;
  }

  /**
   * New builder.
   *
   * @return a UpdateAccountAccessRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessruleIdentifier.
   *
   * Identifier of firewall access rule.
   *
   * @return the accessruleIdentifier
   */
  public String accessruleIdentifier() {
    return accessruleIdentifier;
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
}

