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
 * The deleteLoadBalancer options.
 */
public class DeleteLoadBalancerOptions extends GenericModel {

  protected String instanceId;
  protected String dnszoneId;
  protected String lbId;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String dnszoneId;
    private String lbId;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing DeleteLoadBalancerOptions instance.
     *
     * @param deleteLoadBalancerOptions the instance to initialize the Builder with
     */
    private Builder(DeleteLoadBalancerOptions deleteLoadBalancerOptions) {
      this.instanceId = deleteLoadBalancerOptions.instanceId;
      this.dnszoneId = deleteLoadBalancerOptions.dnszoneId;
      this.lbId = deleteLoadBalancerOptions.lbId;
      this.xCorrelationId = deleteLoadBalancerOptions.xCorrelationId;
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
     * @param dnszoneId the dnszoneId
     * @param lbId the lbId
     */
    public Builder(String instanceId, String dnszoneId, String lbId) {
      this.instanceId = instanceId;
      this.dnszoneId = dnszoneId;
      this.lbId = lbId;
    }

    /**
     * Builds a DeleteLoadBalancerOptions.
     *
     * @return the new DeleteLoadBalancerOptions instance
     */
    public DeleteLoadBalancerOptions build() {
      return new DeleteLoadBalancerOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteLoadBalancerOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the dnszoneId.
     *
     * @param dnszoneId the dnszoneId
     * @return the DeleteLoadBalancerOptions builder
     */
    public Builder dnszoneId(String dnszoneId) {
      this.dnszoneId = dnszoneId;
      return this;
    }

    /**
     * Set the lbId.
     *
     * @param lbId the lbId
     * @return the DeleteLoadBalancerOptions builder
     */
    public Builder lbId(String lbId) {
      this.lbId = lbId;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the DeleteLoadBalancerOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected DeleteLoadBalancerOptions() { }

  protected DeleteLoadBalancerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dnszoneId,
      "dnszoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.lbId,
      "lbId cannot be empty");
    instanceId = builder.instanceId;
    dnszoneId = builder.dnszoneId;
    lbId = builder.lbId;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteLoadBalancerOptions builder
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
   * Gets the dnszoneId.
   *
   * The unique identifier of a DNS zone.
   *
   * @return the dnszoneId
   */
  public String dnszoneId() {
    return dnszoneId;
  }

  /**
   * Gets the lbId.
   *
   * The unique identifier of a load balancer.
   *
   * @return the lbId
   */
  public String lbId() {
    return lbId;
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

