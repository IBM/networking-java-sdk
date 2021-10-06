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
package com.ibm.cloud.networking.direct_link_provider.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ProviderGatewayUpdateAttributesUpdatesItem.
 *
 * Classes which extend this class:
 * - ProviderGatewayUpdateAttributesUpdatesItemProviderGatewaySpeedUpdate
 * - ProviderGatewayUpdateAttributesUpdatesItemProviderGatewayBGPIPUpdate
 * - ProviderGatewayUpdateAttributesUpdatesItemProviderGatewayBGPASNUpdate
 */
public class ProviderGatewayUpdateAttributesUpdatesItem extends GenericModel {

  @SerializedName("speed_mbps")
  protected Long speedMbps;
  @SerializedName("bgp_cer_cidr")
  protected String bgpCerCidr;
  @SerializedName("bgp_ibm_cidr")
  protected String bgpIbmCidr;
  @SerializedName("bgp_asn")
  protected Long bgpAsn;

  protected ProviderGatewayUpdateAttributesUpdatesItem() {
  }

  /**
   * Gets the speedMbps.
   *
   * New gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long getSpeedMbps() {
    return speedMbps;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on customer edge
   * router for the DL 2.0 gateway.
   *
   * Customer edge IP and IBM IP should be in the same network. Updating customer edge router CIDR should be accompanied
   * with IBM CIDR in the request. Update customer edge router IP to a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the
   * value must reside in one of "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16",
   * "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and bgp_ibm_cidr must have matching network and subnet mask
   * values.
   *
   * @return the bgpCerCidr
   */
  public String getBgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on IBM edge router for the DL 2.0
   * gateway.
   *
   * IBM IP and customer edge IP should be in the same network. Updating IBM CIDR should be accompanied with customer
   * edge router CIDR in the request. Update IBM CIDR to a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must
   * reside in one of "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.
   * bgp_cer_cidr and bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpIbmCidr
   */
  public String getBgpIbmCidr() {
    return bgpIbmCidr;
  }

  /**
   * Gets the bgpAsn.
   *
   * New gateway BGP ASN.
   *
   * @return the bgpAsn
   */
  public Long getBgpAsn() {
    return bgpAsn;
  }
}

