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
 * The updateXfrRule options.
 */
public class UpdateXfrRuleOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String ruleId;
  protected String description;
  protected Boolean enabled;
  protected List<XfrRuleInputTransferFromItem> transferFrom;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String ruleId;
    private String description;
    private Boolean enabled;
    private List<XfrRuleInputTransferFromItem> transferFrom;
    private String xCorrelationId;

    private Builder(UpdateXfrRuleOptions updateXfrRuleOptions) {
      this.instanceId = updateXfrRuleOptions.instanceId;
      this.resolverId = updateXfrRuleOptions.resolverId;
      this.ruleId = updateXfrRuleOptions.ruleId;
      this.description = updateXfrRuleOptions.description;
      this.enabled = updateXfrRuleOptions.enabled;
      this.transferFrom = updateXfrRuleOptions.transferFrom;
      this.xCorrelationId = updateXfrRuleOptions.xCorrelationId;
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
     * Builds a UpdateXfrRuleOptions.
     *
     * @return the new UpdateXfrRuleOptions instance
     */
    public UpdateXfrRuleOptions build() {
      return new UpdateXfrRuleOptions(this);
    }

    /**
     * Adds an transferFrom to transferFrom.
     *
     * @param transferFrom the new transferFrom
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder addTransferFrom(XfrRuleInputTransferFromItem transferFrom) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(transferFrom,
        "transferFrom cannot be null");
      if (this.transferFrom == null) {
        this.transferFrom = new ArrayList<XfrRuleInputTransferFromItem>();
      }
      this.transferFrom.add(transferFrom);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the ruleId.
     *
     * @param ruleId the ruleId
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder ruleId(String ruleId) {
      this.ruleId = ruleId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the transferFrom.
     * Existing transferFrom will be replaced.
     *
     * @param transferFrom the transferFrom
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder transferFrom(List<XfrRuleInputTransferFromItem> transferFrom) {
      this.transferFrom = transferFrom;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateXfrRuleOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateXfrRuleOptions(Builder builder) {
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
    enabled = builder.enabled;
    transferFrom = builder.transferFrom;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateXfrRuleOptions builder
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
   * Descriptive text of the XFR rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the enabled.
   *
   * Enable/Disable XFR rule.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the transferFrom.
   *
   * The source configuration of XFR input.
   *
   * @return the transferFrom
   */
  public List<XfrRuleInputTransferFromItem> transferFrom() {
    return transferFrom;
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

