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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TransitGatewayConnectionCollectionConnectionsItem.
 *
 * Classes which extend this class:
 * - TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionNonRedundantGRETunnel
 * - TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionRedundantGRETunnel
 */
public class TransitGatewayConnectionCollectionConnectionsItem extends GenericModel {

  /**
   * The type of network the GRE tunnel is targeting.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
  }

  /**
   * Defines what type of network is connected via this connection. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field must tolerate unexpected values.
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
   * Default setting of permit or deny which applies to any routes that don't match a specified filter.
   */
  public interface PrefixFiltersDefault {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Only visible for cross account connections, this field represents the status of a connection request between IBM
   * Cloud accounts. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field must tolerate unexpected values.
   */
  public interface RequestStatus {
    /** pending. */
    String PENDING = "pending";
    /** approved. */
    String APPROVED = "approved";
    /** rejected. */
    String REJECTED = "rejected";
    /** expired. */
    String EXPIRED = "expired";
    /** detached. */
    String DETACHED = "detached";
  }

  /**
   * Connection's current configuration state. The list of enumerated values for this property may expand in the future.
   * Code and processes using this field must tolerate unexpected values.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** network_pending. */
    String NETWORK_PENDING = "network_pending";
    /** deleting. */
    String DELETING = "deleting";
    /** detaching. */
    String DETACHING = "detaching";
    /** detached. */
    String DETACHED = "detached";
    /** suspending. */
    String SUSPENDING = "suspending";
    /** suspended. */
    String SUSPENDED = "suspended";
  }

  @SerializedName("base_network_type")
  protected String baseNetworkType;
  protected String name;
  @SerializedName("network_id")
  protected String networkId;
  @SerializedName("network_type")
  protected String networkType;
  protected String id;
  @SerializedName("base_connection_id")
  protected String baseConnectionId;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("local_bgp_asn")
  protected Long localBgpAsn;
  @SerializedName("local_gateway_ip")
  protected String localGatewayIp;
  @SerializedName("local_tunnel_ip")
  protected String localTunnelIp;
  protected Long mtu;
  @SerializedName("network_account_id")
  protected String networkAccountId;
  @SerializedName("prefix_filters")
  protected List<TransitGatewayConnectionPrefixFilterReference> prefixFilters;
  @SerializedName("prefix_filters_default")
  protected String prefixFiltersDefault;
  @SerializedName("remote_bgp_asn")
  protected Long remoteBgpAsn;
  @SerializedName("remote_gateway_ip")
  protected String remoteGatewayIp;
  @SerializedName("remote_tunnel_ip")
  protected String remoteTunnelIp;
  @SerializedName("request_status")
  protected String requestStatus;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;
  protected GreTunnelZoneReference zone;
  protected List<TransitGatewayRedundantGRETunnelReference> tunnels;

  protected TransitGatewayConnectionCollectionConnectionsItem() { }

  /**
   * Gets the baseNetworkType.
   *
   * The type of network the GRE tunnel is targeting.
   *
   * @return the baseNetworkType
   */
  public String getBaseNetworkType() {
    return baseNetworkType;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway connection.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. This field is required for some types, such as 'vpc',
   * 'power_virtual_server' and 'directlink'. For network types 'vpc','power_virtual_server' and 'directlink' this is
   * the CRN of the VPC / PowerVS / Direct Link gateway respectively.
   *
   * @return the networkId
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * Gets the networkType.
   *
   * Defines what type of network is connected via this connection. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field must tolerate unexpected values.
   *
   * @return the networkType
   */
  public String getNetworkType() {
    return networkType;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this Transit Gateway Connection.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the baseConnectionId.
   *
   * network_type 'gre_tunnel' connections use 'base_connection_id' to specify the ID of a network_type 'classic'
   * connection the tunnel is configured over. The specified connection must reside in the same transit gateway and be
   * in an active state. The 'classic' connection cannot be deleted until any 'gre_tunnel' connections using it are
   * deleted. This field only applies to and is required for network type 'gre_tunnel' connections.
   *
   * @return the baseConnectionId
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public String getBaseConnectionId() {
    return baseConnectionId;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this connection was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the localBgpAsn.
   *
   * Local network BGP ASN.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * @return the localBgpAsn
   */
  public Long getLocalBgpAsn() {
    return localBgpAsn;
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections.
   *
   * @return the localGatewayIp
   */
  public String getLocalGatewayIp() {
    return localGatewayIp;
  }

  /**
   * Gets the localTunnelIp.
   *
   * Local tunnel IP address.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections.
   *
   * @return the localTunnelIp
   */
  public String getLocalTunnelIp() {
    return localTunnelIp;
  }

  /**
   * Gets the mtu.
   *
   * GRE tunnel MTU.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * @return the mtu
   */
  public Long getMtu() {
    return mtu;
  }

  /**
   * Gets the networkAccountId.
   *
   * The ID of the account which owns the connected network. Generally only used if the network is in a different IBM
   * Cloud account than the gateway.
   *
   * @return the networkAccountId
   */
  public String getNetworkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the prefixFilters.
   *
   * Array of prefix route filters for a transit gateway connection. This is order dependent with those first in the
   * array being applied first, and those at the end of the array is applied last, or just before the default.
   *
   * @return the prefixFilters
   */
  public List<TransitGatewayConnectionPrefixFilterReference> getPrefixFilters() {
    return prefixFilters;
  }

  /**
   * Gets the prefixFiltersDefault.
   *
   * Default setting of permit or deny which applies to any routes that don't match a specified filter.
   *
   * @return the prefixFiltersDefault
   */
  public String getPrefixFiltersDefault() {
    return prefixFiltersDefault;
  }

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel' connections.
   *
   * @return the remoteBgpAsn
   */
  public Long getRemoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections.
   *
   * @return the remoteGatewayIp
   */
  public String getRemoteGatewayIp() {
    return remoteGatewayIp;
  }

  /**
   * Gets the remoteTunnelIp.
   *
   * Remote tunnel IP address.  This field only applies to network type 'gre_tunnel' and 'unbound_gre_tunnel'
   * connections.
   *
   * @return the remoteTunnelIp
   */
  public String getRemoteTunnelIp() {
    return remoteTunnelIp;
  }

  /**
   * Gets the requestStatus.
   *
   * Only visible for cross account connections, this field represents the status of a connection request between IBM
   * Cloud accounts. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field must tolerate unexpected values.
   *
   * @return the requestStatus
   */
  public String getRequestStatus() {
    return requestStatus;
  }

  /**
   * Gets the status.
   *
   * Connection's current configuration state. The list of enumerated values for this property may expand in the future.
   * Code and processes using this field must tolerate unexpected values.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that this connection was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the zone.
   *
   * Location of GRE tunnel.  This field only applies to network type 'gre_tunnel' connections.
   *
   * @return the zone
   */
  public GreTunnelZoneReference getZone() {
    return zone;
  }

  /**
   * Gets the tunnels.
   *
   * Array of GRE tunnels for a transit gateway redundant GRE tunnel connection.
   *
   * @return the tunnels
   */
  public List<TransitGatewayRedundantGRETunnelReference> getTunnels() {
    return tunnels;
  }
}

