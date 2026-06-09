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
 * The getLogpushJobV2 options.
 */
public class GetLogpushJobV2Options extends GenericModel {

  protected String jobId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;

    /**
     * Instantiates a new Builder from an existing GetLogpushJobV2Options instance.
     *
     * @param getLogpushJobV2Options the instance to initialize the Builder with
     */
    private Builder(GetLogpushJobV2Options getLogpushJobV2Options) {
      this.jobId = getLogpushJobV2Options.jobId;
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
     * Builds a GetLogpushJobV2Options.
     *
     * @return the new GetLogpushJobV2Options instance
     */
    public GetLogpushJobV2Options build() {
      return new GetLogpushJobV2Options(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetLogpushJobV2Options builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }
  }

  protected GetLogpushJobV2Options() { }

  protected GetLogpushJobV2Options(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    jobId = builder.jobId;
  }

  /**
   * New builder.
   *
   * @return a GetLogpushJobV2Options builder
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

