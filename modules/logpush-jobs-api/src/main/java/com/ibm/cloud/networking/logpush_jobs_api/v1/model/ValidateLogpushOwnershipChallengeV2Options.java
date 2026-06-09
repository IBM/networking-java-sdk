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
 * The validateLogpushOwnershipChallengeV2 options.
 */
public class ValidateLogpushOwnershipChallengeV2Options extends GenericModel {

  protected Map<String, Object> cos;
  protected String ownershipChallenge;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> cos;
    private String ownershipChallenge;

    /**
     * Instantiates a new Builder from an existing ValidateLogpushOwnershipChallengeV2Options instance.
     *
     * @param validateLogpushOwnershipChallengeV2Options the instance to initialize the Builder with
     */
    private Builder(ValidateLogpushOwnershipChallengeV2Options validateLogpushOwnershipChallengeV2Options) {
      this.cos = validateLogpushOwnershipChallengeV2Options.cos;
      this.ownershipChallenge = validateLogpushOwnershipChallengeV2Options.ownershipChallenge;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ValidateLogpushOwnershipChallengeV2Options.
     *
     * @return the new ValidateLogpushOwnershipChallengeV2Options instance
     */
    public ValidateLogpushOwnershipChallengeV2Options build() {
      return new ValidateLogpushOwnershipChallengeV2Options(this);
    }

    /**
     * Set the cos.
     *
     * @param cos the cos
     * @return the ValidateLogpushOwnershipChallengeV2Options builder
     */
    public Builder cos(Map<String, Object> cos) {
      this.cos = cos;
      return this;
    }

    /**
     * Set the ownershipChallenge.
     *
     * @param ownershipChallenge the ownershipChallenge
     * @return the ValidateLogpushOwnershipChallengeV2Options builder
     */
    public Builder ownershipChallenge(String ownershipChallenge) {
      this.ownershipChallenge = ownershipChallenge;
      return this;
    }
  }

  protected ValidateLogpushOwnershipChallengeV2Options() { }

  protected ValidateLogpushOwnershipChallengeV2Options(Builder builder) {
    cos = builder.cos;
    ownershipChallenge = builder.ownershipChallenge;
  }

  /**
   * New builder.
   *
   * @return a ValidateLogpushOwnershipChallengeV2Options builder
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

  /**
   * Gets the ownershipChallenge.
   *
   * Ownership challenge token to prove destination ownership.
   *
   * @return the ownershipChallenge
   */
  public String ownershipChallenge() {
    return ownershipChallenge;
  }
}

