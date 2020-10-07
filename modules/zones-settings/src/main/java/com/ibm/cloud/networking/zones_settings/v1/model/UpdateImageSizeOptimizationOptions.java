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
 * The updateImageSizeOptimization options.
 */
public class UpdateImageSizeOptimizationOptions extends GenericModel {

  /**
   * Valid values are "lossy", "off", "lossless". "lossy" - The file size of JPEG images is reduced using lossy
   * compression, which may reduce visual quality. "off" - Disable Image Size Optimization. "lossless" - Reduce the size
   * of image files without impacting visual quality.
   */
  public interface Value {
    /** off. */
    String OFF = "off";
    /** lossless. */
    String LOSSLESS = "lossless";
    /** lossy. */
    String LOSSY = "lossy";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(UpdateImageSizeOptimizationOptions updateImageSizeOptimizationOptions) {
      this.value = updateImageSizeOptimizationOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateImageSizeOptimizationOptions.
     *
     * @return the new UpdateImageSizeOptimizationOptions instance
     */
    public UpdateImageSizeOptimizationOptions build() {
      return new UpdateImageSizeOptimizationOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateImageSizeOptimizationOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateImageSizeOptimizationOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateImageSizeOptimizationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Valid values are "lossy", "off", "lossless". "lossy" - The file size of JPEG images is reduced using lossy
   * compression, which may reduce visual quality. "off" - Disable Image Size Optimization. "lossless" - Reduce the size
   * of image files without impacting visual quality.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

