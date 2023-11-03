/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Transit gateway connections.
 */
public class TransitConnectionCollection extends GenericModel {

  protected List<TransitConnection> connections;
  protected PaginationFirstConnection first;
  protected Long limit;
  protected PaginationNextConnection next;

  protected TransitConnectionCollection() { }

  /**
   * Gets the connections.
   *
   * Array of transit gateway connections.
   *
   * @return the connections
   */
  public List<TransitConnection> getConnections() {
    return connections;
  }

  /**
   * Gets the first.
   *
   * A reference to the first page of resources.
   *
   * @return the first
   */
  public PaginationFirstConnection getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of connections returned on one request.
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
  public PaginationNextConnection getNext() {
    return next;
  }
}

