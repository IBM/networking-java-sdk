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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Virtual connection.
 */
public class GatewayVirtualConnection extends GenericModel {

  /**
   * Status of the virtual connection.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   */
  public interface Status {
    /** pending. */
    String PENDING = "pending";
    /** attached. */
    String ATTACHED = "attached";
    /** approval_pending. */
    String APPROVAL_PENDING = "approval_pending";
    /** rejected. */
    String REJECTED = "rejected";
    /** expired. */
    String EXPIRED = "expired";
    /** deleting. */
    String DELETING = "deleting";
    /** detached_by_network_pending. */
    String DETACHED_BY_NETWORK_PENDING = "detached_by_network_pending";
    /** detached_by_network. */
    String DETACHED_BY_NETWORK = "detached_by_network";
  }

  /**
   * Virtual connection type.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   */
  public interface Type {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
    /** transit. */
    String TRANSIT = "transit";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String id;
  protected String name;
  @SerializedName("network_account")
  protected String networkAccount;
  @SerializedName("network_id")
  protected String networkId;
  protected String status;
  protected String type;

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
   * Gets the id.
   *
   * The unique identifier for this virtual connection.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this virtual connection.  Virtual connection names are unique within a gateway.  This is
   * the name of the virtual connection itself, the network being connected may have its own name attribute.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAccount.
   *
   * For virtual connections across two different IBM Cloud Accounts network_account indicates the account that owns the
   * target network.
   *
   * @return the networkAccount
   */
  public String getNetworkAccount() {
    return networkAccount;
  }

  /**
   * Gets the networkId.
   *
   * Unique identifier of the target network.  For type=vpc virtual connections this is the CRN of the target VPC.  This
   * field does not apply to type=classic connections.
   *
   * @return the networkId
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * Gets the status.
   *
   * Status of the virtual connection.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the type.
   *
   * Virtual connection type.
   *
   * The list of enumerated values for this property may expand in the future. Code and processes using this field  must
   * tolerate unexpected values.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

