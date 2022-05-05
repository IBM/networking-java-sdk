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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Load balancer pool details.
 */
public class Pool extends GenericModel {

  /**
   * Healthy state of the load balancer pool.
   */
  public interface Health {
    /** HEALTHY. */
    String HEALTHY = "HEALTHY";
    /** DEGRADED. */
    String DEGRADED = "DEGRADED";
    /** CRITICAL. */
    String CRITICAL = "CRITICAL";
  }

  /**
   * Health check region of VSIs.
   */
  public interface HealthcheckRegion {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-du. */
    String EU_DU = "eu-du";
    /** au-syd. */
    String AU_SYD = "au-syd";
    /** jp-tok. */
    String JP_TOK = "jp-tok";
  }

  protected String id;
  protected String name;
  protected String description;
  protected Boolean enabled;
  @SerializedName("healthy_origins_threshold")
  protected Long healthyOriginsThreshold;
  protected List<Origin> origins;
  protected String monitor;
  @SerializedName("notification_channel")
  protected String notificationChannel;
  protected String health;
  @SerializedName("healthcheck_region")
  protected String healthcheckRegion;
  @SerializedName("healthcheck_subnets")
  protected List<String> healthcheckSubnets;
  @SerializedName("healthcheck_vsis")
  protected List<PoolHealthcheckVsisItem> healthcheckVsis;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;

  /**
   * Gets the id.
   *
   * Identifier of the load balancer pool.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the load balancer pool.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer pool.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the load balancer pool is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the healthyOriginsThreshold.
   *
   * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins
   * falls below this number, the pool will be marked unhealthy and we will failover to the next available pool.
   *
   * @return the healthyOriginsThreshold
   */
  public Long getHealthyOriginsThreshold() {
    return healthyOriginsThreshold;
  }

  /**
   * Gets the origins.
   *
   * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy
   * origins, provided the pool itself is healthy.
   *
   * @return the origins
   */
  public List<Origin> getOrigins() {
    return origins;
  }

  /**
   * Gets the monitor.
   *
   * The ID of the load balancer monitor to be associated to this pool.
   *
   * @return the monitor
   */
  public String getMonitor() {
    return monitor;
  }

  /**
   * Gets the notificationChannel.
   *
   * The notification channel.
   *
   * @return the notificationChannel
   */
  public String getNotificationChannel() {
    return notificationChannel;
  }

  /**
   * Gets the health.
   *
   * Healthy state of the load balancer pool.
   *
   * @return the health
   */
  public String getHealth() {
    return health;
  }

  /**
   * Gets the healthcheckRegion.
   *
   * Health check region of VSIs.
   *
   * @return the healthcheckRegion
   */
  public String getHealthcheckRegion() {
    return healthcheckRegion;
  }

  /**
   * Gets the healthcheckSubnets.
   *
   * Health check subnet CRNs.
   *
   * @return the healthcheckSubnets
   */
  public List<String> getHealthcheckSubnets() {
    return healthcheckSubnets;
  }

  /**
   * Gets the healthcheckVsis.
   *
   * Health check VSI information.
   *
   * @return the healthcheckVsis
   */
  public List<PoolHealthcheckVsisItem> getHealthcheckVsis() {
    return healthcheckVsis;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a load balancer pool is created.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a load balancer pool is modified.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }
}

