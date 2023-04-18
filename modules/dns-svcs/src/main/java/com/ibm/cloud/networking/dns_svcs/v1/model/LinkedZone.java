/*
 * (C) Copyright IBM Corp. 2022.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * linked zone details.
 */
public class LinkedZone extends GenericModel {

  /**
   * The state of linked zone.
   */
  public interface State {
    /** APPROVAL_PENDING. */
    String APPROVAL_PENDING = "APPROVAL_PENDING";
    /** PENDING_NETWORK_ADD. */
    String PENDING_NETWORK_ADD = "PENDING_NETWORK_ADD";
    /** ACTIVE. */
    String ACTIVE = "ACTIVE";
    /** APPROVAL_REJECTED. */
    String APPROVAL_REJECTED = "APPROVAL_REJECTED";
    /** APPROVAL_TIMEDOUT. */
    String APPROVAL_TIMEDOUT = "APPROVAL_TIMEDOUT";
    /** APPROVAL_REVOKED. */
    String APPROVAL_REVOKED = "APPROVAL_REVOKED";
  }

  protected String id;
  @SerializedName("instance_id")
  protected String instanceId;
  protected String name;
  protected String description;
  @SerializedName("linked_to")
  protected LinkedZoneLinkedTo linkedTo;
  protected String state;
  protected String label;
  @SerializedName("approval_required_before")
  protected String approvalRequiredBefore;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;

  /**
   * Gets the id.
   *
   * Identifier of the linked zone.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instanceId.
   *
   * Unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the name.
   *
   * Name of owner's DNS zone.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the linked zone.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the linkedTo.
   *
   * The owner's instance and zone that the zone is linked to.
   *
   * @return the linkedTo
   */
  public LinkedZoneLinkedTo getLinkedTo() {
    return linkedTo;
  }

  /**
   * Gets the state.
   *
   * The state of linked zone.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the label.
   *
   * The label of linked zone.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the approvalRequiredBefore.
   *
   * The expired time of access request that is created for the linked zone.
   *
   * @return the approvalRequiredBefore
   */
  public String getApprovalRequiredBefore() {
    return approvalRequiredBefore;
  }

  /**
   * Gets the createdOn.
   *
   * The time when the linked zone is created.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The recent time when the linked zone is modified.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }
}

