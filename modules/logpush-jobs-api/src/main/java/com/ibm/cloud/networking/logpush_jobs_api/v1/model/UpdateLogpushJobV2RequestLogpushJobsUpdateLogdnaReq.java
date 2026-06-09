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
 * Update LogDNA logpush job input.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq extends UpdateLogpushJobV2Request {

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
    private Map<String, Object> logdna;
    private String frequency;

    /**
     * Instantiates a new Builder from an existing UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq instance.
     *
     * @param updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq the instance to initialize the Builder with
     */
    public Builder(UpdateLogpushJobV2Request updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq) {
      this.enabled = updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.enabled;
      this.logpullOptions = updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.logpullOptions;
      this.logdna = updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.logdna;
      this.frequency = updateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.frequency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq.
     *
     * @return the new UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq instance
     */
    public UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq build() {
      return new UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the logpullOptions.
     *
     * @param logpullOptions the logpullOptions
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq builder
     */
    public Builder logpullOptions(String logpullOptions) {
      this.logpullOptions = logpullOptions;
      return this;
    }

    /**
     * Set the logdna.
     *
     * @param logdna the logdna
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq builder
     */
    public Builder logdna(Map<String, Object> logdna) {
      this.logdna = logdna;
      return this;
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq() { }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq(Builder builder) {
    enabled = builder.enabled;
    logpullOptions = builder.logpullOptions;
    logdna = builder.logdna;
    frequency = builder.frequency;
  }

  /**
   * New builder.
   *
   * @return a UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

