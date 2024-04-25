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
 * A create template for a Transit Gateway connection redundant GRE tunnel object.
 */
public class TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate extends TransitGatewayConnectionTemplate {

  /**
   * The type of network the GRE tunnel is targeting.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * Defines what type of network is connected via this connection.
   */
  public interface NetworkType {
    /** redundant_gre. */
    String REDUNDANT_GRE = "redundant_gre";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String baseNetworkType;
    private String name;
    private String networkAccountId;
    private String networkId;
    private String networkType;
    private List<TransitGatewayRedundantGRETunnelTemplate> tunnels;

    /**
     * Instantiates a new Builder from an existing TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate instance.
     *
     * @param transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate the instance to initialize the Builder with
     */
    public Builder(TransitGatewayConnectionTemplate transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate) {
      this.baseNetworkType = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.baseNetworkType;
      this.name = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.name;
      this.networkAccountId = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.networkAccountId;
      this.networkId = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.networkId;
      this.networkType = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.networkType;
      this.tunnels = transitGatewayConnectionTemplateTransitGatewayConnectionRedundantGreTemplate.tunnels;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param baseNetworkType the baseNetworkType
     * @param name the name
     * @param networkType the networkType
     * @param tunnels the tunnels
     */
    public Builder(String baseNetworkType, String name, String networkType, List<TransitGatewayRedundantGRETunnelTemplate> tunnels) {
      this.baseNetworkType = baseNetworkType;
      this.name = name;
      this.networkType = networkType;
      this.tunnels = tunnels;
    }

    /**
     * Builds a TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate.
     *
     * @return the new TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate instance
     */
    public TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate build() {
      return new TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate(this);
    }

    /**
     * Adds an tunnels to tunnels.
     *
     * @param tunnels the new tunnels
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder addTunnels(TransitGatewayRedundantGRETunnelTemplate tunnels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tunnels,
        "tunnels cannot be null");
      if (this.tunnels == null) {
        this.tunnels = new ArrayList<TransitGatewayRedundantGRETunnelTemplate>();
      }
      this.tunnels.add(tunnels);
      return this;
    }

    /**
     * Set the baseNetworkType.
     *
     * @param baseNetworkType the baseNetworkType
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder baseNetworkType(String baseNetworkType) {
      this.baseNetworkType = baseNetworkType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAccountId.
     *
     * @param networkAccountId the networkAccountId
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder networkAccountId(String networkAccountId) {
      this.networkAccountId = networkAccountId;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }

    /**
     * Set the networkType.
     *
     * @param networkType the networkType
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder networkType(String networkType) {
      this.networkType = networkType;
      return this;
    }

    /**
     * Set the tunnels.
     * Existing tunnels will be replaced.
     *
     * @param tunnels the tunnels
     * @return the TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
     */
    public Builder tunnels(List<TransitGatewayRedundantGRETunnelTemplate> tunnels) {
      this.tunnels = tunnels;
      return this;
    }
  }

  protected TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate() { }

  protected TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.baseNetworkType,
      "baseNetworkType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkType,
      "networkType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tunnels,
      "tunnels cannot be null");
    baseNetworkType = builder.baseNetworkType;
    name = builder.name;
    networkAccountId = builder.networkAccountId;
    networkId = builder.networkId;
    networkType = builder.networkType;
    tunnels = builder.tunnels;
  }

  /**
   * New builder.
   *
   * @return a TransitGatewayConnectionTemplateTransitGatewayConnectionRedundantGRETemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

