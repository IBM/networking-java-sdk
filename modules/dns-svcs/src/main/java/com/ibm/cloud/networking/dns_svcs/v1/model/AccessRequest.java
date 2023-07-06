/*
 * (C) Copyright IBM Corp. 2023.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Access request.
 */
public class AccessRequest extends GenericModel {

  /**
   * The state of the access request.
   */
  public interface State {
    /** PENDING. */
    String PENDING = "PENDING";
    /** APPROVED. */
    String APPROVED = "APPROVED";
    /** REJECTED. */
    String REJECTED = "REJECTED";
    /** REVOKED. */
    String REVOKED = "REVOKED";
    /** TIMEDOUT. */
    String TIMEDOUT = "TIMEDOUT";
  }

  protected String id;
  protected AccessRequestRequestor requestor;
  @SerializedName("zone_id")
  protected String zoneId;
  @SerializedName("zone_name")
  protected String zoneName;
  protected String state;
  @SerializedName("pending_expires_at")
  protected Date pendingExpiresAt;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  protected AccessRequest() { }

  /**
   * Gets the id.
   *
   * Access request ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the requestor.
   *
   * The information of requestor.
   *
   * @return the requestor
   */
  public AccessRequestRequestor getRequestor() {
    return requestor;
  }

  /**
   * Gets the zoneId.
   *
   * The zone ID that requestor requests access for.
   *
   * @return the zoneId
   */
  public String getZoneId() {
    return zoneId;
  }

  /**
   * Gets the zoneName.
   *
   * The zone name that requestor requests access for.
   *
   * @return the zoneName
   */
  public String getZoneName() {
    return zoneName;
  }

  /**
   * Gets the state.
   *
   * The state of the access request.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the pendingExpiresAt.
   *
   * The expired time of access request with state `pending`.
   *
   * @return the pendingExpiresAt
   */
  public Date getPendingExpiresAt() {
    return pendingExpiresAt;
  }

  /**
   * Gets the createdOn.
   *
   * The time when the linked zone is created.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The recent time when the linked zone is modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

