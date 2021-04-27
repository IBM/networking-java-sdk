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
   * (DEPRECATED) BGP base CIDR.
   *
   * Field is deprecated.  See bgp_ibm_cidr and bgp_cer_cidr for details on how to create a gateway using either
   * automatic or explicit IP assignment.  Any bgp_base_cidr value set will be ignored.
   *
   * Deprecated field bgp_base_cidr will be removed from the API specificiation after 15-MAR-2021.
   *
   * @return the bgpBaseCidr
   */
  public String bgpBaseCidr() {
    return bgpBaseCidr;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR.
   *
   * For auto IP assignment, omit bgp_cer_cidr and bgp_ibm_cidr.  IBM will automatically select values for bgp_cer_cidr
   * and bgp_ibm_cidr.
   *
   * For explicit IP assignment set a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must reside in one of
   * "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and
   * bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpCerCidr
   */
  public String bgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR.
   *
   * For auto IP assignment, omit bgp_cer_cidr and bgp_ibm_cidr.  IBM will automatically select values for bgp_cer_cidr
   * and bgp_ibm_cidr.
   *
   * For explicit IP assignment set a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must reside in one of
   * "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and
   * bgp_ibm_cidr must have matching network and subnet mask values.
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

