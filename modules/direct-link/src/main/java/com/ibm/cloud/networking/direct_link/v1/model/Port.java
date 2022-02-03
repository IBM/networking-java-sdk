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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Provider port details.
 */
public class Port extends GenericModel {

  @SerializedName("direct_link_count")
  protected Long directLinkCount;
  protected String id;
  protected String label;
  @SerializedName("location_display_name")
  protected String locationDisplayName;
  @SerializedName("location_name")
  protected String locationName;
  @SerializedName("provider_name")
  protected String providerName;
  @SerializedName("supported_link_speeds")
  protected List<Long> supportedLinkSpeeds;

  /**
   * Gets the directLinkCount.
   *
   * Count of existing Direct Link gateways in this account on this port.
   *
   * @return the directLinkCount
   */
  public Long getDirectLinkCount() {
    return directLinkCount;
  }

  /**
   * Gets the id.
   *
   * Port identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the label.
   *
   * Port Label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the locationDisplayName.
   *
   * Port location long name.
   *
   * @return the locationDisplayName
   */
  public String getLocationDisplayName() {
    return locationDisplayName;
  }

  /**
   * Gets the locationName.
   *
   * Port location name identifier.
   *
   * @return the locationName
   */
  public String getLocationName() {
    return locationName;
  }

  /**
   * Gets the providerName.
   *
   * Port's provider name.
   *
   * @return the providerName
   */
  public String getProviderName() {
    return providerName;
  }

  /**
   * Gets the supportedLinkSpeeds.
   *
   * Port's supported speeds in megabits per second.
   *
   * @return the supportedLinkSpeeds
   */
  public List<Long> getSupportedLinkSpeeds() {
    return supportedLinkSpeeds;
  }
}

