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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Create gateway template.
 *
 * Classes which extend this class:
 * - GatewayTemplateGatewayTypeDedicatedTemplate
 * - GatewayTemplateGatewayTypeConnectTemplate
 */
public class GatewayTemplate extends GenericModel {

  /**
   * Gateway type.
   */
  public interface Type {
    /** connect. */
    String CONNECT = "connect";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  @SerializedName("bgp_asn")
  protected Long bgpAsn;
  @SerializedName("bgp_base_cidr")
  protected String bgpBaseCidr;
  @SerializedName("bgp_cer_cidr")
  protected String bgpCerCidr;
  @SerializedName("bgp_ibm_cidr")
  protected String bgpIbmCidr;
  protected Boolean global;
  protected Boolean metered;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("speed_mbps")
  protected Long speedMbps;
  protected String type;
  @SerializedName("carrier_name")
  protected String carrierName;
  @SerializedName("cross_connect_router")
  protected String crossConnectRouter;
  @SerializedName("customer_name")
  protected String customerName;
  @SerializedName("location_name")
  protected String locationName;
  @SerializedName("macsec_config")
  protected GatewayMacsecConfigTemplate macsecConfig;
  protected GatewayPortIdentity port;

  protected GatewayTemplate() {
  }

  /**
   * Gets the bgpAsn.
   *
   * BGP ASN.
   *
   * @return the bgpAsn
   */
  public Long bgpAsn() {
    return bgpAsn;
  }

  /**
   * Gets the bgpBaseCidr.
   *
   * BGP base CIDR.
   *
   * @return the bgpBaseCidr
   */
  public String bgpBaseCidr() {
    return bgpBaseCidr;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR.  Specify a value within `bgp_base_cidr`.  If `bgp_base_cidr` is 169.254.0.0/16 this
   * field can  be ommitted and a CIDR will be selected automatically.
   *
   * @return the bgpCerCidr
   */
  public String bgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR.  Specify a value within `bgp_base_cidr`.  If `bgp_base_cidr` is 169.254.0.0/16 this field can  be
   * ommitted and a CIDR will be selected automatically.
   *
   * @return the bgpIbmCidr
   */
  public String bgpIbmCidr() {
    return bgpIbmCidr;
  }

  /**
   * Gets the global.
   *
   * Gateways with global routing (`true`) can connect to networks outside their associated region.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the metered.
   *
   * Metered billing option.  When `true` gateway usage is billed per gigabyte.  When `false` there is no per gigabyte
   * usage charge, instead a flat rate is charged for the gateway.
   *
   * @return the metered
   */
  public Boolean metered() {
    return metered;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group for this resource. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the speedMbps.
   *
   * Gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long speedMbps() {
    return speedMbps;
  }

  /**
   * Gets the type.
   *
   * Gateway type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the carrierName.
   *
   * Carrier name.
   *
   * @return the carrierName
   */
  public String carrierName() {
    return carrierName;
  }

  /**
   * Gets the crossConnectRouter.
   *
   * Cross connect router.
   *
   * @return the crossConnectRouter
   */
  public String crossConnectRouter() {
    return crossConnectRouter;
  }

  /**
   * Gets the customerName.
   *
   * Customer name.
   *
   * @return the customerName
   */
  public String customerName() {
    return customerName;
  }

  /**
   * Gets the locationName.
   *
   * Gateway location.
   *
   * @return the locationName
   */
  public String locationName() {
    return locationName;
  }

  /**
   * Gets the macsecConfig.
   *
   * MACsec configuration information.  Contact IBM support for access to MACsec.
   *
   * @return the macsecConfig
   */
  public GatewayMacsecConfigTemplate macsecConfig() {
    return macsecConfig;
  }

  /**
   * Gets the port.
   *
   * Select Port Label for new type=connect gateway.
   *
   * @return the port
   */
  public GatewayPortIdentity port() {
    return port;
  }
}

