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
 * Load balancer details.
 */
public class LoadBalancer extends GenericModel {

  /**
   * Healthy state of the load balancer.
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
  protected Long ttl;
  protected String health;
  @SerializedName("fallback_pool")
  protected String fallbackPool;
  @SerializedName("default_pools")
  protected List<String> defaultPools;
  @SerializedName("az_pools")
  protected List<LoadBalancerAzPoolsItem> azPools;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;

  /**
   * Gets the id.
   *
   * Identifier of the load balancer.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the load balancer.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the load balancer is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the ttl.
   *
   * Time to live in second.
   *
   * @return the ttl
   */
  public Long getTtl() {
    return ttl;
  }

  /**
   * Gets the health.
   *
   * Healthy state of the load balancer.
   *
   * @return the health
   */
  public String getHealth() {
    return health;
  }

  /**
   * Gets the fallbackPool.
   *
   * The pool ID to use when all other pools are detected as unhealthy.
   *
   * @return the fallbackPool
   */
  public String getFallbackPool() {
    return fallbackPool;
  }

  /**
   * Gets the defaultPools.
   *
   * A list of pool IDs ordered by their failover priority. Pools defined here are used by default, or when region_pools
   * are not configured for a given region.
   *
   * @return the defaultPools
   */
  public List<String> getDefaultPools() {
    return defaultPools;
  }

  /**
   * Gets the azPools.
   *
   * Map availability zones to pool IDs.
   *
   * @return the azPools
   */
  public List<LoadBalancerAzPoolsItem> getAzPools() {
    return azPools;
  }

  /**
   * Gets the createdOn.
   *
   * The time when a load balancer is created.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The recent time when a load balancer is modified.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }
}

