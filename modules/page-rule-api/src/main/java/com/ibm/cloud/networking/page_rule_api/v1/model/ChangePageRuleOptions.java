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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The changePageRule options.
 */
public class ChangePageRuleOptions extends GenericModel {

  protected String ruleId;
  protected List<TargetsItem> targets;
  protected List<Object> actions;
  protected Long priority;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String ruleId;
    private List<TargetsItem> targets;
    private List<Object> actions;
    private Long priority;
    private String status;

    private Builder(ChangePageRuleOptions changePageRuleOptions) {
      this.ruleId = changePageRuleOptions.ruleId;
      this.targets = changePageRuleOptions.targets;
      this.actions = changePageRuleOptions.actions;
      this.priority = changePageRuleOptions.priority;
      this.status = changePageRuleOptions.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ruleId the ruleId
     */
    public Builder(String ruleId) {
      this.ruleId = ruleId;
    }

    /**
     * Builds a ChangePageRuleOptions.
     *
     * @return the new ChangePageRuleOptions instance
     */
    public ChangePageRuleOptions build() {
      return new ChangePageRuleOptions(this);
    }

    /**
     * Adds an targets to targets.
     *
     * @param targets the new targets
     * @return the ChangePageRuleOptions builder
     */
    public Builder addTargets(TargetsItem targets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(targets,
        "targets cannot be null");
      if (this.targets == null) {
        this.targets = new ArrayList<TargetsItem>();
      }
      this.targets.add(targets);
      return this;
    }

    /**
     * Adds an actions to actions.
     *
     * @param actions the new actions
     * @return the ChangePageRuleOptions builder
     */
    public Builder addActions(Object actions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(actions,
        "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<Object>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the ChangePageRuleOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }

    /**
     * Set the targets.
     * Existing targets will be replaced.
     *
     * @param targets the targets
     * @return the ChangePageRuleOptions builder
     */
    public Builder targets(List<TargetsItem> targets) {
      this.targets = targets;
      return this;
    }

    /**
     * Set the actions.
     * Existing actions will be replaced.
     *
     * @param actions the actions
     * @return the ChangePageRuleOptions builder
     */
    public Builder actions(List<Object> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the ChangePageRuleOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ChangePageRuleOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected ChangePageRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ruleId,
      "ruleId cannot be empty");
    ruleId = builder.ruleId;
    targets = builder.targets;
    actions = builder.actions;
    priority = builder.priority;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a ChangePageRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ruleId.
   *
   * rule id.
   *
   * @return the ruleId
   */
  public String ruleId() {
    return ruleId;
  }

  /**
   * Gets the targets.
   *
   * targets.
   *
   * @return the targets
   */
  public List<TargetsItem> targets() {
    return targets;
  }

  /**
   * Gets the actions.
   *
   * actions.
   *
   * @return the actions
   */
  public List<Object> actions() {
    return actions;
  }

  /**
   * Gets the priority.
   *
   * priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the status.
   *
   * status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

