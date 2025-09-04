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
 * Position.
 */
public class Position extends GenericModel {

  protected String before;
  protected String after;
  protected Long index;

  /**
   * Builder.
   */
  public static class Builder {
    private String before;
    private String after;
    private Long index;

    /**
     * Instantiates a new Builder from an existing Position instance.
     *
     * @param position the instance to initialize the Builder with
     */
    private Builder(Position position) {
      this.before = position.before;
      this.after = position.after;
      this.index = position.index;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Position.
     *
     * @return the new Position instance
     */
    public Position build() {
      return new Position(this);
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the Position builder
     */
    public Builder before(String before) {
      this.before = before;
      return this;
    }

    /**
     * Set the after.
     *
     * @param after the after
     * @return the Position builder
     */
    public Builder after(String after) {
      this.after = after;
      return this;
    }

    /**
     * Set the index.
     *
     * @param index the index
     * @return the Position builder
     */
    public Builder index(long index) {
      this.index = index;
      return this;
    }
  }

  protected Position() { }

  protected Position(Builder builder) {
    before = builder.before;
    after = builder.after;
    index = builder.index;
  }

  /**
   * New builder.
   *
   * @return a Position builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the before.
   *
   * The rule ID to place this rule before.
   *
   * @return the before
   */
  public String before() {
    return before;
  }

  /**
   * Gets the after.
   *
   * The rule ID to place this rule after.
   *
   * @return the after
   */
  public String after() {
    return after;
  }

  /**
   * Gets the index.
   *
   * The index to place this rule at.
   *
   * @return the index
   */
  public Long index() {
    return index;
  }
}

