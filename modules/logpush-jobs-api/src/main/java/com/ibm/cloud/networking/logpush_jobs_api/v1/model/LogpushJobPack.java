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
 * logpush job pack.
 */
public class LogpushJobPack extends GenericModel {

  protected Long id;
  protected String name;
  protected Boolean enabled;
  protected String dataset;
  protected String frequency;
  @SerializedName("logpull_options")
  protected String logpullOptions;
  @SerializedName("destination_conf")
  protected String destinationConf;
  @SerializedName("last_complete")
  protected String lastComplete;
  @SerializedName("last_error")
  protected String lastError;
  @SerializedName("error_message")
  protected String errorMessage;

  protected LogpushJobPack() { }

  /**
   * Gets the id.
   *
   * Logpush Job ID.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Logpush Job Name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the enabled.
   *
   * Whether the logpush job enabled or not.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the dataset.
   *
   * Dataset to be pulled.
   *
   * @return the dataset
   */
  public String getDataset() {
    return dataset;
  }

  /**
   * Gets the frequency.
   *
   * The frequency at which CIS sends batches of logs to your destination.
   *
   * @return the frequency
   */
  public String getFrequency() {
    return frequency;
  }

  /**
   * Gets the logpullOptions.
   *
   * Configuration string.
   *
   * @return the logpullOptions
   */
  public String getLogpullOptions() {
    return logpullOptions;
  }

  /**
   * Gets the destinationConf.
   *
   * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed.
   *
   * @return the destinationConf
   */
  public String getDestinationConf() {
    return destinationConf;
  }

  /**
   * Gets the lastComplete.
   *
   * Records the last time for which logs have been successfully pushed.
   *
   * @return the lastComplete
   */
  public String getLastComplete() {
    return lastComplete;
  }

  /**
   * Gets the lastError.
   *
   * Records the last time the job failed.
   *
   * @return the lastError
   */
  public String getLastError() {
    return lastError;
  }

  /**
   * Gets the errorMessage.
   *
   * The last failure.
   *
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }
}

