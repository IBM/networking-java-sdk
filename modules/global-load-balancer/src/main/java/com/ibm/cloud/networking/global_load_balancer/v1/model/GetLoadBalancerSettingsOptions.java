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
package com.ibm.cloud.networking.global_load_balancer.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getLoadBalancerSettings options.
 */
public class GetLoadBalancerSettingsOptions extends GenericModel {

  protected String loadBalancerIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerIdentifier;

    private Builder(GetLoadBalancerSettingsOptions getLoadBalancerSettingsOptions) {
      this.loadBalancerIdentifier = getLoadBalancerSettingsOptions.loadBalancerIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancerIdentifier the loadBalancerIdentifier
     */
    public Builder(String loadBalancerIdentifier) {
      this.loadBalancerIdentifier = loadBalancerIdentifier;
    }

    /**
     * Builds a GetLoadBalancerSettingsOptions.
     *
     * @return the new GetLoadBalancerSettingsOptions instance
     */
    public GetLoadBalancerSettingsOptions build() {
      return new GetLoadBalancerSettingsOptions(this);
    }

    /**
     * Set the loadBalancerIdentifier.
     *
     * @param loadBalancerIdentifier the loadBalancerIdentifier
     * @return the GetLoadBalancerSettingsOptions builder
     */
    public Builder loadBalancerIdentifier(String loadBalancerIdentifier) {
      this.loadBalancerIdentifier = loadBalancerIdentifier;
      return this;
    }
  }

  protected GetLoadBalancerSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerIdentifier,
      "loadBalancerIdentifier cannot be empty");
    loadBalancerIdentifier = builder.loadBalancerIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetLoadBalancerSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancerIdentifier.
   *
   * load balancer identifier.
   *
   * @return the loadBalancerIdentifier
   */
  public String loadBalancerIdentifier() {
    return loadBalancerIdentifier;
  }
}

