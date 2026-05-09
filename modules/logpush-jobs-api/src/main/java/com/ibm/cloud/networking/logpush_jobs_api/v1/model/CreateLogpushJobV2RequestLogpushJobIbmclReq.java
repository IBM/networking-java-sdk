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
 * Create IBM Cloud Logs logpush job input.
 */
public class CreateLogpushJobV2RequestLogpushJobIbmclReq extends CreateLogpushJobV2Request {

  /**
   * Dataset to be pulled.
   */
  public interface Dataset {
    /** http_requests. */
    String HTTP_REQUESTS = "http_requests";
    /** range_events. */
    String RANGE_EVENTS = "range_events";
    /** firewall_events. */
    String FIREWALL_EVENTS = "firewall_events";
  }

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
    private String name;
    private Boolean enabled;
    private String logpullOptions;
    private LogpushJobIbmclReqIbmcl ibmcl;
    private String dataset;
    private String frequency;

    /**
     * Instantiates a new Builder from an existing CreateLogpushJobV2RequestLogpushJobIbmclReq instance.
     *
     * @param createLogpushJobV2RequestLogpushJobIbmclReq the instance to initialize the Builder with
     */
    public Builder(CreateLogpushJobV2Request createLogpushJobV2RequestLogpushJobIbmclReq) {
      this.name = createLogpushJobV2RequestLogpushJobIbmclReq.name;
      this.enabled = createLogpushJobV2RequestLogpushJobIbmclReq.enabled;
      this.logpullOptions = createLogpushJobV2RequestLogpushJobIbmclReq.logpullOptions;
      this.ibmcl = createLogpushJobV2RequestLogpushJobIbmclReq.ibmcl;
      this.dataset = createLogpushJobV2RequestLogpushJobIbmclReq.dataset;
      this.frequency = createLogpushJobV2RequestLogpushJobIbmclReq.frequency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ibmcl the ibmcl
     */
    public Builder(LogpushJobIbmclReqIbmcl ibmcl) {
      this.ibmcl = ibmcl;
    }

    /**
     * Builds a CreateLogpushJobV2RequestLogpushJobIbmclReq.
     *
     * @return the new CreateLogpushJobV2RequestLogpushJobIbmclReq instance
     */
    public CreateLogpushJobV2RequestLogpushJobIbmclReq build() {
      return new CreateLogpushJobV2RequestLogpushJobIbmclReq(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the logpullOptions.
     *
     * @param logpullOptions the logpullOptions
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder logpullOptions(String logpullOptions) {
      this.logpullOptions = logpullOptions;
      return this;
    }

    /**
     * Set the ibmcl.
     *
     * @param ibmcl the ibmcl
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder ibmcl(LogpushJobIbmclReqIbmcl ibmcl) {
      this.ibmcl = ibmcl;
      return this;
    }

    /**
     * Set the dataset.
     *
     * @param dataset the dataset
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder dataset(String dataset) {
      this.dataset = dataset;
      return this;
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the CreateLogpushJobV2RequestLogpushJobIbmclReq builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  protected CreateLogpushJobV2RequestLogpushJobIbmclReq() { }

  protected CreateLogpushJobV2RequestLogpushJobIbmclReq(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ibmcl,
      "ibmcl cannot be null");
    name = builder.name;
    enabled = builder.enabled;
    logpullOptions = builder.logpullOptions;
    ibmcl = builder.ibmcl;
    dataset = builder.dataset;
    frequency = builder.frequency;
  }

  /**
   * New builder.
   *
   * @return a CreateLogpushJobV2RequestLogpushJobIbmclReq builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

