/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.direct_link_provider.v2.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * gateway.
 */
public class ProviderGateway extends GenericModel {

  /**
   * Gateway BGP status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field must
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
   * Gateway operational status.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field must
   * tolerate unexpected values.
   */
  public interface OperationalStatus {
    /** configuring. */
    String CONFIGURING = "configuring";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** create_rejected. */
    String CREATE_REJECTED = "create_rejected";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** provisioned. */
    String PROVISIONED = "provisioned";
  }

  @SerializedName("bgp_asn")
  protected Long bgpAsn;
  @SerializedName("bgp_cer_cidr")
  protected String bgpCerCidr;
  @SerializedName("bgp_ibm_asn")
  protected Long bgpIbmAsn;
  @SerializedName("bgp_ibm_cidr")
  protected String bgpIbmCidr;
  @SerializedName("bgp_status")
  protected String bgpStatus;
  @SerializedName("change_request")
  protected ProviderGatewayChangeRequest changeRequest;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("customer_account_id")
  protected String customerAccountId;
  protected String id;
  protected String name;
  @SerializedName("operational_status")
  protected String operationalStatus;
  protected ProviderGatewayPortReference port;
  @SerializedName("provider_api_managed")
  protected Boolean providerApiManaged;
  @SerializedName("speed_mbps")
  protected Long speedMbps;
  protected String type;
  protected Long vlan;

  /**
   * Gets the bgpAsn.
   *
   * BGP ASN.
   *
   * For a 2-byte ASN values between 1-64495 or 64999. For a 2-byte or 4-byte range ASN values between
   * 131072-4199999999. For a 4-byte ASN values 4201000000-4201064511.
   *
   * @return the bgpAsn
   */
  public Long getBgpAsn() {
    return bgpAsn;
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
   * The list of enumerated values for this property may expand in the future. Code and processes using this field must
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
   * @return the changeRequest
   */
  public ProviderGatewayChangeRequest getChangeRequest() {
    return changeRequest;
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
   * Gets the customerAccountId.
   *
   * Customer IBM Cloud account ID.
   *
   * @return the customerAccountId
   */
  public String getCustomerAccountId() {
    return customerAccountId;
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
   * The list of enumerated values for this property may expand in the future. Code and processes using this field must
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
   * Port identifier for the gateway.
   *
   * @return the port
   */
  public ProviderGatewayPortReference getPort() {
    return port;
  }

  /**
   * Gets the providerApiManaged.
   *
   * Set to `true` for gateways created through the Direct Link Provider APIs.
   *
   * Most Direct Link Provider APIs cannot interact with `provider_api_managed=false` gateways.
   *
   * @return the providerApiManaged
   */
  public Boolean isProviderApiManaged() {
    return providerApiManaged;
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
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vlan.
   *
   * VLAN allocated for this gateway.
   *
   * @return the vlan
   */
  public Long getVlan() {
    return vlan;
  }
}

