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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Gateway fields specific to type=dedicated gateway create.
 */
public class GatewayTemplateGatewayTypeDedicatedTemplate extends GatewayTemplate {

  /**
   * Type of services this Gateway is attached to. Mode transit means this Gateway will be attached to Transit Gateway
   * Service and direct means this Gateway will be attached to vpc or classic connection. The list of enumerated values
   * for this property may expand in the future. Code and processes using this field  must tolerate unexpected values.
   */
  public interface ConnectionMode {
    /** direct. */
    String DIRECT = "direct";
    /** transit. */
    String TRANSIT = "transit";
  }

  /**
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   */
  public interface DefaultExportRouteFilter {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   */
  public interface DefaultImportRouteFilter {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Offering type.
   */
  public interface Type {
    /** connect. */
    String CONNECT = "connect";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  /**
   * Indicates the direct link's MACsec capability. It must match one of the MACsec related `capabilities` of the
   * `cross_connect_router`.
   *
   * - non_macsec: The direct link does not support MACsec.
   * - macsec: The direct link supports MACsec. The MACsec feature must be enabled.
   * - macsec_optional: The direct link supports MACsec. The MACsec feature is not required and can be enabled after
   * direct link creation.
   *
   * If not explicitly provided, the field will be assigned with the following priorities based on
   * `cross_connect_router` capabilities and available ports:
   *   - `macsec` was not provided in the request
   *     - `non_macsec`
   *     - `macsec_optional`
   *   - `macsec` was provided in the request
   *     - `macsec_optional`
   *     - `macsec`.
   */
  public interface MacsecCapability {
    /** non_macsec. */
    String NON_MACSEC = "non_macsec";
    /** macsec. */
    String MACSEC = "macsec";
    /** macsec_optional. */
    String MACSEC_OPTIONAL = "macsec_optional";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private List<AsPrependTemplate> asPrepends;
    private AuthenticationKeyIdentity authenticationKey;
    private GatewayBfdConfigTemplate bfdConfig;
    private Long bgpAsn;
    private String bgpBaseCidr;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private String connectionMode;
    private String defaultExportRouteFilter;
    private String defaultImportRouteFilter;
    private List<GatewayTemplateRouteFilter> exportRouteFilters;
    private Boolean global;
    private List<GatewayTemplateRouteFilter> importRouteFilters;
    private Boolean metered;
    private String name;
    private String patchPanelCompletionNotice;
    private ResourceGroupIdentity resourceGroup;
    private Long speedMbps;
    private String type;
    private String carrierName;
    private String crossConnectRouter;
    private String customerName;
    private String locationName;
    private GatewayMacsecPrototype macsec;
    private String macsecCapability;
    private Long vlan;

