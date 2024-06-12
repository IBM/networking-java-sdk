/*
 * (C) Copyright IBM Corp. 2024.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A set of Transit Gateway network connections.
 */
public class TransitGatewayConnectionCollection extends GenericModel {

  protected List<TransitGatewayConnectionCust> connections;
  protected PaginationFirstTGWConnection first;
  protected Long limit;
  protected PaginationNextTGWConnection next;
  @SerializedName("total_count")
  protected Long totalCount;

  protected TransitGatewayConnectionCollection() { }

  /**
   * Gets the connections.
   *
   * Array of transit gateways network Connections.
   *
   * @return the connections
   */
  public List<TransitGatewayConnectionCust> getConnections() {
    return connections;
  }

  /**
   * Gets the first.
   *
   * A reference to the first page of resources.
   * This will be returned when number of connections in response are greater than max page limit.
   *
   * @return the first
   */
  public PaginationFirstTGWConnection getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of connections returned on one request. This will be returned when number of connections in
   * response are greater than max page limit.
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
  public PaginationNextTGWConnection getNext() {
    return next;
  }

  /**
   * Gets the totalCount.
   *
   * total number of resources across all pages (considering the supplied query parameter filters).
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

