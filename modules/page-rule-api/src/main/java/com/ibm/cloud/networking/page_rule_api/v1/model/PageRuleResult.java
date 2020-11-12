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
package com.ibm.cloud.networking.page_rule_api.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * page rule result.
 */
public class PageRuleResult extends GenericModel {

  protected String id;
  protected List<TargetsItem> targets;
  protected List<Object> actions;
  protected Long priority;
  protected String status;
  @SerializedName("modified_on")
  protected String modifiedOn;
  @SerializedName("created_on")
  protected String createdOn;

  /**
   * Gets the id.
   *
   * identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the targets.
   *
   * targets.
   *
   * @return the targets
   */
  public List<TargetsItem> getTargets() {
    return targets;
  }

  /**
   * Gets the actions.
   *
   * actions.
   *
   * @return the actions
   */
  public List<Object> getActions() {
    return actions;
  }

  /**
   * Gets the priority.
   *
   * priority.
   *
   * @return the priority
   */
  public Long getPriority() {
    return priority;
  }

  /**
   * Gets the status.
   *
   * status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the modifiedOn.
   *
   * modified date.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the createdOn.
   *
   * created date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }
}

