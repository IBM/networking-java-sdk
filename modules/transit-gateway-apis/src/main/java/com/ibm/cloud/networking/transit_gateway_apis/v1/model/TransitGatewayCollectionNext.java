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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A reference to the next page of resources; this reference is included for all pages except the last page.
 */
public class TransitGatewayCollectionNext extends GenericModel {

  protected String href;
  protected String start;

  /**
   * Gets the href.
   *
   * url.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the start.
   *
   * server generated start token for next page of resources.
   *
   * @return the start
   */
  public String getStart() {
    return start;
  }
}

