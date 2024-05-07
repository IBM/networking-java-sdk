/*
 * (C) Copyright IBM Corp. 2024.
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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * prefix filter.
 */
public class PrefixFilterCust extends GenericModel {

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
  protected String before;
  @SerializedName("created_at")
  protected Date createdAt;
  protected Long ge;
  protected String id;
  protected Long le;
  protected String prefix;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected PrefixFilterCust() { }

  /**
   * Gets the action.
   *
   * Whether or not this prefix filter should allow or deny prefixes matching this filter's prefix definition.
   *
   * @return the action
   */
  public String getAction() {
    return action;
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
  public String getBefore() {
    return before;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this prefix filter was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the ge.
   *
   * Defines the minimum matched prefix precision. If this field is non-zero then the filter will match all routes
   * within the 'prefix' that have a prefix length greater or equal to this value.
   *
   * This value can be zero, or a non-negative number greater than or equal to the prefix length of the filter's prefix
   * or less then or equal to 32. If this value is set to zero, the filter will not use the 'ge' route matching
   * behavior. If the 'le' value is non-zero the the 'ge' value must between the prefix length and the
   * 'le' value, inclusive.
   *
   * @return the ge
   */
  public Long getGe() {
    return ge;
  }

  /**
   * Gets the id.
   *
   * Prefix Filter identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
  public Long getLe() {
    return le;
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
  public String getPrefix() {
    return prefix;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that this prefix filter was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

