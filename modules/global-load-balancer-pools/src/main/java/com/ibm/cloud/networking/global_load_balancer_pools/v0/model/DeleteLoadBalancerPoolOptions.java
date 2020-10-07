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
package com.ibm.cloud.networking.global_load_balancer_pools.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteLoadBalancerPool options.
 */
public class DeleteLoadBalancerPoolOptions extends GenericModel {

  protected String poolIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String poolIdentifier;

    private Builder(DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions) {
      this.poolIdentifier = deleteLoadBalancerPoolOptions.poolIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param poolIdentifier the poolIdentifier
     */
    public Builder(String poolIdentifier) {
      this.poolIdentifier = poolIdentifier;
    }

    /**
     * Builds a DeleteLoadBalancerPoolOptions.
     *
     * @return the new DeleteLoadBalancerPoolOptions instance
     */
    public DeleteLoadBalancerPoolOptions build() {
      return new DeleteLoadBalancerPoolOptions(this);
    }

    /**
     * Set the poolIdentifier.
     *
     * @param poolIdentifier the poolIdentifier
     * @return the DeleteLoadBalancerPoolOptions builder
     */
    public Builder poolIdentifier(String poolIdentifier) {
      this.poolIdentifier = poolIdentifier;
      return this;
    }
  }

  protected DeleteLoadBalancerPoolOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.poolIdentifier,
      "poolIdentifier cannot be empty");
    poolIdentifier = builder.poolIdentifier;
  }

  /**
   * New builder.
   *
   * @return a DeleteLoadBalancerPoolOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the poolIdentifier.
   *
   * pool identifier.
   *
   * @return the poolIdentifier
   */
  public String poolIdentifier() {
    return poolIdentifier;
  }
}

