/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.global_load_balancer_events.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ListEventsRespResultItemPoolItem.
 */
public class ListEventsRespResultItemPoolItem extends GenericModel {

  protected String id;
  protected String name;
  protected Boolean healthy;
  protected Boolean changed;
  @SerializedName("minimum_origins")
  protected Long minimumOrigins;

  /**
   * Gets the id.
   *
   * Pool id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Pool name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the healthy.
   *
   * Pool is healthy.
   *
   * @return the healthy
   */
  public Boolean isHealthy() {
    return healthy;
  }

  /**
   * Gets the changed.
   *
   * Pool changed.
   *
   * @return the changed
   */
  public Boolean isChanged() {
    return changed;
  }

  /**
   * Gets the minimumOrigins.
   *
   * Minimum origins.
   *
   * @return the minimumOrigins
   */
  public Long getMinimumOrigins() {
    return minimumOrigins;
  }
}

