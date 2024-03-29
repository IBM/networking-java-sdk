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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The owner's instance and zone that the zone is linked to.
 */
public class LinkedDnszoneLinkedTo extends GenericModel {

  @SerializedName("instance_crn")
  protected String instanceCrn;
  @SerializedName("zone_id")
  protected String zoneId;

  protected LinkedDnszoneLinkedTo() { }

  /**
   * Gets the instanceCrn.
   *
   * The owner's instance CRN.
   *
   * @return the instanceCrn
   */
  public String getInstanceCrn() {
    return instanceCrn;
  }

  /**
   * Gets the zoneId.
   *
   * The owner's DNS zone.
   *
   * @return the zoneId
   */
  public String getZoneId() {
    return zoneId;
  }
}

