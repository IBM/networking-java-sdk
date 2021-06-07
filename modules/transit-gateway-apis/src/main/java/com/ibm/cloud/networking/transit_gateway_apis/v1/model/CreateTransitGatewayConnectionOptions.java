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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayConnection options.
 */
public class CreateTransitGatewayConnectionOptions extends GenericModel {

  /**
   * Defines what type of network is connected via this connection. For access to gre_tunnel connections contact IBM
   * support.
   */
  public interface NetworkType {
    /** vpc. */
    String VPC = "vpc";
    /** classic. */
    String CLASSIC = "classic";
    /** gre_tunnel. */
    String GRE_TUNNEL = "gre_tunnel";
  }

  protected String transitGatewayId;
  protected String networkType;
  protected String baseConnectionId;
  protected String localGatewayIp;
  protected String localTunnelIp;
  protected String name;
  protected String networkAccountId;
  protected String networkId;
  protected String remoteBgpAsn;
  protected String remoteGatewayIp;
  protected String remoteTunnelIp;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String networkType;
    private String baseConnectionId;
    private String localGatewayIp;
    private String localTunnelIp;
    private String name;
    private String networkAccountId;
    private String networkId;
    private String remoteBgpAsn;
    private String remoteGatewayIp;
    private String remoteTunnelIp;
    private ZoneIdentity zone;

