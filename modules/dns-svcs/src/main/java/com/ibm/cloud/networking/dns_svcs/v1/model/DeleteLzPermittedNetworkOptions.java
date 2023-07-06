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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteLzPermittedNetwork options.
 */
public class DeleteLzPermittedNetworkOptions extends GenericModel {

  protected String instanceId;
  protected String linkedDnszoneId;
  protected String permittedNetworkId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String linkedDnszoneId;
    private String permittedNetworkId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing DeleteLzPermittedNetworkOptions instance.
     *
     * @param deleteLzPermittedNetworkOptions the instance to initialize the Builder with
     */
    private Builder(DeleteLzPermittedNetworkOptions deleteLzPermittedNetworkOptions) {
      this.instanceId = deleteLzPermittedNetworkOptions.instanceId;
      this.linkedDnszoneId = deleteLzPermittedNetworkOptions.linkedDnszoneId;
      this.permittedNetworkId = deleteLzPermittedNetworkOptions.permittedNetworkId;
      this.xCorrelationId = deleteLzPermittedNetworkOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param linkedDnszoneId the linkedDnszoneId
     * @param permittedNetworkId the permittedNetworkId
     */
    public Builder(String instanceId, String linkedDnszoneId, String permittedNetworkId) {
      this.instanceId = instanceId;
      this.linkedDnszoneId = linkedDnszoneId;
      this.permittedNetworkId = permittedNetworkId;
    }

    /**
     * Builds a DeleteLzPermittedNetworkOptions.
     *
     * @return the new DeleteLzPermittedNetworkOptions instance
     */
    public DeleteLzPermittedNetworkOptions build() {
      return new DeleteLzPermittedNetworkOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteLzPermittedNetworkOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the linkedDnszoneId.
     *
     * @param linkedDnszoneId the linkedDnszoneId
     * @return the DeleteLzPermittedNetworkOptions builder
     */
    public Builder linkedDnszoneId(String linkedDnszoneId) {
      this.linkedDnszoneId = linkedDnszoneId;
      return this;
    }

    /**
     * Set the permittedNetworkId.
     *
     * @param permittedNetworkId the permittedNetworkId
     * @return the DeleteLzPermittedNetworkOptions builder
     */
    public Builder permittedNetworkId(String permittedNetworkId) {
      this.permittedNetworkId = permittedNetworkId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the DeleteLzPermittedNetworkOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected DeleteLzPermittedNetworkOptions() { }

  protected DeleteLzPermittedNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.linkedDnszoneId,
      "linkedDnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.permittedNetworkId,
      "permittedNetworkId cannot be empty");
    instanceId = builder.instanceId;
    linkedDnszoneId = builder.linkedDnszoneId;
    permittedNetworkId = builder.permittedNetworkId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteLzPermittedNetworkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the linkedDnszoneId.
   *
   * The unique identifier of a linked zone.
   *
   * @return the linkedDnszoneId
   */
  public String linkedDnszoneId() {
    return linkedDnszoneId;
  }

  /**
   * Gets the permittedNetworkId.
   *
   * The unique identifier of a permitted network.
   *
   * @return the permittedNetworkId
   */
  public String permittedNetworkId() {
    return permittedNetworkId;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

