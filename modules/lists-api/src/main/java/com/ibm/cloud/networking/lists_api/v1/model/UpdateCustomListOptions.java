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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateCustomList options.
 */
public class UpdateCustomListOptions extends GenericModel {

  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;

    /**
     * Instantiates a new Builder from an existing UpdateCustomListOptions instance.
     *
     * @param updateCustomListOptions the instance to initialize the Builder with
     */
    private Builder(UpdateCustomListOptions updateCustomListOptions) {
      this.description = updateCustomListOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateCustomListOptions.
     *
     * @return the new UpdateCustomListOptions instance
     */
    public UpdateCustomListOptions build() {
      return new UpdateCustomListOptions(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateCustomListOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected UpdateCustomListOptions() { }

  protected UpdateCustomListOptions(Builder builder) {
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a UpdateCustomListOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * An informative summary of the list.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

