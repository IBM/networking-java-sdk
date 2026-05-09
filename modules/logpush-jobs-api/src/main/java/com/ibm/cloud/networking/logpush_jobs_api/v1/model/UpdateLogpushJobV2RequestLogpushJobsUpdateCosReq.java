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

/**
 * Update COS logpush job input.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq extends UpdateLogpushJobV2Request {

  /**
   * The frequency at which CIS sends batches of logs to your destination.
   */
  public interface Frequency {
    /** high. */
    String HIGH = "high";
    /** low. */
    String LOW = "low";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String logpullOptions;
    private Map<String, Object> cos;
    private String ownershipChallenge;
    private String frequency;

    /**
     * Instantiates a new Builder from an existing UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq instance.
     *
     * @param updateLogpushJobV2RequestLogpushJobsUpdateCosReq the instance to initialize the Builder with
     */
    public Builder(UpdateLogpushJobV2Request updateLogpushJobV2RequestLogpushJobsUpdateCosReq) {
      this.enabled = updateLogpushJobV2RequestLogpushJobsUpdateCosReq.enabled;
      this.logpullOptions = updateLogpushJobV2RequestLogpushJobsUpdateCosReq.logpullOptions;
      this.cos = updateLogpushJobV2RequestLogpushJobsUpdateCosReq.cos;
      this.ownershipChallenge = updateLogpushJobV2RequestLogpushJobsUpdateCosReq.ownershipChallenge;
      this.frequency = updateLogpushJobV2RequestLogpushJobsUpdateCosReq.frequency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq.
     *
     * @return the new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq instance
     */
    public UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq build() {
      return new UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the logpullOptions.
     *
     * @param logpullOptions the logpullOptions
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
     */
    public Builder logpullOptions(String logpullOptions) {
      this.logpullOptions = logpullOptions;
      return this;
    }

    /**
     * Set the cos.
     *
     * @param cos the cos
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
     */
    public Builder cos(Map<String, Object> cos) {
      this.cos = cos;
      return this;
    }

    /**
     * Set the ownershipChallenge.
     *
     * @param ownershipChallenge the ownershipChallenge
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
     */
    public Builder ownershipChallenge(String ownershipChallenge) {
      this.ownershipChallenge = ownershipChallenge;
      return this;
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq() { }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq(Builder builder) {
    enabled = builder.enabled;
    logpullOptions = builder.logpullOptions;
    cos = builder.cos;
    ownershipChallenge = builder.ownershipChallenge;
    frequency = builder.frequency;
  }

  /**
   * New builder.
   *
   * @return a UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

