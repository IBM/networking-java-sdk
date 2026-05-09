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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Required information to push logs to your Cloud Logs instance.
 */
public class LogpushJobsUpdateIbmclReqIbmcl extends GenericModel {

  @SerializedName("instance_id")
  protected String instanceId;
  protected String region;
  @SerializedName("api_key")
  protected String apiKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String region;
    private String apiKey;

    /**
     * Instantiates a new Builder from an existing LogpushJobsUpdateIbmclReqIbmcl instance.
     *
     * @param logpushJobsUpdateIbmclReqIbmcl the instance to initialize the Builder with
     */
    private Builder(LogpushJobsUpdateIbmclReqIbmcl logpushJobsUpdateIbmclReqIbmcl) {
      this.instanceId = logpushJobsUpdateIbmclReqIbmcl.instanceId;
      this.region = logpushJobsUpdateIbmclReqIbmcl.region;
      this.apiKey = logpushJobsUpdateIbmclReqIbmcl.apiKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LogpushJobsUpdateIbmclReqIbmcl.
     *
     * @return the new LogpushJobsUpdateIbmclReqIbmcl instance
     */
    public LogpushJobsUpdateIbmclReqIbmcl build() {
      return new LogpushJobsUpdateIbmclReqIbmcl(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the LogpushJobsUpdateIbmclReqIbmcl builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the LogpushJobsUpdateIbmclReqIbmcl builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the LogpushJobsUpdateIbmclReqIbmcl builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }
  }

  protected LogpushJobsUpdateIbmclReqIbmcl() { }

  protected LogpushJobsUpdateIbmclReqIbmcl(Builder builder) {
    instanceId = builder.instanceId;
    region = builder.region;
    apiKey = builder.apiKey;
  }

  /**
   * New builder.
   *
   * @return a LogpushJobsUpdateIbmclReqIbmcl builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * GUID of the IBM Cloud Logs instance where you want to send logs.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the region.
   *
   * Region where the IBM Cloud Logs instance is located.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the apiKey.
   *
   * IBM Cloud API key used to generate a token for pushing to your Cloud Logs instance.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }
}

