/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The route filter create template within the Direct Link gateway create template.
 */
public class GatewayTemplateRouteFilter extends GenericModel {

  /**
   * Determines whether routes that match the prefix-set will be allowed (permit) or rejected (deny) through the filter.
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
     * Instantiates a new Builder from an existing GatewayTemplateRouteFilter instance.
     *
     * @param gatewayTemplateRouteFilter the instance to initialize the Builder with
     */
    private Builder(GatewayTemplateRouteFilter gatewayTemplateRouteFilter) {
      this.action = gatewayTemplateRouteFilter.action;
      this.ge = gatewayTemplateRouteFilter.ge;
      this.le = gatewayTemplateRouteFilter.le;
      this.prefix = gatewayTemplateRouteFilter.prefix;
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
     * Builds a GatewayTemplateRouteFilter.
     *
     * @return the new GatewayTemplateRouteFilter instance
     */
    public GatewayTemplateRouteFilter build() {
      return new GatewayTemplateRouteFilter(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the GatewayTemplateRouteFilter builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the GatewayTemplateRouteFilter builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the GatewayTemplateRouteFilter builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the GatewayTemplateRouteFilter builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected GatewayTemplateRouteFilter() { }

  protected GatewayTemplateRouteFilter(Builder builder) {
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
   * @return a GatewayTemplateRouteFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * Determines whether routes that match the prefix-set will be allowed (permit) or rejected (deny) through the filter.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the ge.
   *
   * The minimum matching length of the prefix-set (mnemonic for greater than or equal to).
   *
   * @return the ge
   */
  public Long ge() {
    return ge;
  }

  /**
   * Gets the le.
   *
   * The maximum matching length of the prefix-set (mnemonic for less than or equal to).
   *
   * @return the le
   */
  public Long le() {
    return le;
  }

  /**
   * Gets the prefix.
   *
   * IP prefix representing an address and mask length of the prefix-set.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }
}

