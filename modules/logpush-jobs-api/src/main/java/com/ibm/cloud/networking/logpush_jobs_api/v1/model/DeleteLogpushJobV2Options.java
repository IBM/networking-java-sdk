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
 * The deleteLogpushJobV2 options.
 */
public class DeleteLogpushJobV2Options extends GenericModel {

  protected String jobId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;

    /**
     * Instantiates a new Builder from an existing DeleteLogpushJobV2Options instance.
     *
     * @param deleteLogpushJobV2Options the instance to initialize the Builder with
     */
    private Builder(DeleteLogpushJobV2Options deleteLogpushJobV2Options) {
      this.jobId = deleteLogpushJobV2Options.jobId;
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
     * Builds a DeleteLogpushJobV2Options.
     *
     * @return the new DeleteLogpushJobV2Options instance
     */
    public DeleteLogpushJobV2Options build() {
      return new DeleteLogpushJobV2Options(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the DeleteLogpushJobV2Options builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }
  }

  protected DeleteLogpushJobV2Options() { }

  protected DeleteLogpushJobV2Options(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    jobId = builder.jobId;
  }

  /**
   * New builder.
   *
   * @return a DeleteLogpushJobV2Options builder
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
}

