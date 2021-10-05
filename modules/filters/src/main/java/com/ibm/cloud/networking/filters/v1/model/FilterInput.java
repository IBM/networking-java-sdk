/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.filters.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Json objects which are used to create filters.
 */
public class FilterInput extends GenericModel {

  protected String expression;
  protected Boolean paused;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String expression;
    private Boolean paused;
    private String description;

    private Builder(FilterInput filterInput) {
      this.expression = filterInput.expression;
      this.paused = filterInput.paused;
      this.description = filterInput.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param expression the expression
     */
    public Builder(String expression) {
      this.expression = expression;
    }

    /**
     * Builds a FilterInput.
     *
     * @return the new FilterInput instance
     */
    public FilterInput build() {
      return new FilterInput(this);
    }

    /**
     * Set the expression.
     *
     * @param expression the expression
     * @return the FilterInput builder
     */
    public Builder expression(String expression) {
      this.expression = expression;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the FilterInput builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the FilterInput builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected FilterInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expression,
      "expression cannot be null");
    expression = builder.expression;
    paused = builder.paused;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a FilterInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the expression.
   *
   * A filter expression.
   *
   * @return the expression
   */
  public String expression() {
    return expression;
  }

  /**
   * Gets the paused.
   *
   * Indicates if the filter is active.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * To briefly describe the filter, omitted from object if empty.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

