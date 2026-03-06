/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateProxyReadTimeout options.
 */
public class UpdateProxyReadTimeoutOptions extends GenericModel {

  protected Double value;

  /**
   * Builder.
   */
  public static class Builder {
    private Double value;

    /**
     * Instantiates a new Builder from an existing UpdateProxyReadTimeoutOptions instance.
     *
     * @param updateProxyReadTimeoutOptions the instance to initialize the Builder with
     */
    private Builder(UpdateProxyReadTimeoutOptions updateProxyReadTimeoutOptions) {
      this.value = updateProxyReadTimeoutOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateProxyReadTimeoutOptions.
     *
     * @return the new UpdateProxyReadTimeoutOptions instance
     */
    public UpdateProxyReadTimeoutOptions build() {
      return new UpdateProxyReadTimeoutOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateProxyReadTimeoutOptions builder
     */
    public Builder value(Double value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateProxyReadTimeoutOptions() { }

  protected UpdateProxyReadTimeoutOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateProxyReadTimeoutOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Value.
   *
   * @return the value
   */
  public Double value() {
    return value;
  }
}

