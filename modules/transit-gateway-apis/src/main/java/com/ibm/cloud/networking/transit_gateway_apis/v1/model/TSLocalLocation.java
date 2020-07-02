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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a local connection location.
 */
public class TSLocalLocation extends GenericModel {

  /**
   * The type of the location, determining is this a multi-zone region, a single data center, or a point of presence.
   */
  public interface Type {
    /** region. */
    String REGION = "region";
  }

  @SerializedName("display_name")
  protected String displayName;
  protected String name;
  protected String type;

  /**
   * Gets the displayName.
   *
   * A descriptive display name for the location.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the name.
   *
   * The name of the location.
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

