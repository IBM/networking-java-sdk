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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CreateListItemsReqItem.
 */
public class CreateListItemsReqItem extends GenericModel {

  protected Double asn;
  protected String comment;
  protected String hostname;
  protected String ip;

  /**
   * Builder.
   */
  public static class Builder {
    private Double asn;
    private String comment;
    private String hostname;
    private String ip;

    /**
     * Instantiates a new Builder from an existing CreateListItemsReqItem instance.
     *
     * @param createListItemsReqItem the instance to initialize the Builder with
     */
    private Builder(CreateListItemsReqItem createListItemsReqItem) {
      this.asn = createListItemsReqItem.asn;
      this.comment = createListItemsReqItem.comment;
      this.hostname = createListItemsReqItem.hostname;
      this.ip = createListItemsReqItem.ip;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateListItemsReqItem.
     *
     * @return the new CreateListItemsReqItem instance
     */
    public CreateListItemsReqItem build() {
      return new CreateListItemsReqItem(this);
    }

    /**
     * Set the asn.
     *
     * @param asn the asn
     * @return the CreateListItemsReqItem builder
     */
    public Builder asn(Double asn) {
      this.asn = asn;
      return this;
    }

    /**
     * Set the comment.
     *
     * @param comment the comment
     * @return the CreateListItemsReqItem builder
     */
    public Builder comment(String comment) {
      this.comment = comment;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the CreateListItemsReqItem builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the ip.
     *
     * @param ip the ip
     * @return the CreateListItemsReqItem builder
     */
    public Builder ip(String ip) {
      this.ip = ip;
      return this;
    }
  }

  protected CreateListItemsReqItem() { }

  protected CreateListItemsReqItem(Builder builder) {
    asn = builder.asn;
    comment = builder.comment;
    hostname = builder.hostname;
    ip = builder.ip;
  }

  /**
   * New builder.
   *
   * @return a CreateListItemsReqItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the asn.
   *
   * An autonomous system number.
   *
   * @return the asn
   */
  public Double asn() {
    return asn;
  }

  /**
   * Gets the comment.
   *
   * An informative summary of the list item.
   *
   * @return the comment
   */
  public String comment() {
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
  public String hostname() {
    return hostname;
  }

  /**
   * Gets the ip.
   *
   * An IPv4 address, an IPv4 CIDR, or an IPv6 CIDR. IPv6 CIDRs are limited to a maximum of /64.
   *
   * @return the ip
   */
  public String ip() {
    return ip;
  }
}

