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
 * custom resolver details.
 */
public class CustomResolver extends GenericModel {

  /**
   * Healthy state of the custom resolver.
   */
  public interface Health {
    /** HEALTHY. */
    String HEALTHY = "HEALTHY";
    /** DEGRADED. */
    String DEGRADED = "DEGRADED";
    /** CRITICAL. */
    String CRITICAL = "CRITICAL";
  }

  protected String id;
  protected String name;
  protected String description;
  protected Boolean enabled;
  protected String health;
  protected List<Location> locations;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  protected CustomResolver() { }

  /**
   * Gets the id.
   *
   * Identifier of the custom resolver.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the custom resolver.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the custom resolver.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the custom resolver is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the health.
   *
   * Healthy state of the custom resolver.
   *
   * @return the health
   */
  public String getHealth() {
    return health;
  }

  /**
   * Gets the locations.
   *
   * Locations on which the custom resolver will be running.
   *
   * @return the locations
   */
  public List<Location> getLocations() {
    return locations;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a custom resolver is created, RFC3339 format.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a custom resolver is modified, RFC3339 format.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

