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
 * The getListItems options.
 */
public class GetListItemsOptions extends GenericModel {

  protected String cursor;
  protected Long perPage;
  protected String search;

  /**
   * Builder.
   */
  public static class Builder {
    private String cursor;
    private Long perPage;
    private String search;

    /**
     * Instantiates a new Builder from an existing GetListItemsOptions instance.
     *
     * @param getListItemsOptions the instance to initialize the Builder with
     */
    private Builder(GetListItemsOptions getListItemsOptions) {
      this.cursor = getListItemsOptions.cursor;
      this.perPage = getListItemsOptions.perPage;
      this.search = getListItemsOptions.search;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetListItemsOptions.
     *
     * @return the new GetListItemsOptions instance
     */
    public GetListItemsOptions build() {
      return new GetListItemsOptions(this);
    }

    /**
     * Set the cursor.
     *
     * @param cursor the cursor
     * @return the GetListItemsOptions builder
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * Set the perPage.
     *
     * @param perPage the perPage
     * @return the GetListItemsOptions builder
     */
    public Builder perPage(long perPage) {
      this.perPage = perPage;
      return this;
    }

    /**
     * Set the search.
     *
     * @param search the search
     * @return the GetListItemsOptions builder
     */
    public Builder search(String search) {
      this.search = search;
      return this;
    }
  }

  protected GetListItemsOptions() { }

  protected GetListItemsOptions(Builder builder) {
    cursor = builder.cursor;
    perPage = builder.perPage;
    search = builder.search;
  }

  /**
   * New builder.
   *
   * @return a GetListItemsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cursor.
   *
   * The pagination cursor. An opaque string token indicating the position from which to continue when requesting the
   * next/previous set of records. Cursor values are provided under result_info.cursors in the response.
   *
   * @return the cursor
   */
  public String cursor() {
    return cursor;
  }

  /**
   * Gets the perPage.
   *
   * Amount of results to include in each paginated response. A non-negative 32 bit integer. Minimum 1, maximum 500.
   *
   * @return the perPage
   */
  public Long perPage() {
    return perPage;
  }

  /**
   * Gets the search.
   *
   * A search query to filter returned items. Its meaning depends on the list type: IP addresses must start with the
   * provided string, hostnames and bulk redirects must contain the string, and ASNs must match the string exactly.
   *
   * @return the search
   */
  public String search() {
    return search;
  }
}

