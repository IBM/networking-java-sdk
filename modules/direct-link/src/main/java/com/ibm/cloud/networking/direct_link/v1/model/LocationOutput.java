/*
 * (C) Copyright IBM Corp. 2021.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * location.
 */
public class LocationOutput extends GenericModel {

  @SerializedName("billing_location")
  protected String billingLocation;
  @SerializedName("building_colocation_owner")
  protected String buildingColocationOwner;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("location_type")
  protected String locationType;
  @SerializedName("macsec_enabled")
  protected Boolean macsecEnabled;
  protected String market;
  @SerializedName("market_geography")
  protected String marketGeography;
  protected Boolean mzr;
  protected String name;
  @SerializedName("offering_type")
  protected String offeringType;
  @SerializedName("provision_enabled")
  protected Boolean provisionEnabled;
  @SerializedName("vpc_region")
  protected String vpcRegion;

  /**
   * Gets the billingLocation.
   *
   * Billing location.  Only present for locations where provisioning is enabled.
   *
   * @return the billingLocation
   */
  public String getBillingLocation() {
    return billingLocation;
  }

  /**
   * Gets the buildingColocationOwner.
   *
   * Building colocation owner.  Only present for offering_type=dedicated locations where provisioning is enabled.
   *
   * @return the buildingColocationOwner
   */
  public String getBuildingColocationOwner() {
    return buildingColocationOwner;
  }

  /**
   * Gets the displayName.
   *
   * Location long name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the locationType.
   *
   * Location type.
   *
   * @return the locationType
   */
  public String getLocationType() {
    return locationType;
  }

  /**
   * Gets the macsecEnabled.
   *
   * Indicate whether location supports MACsec.  Only returned for gateway type=dedicated locations.  Contact IBM
   * support for access to MACsec.
   *
   * @return the macsecEnabled
   */
  public Boolean isMacsecEnabled() {
    return macsecEnabled;
  }

  /**
   * Gets the market.
   *
   * Location market.
   *
   * @return the market
   */
  public String getMarket() {
    return market;
  }

  /**
   * Gets the marketGeography.
   *
   * Location geography.  Only present for locations where provisioning is enabled.
   *
   * @return the marketGeography
   */
  public String getMarketGeography() {
    return marketGeography;
  }

  /**
   * Gets the mzr.
   *
   * Is location a multi-zone region (MZR).  Only present for locations where provisioning is enabled.
   *
   * @return the mzr
   */
  public Boolean isMzr() {
    return mzr;
  }

  /**
   * Gets the name.
   *
   * Location short name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the offeringType.
   *
   * Location offering type.
   *
   * @return the offeringType
   */
  public String getOfferingType() {
    return offeringType;
  }

  /**
   * Gets the provisionEnabled.
   *
   * Indicates for the specific offering_type whether this location supports gateway provisioning.
   *
   * @return the provisionEnabled
   */
  public Boolean isProvisionEnabled() {
    return provisionEnabled;
  }

  /**
   * Gets the vpcRegion.
   *
   * Location's VPC region.  Only present for locations where provisioning is enabled.
   *
   * @return the vpcRegion
   */
  public String getVpcRegion() {
    return vpcRegion;
  }
}

