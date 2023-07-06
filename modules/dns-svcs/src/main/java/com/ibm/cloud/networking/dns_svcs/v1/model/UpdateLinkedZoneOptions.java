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
 * The updateLinkedZone options.
 */
public class UpdateLinkedZoneOptions extends GenericModel {

  protected String instanceId;
  protected String linkedDnszoneId;
  protected String description;
  protected String label;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String linkedDnszoneId;
    private String description;
    private String label;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing UpdateLinkedZoneOptions instance.
     *
     * @param updateLinkedZoneOptions the instance to initialize the Builder with
     */
    private Builder(UpdateLinkedZoneOptions updateLinkedZoneOptions) {
      this.instanceId = updateLinkedZoneOptions.instanceId;
      this.linkedDnszoneId = updateLinkedZoneOptions.linkedDnszoneId;
      this.description = updateLinkedZoneOptions.description;
      this.label = updateLinkedZoneOptions.label;
      this.xCorrelationId = updateLinkedZoneOptions.xCorrelationId;
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
     * Builds a UpdateLinkedZoneOptions.
     *
     * @return the new UpdateLinkedZoneOptions instance
     */
    public UpdateLinkedZoneOptions build() {
      return new UpdateLinkedZoneOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the linkedDnszoneId.
     *
     * @param linkedDnszoneId the linkedDnszoneId
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder linkedDnszoneId(String linkedDnszoneId) {
      this.linkedDnszoneId = linkedDnszoneId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateLinkedZoneOptions() { }

  protected UpdateLinkedZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.linkedDnszoneId,
      "linkedDnszoneId cannot be empty");
    instanceId = builder.instanceId;
    linkedDnszoneId = builder.linkedDnszoneId;
    description = builder.description;
    label = builder.label;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateLinkedZoneOptions builder
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
   * Gets the description.
   *
   * Descriptive text of the linked zone.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * The label of linked zone.
   *
   * @return the label
   */
  public String label() {
    return label;
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

