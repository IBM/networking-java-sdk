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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List of port label details.
 */
public class PortCollection extends GenericModel {

  protected PortsPaginatedCollectionFirst first;
  protected Long limit;
  protected PortsPaginatedCollectionNext next;
  @SerializedName("total_count")
  protected Long totalCount;
  protected List<Port> ports;

  /**
   * Gets the first.
   *
   * A reference to the first page of resources.
   *
   * @return the first
   */
  public PortsPaginatedCollectionFirst getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources can be returned by the request.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * A reference to the next page of resources; this reference is included for all pages except the last page.
   *
   * @return the next
   */
  public PortsPaginatedCollectionNext getNext() {
    return next;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of resources across all pages.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the ports.
   *
   * Array of ports.
   *
   * @return the ports
   */
  public List<Port> getPorts() {
    return ports;
  }
}

