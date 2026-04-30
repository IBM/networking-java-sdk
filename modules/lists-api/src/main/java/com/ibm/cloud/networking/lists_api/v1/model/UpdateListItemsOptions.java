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
 * The updateListItems options.
 */
public class UpdateListItemsOptions extends GenericModel {

  protected List<CreateListItemsReqItem> createListItemsReqItem;

  /**
   * Builder.
   */
  public static class Builder {
    private List<CreateListItemsReqItem> createListItemsReqItem;

    /**
     * Instantiates a new Builder from an existing UpdateListItemsOptions instance.
     *
     * @param updateListItemsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateListItemsOptions updateListItemsOptions) {
      this.createListItemsReqItem = updateListItemsOptions.createListItemsReqItem;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateListItemsOptions.
     *
     * @return the new UpdateListItemsOptions instance
     */
    public UpdateListItemsOptions build() {
      return new UpdateListItemsOptions(this);
    }

    /**
     * Adds a new element to createListItemsReqItem.
     *
     * @param createListItemsReqItem the new element to be added
     * @return the UpdateListItemsOptions builder
     */
    public Builder addCreateListItemsReqItem(CreateListItemsReqItem createListItemsReqItem) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(createListItemsReqItem,
        "createListItemsReqItem cannot be null");
      if (this.createListItemsReqItem == null) {
        this.createListItemsReqItem = new ArrayList<CreateListItemsReqItem>();
      }
      this.createListItemsReqItem.add(createListItemsReqItem);
      return this;
    }

    /**
     * Set the createListItemsReqItem.
     * Existing createListItemsReqItem will be replaced.
     *
     * @param createListItemsReqItem the createListItemsReqItem
     * @return the UpdateListItemsOptions builder
     */
    public Builder createListItemsReqItem(List<CreateListItemsReqItem> createListItemsReqItem) {
      this.createListItemsReqItem = createListItemsReqItem;
      return this;
    }
  }

  protected UpdateListItemsOptions() { }

  protected UpdateListItemsOptions(Builder builder) {
    createListItemsReqItem = builder.createListItemsReqItem;
  }

  /**
   * New builder.
   *
   * @return a UpdateListItemsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the createListItemsReqItem.
   *
   * @return the createListItemsReqItem
   */
  public List<CreateListItemsReqItem> createListItemsReqItem() {
    return createListItemsReqItem;
  }
}

