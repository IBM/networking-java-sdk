/*
 * (C) Copyright IBM Corp. 2023.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGateway options.
 */
public class UpdateGatewayOptions extends GenericModel {

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

  protected String id;
  protected GatewayPatchTemplateAuthenticationKey authenticationKey;
  protected GatewayBfdPatchTemplate bfdConfig;
  protected Long bgpAsn;
  protected String bgpCerCidr;
  protected String bgpIbmCidr;
  protected String connectionMode;
  protected String defaultExportRouteFilter;
  protected String defaultImportRouteFilter;
  protected Boolean global;
  protected String loaRejectReason;
  protected GatewayMacsecConfigPatchTemplate macsecConfig;
  protected Boolean metered;
  protected String name;
  protected String operationalStatus;
  protected String patchPanelCompletionNotice;
  protected Long speedMbps;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private GatewayPatchTemplateAuthenticationKey authenticationKey;
    private GatewayBfdPatchTemplate bfdConfig;
    private Long bgpAsn;
    private String bgpCerCidr;
    private String bgpIbmCidr;
    private String connectionMode;
    private String defaultExportRouteFilter;
    private String defaultImportRouteFilter;
    private Boolean global;
    private String loaRejectReason;
    private GatewayMacsecConfigPatchTemplate macsecConfig;
    private Boolean metered;
    private String name;
    private String operationalStatus;
    private String patchPanelCompletionNotice;
    private Long speedMbps;

    /**
     * Instantiates a new Builder from an existing UpdateGatewayOptions instance.
     *
     * @param updateGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdateGatewayOptions updateGatewayOptions) {
      this.id = updateGatewayOptions.id;
      this.authenticationKey = updateGatewayOptions.authenticationKey;
      this.bfdConfig = updateGatewayOptions.bfdConfig;
      this.bgpAsn = updateGatewayOptions.bgpAsn;
      this.bgpCerCidr = updateGatewayOptions.bgpCerCidr;
      this.bgpIbmCidr = updateGatewayOptions.bgpIbmCidr;
      this.connectionMode = updateGatewayOptions.connectionMode;
      this.defaultExportRouteFilter = updateGatewayOptions.defaultExportRouteFilter;
      this.defaultImportRouteFilter = updateGatewayOptions.defaultImportRouteFilter;
      this.global = updateGatewayOptions.global;
      this.loaRejectReason = updateGatewayOptions.loaRejectReason;
      this.macsecConfig = updateGatewayOptions.macsecConfig;
      this.metered = updateGatewayOptions.metered;
      this.name = updateGatewayOptions.name;
      this.operationalStatus = updateGatewayOptions.operationalStatus;
      this.patchPanelCompletionNotice = updateGatewayOptions.patchPanelCompletionNotice;
      this.speedMbps = updateGatewayOptions.speedMbps;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateGatewayOptions.
     *
     * @return the new UpdateGatewayOptions instance
     */
    public UpdateGatewayOptions build() {
      return new UpdateGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authenticationKey.
     *
     * @param authenticationKey the authenticationKey
     * @return the UpdateGatewayOptions builder
     */
    public Builder authenticationKey(GatewayPatchTemplateAuthenticationKey authenticationKey) {
      this.authenticationKey = authenticationKey;
      return this;
    }

    /**
     * Set the bfdConfig.
     *
     * @param bfdConfig the bfdConfig
     * @return the UpdateGatewayOptions builder
     */
    public Builder bfdConfig(GatewayBfdPatchTemplate bfdConfig) {
      this.bfdConfig = bfdConfig;
      return this;
    }

    /**
     * Set the bgpAsn.
     *
     * @param bgpAsn the bgpAsn
     * @return the UpdateGatewayOptions builder
     */
    public Builder bgpAsn(long bgpAsn) {
      this.bgpAsn = bgpAsn;
      return this;
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the UpdateGatewayOptions builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the UpdateGatewayOptions builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the UpdateGatewayOptions builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the defaultExportRouteFilter.
     *
     * @param defaultExportRouteFilter the defaultExportRouteFilter
     * @return the UpdateGatewayOptions builder
     */
    public Builder defaultExportRouteFilter(String defaultExportRouteFilter) {
      this.defaultExportRouteFilter = defaultExportRouteFilter;
      return this;
    }

    /**
     * Set the defaultImportRouteFilter.
     *
     * @param defaultImportRouteFilter the defaultImportRouteFilter
     * @return the UpdateGatewayOptions builder
     */
    public Builder defaultImportRouteFilter(String defaultImportRouteFilter) {
      this.defaultImportRouteFilter = defaultImportRouteFilter;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the UpdateGatewayOptions builder
     */
    public Builder global(Boolean global) {
      this.global = global;
      return this;
    }

    /**
     * Set the loaRejectReason.
     *
     * @param loaRejectReason the loaRejectReason
     * @return the UpdateGatewayOptions builder
     */
    public Builder loaRejectReason(String loaRejectReason) {
      this.loaRejectReason = loaRejectReason;
      return this;
    }

    /**
     * Set the macsecConfig.
     *
     * @param macsecConfig the macsecConfig
     * @return the UpdateGatewayOptions builder
     */
    public Builder macsecConfig(GatewayMacsecConfigPatchTemplate macsecConfig) {
      this.macsecConfig = macsecConfig;
      return this;
    }

    /**
     * Set the metered.
     *
     * @param metered the metered
     * @return the UpdateGatewayOptions builder
     */
    public Builder metered(Boolean metered) {
      this.metered = metered;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the operationalStatus.
     *
     * @param operationalStatus the operationalStatus
     * @return the UpdateGatewayOptions builder
     */
    public Builder operationalStatus(String operationalStatus) {
      this.operationalStatus = operationalStatus;
      return this;
    }

    /**
     * Set the patchPanelCompletionNotice.
     *
     * @param patchPanelCompletionNotice the patchPanelCompletionNotice
     * @return the UpdateGatewayOptions builder
     */
    public Builder patchPanelCompletionNotice(String patchPanelCompletionNotice) {
      this.patchPanelCompletionNotice = patchPanelCompletionNotice;
      return this;
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the UpdateGatewayOptions builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }
  }

  protected UpdateGatewayOptions() { }

  protected UpdateGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
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
    macsecConfig = builder.macsecConfig;
    metered = builder.metered;
    name = builder.name;
    operationalStatus = builder.operationalStatus;
    patchPanelCompletionNotice = builder.patchPanelCompletionNotice;
    speedMbps = builder.speedMbps;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Direct Link gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the authenticationKey.
   *
   * The identity of the standard key to use for BGP MD5 authentication key.
   * The key material that you provide must be base64 encoded and original string must be maximum 126 ASCII characters
   * in length.
   * To clear the optional `authentication_key` field patch its crn to `""`.
   *
   * @return the authenticationKey
   */
  public GatewayPatchTemplateAuthenticationKey authenticationKey() {
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
   * Gets the macsecConfig.
   *
   * MACsec configuration information.  When patching any macsec_config fields, no other fields may be specified in the
   * patch request.  Contact IBM support for access to MACsec.
   *
   * A MACsec config cannot be added to a gateway created without MACsec.
   *
   * @return the macsecConfig
   */
  public GatewayMacsecConfigPatchTemplate macsecConfig() {
    return macsecConfig;
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
}

