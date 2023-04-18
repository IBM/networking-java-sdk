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
 * DNS zone details.
 */
public class Dnszone extends GenericModel {

  /**
   * State of DNS zone.
   */
  public interface State {
    /** pending_network_add. */
    String PENDING_NETWORK_ADD = "pending_network_add";
    /** active. */
    String ACTIVE = "active";
    /** disabled. */
    String DISABLED = "disabled";
    /** pending_delete. */
    String PENDING_DELETE = "pending_delete";
    /** deleted. */
    String DELETED = "deleted";
  }

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  @SerializedName("instance_id")
  protected String instanceId;
  protected String name;
  protected String description;
  protected String state;
  protected String label;

  /**
   * Gets the id.
   *
   * Unique identifier of a DNS zone.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a DNS zone is created.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a DNS zone is modified.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
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
   * Name of DNS zone.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The text describing the purpose of a DNS zone.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the state.
   *
   * State of DNS zone.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the label.
   *
   * The label of a DNS zone.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

