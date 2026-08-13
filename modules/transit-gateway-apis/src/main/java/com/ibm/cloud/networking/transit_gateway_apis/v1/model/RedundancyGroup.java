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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A redundancy group.
 */
public class RedundancyGroup extends GenericModel {

  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  protected String name;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected RedundancyGroup() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that this redundancy group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this redundancy group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The redundancy group name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that this redundancy group was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

