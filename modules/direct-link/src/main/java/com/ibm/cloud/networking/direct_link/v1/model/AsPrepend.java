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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Gateway AS Prepend object.
 */
public class AsPrepend extends GenericModel {

  /**
   * Route type this AS Prepend applies to.
   */
  public interface Policy {
    /** import. */
    String X_IMPORT = "import";
    /** export. */
    String EXPORT = "export";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  protected Long length;
  protected String policy;
  protected String prefix;
  @SerializedName("specific_prefixes")
  protected List<String> specificPrefixes;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected AsPrepend() { }

  /**
   * Gets the createdAt.
   *
   * The date and time resource was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this AS Prepend.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the length.
   *
   * Number of times the ASN to appended to the AS Path.
   *
   * @return the length
   */
  public Long getLength() {
    return length;
  }

  /**
   * Gets the policy.
   *
   * Route type this AS Prepend applies to.
   *
   * @return the policy
   */
  public String getPolicy() {
    return policy;
  }

  /**
   * Gets the prefix.
   *
   * Comma separated list of prefixes this AS Prepend applies to.  If empty, this applies to all prefixes.
   *
   * @return the prefix
   */
  public String getPrefix() {
    return prefix;
  }

  /**
   * Gets the specificPrefixes.
   *
   * Array of prefixes this AS Prepend applies to. This parameter is not returned when AS Prepend applies to all
   * prefixes.  Note that ordering is not significant and may differ from request order.
   *
   * @return the specificPrefixes
   */
  public List<String> getSpecificPrefixes() {
    return specificPrefixes;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time resource was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

