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
 * owasp package.
 */
public class WafRuleBodyOwasp extends GenericModel {

  /**
   * mode to choose from. 'owasp' limited modes - on and off.
   */
  public interface Mode {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String mode;

    private Builder(WafRuleBodyOwasp wafRuleBodyOwasp) {
      this.mode = wafRuleBodyOwasp.mode;
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
     * Builds a WafRuleBodyOwasp.
     *
     * @return the new WafRuleBodyOwasp instance
     */
    public WafRuleBodyOwasp build() {
      return new WafRuleBodyOwasp(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the WafRuleBodyOwasp builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected WafRuleBodyOwasp(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mode,
      "mode cannot be null");
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a WafRuleBodyOwasp builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * mode to choose from. 'owasp' limited modes - on and off.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

