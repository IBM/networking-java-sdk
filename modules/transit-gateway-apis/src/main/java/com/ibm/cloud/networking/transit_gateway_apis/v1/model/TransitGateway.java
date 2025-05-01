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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a Transit Gateway.
 */
public class TransitGateway extends GenericModel {

  /**
   * The status of the Transit Gateway. The list of enumerated values for this property may expand in the future. Code
   * and processes using this field must tolerate unexpected values.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** deleting. */
    String DELETING = "deleting";
    /** suspending. */
    String SUSPENDING = "suspending";
    /** suspended. */
    String SUSPENDED = "suspended";
  }

  @SerializedName("connection_count")
  protected Long connectionCount;
  @SerializedName("connection_needs_attention")
  protected Boolean connectionNeedsAttention;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected Boolean global;
  @SerializedName("gre_enhanced_route_propagation")
  protected Boolean greEnhancedRoutePropagation;
  protected String id;
  protected String location;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;

  protected TransitGateway() { }

  /**
   * Gets the connectionCount.
   *
   * The number of connections associated with this Transit Gateway.
   *
   * @return the connectionCount
   */
  public Long getConnectionCount() {
    return connectionCount;
  }

  /**
   * Gets the connectionNeedsAttention.
   *
   * Indicates if this Transit Gateway has a connection that needs attention (Such as cross account approval).
   *
   * @return the connectionNeedsAttention
   */
  public Boolean isConnectionNeedsAttention() {
    return connectionNeedsAttention;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this gateway was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * Cloud Resource Name of a transit gateway.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the global.
   *
   * Allow global routing for a Transit Gateway.
   *
   * @return the global
   */
  public Boolean isGlobal() {
    return global;
  }

  /**
   * Gets the greEnhancedRoutePropagation.
   *
   * Allow GRE Enhanced Route Propagation on this gateway.
   *
   * @return the greEnhancedRoutePropagation
   */
  public Boolean isGreEnhancedRoutePropagation() {
    return greEnhancedRoutePropagation;
  }

  /**
   * Gets the id.
   *
   * A unique identifier for this transit gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the location.
   *
   * Location of Transit Gateway Services.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the name.
   *
   * A human readable name for the transit gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://console.bluemix.net/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the status.
   *
   * The status of the Transit Gateway. The list of enumerated values for this property may expand in the future. Code
   * and processes using this field must tolerate unexpected values.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that this gateway was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

