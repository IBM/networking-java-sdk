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
package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateMaxUpload options.
 */
public class UpdateMaxUploadOptions extends GenericModel {

  protected Long value;

  /**
   * Builder.
   */
  public static class Builder {
    private Long value;

    private Builder(UpdateMaxUploadOptions updateMaxUploadOptions) {
      this.value = updateMaxUploadOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateMaxUploadOptions.
     *
     * @return the new UpdateMaxUploadOptions instance
     */
    public UpdateMaxUploadOptions build() {
      return new UpdateMaxUploadOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateMaxUploadOptions builder
     */
    public Builder value(long value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateMaxUploadOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateMaxUploadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Valid values(in MB) for "max_upload" are 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450,
   * 475, 500. Values 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 475, 500 are only for Enterprise Plan.
   *
   * @return the value
   */
  public Long value() {
    return value;
  }
}

