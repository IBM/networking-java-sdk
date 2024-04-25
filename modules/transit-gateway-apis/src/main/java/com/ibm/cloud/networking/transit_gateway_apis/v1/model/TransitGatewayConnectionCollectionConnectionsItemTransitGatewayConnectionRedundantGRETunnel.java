/*
 * (C) Copyright IBM Corp. 2024.
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

/**
 * Redundant GRE tunnel connection included in transit gateway.
 */
public class TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionRedundantGRETunnel extends TransitGatewayConnectionCollectionConnectionsItem {

  /**
   * The type of network the GRE tunnel is targeting.
   */
  public interface BaseNetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * Defines what type of network is connected via this connection. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field must tolerate unexpected values.
   */
  public interface NetworkType {
    /** redundant_gre. */
    String REDUNDANT_GRE = "redundant_gre";
  }

  /**
   * Only visible for cross account connections, this field represents the status of a connection request between IBM
   * Cloud accounts. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field must tolerate unexpected values.
   */
  public interface RequestStatus {
    /** partial. */
    String PARTIAL = "partial";
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
   * Connection's current configuration state. The list of enumerated values for this property may expand in the future.
   * Code and processes using this field must tolerate unexpected values.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** network_pending. */
    String NETWORK_PENDING = "network_pending";
    /** deleting. */
    String DELETING = "deleting";
    /** detaching. */
    String DETACHING = "detaching";
    /** detached. */
    String DETACHED = "detached";
    /** suspending. */
    String SUSPENDING = "suspending";
    /** suspended. */
    String SUSPENDED = "suspended";
  }


  protected TransitGatewayConnectionCollectionConnectionsItemTransitGatewayConnectionRedundantGRETunnel() { }
}

