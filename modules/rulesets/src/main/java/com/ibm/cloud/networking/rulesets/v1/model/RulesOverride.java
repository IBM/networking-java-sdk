/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RulesOverride.
 */
public class RulesOverride extends GenericModel {

  /**
   * The sensitivity level of the rule.
   */
  public interface SensitivityLevel {
    /** high. */
    String HIGH = "high";
    /** medium. */
    String MEDIUM = "medium";
    /** low. */
    String LOW = "low";
  }

  protected String id;
  protected Boolean enabled;
  protected String action;
  @SerializedName("sensitivity_level")
  protected String sensitivityLevel;
  @SerializedName("score_threshold")
  protected Long scoreThreshold;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean enabled;
    private String action;
    private String sensitivityLevel;
    private Long scoreThreshold;

    /**
     * Instantiates a new Builder from an existing RulesOverride instance.
     *
     * @param rulesOverride the instance to initialize the Builder with
     */
    private Builder(RulesOverride rulesOverride) {
      this.id = rulesOverride.id;
      this.enabled = rulesOverride.enabled;
      this.action = rulesOverride.action;
      this.sensitivityLevel = rulesOverride.sensitivityLevel;
      this.scoreThreshold = rulesOverride.scoreThreshold;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RulesOverride.
     *
     * @return the new RulesOverride instance
     */
    public RulesOverride build() {
      return new RulesOverride(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RulesOverride builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the RulesOverride builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the RulesOverride builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the sensitivityLevel.
     *
     * @param sensitivityLevel the sensitivityLevel
     * @return the RulesOverride builder
     */
    public Builder sensitivityLevel(String sensitivityLevel) {
      this.sensitivityLevel = sensitivityLevel;
      return this;
    }

    /**
     * Set the scoreThreshold.
     *
     * @param scoreThreshold the scoreThreshold
     * @return the RulesOverride builder
     */
    public Builder scoreThreshold(long scoreThreshold) {
      this.scoreThreshold = scoreThreshold;
      return this;
    }
  }

  protected RulesOverride() { }

  protected RulesOverride(Builder builder) {
    id = builder.id;
    enabled = builder.enabled;
    action = builder.action;
    sensitivityLevel = builder.sensitivityLevel;
    scoreThreshold = builder.scoreThreshold;
  }

  /**
   * New builder.
   *
   * @return a RulesOverride builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the action.
   *
   * What happens when theres a match for the rule expression.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the sensitivityLevel.
   *
   * The sensitivity level of the rule.
   *
   * @return the sensitivityLevel
   */
  public String sensitivityLevel() {
    return sensitivityLevel;
  }

  /**
   * Gets the scoreThreshold.
   *
   * The score threshold of the rule.
   *
   * @return the scoreThreshold
   */
  public Long scoreThreshold() {
    return scoreThreshold;
  }
}

