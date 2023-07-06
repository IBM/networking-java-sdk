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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List load balancer monitors response.
 */
public class ListMonitors extends GenericModel {

  protected List<Monitor> monitors;
  protected Long offset;
  protected Long limit;
  protected Long count;
  @SerializedName("total_count")
  protected Long totalCount;
  protected PaginationRef first;
  protected PaginationRef last;
  protected PaginationRef previous;
  protected PaginationRef next;

  protected ListMonitors() { }

  /**
   * Gets the monitors.
   *
   * An array of load balancer monitors.
   *
   * @return the monitors
   */
  public List<Monitor> getMonitors() {
    return monitors;
  }

  /**
   * Gets the offset.
   *
   * The number of resources to skip over.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources might be returned.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the count.
   *
   * The number of resources are returned.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of resources.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the first.
   *
   * href.
   *
   * @return the first
   */
  public PaginationRef getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * href.
   *
   * @return the last
   */
  public PaginationRef getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * href.
   *
   * @return the previous
   */
  public PaginationRef getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * href.
   *
   * @return the next
   */
  public PaginationRef getNext() {
    return next;
  }
}

