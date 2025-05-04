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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * GatewayCollectionGatewaysItem.
 *
 * Classes which extend this class:
 * - GatewayCollectionGatewaysItemGateway
 * - GatewayCollectionGatewaysItemCrossAccountGateway
 */
public class GatewayCollectionGatewaysItem extends GenericModel {

  /**
   * Gateway BGP status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field  must tolerate unexpected values.
   */
  public interface BgpStatus {
    /** active. */
    String ACTIVE = "active";
    /** connect. */
    String CONNECT = "connect";
    /** established. */
    String ESTABLISHED = "established";
    /** idle. */
    String IDLE = "idle";
  }

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
   * Gateway link status.  Only included on type=dedicated gateways. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field  must tolerate unexpected values.
   */
  public interface LinkStatus {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  /**
   * Indicates the direct link's MACsec capability. It must match one of the MACsec related `capabilities` of the
   * `cross_connect_router`.
   *
   * Only included on type=dedicated direct links.
   *
   * - non_macsec: The direct link does not support MACsec.
   * - macsec: The direct link supports MACsec. The MACsec feature must be enabled.
   * - macsec_optional: The direct link supports MACsec. The MACsec feature is not required and can be enabled after
   * direct link creation.
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
   * Gateway operational status. The list of enumerated values for this property may expand in the future. Code and
   * processes using this field  must tolerate unexpected values.
   *
   * See `operational_status_reasons[]` for possible remediation of the `failed` `operational_status`.
   */
  public interface OperationalStatus {
    /** awaiting_completion_notice. */
    String AWAITING_COMPLETION_NOTICE = "awaiting_completion_notice";
    /** awaiting_loa. */
    String AWAITING_LOA = "awaiting_loa";
    /** configuring. */
    String CONFIGURING = "configuring";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** create_rejected. */
    String CREATE_REJECTED = "create_rejected";
    /** completion_notice_approved. */
    String COMPLETION_NOTICE_APPROVED = "completion_notice_approved";
    /** completion_notice_received. */
    String COMPLETION_NOTICE_RECEIVED = "completion_notice_received";
    /** completion_notice_rejected. */
    String COMPLETION_NOTICE_REJECTED = "completion_notice_rejected";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** loa_accepted. */
    String LOA_ACCEPTED = "loa_accepted";
    /** loa_created. */
    String LOA_CREATED = "loa_created";
    /** loa_rejected. */
    String LOA_REJECTED = "loa_rejected";
    /** provisioned. */
    String PROVISIONED = "provisioned";
    /** failed. */
    String FAILED = "failed";
  }

  /**
   * Offering type. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field  must tolerate unexpected values.
   */
  public interface Type {
    /** connect. */
    String CONNECT = "connect";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

  @SerializedName("as_prepends")
  protected List<AsPrepend> asPrepends;
  @SerializedName("authentication_key")
  protected AuthenticationKeyReference authenticationKey;
  @SerializedName("bfd_config")
  protected GatewayBfdConfig bfdConfig;
  @SerializedName("bgp_asn")
  protected Long bgpAsn;
  @SerializedName("bgp_base_cidr")
  protected String bgpBaseCidr;
  @SerializedName("bgp_cer_cidr")
  protected String bgpCerCidr;
  @SerializedName("bgp_ibm_asn")
  protected Long bgpIbmAsn;
  @SerializedName("bgp_ibm_cidr")
  protected String bgpIbmCidr;
  @SerializedName("bgp_status")
  protected String bgpStatus;
  @SerializedName("bgp_status_updated_at")
  protected Date bgpStatusUpdatedAt;
  @SerializedName("carrier_name")
  protected String carrierName;
  @SerializedName("change_request")
  protected GatewayChangeRequest changeRequest;
  @SerializedName("completion_notice_reject_reason")
  protected String completionNoticeRejectReason;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("cross_account")
  protected Boolean crossAccount;
  @SerializedName("cross_connect_router")
  protected String crossConnectRouter;
  @SerializedName("customer_name")
  protected String customerName;
  @SerializedName("default_export_route_filter")
  protected String defaultExportRouteFilter;
  @SerializedName("default_import_route_filter")
  protected String defaultImportRouteFilter;
  protected Boolean global;
  protected String id;
  @SerializedName("link_status")
  protected String linkStatus;
  @SerializedName("link_status_updated_at")
  protected Date linkStatusUpdatedAt;
  @SerializedName("location_display_name")
  protected String locationDisplayName;
  @SerializedName("location_name")
  protected String locationName;
  protected GatewayMacsecReference macsec;
  @SerializedName("macsec_capability")
  protected String macsecCapability;
  protected Boolean metered;
  protected String name;
  @SerializedName("operational_status")
  protected String operationalStatus;
  @SerializedName("operational_status_reasons")
  protected List<GatewayStatusReason> operationalStatusReasons;
  @SerializedName("patch_panel_completion_notice")
  protected String patchPanelCompletionNotice;
  protected GatewayPortReference port;
  @SerializedName("provider_api_managed")
  protected Boolean providerApiManaged;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("speed_mbps")
  protected Long speedMbps;
  protected String type;
  protected Long vlan;

