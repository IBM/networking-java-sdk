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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Permitted network details.
 */
public class PermittedNetwork extends GenericModel {

  /**
   * The type of a permitted network.
   */
  public interface Type {
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * The state of a permitted network.
   */
  public interface State {
    /** ACTIVE. */
    String ACTIVE = "ACTIVE";
    /** REMOVAL_IN_PROGRESS. */
    String REMOVAL_IN_PROGRESS = "REMOVAL_IN_PROGRESS";
  }

  protected String id;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;
  @SerializedName("permitted_network")
  protected PermittedNetworkVpc permittedNetwork;
  protected String type;
  protected String state;
  @SerializedName("linked_zone_id")
  protected String linkedZoneId;

  protected PermittedNetwork() { }

  /**
   * Gets the id.
   *
   * Unique identifier of a permitted network.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdOn.
   *
   * The time when a permitted network is created.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The recent time when a permitted network is modified.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the permittedNetwork.
   *
   * Permitted network data for VPC.
   *
   * @return the permittedNetwork
   */
  public PermittedNetworkVpc getPermittedNetwork() {
    return permittedNetwork;
  }

  /**
   * Gets the type.
   *
   * The type of a permitted network.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the state.
   *
   * The state of a permitted network.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the linkedZoneId.
   *
   * Unique identifier of a linked zone through which the permitted network was added.
   *
   * @return the linkedZoneId
   */
  public String getLinkedZoneId() {
    return linkedZoneId;
  }
}

