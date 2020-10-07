/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.cloud.networking.global_load_balancer_monitor.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteLoadBalancerMonitor options.
 */
public class DeleteLoadBalancerMonitorOptions extends GenericModel {

  protected String monitorIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String monitorIdentifier;

    private Builder(DeleteLoadBalancerMonitorOptions deleteLoadBalancerMonitorOptions) {
      this.monitorIdentifier = deleteLoadBalancerMonitorOptions.monitorIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param monitorIdentifier the monitorIdentifier
     */
    public Builder(String monitorIdentifier) {
      this.monitorIdentifier = monitorIdentifier;
    }

    /**
     * Builds a DeleteLoadBalancerMonitorOptions.
     *
     * @return the new DeleteLoadBalancerMonitorOptions instance
     */
    public DeleteLoadBalancerMonitorOptions build() {
      return new DeleteLoadBalancerMonitorOptions(this);
    }

    /**
     * Set the monitorIdentifier.
     *
     * @param monitorIdentifier the monitorIdentifier
     * @return the DeleteLoadBalancerMonitorOptions builder
     */
    public Builder monitorIdentifier(String monitorIdentifier) {
      this.monitorIdentifier = monitorIdentifier;
      return this;
    }
  }

  protected DeleteLoadBalancerMonitorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.monitorIdentifier,
      "monitorIdentifier cannot be empty");
    monitorIdentifier = builder.monitorIdentifier;
  }

  /**
   * New builder.
   *
   * @return a DeleteLoadBalancerMonitorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the monitorIdentifier.
   *
   * monitor identifier.
   *
   * @return the monitorIdentifier
   */
  public String monitorIdentifier() {
    return monitorIdentifier;
  }
}

