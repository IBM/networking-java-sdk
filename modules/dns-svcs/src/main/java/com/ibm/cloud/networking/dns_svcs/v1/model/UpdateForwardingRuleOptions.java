/*
 * (C) Copyright IBM Corp. 2022.
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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateForwardingRule options.
 */
public class UpdateForwardingRuleOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String ruleId;
  protected String description;
  protected String match;
  protected List<String> forwardTo;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String ruleId;
    private String description;
    private String match;
    private List<String> forwardTo;
    private String xCorrelationId;

    private Builder(UpdateForwardingRuleOptions updateForwardingRuleOptions) {
      this.instanceId = updateForwardingRuleOptions.instanceId;
      this.resolverId = updateForwardingRuleOptions.resolverId;
      this.ruleId = updateForwardingRuleOptions.ruleId;
      this.description = updateForwardingRuleOptions.description;
      this.match = updateForwardingRuleOptions.match;
      this.forwardTo = updateForwardingRuleOptions.forwardTo;
      this.xCorrelationId = updateForwardingRuleOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param resolverId the resolverId
     * @param ruleId the ruleId
     */
    public Builder(String instanceId, String resolverId, String ruleId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
      this.ruleId = ruleId;
    }

    /**
     * Builds a UpdateForwardingRuleOptions.
     *
     * @return the new UpdateForwardingRuleOptions instance
     */
    public UpdateForwardingRuleOptions build() {
      return new UpdateForwardingRuleOptions(this);
    }

    /**
     * Adds an forwardTo to forwardTo.
     *
     * @param forwardTo the new forwardTo
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder addForwardTo(String forwardTo) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(forwardTo,
        "forwardTo cannot be null");
      if (this.forwardTo == null) {
        this.forwardTo = new ArrayList<String>();
      }
      this.forwardTo.add(forwardTo);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }

    /**
     * Set the forwardTo.
     * Existing forwardTo will be replaced.
     *
     * @param forwardTo the forwardTo
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder forwardTo(List<String> forwardTo) {
      this.forwardTo = forwardTo;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateForwardingRuleOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateForwardingRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ruleId,
      "ruleId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    ruleId = builder.ruleId;
    description = builder.description;
    match = builder.match;
    forwardTo = builder.forwardTo;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateForwardingRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the resolverId.
   *
   * The unique identifier of a custom resolver.
   *
   * @return the resolverId
   */
  public String resolverId() {
    return resolverId;
  }

  /**
   * Gets the ruleId.
   *
   * The unique identifier of a rule.
   *
   * @return the ruleId
   */
  public String ruleId() {
    return ruleId;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the forwarding rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the match.
   *
   * The matching zone or hostname.
   *
   * @return the match
   */
  public String match() {
    return match;
  }

  /**
   * Gets the forwardTo.
   *
   * The upstream DNS servers will be forwarded to.
   *
   * @return the forwardTo
   */
  public List<String> forwardTo() {
    return forwardTo;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

