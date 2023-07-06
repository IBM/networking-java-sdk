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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateLoadBalancer options.
 */
public class UpdateLoadBalancerOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String lbId;
  protected String name;
  protected String description;
  protected Boolean enabled;
  protected Long ttl;
  protected String fallbackPool;
  protected List<String> defaultPools;
  protected List<AzPoolsItem> azPools;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String lbId;
    private String name;
    private String description;
    private Boolean enabled;
    private Long ttl;
    private String fallbackPool;
    private List<String> defaultPools;
    private List<AzPoolsItem> azPools;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing UpdateLoadBalancerOptions instance.
     *
     * @param updateLoadBalancerOptions the instance to initialize the Builder with
     */
    private Builder(UpdateLoadBalancerOptions updateLoadBalancerOptions) {
      this.instanceId = updateLoadBalancerOptions.instanceId;
      this.dnszoneId = updateLoadBalancerOptions.dnszoneId;
      this.lbId = updateLoadBalancerOptions.lbId;
      this.name = updateLoadBalancerOptions.name;
      this.description = updateLoadBalancerOptions.description;
      this.enabled = updateLoadBalancerOptions.enabled;
      this.ttl = updateLoadBalancerOptions.ttl;
      this.fallbackPool = updateLoadBalancerOptions.fallbackPool;
      this.defaultPools = updateLoadBalancerOptions.defaultPools;
      this.azPools = updateLoadBalancerOptions.azPools;
      this.xCorrelationId = updateLoadBalancerOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param dnszoneId the dnszoneId
     * @param lbId the lbId
     */
    public Builder(String instanceId, String dnszoneId, String lbId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
      this.lbId = lbId;
    }

    /**
     * Builds a UpdateLoadBalancerOptions.
     *
     * @return the new UpdateLoadBalancerOptions instance
     */
    public UpdateLoadBalancerOptions build() {
      return new UpdateLoadBalancerOptions(this);
    }

    /**
     * Adds an defaultPools to defaultPools.
     *
     * @param defaultPools the new defaultPools
     * @return the UpdateLoadBalancerOptions builder
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
     * Adds an azPools to azPools.
     *
     * @param azPools the new azPools
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder addAzPools(AzPoolsItem azPools) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(azPools,
        "azPools cannot be null");
      if (this.azPools == null) {
        this.azPools = new ArrayList<AzPoolsItem>();
      }
      this.azPools.add(azPools);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the lbId.
     *
     * @param lbId the lbId
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder lbId(String lbId) {
      this.lbId = lbId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the ttl.
     *
     * @param ttl the ttl
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder ttl(long ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Set the fallbackPool.
     *
     * @param fallbackPool the fallbackPool
     * @return the UpdateLoadBalancerOptions builder
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
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder defaultPools(List<String> defaultPools) {
      this.defaultPools = defaultPools;
      return this;
    }

    /**
     * Set the azPools.
     * Existing azPools will be replaced.
     *
     * @param azPools the azPools
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder azPools(List<AzPoolsItem> azPools) {
      this.azPools = azPools;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateLoadBalancerOptions() { }

  protected UpdateLoadBalancerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lbId,
      "lbId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    lbId = builder.lbId;
    name = builder.name;
    description = builder.description;
    enabled = builder.enabled;
    ttl = builder.ttl;
    fallbackPool = builder.fallbackPool;
    defaultPools = builder.defaultPools;
    azPools = builder.azPools;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the dnszoneId.
   *
   * The unique identifier of a DNS zone.
   *
   * @return the dnszoneId
   */
  public String dnszoneId() {
    return dnszoneId;
  }

  /**
   * Gets the lbId.
   *
   * The unique identifier of a load balancer.
   *
   * @return the lbId
   */
  public String lbId() {
    return lbId;
  }

  /**
   * Gets the name.
   *
   * Name of the load balancer.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the load balancer is enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the ttl.
   *
   * Time to live in second.
   *
   * @return the ttl
   */
  public Long ttl() {
    return ttl;
  }

  /**
   * Gets the fallbackPool.
   *
   * The pool ID to use when all other pools are detected as unhealthy.
   *
   * @return the fallbackPool
   */
  public String fallbackPool() {
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
  public List<String> defaultPools() {
    return defaultPools;
  }

  /**
   * Gets the azPools.
   *
   * Map availability zones to pool IDs.
   *
   * @return the azPools
   */
  public List<AzPoolsItem> azPools() {
    return azPools;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

