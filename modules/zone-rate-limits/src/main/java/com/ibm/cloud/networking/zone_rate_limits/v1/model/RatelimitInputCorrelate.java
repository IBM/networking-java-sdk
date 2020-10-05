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
package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Enable NAT based rate limits.
 */
public class RatelimitInputCorrelate extends GenericModel {

  /**
   * NAT rate limits by.
   */
  public interface By {
    /** nat. */
    String NAT = "nat";
  }

  protected String by;

  /**
   * Builder.
   */
  public static class Builder {
    private String by;

    private Builder(RatelimitInputCorrelate ratelimitInputCorrelate) {
      this.by = ratelimitInputCorrelate.by;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param by the by
     */
    public Builder(String by) {
      this.by = by;
    }

    /**
     * Builds a RatelimitInputCorrelate.
     *
     * @return the new RatelimitInputCorrelate instance
     */
    public RatelimitInputCorrelate build() {
      return new RatelimitInputCorrelate(this);
    }

    /**
     * Set the by.
     *
     * @param by the by
     * @return the RatelimitInputCorrelate builder
     */
    public Builder by(String by) {
      this.by = by;
      return this;
    }
  }

  protected RatelimitInputCorrelate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.by,
      "by cannot be null");
    by = builder.by;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputCorrelate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the by.
   *
   * NAT rate limits by.
   *
   * @return the by
   */
  public String by() {
    return by;
  }
}

