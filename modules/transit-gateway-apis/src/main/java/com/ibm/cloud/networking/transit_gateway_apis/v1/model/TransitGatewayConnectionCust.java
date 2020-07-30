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
package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Connection included in transit gateway.
 */
public class TransitGatewayConnectionCust extends GenericModel {

  /**
   * Defines what type of network is connected via this connection.
   */
  public interface NetworkType {
    /** vpc. */
    String VPC = "vpc";
    /** classic. */
    String CLASSIC = "classic";
  }

  /**
   * Only visible for cross account connections, this field represents the status of the request to connect the given
   * network between accounts.
   */
  public interface RequestStatus {
    /** pending. */
    String PENDING = "pending";
    /** approved. */
    String APPROVED = "approved";
    /** rejected. */
    String REJECTED = "rejected";
    /** expired. */
    String EXPIRED = "expired";
    /** detached. */
    String DETACHED = "detached";
  }

  /**
   * What is the current configuration state of this connection.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** deleting. */
    String DELETING = "deleting";
    /** detaching. */
    String DETACHING = "detaching";
    /** detached. */
    String DETACHED = "detached";
  }

  protected String name;
  @SerializedName("network_id")
  protected String networkId;
  @SerializedName("network_type")
  protected String networkType;
  @SerializedName("network_account_id")
  protected String networkAccountId;
  protected String id;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("request_status")
  protected String requestStatus;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the name.
   *
   * The user-defined name for this transit gateway. If unspecified, the name will be the network name (the name of the
   * VPC in the case of network type 'vpc', and the word Classic, in the case of network type 'classic').
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkId.
   *
   * The ID of the network being connected via this connection. This field is required for some types, such as 'vpc'.
   * For network type 'vpc' this is the CRN of the VPC to be connected. This field is required to be unspecified for
   * network type 'classic'.
   *
   * @return the networkId
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * Gets the networkType.
   *
   * Defines what type of network is connected via this connection.
   *
   * @return the networkType
   */
  public String getNetworkType() {
    return networkType;
  }

  /**
   * Gets the networkAccountId.
   *
   * The ID of the account which owns the network that is being connected. Generally only used if the network is in a
   * different account than the gateway.
   *
   * @return the networkAccountId
   */
  public String getNetworkAccountId() {
    return networkAccountId;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this Transit Gateway Connection to Network (vpc/classic).
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this connection was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the requestStatus.
   *
   * Only visible for cross account connections, this field represents the status of the request to connect the given
   * network between accounts.
   *
   * @return the requestStatus
   */
  public String getRequestStatus() {
    return requestStatus;
  }

  /**
   * Gets the status.
   *
   * What is the current configuration state of this connection.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that this connection was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

