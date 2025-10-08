/*
 * (C) Copyright IBM Corp. 2025.
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
 * A create template with information for redundant GRE tunnel.
 */
public class TransitGatewayTunnelTemplate extends GenericModel {

  @SerializedName("local_gateway_ip")
  protected String localGatewayIp;
  @SerializedName("local_tunnel_ip")
  protected String localTunnelIp;
  protected String name;
  @SerializedName("remote_bgp_asn")
  protected Long remoteBgpAsn;
  @SerializedName("remote_gateway_ip")
  protected String remoteGatewayIp;
  @SerializedName("remote_tunnel_ip")
  protected String remoteTunnelIp;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String localGatewayIp;
    private String localTunnelIp;
    private String name;
    private Long remoteBgpAsn;
    private String remoteGatewayIp;
    private String remoteTunnelIp;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing TransitGatewayTunnelTemplate instance.
     *
     * @param transitGatewayTunnelTemplate the instance to initialize the Builder with
     */
    private Builder(TransitGatewayTunnelTemplate transitGatewayTunnelTemplate) {
      this.localGatewayIp = transitGatewayTunnelTemplate.localGatewayIp;
      this.localTunnelIp = transitGatewayTunnelTemplate.localTunnelIp;
      this.name = transitGatewayTunnelTemplate.name;
      this.remoteBgpAsn = transitGatewayTunnelTemplate.remoteBgpAsn;
      this.remoteGatewayIp = transitGatewayTunnelTemplate.remoteGatewayIp;
      this.remoteTunnelIp = transitGatewayTunnelTemplate.remoteTunnelIp;
      this.zone = transitGatewayTunnelTemplate.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param localGatewayIp the localGatewayIp
     * @param localTunnelIp the localTunnelIp
     * @param name the name
     * @param remoteGatewayIp the remoteGatewayIp
     * @param remoteTunnelIp the remoteTunnelIp
     * @param zone the zone
     */
    public Builder(String localGatewayIp, String localTunnelIp, String name, String remoteGatewayIp, String remoteTunnelIp, ZoneIdentity zone) {
      this.localGatewayIp = localGatewayIp;
      this.localTunnelIp = localTunnelIp;
      this.name = name;
      this.remoteGatewayIp = remoteGatewayIp;
      this.remoteTunnelIp = remoteTunnelIp;
      this.zone = zone;
    }

    /**
     * Builds a TransitGatewayTunnelTemplate.
     *
     * @return the new TransitGatewayTunnelTemplate instance
     */
    public TransitGatewayTunnelTemplate build() {
      return new TransitGatewayTunnelTemplate(this);
    }

    /**
     * Set the localGatewayIp.
     *
     * @param localGatewayIp the localGatewayIp
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder localGatewayIp(String localGatewayIp) {
      this.localGatewayIp = localGatewayIp;
      return this;
    }

    /**
     * Set the localTunnelIp.
     *
     * @param localTunnelIp the localTunnelIp
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder localTunnelIp(String localTunnelIp) {
      this.localTunnelIp = localTunnelIp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the remoteBgpAsn.
     *
     * @param remoteBgpAsn the remoteBgpAsn
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder remoteBgpAsn(long remoteBgpAsn) {
      this.remoteBgpAsn = remoteBgpAsn;
      return this;
    }

    /**
     * Set the remoteGatewayIp.
     *
     * @param remoteGatewayIp the remoteGatewayIp
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder remoteGatewayIp(String remoteGatewayIp) {
      this.remoteGatewayIp = remoteGatewayIp;
      return this;
    }

    /**
     * Set the remoteTunnelIp.
     *
     * @param remoteTunnelIp the remoteTunnelIp
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder remoteTunnelIp(String remoteTunnelIp) {
      this.remoteTunnelIp = remoteTunnelIp;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the TransitGatewayTunnelTemplate builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected TransitGatewayTunnelTemplate() { }

  protected TransitGatewayTunnelTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.localGatewayIp,
      "localGatewayIp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.localTunnelIp,
      "localTunnelIp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.remoteGatewayIp,
      "remoteGatewayIp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.remoteTunnelIp,
      "remoteTunnelIp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    localGatewayIp = builder.localGatewayIp;
    localTunnelIp = builder.localTunnelIp;
    name = builder.name;
    remoteBgpAsn = builder.remoteBgpAsn;
    remoteGatewayIp = builder.remoteGatewayIp;
    remoteTunnelIp = builder.remoteTunnelIp;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a TransitGatewayTunnelTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address.
   *
   * @return the localGatewayIp
   */
  public String localGatewayIp() {
    return localGatewayIp;
  }

  /**
   * Gets the localTunnelIp.
   *
   * Local tunnel IP address. The local_tunnel_ip and remote_tunnel_ip addresses must be in the same /30 network.
   * Neither can be the network nor broadcast addresses.
   *
   * @return the localTunnelIp
   */
  public String localTunnelIp() {
    return localTunnelIp;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this tunnel connection.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN. The following ASN values are reserved and unavailable 0, 13884, 36351, 64512, 64513, 65100,
   * 65200-65234, 65402-65433, 65500, 65516, 65519, 65521, 65531 and 4201065000-4201065999 If `remote_bgp_asn` is
   * omitted on create requests, IBM will assign an ASN.
   *
   * @return the remoteBgpAsn
   */
  public Long remoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address.
   *
   * @return the remoteGatewayIp
   */
  public String remoteGatewayIp() {
    return remoteGatewayIp;
  }

  /**
   * Gets the remoteTunnelIp.
   *
   * Remote tunnel IP address. The local_tunnel_ip and remote_tunnel_ip addresses must be in the same /30 network.
   * Neither can be the network nor broadcast addresses.
   *
   * @return the remoteTunnelIp
   */
  public String remoteTunnelIp() {
    return remoteTunnelIp;
  }

  /**
   * Gets the zone.
   *
   * Specify the connection's location.  The specified availability zone must reside in the gateway's region.
   * Use the IBM Cloud global catalog to list zones within the desired region.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

