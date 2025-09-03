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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createZoneRulesetRule options.
 */
public class CreateZoneRulesetRuleOptions extends GenericModel {

  protected String rulesetId;
  protected String action;
  protected ActionParameters actionParameters;
  protected Ratelimit ratelimit;
  protected String description;
  protected Boolean enabled;
  protected String expression;
  protected String id;
  protected Logging logging;
  protected String ref;
  protected Position position;

  /**
   * Builder.
   */
  public static class Builder {
    private String rulesetId;
    private String action;
    private ActionParameters actionParameters;
    private Ratelimit ratelimit;
    private String description;
    private Boolean enabled;
    private String expression;
    private String id;
    private Logging logging;
    private String ref;
    private Position position;

    /**
     * Instantiates a new Builder from an existing CreateZoneRulesetRuleOptions instance.
     *
     * @param createZoneRulesetRuleOptions the instance to initialize the Builder with
     */
    private Builder(CreateZoneRulesetRuleOptions createZoneRulesetRuleOptions) {
      this.rulesetId = createZoneRulesetRuleOptions.rulesetId;
      this.action = createZoneRulesetRuleOptions.action;
      this.actionParameters = createZoneRulesetRuleOptions.actionParameters;
      this.ratelimit = createZoneRulesetRuleOptions.ratelimit;
      this.description = createZoneRulesetRuleOptions.description;
      this.enabled = createZoneRulesetRuleOptions.enabled;
      this.expression = createZoneRulesetRuleOptions.expression;
      this.id = createZoneRulesetRuleOptions.id;
      this.logging = createZoneRulesetRuleOptions.logging;
      this.ref = createZoneRulesetRuleOptions.ref;
      this.position = createZoneRulesetRuleOptions.position;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rulesetId the rulesetId
     */
    public Builder(String rulesetId) {
      this.rulesetId = rulesetId;
    }

    /**
     * Builds a CreateZoneRulesetRuleOptions.
     *
     * @return the new CreateZoneRulesetRuleOptions instance
     */
    public CreateZoneRulesetRuleOptions build() {
      return new CreateZoneRulesetRuleOptions(this);
    }

    /**
     * Set the rulesetId.
     *
     * @param rulesetId the rulesetId
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder rulesetId(String rulesetId) {
      this.rulesetId = rulesetId;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the actionParameters.
     *
     * @param actionParameters the actionParameters
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder actionParameters(ActionParameters actionParameters) {
      this.actionParameters = actionParameters;
      return this;
    }

    /**
     * Set the ratelimit.
     *
     * @param ratelimit the ratelimit
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder ratelimit(Ratelimit ratelimit) {
      this.ratelimit = ratelimit;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the expression.
     *
     * @param expression the expression
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder expression(String expression) {
      this.expression = expression;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the logging.
     *
     * @param logging the logging
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder logging(Logging logging) {
      this.logging = logging;
      return this;
    }

    /**
     * Set the ref.
     *
     * @param ref the ref
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder ref(String ref) {
      this.ref = ref;
      return this;
    }

    /**
     * Set the position.
     *
     * @param position the position
     * @return the CreateZoneRulesetRuleOptions builder
     */
    public Builder position(Position position) {
      this.position = position;
      return this;
    }
  }

  protected CreateZoneRulesetRuleOptions() { }

  protected CreateZoneRulesetRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.rulesetId,
      "rulesetId cannot be empty");
    rulesetId = builder.rulesetId;
    action = builder.action;
    actionParameters = builder.actionParameters;
    ratelimit = builder.ratelimit;
    description = builder.description;
    enabled = builder.enabled;
    expression = builder.expression;
    id = builder.id;
    logging = builder.logging;
    ref = builder.ref;
    position = builder.position;
  }

  /**
   * New builder.
   *
   * @return a CreateZoneRulesetRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rulesetId.
   *
   * ID of a specific ruleset.
   *
   * @return the rulesetId
   */
  public String rulesetId() {
    return rulesetId;
  }

  /**
   * Gets the action.
   *
   * What happens when theres a match for the rule expression.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the actionParameters.
   *
   * @return the actionParameters
   */
  public ActionParameters actionParameters() {
    return actionParameters;
  }

  /**
   * Gets the ratelimit.
   *
   * @return the ratelimit
   */
  public Ratelimit ratelimit() {
    return ratelimit;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the expression.
   *
   * The expression defining which traffic will match the rule.
   *
   * @return the expression
   */
  public String expression() {
    return expression;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the logging.
   *
   * @return the logging
   */
  public Logging logging() {
    return logging;
  }

  /**
   * Gets the ref.
   *
   * The reference of the rule (the rule ID by default).
   *
   * @return the ref
   */
  public String ref() {
    return ref;
  }

  /**
   * Gets the position.
   *
   * @return the position
   */
  public Position position() {
    return position;
  }
}

