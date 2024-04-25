/*
 * (C) Copyright IBM Corp. 2024.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TransitGatewayConnectionTemplate.
 *
 * Classes which extend this class:
 * - TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate
 * - TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate
 */
public class TransitGatewayConnectionTemplate extends GenericModel {

  /**
   * The type of network the Unbound GRE tunnel is targeting. This field is required for network type
   * 'unbound_gre_tunnel' connections. This field is required to be unspecified for network type 'classic',
   * 'directlink', 'vpc', 'power_virtual_server' and 'gre_tunnel' connections.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
  }

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
  }

  /**
   * Default setting of permit or deny which applies to any routes that don't match a specified filter. This field is
   * optional for network type 'classic', 'vpc', 'directlink', and 'power_virtual_server' connections. This field is
   * required to be unspecified for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   */
  public interface PrefixFiltersDefault {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  @SerializedName("base_connection_id")
  protected String baseConnectionId;
  @SerializedName("base_network_type")
  protected String baseNetworkType;
  @SerializedName("local_gateway_ip")
  protected String localGatewayIp;
  @SerializedName("local_tunnel_ip")
  protected String localTunnelIp;
  protected String name;
  @SerializedName("network_account_id")
  protected String networkAccountId;
  @SerializedName("network_id")
  protected String networkId;
  @SerializedName("network_type")
  protected String networkType;
  @SerializedName("prefix_filters")
  protected List<TransitGatewayConnectionPrefixFilter> prefixFilters;
  @SerializedName("prefix_filters_default")
  protected String prefixFiltersDefault;
  @SerializedName("remote_bgp_asn")
  protected Long remoteBgpAsn;
  @SerializedName("remote_gateway_ip")
  protected String remoteGatewayIp;
  @SerializedName("remote_tunnel_ip")
  protected String remoteTunnelIp;
  protected ZoneIdentity zone;
  protected List<TransitGatewayRedundantGRETunnelTemplate> tunnels;

  protected TransitGatewayConnectionTemplate() { }

  /**
   * Gets the baseConnectionId.
   *
   * network_type 'gre_tunnel' connections must be created over an existing network_type 'classic' connection. This
   * field must specify the ID of an active transit gateway network_type 'classic' connection in the same transit
   * gateway.
   *
   * This field is required for network type 'gre_tunnel' connections.
   *
   * This field is required to be unspecified for network type 'classic', 'directlink', 'vpc', 'power_virtual_server'
   * and 'unbound_gre_tunnel' connections.
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
   * 'unbound_gre_tunnel' connections. This field is required to be unspecified for network type 'classic',
   * 'directlink', 'vpc', 'power_virtual_server' and 'gre_tunnel' connections.
   *
   * @return the baseNetworkType
   */
  public String baseNetworkType() {
    return baseNetworkType;
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address. This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections. This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and
   * 'power_virtual_server' connections.
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
   * This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and 'power_virtual_server'
   * connections.
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
   * name of the VPC.  Network type 'classic' connections are named 'Classic'.
   *
   * This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * This field is optional for network type 'classic', 'directlink', 'vpc' and 'power_virtual_server' connections.
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
   * different account than the gateway. This field is required for type 'unbound_gre_tunnel' when the
   * associated_network_type is 'classic' and the GRE tunnel is in a different account than the gateway.
   *
   * @return the networkAccountId
   */
  public String networkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. For network types 'vpc','power_virtual_server' and
   * 'directlink' this is the CRN of the VPC / PowerVS / Direct Link gateway respectively. This field is required for
   * network type 'vpc', 'power_virtual_server' and 'directlink' connections. This field is required to be unspecified
   * for network type 'classic', 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
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
   * Gets the prefixFilters.
   *
   * Array of prefix route filters for a transit gateway connection. Prefix filters can be specified for netowrk type
   * 'vpc', 'classic', 'power_virtual_server' and 'directlink' connections. They are not allowed for type 'gre_tunnel'
   * connections. This is order dependent with those first in the array being applied first, and those at the end of the
   * array being applied last, or just before applying the default. This field is optional for network type 'classic',
   * 'vpc', 'directlink', and 'power_virtual_server' connections. This field is required to be unspecified for network
   * type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
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
   * optional for network type 'classic', 'vpc', 'directlink', and 'power_virtual_server' connections. This field is
   * required to be unspecified for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
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
   * 65200-65234, 65402-65433, 65500 and 4201065000-4201065999. If 'remote_bgp_asn' is omitted on gre_tunnel or
   * unbound_gre_tunnel connection create requests IBM will assign an ASN.
   *
   * This field is optional for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and 'power_virtual_server'
   * connections.
   *
   * @return the remoteBgpAsn
   */
  public Long remoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address. This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections. This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and
   * 'power_virtual_server' connections.
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
   * This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and 'power_virtual_server'
   * connections.
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
   * This field is required for network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * This field is required to be unspecified for network type 'classic', 'directlink', 'vpc' and 'power_virtual_server'
   * connections.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the tunnels.
   *
   * Array of GRE tunnels for a transit gateway redundant GRE tunnel connection.
   *
   * @return the tunnels
   */
  public List<TransitGatewayRedundantGRETunnelTemplate> tunnels() {
    return tunnels;
  }
}

