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
 * Target/Value pair to use for this rule. The value is the exact UserAgent to match.
 */
public class UseragentRuleInputConfiguration extends GenericModel {

  /**
   * properties.
   */
  public interface Target {
    /** ua. */
    String UA = "ua";
  }

  protected String target;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private String value;

    private Builder(UseragentRuleInputConfiguration useragentRuleInputConfiguration) {
      this.target = useragentRuleInputConfiguration.target;
      this.value = useragentRuleInputConfiguration.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     * @param value the value
     */
    public Builder(String target, String value) {
      this.target = target;
      this.value = value;
    }

    /**
     * Builds a UseragentRuleInputConfiguration.
     *
     * @return the new UseragentRuleInputConfiguration instance
     */
    public UseragentRuleInputConfiguration build() {
      return new UseragentRuleInputConfiguration(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the UseragentRuleInputConfiguration builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UseragentRuleInputConfiguration builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UseragentRuleInputConfiguration(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    target = builder.target;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UseragentRuleInputConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * properties.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the value.
   *
   * The exact UserAgent string to match with this rule.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

