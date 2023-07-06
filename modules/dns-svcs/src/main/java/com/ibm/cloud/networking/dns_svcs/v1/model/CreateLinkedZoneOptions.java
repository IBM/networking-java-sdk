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
 * The createLinkedZone options.
 */
public class CreateLinkedZoneOptions extends GenericModel {

  protected String instanceId;
  protected String ownerInstanceId;
  protected String ownerZoneId;
  protected String description;
  protected String label;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String ownerInstanceId;
    private String ownerZoneId;
    private String description;
    private String label;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing CreateLinkedZoneOptions instance.
     *
     * @param createLinkedZoneOptions the instance to initialize the Builder with
     */
    private Builder(CreateLinkedZoneOptions createLinkedZoneOptions) {
      this.instanceId = createLinkedZoneOptions.instanceId;
      this.ownerInstanceId = createLinkedZoneOptions.ownerInstanceId;
      this.ownerZoneId = createLinkedZoneOptions.ownerZoneId;
      this.description = createLinkedZoneOptions.description;
      this.label = createLinkedZoneOptions.label;
      this.xCorrelationId = createLinkedZoneOptions.xCorrelationId;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a CreateLinkedZoneOptions.
     *
     * @return the new CreateLinkedZoneOptions instance
     */
    public CreateLinkedZoneOptions build() {
      return new CreateLinkedZoneOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the ownerInstanceId.
     *
     * @param ownerInstanceId the ownerInstanceId
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder ownerInstanceId(String ownerInstanceId) {
      this.ownerInstanceId = ownerInstanceId;
      return this;
    }

    /**
     * Set the ownerZoneId.
     *
     * @param ownerZoneId the ownerZoneId
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder ownerZoneId(String ownerZoneId) {
      this.ownerZoneId = ownerZoneId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreateLinkedZoneOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreateLinkedZoneOptions() { }

  protected CreateLinkedZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    ownerInstanceId = builder.ownerInstanceId;
    ownerZoneId = builder.ownerZoneId;
    description = builder.description;
    label = builder.label;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreateLinkedZoneOptions builder
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
   * Gets the ownerInstanceId.
   *
   * Owner's instance ID.
   *
   * @return the ownerInstanceId
   */
  public String ownerInstanceId() {
    return ownerInstanceId;
  }

  /**
   * Gets the ownerZoneId.
   *
   * Owner's DNS zone ID.
   *
   * @return the ownerZoneId
   */
  public String ownerZoneId() {
    return ownerZoneId;
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

