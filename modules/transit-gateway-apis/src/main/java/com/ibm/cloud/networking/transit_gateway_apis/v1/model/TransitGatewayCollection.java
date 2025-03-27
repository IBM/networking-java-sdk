/*
 * (C) Copyright IBM Corp. 2025.
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
 * A list of Transit Gateways.
 */
public class TransitGatewayCollection extends GenericModel {

  protected PaginationFirstTG first;
  protected Long limit;
  protected PaginationNextTG next;
  @SerializedName("transit_gateways")
  protected List<TransitGateway> transitGateways;

  protected TransitGatewayCollection() { }

  /**
   * Gets the first.
   *
   * A reference to the first page of resources.
   *
   * @return the first
   */
  public PaginationFirstTG getFirst() {
    return first;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of gateways returned on one request.
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
  public PaginationNextTG getNext() {
    return next;
  }

  /**
   * Gets the transitGateways.
   *
   * Collection of Transit Services gateways.
   *
   * @return the transitGateways
   */
  public List<TransitGateway> getTransitGateways() {
    return transitGateways;
  }
}

