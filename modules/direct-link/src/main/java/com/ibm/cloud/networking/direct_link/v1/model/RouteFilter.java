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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Route filter.
 */
public class RouteFilter extends GenericModel {

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
  @SerializedName("created_at")
  protected Date createdAt;
  protected Long ge;
  protected String id;
  protected Long le;
  protected String prefix;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected RouteFilter() { }

  /**
   * Gets the action.
   *
   * Determines whether routes that match the prefix-set will be allowed (permit) or rejected (deny) through the filter.
   *
   * @return the action
   */
  public String getAction() {
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
  public String getBefore() {
    return before;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time the route filter was created in ISO 8601 format.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the ge.
   *
   * The minimum matching length of the prefix-set (mnemonic for greater than or equal to).
   *
   * @return the ge
   */
  public Long getGe() {
    return ge;
  }

  /**
   * Gets the id.
   *
   * The identifier of a route filter.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the le.
   *
   * The maximum matching length of the prefix-set (mnemonic for less than or equal to).
   *
   * @return the le
   */
  public Long getLe() {
    return le;
  }

  /**
   * Gets the prefix.
   *
   * IP prefix representing an address and mask length of the prefix-set.
   *
   * @return the prefix
   */
  public String getPrefix() {
    return prefix;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time the route filter was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

