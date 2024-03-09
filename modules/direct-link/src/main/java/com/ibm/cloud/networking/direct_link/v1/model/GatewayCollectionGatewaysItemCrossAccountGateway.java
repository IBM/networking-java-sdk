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
package com.ibm.cloud.networking.direct_link.v1.model;

/**
 * cross-account gateway read-only view.
 */
public class GatewayCollectionGatewaysItemCrossAccountGateway extends GatewayCollectionGatewaysItem {

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
   * Gateway operational status. The list of enumerated values for this property may expand in the future. Code and
   * processes using this field  must tolerate unexpected values.
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


  protected GatewayCollectionGatewaysItemCrossAccountGateway() { }
}

