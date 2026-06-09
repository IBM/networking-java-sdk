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

package com.ibm.cloud.networking.logpush_jobs_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLogRetention options.
 */
public class CreateLogRetentionOptions extends GenericModel {

  protected Boolean flag;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean flag;

    /**
     * Instantiates a new Builder from an existing CreateLogRetentionOptions instance.
     *
     * @param createLogRetentionOptions the instance to initialize the Builder with
     */
    private Builder(CreateLogRetentionOptions createLogRetentionOptions) {
      this.flag = createLogRetentionOptions.flag;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateLogRetentionOptions.
     *
     * @return the new CreateLogRetentionOptions instance
     */
    public CreateLogRetentionOptions build() {
      return new CreateLogRetentionOptions(this);
    }

    /**
     * Set the flag.
     *
     * @param flag the flag
     * @return the CreateLogRetentionOptions builder
     */
    public Builder flag(Boolean flag) {
      this.flag = flag;
      return this;
    }
  }

  protected CreateLogRetentionOptions() { }

  protected CreateLogRetentionOptions(Builder builder) {
    flag = builder.flag;
  }

  /**
   * New builder.
   *
   * @return a CreateLogRetentionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flag.
   *
   * @return the flag
   */
  public Boolean flag() {
    return flag;
  }
}

