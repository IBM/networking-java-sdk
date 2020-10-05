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
package com.ibm.cloud.networking.waf_rules_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * cis package.
 */
public class WafRuleBodyCis extends GenericModel {

  /**
   * mode to choose from.
   */
  public interface Mode {
    /** default. */
    String X_DEFAULT = "default";
    /** disable. */
    String DISABLE = "disable";
    /** simulate. */
    String SIMULATE = "simulate";
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
  }

  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String mode;

    private Builder(WafRuleBodyCis wafRuleBodyCis) {
      this.mode = wafRuleBodyCis.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mode the mode
     */
    public Builder(String mode) {
      this.mode = mode;
    }

    /**
     * Builds a WafRuleBodyCis.
     *
     * @return the new WafRuleBodyCis instance
     */
    public WafRuleBodyCis build() {
      return new WafRuleBodyCis(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the WafRuleBodyCis builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected WafRuleBodyCis(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mode,
      "mode cannot be null");
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a WafRuleBodyCis builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * mode to choose from.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

