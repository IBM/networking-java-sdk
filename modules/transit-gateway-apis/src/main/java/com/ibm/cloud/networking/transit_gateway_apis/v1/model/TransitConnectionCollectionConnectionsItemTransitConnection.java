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
 * Transit gateway connection.
 */
public class TransitConnectionCollectionConnectionsItemTransitConnection extends TransitConnectionCollectionConnectionsItem {

  /**
   * Defines what type of network is connected via this connection. The list of enumerated values for this property may
   * expand in the future. Code and processes using this field must tolerate unexpected values.
   */
  public interface NetworkType {
    /** classic. */
    String CLASSIC = "classic";
    /** directlink. */
    String DIRECTLINK = "directlink";
    /** gre_tunnel. */
    String GRE_TUNNEL = "gre_tunnel";
    /** unbound_gre_tunnel. */
    String UNBOUND_GRE_TUNNEL = "unbound_gre_tunnel";
    /** vpc. */
    String VPC = "vpc";
    /** power_virtual_server. */
    String POWER_VIRTUAL_SERVER = "power_virtual_server";
  }

  /**
   * Default setting of permit or deny which applies to any routes that don't match a specified filter.
   */
  public interface PrefixFiltersDefault {
    /** permit. */
    String PERMIT = "permit";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Only visible for cross account connections, this field represents the status of a connection request between IBM
   * Cloud accounts. The list of enumerated values for this property may expand in the future. Code and processes using
   * this field must tolerate unexpected values.
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
   * Connection state. The list of enumerated values for this property may expand in the future. Code and processes
   * using this field must tolerate unexpected values.
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


  protected TransitConnectionCollectionConnectionsItemTransitConnection() { }
}

