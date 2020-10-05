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
 * Target/Value pair to use for this rule. The value is the exact UserAgent to match.
 */
public class UseragentRuleObjectConfiguration extends GenericModel {

  /**
   * properties.
   */
  public interface Target {
    /** ua. */
    String UA = "ua";
  }

  protected String target;
  protected String value;

  /**
   * Gets the target.
   *
   * properties.
   *
   * @return the target
   */
  public String getTarget() {
    return target;
  }

  /**
   * Gets the value.
   *
   * The exact UserAgent string to match with this rule.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

