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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteListItems options.
 */
public class DeleteListItemsOptions extends GenericModel {

  protected List<DeleteListItemsReqItemsItem> items;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DeleteListItemsReqItemsItem> items;

    /**
     * Instantiates a new Builder from an existing DeleteListItemsOptions instance.
     *
     * @param deleteListItemsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteListItemsOptions deleteListItemsOptions) {
      this.items = deleteListItemsOptions.items;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteListItemsOptions.
     *
     * @return the new DeleteListItemsOptions instance
     */
    public DeleteListItemsOptions build() {
      return new DeleteListItemsOptions(this);
    }

    /**
     * Adds a new element to items.
     *
     * @param items the new element to be added
     * @return the DeleteListItemsOptions builder
     */
    public Builder addItems(DeleteListItemsReqItemsItem items) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(items,
        "items cannot be null");
      if (this.items == null) {
        this.items = new ArrayList<DeleteListItemsReqItemsItem>();
      }
      this.items.add(items);
      return this;
    }

    /**
     * Set the items.
     * Existing items will be replaced.
     *
     * @param items the items
     * @return the DeleteListItemsOptions builder
     */
    public Builder items(List<DeleteListItemsReqItemsItem> items) {
      this.items = items;
      return this;
    }
  }

  protected DeleteListItemsOptions() { }

  protected DeleteListItemsOptions(Builder builder) {
    items = builder.items;
  }

  /**
   * New builder.
   *
   * @return a DeleteListItemsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the items.
   *
   * @return the items
   */
  public List<DeleteListItemsReqItemsItem> items() {
    return items;
  }
}

