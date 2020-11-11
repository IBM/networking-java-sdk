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
 * The getRateLimit options.
 */
public class GetRateLimitOptions extends GenericModel {

  protected String rateLimitIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String rateLimitIdentifier;

    private Builder(GetRateLimitOptions getRateLimitOptions) {
      this.rateLimitIdentifier = getRateLimitOptions.rateLimitIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rateLimitIdentifier the rateLimitIdentifier
     */
    public Builder(String rateLimitIdentifier) {
      this.rateLimitIdentifier = rateLimitIdentifier;
    }

    /**
     * Builds a GetRateLimitOptions.
     *
     * @return the new GetRateLimitOptions instance
     */
    public GetRateLimitOptions build() {
      return new GetRateLimitOptions(this);
    }

    /**
     * Set the rateLimitIdentifier.
     *
     * @param rateLimitIdentifier the rateLimitIdentifier
     * @return the GetRateLimitOptions builder
     */
    public Builder rateLimitIdentifier(String rateLimitIdentifier) {
      this.rateLimitIdentifier = rateLimitIdentifier;
      return this;
    }
  }

  protected GetRateLimitOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rateLimitIdentifier,
      "rateLimitIdentifier cannot be empty");
    rateLimitIdentifier = builder.rateLimitIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetRateLimitOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rateLimitIdentifier.
   *
   * Identifier of rate limit for the given zone.
   *
   * @return the rateLimitIdentifier
   */
  public String rateLimitIdentifier() {
    return rateLimitIdentifier;
  }
}

