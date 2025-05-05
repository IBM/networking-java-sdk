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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * patch gateway template.
 */
public class GatewayPatchTemplate extends GenericModel {

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
   * Gateway operational status.
   *
   * For gateways pending LOA approval, patch operational_status to the appropriate value to approve or reject its LOA.
   * When rejecting an LOA, provide reject reasoning in `loa_reject_reason`.
   *
   * Only allowed for type=dedicated gateways.
   */
  public interface OperationalStatus {
    /** loa_accepted. */
    String LOA_ACCEPTED = "loa_accepted";
    /** loa_rejected. */
    String LOA_REJECTED = "loa_rejected";
  }

  @SerializedName("authentication_key")
  protected AuthenticationKeyIdentity authenticationKey;
  @SerializedName("bfd_config")
  protected GatewayBfdPatchTemplate bfdConfig;
  @SerializedName("bgp_asn")
  protected Long bgpAsn;
  @SerializedName("bgp_cer_cidr")
  protected String bgpCerCidr;
  @SerializedName("bgp_ibm_cidr")
  protected String bgpIbmCidr;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("default_export_route_filter")
  protected String defaultExportRouteFilter;
  @SerializedName("default_import_route_filter")
  protected String defaultImportRouteFilter;
  protected Boolean global;
  @SerializedName("loa_reject_reason")
  protected String loaRejectReason;
  protected Boolean metered;
  protected String name;
  @SerializedName("operational_status")
  protected String operationalStatus;
  @SerializedName("patch_panel_completion_notice")
  protected String patchPanelCompletionNotice;
  @SerializedName("speed_mbps")
  protected Long speedMbps;
  protected Long vlan;

  /**
   * Builder.
   */
  public static class Builder {
    private AuthenticationKeyIdentity authenticationKey;
    private GatewayBfdPatchTemplate bfdConfig;
    private Long bgpAsn;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private String connectionMode;
    private String defaultExportRouteFilter;
    private String defaultImportRouteFilter;
    private Boolean global;
    private String loaRejectReason;
    private Boolean metered;
    private String name;
    private String operationalStatus;
    private String patchPanelCompletionNotice;
    private Long speedMbps;
    private Long vlan;

