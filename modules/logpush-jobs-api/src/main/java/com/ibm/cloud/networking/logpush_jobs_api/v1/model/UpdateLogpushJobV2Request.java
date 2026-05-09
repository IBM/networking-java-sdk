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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * UpdateLogpushJobV2Request.
 *
 * Classes which extend this class:
 * - UpdateLogpushJobV2RequestLogpushJobsUpdateCosReq
 * - UpdateLogpushJobV2RequestLogpushJobsUpdateLogdnaReq
 * - UpdateLogpushJobV2RequestLogpushJobsUpdateIbmclReq
 * - UpdateLogpushJobV2RequestLogpushJobsUpdateGenericReq
 */
public class UpdateLogpushJobV2Request extends GenericModel {

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

  protected Boolean enabled;
  @SerializedName("logpull_options")
  protected String logpullOptions;
  protected Map<String, Object> cos;
  @SerializedName("ownership_challenge")
  protected String ownershipChallenge;
  protected String frequency;
  protected Map<String, Object> logdna;
  protected LogpushJobsUpdateIbmclReqIbmcl ibmcl;
  protected String name;
  @SerializedName("destination_conf")
  protected String destinationConf;
  protected String dataset;

  protected UpdateLogpushJobV2Request() { }

  /**
   * Gets the enabled.
   *
   * Whether the logpush job enabled or not.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the logpullOptions.
   *
   * Configuration string.
   *
   * @return the logpullOptions
   */
  public String logpullOptions() {
    return logpullOptions;
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

  /**
   * Gets the frequency.
   *
   * The frequency at which CIS sends batches of logs to your destination.
   *
   * @return the frequency
   */
  public String frequency() {
    return frequency;
  }

  /**
   * Gets the logdna.
   *
   * Information to identify the LogDNA instance the data will be pushed.
   *
   * @return the logdna
   */
  public Map<String, Object> logdna() {
    return logdna;
  }

  /**
   * Gets the ibmcl.
   *
   * Required information to push logs to your Cloud Logs instance.
   *
   * @return the ibmcl
   */
  public LogpushJobsUpdateIbmclReqIbmcl ibmcl() {
    return ibmcl;
  }

  /**
   * Gets the name.
   *
   * Logpush Job Name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the destinationConf.
   *
   * Uniquely identifies a resource where data will be pushed. Additional configuration parameters supported by the
   * destination may be included.
   *
   * @return the destinationConf
   */
  public String destinationConf() {
    return destinationConf;
  }

  /**
   * Gets the dataset.
   *
   * Dataset to be pulled.
   *
   * @return the dataset
   */
  public String dataset() {
    return dataset;
  }
}

