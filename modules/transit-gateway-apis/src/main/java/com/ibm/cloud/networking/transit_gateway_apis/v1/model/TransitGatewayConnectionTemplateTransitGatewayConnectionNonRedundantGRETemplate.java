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

import java.util.ArrayList;
import java.util.List;

/**
 * A create template for a Transit Gateway connection.
 */
public class TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate extends TransitGatewayConnectionTemplate {

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


  /**
   * Builder.
   */
  public static class Builder {
    private String baseConnectionId;
    private String baseNetworkType;
    private String localGatewayIp;
    private String localTunnelIp;
    private String name;
    private String networkAccountId;
    private String networkId;
    private String networkType;
    private List<TransitGatewayConnectionPrefixFilter> prefixFilters;
    private String prefixFiltersDefault;
    private Long remoteBgpAsn;
    private String remoteGatewayIp;
    private String remoteTunnelIp;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate instance.
     *
     * @param transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate the instance to initialize the Builder with
     */
    public Builder(TransitGatewayConnectionTemplate transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate) {
      this.baseConnectionId = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.baseConnectionId;
      this.baseNetworkType = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.baseNetworkType;
      this.localGatewayIp = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.localGatewayIp;
      this.localTunnelIp = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.localTunnelIp;
      this.name = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.name;
      this.networkAccountId = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.networkAccountId;
      this.networkId = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.networkId;
      this.networkType = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.networkType;
      this.prefixFilters = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.prefixFilters;
      this.prefixFiltersDefault = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.prefixFiltersDefault;
      this.remoteBgpAsn = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.remoteBgpAsn;
      this.remoteGatewayIp = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.remoteGatewayIp;
      this.remoteTunnelIp = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.remoteTunnelIp;
      this.zone = transitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGreTemplate.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param networkType the networkType
     */
    public Builder(String networkType) {
      this.networkType = networkType;
    }

    /**
     * Builds a TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate.
     *
     * @return the new TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate instance
     */
    public TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate build() {
      return new TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate(this);
    }

    /**
     * Adds an prefixFilters to prefixFilters.
     *
     * @param prefixFilters the new prefixFilters
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
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
     * Set the baseConnectionId.
     *
     * @param baseConnectionId the baseConnectionId
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
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
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder baseNetworkType(String baseNetworkType) {
      this.baseNetworkType = baseNetworkType;
      return this;
    }

    /**
     * Set the localGatewayIp.
     *
     * @param localGatewayIp the localGatewayIp
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder localGatewayIp(String localGatewayIp) {
      this.localGatewayIp = localGatewayIp;
      return this;
    }

    /**
     * Set the localTunnelIp.
     *
     * @param localTunnelIp the localTunnelIp
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder localTunnelIp(String localTunnelIp) {
      this.localTunnelIp = localTunnelIp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAccountId.
     *
     * @param networkAccountId the networkAccountId
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder networkAccountId(String networkAccountId) {
      this.networkAccountId = networkAccountId;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }

    /**
     * Set the networkType.
     *
     * @param networkType the networkType
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder networkType(String networkType) {
      this.networkType = networkType;
      return this;
    }

    /**
     * Set the prefixFilters.
     * Existing prefixFilters will be replaced.
     *
     * @param prefixFilters the prefixFilters
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder prefixFilters(List<TransitGatewayConnectionPrefixFilter> prefixFilters) {
      this.prefixFilters = prefixFilters;
      return this;
    }

    /**
     * Set the prefixFiltersDefault.
     *
     * @param prefixFiltersDefault the prefixFiltersDefault
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder prefixFiltersDefault(String prefixFiltersDefault) {
      this.prefixFiltersDefault = prefixFiltersDefault;
      return this;
    }

    /**
     * Set the remoteBgpAsn.
     *
     * @param remoteBgpAsn the remoteBgpAsn
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder remoteBgpAsn(long remoteBgpAsn) {
      this.remoteBgpAsn = remoteBgpAsn;
      return this;
    }

    /**
     * Set the remoteGatewayIp.
     *
     * @param remoteGatewayIp the remoteGatewayIp
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder remoteGatewayIp(String remoteGatewayIp) {
      this.remoteGatewayIp = remoteGatewayIp;
      return this;
    }

    /**
     * Set the remoteTunnelIp.
     *
     * @param remoteTunnelIp the remoteTunnelIp
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder remoteTunnelIp(String remoteTunnelIp) {
      this.remoteTunnelIp = remoteTunnelIp;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate() { }

  protected TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkType,
      "networkType cannot be null");
    baseConnectionId = builder.baseConnectionId;
    baseNetworkType = builder.baseNetworkType;
    localGatewayIp = builder.localGatewayIp;
    localTunnelIp = builder.localTunnelIp;
    name = builder.name;
    networkAccountId = builder.networkAccountId;
    networkId = builder.networkId;
    networkType = builder.networkType;
    prefixFilters = builder.prefixFilters;
    prefixFiltersDefault = builder.prefixFiltersDefault;
    remoteBgpAsn = builder.remoteBgpAsn;
    remoteGatewayIp = builder.remoteGatewayIp;
    remoteTunnelIp = builder.remoteTunnelIp;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a TransitGatewayConnectionTemplateTransitGatewayConnectionNonRedundantGRETemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

