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
 * The getLinkedZone options.
 */
public class GetLinkedZoneOptions extends GenericModel {

  protected String instanceId;
  protected String linkedDnszoneId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String linkedDnszoneId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing GetLinkedZoneOptions instance.
     *
     * @param getLinkedZoneOptions the instance to initialize the Builder with
     */
    private Builder(GetLinkedZoneOptions getLinkedZoneOptions) {
      this.instanceId = getLinkedZoneOptions.instanceId;
      this.linkedDnszoneId = getLinkedZoneOptions.linkedDnszoneId;
      this.xCorrelationId = getLinkedZoneOptions.xCorrelationId;
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
     * Builds a GetLinkedZoneOptions.
     *
     * @return the new GetLinkedZoneOptions instance
     */
    public GetLinkedZoneOptions build() {
      return new GetLinkedZoneOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetLinkedZoneOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the linkedDnszoneId.
     *
     * @param linkedDnszoneId the linkedDnszoneId
     * @return the GetLinkedZoneOptions builder
     */
    public Builder linkedDnszoneId(String linkedDnszoneId) {
      this.linkedDnszoneId = linkedDnszoneId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the GetLinkedZoneOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected GetLinkedZoneOptions() { }

  protected GetLinkedZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.linkedDnszoneId,
      "linkedDnszoneId cannot be empty");
    instanceId = builder.instanceId;
    linkedDnszoneId = builder.linkedDnszoneId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a GetLinkedZoneOptions builder
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

