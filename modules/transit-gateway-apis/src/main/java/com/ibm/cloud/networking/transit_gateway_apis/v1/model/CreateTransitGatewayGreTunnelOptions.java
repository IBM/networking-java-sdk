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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createTransitGatewayGreTunnel options.
 */
public class CreateTransitGatewayGreTunnelOptions extends GenericModel {

  protected String transitGatewayId;
  protected String id;
  protected String localGatewayIp;
  protected String localTunnelIp;
  protected String name;
  protected String remoteGatewayIp;
  protected String remoteTunnelIp;
  protected ZoneIdentity zone;
  protected Long remoteBgpAsn;

  /**
   * Builder.
   */
  public static class Builder {
    private String transitGatewayId;
    private String id;
    private String localGatewayIp;
    private String localTunnelIp;
    private String name;
    private String remoteGatewayIp;
    private String remoteTunnelIp;
    private ZoneIdentity zone;
    private Long remoteBgpAsn;

    /**
     * Instantiates a new Builder from an existing CreateTransitGatewayGreTunnelOptions instance.
     *
     * @param createTransitGatewayGreTunnelOptions the instance to initialize the Builder with
     */
    private Builder(CreateTransitGatewayGreTunnelOptions createTransitGatewayGreTunnelOptions) {
      this.transitGatewayId = createTransitGatewayGreTunnelOptions.transitGatewayId;
      this.id = createTransitGatewayGreTunnelOptions.id;
      this.localGatewayIp = createTransitGatewayGreTunnelOptions.localGatewayIp;
      this.localTunnelIp = createTransitGatewayGreTunnelOptions.localTunnelIp;
      this.name = createTransitGatewayGreTunnelOptions.name;
      this.remoteGatewayIp = createTransitGatewayGreTunnelOptions.remoteGatewayIp;
      this.remoteTunnelIp = createTransitGatewayGreTunnelOptions.remoteTunnelIp;
      this.zone = createTransitGatewayGreTunnelOptions.zone;
      this.remoteBgpAsn = createTransitGatewayGreTunnelOptions.remoteBgpAsn;
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
     * @param id the id
     * @param localGatewayIp the localGatewayIp
     * @param localTunnelIp the localTunnelIp
     * @param name the name
     * @param remoteGatewayIp the remoteGatewayIp
     * @param remoteTunnelIp the remoteTunnelIp
     * @param zone the zone
     */
    public Builder(String transitGatewayId, String id, String localGatewayIp, String localTunnelIp, String name, String remoteGatewayIp, String remoteTunnelIp, ZoneIdentity zone) {
      this.transitGatewayId = transitGatewayId;
      this.id = id;
      this.localGatewayIp = localGatewayIp;
      this.localTunnelIp = localTunnelIp;
      this.name = name;
      this.remoteGatewayIp = remoteGatewayIp;
      this.remoteTunnelIp = remoteTunnelIp;
      this.zone = zone;
    }

    /**
     * Builds a CreateTransitGatewayGreTunnelOptions.
     *
     * @return the new CreateTransitGatewayGreTunnelOptions instance
     */
    public CreateTransitGatewayGreTunnelOptions build() {
      return new CreateTransitGatewayGreTunnelOptions(this);
    }

    /**
     * Set the transitGatewayId.
     *
     * @param transitGatewayId the transitGatewayId
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder transitGatewayId(String transitGatewayId) {
      this.transitGatewayId = transitGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the localGatewayIp.
     *
     * @param localGatewayIp the localGatewayIp
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder localGatewayIp(String localGatewayIp) {
      this.localGatewayIp = localGatewayIp;
      return this;
    }

    /**
     * Set the localTunnelIp.
     *
     * @param localTunnelIp the localTunnelIp
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder localTunnelIp(String localTunnelIp) {
      this.localTunnelIp = localTunnelIp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the remoteGatewayIp.
     *
     * @param remoteGatewayIp the remoteGatewayIp
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder remoteGatewayIp(String remoteGatewayIp) {
      this.remoteGatewayIp = remoteGatewayIp;
      return this;
    }

    /**
     * Set the remoteTunnelIp.
     *
     * @param remoteTunnelIp the remoteTunnelIp
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder remoteTunnelIp(String remoteTunnelIp) {
      this.remoteTunnelIp = remoteTunnelIp;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the remoteBgpAsn.
     *
     * @param remoteBgpAsn the remoteBgpAsn
     * @return the CreateTransitGatewayGreTunnelOptions builder
     */
    public Builder remoteBgpAsn(long remoteBgpAsn) {
      this.remoteBgpAsn = remoteBgpAsn;
      return this;
    }
  }

  protected CreateTransitGatewayGreTunnelOptions() { }

  protected CreateTransitGatewayGreTunnelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.transitGatewayId,
      "transitGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
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
    transitGatewayId = builder.transitGatewayId;
    id = builder.id;
    localGatewayIp = builder.localGatewayIp;
    localTunnelIp = builder.localTunnelIp;
    name = builder.name;
    remoteGatewayIp = builder.remoteGatewayIp;
    remoteTunnelIp = builder.remoteTunnelIp;
    zone = builder.zone;
    remoteBgpAsn = builder.remoteBgpAsn;
  }

  /**
   * New builder.
   *
   * @return a CreateTransitGatewayGreTunnelOptions builder
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
   * Gets the id.
   *
   * The connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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

  /**
   * Gets the remoteBgpAsn.
   *
   * Remote network BGP ASN. The following ASN values are reserved and unavailable 0, 13884, 36351, 64512-64513, 65100,
   * 65200-65234, 65402-65433, 65500 and 4201065000-4201065999. If 'remote_bgp_asn' is omitted on create requests, IBM
   * will assign an ASN.
   *
   * @return the remoteBgpAsn
   */
  public Long remoteBgpAsn() {
    return remoteBgpAsn;
  }
}

