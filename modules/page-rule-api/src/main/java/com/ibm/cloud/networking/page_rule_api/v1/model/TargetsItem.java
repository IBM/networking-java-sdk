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
 * items.
 */
public class TargetsItem extends GenericModel {

  protected String target;
  protected TargetsItemConstraint constraint;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private TargetsItemConstraint constraint;

    private Builder(TargetsItem targetsItem) {
      this.target = targetsItem.target;
      this.constraint = targetsItem.constraint;
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
     * @param constraint the constraint
     */
    public Builder(String target, TargetsItemConstraint constraint) {
      this.target = target;
      this.constraint = constraint;
    }

    /**
     * Builds a TargetsItem.
     *
     * @return the new TargetsItem instance
     */
    public TargetsItem build() {
      return new TargetsItem(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the TargetsItem builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the constraint.
     *
     * @param constraint the constraint
     * @return the TargetsItem builder
     */
    public Builder constraint(TargetsItemConstraint constraint) {
      this.constraint = constraint;
      return this;
    }
  }

  protected TargetsItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.constraint,
      "constraint cannot be null");
    target = builder.target;
    constraint = builder.constraint;
  }

  /**
   * New builder.
   *
   * @return a TargetsItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * target.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the constraint.
   *
   * constraint.
   *
   * @return the constraint
   */
  public TargetsItemConstraint constraint() {
    return constraint;
  }
}

