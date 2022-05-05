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
 * The createForwardingRule options.
 */
public class CreateForwardingRuleOptions extends GenericModel {

  /**
   * Type of the forwarding rule.
   */
  public interface Type {
    /** zone. */
    String ZONE = "zone";
  }

  protected String instanceId;
  protected String resolverId;
  protected String description;
  protected String type;
  protected String match;
  protected List<String> forwardTo;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String description;
    private String type;
    private String match;
    private List<String> forwardTo;
    private String xCorrelationId;

    private Builder(CreateForwardingRuleOptions createForwardingRuleOptions) {
      this.instanceId = createForwardingRuleOptions.instanceId;
      this.resolverId = createForwardingRuleOptions.resolverId;
      this.description = createForwardingRuleOptions.description;
      this.type = createForwardingRuleOptions.type;
      this.match = createForwardingRuleOptions.match;
      this.forwardTo = createForwardingRuleOptions.forwardTo;
      this.xCorrelationId = createForwardingRuleOptions.xCorrelationId;
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
     */
    public Builder(String instanceId, String resolverId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
    }

    /**
     * Builds a CreateForwardingRuleOptions.
     *
     * @return the new CreateForwardingRuleOptions instance
     */
    public CreateForwardingRuleOptions build() {
      return new CreateForwardingRuleOptions(this);
    }

    /**
     * Adds an forwardTo to forwardTo.
     *
     * @param forwardTo the new forwardTo
     * @return the CreateForwardingRuleOptions builder
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
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the CreateForwardingRuleOptions builder
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
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder forwardTo(List<String> forwardTo) {
      this.forwardTo = forwardTo;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreateForwardingRuleOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreateForwardingRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    description = builder.description;
    type = builder.type;
    match = builder.match;
    forwardTo = builder.forwardTo;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreateForwardingRuleOptions builder
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
   * Gets the type.
   *
   * Type of the forwarding rule.
   *
   * @return the type
   */
  public String type() {
    return type;
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

