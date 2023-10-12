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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayConnectionPrefixFilter options.
 */
public class CreateTransitGatewayConnectionPrefixFilterOptions extends GenericModel {

  /**
   * Whether or not this prefix filter should allow or deny prefixes matching this filter's prefix definition.
   */
  public interface Action {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  protected String transitGatewayId;
  protected String id;
  protected String action;
  protected String prefix;
  protected String before;
  protected Long ge;
  protected Long le;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String action;
    private String prefix;
    private String before;
    private Long ge;
    private Long le;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayConnectionPrefixFilterOptions instance.
     *
     * @param createTransitGatewayConnectionPrefixFilterOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayConnectionPrefixFilterOptions createTransitGatewayConnectionPrefixFilterOptions) {
      this.transitGatewayId = createTransitGatewayConnectionPrefixFilterOptions.transitGatewayId;
      this.id = createTransitGatewayConnectionPrefixFilterOptions.id;
      this.action = createTransitGatewayConnectionPrefixFilterOptions.action;
      this.prefix = createTransitGatewayConnectionPrefixFilterOptions.prefix;
      this.before = createTransitGatewayConnectionPrefixFilterOptions.before;
      this.ge = createTransitGatewayConnectionPrefixFilterOptions.ge;
      this.le = createTransitGatewayConnectionPrefixFilterOptions.le;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param transitGatewayId the transitGatewayId
     * @param id the id
     * @param action the action
     * @param prefix the prefix
     */
    public Builder(String transitGatewayId, String id, String action, String prefix) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.action = action;
      this.prefix = prefix;
    }

    /**
     * Builds a CreateTransitGatewayConnectionPrefixFilterOptions.
     *
     * @return the new CreateTransitGatewayConnectionPrefixFilterOptions instance
     */
    public CreateTransitGatewayConnectionPrefixFilterOptions build() {
      return new CreateTransitGatewayConnectionPrefixFilterOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder before(String before) {
      this.before = before;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the CreateTransitGatewayConnectionPrefixFilterOptions builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }
  }

  protected CreateTransitGatewayConnectionPrefixFilterOptions() { }

  protected CreateTransitGatewayConnectionPrefixFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefix,
      "prefix cannot be null");
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    action = builder.action;
    prefix = builder.prefix;
    before = builder.before;
    ge = builder.ge;
    le = builder.le;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayConnectionPrefixFilterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the transitGatewayId.
   *
   * The Transit Gateway identifier.
   *
   * @return the transitGatewayId
   */
  public String transitGatewayId() {
    return transitGatewayId;
  }

  /**
   * Gets the id.
   *
   * The connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the action.
   *
   * Whether or not this prefix filter should allow or deny prefixes matching this filter's prefix definition.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the prefix.
   *
   * The IPv4 Prefix to be matched by this filter. If both the 'le' and 'ge' are zero, then this filter will only apply
   * to routes that exactly match this prefix, while a non-zero value for either 'le' or 'ge', this filter can apply to
   * multiple routes with different prefix lengths, but will still only apply to prefixes contained in the address space
   * defined by 'prefix'.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }

  /**
   * Gets the before.
   *
   * A reference to the prefix filter that will be the next filter applied to the Transit Gateway connection.
   *
   * If this field is blank, this prefix filter will be the last rule applied before the connection's default rule.
   *
   * When a prefix filter is created with the same before field as an existing prefix filter, the existing filter will
   * be applied before the new filter, and the existing filter's before field will be updated accordingly.
   *
   * @return the before
   */
  public String before() {
    return before;
  }

  /**
   * Gets the ge.
   *
   * Defines the minimum matched prefix precision. If this field is non-zero then the filter will match all routes
   * within the 'prefix' that have a prefix length greater than or equal to this value.
   *
   * This value can be zero, or a non-negative number greater than or equal to the prefix length of the filter's prefix
   * or less then or equal to 32. If this value is set to zero, the filter will not use the 'ge' route matching
   * behavior. If the 'le' value is non-zero the the 'ge' value must between the prefix length and the
   * 'le' value, inclusive.
   *
   * @return the ge
   */
  public Long ge() {
    return ge;
  }

  /**
   * Gets the le.
   *
   * Defines the maximum matched prefix precision. If this field is non-zero then the filter will match all routes
   * within the 'prefix' that have a prefix length less than or equal to this value.
   *
   * This value can be zero, or a non-negative number greater than or equal to the prefix length of the filter's prefix
   * or less then or equal to 32. If this value is set to zero, the filter will not use the 'le' route matching
   * behavior. If the 'ge' value is non-zero the the 'le' value must between the 'ge' value and 32, inclusive.
   *
   * @return the le
   */
  public Long le() {
    return le;
  }
}

