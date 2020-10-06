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
package com.ibm.cloud.networking.user_agent_blocking_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * user agent rule object.
 */
public class UseragentRuleObject extends GenericModel {

  /**
   * The type of action to perform.
   */
  public interface Mode {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  protected String id;
  protected Boolean paused;
  protected String description;
  protected String mode;
  protected UseragentRuleObjectConfiguration configuration;

  /**
   * Gets the id.
   *
   * Identifier of the user-agent blocking rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the paused.
   *
   * Whether this user-agent rule is currently disabled.
   *
   * @return the paused
   */
  public Boolean isPaused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * Some useful information about this rule to help identify the purpose of it.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

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
   * Gets the configuration.
   *
   * Target/Value pair to use for this rule. The value is the exact UserAgent to match.
   *
   * @return the configuration
   */
  public UseragentRuleObjectConfiguration getConfiguration() {
    return configuration;
  }
}

