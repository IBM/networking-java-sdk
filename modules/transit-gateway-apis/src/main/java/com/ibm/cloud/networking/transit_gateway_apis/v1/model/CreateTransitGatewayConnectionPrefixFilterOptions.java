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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayConnectionPrefixFilter options.
 */
public class CreateTransitGatewayConnectionPrefixFilterOptions extends GenericModel {

  /**
   * Whether to permit or deny prefix filter.
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
   * Whether to permit or deny prefix filter.
   *
   * @return the action
   */
  public String action() {
    return action;
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

  /**
   * Gets the before.
   *
   * Identifier of prefix filter to handle the ordering and follow semantics:
   * - When a filter reference another filter in it's before field, then the filter making the reference is applied
   * before
   *   the referenced filter. For example: if filter A references filter B in its before field, A is applied before B.
   * - When a new filter is added that has the same before as an existing filter, then the older filter will have its
   * before
   *   field updated to point to the new filter. Starting with the above example: if filter C is added and it references
   * B in its
   *   before field, then A's before field should be modified to point to C, so the order of application would be A, C
   * and finally B.
   * - A filter that has an empty before reference will be applied last (though the date order mentioned above will
   * still apply).
   *   So continuing the above examples, if filter B has an empty before field, then it will be applied last, but if
   * filter D
   *   is created with an empty before field, then B's before field will be modified to point to D, so B will be applied
   * before D.
   *
   * @return the before
   */
  public String before() {
    return before;
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
}

