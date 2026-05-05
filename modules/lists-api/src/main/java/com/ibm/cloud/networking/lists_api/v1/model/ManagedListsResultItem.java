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
 * ManagedListsResultItem.
 */
public class ManagedListsResultItem extends GenericModel {

  protected String name;
  protected String description;
  protected String kind;

  protected ManagedListsResultItem() { }

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
   * Gets the description.
   *
   * Describes the contents of the managed list.
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
}

