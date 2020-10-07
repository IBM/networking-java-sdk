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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The editLoadBalancer options.
 */
public class EditLoadBalancerOptions extends GenericModel {

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

  protected String loadBalancerIdentifier;
  protected String name;
  protected String fallbackPool;
  protected List<String> defaultPools;
  protected String description;
  protected Long ttl;
  protected Map<String, Object> regionPools;
  protected Map<String, Object> popPools;
  protected Boolean proxied;
  protected Boolean enabled;
  protected String sessionAffinity;
  protected String steeringPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerIdentifier;
    private String name;
    private String fallbackPool;
    private List<String> defaultPools;
    private String description;
    private Long ttl;
    private Map<String, Object> regionPools;
    private Map<String, Object> popPools;
    private Boolean proxied;
    private Boolean enabled;
    private String sessionAffinity;
    private String steeringPolicy;

    private Builder(EditLoadBalancerOptions editLoadBalancerOptions) {
      this.loadBalancerIdentifier = editLoadBalancerOptions.loadBalancerIdentifier;
      this.name = editLoadBalancerOptions.name;
      this.fallbackPool = editLoadBalancerOptions.fallbackPool;
      this.defaultPools = editLoadBalancerOptions.defaultPools;
      this.description = editLoadBalancerOptions.description;
      this.ttl = editLoadBalancerOptions.ttl;
      this.regionPools = editLoadBalancerOptions.regionPools;
      this.popPools = editLoadBalancerOptions.popPools;
      this.proxied = editLoadBalancerOptions.proxied;
      this.enabled = editLoadBalancerOptions.enabled;
      this.sessionAffinity = editLoadBalancerOptions.sessionAffinity;
      this.steeringPolicy = editLoadBalancerOptions.steeringPolicy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancerIdentifier the loadBalancerIdentifier
     */
    public Builder(String loadBalancerIdentifier) {
      this.loadBalancerIdentifier = loadBalancerIdentifier;
    }

    /**
     * Builds a EditLoadBalancerOptions.
     *
     * @return the new EditLoadBalancerOptions instance
     */
    public EditLoadBalancerOptions build() {
      return new EditLoadBalancerOptions(this);
    }

    /**
     * Adds an defaultPools to defaultPools.
     *
     * @param defaultPools the new defaultPools
     * @return the EditLoadBalancerOptions builder
     */
    public Builder addDefaultPools(String defaultPools) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(defaultPools,
        "defaultPools cannot be null");
      if (this.defaultPools == null) {
        this.defaultPools = new ArrayList<String>();
      }
      this.defaultPools.add(defaultPools);
      return this;
    }

    /**
     * Set the loadBalancerIdentifier.
     *
     * @param loadBalancerIdentifier the loadBalancerIdentifier
     * @return the EditLoadBalancerOptions builder
     */
    public Builder loadBalancerIdentifier(String loadBalancerIdentifier) {
      this.loadBalancerIdentifier = loadBalancerIdentifier;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EditLoadBalancerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the fallbackPool.
     *
     * @param fallbackPool the fallbackPool
     * @return the EditLoadBalancerOptions builder
     */
    public Builder fallbackPool(String fallbackPool) {
      this.fallbackPool = fallbackPool;
      return this;
    }

    /**
     * Set the defaultPools.
     * Existing defaultPools will be replaced.
     *
     * @param defaultPools the defaultPools
     * @return the EditLoadBalancerOptions builder
     */
    public Builder defaultPools(List<String> defaultPools) {
      this.defaultPools = defaultPools;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the EditLoadBalancerOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the EditLoadBalancerOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the regionPools.
     *
     * @param regionPools the regionPools
     * @return the EditLoadBalancerOptions builder
     */
    public Builder regionPools(Map<String, Object> regionPools) {
      this.regionPools = regionPools;
      return this;
    }

    /**
     * Set the popPools.
     *
     * @param popPools the popPools
     * @return the EditLoadBalancerOptions builder
     */
    public Builder popPools(Map<String, Object> popPools) {
      this.popPools = popPools;
      return this;
    }

    /**
     * Set the proxied.
     *
     * @param proxied the proxied
     * @return the EditLoadBalancerOptions builder
     */
    public Builder proxied(Boolean proxied) {
      this.proxied = proxied;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the EditLoadBalancerOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the sessionAffinity.
     *
     * @param sessionAffinity the sessionAffinity
     * @return the EditLoadBalancerOptions builder
     */
    public Builder sessionAffinity(String sessionAffinity) {
      this.sessionAffinity = sessionAffinity;
      return this;
    }

    /**
     * Set the steeringPolicy.
     *
     * @param steeringPolicy the steeringPolicy
     * @return the EditLoadBalancerOptions builder
     */
    public Builder steeringPolicy(String steeringPolicy) {
      this.steeringPolicy = steeringPolicy;
      return this;
    }
  }

  protected EditLoadBalancerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerIdentifier,
      "loadBalancerIdentifier cannot be empty");
    loadBalancerIdentifier = builder.loadBalancerIdentifier;
    name = builder.name;
    fallbackPool = builder.fallbackPool;
    defaultPools = builder.defaultPools;
    description = builder.description;
    ttl = builder.ttl;
    regionPools = builder.regionPools;
    popPools = builder.popPools;
    proxied = builder.proxied;
    enabled = builder.enabled;
    sessionAffinity = builder.sessionAffinity;
    steeringPolicy = builder.steeringPolicy;
  }

  /**
   * New builder.
   *
   * @return a EditLoadBalancerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancerIdentifier.
   *
   * load balancer identifier.
   *
   * @return the loadBalancerIdentifier
   */
  public String loadBalancerIdentifier() {
    return loadBalancerIdentifier;
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the fallbackPool.
   *
   * fallback pool.
   *
   * @return the fallbackPool
   */
  public String fallbackPool() {
    return fallbackPool;
  }

  /**
   * Gets the defaultPools.
   *
   * default pools.
   *
   * @return the defaultPools
   */
  public List<String> defaultPools() {
    return defaultPools;
  }

  /**
   * Gets the description.
   *
   * desc.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the ttl.
   *
   * ttl.
   *
   * @return the ttl
   */
  public Long ttl() {
    return ttl;
  }

  /**
   * Gets the regionPools.
   *
   * region pools.
   *
   * @return the regionPools
   */
  public Map<String, Object> regionPools() {
    return regionPools;
  }

  /**
   * Gets the popPools.
   *
   * pop pools.
   *
   * @return the popPools
   */
  public Map<String, Object> popPools() {
    return popPools;
  }

  /**
   * Gets the proxied.
   *
   * proxied.
   *
   * @return the proxied
   */
  public Boolean proxied() {
    return proxied;
  }

  /**
   * Gets the enabled.
   *
   * enabled/disabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the sessionAffinity.
   *
   * session affinity.
   *
   * @return the sessionAffinity
   */
  public String sessionAffinity() {
    return sessionAffinity;
  }

  /**
   * Gets the steeringPolicy.
   *
   * steering policy.
   *
   * @return the steeringPolicy
   */
  public String steeringPolicy() {
    return steeringPolicy;
  }
}

