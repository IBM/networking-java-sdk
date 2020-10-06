/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.dns_records.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAllDnsRecords options.
 */
public class ListAllDnsRecordsOptions extends GenericModel {

  /**
   * Field by which to order list of DNS records.
   */
  public interface Order {
    /** type. */
    String TYPE = "type";
    /** name. */
    String NAME = "name";
    /** content. */
    String CONTENT = "content";
    /** ttl. */
    String TTL = "ttl";
    /** proxied. */
    String PROXIED = "proxied";
  }

  /**
   * Direction in which to order results [ascending/descending order].
   */
  public interface Direction {
    /** asc. */
    String ASC = "asc";
    /** desc. */
    String DESC = "desc";
  }

  /**
   * Whether to match all (all) or atleast one search parameter (any).
   */
  public interface Match {
    /** any. */
    String ANY = "any";
    /** all. */
    String ALL = "all";
  }

  protected String type;
  protected String name;
  protected String content;
  protected Long page;
  protected Long perPage;
  protected String order;
  protected String direction;
  protected String match;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String name;
    private String content;
    private Long page;
    private Long perPage;
    private String order;
    private String direction;
    private String match;

    private Builder(ListAllDnsRecordsOptions listAllDnsRecordsOptions) {
      this.type = listAllDnsRecordsOptions.type;
      this.name = listAllDnsRecordsOptions.name;
      this.content = listAllDnsRecordsOptions.content;
      this.page = listAllDnsRecordsOptions.page;
      this.perPage = listAllDnsRecordsOptions.perPage;
      this.order = listAllDnsRecordsOptions.order;
      this.direction = listAllDnsRecordsOptions.direction;
      this.match = listAllDnsRecordsOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListAllDnsRecordsOptions.
     *
     * @return the new ListAllDnsRecordsOptions instance
     */
    public ListAllDnsRecordsOptions build() {
      return new ListAllDnsRecordsOptions(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the content.
     *
     * @param content the content
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListAllDnsRecordsOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }
  }

  protected ListAllDnsRecordsOptions(Builder builder) {
    type = builder.type;
    name = builder.name;
    content = builder.content;
    page = builder.page;
    perPage = builder.perPage;
    order = builder.order;
    direction = builder.direction;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a ListAllDnsRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of DNS records to display.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Value of name field to filter by.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the content.
   *
   * Value of content field to filter by.
   *
   * @return the content
   */
  public String content() {
    return content;
  }

  /**
   * Gets the page.
   *
   * Page number of paginated results.
   *
   * @return the page
   */
  public Long page() {
    return page;
  }

  /**
   * Gets the perPage.
   *
   * Maximum number of DNS records per page.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }

  /**
   * Gets the order.
   *
   * Field by which to order list of DNS records.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the direction.
   *
   * Direction in which to order results [ascending/descending order].
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the match.
   *
   * Whether to match all (all) or atleast one search parameter (any).
   *
   * @return the match
   */
  public String match() {
    return match;
  }
}

