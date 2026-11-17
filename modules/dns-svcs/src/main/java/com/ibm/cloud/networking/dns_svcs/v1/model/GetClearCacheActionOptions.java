/*
 * (C) Copyright IBM Corp. 2026.
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
 * The getClearCacheAction options.
 */
public class GetClearCacheActionOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected String actionId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private String actionId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing GetClearCacheActionOptions instance.
     *
     * @param getClearCacheActionOptions the instance to initialize the Builder with
     */
    private Builder(GetClearCacheActionOptions getClearCacheActionOptions) {
      this.instanceId = getClearCacheActionOptions.instanceId;
      this.resolverId = getClearCacheActionOptions.resolverId;
      this.actionId = getClearCacheActionOptions.actionId;
      this.xCorrelationId = getClearCacheActionOptions.xCorrelationId;
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
     * @param actionId the actionId
     */
    public Builder(String instanceId, String resolverId, String actionId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
      this.actionId = actionId;
    }

    /**
     * Builds a GetClearCacheActionOptions.
     *
     * @return the new GetClearCacheActionOptions instance
     */
    public GetClearCacheActionOptions build() {
      return new GetClearCacheActionOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetClearCacheActionOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the GetClearCacheActionOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the GetClearCacheActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the GetClearCacheActionOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected GetClearCacheActionOptions() { }

  protected GetClearCacheActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    actionId = builder.actionId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a GetClearCacheActionOptions builder
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
   * Gets the actionId.
   *
   * The unique identifier of a cache clear action.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
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
