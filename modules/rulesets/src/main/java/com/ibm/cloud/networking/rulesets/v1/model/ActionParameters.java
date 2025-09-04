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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ActionParameters.
 */
public class ActionParameters extends GenericModel {

  protected String id;
  protected Overrides overrides;
  protected String version;
  protected String ruleset;
  protected List<String> rulesets;
  protected List<String> phases;
  protected List<String> products;
  protected ActionParametersResponse response;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Overrides overrides;
    private String version;
    private String ruleset;
    private List<String> rulesets;
    private List<String> phases;
    private List<String> products;
    private ActionParametersResponse response;

    /**
     * Instantiates a new Builder from an existing ActionParameters instance.
     *
     * @param actionParameters the instance to initialize the Builder with
     */
    private Builder(ActionParameters actionParameters) {
      this.id = actionParameters.id;
      this.overrides = actionParameters.overrides;
      this.version = actionParameters.version;
      this.ruleset = actionParameters.ruleset;
      this.rulesets = actionParameters.rulesets;
      this.phases = actionParameters.phases;
      this.products = actionParameters.products;
      this.response = actionParameters.response;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionParameters.
     *
     * @return the new ActionParameters instance
     */
    public ActionParameters build() {
      return new ActionParameters(this);
    }

    /**
     * Adds a new element to rulesets.
     *
     * @param rulesets the new element to be added
     * @return the ActionParameters builder
     */
    public Builder addRulesets(String rulesets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rulesets,
        "rulesets cannot be null");
      if (this.rulesets == null) {
        this.rulesets = new ArrayList<String>();
      }
      this.rulesets.add(rulesets);
      return this;
    }

    /**
     * Adds a new element to phases.
     *
     * @param phases the new element to be added
     * @return the ActionParameters builder
     */
    public Builder addPhases(String phases) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(phases,
        "phases cannot be null");
      if (this.phases == null) {
        this.phases = new ArrayList<String>();
      }
      this.phases.add(phases);
      return this;
    }

    /**
     * Adds a new element to products.
     *
     * @param products the new element to be added
     * @return the ActionParameters builder
     */
    public Builder addProducts(String products) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(products,
        "products cannot be null");
      if (this.products == null) {
        this.products = new ArrayList<String>();
      }
      this.products.add(products);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ActionParameters builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the overrides.
     *
     * @param overrides the overrides
     * @return the ActionParameters builder
     */
    public Builder overrides(Overrides overrides) {
      this.overrides = overrides;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ActionParameters builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the ruleset.
     *
     * @param ruleset the ruleset
     * @return the ActionParameters builder
     */
    public Builder ruleset(String ruleset) {
      this.ruleset = ruleset;
      return this;
    }

    /**
     * Set the rulesets.
     * Existing rulesets will be replaced.
     *
     * @param rulesets the rulesets
     * @return the ActionParameters builder
     */
    public Builder rulesets(List<String> rulesets) {
      this.rulesets = rulesets;
      return this;
    }

    /**
     * Set the phases.
     * Existing phases will be replaced.
     *
     * @param phases the phases
     * @return the ActionParameters builder
     */
    public Builder phases(List<String> phases) {
      this.phases = phases;
      return this;
    }

    /**
     * Set the products.
     * Existing products will be replaced.
     *
     * @param products the products
     * @return the ActionParameters builder
     */
    public Builder products(List<String> products) {
      this.products = products;
      return this;
    }

    /**
     * Set the response.
     *
     * @param response the response
     * @return the ActionParameters builder
     */
    public Builder response(ActionParametersResponse response) {
      this.response = response;
      return this;
    }
  }

  protected ActionParameters() { }

  protected ActionParameters(Builder builder) {
    id = builder.id;
    overrides = builder.overrides;
    version = builder.version;
    ruleset = builder.ruleset;
    rulesets = builder.rulesets;
    phases = builder.phases;
    products = builder.products;
    response = builder.response;
  }

  /**
   * New builder.
   *
   * @return a ActionParameters builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * unique ID of the ruleset.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the overrides.
   *
   * @return the overrides
   */
  public Overrides overrides() {
    return overrides;
  }

  /**
   * Gets the version.
   *
   * The version of the ruleset. Use "latest" to get the latest version.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the ruleset.
   *
   * Ruleset ID of the ruleset to apply action to. Use "current" to apply to the current ruleset.
   *
   * @return the ruleset
   */
  public String ruleset() {
    return ruleset;
  }

  /**
   * Gets the rulesets.
   *
   * List of ruleset ids to apply action to. Use "current" to apply to the current ruleset.
   *
   * @return the rulesets
   */
  public List<String> rulesets() {
    return rulesets;
  }

  /**
   * Gets the phases.
   *
   * Skips the execution of one or more phases.
   *
   * @return the phases
   */
  public List<String> phases() {
    return phases;
  }

  /**
   * Gets the products.
   *
   * Skips specific security products that are not based on the Ruleset Engine.
   *
   * @return the products
   */
  public List<String> products() {
    return products;
  }

  /**
   * Gets the response.
   *
   * @return the response
   */
  public ActionParametersResponse response() {
    return response;
  }
}

