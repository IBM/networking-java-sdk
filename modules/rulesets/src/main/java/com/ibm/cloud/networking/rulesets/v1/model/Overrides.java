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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Overrides.
 */
public class Overrides extends GenericModel {

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

  protected String action;
  protected Boolean enabled;
  @SerializedName("sensitivity_level")
  protected String sensitivityLevel;
  protected List<RulesOverride> rules;
  protected List<CategoriesOverride> categories;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private Boolean enabled;
    private String sensitivityLevel;
    private List<RulesOverride> rules;
    private List<CategoriesOverride> categories;

    /**
     * Instantiates a new Builder from an existing Overrides instance.
     *
     * @param overrides the instance to initialize the Builder with
     */
    private Builder(Overrides overrides) {
      this.action = overrides.action;
      this.enabled = overrides.enabled;
      this.sensitivityLevel = overrides.sensitivityLevel;
      this.rules = overrides.rules;
      this.categories = overrides.categories;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Overrides.
     *
     * @return the new Overrides instance
     */
    public Overrides build() {
      return new Overrides(this);
    }

    /**
     * Adds a new element to rules.
     *
     * @param rules the new element to be added
     * @return the Overrides builder
     */
    public Builder addRules(RulesOverride rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<RulesOverride>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Adds a new element to categories.
     *
     * @param categories the new element to be added
     * @return the Overrides builder
     */
    public Builder addCategories(CategoriesOverride categories) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(categories,
        "categories cannot be null");
      if (this.categories == null) {
        this.categories = new ArrayList<CategoriesOverride>();
      }
      this.categories.add(categories);
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the Overrides builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the Overrides builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the sensitivityLevel.
     *
     * @param sensitivityLevel the sensitivityLevel
     * @return the Overrides builder
     */
    public Builder sensitivityLevel(String sensitivityLevel) {
      this.sensitivityLevel = sensitivityLevel;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the Overrides builder
     */
    public Builder rules(List<RulesOverride> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the categories.
     * Existing categories will be replaced.
     *
     * @param categories the categories
     * @return the Overrides builder
     */
    public Builder categories(List<CategoriesOverride> categories) {
      this.categories = categories;
      return this;
    }
  }

  protected Overrides() { }

  protected Overrides(Builder builder) {
    action = builder.action;
    enabled = builder.enabled;
    sensitivityLevel = builder.sensitivityLevel;
    rules = builder.rules;
    categories = builder.categories;
  }

  /**
   * New builder.
   *
   * @return a Overrides builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
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
   * Gets the rules.
   *
   * @return the rules
   */
  public List<RulesOverride> rules() {
    return rules;
  }

  /**
   * Gets the categories.
   *
   * @return the categories
   */
  public List<CategoriesOverride> categories() {
    return categories;
  }
}

