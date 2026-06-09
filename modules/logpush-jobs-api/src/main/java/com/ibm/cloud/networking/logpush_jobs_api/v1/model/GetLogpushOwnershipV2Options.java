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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getLogpushOwnershipV2 options.
 */
public class GetLogpushOwnershipV2Options extends GenericModel {

  protected Map<String, Object> cos;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> cos;

    /**
     * Instantiates a new Builder from an existing GetLogpushOwnershipV2Options instance.
     *
     * @param getLogpushOwnershipV2Options the instance to initialize the Builder with
     */
    private Builder(GetLogpushOwnershipV2Options getLogpushOwnershipV2Options) {
      this.cos = getLogpushOwnershipV2Options.cos;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetLogpushOwnershipV2Options.
     *
     * @return the new GetLogpushOwnershipV2Options instance
     */
    public GetLogpushOwnershipV2Options build() {
      return new GetLogpushOwnershipV2Options(this);
    }

    /**
     * Set the cos.
     *
     * @param cos the cos
     * @return the GetLogpushOwnershipV2Options builder
     */
    public Builder cos(Map<String, Object> cos) {
      this.cos = cos;
      return this;
    }
  }

  protected GetLogpushOwnershipV2Options() { }

  protected GetLogpushOwnershipV2Options(Builder builder) {
    cos = builder.cos;
  }

  /**
   * New builder.
   *
   * @return a GetLogpushOwnershipV2Options builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cos.
   *
   * Information to identify the COS bucket where the data will be pushed.
   *
   * @return the cos
   */
  public Map<String, Object> cos() {
    return cos;
  }
}