    /**
     * Instantiates a new Builder from an existing GatewayPatchTemplate instance.
     *
     * @param gatewayPatchTemplate the instance to initialize the Builder with
     */
    private Builder(GatewayPatchTemplate gatewayPatchTemplate) {
      this.authenticationKey = gatewayPatchTemplate.authenticationKey;
      this.bfdConfig = gatewayPatchTemplate.bfdConfig;
      this.bgpAsn = gatewayPatchTemplate.bgpAsn;
      this.bgpCerCidr = gatewayPatchTemplate.bgpCerCidr;
      this.bgpIbmCidr = gatewayPatchTemplate.bgpIbmCidr;
      this.connectionMode = gatewayPatchTemplate.connectionMode;
      this.defaultExportRouteFilter = gatewayPatchTemplate.defaultExportRouteFilter;
      this.defaultImportRouteFilter = gatewayPatchTemplate.defaultImportRouteFilter;
      this.global = gatewayPatchTemplate.global;
      this.loaRejectReason = gatewayPatchTemplate.loaRejectReason;
      this.metered = gatewayPatchTemplate.metered;
      this.name = gatewayPatchTemplate.name;
      this.operationalStatus = gatewayPatchTemplate.operationalStatus;
      this.patchPanelCompletionNotice = gatewayPatchTemplate.patchPanelCompletionNotice;
      this.speedMbps = gatewayPatchTemplate.speedMbps;
      this.vlan = gatewayPatchTemplate.vlan;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayPatchTemplate.
     *
     * @return the new GatewayPatchTemplate instance
     */
    public GatewayPatchTemplate build() {
      return new GatewayPatchTemplate(this);
    }

    /**
     * Set the authenticationKey.
     *
     * @param authenticationKey the authenticationKey
     * @return the GatewayPatchTemplate builder
     */
    public Builder authenticationKey(AuthenticationKeyIdentity authenticationKey) {
      this.authenticationKey = authenticationKey;
      return this;
    }

    /**
     * Set the bfdConfig.
     *
     * @param bfdConfig the bfdConfig
     * @return the GatewayPatchTemplate builder
     */
    public Builder bfdConfig(GatewayBfdPatchTemplate bfdConfig) {
      this.bfdConfig = bfdConfig;
      return this;
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the GatewayPatchTemplate builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the GatewayPatchTemplate builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the GatewayPatchTemplate builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the GatewayPatchTemplate builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the defaultExportRouteFilter.
     *
     * @param defaultExportRouteFilter the defaultExportRouteFilter
     * @return the GatewayPatchTemplate builder
     */
    public Builder defaultExportRouteFilter(String defaultExportRouteFilter) {
      this.defaultExportRouteFilter = defaultExportRouteFilter;
      return this;
    }

    /**
     * Set the defaultImportRouteFilter.
     *
     * @param defaultImportRouteFilter the defaultImportRouteFilter
     * @return the GatewayPatchTemplate builder
     */
    public Builder defaultImportRouteFilter(String defaultImportRouteFilter) {
      this.defaultImportRouteFilter = defaultImportRouteFilter;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the GatewayPatchTemplate builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the loaRejectReason.
     *
     * @param loaRejectReason the loaRejectReason
     * @return the GatewayPatchTemplate builder
     */
    public Builder loaRejectReason(String loaRejectReason) {
      this.loaRejectReason = loaRejectReason;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the GatewayPatchTemplate builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GatewayPatchTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the operationalStatus.
     *
     * @param operationalStatus the operationalStatus
     * @return the GatewayPatchTemplate builder
     */
    public Builder operationalStatus(String operationalStatus) {
      this.operationalStatus = operationalStatus;
      return this;
    }

    /**
     * Set the patchPanelCompletionNotice.
     *
     * @param patchPanelCompletionNotice the patchPanelCompletionNotice
     * @return the GatewayPatchTemplate builder
     */
    public Builder patchPanelCompletionNotice(String patchPanelCompletionNotice) {
      this.patchPanelCompletionNotice = patchPanelCompletionNotice;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the GatewayPatchTemplate builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the GatewayPatchTemplate builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected GatewayPatchTemplate() { }

  protected GatewayPatchTemplate(Builder builder) {
    authenticationKey = builder.authenticationKey;
    bfdConfig = builder.bfdConfig;
    bgpAsn = builder.bgpAsn;
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
    connectionMode = builder.connectionMode;
    defaultExportRouteFilter = builder.defaultExportRouteFilter;
    defaultImportRouteFilter = builder.defaultImportRouteFilter;
    global = builder.global;
    loaRejectReason = builder.loaRejectReason;
    metered = builder.metered;
    name = builder.name;
    operationalStatus = builder.operationalStatus;
    patchPanelCompletionNotice = builder.patchPanelCompletionNotice;
    speedMbps = builder.speedMbps;
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a GatewayPatchTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationKey.
   *
   * A reference to a key to use as the BGP MD5 authentication key.
   *
   * Patch to `null` to disable BGP MD5 authentication.
   *
   * @return the authenticationKey
   */
  public AuthenticationKeyIdentity authenticationKey() {
    return authenticationKey;
  }

  /**
   * Gets the bfdConfig.
   *
   * BFD configuration information.
   *
   * @return the bfdConfig
   */
  public GatewayBfdPatchTemplate bfdConfig() {
    return bfdConfig;
  }

  /**
   * Gets the bgpAsn.
   *
   * The autonomous system number (ASN) of Border Gateway Protocol (BGP) configuration for the IBM side of the DL 2.0
   * gateway.
   *
   * @return the bgpAsn
   */
  public Long bgpAsn() {
    return bgpAsn;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on customer edge
   * router for the DL 2.0 gateway.
   *
   * Customer edge IP and IBM IP should be in the same network. Updating customer edge router CIDR should be accompanied
   * with IBM CIDR in the request. Update customer edge router IP to a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the
   * value must reside in one of "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public
   * CIDR.  bgp_cer_cidr and bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpCerCidr
   */
  public String bgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR is the new CIDR (Classless Inter-Domain Routing) value to be updated on IBM edge router for the DL 2.0
   * gateway.
   *
   * IBM IP and customer edge IP should be in the same network. Updating IBM CIDR should be accompanied with customer
   * edge router CIDR in the request. Update IBM CIDR to a valid bgp_cer_cidr and bgp_ibm_cidr CIDR, the value must
   * reside in one of "10.254.0.0/16", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16" or an owned public CIDR.
   * bgp_cer_cidr and bgp_ibm_cidr must have matching network and subnet mask values.
   *
   * @return the bgpIbmCidr
   */
  public String bgpIbmCidr() {
    return bgpIbmCidr;
  }

  /**
   * Gets the connectionMode.
   *
   * Type of services this Gateway is attached to. Mode transit means this Gateway will be attached to Transit Gateway
   * Service and direct means this Gateway will be attached to vpc or classic connection. The list of enumerated values
   * for this property may expand in the future. Code and processes using this field  must tolerate unexpected values.
   *
   * @return the connectionMode
   */
  public String connectionMode() {
    return connectionMode;
  }

  /**
   * Gets the defaultExportRouteFilter.
   *
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   *
   * @return the defaultExportRouteFilter
   */
  public String defaultExportRouteFilter() {
    return defaultExportRouteFilter;
  }

  /**
   * Gets the defaultImportRouteFilter.
   *
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   *
   * @return the defaultImportRouteFilter
   */
  public String defaultImportRouteFilter() {
    return defaultImportRouteFilter;
  }

  /**
   * Gets the global.
   *
   * Gateways with global routing (`true`) can connect to networks outside of their associated region.
   *
   * @return the global
   */
  public Boolean global() {
    return global;
  }

  /**
   * Gets the loaRejectReason.
   *
   * Use this field during LOA rejection to provide the reason for the rejection.
   *
   * Only allowed for type=dedicated gateways.
   *
   * @return the loaRejectReason
   */
  public String loaRejectReason() {
    return loaRejectReason;
  }

  /**
   * Gets the metered.
   *
   * Metered billing option.  When `true` gateway usage is billed per gigabyte.  When `false` there is no per gigabyte
   * usage charge, instead a flat rate is charged for the gateway.
   *
   * @return the metered
   */
  public Boolean metered() {
    return metered;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the operationalStatus.
   *
   * Gateway operational status.
   *
   * For gateways pending LOA approval, patch operational_status to the appropriate value to approve or reject its LOA.
   * When rejecting an LOA, provide reject reasoning in `loa_reject_reason`.
   *
   * Only allowed for type=dedicated gateways.
   *
   * @return the operationalStatus
   */
  public String operationalStatus() {
    return operationalStatus;
  }

  /**
   * Gets the patchPanelCompletionNotice.
   *
   * Gateway patch panel complete notification from implementation team.
   *
   * @return the patchPanelCompletionNotice
   */
  public String patchPanelCompletionNotice() {
    return patchPanelCompletionNotice;
  }

  /**
   * Gets the speedMbps.
   *
   * Gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long speedMbps() {
    return speedMbps;
  }

  /**
   * Gets the vlan.
   *
   * The VLAN to configure for this gateway.
   *
   * Specify `null` to remove an existing VLAN configuration.
   *
   * The gateway must have a `type` of `dedicated`.
   *
   * @return the vlan
   */
  public Long vlan() {
    return vlan;
  }

  /**
   * Construct a JSON merge-patch from the GatewayPatchTemplate.
   *
   * Note that properties of the GatewayPatchTemplate with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the GatewayPatchTemplate
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

