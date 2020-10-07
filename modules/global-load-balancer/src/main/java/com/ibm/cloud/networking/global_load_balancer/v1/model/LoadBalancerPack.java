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
package com.ibm.cloud.networking.global_load_balancer.v1.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * loadbalancer pack.
 */
public class LoadBalancerPack extends GenericModel {

  /**
   * session affinity.
   */
  public interface SessionAffinity {
    /** none. */
    String NONE = "none";
    /** cookie. */
    String COOKIE = "cookie";
    /** ip_cookie. */
    String IP_COOKIE = "ip_cookie";
  }

  /**
   * steering policy.
   */
  public interface SteeringPolicy {
    /** off. */
    String OFF = "off";
    /** geo. */
    String GEO = "geo";
    /** random. */
    String RANDOM = "random";
    /** dynamic_latency. */
    String DYNAMIC_LATENCY = "dynamic_latency";
  }

  protected String id;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  protected String description;
  protected String name;
  protected Long ttl;
  @SerializedName("fallback_pool")
  protected String fallbackPool;
  @SerializedName("default_pools")
  protected List<String> defaultPools;
  @SerializedName("region_pools")
  protected Map<String, Object> regionPools;
  @SerializedName("pop_pools")
  protected Map<String, Object> popPools;
  protected Boolean proxied;
  protected Boolean enabled;
  @SerializedName("session_affinity")
  protected String sessionAffinity;
  @SerializedName("steering_policy")
  protected String steeringPolicy;

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
   * Gets the ttl.
   *
   * ttl.
   *
   * @return the ttl
   */
  public Long getTtl() {
    return ttl;
  }

  /**
   * Gets the fallbackPool.
   *
   * fallback pool.
   *
   * @return the fallbackPool
   */
  public String getFallbackPool() {
    return fallbackPool;
  }

  /**
   * Gets the defaultPools.
   *
   * default pools.
   *
   * @return the defaultPools
   */
  public List<String> getDefaultPools() {
    return defaultPools;
  }

  /**
   * Gets the regionPools.
   *
   * region pools.
   *
   * @return the regionPools
   */
  public Map<String, Object> getRegionPools() {
    return regionPools;
  }

  /**
   * Gets the popPools.
   *
   * pop pools.
   *
   * @return the popPools
   */
  public Map<String, Object> getPopPools() {
    return popPools;
  }

  /**
   * Gets the proxied.
   *
   * proxied.
   *
   * @return the proxied
   */
  public Boolean isProxied() {
    return proxied;
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
   * Gets the sessionAffinity.
   *
   * session affinity.
   *
   * @return the sessionAffinity
   */
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  /**
   * Gets the steeringPolicy.
   *
   * steering policy.
   *
   * @return the steeringPolicy
   */
  public String getSteeringPolicy() {
    return steeringPolicy;
  }
}

