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
 * CustomListResult.
 */
public class CustomListResult extends GenericModel {

  protected String name;
  protected String id;
  protected String description;
  protected String kind;
  @SerializedName("num_items")
  protected Double numItems;
  @SerializedName("num_referencing_filters")
  protected Double numReferencingFilters;

  protected CustomListResult() { }

  /**
   * Gets the name.
   *
   * The name of the list to be referenced by rule expressions.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the id.
   *
   * The unique ID of the list.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the description.
   *
   * Describes the contents of the list.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the kind.
   *
   * The type of resource this list contains.
   *
   * @return the kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Gets the numItems.
   *
   * How many items the list contains.
   *
   * @return the numItems
   */
  public Double getNumItems() {
    return numItems;
  }

  /**
   * Gets the numReferencingFilters.
   *
   * How many times the list is used by rule expressions.
   *
   * @return the numReferencingFilters
   */
  public Double getNumReferencingFilters() {
    return numReferencingFilters;
  }
}

