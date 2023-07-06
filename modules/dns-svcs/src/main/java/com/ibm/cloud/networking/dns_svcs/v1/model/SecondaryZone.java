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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Secondary zone details.
 */
public class SecondaryZone extends GenericModel {

  protected String id;
  protected String description;
  protected String zone;
  protected Boolean enabled;
  @SerializedName("transfer_from")
  protected List<String> transferFrom;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  protected SecondaryZone() { }

  /**
   * Gets the id.
   *
   * Identifier of the secondary zone.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the secondary zone.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the zone.
   *
   * zone name.
   *
   * @return the zone
   */
  public String getZone() {
    return zone;
  }

  /**
   * Gets the enabled.
   *
   * Enable/Disable the secondary zone.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the transferFrom.
   *
   * The addresses of DNS servers where the secondary zone data should be transferred from.
   *
   * @return the transferFrom
   */
  public List<String> getTransferFrom() {
    return transferFrom;
  }

  /**
   * Gets the createdOn.
   *
   * The time when a secondary zone is created.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The recent time when a secondary zone is modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

