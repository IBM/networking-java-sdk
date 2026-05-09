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
 * Create COS logpush job input.
 */
public class CreateLogpushJobV2RequestLogpushJobCosReq extends CreateLogpushJobV2Request {

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
    private Map<String, Object> cos;
    private String ownershipChallenge;
    private String dataset;
    private String frequency;

    /**
     * Instantiates a new Builder from an existing CreateLogpushJobV2RequestLogpushJobCosReq instance.
     *
     * @param createLogpushJobV2RequestLogpushJobCosReq the instance to initialize the Builder with
     */
    public Builder(CreateLogpushJobV2Request createLogpushJobV2RequestLogpushJobCosReq) {
      this.name = createLogpushJobV2RequestLogpushJobCosReq.name;
      this.enabled = createLogpushJobV2RequestLogpushJobCosReq.enabled;
      this.logpullOptions = createLogpushJobV2RequestLogpushJobCosReq.logpullOptions;
      this.cos = createLogpushJobV2RequestLogpushJobCosReq.cos;
      this.ownershipChallenge = createLogpushJobV2RequestLogpushJobCosReq.ownershipChallenge;
      this.dataset = createLogpushJobV2RequestLogpushJobCosReq.dataset;
      this.frequency = createLogpushJobV2RequestLogpushJobCosReq.frequency;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cos the cos
     * @param ownershipChallenge the ownershipChallenge
     */
    public Builder(Map<String, Object> cos, String ownershipChallenge) {
      this.cos = cos;
      this.ownershipChallenge = ownershipChallenge;
    }

    /**
     * Builds a CreateLogpushJobV2RequestLogpushJobCosReq.
     *
     * @return the new CreateLogpushJobV2RequestLogpushJobCosReq instance
     */
    public CreateLogpushJobV2RequestLogpushJobCosReq build() {
      return new CreateLogpushJobV2RequestLogpushJobCosReq(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the logpullOptions.
     *
     * @param logpullOptions the logpullOptions
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder logpullOptions(String logpullOptions) {
      this.logpullOptions = logpullOptions;
      return this;
    }

    /**
     * Set the cos.
     *
     * @param cos the cos
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder cos(Map<String, Object> cos) {
      this.cos = cos;
      return this;
    }

    /**
     * Set the ownershipChallenge.
     *
     * @param ownershipChallenge the ownershipChallenge
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder ownershipChallenge(String ownershipChallenge) {
      this.ownershipChallenge = ownershipChallenge;
      return this;
    }

    /**
     * Set the dataset.
     *
     * @param dataset the dataset
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder dataset(String dataset) {
      this.dataset = dataset;
      return this;
    }

    /**
     * Set the frequency.
     *
     * @param frequency the frequency
     * @return the CreateLogpushJobV2RequestLogpushJobCosReq builder
     */
    public Builder frequency(String frequency) {
      this.frequency = frequency;
      return this;
    }
  }

  protected CreateLogpushJobV2RequestLogpushJobCosReq() { }

  protected CreateLogpushJobV2RequestLogpushJobCosReq(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cos,
      "cos cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ownershipChallenge,
      "ownershipChallenge cannot be null");
    name = builder.name;
    enabled = builder.enabled;
    logpullOptions = builder.logpullOptions;
    cos = builder.cos;
    ownershipChallenge = builder.ownershipChallenge;
    dataset = builder.dataset;
    frequency = builder.frequency;
  }

  /**
   * New builder.
   *
   * @return a CreateLogpushJobV2RequestLogpushJobCosReq builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

