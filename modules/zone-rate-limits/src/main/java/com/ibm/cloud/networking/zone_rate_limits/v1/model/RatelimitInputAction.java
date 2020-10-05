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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * action.
 */
public class RatelimitInputAction extends GenericModel {

  /**
   * The type of action to perform.
   */
  public interface Mode {
    /** simulate. */
    String SIMULATE = "simulate";
    /** ban. */
    String BAN = "ban";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  protected String mode;
  protected Long timeout;
  protected RatelimitInputActionResponse response;

  /**
   * Builder.
   */
  public static class Builder {
    private String mode;
    private Long timeout;
    private RatelimitInputActionResponse response;

    private Builder(RatelimitInputAction ratelimitInputAction) {
      this.mode = ratelimitInputAction.mode;
      this.timeout = ratelimitInputAction.timeout;
      this.response = ratelimitInputAction.response;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mode the mode
     */
    public Builder(String mode) {
      this.mode = mode;
    }

    /**
     * Builds a RatelimitInputAction.
     *
     * @return the new RatelimitInputAction instance
     */
    public RatelimitInputAction build() {
      return new RatelimitInputAction(this);
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the RatelimitInputAction builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the RatelimitInputAction builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the response.
     *
     * @param response the response
     * @return the RatelimitInputAction builder
     */
    public Builder response(RatelimitInputActionResponse response) {
      this.response = response;
      return this;
    }
  }

  protected RatelimitInputAction(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mode,
      "mode cannot be null");
    mode = builder.mode;
    timeout = builder.timeout;
    response = builder.response;
  }

  /**
   * New builder.
   *
   * @return a RatelimitInputAction builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mode.
   *
   * The type of action to perform.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }

  /**
   * Gets the timeout.
   *
   * The time in seconds as an integer to perform the mitigation action. Must be the same or greater than the period.
   * This field is valid only when mode is "simulate" or "ban".
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }

  /**
   * Gets the response.
   *
   * Custom content-type and body to return, this overrides the custom error for the zone. This field is not required.
   * Omission will result in default HTML error page.This field is valid only when mode is "simulate" or "ban".
   *
   * @return the response
   */
  public RatelimitInputActionResponse response() {
    return response;
  }
}

