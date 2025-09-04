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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CategoriesOverride.
 */
public class CategoriesOverride extends GenericModel {

  protected String category;
  protected Boolean enabled;
  protected String action;

  /**
   * Builder.
   */
  public static class Builder {
    private String category;
    private Boolean enabled;
    private String action;

    /**
     * Instantiates a new Builder from an existing CategoriesOverride instance.
     *
     * @param categoriesOverride the instance to initialize the Builder with
     */
    private Builder(CategoriesOverride categoriesOverride) {
      this.category = categoriesOverride.category;
      this.enabled = categoriesOverride.enabled;
      this.action = categoriesOverride.action;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CategoriesOverride.
     *
     * @return the new CategoriesOverride instance
     */
    public CategoriesOverride build() {
      return new CategoriesOverride(this);
    }

    /**
     * Set the category.
     *
     * @param category the category
     * @return the CategoriesOverride builder
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CategoriesOverride builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CategoriesOverride builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }
  }

  protected CategoriesOverride() { }

  protected CategoriesOverride(Builder builder) {
    category = builder.category;
    enabled = builder.enabled;
    action = builder.action;
  }

  /**
   * New builder.
   *
   * @return a CategoriesOverride builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the category.
   *
   * The category tag name to override.
   *
   * @return the category
   */
  public String category() {
    return category;
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
}

