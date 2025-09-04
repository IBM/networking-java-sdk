/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.rulesets.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RuleDetails.
 */
public class RuleDetails extends GenericModel {

  protected String id;
  protected String version;
  protected String action;
  @SerializedName("action_parameters")
  protected ActionParameters actionParameters;
  protected List<String> categories;
  protected Boolean enabled;
  protected String description;
  protected String expression;
  protected String ref;
  protected Logging logging;
  @SerializedName("last_updated")
  protected String lastUpdated;

  protected RuleDetails() { }

  /**
   * Gets the id.
   *
   * unique ID of rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the version.
   *
   * The version of the rule.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the action.
   *
   * What happens when theres a match for the rule expression.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the actionParameters.
   *
   * @return the actionParameters
   */
  public ActionParameters getActionParameters() {
    return actionParameters;
  }

  /**
   * Gets the categories.
   *
   * List of categories for the rule.
   *
   * @return the categories
   */
  public List<String> getCategories() {
    return categories;
  }

  /**
   * Gets the enabled.
   *
   * Is the rule enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the description.
   *
   * description of the rule.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the expression.
   *
   * The expression defining which traffic will match the rule.
   *
   * @return the expression
   */
  public String getExpression() {
    return expression;
  }

  /**
   * Gets the ref.
   *
   * The reference of the rule (the rule ID by default).
   *
   * @return the ref
   */
  public String getRef() {
    return ref;
  }

  /**
   * Gets the logging.
   *
   * @return the logging
   */
  public Logging getLogging() {
    return logging;
  }

  /**
   * Gets the lastUpdated.
   *
   * The timestamp of when the resource was last modified.
   *
   * @return the lastUpdated
   */
  public String getLastUpdated() {
    return lastUpdated;
  }
}

