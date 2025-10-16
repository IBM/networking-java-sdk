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
 * A prefix filter update template.
 */
public class PrefixFilterPut extends GenericModel {

  /**
   * Whether or not this prefix filter should allow or deny prefixes matching this filter's prefix definition.
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
     * Instantiates a new Builder from an existing PrefixFilterPut instance.
     *
     * @param prefixFilterPut the instance to initialize the Builder with
     */
    private Builder(PrefixFilterPut prefixFilterPut) {
      this.action = prefixFilterPut.action;
      this.ge = prefixFilterPut.ge;
      this.le = prefixFilterPut.le;
      this.prefix = prefixFilterPut.prefix;
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
     * Builds a PrefixFilterPut.
     *
     * @return the new PrefixFilterPut instance
     */
    public PrefixFilterPut build() {
      return new PrefixFilterPut(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the PrefixFilterPut builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the PrefixFilterPut builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the PrefixFilterPut builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the PrefixFilterPut builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected PrefixFilterPut() { }

  protected PrefixFilterPut(Builder builder) {
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
   * @return a PrefixFilterPut builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the ge.
   *
   * Defines the minimum matched prefix precision. If this field is non-zero then the filter will match all routes
   * within the `prefix` that have a prefix length greater or equal to this value.
   *
   * This value can be zero, or a non-negative number greater than or equal to the prefix length of the filter's prefix
   * or less then or equal to 32. If this value is set to zero, the filter will not use the `ge` route matching
   * behavior. If the `le` value is non-zero the the `ge` value must between the prefix length and the
   * `le` value, inclusive.
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
   * within the `prefix` that have a prefix length less than or equal to this value.
   *
   * This value can be zero, or a non-negative number greater than or equal to the prefix length of the filter's prefix
   * or less then or equal to 32. If this value is set to zero, the filter will not use the `le` route matching
   * behavior. If the `ge` value is non-zero the the `le` value must between the `ge` value and 32, inclusive.
   *
   * @return the le
   */
  public Long le() {
    return le;
  }

  /**
   * Gets the prefix.
   *
   * The IPv4 Prefix to be matched by this filter. If both the `le` and `ge` are zero, then this filter will only apply
   * to routes that exactly match this prefix, while a non-zero value for either `le` or `ge`, this filter can apply to
   * multiple routes with different prefix lengths, but will still only apply to prefixes contained in the address space
   * defined by `prefix`.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }
}

