/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.direct_link_apis.v1.model;

/**
 * Gateway fields specific to type=connect gateway create.
 */
public class GatewayTemplateGatewayTypeConnectTemplate extends GatewayTemplate {

  /**
   * Gateway type.
   */
  public interface Type {
    /** connect. */
    String CONNECT = "connect";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Long bgpAsn;
    private String bgpBaseCidr;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private Boolean global;
    private Boolean metered;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private Long speedMbps;
    private String type;
    private GatewayPortIdentity port;

    public Builder(GatewayTemplate gatewayTemplateGatewayTypeConnectTemplate) {
      this.bgpAsn = gatewayTemplateGatewayTypeConnectTemplate.bgpAsn;
      this.bgpBaseCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpBaseCidr;
      this.bgpCerCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpCerCidr;
      this.bgpIbmCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpIbmCidr;
      this.global = gatewayTemplateGatewayTypeConnectTemplate.global;
      this.metered = gatewayTemplateGatewayTypeConnectTemplate.metered;
      this.name = gatewayTemplateGatewayTypeConnectTemplate.name;
      this.resourceGroup = gatewayTemplateGatewayTypeConnectTemplate.resourceGroup;
      this.speedMbps = gatewayTemplateGatewayTypeConnectTemplate.speedMbps;
      this.type = gatewayTemplateGatewayTypeConnectTemplate.type;
      this.port = gatewayTemplateGatewayTypeConnectTemplate.port;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bgpAsn the bgpAsn
     * @param bgpBaseCidr the bgpBaseCidr
     * @param global the global
     * @param metered the metered
     * @param name the name
     * @param speedMbps the speedMbps
     * @param type the type
     * @param port the port
     */
    public Builder(Long bgpAsn, String bgpBaseCidr, Boolean global, Boolean metered, String name, Long speedMbps, String type, GatewayPortIdentity port) {
      this.bgpAsn = bgpAsn;
      this.bgpBaseCidr = bgpBaseCidr;
      this.global = global;
      this.metered = metered;
      this.name = name;
      this.speedMbps = speedMbps;
      this.type = type;
      this.port = port;
    }

    /**
     * Builds a GatewayTemplateGatewayTypeConnectTemplate.
     *
     * @return the new GatewayTemplateGatewayTypeConnectTemplate instance
     */
    public GatewayTemplateGatewayTypeConnectTemplate build() {
      return new GatewayTemplateGatewayTypeConnectTemplate(this);
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the bgpBaseCidr.
     *
     * @param bgpBaseCidr the bgpBaseCidr
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder bgpBaseCidr(String bgpBaseCidr) {
      this.bgpBaseCidr = bgpBaseCidr;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder port(GatewayPortIdentity port) {
      this.port = port;
      return this;
    }
  }

  protected GatewayTemplateGatewayTypeConnectTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bgpAsn,
      "bgpAsn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bgpBaseCidr,
      "bgpBaseCidr cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.global,
      "global cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metered,
      "metered cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.speedMbps,
      "speedMbps cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    bgpAsn = builder.bgpAsn;
    bgpBaseCidr = builder.bgpBaseCidr;
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
    global = builder.global;
    metered = builder.metered;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    speedMbps = builder.speedMbps;
    type = builder.type;
    port = builder.port;
  }

  /**
   * New builder.
   *
   * @return a GatewayTemplateGatewayTypeConnectTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

