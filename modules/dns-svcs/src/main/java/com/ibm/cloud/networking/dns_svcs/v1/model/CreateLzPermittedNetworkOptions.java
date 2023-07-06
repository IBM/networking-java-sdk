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
 * The createLzPermittedNetwork options.
 */
public class CreateLzPermittedNetworkOptions extends GenericModel {

  /**
   * The type of a permitted network.
   */
  public interface Type {
    /** vpc. */
    String VPC = "vpc";
  }

  protected String instanceId;
  protected String linkedDnszoneId;
  protected String type;
  protected PermittedNetworkVpc permittedNetwork;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String linkedDnszoneId;
    private String type;
    private PermittedNetworkVpc permittedNetwork;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing CreateLzPermittedNetworkOptions instance.
     *
     * @param createLzPermittedNetworkOptions the instance to initialize the Builder with
     */
    private Builder(CreateLzPermittedNetworkOptions createLzPermittedNetworkOptions) {
      this.instanceId = createLzPermittedNetworkOptions.instanceId;
      this.linkedDnszoneId = createLzPermittedNetworkOptions.linkedDnszoneId;
      this.type = createLzPermittedNetworkOptions.type;
      this.permittedNetwork = createLzPermittedNetworkOptions.permittedNetwork;
      this.xCorrelationId = createLzPermittedNetworkOptions.xCorrelationId;
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
     */
    public Builder(String instanceId, String linkedDnszoneId) {
      this.instanceId = instanceId;
      this.linkedDnszoneId = linkedDnszoneId;
    }

    /**
     * Builds a CreateLzPermittedNetworkOptions.
     *
     * @return the new CreateLzPermittedNetworkOptions instance
     */
    public CreateLzPermittedNetworkOptions build() {
      return new CreateLzPermittedNetworkOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateLzPermittedNetworkOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the linkedDnszoneId.
     *
     * @param linkedDnszoneId the linkedDnszoneId
     * @return the CreateLzPermittedNetworkOptions builder
     */
    public Builder linkedDnszoneId(String linkedDnszoneId) {
      this.linkedDnszoneId = linkedDnszoneId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateLzPermittedNetworkOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the permittedNetwork.
     *
     * @param permittedNetwork the permittedNetwork
     * @return the CreateLzPermittedNetworkOptions builder
     */
    public Builder permittedNetwork(PermittedNetworkVpc permittedNetwork) {
      this.permittedNetwork = permittedNetwork;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreateLzPermittedNetworkOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreateLzPermittedNetworkOptions() { }

  protected CreateLzPermittedNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.linkedDnszoneId,
      "linkedDnszoneId cannot be empty");
    instanceId = builder.instanceId;
    linkedDnszoneId = builder.linkedDnszoneId;
    type = builder.type;
    permittedNetwork = builder.permittedNetwork;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreateLzPermittedNetworkOptions builder
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
   * Gets the type.
   *
   * The type of a permitted network.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the permittedNetwork.
   *
   * Permitted network data for VPC.
   *
   * @return the permittedNetwork
   */
  public PermittedNetworkVpc permittedNetwork() {
    return permittedNetwork;
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