    /**
     * Instantiates a new Builder from an existing GatewayTemplateGatewayTypeDedicatedTemplate instance.
     *
     * @param gatewayTemplateGatewayTypeDedicatedTemplate the instance to initialize the Builder with
     */
    public Builder(GatewayTemplate gatewayTemplateGatewayTypeDedicatedTemplate) {
      this.asPrepends = gatewayTemplateGatewayTypeDedicatedTemplate.asPrepends;
      this.authenticationKey = gatewayTemplateGatewayTypeDedicatedTemplate.authenticationKey;
      this.bfdConfig = gatewayTemplateGatewayTypeDedicatedTemplate.bfdConfig;
      this.bgpAsn = gatewayTemplateGatewayTypeDedicatedTemplate.bgpAsn;
      this.bgpBaseCidr = gatewayTemplateGatewayTypeDedicatedTemplate.bgpBaseCidr;
      this.bgpCerCidr = gatewayTemplateGatewayTypeDedicatedTemplate.bgpCerCidr;
      this.bgpIbmCidr = gatewayTemplateGatewayTypeDedicatedTemplate.bgpIbmCidr;
      this.connectionMode = gatewayTemplateGatewayTypeDedicatedTemplate.connectionMode;
      this.defaultExportRouteFilter = gatewayTemplateGatewayTypeDedicatedTemplate.defaultExportRouteFilter;
      this.defaultImportRouteFilter = gatewayTemplateGatewayTypeDedicatedTemplate.defaultImportRouteFilter;
      this.exportRouteFilters = gatewayTemplateGatewayTypeDedicatedTemplate.exportRouteFilters;
      this.global = gatewayTemplateGatewayTypeDedicatedTemplate.global;
      this.importRouteFilters = gatewayTemplateGatewayTypeDedicatedTemplate.importRouteFilters;
      this.metered = gatewayTemplateGatewayTypeDedicatedTemplate.metered;
      this.name = gatewayTemplateGatewayTypeDedicatedTemplate.name;
      this.patchPanelCompletionNotice = gatewayTemplateGatewayTypeDedicatedTemplate.patchPanelCompletionNotice;
      this.resourceGroup = gatewayTemplateGatewayTypeDedicatedTemplate.resourceGroup;
      this.speedMbps = gatewayTemplateGatewayTypeDedicatedTemplate.speedMbps;
      this.type = gatewayTemplateGatewayTypeDedicatedTemplate.type;
      this.carrierName = gatewayTemplateGatewayTypeDedicatedTemplate.carrierName;
      this.crossConnectRouter = gatewayTemplateGatewayTypeDedicatedTemplate.crossConnectRouter;
      this.customerName = gatewayTemplateGatewayTypeDedicatedTemplate.customerName;
      this.locationName = gatewayTemplateGatewayTypeDedicatedTemplate.locationName;
      this.macsec = gatewayTemplateGatewayTypeDedicatedTemplate.macsec;
      this.macsecCapability = gatewayTemplateGatewayTypeDedicatedTemplate.macsecCapability;
      this.vlan = gatewayTemplateGatewayTypeDedicatedTemplate.vlan;
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
     * @param global the global
     * @param metered the metered
     * @param name the name
     * @param speedMbps the speedMbps
     * @param type the type
     * @param carrierName the carrierName
     * @param crossConnectRouter the crossConnectRouter
     * @param customerName the customerName
     * @param locationName the locationName
     */
    public Builder(Long bgpAsn, Boolean global, Boolean metered, String name, Long speedMbps, String type, String carrierName, String crossConnectRouter, String customerName, String locationName) {
      this.bgpAsn = bgpAsn;
      this.global = global;
      this.metered = metered;
      this.name = name;
      this.speedMbps = speedMbps;
      this.type = type;
      this.carrierName = carrierName;
      this.crossConnectRouter = crossConnectRouter;
      this.customerName = customerName;
      this.locationName = locationName;
    }

    /**
     * Builds a GatewayTemplateGatewayTypeDedicatedTemplate.
     *
     * @return the new GatewayTemplateGatewayTypeDedicatedTemplate instance
     */
    public GatewayTemplateGatewayTypeDedicatedTemplate build() {
      return new GatewayTemplateGatewayTypeDedicatedTemplate(this);
    }

    /**
     * Adds a new element to asPrepends.
     *
     * @param asPrepends the new element to be added
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder addAsPrepends(AsPrependTemplate asPrepends) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(asPrepends,
        "asPrepends cannot be null");
      if (this.asPrepends == null) {
        this.asPrepends = new ArrayList<AsPrependTemplate>();
      }
      this.asPrepends.add(asPrepends);
      return this;
    }

    /**
     * Adds a new element to exportRouteFilters.
     *
     * @param exportRouteFilters the new element to be added
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder addExportRouteFilters(GatewayTemplateRouteFilter exportRouteFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(exportRouteFilters,
        "exportRouteFilters cannot be null");
      if (this.exportRouteFilters == null) {
        this.exportRouteFilters = new ArrayList<GatewayTemplateRouteFilter>();
      }
      this.exportRouteFilters.add(exportRouteFilters);
      return this;
    }

    /**
     * Adds a new element to importRouteFilters.
     *
     * @param importRouteFilters the new element to be added
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder addImportRouteFilters(GatewayTemplateRouteFilter importRouteFilters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(importRouteFilters,
        "importRouteFilters cannot be null");
      if (this.importRouteFilters == null) {
        this.importRouteFilters = new ArrayList<GatewayTemplateRouteFilter>();
      }
      this.importRouteFilters.add(importRouteFilters);
      return this;
    }

    /**
     * Set the asPrepends.
     * Existing asPrepends will be replaced.
     *
     * @param asPrepends the asPrepends
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder asPrepends(List<AsPrependTemplate> asPrepends) {
      this.asPrepends = asPrepends;
      return this;
    }

    /**
     * Set the authenticationKey.
     *
     * @param authenticationKey the authenticationKey
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder authenticationKey(AuthenticationKeyIdentity authenticationKey) {
      this.authenticationKey = authenticationKey;
      return this;
    }

    /**
     * Set the bfdConfig.
     *
     * @param bfdConfig the bfdConfig
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder bfdConfig(GatewayBfdConfigTemplate bfdConfig) {
      this.bfdConfig = bfdConfig;
      return this;
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the bgpBaseCidr.
     *
     * @param bgpBaseCidr the bgpBaseCidr
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder bgpBaseCidr(String bgpBaseCidr) {
      this.bgpBaseCidr = bgpBaseCidr;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the defaultExportRouteFilter.
     *
     * @param defaultExportRouteFilter the defaultExportRouteFilter
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder defaultExportRouteFilter(String defaultExportRouteFilter) {
      this.defaultExportRouteFilter = defaultExportRouteFilter;
      return this;
    }

    /**
     * Set the defaultImportRouteFilter.
     *
     * @param defaultImportRouteFilter the defaultImportRouteFilter
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder defaultImportRouteFilter(String defaultImportRouteFilter) {
      this.defaultImportRouteFilter = defaultImportRouteFilter;
      return this;
    }

    /**
     * Set the exportRouteFilters.
     * Existing exportRouteFilters will be replaced.
     *
     * @param exportRouteFilters the exportRouteFilters
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder exportRouteFilters(List<GatewayTemplateRouteFilter> exportRouteFilters) {
      this.exportRouteFilters = exportRouteFilters;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the importRouteFilters.
     * Existing importRouteFilters will be replaced.
     *
     * @param importRouteFilters the importRouteFilters
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder importRouteFilters(List<GatewayTemplateRouteFilter> importRouteFilters) {
      this.importRouteFilters = importRouteFilters;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the patchPanelCompletionNotice.
     *
     * @param patchPanelCompletionNotice the patchPanelCompletionNotice
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder patchPanelCompletionNotice(String patchPanelCompletionNotice) {
      this.patchPanelCompletionNotice = patchPanelCompletionNotice;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the carrierName.
     *
     * @param carrierName the carrierName
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder carrierName(String carrierName) {
      this.carrierName = carrierName;
      return this;
    }

    /**
     * Set the crossConnectRouter.
     *
     * @param crossConnectRouter the crossConnectRouter
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder crossConnectRouter(String crossConnectRouter) {
      this.crossConnectRouter = crossConnectRouter;
      return this;
    }

    /**
     * Set the customerName.
     *
     * @param customerName the customerName
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder customerName(String customerName) {
      this.customerName = customerName;
      return this;
    }

    /**
     * Set the locationName.
     *
     * @param locationName the locationName
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder locationName(String locationName) {
      this.locationName = locationName;
      return this;
    }

    /**
     * Set the macsec.
     *
     * @param macsec the macsec
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder macsec(GatewayMacsecPrototype macsec) {
      this.macsec = macsec;
      return this;
    }

    /**
     * Set the macsecCapability.
     *
     * @param macsecCapability the macsecCapability
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder macsecCapability(String macsecCapability) {
      this.macsecCapability = macsecCapability;
      return this;
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the GatewayTemplateGatewayTypeDedicatedTemplate builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected GatewayTemplateGatewayTypeDedicatedTemplate() { }

  protected GatewayTemplateGatewayTypeDedicatedTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bgpAsn,
      "bgpAsn cannot be null");
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.carrierName,
      "carrierName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crossConnectRouter,
      "crossConnectRouter cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.customerName,
      "customerName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locationName,
      "locationName cannot be null");
    asPrepends = builder.asPrepends;
    authenticationKey = builder.authenticationKey;
    bfdConfig = builder.bfdConfig;
    bgpAsn = builder.bgpAsn;
    bgpBaseCidr = builder.bgpBaseCidr;
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
    connectionMode = builder.connectionMode;
    defaultExportRouteFilter = builder.defaultExportRouteFilter;
    defaultImportRouteFilter = builder.defaultImportRouteFilter;
    exportRouteFilters = builder.exportRouteFilters;
    global = builder.global;
    importRouteFilters = builder.importRouteFilters;
    metered = builder.metered;
    name = builder.name;
    patchPanelCompletionNotice = builder.patchPanelCompletionNotice;
    resourceGroup = builder.resourceGroup;
    speedMbps = builder.speedMbps;
    type = builder.type;
    carrierName = builder.carrierName;
    crossConnectRouter = builder.crossConnectRouter;
    customerName = builder.customerName;
    locationName = builder.locationName;
    macsec = builder.macsec;
    macsecCapability = builder.macsecCapability;
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a GatewayTemplateGatewayTypeDedicatedTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

