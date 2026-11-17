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

package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Cache clear action details.
 */
public class ClearCacheAction extends GenericModel {

  /**
   * The status of the cache clear action.
   */
  public interface Status {
    /** pending. */
    String PENDING = "pending";
    /** success. */
    String SUCCESS = "success";
    /** failed. */
    String FAILED = "failed";
  }

  protected String id;
  protected String status;
  protected List<ClearCacheError> errors;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;
  @SerializedName("expires_on")
  protected Date expiresOn;

  protected ClearCacheAction() { }

  /**
   * Gets the id.
   *
   * Identifier of the cache clear action.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the status.
   *
   * The status of the cache clear action.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the errors.
   *
   * Errors encountered during the cache clear action. Present only when status is failed.
   *
   * @return the errors
   */
  public List<ClearCacheError> getErrors() {
    return errors;
  }

  /**
   * Gets the createdOn.
   *
   * The time when the cache clear action was created, RFC3339 format.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The time when the cache clear action was last modified, RFC3339 format.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the expiresOn.
   *
   * The time when the cache clear action record will be deleted, RFC3339 format. The record is retained for up to 5
   * hours.
   *
   * @return the expiresOn
   */
  public Date getExpiresOn() {
    return expiresOn;
  }
}
