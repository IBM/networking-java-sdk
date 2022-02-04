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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateProviderGateway options.
 */
public class UpdateProviderGatewayOptions extends GenericModel {

  protected String id;
  protected Long bgpAsn;
  protected String bgpCerCidr;
  protected String bgpIbmCidr;
  protected String name;
  protected Long speedMbps;
  protected Long vlan;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Long bgpAsn;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private String name;
    private Long speedMbps;
    private Long vlan;

    private Builder(UpdateProviderGatewayOptions updateProviderGatewayOptions) {
      this.id = updateProviderGatewayOptions.id;
      this.bgpAsn = updateProviderGatewayOptions.bgpAsn;
      this.bgpCerCidr = updateProviderGatewayOptions.bgpCerCidr;
      this.bgpIbmCidr = updateProviderGatewayOptions.bgpIbmCidr;
      this.name = updateProviderGatewayOptions.name;
      this.speedMbps = updateProviderGatewayOptions.speedMbps;
      this.vlan = updateProviderGatewayOptions.vlan;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateProviderGatewayOptions.
     *
     * @return the new UpdateProviderGatewayOptions instance
     */
    public UpdateProviderGatewayOptions build() {
      return new UpdateProviderGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the UpdateProviderGatewayOptions builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected UpdateProviderGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    bgpAsn = builder.bgpAsn;
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
    name = builder.name;
    speedMbps = builder.speedMbps;
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a UpdateProviderGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link Connect gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the bgpAsn.
   *
   * The autonomous system number (ASN) of Border Gateway Protocol (BGP) configuration for the IBM side of the DL 2.0
   * gateway.
   *
   * @return the bgpAsn
   */
  public Long bgpAsn() {
    return bgpAsn;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on customer edge
   * router for the DL 2.0 gateway. Customer edge IP and IBM IP should be in the same network. Updating customer edge
   * router CIDR should be accompanied with IBM CIDR in the request. Update customer edge router IP to a valid
   * bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must reside in one of "10.254.0.0/16", "172.16.0.0/12",
   * "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.  bgp_cer_cidr and bgp_ibm_cidr must have matching
   * network and subnet mask values.
   *
   * @return the bgpCerCidr
   */
  public String bgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on IBM edge router for the DL 2.0
   * gateway. IBM IP and customer edge IP should be in the same network. Updating IBM CIDR should be accompanied with
   * customer edge router CIDR in the request. Update IBM CIDR to a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value
   * must reside in one of "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.
   *  bgp_cer_cidr and bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpIbmCidr
   */
  public String bgpIbmCidr() {
    return bgpIbmCidr;
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
   * Gets the vlan.
   *
   * VLAN to be modified for this gateway.
   *
   * VLAN provided should be in the range 1 to 4094.
   *
   * @return the vlan
   */
  public Long vlan() {
    return vlan;
  }
}

