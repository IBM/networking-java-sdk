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
 * The getMonitor options.
 */
public class GetMonitorOptions extends GenericModel {

  protected String instanceId;
  protected String monitorId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String monitorId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing GetMonitorOptions instance.
     *
     * @param getMonitorOptions the instance to initialize the Builder with
     */
    private Builder(GetMonitorOptions getMonitorOptions) {
      this.instanceId = getMonitorOptions.instanceId;
      this.monitorId = getMonitorOptions.monitorId;
      this.xCorrelationId = getMonitorOptions.xCorrelationId;
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
     * @param monitorId the monitorId
     */
    public Builder(String instanceId, String monitorId) {
      this.instanceId = instanceId;
      this.monitorId = monitorId;
    }

    /**
     * Builds a GetMonitorOptions.
     *
     * @return the new GetMonitorOptions instance
     */
    public GetMonitorOptions build() {
      return new GetMonitorOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetMonitorOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the monitorId.
     *
     * @param monitorId the monitorId
     * @return the GetMonitorOptions builder
     */
    public Builder monitorId(String monitorId) {
      this.monitorId = monitorId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the GetMonitorOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected GetMonitorOptions() { }

  protected GetMonitorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.monitorId,
      "monitorId cannot be empty");
    instanceId = builder.instanceId;
    monitorId = builder.monitorId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a GetMonitorOptions builder
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
   * Gets the monitorId.
   *
   * The unique identifier of a load balancer monitor.
   *
   * @return the monitorId
   */
  public String monitorId() {
    return monitorId;
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

