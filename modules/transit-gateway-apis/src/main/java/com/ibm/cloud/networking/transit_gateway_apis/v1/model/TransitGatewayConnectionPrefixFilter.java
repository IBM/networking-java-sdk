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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A prefix filter for a Transit Gateway connection.
 */
public class TransitGatewayConnectionPrefixFilter extends GenericModel {

  /**
   * Whether to permit or deny prefix filter.
   */
  public interface Action {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  protected String action;
  protected Long ge;
  protected Long le;
  protected String prefix;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private Long ge;
    private Long le;
    private String prefix;

    /**
     * Instantiates a new Builder from an existing TransitGatewayConnectionPrefixFilter instance.
     *
     * @param transitGatewayConnectionPrefixFilter the instance to initialize the Builder with
     */
    private Builder(TransitGatewayConnectionPrefixFilter transitGatewayConnectionPrefixFilter) {
      this.action = transitGatewayConnectionPrefixFilter.action;
      this.ge = transitGatewayConnectionPrefixFilter.ge;
      this.le = transitGatewayConnectionPrefixFilter.le;
      this.prefix = transitGatewayConnectionPrefixFilter.prefix;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     * @param prefix the prefix
     */
    public Builder(String action, String prefix) {
      this.action = action;
      this.prefix = prefix;
    }

    /**
     * Builds a TransitGatewayConnectionPrefixFilter.
     *
     * @return the new TransitGatewayConnectionPrefixFilter instance
     */
    public TransitGatewayConnectionPrefixFilter build() {
      return new TransitGatewayConnectionPrefixFilter(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the TransitGatewayConnectionPrefixFilter builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the TransitGatewayConnectionPrefixFilter builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the TransitGatewayConnectionPrefixFilter builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the TransitGatewayConnectionPrefixFilter builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected TransitGatewayConnectionPrefixFilter() { }

  protected TransitGatewayConnectionPrefixFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefix,
      "prefix cannot be null");
    action = builder.action;
    ge = builder.ge;
    le = builder.le;
    prefix = builder.prefix;
  }

  /**
   * New builder.
   *
   * @return a TransitGatewayConnectionPrefixFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * Whether to permit or deny prefix filter.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the ge.
   *
   * IP Prefix GE.
   *
   * @return the ge
   */
  public Long ge() {
    return ge;
  }

  /**
   * Gets the le.
   *
   * IP Prefix LE.
   *
   * @return the le
   */
  public Long le() {
    return le;
  }

  /**
   * Gets the prefix.
   *
   * IP Prefix.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }
}

