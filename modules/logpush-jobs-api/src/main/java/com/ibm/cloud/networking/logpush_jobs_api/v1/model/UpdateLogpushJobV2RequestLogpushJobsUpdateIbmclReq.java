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

/**
 * Update IBM Cloud Logs logpush job input.
 */
public class UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq extends UpdateLogpushJobV2Request {

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
    private LogpushJobsUpdateIbmclReqIbmcl ibmcl;
    private String frequency;

    /**
     * Instantiates a new Builder from an existing UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq instance.
     *
     * @param updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq the instance to initialize the Builder with
     */
    public Builder(UpdateLogpushJobV2Request updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq) {
      this.enabled = updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.enabled;
      this.logpullOptions = updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.logpullOptions;
      this.ibmcl = updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.ibmcl;
      this.frequency = updateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.frequency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq.
     *
     * @return the new UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq instance
     */
    public UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq build() {
      return new UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the logpullOptions.
     *
     * @param logpullOptions the logpullOptions
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq builder
     */
    public Builder logpullOptions(String logpullOptions) {
      this.logpullOptions = logpullOptions;
      return this;
    }

    /**
     * Set the ibmcl.
     *
     * @param ibmcl the ibmcl
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq builder
     */
    public Builder ibmcl(LogpushJobsUpdateIbmclReqIbmcl ibmcl) {
      this.ibmcl = ibmcl;
      return this;
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq() { }

  protected UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq(Builder builder) {
    enabled = builder.enabled;
    logpullOptions = builder.logpullOptions;
    ibmcl = builder.ibmcl;
    frequency = builder.frequency;
  }

  /**
   * New builder.
   *
   * @return a UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

