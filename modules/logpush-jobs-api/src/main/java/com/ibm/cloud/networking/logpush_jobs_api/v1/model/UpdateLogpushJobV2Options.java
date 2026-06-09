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
 * The updateLogpushJobV2 options.
 */
public class UpdateLogpushJobV2Options extends GenericModel {

  protected String jobId;
  protected UpdateLogpushJobV2Request updateLogpushJobV2Request;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private UpdateLogpushJobV2Request updateLogpushJobV2Request;

    /**
     * Instantiates a new Builder from an existing UpdateLogpushJobV2Options instance.
     *
     * @param updateLogpushJobV2Options the instance to initialize the Builder with
     */
    private Builder(UpdateLogpushJobV2Options updateLogpushJobV2Options) {
      this.jobId = updateLogpushJobV2Options.jobId;
      this.updateLogpushJobV2Request = updateLogpushJobV2Options.updateLogpushJobV2Request;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     */
    public Builder(String jobId) {
      this.jobId = jobId;
    }

    /**
     * Builds a UpdateLogpushJobV2Options.
     *
     * @return the new UpdateLogpushJobV2Options instance
     */
    public UpdateLogpushJobV2Options build() {
      return new UpdateLogpushJobV2Options(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the UpdateLogpushJobV2Options builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the updateLogpushJobV2Request.
     *
     * @param updateLogpushJobV2Request the updateLogpushJobV2Request
     * @return the UpdateLogpushJobV2Options builder
     */
    public Builder updateLogpushJobV2Request(UpdateLogpushJobV2Request updateLogpushJobV2Request) {
      this.updateLogpushJobV2Request = updateLogpushJobV2Request;
      return this;
    }
  }

  protected UpdateLogpushJobV2Options() { }

  protected UpdateLogpushJobV2Options(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    jobId = builder.jobId;
    updateLogpushJobV2Request = builder.updateLogpushJobV2Request;
  }

  /**
   * New builder.
   *
   * @return a UpdateLogpushJobV2Options builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * logpush job identifier.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the updateLogpushJobV2Request.
   *
   * Update logpush job.
   *
   * @return the updateLogpushJobV2Request
   */
  public UpdateLogpushJobV2Request updateLogpushJobV2Request() {
    return updateLogpushJobV2Request;
  }
}

