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
package com.ibm.cloud.networking.page_rule_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * constraint.
 */
public class TargetsItemConstraint extends GenericModel {

  protected String operator;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String operator;
    private String value;

    private Builder(TargetsItemConstraint targetsItemConstraint) {
      this.operator = targetsItemConstraint.operator;
      this.value = targetsItemConstraint.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param operator the operator
     * @param value the value
     */
    public Builder(String operator, String value) {
      this.operator = operator;
      this.value = value;
    }

    /**
     * Builds a TargetsItemConstraint.
     *
     * @return the new TargetsItemConstraint instance
     */
    public TargetsItemConstraint build() {
      return new TargetsItemConstraint(this);
    }

    /**
     * Set the operator.
     *
     * @param operator the operator
     * @return the TargetsItemConstraint builder
     */
    public Builder operator(String operator) {
      this.operator = operator;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the TargetsItemConstraint builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected TargetsItemConstraint(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operator,
      "operator cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    operator = builder.operator;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a TargetsItemConstraint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operator.
   *
   * operator.
   *
   * @return the operator
   */
  public String operator() {
    return operator;
  }

  /**
   * Gets the value.
   *
   * value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

