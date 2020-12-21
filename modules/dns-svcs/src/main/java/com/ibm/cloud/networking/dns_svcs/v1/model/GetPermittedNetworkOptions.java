/*
 * (C) Copyright IBM Corp. 2020.
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
 * The getPermittedNetwork options.
 */
public class GetPermittedNetworkOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String permittedNetworkId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String permittedNetworkId;
    private String xCorrelationId;

    private Builder(GetPermittedNetworkOptions getPermittedNetworkOptions) {
      this.instanceId = getPermittedNetworkOptions.instanceId;
      this.dnszoneId = getPermittedNetworkOptions.dnszoneId;
      this.permittedNetworkId = getPermittedNetworkOptions.permittedNetworkId;
      this.xCorrelationId = getPermittedNetworkOptions.xCorrelationId;
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
     * @param dnszoneId the dnszoneId
     * @param permittedNetworkId the permittedNetworkId
     */
    public Builder(String instanceId, String dnszoneId, String permittedNetworkId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
      this.permittedNetworkId = permittedNetworkId;
    }

    /**
     * Builds a GetPermittedNetworkOptions.
     *
     * @return the new GetPermittedNetworkOptions instance
     */
    public GetPermittedNetworkOptions build() {
      return new GetPermittedNetworkOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetPermittedNetworkOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the GetPermittedNetworkOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the permittedNetworkId.
     *
     * @param permittedNetworkId the permittedNetworkId
     * @return the GetPermittedNetworkOptions builder
     */
    public Builder permittedNetworkId(String permittedNetworkId) {
      this.permittedNetworkId = permittedNetworkId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the GetPermittedNetworkOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected GetPermittedNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.permittedNetworkId,
      "permittedNetworkId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    permittedNetworkId = builder.permittedNetworkId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a GetPermittedNetworkOptions builder
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
   * Gets the dnszoneId.
   *
   * The unique identifier of a DNS zone.
   *
   * @return the dnszoneId
   */
  public String dnszoneId() {
    return dnszoneId;
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

