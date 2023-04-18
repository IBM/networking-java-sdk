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
 * The listLinkedPermittedNetworks options.
 */
public class ListLinkedPermittedNetworksOptions extends GenericModel {

  protected String instanceId;
  protected String lzId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String lzId;
    private String xCorrelationId;

    private Builder(ListLinkedPermittedNetworksOptions listLinkedPermittedNetworksOptions) {
      this.instanceId = listLinkedPermittedNetworksOptions.instanceId;
      this.lzId = listLinkedPermittedNetworksOptions.lzId;
      this.xCorrelationId = listLinkedPermittedNetworksOptions.xCorrelationId;
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
     */
    public Builder(String instanceId, String lzId) {
      this.instanceId = instanceId;
      this.lzId = lzId;
    }

    /**
     * Builds a ListLinkedPermittedNetworksOptions.
     *
     * @return the new ListLinkedPermittedNetworksOptions instance
     */
    public ListLinkedPermittedNetworksOptions build() {
      return new ListLinkedPermittedNetworksOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListLinkedPermittedNetworksOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the lzId.
     *
     * @param lzId the lzId
     * @return the ListLinkedPermittedNetworksOptions builder
     */
    public Builder lzId(String lzId) {
      this.lzId = lzId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the ListLinkedPermittedNetworksOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected ListLinkedPermittedNetworksOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lzId,
      "lzId cannot be empty");
    instanceId = builder.instanceId;
    lzId = builder.lzId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a ListLinkedPermittedNetworksOptions builder
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

