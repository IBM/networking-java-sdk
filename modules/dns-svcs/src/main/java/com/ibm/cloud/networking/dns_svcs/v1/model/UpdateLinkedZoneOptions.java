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
 * The updateLinkedZone options.
 */
public class UpdateLinkedZoneOptions extends GenericModel {

  protected String instanceId;
  protected String lzId;
  protected String description;
  protected String label;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String lzId;
    private String description;
    private String label;
    private String xCorrelationId;

    private Builder(UpdateLinkedZoneOptions updateLinkedZoneOptions) {
      this.instanceId = updateLinkedZoneOptions.instanceId;
      this.lzId = updateLinkedZoneOptions.lzId;
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
     * @param lzId the lzId
     */
    public Builder(String instanceId, String lzId) {
      this.instanceId = instanceId;
      this.lzId = lzId;
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
     * Set the lzId.
     *
     * @param lzId the lzId
     * @return the UpdateLinkedZoneOptions builder
     */
    public Builder lzId(String lzId) {
      this.lzId = lzId;
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

  protected UpdateLinkedZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lzId,
      "lzId cannot be empty");
    instanceId = builder.instanceId;
    lzId = builder.lzId;
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

