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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * OperationStatusRespResult.
 */
public class OperationStatusRespResult extends GenericModel {

  public interface Status {
    /** pending. */
    String PENDING = "pending";
    /** running. */
    String RUNNING = "running";
    /** completed. */
    String COMPLETED = "completed";
    /** failed. */
    String FAILED = "failed";
  }

  protected String id;
  protected String status;
  protected String completed;
  protected String error;

  protected OperationStatusRespResult() { }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the completed.
   *
   * @return the completed
   */
  public String getCompleted() {
    return completed;
  }

  /**
   * Gets the error.
   *
   * A message describing the error when the status is failed.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }
}

