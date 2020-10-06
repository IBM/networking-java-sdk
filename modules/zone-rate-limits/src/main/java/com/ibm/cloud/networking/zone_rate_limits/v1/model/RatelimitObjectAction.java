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
public class RatelimitObjectAction extends GenericModel {

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
  protected RatelimitObjectActionResponse response;

  /**
   * Gets the mode.
   *
   * The type of action to perform.
   *
   * @return the mode
   */
  public String getMode() {
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
  public Long getTimeout() {
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
  public RatelimitObjectActionResponse getResponse() {
    return response;
  }
}

