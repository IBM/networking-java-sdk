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
package com.ibm.cloud.networking.global_load_balancer_pools.v0.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * load balancer pool pack.
 */
public class LoadBalancerPoolPack extends GenericModel {

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String description;
  protected String name;
  protected Boolean enabled;
  protected Boolean healthy;
  protected String monitor;
  protected List<LoadBalancerPoolPackOriginsItem> origins;
  @SerializedName("notification_email")
  protected String notificationEmail;

  /**
   * Gets the id.
   *
   * identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * created date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * modified date.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the description.
   *
   * desc.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the enabled.
   *
   * enabled/disabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the healthy.
   *
   * healthy.
   *
   * @return the healthy
   */
  public Boolean isHealthy() {
    return healthy;
  }

  /**
   * Gets the monitor.
   *
   * monitor.
   *
   * @return the monitor
   */
  public String getMonitor() {
    return monitor;
  }

  /**
   * Gets the origins.
   *
   * original.
   *
   * @return the origins
   */
  public List<LoadBalancerPoolPackOriginsItem> getOrigins() {
    return origins;
  }

  /**
   * Gets the notificationEmail.
   *
   * notification email.
   *
   * @return the notificationEmail
   */
  public String getNotificationEmail() {
    return notificationEmail;
  }
}

