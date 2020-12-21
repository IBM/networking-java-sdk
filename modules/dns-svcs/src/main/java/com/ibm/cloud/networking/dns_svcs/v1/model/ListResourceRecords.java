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
 * List Resource Records response.
 */
public class ListResourceRecords extends GenericModel {

  @SerializedName("resource_records")
  protected List<ResourceRecord> resourceRecords;
  protected Long offset;
  protected Long limit;
  @SerializedName("total_count")
  protected Long totalCount;
  protected FirstHref first;
  protected NextHref next;

  /**
   * Gets the resourceRecords.
   *
   * An array of resource records.
   *
   * @return the resourceRecords
   */
  public List<ResourceRecord> getResourceRecords() {
    return resourceRecords;
  }

  /**
   * Gets the offset.
   *
   * Specify how many resource records to skip over, the default value is 0.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * Specify how many resource records are returned, the default value is 20.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of resource records.
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

