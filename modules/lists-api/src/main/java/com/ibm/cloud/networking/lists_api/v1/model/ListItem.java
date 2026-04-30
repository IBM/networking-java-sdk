/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.lists_api.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ListItem.
 */
public class ListItem extends GenericModel {

  protected String id;
  protected Double asn;
  protected String comment;
  protected String hostname;
  protected String ip;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("modified_on")
  protected String modifiedOn;

  protected ListItem() { }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the asn.
   *
   * An autonomous system number.
   *
   * @return the asn
   */
  public Double getAsn() {
    return asn;
  }

  /**
   * Gets the comment.
   *
   * An informative summary of the list item.
   *
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * Gets the hostname.
   *
   * Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, wildcards (*), and the
   * hyphen (-).
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the ip.
   *
   * An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
   *
   * @return the ip
   */
  public String getIp() {
    return ip;
  }

  /**
   * Gets the createdOn.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }
}

