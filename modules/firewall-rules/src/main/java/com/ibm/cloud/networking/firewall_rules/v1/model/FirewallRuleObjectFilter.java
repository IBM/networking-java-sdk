/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.firewall_rules.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An existing filter.
 */
public class FirewallRuleObjectFilter extends GenericModel {

  protected String id;
  protected Boolean paused;
  protected String description;
  protected String expression;

  /**
   * Gets the id.
   *
   * Identifier of the filter.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the paused.
   *
   * Indicates if the filter is active.
   *
   * @return the paused
   */
  public Boolean isPaused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * To briefly describe the filter, omitted from object if empty.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the expression.
   *
   * A filter expression.
   *
   * @return the expression
   */
  public String getExpression() {
    return expression;
  }
}

