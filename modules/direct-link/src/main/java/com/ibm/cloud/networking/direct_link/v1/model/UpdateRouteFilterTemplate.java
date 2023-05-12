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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * The route filter update template.
 */
public class UpdateRouteFilterTemplate extends GenericModel {

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
  protected String before;
  protected Long ge;
  protected Long le;
  protected String prefix;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String before;
    private Long ge;
    private Long le;
    private String prefix;

    /**
     * Instantiates a new Builder from an existing UpdateRouteFilterTemplate instance.
     *
     * @param updateRouteFilterTemplate the instance to initialize the Builder with
     */
    private Builder(UpdateRouteFilterTemplate updateRouteFilterTemplate) {
      this.action = updateRouteFilterTemplate.action;
      this.before = updateRouteFilterTemplate.before;
      this.ge = updateRouteFilterTemplate.ge;
      this.le = updateRouteFilterTemplate.le;
      this.prefix = updateRouteFilterTemplate.prefix;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateRouteFilterTemplate.
     *
     * @return the new UpdateRouteFilterTemplate instance
     */
    public UpdateRouteFilterTemplate build() {
      return new UpdateRouteFilterTemplate(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateRouteFilterTemplate builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the UpdateRouteFilterTemplate builder
     */
    public Builder before(String before) {
      this.before = before;
      return this;
    }

    /**
     * Set the ge.
     *
     * @param ge the ge
     * @return the UpdateRouteFilterTemplate builder
     */
    public Builder ge(long ge) {
      this.ge = ge;
      return this;
    }

    /**
     * Set the le.
     *
     * @param le the le
     * @return the UpdateRouteFilterTemplate builder
     */
    public Builder le(long le) {
      this.le = le;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the UpdateRouteFilterTemplate builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected UpdateRouteFilterTemplate() { }

  protected UpdateRouteFilterTemplate(Builder builder) {
    action = builder.action;
    before = builder.before;
    ge = builder.ge;
    le = builder.le;
    prefix = builder.prefix;
  }

  /**
   * New builder.
   *
   * @return a UpdateRouteFilterTemplate builder
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
   * Gets the before.
   *
   * Identifier of the next route filter considered if a route does not match the current filter. This property builds
   * the ordering among route filters and follows semantics:
   * - When before is an identifier of a route filter that exists and is in the same collection, a route will first
   * attempt to match on the current filter before preceding to the filter referenced in this property.
   * - When a filter is created with before that matches another filter in the same collection, the existing filter will
   * take precedence. The before of the existing filter will be updated to refer to the newly created filter. The newly
   * created filter will refer to the route filter identified by the provided before.
   * - When a filter is created without a before, it takes the lowest precedence. The existing filter of lowest
   * precedence will be updated to refer to the newly created filter.
   *
   * @return the before
   */
  public String before() {
    return before;
  }

  /**
   * Gets the ge.
   *
   * The minimum matching length of the prefix-set (mnemonic for greater than or equal to).
   *
   * To clear the minimum matching length of the filter, patch the value to `0`.
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
   * To clear the maximum matching length of the filter, patch the value to `0`.
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

  /**
   * Construct a JSON merge-patch from the UpdateRouteFilterTemplate.
   *
   * Note that properties of the UpdateRouteFilterTemplate with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the UpdateRouteFilterTemplate
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

