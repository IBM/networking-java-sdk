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
 * Logging.
 */
public class Logging extends GenericModel {

  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;

    /**
     * Instantiates a new Builder from an existing Logging instance.
     *
     * @param logging the instance to initialize the Builder with
     */
    private Builder(Logging logging) {
      this.enabled = logging.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param enabled the enabled
     */
    public Builder(Boolean enabled) {
      this.enabled = enabled;
    }

    /**
     * Builds a Logging.
     *
     * @return the new Logging instance
     */
    public Logging build() {
      return new Logging(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the Logging builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected Logging() { }

  protected Logging(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enabled,
      "enabled cannot be null");
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a Logging builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

