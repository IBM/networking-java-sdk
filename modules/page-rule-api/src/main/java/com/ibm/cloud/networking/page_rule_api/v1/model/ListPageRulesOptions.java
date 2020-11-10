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
package com.ibm.cloud.networking.page_rule_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listPageRules options.
 */
public class ListPageRulesOptions extends GenericModel {

  protected String status;
  protected String order;
  protected String direction;
  protected String match;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private String order;
    private String direction;
    private String match;

    private Builder(ListPageRulesOptions listPageRulesOptions) {
      this.status = listPageRulesOptions.status;
      this.order = listPageRulesOptions.order;
      this.direction = listPageRulesOptions.direction;
      this.match = listPageRulesOptions.match;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListPageRulesOptions.
     *
     * @return the new ListPageRulesOptions instance
     */
    public ListPageRulesOptions build() {
      return new ListPageRulesOptions(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListPageRulesOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the ListPageRulesOptions builder
     */
    public Builder order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListPageRulesOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the match.
     *
     * @param match the match
     * @return the ListPageRulesOptions builder
     */
    public Builder match(String match) {
      this.match = match;
      return this;
    }
  }

  protected ListPageRulesOptions(Builder builder) {
    status = builder.status;
    order = builder.order;
    direction = builder.direction;
    match = builder.match;
  }

  /**
   * New builder.
   *
   * @return a ListPageRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * default value: disabled. valid values: active, disabled.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the order.
   *
   * default value: priority. valid values: status, priority.
   *
   * @return the order
   */
  public String order() {
    return order;
  }

  /**
   * Gets the direction.
   *
   * default value: desc. valid values: asc, desc.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the match.
   *
   * default value: all. valid values: any, all.
   *
   * @return the match
   */
  public String match() {
    return match;
  }
}