  protected GatewayCollectionGatewaysItem() { }

  /**
   * Gets the asPrepends.
   *
   * array of AS Prepend information.
   *
   * @return the asPrepends
   */
  public List<AsPrepend> getAsPrepends() {
    return asPrepends;
  }

  /**
   * Gets the authenticationKey.
   *
   * @return the authenticationKey
   */
  public AuthenticationKeyReference getAuthenticationKey() {
    return authenticationKey;
  }

  /**
   * Gets the bfdConfig.
   *
   * BFD configuration information.
   *
   * @return the bfdConfig
   */
  public GatewayBfdConfig getBfdConfig() {
    return bfdConfig;
  }

  /**
   * Gets the bgpAsn.
   *
   * Customer BGP ASN.
   *
   * @return the bgpAsn
   */
  public Long getBgpAsn() {
    return bgpAsn;
  }

  /**
   * Gets the bgpBaseCidr.
   *
   * (DEPRECATED) BGP base CIDR is deprecated and no longer recognized by the Direct Link APIs.
   *
   * See bgp_cer_cidr and bgp_ibm_cidr fields instead for IP related information.
   *
   * Deprecated field bgp_base_cidr will be removed from the API specification after 15-MAR-2021.
   *
   * @return the bgpBaseCidr
   */
  public String getBgpBaseCidr() {
    return bgpBaseCidr;
  }

  /**
   * Gets the bgpCerCidr.
   *
   * BGP customer edge router CIDR.
   *
   * @return the bgpCerCidr
   */
  public String getBgpCerCidr() {
    return bgpCerCidr;
  }

  /**
   * Gets the bgpIbmAsn.
   *
   * IBM BGP ASN.
   *
   * @return the bgpIbmAsn
   */
  public Long getBgpIbmAsn() {
    return bgpIbmAsn;
  }

  /**
   * Gets the bgpIbmCidr.
   *
   * BGP IBM CIDR.
   *
   * @return the bgpIbmCidr
   */
  public String getBgpIbmCidr() {
    return bgpIbmCidr;
  }

  /**
   * Gets the bgpStatus.
   *
   * Gateway BGP status. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field  must tolerate unexpected values.
   *
   * @return the bgpStatus
   */
  public String getBgpStatus() {
    return bgpStatus;
  }

  /**
   * Gets the bgpStatusUpdatedAt.
   *
   * Date and time bgp status was updated.
   *
   * @return the bgpStatusUpdatedAt
   */
  public Date getBgpStatusUpdatedAt() {
    return bgpStatusUpdatedAt;
  }

  /**
   * Gets the carrierName.
   *
   * Carrier name.  Only set for type=dedicated gateways.
   *
   * @return the carrierName
   */
  public String getCarrierName() {
    return carrierName;
  }

  /**
   * Gets the changeRequest.
   *
   * Changes pending approval for provider managed Direct Link Connect gateways.
   *
   * @return the changeRequest
   */
  public GatewayChangeRequest getChangeRequest() {
    return changeRequest;
  }

