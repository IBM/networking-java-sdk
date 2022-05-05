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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * forwarding rule details.
 */
public class ForwardingRule extends GenericModel {

  /**
   * Type of the forwarding rule.
   */
  public interface Type {
    /** zone. */
    String ZONE = "zone";
    /** default. */
    String X_DEFAULT = "default";
  }

  protected String id;
  protected String description;
  protected String type;
  protected String match;
  @SerializedName("forward_to")
  protected List<String> forwardTo;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;

  /**
   * Gets the id.
   *
   * Identifier of the forwarding rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the forwarding rule.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * Type of the forwarding rule.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the match.
   *
   * The matching zone or hostname.
   *
   * @return the match
   */
  public String getMatch() {
    return match;
  }

  /**
   * Gets the forwardTo.
   *
   * The upstream DNS servers will be forwarded to.
   *
   * @return the forwardTo
   */
  public List<String> getForwardTo() {
    return forwardTo;
  }

  /**
   * Gets the createdOn.
   *
   * the time when a forwarding rule is created, RFC3339 format.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * the recent time when a forwarding rule is modified, RFC3339 format.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }
}

