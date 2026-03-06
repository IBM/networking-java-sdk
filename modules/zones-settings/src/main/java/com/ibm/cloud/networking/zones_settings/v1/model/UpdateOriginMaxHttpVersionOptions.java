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
 * The updateOriginMaxHttpVersion options.
 */
public class UpdateOriginMaxHttpVersionOptions extends GenericModel {

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    /**
     * Instantiates a new Builder from an existing UpdateOriginMaxHttpVersionOptions instance.
     *
     * @param updateOriginMaxHttpVersionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateOriginMaxHttpVersionOptions updateOriginMaxHttpVersionOptions) {
      this.value = updateOriginMaxHttpVersionOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateOriginMaxHttpVersionOptions.
     *
     * @return the new UpdateOriginMaxHttpVersionOptions instance
     */
    public UpdateOriginMaxHttpVersionOptions build() {
      return new UpdateOriginMaxHttpVersionOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateOriginMaxHttpVersionOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateOriginMaxHttpVersionOptions() { }

  protected UpdateOriginMaxHttpVersionOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateOriginMaxHttpVersionOptions builder
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
  public String value() {
    return value;
  }
}

