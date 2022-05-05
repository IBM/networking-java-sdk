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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createPool options.
 */
public class CreatePoolOptions extends GenericModel {

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

  protected String instanceId;
  protected String name;
  protected String description;
  protected Boolean enabled;
  protected Long healthyOriginsThreshold;
  protected List<OriginInput> origins;
  protected String monitor;
  protected String notificationChannel;
  protected String healthcheckRegion;
  protected List<String> healthcheckSubnets;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String description;
    private Boolean enabled;
    private Long healthyOriginsThreshold;
    private List<OriginInput> origins;
    private String monitor;
    private String notificationChannel;
    private String healthcheckRegion;
    private List<String> healthcheckSubnets;
    private String xCorrelationId;

    private Builder(CreatePoolOptions createPoolOptions) {
      this.instanceId = createPoolOptions.instanceId;
      this.name = createPoolOptions.name;
      this.description = createPoolOptions.description;
      this.enabled = createPoolOptions.enabled;
      this.healthyOriginsThreshold = createPoolOptions.healthyOriginsThreshold;
      this.origins = createPoolOptions.origins;
      this.monitor = createPoolOptions.monitor;
      this.notificationChannel = createPoolOptions.notificationChannel;
      this.healthcheckRegion = createPoolOptions.healthcheckRegion;
      this.healthcheckSubnets = createPoolOptions.healthcheckSubnets;
      this.xCorrelationId = createPoolOptions.xCorrelationId;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a CreatePoolOptions.
     *
     * @return the new CreatePoolOptions instance
     */
    public CreatePoolOptions build() {
      return new CreatePoolOptions(this);
    }

    /**
     * Adds an origins to origins.
     *
     * @param origins the new origins
     * @return the CreatePoolOptions builder
     */
    public Builder addOrigins(OriginInput origins) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(origins,
        "origins cannot be null");
      if (this.origins == null) {
        this.origins = new ArrayList<OriginInput>();
      }
      this.origins.add(origins);
      return this;
    }

    /**
     * Adds an healthcheckSubnets to healthcheckSubnets.
     *
     * @param healthcheckSubnets the new healthcheckSubnets
     * @return the CreatePoolOptions builder
     */
    public Builder addHealthcheckSubnets(String healthcheckSubnets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(healthcheckSubnets,
        "healthcheckSubnets cannot be null");
      if (this.healthcheckSubnets == null) {
        this.healthcheckSubnets = new ArrayList<String>();
      }
      this.healthcheckSubnets.add(healthcheckSubnets);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreatePoolOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePoolOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreatePoolOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreatePoolOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the healthyOriginsThreshold.
     *
     * @param healthyOriginsThreshold the healthyOriginsThreshold
     * @return the CreatePoolOptions builder
     */
    public Builder healthyOriginsThreshold(long healthyOriginsThreshold) {
      this.healthyOriginsThreshold = healthyOriginsThreshold;
      return this;
    }

    /**
     * Set the origins.
     * Existing origins will be replaced.
     *
     * @param origins the origins
     * @return the CreatePoolOptions builder
     */
    public Builder origins(List<OriginInput> origins) {
      this.origins = origins;
      return this;
    }

    /**
     * Set the monitor.
     *
     * @param monitor the monitor
     * @return the CreatePoolOptions builder
     */
    public Builder monitor(String monitor) {
      this.monitor = monitor;
      return this;
    }

    /**
     * Set the notificationChannel.
     *
     * @param notificationChannel the notificationChannel
     * @return the CreatePoolOptions builder
     */
    public Builder notificationChannel(String notificationChannel) {
      this.notificationChannel = notificationChannel;
      return this;
    }

    /**
     * Set the healthcheckRegion.
     *
     * @param healthcheckRegion the healthcheckRegion
     * @return the CreatePoolOptions builder
     */
    public Builder healthcheckRegion(String healthcheckRegion) {
      this.healthcheckRegion = healthcheckRegion;
      return this;
    }

    /**
     * Set the healthcheckSubnets.
     * Existing healthcheckSubnets will be replaced.
     *
     * @param healthcheckSubnets the healthcheckSubnets
     * @return the CreatePoolOptions builder
     */
    public Builder healthcheckSubnets(List<String> healthcheckSubnets) {
      this.healthcheckSubnets = healthcheckSubnets;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreatePoolOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreatePoolOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    name = builder.name;
    description = builder.description;
    enabled = builder.enabled;
    healthyOriginsThreshold = builder.healthyOriginsThreshold;
    origins = builder.origins;
    monitor = builder.monitor;
    notificationChannel = builder.notificationChannel;
    healthcheckRegion = builder.healthcheckRegion;
    healthcheckSubnets = builder.healthcheckSubnets;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreatePoolOptions builder
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
   * Gets the name.
   *
   * Name of the load balancer pool.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the load balancer pool.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Whether the load balancer pool is enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
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
  public Long healthyOriginsThreshold() {
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
  public List<OriginInput> origins() {
    return origins;
  }

  /**
   * Gets the monitor.
   *
   * The ID of the load balancer monitor to be associated to this pool.
   *
   * @return the monitor
   */
  public String monitor() {
    return monitor;
  }

  /**
   * Gets the notificationChannel.
   *
   * The notification channel.
   *
   * @return the notificationChannel
   */
  public String notificationChannel() {
    return notificationChannel;
  }

  /**
   * Gets the healthcheckRegion.
   *
   * Health check region of VSIs.
   *
   * @return the healthcheckRegion
   */
  public String healthcheckRegion() {
    return healthcheckRegion;
  }

  /**
   * Gets the healthcheckSubnets.
   *
   * Health check subnet CRN.
   *
   * @return the healthcheckSubnets
   */
  public List<String> healthcheckSubnets() {
    return healthcheckSubnets;
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