    private Builder(CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptions) {
      this.transitGatewayId = createTransitGatewayConnectionOptions.transitGatewayId;
      this.networkType = createTransitGatewayConnectionOptions.networkType;
      this.baseConnectionId = createTransitGatewayConnectionOptions.baseConnectionId;
      this.localGatewayIp = createTransitGatewayConnectionOptions.localGatewayIp;
      this.localTunnelIp = createTransitGatewayConnectionOptions.localTunnelIp;
      this.name = createTransitGatewayConnectionOptions.name;
      this.networkAccountId = createTransitGatewayConnectionOptions.networkAccountId;
      this.networkId = createTransitGatewayConnectionOptions.networkId;
      this.remoteBgpAsn = createTransitGatewayConnectionOptions.remoteBgpAsn;
      this.remoteGatewayIp = createTransitGatewayConnectionOptions.remoteGatewayIp;
      this.remoteTunnelIp = createTransitGatewayConnectionOptions.remoteTunnelIp;
      this.zone = createTransitGatewayConnectionOptions.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param transitGatewayId the transitGatewayId
     * @param networkType the networkType
     */
    public Builder(String transitGatewayId, String networkType) {
      this.transitGatewayId = transitGatewayId;
      this.networkType = networkType;
    }

    /**
     * Builds a CreateTransitGatewayConnectionOptions.
     *
     * @return the new CreateTransitGatewayConnectionOptions instance
     */
    public CreateTransitGatewayConnectionOptions build() {
      return new CreateTransitGatewayConnectionOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the networkType.
     *
     * @param networkType the networkType
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkType(String networkType) {
      this.networkType = networkType;
      return this;
    }

    /**
     * Set the baseConnectionId.
     *
     * @param baseConnectionId the baseConnectionId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder baseConnectionId(String baseConnectionId) {
      this.baseConnectionId = baseConnectionId;
      return this;
    }

    /**
     * Set the localGatewayIp.
     *
     * @param localGatewayIp the localGatewayIp
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder localGatewayIp(String localGatewayIp) {
      this.localGatewayIp = localGatewayIp;
      return this;
    }

    /**
     * Set the localTunnelIp.
     *
     * @param localTunnelIp the localTunnelIp
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder localTunnelIp(String localTunnelIp) {
      this.localTunnelIp = localTunnelIp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAccountId.
     *
     * @param networkAccountId the networkAccountId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkAccountId(String networkAccountId) {
      this.networkAccountId = networkAccountId;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }

    /**
     * Set the remoteBgpAsn.
     *
     * @param remoteBgpAsn the remoteBgpAsn
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder remoteBgpAsn(String remoteBgpAsn) {
      this.remoteBgpAsn = remoteBgpAsn;
      return this;
    }

    /**
     * Set the remoteGatewayIp.
     *
     * @param remoteGatewayIp the remoteGatewayIp
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder remoteGatewayIp(String remoteGatewayIp) {
      this.remoteGatewayIp = remoteGatewayIp;
      return this;
    }

    /**
     * Set the remoteTunnelIp.
     *
     * @param remoteTunnelIp the remoteTunnelIp
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder remoteTunnelIp(String remoteTunnelIp) {
      this.remoteTunnelIp = remoteTunnelIp;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected CreateTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkType,
      "networkType cannot be null");
    transitGatewayId = builder.transitGatewayId;
    networkType = builder.networkType;
    baseConnectionId = builder.baseConnectionId;
    localGatewayIp = builder.localGatewayIp;
    localTunnelIp = builder.localTunnelIp;
    name = builder.name;
    networkAccountId = builder.networkAccountId;
    networkId = builder.networkId;
    remoteBgpAsn = builder.remoteBgpAsn;
    remoteGatewayIp = builder.remoteGatewayIp;
    remoteTunnelIp = builder.remoteTunnelIp;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the transitGatewayId.
   *
   * The Transit Gateway identifier.
   *
   * @return the transitGatewayId
   */
  public String transitGatewayId() {
    return transitGatewayId;
  }

  /**
   * Gets the networkType.
   *
   * Defines what type of network is connected via this connection. For access to gre_tunnel connections contact IBM
   * support.
   *
   * @return the networkType
   */
  public String networkType() {
    return networkType;
  }

  /**
   * Gets the baseConnectionId.
   *
   * network_type 'gre_tunnel' connections must be created over an existing network_type 'classic' connection. This
   * field is required for 'gre_tunnel' connections and must specify the ID of an active transit gateway network_type
   * 'classic' connection in the same transit gateway. Omit 'base_connection_id' for any connection type other than
   * 'gre_tunnel'.
   *
   * @return the baseConnectionId
   */
  public String baseConnectionId() {
    return baseConnectionId;
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address.  This field is required for and only applicable to type gre_tunnel connections.
   *
   * @return the localGatewayIp
   */
  public String localGatewayIp() {
    return localGatewayIp;
  }

  /**
   * Gets the localTunnelIp.
   *
   * Local tunnel IP address.  This field is required for and only applicable to type gre_tunnel connections.  The
   * local_tunnel_ip and remote_tunnel_ip addresses must be in the same /30 network.  Neither can be the network nor
   * broadcast addresses.
   *
   * @return the localTunnelIp
   */
  public String localTunnelIp() {
    return localTunnelIp;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway connection. Network type 'vpc'  connections are defaulted to the
   * name of the VPC.  Network type 'classic' connections are named 'Classic'.   Name specification is required for
   * network type 'gre_tunnel' connections.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkAccountId.
   *
   * The ID of the account which owns the network that is being connected. Generally only used if the network is in a
   * different account than the gateway. This field is required to be unspecified for network type 'gre_tunnel'.
   *
   * @return the networkAccountId
   */
  public String networkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. This field is required for some types, such as 'vpc'.
   * For network type 'vpc' this is the CRN of the VPC to be connected. This field is required to be unspecified for
   * network type 'classic' and 'gre_tunnel' connections.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN.  This field is only applicable to 'gre_tunnel' type connections. The following ASN values
   * are reserved and unavailable 64512-64513, 65100, 65201-65234, 65402-65433, 65500 and 4201065000-4201065999. If
   * 'remote_bgp_asn' is omitted on gre_tunnel connection create requests IBM will assign an ASN.
   *
   * @return the remoteBgpAsn
   */
  public String remoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address.  This field is required for and only applicable to type gre_tunnel connections.
   *
   * @return the remoteGatewayIp
   */
  public String remoteGatewayIp() {
    return remoteGatewayIp;
  }

  /**
   * Gets the remoteTunnelIp.
   *
   * Remote tunnel IP address.  This field is required for and only applicable to type gre_tunnel connections.  The
   * local_tunnel_ip and remote_tunnel_ip addresses must be in the same /30 network.  Neither can be the network nor
   * broadcast addresses.
   *
   * @return the remoteTunnelIp
   */
  public String remoteTunnelIp() {
    return remoteTunnelIp;
  }

  /**
   * Gets the zone.
   *
   * For network_type 'gre_tunnel' connections specify the connection's location.  The specified availability zone must
   * reside in the gateway's region.
   * Use the IBM Cloud global catalog to list zones within the desired region.
   * This field is required for and only applicable to network type 'gre_tunnel' connections.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

