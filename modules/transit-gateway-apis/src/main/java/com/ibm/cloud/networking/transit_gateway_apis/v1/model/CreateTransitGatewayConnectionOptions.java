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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayConnection options.
 */
public class CreateTransitGatewayConnectionOptions extends GenericModel {

  /**
   * Defines what type of network is connected via this connection.
   */
  public interface NetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** directlink. */
    String DIRECTLINK = "directlink";
    /** gre_tunnel. */
    String GRE_TUNNEL = "gre_tunnel";
    /** unbound_gre_tunnel. */
    String UNBOUND_GRE_TUNNEL = "unbound_gre_tunnel";
    /** vpc. */
    String VPC = "vpc";
    /** power_virtual_server. */
    String POWER_VIRTUAL_SERVER = "power_virtual_server";
    /** redundant_gre. */
    String REDUNDANT_GRE = "redundant_gre";
    /** vpn_gateway. */
    String VPN_GATEWAY = "vpn_gateway";
  }

  /**
   * The type of network the Unbound GRE tunnel is targeting. This field is required for network type
   * `unbound_gre_tunnel` and must be set to `classic`.  For a `redundant_gre` network type, the value is required and
   * can be either VPC or Classic. This field is required to be unspecified for network type `classic`, `directlink`,
   * `vpc`, `power_virtual_server`, `vpn_gateway` and `gre_tunnel` connections.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * Default setting of permit or deny which applies to any routes that don't match a specified filter. This field is
   * optional for network type `classic`, `vpc`, `directlink`, and `power_virtual_server` connections. This field is
   * required to be unspecified for network type `gre_tunnel`, `unbound_gre_tunnel`, `vpn_gateway` and `redundant_gre`
   * connections.
   */
  public interface PrefixFiltersDefault {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  protected String transitGatewayId;
  protected String networkType;
  protected String baseConnectionId;
  protected String baseNetworkType;
  protected String cidr;
  protected String localGatewayIp;
  protected String localTunnelIp;
  protected String name;
  protected String networkAccountId;
  protected String networkId;
  protected List<TransitGatewayConnectionPrefixFilter> prefixFilters;
  protected String prefixFiltersDefault;
  protected Long remoteBgpAsn;
  protected String remoteGatewayIp;
  protected String remoteTunnelIp;
  protected List<TransitGatewayTunnelTemplate> tunnels;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String networkType;
    private String baseConnectionId;
    private String baseNetworkType;
    private String cidr;
    private String localGatewayIp;
    private String localTunnelIp;
    private String name;
    private String networkAccountId;
    private String networkId;
    private List<TransitGatewayConnectionPrefixFilter> prefixFilters;
    private String prefixFiltersDefault;
    private Long remoteBgpAsn;
    private String remoteGatewayIp;
    private String remoteTunnelIp;
    private List<TransitGatewayTunnelTemplate> tunnels;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayConnectionOptions instance.
     *
     * @param createTransitGatewayConnectionOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayConnectionOptions createTransitGatewayConnectionOptions) {
      this.transitGatewayId = createTransitGatewayConnectionOptions.transitGatewayId;
      this.networkType = createTransitGatewayConnectionOptions.networkType;
      this.baseConnectionId = createTransitGatewayConnectionOptions.baseConnectionId;
      this.baseNetworkType = createTransitGatewayConnectionOptions.baseNetworkType;
      this.cidr = createTransitGatewayConnectionOptions.cidr;
      this.localGatewayIp = createTransitGatewayConnectionOptions.localGatewayIp;
      this.localTunnelIp = createTransitGatewayConnectionOptions.localTunnelIp;
      this.name = createTransitGatewayConnectionOptions.name;
      this.networkAccountId = createTransitGatewayConnectionOptions.networkAccountId;
      this.networkId = createTransitGatewayConnectionOptions.networkId;
      this.prefixFilters = createTransitGatewayConnectionOptions.prefixFilters;
      this.prefixFiltersDefault = createTransitGatewayConnectionOptions.prefixFiltersDefault;
      this.remoteBgpAsn = createTransitGatewayConnectionOptions.remoteBgpAsn;
      this.remoteGatewayIp = createTransitGatewayConnectionOptions.remoteGatewayIp;
      this.remoteTunnelIp = createTransitGatewayConnectionOptions.remoteTunnelIp;
      this.tunnels = createTransitGatewayConnectionOptions.tunnels;
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
     * Adds a new element to prefixFilters.
     *
     * @param prefixFilters the new element to be added
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder addPrefixFilters(TransitGatewayConnectionPrefixFilter prefixFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(prefixFilters,
        "prefixFilters cannot be null");
      if (this.prefixFilters == null) {
        this.prefixFilters = new ArrayList<TransitGatewayConnectionPrefixFilter>();
      }
      this.prefixFilters.add(prefixFilters);
      return this;
    }

    /**
     * Adds a new element to tunnels.
     *
     * @param tunnels the new element to be added
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder addTunnels(TransitGatewayTunnelTemplate tunnels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tunnels,
        "tunnels cannot be null");
      if (this.tunnels == null) {
        this.tunnels = new ArrayList<TransitGatewayTunnelTemplate>();
      }
      this.tunnels.add(tunnels);
      return this;
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
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder baseConnectionId(String baseConnectionId) {
      this.baseConnectionId = baseConnectionId;
      return this;
    }

    /**
     * Set the baseNetworkType.
     *
     * @param baseNetworkType the baseNetworkType
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder baseNetworkType(String baseNetworkType) {
      this.baseNetworkType = baseNetworkType;
      return this;
    }

    /**
     * Set the cidr.
     *
     * @param cidr the cidr
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder cidr(String cidr) {
      this.cidr = cidr;
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
     * Set the prefixFilters.
     * Existing prefixFilters will be replaced.
     *
     * @param prefixFilters the prefixFilters
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder prefixFilters(List<TransitGatewayConnectionPrefixFilter> prefixFilters) {
      this.prefixFilters = prefixFilters;
      return this;
    }

    /**
     * Set the prefixFiltersDefault.
     *
     * @param prefixFiltersDefault the prefixFiltersDefault
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder prefixFiltersDefault(String prefixFiltersDefault) {
      this.prefixFiltersDefault = prefixFiltersDefault;
      return this;
    }

    /**
     * Set the remoteBgpAsn.
     *
     * @param remoteBgpAsn the remoteBgpAsn
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder remoteBgpAsn(long remoteBgpAsn) {
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
     * Set the tunnels.
     * Existing tunnels will be replaced.
     *
     * @param tunnels the tunnels
     * @return the CreateTransitGatewayConnectionOptions builder
     */
    public Builder tunnels(List<TransitGatewayTunnelTemplate> tunnels) {
      this.tunnels = tunnels;
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

  protected CreateTransitGatewayConnectionOptions() { }

  protected CreateTransitGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkType,
      "networkType cannot be null");
    transitGatewayId = builder.transitGatewayId;
    networkType = builder.networkType;
    baseConnectionId = builder.baseConnectionId;
    baseNetworkType = builder.baseNetworkType;
    cidr = builder.cidr;
    localGatewayIp = builder.localGatewayIp;
    localTunnelIp = builder.localTunnelIp;
    name = builder.name;
    networkAccountId = builder.networkAccountId;
    networkId = builder.networkId;
    prefixFilters = builder.prefixFilters;
    prefixFiltersDefault = builder.prefixFiltersDefault;
    remoteBgpAsn = builder.remoteBgpAsn;
    remoteGatewayIp = builder.remoteGatewayIp;
    remoteTunnelIp = builder.remoteTunnelIp;
    tunnels = builder.tunnels;
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
   * Defines what type of network is connected via this connection.
   *
   * @return the networkType
   */
  public String networkType() {
    return networkType;
  }

  /**
   * Gets the baseConnectionId.
   *
   * network_type `gre_tunnel` connections must be created over an existing network_type `classic` connection. This
   * field must specify the ID of an active transit gateway network_type `classic` connection in the same transit
   * gateway.
   *
   * This field is required for network type `gre_tunnel` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`,
   * `power_virtual_server`, `unbound_gre_tunnel`, `vpn_gateway` and `redundant_gre` connections.
   *
   * @return the baseConnectionId
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public String baseConnectionId() {
    return baseConnectionId;
  }

  /**
   * Gets the baseNetworkType.
   *
   * The type of network the Unbound GRE tunnel is targeting. This field is required for network type
   * `unbound_gre_tunnel` and must be set to `classic`.  For a `redundant_gre` network type, the value is required and
   * can be either VPC or Classic. This field is required to be unspecified for network type `classic`, `directlink`,
   * `vpc`, `power_virtual_server`, `vpn_gateway` and `gre_tunnel` connections.
   *
   * @return the baseNetworkType
   */
  public String baseNetworkType() {
    return baseNetworkType;
  }

  /**
   * Gets the cidr.
   *
   * network_type 'vpn_gateway' connections use 'cidr' to specify the CIDR to use for the VPN GRE tunnels.
   *
   * This field is required for network type `vpn_gateway` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`, `power_virtual_server`,
   * `gre_tunnel`, `unbound_gre_tunnel`, and `redundant_gre` connections.
   *
   * @return the cidr
   */
  public String cidr() {
    return cidr;
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address. This field is required for network type `gre_tunnel` and `unbound_gre_tunnel`
   * connections. This field is required to be unspecified for network type `classic`, `directlink`, `vpc`,
   * `power_virtual_server`, `vpn_gateway` and `redundant_gre` connections.
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
   * This field is required for network type `gre_tunnel` and `unbound_gre_tunnel` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`, `power_virtual_server`,
   * `vpn_gateway` and `redundant_gre` connections.
   *
   * @return the localTunnelIp
   */
  public String localTunnelIp() {
    return localTunnelIp;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway connection. Network type `vpc`  connections are defaulted to the
   * name of the VPC.  Network type `classic` connections are named `classic`.
   *
   * This field is required for network type `power_virtual_server`, `directlink`, `gre_tunnel`, `unbound_gre_tunnel`,
   * `vpn_gateway` and `redundant_gre` connections.
   *
   * This field is optional for network type `classic`, `vpc` connections.
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
   * different account than the gateway. This field is required for type `unbound_gre_tunnel` when the
   * associated_network_type is `classic` or network_type is `redundant_gre` and the GRE tunnel is in a different
   * account than the gateway.
   *
   * @return the networkAccountId
   */
  public String networkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. For network types `vpc`,`power_virtual_server`,
   * `directlink` and `vpn_gateway` this is the CRN of the VPC / PowerVS / VDC / Direct Link / VPN gateway respectively.
   * This field is required for network type `vpc`, `power_virtual_server`, `vpn_gateway`, and `directlink` connections.
   *  It is also required for `redundant_gre` connections when the base_network_type is set to VPC. This field is
   * required to be unspecified for network type `classic`, `gre_tunnel` and `unbound_gre_tunnel` connections.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }

  /**
   * Gets the prefixFilters.
   *
   * Array of prefix route filters for a transit gateway connection. Prefix filters can be specified for netowrk type
   * `vpc`, `classic`, `power_virtual_server` and `directlink` connections. They are not allowed for type `gre_tunnel`
   * connections. This is order dependent with those first in the array being applied first, and those at the end of the
   * array being applied last, or just before applying the default. This field is optional for network type `classic`,
   * `vpc`, `directlink`, and `power_virtual_server` connections. This field is required to be unspecified for network
   * type `gre_tunnel`, `unbound_gre_tunnel`, `vpn_gateway` and `redundant_gre` connections.
   *
   * @return the prefixFilters
   */
  public List<TransitGatewayConnectionPrefixFilter> prefixFilters() {
    return prefixFilters;
  }

  /**
   * Gets the prefixFiltersDefault.
   *
   * Default setting of permit or deny which applies to any routes that don't match a specified filter. This field is
   * optional for network type `classic`, `vpc`, `directlink`, and `power_virtual_server` connections. This field is
   * required to be unspecified for network type `gre_tunnel`, `unbound_gre_tunnel`, `vpn_gateway` and `redundant_gre`
   * connections.
   *
   * @return the prefixFiltersDefault
   */
  public String prefixFiltersDefault() {
    return prefixFiltersDefault;
  }

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN. The following ASN values are reserved and unavailable 0, 13884, 36351, 64512-64513, 65100,
   * 65200-65234, 65402-65433, 65500 and 4201065000-4201065999. If `remote_bgp_asn` is omitted on gre_tunnel or
   * unbound_gre_tunnel connection create requests IBM will assign an ASN.
   *
   * This field is optional for network type `gre_tunnel` and `unbound_gre_tunnel` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`, `power_virtual_server`,
   * `vpn_gateway` and `gre_tunnel` connections.
   *
   * @return the remoteBgpAsn
   */
  public Long remoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address. This field is required for network type `gre_tunnel` and `unbound_gre_tunnel`
   * connections. This field is required to be unspecified for network type `classic`, `directlink`, `vpc`,
   * `power_virtual_server`, `vpn_gateway` and `redundant_gre` connections.
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
   * This field is required for network type `gre_tunnel` and `unbound_gre_tunnel` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`,  `power_virtual_server`,
   * `vpn_gateway` and `redundant_gre` connections.
   *
   * @return the remoteTunnelIp
   */
  public String remoteTunnelIp() {
    return remoteTunnelIp;
  }

  /**
   * Gets the tunnels.
   *
   * Array of GRE tunnels for a transit gateway `redundant_gre` and `vpn_gateway` connections.  This field is required
   * for `redundant_gre` and `vpn_gateway` connections.
   *
   * @return the tunnels
   */
  public List<TransitGatewayTunnelTemplate> tunnels() {
    return tunnels;
  }

  /**
   * Gets the zone.
   *
   * Specify the connection's location.  The specified availability zone must reside in the gateway's region.
   * Use the IBM Cloud global catalog to list zones within the desired region.
   *
   * This field is required for network type `gre_tunnel`, `unbound_gre_tunnel` and `vpn_gateway` connections.
   *
   * This field is required to be unspecified for network type `classic`, `directlink`, `vpc`, `power_virtual_server`
   * and `redundant_gre` connections.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

