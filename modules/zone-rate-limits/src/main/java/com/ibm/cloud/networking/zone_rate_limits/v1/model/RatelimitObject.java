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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * rate limit object.
 */
public class RatelimitObject extends GenericModel {

  protected String id;
  protected Boolean disabled;
  protected String description;
  protected List<RatelimitObjectBypassItem> bypass;
  protected Long threshold;
  protected Long period;
  protected RatelimitObjectCorrelate correlate;
  protected RatelimitObjectAction action;
  protected RatelimitObjectMatch match;

  /**
   * Gets the id.
   *
   * Identifier of the rate limit.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the disabled.
   *
   * Whether this ratelimit is currently disabled.
   *
   * @return the disabled
   */
  public Boolean isDisabled() {
    return disabled;
  }

  /**
   * Gets the description.
   *
   * A note that you can use to describe the reason for a rate limit.
   *
   * @return the description
   */
  public String getDescription() {
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
  public List<RatelimitObjectBypassItem> getBypass() {
    return bypass;
  }

  /**
   * Gets the threshold.
   *
   * The threshold that triggers the rate limit mitigations, combine with period. i.e. threshold per period.
   *
   * @return the threshold
   */
  public Long getThreshold() {
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
  public Long getPeriod() {
    return period;
  }

  /**
   * Gets the correlate.
   *
   * Enable NAT based rate limits.
   *
   * @return the correlate
   */
  public RatelimitObjectCorrelate getCorrelate() {
    return correlate;
  }

  /**
   * Gets the action.
   *
   * action.
   *
   * @return the action
   */
  public RatelimitObjectAction getAction() {
    return action;
  }

  /**
   * Gets the match.
   *
   * Determines which traffic the rate limit counts towards the threshold. Needs to be one of "request" or "response"
   * objects.
   *
   * @return the match
   */
  public RatelimitObjectMatch getMatch() {
    return match;
  }
}

