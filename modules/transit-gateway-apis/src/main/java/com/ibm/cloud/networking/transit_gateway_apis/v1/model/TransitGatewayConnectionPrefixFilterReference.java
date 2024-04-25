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
 * A prefix filter reference object for a Transit Gateway connection.
 */
public class TransitGatewayConnectionPrefixFilterReference extends GenericModel {

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
  protected String before;
  @SerializedName("created_at")
  protected Date createdAt;
  protected Long ge;
  protected String id;
  protected Long le;
  protected String prefix;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected TransitGatewayConnectionPrefixFilterReference() { }

  /**
   * Gets the action.
   *
   * Whether to permit or deny prefix filter.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the before.
   *
   * Identifier of prefix filter that handles the ordering and follow semantics:
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
   * IP Prefix GE.
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
   * IP Prefix LE.
   *
   * @return the le
   */
  public Long getLe() {
    return le;
  }

  /**
   * Gets the prefix.
   *
   * IP Prefix.
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

