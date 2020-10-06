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
 * The updateRateLimit options.
 */
public class UpdateRateLimitOptions extends GenericModel {

  protected String rateLimitIdentifier;
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
    private String rateLimitIdentifier;
    private Boolean disabled;
    private String description;
    private List<RatelimitInputBypassItem> bypass;
    private Long threshold;
    private Long period;
    private RatelimitInputAction action;
    private RatelimitInputCorrelate correlate;
    private RatelimitInputMatch match;

    private Builder(UpdateRateLimitOptions updateRateLimitOptions) {
      this.rateLimitIdentifier = updateRateLimitOptions.rateLimitIdentifier;
      this.disabled = updateRateLimitOptions.disabled;
      this.description = updateRateLimitOptions.description;
      this.bypass = updateRateLimitOptions.bypass;
      this.threshold = updateRateLimitOptions.threshold;
      this.period = updateRateLimitOptions.period;
      this.action = updateRateLimitOptions.action;
      this.correlate = updateRateLimitOptions.correlate;
      this.match = updateRateLimitOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rateLimitIdentifier the rateLimitIdentifier
     */
    public Builder(String rateLimitIdentifier) {
      this.rateLimitIdentifier = rateLimitIdentifier;
    }

    /**
     * Builds a UpdateRateLimitOptions.
     *
     * @return the new UpdateRateLimitOptions instance
     */
    public UpdateRateLimitOptions build() {
      return new UpdateRateLimitOptions(this);
    }

    /**
     * Adds an bypass to bypass.
     *
     * @param bypass the new bypass
     * @return the UpdateRateLimitOptions builder
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
     * Set the rateLimitIdentifier.
     *
     * @param rateLimitIdentifier the rateLimitIdentifier
     * @return the UpdateRateLimitOptions builder
     */
    public Builder rateLimitIdentifier(String rateLimitIdentifier) {
      this.rateLimitIdentifier = rateLimitIdentifier;
      return this;
    }

    /**
     * Set the disabled.
     *
     * @param disabled the disabled
     * @return the UpdateRateLimitOptions builder
     */
    public Builder disabled(Boolean disabled) {
      this.disabled = disabled;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateRateLimitOptions builder
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
     * @return the UpdateRateLimitOptions builder
     */
    public Builder bypass(List<RatelimitInputBypassItem> bypass) {
      this.bypass = bypass;
      return this;
    }

    /**
     * Set the threshold.
     *
     * @param threshold the threshold
     * @return the UpdateRateLimitOptions builder
     */
    public Builder threshold(long threshold) {
      this.threshold = threshold;
      return this;
    }

    /**
     * Set the period.
     *
     * @param period the period
     * @return the UpdateRateLimitOptions builder
     */
    public Builder period(long period) {
      this.period = period;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateRateLimitOptions builder
     */
    public Builder action(RatelimitInputAction action) {
      this.action = action;
      return this;
    }

    /**
     * Set the correlate.
     *
     * @param correlate the correlate
     * @return the UpdateRateLimitOptions builder
     */
    public Builder correlate(RatelimitInputCorrelate correlate) {
      this.correlate = correlate;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the UpdateRateLimitOptions builder
     */
    public Builder match(RatelimitInputMatch match) {
      this.match = match;
      return this;
    }
  }

  protected UpdateRateLimitOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rateLimitIdentifier,
      "rateLimitIdentifier cannot be empty");
    rateLimitIdentifier = builder.rateLimitIdentifier;
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
   * @return a UpdateRateLimitOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rateLimitIdentifier.
   *
   * Identifier of rate limit.
   *
   * @return the rateLimitIdentifier
   */
  public String rateLimitIdentifier() {
    return rateLimitIdentifier;
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

