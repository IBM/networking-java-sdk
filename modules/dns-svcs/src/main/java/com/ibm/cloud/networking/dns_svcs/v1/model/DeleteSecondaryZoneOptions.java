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
 * The deleteSecondaryZone options.
 */
public class DeleteSecondaryZoneOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String secondaryZoneId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String secondaryZoneId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing DeleteSecondaryZoneOptions instance.
     *
     * @param deleteSecondaryZoneOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSecondaryZoneOptions deleteSecondaryZoneOptions) {
      this.instanceId = deleteSecondaryZoneOptions.instanceId;
      this.resolverId = deleteSecondaryZoneOptions.resolverId;
      this.secondaryZoneId = deleteSecondaryZoneOptions.secondaryZoneId;
      this.xCorrelationId = deleteSecondaryZoneOptions.xCorrelationId;
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
     * @param resolverId the resolverId
     * @param secondaryZoneId the secondaryZoneId
     */
    public Builder(String instanceId, String resolverId, String secondaryZoneId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
      this.secondaryZoneId = secondaryZoneId;
    }

    /**
     * Builds a DeleteSecondaryZoneOptions.
     *
     * @return the new DeleteSecondaryZoneOptions instance
     */
    public DeleteSecondaryZoneOptions build() {
      return new DeleteSecondaryZoneOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteSecondaryZoneOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the DeleteSecondaryZoneOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the secondaryZoneId.
     *
     * @param secondaryZoneId the secondaryZoneId
     * @return the DeleteSecondaryZoneOptions builder
     */
    public Builder secondaryZoneId(String secondaryZoneId) {
      this.secondaryZoneId = secondaryZoneId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the DeleteSecondaryZoneOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected DeleteSecondaryZoneOptions() { }

  protected DeleteSecondaryZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.secondaryZoneId,
      "secondaryZoneId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    secondaryZoneId = builder.secondaryZoneId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSecondaryZoneOptions builder
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
   * Gets the resolverId.
   *
   * The unique identifier of a custom resolver.
   *
   * @return the resolverId
   */
  public String resolverId() {
    return resolverId;
  }

  /**
   * Gets the secondaryZoneId.
   *
   * The unique identifier of a secondary zone.
   *
   * @return the secondaryZoneId
   */
  public String secondaryZoneId() {
    return secondaryZoneId;
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

