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
package com.ibm.cloud.networking.caching_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateCacheLevel options.
 */
public class UpdateCacheLevelOptions extends GenericModel {

  /**
   * cache level.
   */
  public interface Value {
    /** basic. */
    String BASIC = "basic";
    /** simplified. */
    String SIMPLIFIED = "simplified";
    /** aggressive. */
    String AGGRESSIVE = "aggressive";
  }

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    private Builder(UpdateCacheLevelOptions updateCacheLevelOptions) {
      this.value = updateCacheLevelOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateCacheLevelOptions.
     *
     * @return the new UpdateCacheLevelOptions instance
     */
    public UpdateCacheLevelOptions build() {
      return new UpdateCacheLevelOptions(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateCacheLevelOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateCacheLevelOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateCacheLevelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * cache level.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

