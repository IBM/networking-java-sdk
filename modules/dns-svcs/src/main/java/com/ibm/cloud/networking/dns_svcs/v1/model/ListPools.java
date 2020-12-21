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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List load balancer pools response.
 */
public class ListPools extends GenericModel {

  protected List<Pool> pools;
  protected Long offset;
  protected Long limit;
  protected Long count;
  @SerializedName("total_count")
  protected Long totalCount;
  protected FirstHref first;
  protected NextHref next;

  /**
   * Gets the pools.
   *
   * An array of load balancer pools.
   *
   * @return the pools
   */
  public List<Pool> getPools() {
    return pools;
  }

  /**
   * Gets the offset.
   *
   * Page number.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * Number of load balancer pools per page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the count.
   *
   * Number of load balancers.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of load balancers.
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
  public FirstHref getFirst() {
    return first;
  }

  /**
   * Gets the next.
   *
   * href.
   *
   * @return the next
   */
  public NextHref getNext() {
    return next;
  }
}

