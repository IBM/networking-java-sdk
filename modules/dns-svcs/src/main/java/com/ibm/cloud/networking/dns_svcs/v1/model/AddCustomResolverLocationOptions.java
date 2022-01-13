/*
 * (C) Copyright IBM Corp. 2021.
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
 * The addCustomResolverLocation options.
 */
public class AddCustomResolverLocationOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String subnetCrn;
  protected Boolean enabled;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String subnetCrn;
    private Boolean enabled;
    private String xCorrelationId;

    private Builder(AddCustomResolverLocationOptions addCustomResolverLocationOptions) {
      this.instanceId = addCustomResolverLocationOptions.instanceId;
      this.resolverId = addCustomResolverLocationOptions.resolverId;
      this.subnetCrn = addCustomResolverLocationOptions.subnetCrn;
      this.enabled = addCustomResolverLocationOptions.enabled;
      this.xCorrelationId = addCustomResolverLocationOptions.xCorrelationId;
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
     */
    public Builder(String instanceId, String resolverId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
    }

    /**
     * Builds a AddCustomResolverLocationOptions.
     *
     * @return the new AddCustomResolverLocationOptions instance
     */
    public AddCustomResolverLocationOptions build() {
      return new AddCustomResolverLocationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the AddCustomResolverLocationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the AddCustomResolverLocationOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the subnetCrn.
     *
     * @param subnetCrn the subnetCrn
     * @return the AddCustomResolverLocationOptions builder
     */
    public Builder subnetCrn(String subnetCrn) {
      this.subnetCrn = subnetCrn;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the AddCustomResolverLocationOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the AddCustomResolverLocationOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected AddCustomResolverLocationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    subnetCrn = builder.subnetCrn;
    enabled = builder.enabled;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a AddCustomResolverLocationOptions builder
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
   * Gets the subnetCrn.
   *
   * Custom resolver location, subnet CRN.
   *
   * @return the subnetCrn
   */
  public String subnetCrn() {
    return subnetCrn;
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
