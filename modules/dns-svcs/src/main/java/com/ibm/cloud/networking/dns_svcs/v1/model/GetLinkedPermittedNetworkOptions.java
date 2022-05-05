/*
 * (C) Copyright IBM Corp. 2022.
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
 * The getLinkedPermittedNetwork options.
 */
public class GetLinkedPermittedNetworkOptions extends GenericModel {

  protected String instanceId;
  protected String lzId;
  protected String permittedNetworkId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String lzId;
    private String permittedNetworkId;
    private String xCorrelationId;

    private Builder(GetLinkedPermittedNetworkOptions getLinkedPermittedNetworkOptions) {
      this.instanceId = getLinkedPermittedNetworkOptions.instanceId;
      this.lzId = getLinkedPermittedNetworkOptions.lzId;
      this.permittedNetworkId = getLinkedPermittedNetworkOptions.permittedNetworkId;
      this.xCorrelationId = getLinkedPermittedNetworkOptions.xCorrelationId;
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
     * @param lzId the lzId
     * @param permittedNetworkId the permittedNetworkId
     */
    public Builder(String instanceId, String lzId, String permittedNetworkId) {
      this.instanceId = instanceId;
      this.lzId = lzId;
      this.permittedNetworkId = permittedNetworkId;
    }

    /**
     * Builds a GetLinkedPermittedNetworkOptions.
     *
     * @return the new GetLinkedPermittedNetworkOptions instance
     */
    public GetLinkedPermittedNetworkOptions build() {
      return new GetLinkedPermittedNetworkOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetLinkedPermittedNetworkOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the lzId.
     *
     * @param lzId the lzId
     * @return the GetLinkedPermittedNetworkOptions builder
     */
    public Builder lzId(String lzId) {
      this.lzId = lzId;
      return this;
    }

    /**
     * Set the permittedNetworkId.
     *
     * @param permittedNetworkId the permittedNetworkId
     * @return the GetLinkedPermittedNetworkOptions builder
     */
    public Builder permittedNetworkId(String permittedNetworkId) {
      this.permittedNetworkId = permittedNetworkId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the GetLinkedPermittedNetworkOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected GetLinkedPermittedNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lzId,
      "lzId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.permittedNetworkId,
      "permittedNetworkId cannot be empty");
    instanceId = builder.instanceId;
    lzId = builder.lzId;
    permittedNetworkId = builder.permittedNetworkId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a GetLinkedPermittedNetworkOptions builder
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
   * Gets the lzId.
   *
   * The unique identifier of a linked zone.
   *
   * @return the lzId
   */
  public String lzId() {
    return lzId;
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

