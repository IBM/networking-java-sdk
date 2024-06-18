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

package com.ibm.cloud.networking.transit_gateway_api.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details for a redundant GRE tunnel.
 */
public class TransitGatewayTunnel extends GenericModel {

  /**
   * The type of network the redundant GRE tunnel is targeting.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * Tunnel's current configuration state. The list of enumerated values for this property may expand in the future.
   * Code and processes using this field must tolerate unexpected values.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
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
  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  @SerializedName("local_bgp_asn")
  protected Long localBgpAsn;
  @SerializedName("local_gateway_ip")
  protected String localGatewayIp;
  @SerializedName("local_tunnel_ip")
  protected String localTunnelIp;
  protected Long mtu;
  protected String name;
  @SerializedName("network_account_id")
  protected String networkAccountId;
  @SerializedName("network_id")
  protected String networkId;
  @SerializedName("remote_bgp_asn")
  protected Long remoteBgpAsn;
  @SerializedName("remote_gateway_ip")
  protected String remoteGatewayIp;
  @SerializedName("remote_tunnel_ip")
  protected String remoteTunnelIp;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;
  protected ZoneReference zone;

  protected TransitGatewayTunnel() { }

  /**
   * Gets the baseNetworkType.
   *
   * The type of network the redundant GRE tunnel is targeting.
   *
   * @return the baseNetworkType
   */
  public String getBaseNetworkType() {
    return baseNetworkType;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this GRE tunnel was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this redundant GRE tunnel.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the localBgpAsn.
   *
   * Local network BGP ASN.  It is assigned by IBM when the tunnel is created.
   *
   * @return the localBgpAsn
   */
  public Long getLocalBgpAsn() {
    return localBgpAsn;
  }

  /**
   * Gets the localGatewayIp.
   *
   * Local gateway IP address.
   *
   * @return the localGatewayIp
   */
  public String getLocalGatewayIp() {
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
  public String getLocalTunnelIp() {
    return localTunnelIp;
  }

  /**
   * Gets the mtu.
   *
   * GRE tunnel MTU.
   *
   * @return the mtu
   */
  public Long getMtu() {
    return mtu;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this tunnel.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAccountId.
   *
   * The ID of the account for cross account Classic connections.  This field is required when the GRE tunnel is in a
   * different account than the gateway and the base network is Classic.
   *
   * @return the networkAccountId
   */
  public String getNetworkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network VPC being connected via this connection.
   *
   * @return the networkId
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN. The following ASN values are reserved and unavailable 0, 13884, 36351, 64512-64513, 65100,
   * 65200-65234, 65402-65433, 65500 and 4201065000-4201065999. If `remote_bgp_asn` is omitted on create requests, IBM
   * will assign an ASN.
   *
   * @return the remoteBgpAsn
   */
  public Long getRemoteBgpAsn() {
    return remoteBgpAsn;
  }

  /**
   * Gets the remoteGatewayIp.
   *
   * Remote gateway IP address.
   *
   * @return the remoteGatewayIp
   */
  public String getRemoteGatewayIp() {
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
  public String getRemoteTunnelIp() {
    return remoteTunnelIp;
  }

  /**
   * Gets the status.
   *
   * Tunnel's current configuration state. The list of enumerated values for this property may expand in the future.
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
   * The date and time that this tunnel was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the zone.
   *
   * Availability zone reference.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

