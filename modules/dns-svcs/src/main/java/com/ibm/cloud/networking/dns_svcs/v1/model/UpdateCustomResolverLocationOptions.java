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
 * The updateCustomResolverLocation options.
 */
public class UpdateCustomResolverLocationOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String locationId;
  protected Boolean enabled;
  protected String subnetCrn;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String locationId;
    private Boolean enabled;
    private String subnetCrn;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing UpdateCustomResolverLocationOptions instance.
     *
     * @param updateCustomResolverLocationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateCustomResolverLocationOptions updateCustomResolverLocationOptions) {
      this.instanceId = updateCustomResolverLocationOptions.instanceId;
      this.resolverId = updateCustomResolverLocationOptions.resolverId;
      this.locationId = updateCustomResolverLocationOptions.locationId;
      this.enabled = updateCustomResolverLocationOptions.enabled;
      this.subnetCrn = updateCustomResolverLocationOptions.subnetCrn;
      this.xCorrelationId = updateCustomResolverLocationOptions.xCorrelationId;
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
     * @param locationId the locationId
     */
    public Builder(String instanceId, String resolverId, String locationId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
      this.locationId = locationId;
    }

    /**
     * Builds a UpdateCustomResolverLocationOptions.
     *
     * @return the new UpdateCustomResolverLocationOptions instance
     */
    public UpdateCustomResolverLocationOptions build() {
      return new UpdateCustomResolverLocationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the locationId.
     *
     * @param locationId the locationId
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the subnetCrn.
     *
     * @param subnetCrn the subnetCrn
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder subnetCrn(String subnetCrn) {
      this.subnetCrn = subnetCrn;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateCustomResolverLocationOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateCustomResolverLocationOptions() { }

  protected UpdateCustomResolverLocationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.locationId,
      "locationId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    locationId = builder.locationId;
    enabled = builder.enabled;
    subnetCrn = builder.subnetCrn;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateCustomResolverLocationOptions builder
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
   * Gets the locationId.
   *
   * Custom resolver location ID.
   *
   * @return the locationId
   */
  public String locationId() {
    return locationId;
  }

  /**
   * Gets the enabled.
   *
   * Enable/Disable custom resolver location.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the subnetCrn.
   *
   * Subnet CRN.
   *
   * @return the subnetCrn
   */
  public String subnetCrn() {
    return subnetCrn;
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

