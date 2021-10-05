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
 * FilterUpdateInput.
 */
public class FilterUpdateInput extends GenericModel {

  protected String id;
  protected String expression;
  protected String description;
  protected Boolean paused;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String expression;
    private String description;
    private Boolean paused;

    private Builder(FilterUpdateInput filterUpdateInput) {
      this.id = filterUpdateInput.id;
      this.expression = filterUpdateInput.expression;
      this.description = filterUpdateInput.description;
      this.paused = filterUpdateInput.paused;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param expression the expression
     */
    public Builder(String id, String expression) {
      this.id = id;
      this.expression = expression;
    }

    /**
     * Builds a FilterUpdateInput.
     *
     * @return the new FilterUpdateInput instance
     */
    public FilterUpdateInput build() {
      return new FilterUpdateInput(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the FilterUpdateInput builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the expression.
     *
     * @param expression the expression
     * @return the FilterUpdateInput builder
     */
    public Builder expression(String expression) {
      this.expression = expression;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the FilterUpdateInput builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the FilterUpdateInput builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }
  }

  protected FilterUpdateInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expression,
      "expression cannot be null");
    id = builder.id;
    expression = builder.expression;
    description = builder.description;
    paused = builder.paused;
  }

  /**
   * New builder.
   *
   * @return a FilterUpdateInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Identifier of the filter.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the description.
   *
   * To briefly describe the filter.
   *
   * @return the description
   */
  public String description() {
    return description;
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
}

