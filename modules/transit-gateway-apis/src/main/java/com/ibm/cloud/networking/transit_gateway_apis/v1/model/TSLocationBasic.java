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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a Transit Gateway location.
 */
public class TSLocationBasic extends GenericModel {

  @SerializedName("billing_location")
  protected String billingLocation;
  protected String name;
  protected String type;

  /**
   * Gets the billingLocation.
   *
   * The geographical location of this location, used for billing purposes.
   *
   * @return the billingLocation
   */
  public String getBillingLocation() {
    return billingLocation;
  }

  /**
   * Gets the name.
   *
   * Name of the Location.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of the location, determining is this a multi-zone region, a single data center, or a point of presence.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

