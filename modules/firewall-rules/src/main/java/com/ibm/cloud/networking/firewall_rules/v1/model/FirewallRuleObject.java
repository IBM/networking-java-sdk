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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * FirewallRuleObject.
 */
public class FirewallRuleObject extends GenericModel {

  /**
   * The firewall action to perform, "log" action is only available for enterprise plan instances.
   */
  public interface Action {
    /** log. */
    String LOG = "log";
    /** allow. */
    String ALLOW = "allow";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
    /** block. */
    String BLOCK = "block";
  }

  protected String id;
  protected Boolean paused;
  protected String description;
  protected String action;
  protected FirewallRuleObjectFilter filter;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;

  /**
   * Gets the id.
   *
   * Identifier of the firewall rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the paused.
   *
   * Indicates if the firewall rule is active.
   *
   * @return the paused
   */
  public Boolean isPaused() {
    return paused;
  }

  /**
   * Gets the description.
   *
   * To briefly describe the firewall rule, omitted from object if empty.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the action.
   *
   * The firewall action to perform, "log" action is only available for enterprise plan instances.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the filter.
   *
   * An existing filter.
   *
   * @return the filter
   */
  public FirewallRuleObjectFilter getFilter() {
    return filter;
  }

  /**
   * Gets the createdOn.
   *
   * The creation date-time of the filter.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The modification date-time of the filter.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }
}

