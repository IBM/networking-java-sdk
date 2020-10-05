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
package com.ibm.cloud.networking.zone_rate_limits.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createZoneRateLimits options.
 */
public class CreateZoneRateLimitsOptions extends GenericModel {

  protected Boolean disabled;
  protected String description;
  protected List<RatelimitInputBypassItem> bypass;
  protected Long threshold;
  protected Long period;
  protected RatelimitInputAction action;
  protected RatelimitInputCorrelate correlate;
  protected RatelimitInputMatch match;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean disabled;
    private String description;
    private List<RatelimitInputBypassItem> bypass;
    private Long threshold;
    private Long period;
    private RatelimitInputAction action;
    private RatelimitInputCorrelate correlate;
    private RatelimitInputMatch match;

    private Builder(CreateZoneRateLimitsOptions createZoneRateLimitsOptions) {
      this.disabled = createZoneRateLimitsOptions.disabled;
      this.description = createZoneRateLimitsOptions.description;
      this.bypass = createZoneRateLimitsOptions.bypass;
      this.threshold = createZoneRateLimitsOptions.threshold;
      this.period = createZoneRateLimitsOptions.period;
      this.action = createZoneRateLimitsOptions.action;
      this.correlate = createZoneRateLimitsOptions.correlate;
      this.match = createZoneRateLimitsOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateZoneRateLimitsOptions.
     *
     * @return the new CreateZoneRateLimitsOptions instance
     */
    public CreateZoneRateLimitsOptions build() {
      return new CreateZoneRateLimitsOptions(this);
    }

    /**
     * Adds an bypass to bypass.
     *
     * @param bypass the new bypass
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder addBypass(RatelimitInputBypassItem bypass) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bypass,
        "bypass cannot be null");
      if (this.bypass == null) {
        this.bypass = new ArrayList<RatelimitInputBypassItem>();
      }
      this.bypass.add(bypass);
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the bypass.
     * Existing bypass will be replaced.
     *
     * @param bypass the bypass
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder bypass(List<RatelimitInputBypassItem> bypass) {
      this.bypass = bypass;
      return this;
    }

    /**
     * Set the threshold.
     *
     * @param threshold the threshold
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder threshold(long threshold) {
      this.threshold = threshold;
      return this;
    }

    /**
     * Set the period.
     *
     * @param period the period
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder period(long period) {
      this.period = period;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder action(RatelimitInputAction action) {
      this.action = action;
      return this;
    }

    /**
     * Set the correlate.
     *
     * @param correlate the correlate
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder correlate(RatelimitInputCorrelate correlate) {
      this.correlate = correlate;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the CreateZoneRateLimitsOptions builder
     */
    public Builder match(RatelimitInputMatch match) {
      this.match = match;
      return this;
    }
  }

  protected CreateZoneRateLimitsOptions(Builder builder) {
    disabled = builder.disabled;
    description = builder.description;
    bypass = builder.bypass;
    threshold = builder.threshold;
    period = builder.period;
    action = builder.action;
    correlate = builder.correlate;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a CreateZoneRateLimitsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the disabled.
   *
   * Whether this ratelimit is currently disabled.
   *
   * @return the disabled
   */
  public Boolean disabled() {
    return disabled;
  }

  /**
   * Gets the description.
   *
   * A note that you can use to describe the reason for a rate limit.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the bypass.
   *
   * Criteria that would allow the rate limit to be bypassed, for example to express that you shouldn't apply a rate
   * limit to a given set of URLs.
   *
   * @return the bypass
   */
  public List<RatelimitInputBypassItem> bypass() {
    return bypass;
  }

  /**
   * Gets the threshold.
   *
   * The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period.
   *
   * @return the threshold
   */
  public Long threshold() {
    return threshold;
  }

  /**
   * Gets the period.
   *
   * The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be
   * performed.
   *
   * @return the period
   */
  public Long period() {
    return period;
  }

  /**
   * Gets the action.
   *
   * action.
   *
   * @return the action
   */
  public RatelimitInputAction action() {
    return action;
  }

  /**
   * Gets the correlate.
   *
   * Enable NAT based rate limits.
   *
   * @return the correlate
   */
  public RatelimitInputCorrelate correlate() {
    return correlate;
  }

  /**
   * Gets the match.
   *
   * Determines which traffic the rate limit counts towards the threshold. Needs to be one of "request" or "response"
   * objects.
   *
   * @return the match
   */
  public RatelimitInputMatch match() {
    return match;
  }
}

