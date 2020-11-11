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
package com.ibm.cloud.networking.direct_link_provider.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A paginated collection of resources.
 */
public class ProviderGatewayCollection extends GenericModel {

  protected ProviderGatewayCollectionFirst first;
  protected Long limit;
  protected ProviderGatewayCollectionNext next;
  @SerializedName("total_count")
  protected Long totalCount;
  protected List<ProviderGateway> gateways;

  /**
   * Gets the first.
   *
   * A reference to the first page of resources.
   *
   * @return the first
   */
  public ProviderGatewayCollectionFirst getFirst() {
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
  public ProviderGatewayCollectionNext getNext() {
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
   * Gets the gateways.
   *
   * Collection of Direct Link gateways.
   *
   * @return the gateways
   */
  public List<ProviderGateway> getGateways() {
    return gateways;
  }
}

