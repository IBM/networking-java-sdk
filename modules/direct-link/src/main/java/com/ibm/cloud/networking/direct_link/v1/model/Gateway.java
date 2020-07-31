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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * gateway.
 */
public class Gateway extends GenericModel {

  /**
   * Gateway BGP status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
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
   * Gateway link status.  Only included on type=dedicated gateways.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   */
  public interface LinkStatus {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  /**
   * Gateway operational status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   */
  public interface OperationalStatus {
    /** awaiting_completion_notice. */
    String AWAITING_COMPLETION_NOTICE = "awaiting_completion_notice";
    /** awaiting_loa. */
    String AWAITING_LOA = "awaiting_loa";
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
  }

  /**
   * Gateway type.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   */
  public interface Type {
    /** connect. */
    String CONNECT = "connect";
    /** dedicated. */
    String DEDICATED = "dedicated";
  }

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
  @SerializedName("change_request")
  protected GatewayChangeRequest changeRequest;
  @SerializedName("completion_notice_reject_reason")
  protected String completionNoticeRejectReason;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("cross_connect_router")
  protected String crossConnectRouter;
  protected Boolean global;
  protected String id;
  @SerializedName("link_status")
  protected String linkStatus;
  @SerializedName("location_display_name")
  protected String locationDisplayName;
  @SerializedName("location_name")
  protected String locationName;
  protected Boolean metered;
  protected String name;
  @SerializedName("operational_status")
  protected String operationalStatus;
  protected GatewayPort port;
  @SerializedName("provider_api_managed")
  protected Boolean providerApiManaged;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("speed_mbps")
  protected Long speedMbps;
  protected String type;
  protected Long vlan;

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
   * BGP base CIDR.
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
   * Gateway BGP status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the bgpStatus
   */
  public String getBgpStatus() {
    return bgpStatus;
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
   * Gets the crossConnectRouter.
   *
   * Cross connect router.  Only included on type=dedicated gateways.
   *
   * @return the crossConnectRouter
   */
  public String getCrossConnectRouter() {
    return crossConnectRouter;
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
   * Gateway link status.  Only included on type=dedicated gateways.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the linkStatus
   */
  public String getLinkStatus() {
    return linkStatus;
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
   * Gateway operational status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the operationalStatus
   */
  public String getOperationalStatus() {
    return operationalStatus;
  }

  /**
   * Gets the port.
   *
   * gateway port for type=connect gateways.
   *
   * @return the port
   */
  public GatewayPort getPort() {
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
   * Gateway type.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vlan.
   *
   * VLAN allocated for this gateway.  Only set for type=connect gateways.
   *
   * @return the vlan
   */
  public Long getVlan() {
    return vlan;
  }
}

