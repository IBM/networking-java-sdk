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
 * items.
 */
public class LoadBalancerPoolReqOriginsItem extends GenericModel {

  protected String name;
  protected String address;
  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String address;
    private Boolean enabled;

    private Builder(LoadBalancerPoolReqOriginsItem loadBalancerPoolReqOriginsItem) {
      this.name = loadBalancerPoolReqOriginsItem.name;
      this.address = loadBalancerPoolReqOriginsItem.address;
      this.enabled = loadBalancerPoolReqOriginsItem.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolReqOriginsItem.
     *
     * @return the new LoadBalancerPoolReqOriginsItem instance
     */
    public LoadBalancerPoolReqOriginsItem build() {
      return new LoadBalancerPoolReqOriginsItem(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerPoolReqOriginsItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the LoadBalancerPoolReqOriginsItem builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the LoadBalancerPoolReqOriginsItem builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected LoadBalancerPoolReqOriginsItem(Builder builder) {
    name = builder.name;
    address = builder.address;
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolReqOriginsItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the address.
   *
   * address.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the enabled.
   *
   * enabled/disabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

