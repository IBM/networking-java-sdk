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
 * Gateway fields specific to type=connect gateway create.
 */
public class GatewayTemplateGatewayTypeConnectTemplate extends GatewayTemplate {

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
    private GatewayPortIdentity port;

    /**
     * Instantiates a new Builder from an existing GatewayTemplateGatewayTypeConnectTemplate instance.
     *
     * @param gatewayTemplateGatewayTypeConnectTemplate the instance to initialize the Builder with
     */
    public Builder(GatewayTemplate gatewayTemplateGatewayTypeConnectTemplate) {
      this.asPrepends = gatewayTemplateGatewayTypeConnectTemplate.asPrepends;
      this.authenticationKey = gatewayTemplateGatewayTypeConnectTemplate.authenticationKey;
      this.bfdConfig = gatewayTemplateGatewayTypeConnectTemplate.bfdConfig;
      this.bgpAsn = gatewayTemplateGatewayTypeConnectTemplate.bgpAsn;
      this.bgpBaseCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpBaseCidr;
      this.bgpCerCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpCerCidr;
      this.bgpIbmCidr = gatewayTemplateGatewayTypeConnectTemplate.bgpIbmCidr;
      this.connectionMode = gatewayTemplateGatewayTypeConnectTemplate.connectionMode;
      this.defaultExportRouteFilter = gatewayTemplateGatewayTypeConnectTemplate.defaultExportRouteFilter;
      this.defaultImportRouteFilter = gatewayTemplateGatewayTypeConnectTemplate.defaultImportRouteFilter;
      this.exportRouteFilters = gatewayTemplateGatewayTypeConnectTemplate.exportRouteFilters;
      this.global = gatewayTemplateGatewayTypeConnectTemplate.global;
      this.importRouteFilters = gatewayTemplateGatewayTypeConnectTemplate.importRouteFilters;
      this.metered = gatewayTemplateGatewayTypeConnectTemplate.metered;
      this.name = gatewayTemplateGatewayTypeConnectTemplate.name;
      this.patchPanelCompletionNotice = gatewayTemplateGatewayTypeConnectTemplate.patchPanelCompletionNotice;
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
     * @param global the global
     * @param metered the metered
     * @param name the name
     * @param speedMbps the speedMbps
     * @param type the type
     * @param port the port
     */
    public Builder(Long bgpAsn, Boolean global, Boolean metered, String name, Long speedMbps, String type, GatewayPortIdentity port) {
      this.bgpAsn = bgpAsn;
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
     * Adds a new element to asPrepends.
     *
     * @param asPrepends the new element to be added
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
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
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
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
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
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
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder asPrepends(List<AsPrependTemplate> asPrepends) {
      this.asPrepends = asPrepends;
      return this;
    }

    /**
     * Set the authenticationKey.
     *
     * @param authenticationKey the authenticationKey
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder authenticationKey(AuthenticationKeyIdentity authenticationKey) {
      this.authenticationKey = authenticationKey;
      return this;
    }

    /**
     * Set the bfdConfig.
     *
     * @param bfdConfig the bfdConfig
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder bfdConfig(GatewayBfdConfigTemplate bfdConfig) {
      this.bfdConfig = bfdConfig;
      return this;
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
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the defaultExportRouteFilter.
     *
     * @param defaultExportRouteFilter the defaultExportRouteFilter
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder defaultExportRouteFilter(String defaultExportRouteFilter) {
      this.defaultExportRouteFilter = defaultExportRouteFilter;
      return this;
    }

    /**
     * Set the defaultImportRouteFilter.
     *
     * @param defaultImportRouteFilter the defaultImportRouteFilter
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
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
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder exportRouteFilters(List<GatewayTemplateRouteFilter> exportRouteFilters) {
      this.exportRouteFilters = exportRouteFilters;
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
     * Set the importRouteFilters.
     * Existing importRouteFilters will be replaced.
     *
     * @param importRouteFilters the importRouteFilters
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder importRouteFilters(List<GatewayTemplateRouteFilter> importRouteFilters) {
      this.importRouteFilters = importRouteFilters;
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
     * Set the patchPanelCompletionNotice.
     *
     * @param patchPanelCompletionNotice the patchPanelCompletionNotice
     * @return the GatewayTemplateGatewayTypeConnectTemplate builder
     */
    public Builder patchPanelCompletionNotice(String patchPanelCompletionNotice) {
      this.patchPanelCompletionNotice = patchPanelCompletionNotice;
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

  protected GatewayTemplateGatewayTypeConnectTemplate() { }

  protected GatewayTemplateGatewayTypeConnectTemplate(Builder builder) {
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
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