  /**
   * Gets the completionNoticeRejectReason.
   *
   * Reason for completion notice rejection.  Only included on type=dedicated gateways with a rejected completion
   * notice.
   *
   * @return the completionNoticeRejectReason
   */
  public String getCompletionNoticeRejectReason() {
    return completionNoticeRejectReason;
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
  public String getConnectionMode() {
    return connectionMode;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time resource was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN (Cloud Resource Name) of this gateway.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the crossAccount.
   *
   * Indicates whether this gateway is cross account gateway.
   *
   * @return the crossAccount
   */
  public Boolean isCrossAccount() {
    return crossAccount;
  }

  /**
   * Gets the crossConnectRouter.
   *
   * Cross connect router. Only included on type=dedicated gateways.
   *
   * @return the crossConnectRouter
   */
  public String getCrossConnectRouter() {
    return crossConnectRouter;
  }

  /**
   * Gets the customerName.
   *
   * Customer name.  Only set for type=dedicated gateways.
   *
   * @return the customerName
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Gets the defaultExportRouteFilter.
   *
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   *
   * @return the defaultExportRouteFilter
   */
  public String getDefaultExportRouteFilter() {
    return defaultExportRouteFilter;
  }

  /**
   * Gets the defaultImportRouteFilter.
   *
   * The default directional route filter action that applies to routes that do not match any directional route filters.
   *
   * @return the defaultImportRouteFilter
   */
  public String getDefaultImportRouteFilter() {
    return defaultImportRouteFilter;
  }

  /**
   * Gets the global.
   *
   * Gateways with global routing (`true`) can connect to networks outside their associated region.
   *
   * @return the global
   */
  public Boolean isGlobal() {
    return global;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of this gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the linkStatus.
   *
   * Gateway link status.  Only included on type=dedicated gateways. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field  must tolerate unexpected values.
   *
   * @return the linkStatus
   */
  public String getLinkStatus() {
    return linkStatus;
  }

  /**
   * Gets the linkStatusUpdatedAt.
   *
   * Date and time link status was updated.
   *
   * @return the linkStatusUpdatedAt
   */
  public Date getLinkStatusUpdatedAt() {
    return linkStatusUpdatedAt;
  }

  /**
   * Gets the locationDisplayName.
   *
   * Gateway location long name.
   *
   * @return the locationDisplayName
   */
  public String getLocationDisplayName() {
    return locationDisplayName;
  }

  /**
   * Gets the locationName.
   *
   * Gateway location.
   *
   * @return the locationName
   */
  public String getLocationName() {
    return locationName;
  }

  /**
   * Gets the macsec.
   *
   * MACsec configuration information of a Direct Link gateway.
   *
   * @return the macsec
   */
  public GatewayMacsecReference getMacsec() {
    return macsec;
  }

  /**
   * Gets the macsecCapability.
   *
   * Indicates the direct link's MACsec capability. It must match one of the MACsec related `capabilities` of the
   * `cross_connect_router`.
   *
   * Only included on type=dedicated direct links.
   *
   * - non_macsec: The direct link does not support MACsec.
   * - macsec: The direct link supports MACsec. The MACsec feature must be enabled.
   * - macsec_optional: The direct link supports MACsec. The MACsec feature is not required and can be enabled after
   * direct link creation.
   *
   * @return the macsecCapability
   */
  public String getMacsecCapability() {
    return macsecCapability;
  }

  /**
   * Gets the metered.
   *
   * Metered billing option.  When `true` gateway usage is billed per gigabyte.  When `false` there is no per gigabyte
   * usage charge, instead a flat rate is charged for the gateway.
   *
   * @return the metered
   */
  public Boolean isMetered() {
    return metered;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the operationalStatus.
   *
   * Gateway operational status. The list of enumerated values for this property may expand in the future. Code and
   * processes using this field  must tolerate unexpected values.
   *
   * See `operational_status_reasons[]` for possible remediation of the `failed` `operational_status`.
   *
   * @return the operationalStatus
   */
  public String getOperationalStatus() {
    return operationalStatus;
  }

  /**
   * Gets the operationalStatusReasons.
   *
   * Context for certain values of `operational_status`.
   *
   * @return the operationalStatusReasons
   */
  public List<GatewayStatusReason> getOperationalStatusReasons() {
    return operationalStatusReasons;
  }

  /**
   * Gets the patchPanelCompletionNotice.
   *
   * Gateway patch panel complete notification from implementation team.
   *
   * @return the patchPanelCompletionNotice
   */
  public String getPatchPanelCompletionNotice() {
    return patchPanelCompletionNotice;
  }

  /**
   * Gets the port.
   *
   * Port information for type=connect gateways.
   *
   * @return the port
   */
  public GatewayPortReference getPort() {
    return port;
  }

  /**
   * Gets the providerApiManaged.
   *
   * Indicates whether gateway changes must be made via a provider portal.
   *
   * @return the providerApiManaged
   */
  public Boolean isProviderApiManaged() {
    return providerApiManaged;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group reference.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the speedMbps.
   *
   * Gateway speed in megabits per second.
   *
   * @return the speedMbps
   */
  public Long getSpeedMbps() {
    return speedMbps;
  }

  /**
   * Gets the type.
   *
   * Offering type. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field  must tolerate unexpected values.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vlan.
   *
   * VLAN configured for this gateway. If there is no vlan configured for the gateway, the vlan will be absent. This
   * property will also be absent if this gateway's `crn` is in another account.
   *
   * @return the vlan
   */
  public Long getVlan() {
    return vlan;
  }
}

