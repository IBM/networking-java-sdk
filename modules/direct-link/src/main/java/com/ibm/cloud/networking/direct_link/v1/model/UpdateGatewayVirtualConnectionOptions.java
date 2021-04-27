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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateGatewayVirtualConnection options.
 */
public class UpdateGatewayVirtualConnectionOptions extends GenericModel {

  /**
   * Status of the virtual connection.  Virtual connections that span IBM Cloud Accounts are created in approval_pending
   * status.  The owner of the target network can accept or reject connection requests by patching status to attached or
   * rejected respectively.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** rejected. */
    String REJECTED = "rejected";
  }

  protected String gatewayId;
  protected String id;
  protected String name;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String gatewayId;
    private String id;
    private String name;
    private String status;

    private Builder(UpdateGatewayVirtualConnectionOptions updateGatewayVirtualConnectionOptions) {
      this.gatewayId = updateGatewayVirtualConnectionOptions.gatewayId;
      this.id = updateGatewayVirtualConnectionOptions.id;
      this.name = updateGatewayVirtualConnectionOptions.name;
      this.status = updateGatewayVirtualConnectionOptions.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param gatewayId the gatewayId
     * @param id the id
     */
    public Builder(String gatewayId, String id) {
      this.gatewayId = gatewayId;
      this.id = id;
    }

    /**
     * Builds a UpdateGatewayVirtualConnectionOptions.
     *
     * @return the new UpdateGatewayVirtualConnectionOptions instance
     */
    public UpdateGatewayVirtualConnectionOptions build() {
      return new UpdateGatewayVirtualConnectionOptions(this);
    }

    /**
     * Set the gatewayId.
     *
     * @param gatewayId the gatewayId
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder gatewayId(String gatewayId) {
      this.gatewayId = gatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the UpdateGatewayVirtualConnectionOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected UpdateGatewayVirtualConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.gatewayId,
      "gatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    gatewayId = builder.gatewayId;
    id = builder.id;
    name = builder.name;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a UpdateGatewayVirtualConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gatewayId.
   *
   * Direct Link gateway identifier.
   *
   * @return the gatewayId
   */
  public String gatewayId() {
    return gatewayId;
  }

  /**
   * Gets the id.
   *
   * The virtual connection identifier.
   *
   * @return the id
   */
  public String id() {
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
  public String name() {
    return name;
  }

  /**
   * Gets the status.
   *
   * Status of the virtual connection.  Virtual connections that span IBM Cloud Accounts are created in approval_pending
   * status.  The owner of the target network can accept or reject connection requests by patching status to attached or
   * rejected respectively.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

