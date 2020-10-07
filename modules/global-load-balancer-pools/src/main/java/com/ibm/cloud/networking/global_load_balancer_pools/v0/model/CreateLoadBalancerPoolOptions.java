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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLoadBalancerPool options.
 */
public class CreateLoadBalancerPoolOptions extends GenericModel {

  protected String name;
  protected List<String> checkRegions;
  protected List<LoadBalancerPoolReqOriginsItem> origins;
  protected String description;
  protected Long minimumOrigins;
  protected Boolean enabled;
  protected String monitor;
  protected String notificationEmail;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> checkRegions;
    private List<LoadBalancerPoolReqOriginsItem> origins;
    private String description;
    private Long minimumOrigins;
    private Boolean enabled;
    private String monitor;
    private String notificationEmail;

    private Builder(CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions) {
      this.name = createLoadBalancerPoolOptions.name;
      this.checkRegions = createLoadBalancerPoolOptions.checkRegions;
      this.origins = createLoadBalancerPoolOptions.origins;
      this.description = createLoadBalancerPoolOptions.description;
      this.minimumOrigins = createLoadBalancerPoolOptions.minimumOrigins;
      this.enabled = createLoadBalancerPoolOptions.enabled;
      this.monitor = createLoadBalancerPoolOptions.monitor;
      this.notificationEmail = createLoadBalancerPoolOptions.notificationEmail;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateLoadBalancerPoolOptions.
     *
     * @return the new CreateLoadBalancerPoolOptions instance
     */
    public CreateLoadBalancerPoolOptions build() {
      return new CreateLoadBalancerPoolOptions(this);
    }

    /**
     * Adds an checkRegions to checkRegions.
     *
     * @param checkRegions the new checkRegions
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder addCheckRegions(String checkRegions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(checkRegions,
        "checkRegions cannot be null");
      if (this.checkRegions == null) {
        this.checkRegions = new ArrayList<String>();
      }
      this.checkRegions.add(checkRegions);
      return this;
    }

    /**
     * Adds an origins to origins.
     *
     * @param origins the new origins
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder addOrigins(LoadBalancerPoolReqOriginsItem origins) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(origins,
        "origins cannot be null");
      if (this.origins == null) {
        this.origins = new ArrayList<LoadBalancerPoolReqOriginsItem>();
      }
      this.origins.add(origins);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the checkRegions.
     * Existing checkRegions will be replaced.
     *
     * @param checkRegions the checkRegions
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder checkRegions(List<String> checkRegions) {
      this.checkRegions = checkRegions;
      return this;
    }

    /**
     * Set the origins.
     * Existing origins will be replaced.
     *
     * @param origins the origins
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder origins(List<LoadBalancerPoolReqOriginsItem> origins) {
      this.origins = origins;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the minimumOrigins.
     *
     * @param minimumOrigins the minimumOrigins
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder minimumOrigins(long minimumOrigins) {
      this.minimumOrigins = minimumOrigins;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the monitor.
     *
     * @param monitor the monitor
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder monitor(String monitor) {
      this.monitor = monitor;
      return this;
    }

    /**
     * Set the notificationEmail.
     *
     * @param notificationEmail the notificationEmail
     * @return the CreateLoadBalancerPoolOptions builder
     */
    public Builder notificationEmail(String notificationEmail) {
      this.notificationEmail = notificationEmail;
      return this;
    }
  }

  protected CreateLoadBalancerPoolOptions(Builder builder) {
    name = builder.name;
    checkRegions = builder.checkRegions;
    origins = builder.origins;
    description = builder.description;
    minimumOrigins = builder.minimumOrigins;
    enabled = builder.enabled;
    monitor = builder.monitor;
    notificationEmail = builder.notificationEmail;
  }

  /**
   * New builder.
   *
   * @return a CreateLoadBalancerPoolOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the checkRegions.
   *
   * regions check.
   *
   * @return the checkRegions
   */
  public List<String> checkRegions() {
    return checkRegions;
  }

  /**
   * Gets the origins.
   *
   * origins.
   *
   * @return the origins
   */
  public List<LoadBalancerPoolReqOriginsItem> origins() {
    return origins;
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
   * Gets the minimumOrigins.
   *
   * The minimum number of origins that must be healthy for this pool to serve traffic.
   *
   * @return the minimumOrigins
   */
  public Long minimumOrigins() {
    return minimumOrigins;
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
   * Gets the monitor.
   *
   * monitor.
   *
   * @return the monitor
   */
  public String monitor() {
    return monitor;
  }

  /**
   * Gets the notificationEmail.
   *
   * notification email.
   *
   * @return the notificationEmail
   */
  public String notificationEmail() {
    return notificationEmail;
  }
}

