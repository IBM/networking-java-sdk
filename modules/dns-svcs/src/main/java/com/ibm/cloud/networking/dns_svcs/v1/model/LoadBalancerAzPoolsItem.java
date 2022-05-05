/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerAzPoolsItem.
 */
public class LoadBalancerAzPoolsItem extends GenericModel {

  @SerializedName("availability_zone")
  protected String availabilityZone;
  protected List<String> pools;

  /**
   * Builder.
   */
  public static class Builder {
    private String availabilityZone;
    private List<String> pools;

    private Builder(LoadBalancerAzPoolsItem loadBalancerAzPoolsItem) {
      this.availabilityZone = loadBalancerAzPoolsItem.availabilityZone;
      this.pools = loadBalancerAzPoolsItem.pools;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerAzPoolsItem.
     *
     * @return the new LoadBalancerAzPoolsItem instance
     */
    public LoadBalancerAzPoolsItem build() {
      return new LoadBalancerAzPoolsItem(this);
    }

    /**
     * Adds an pools to pools.
     *
     * @param pools the new pools
     * @return the LoadBalancerAzPoolsItem builder
     */
    public Builder addPools(String pools) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pools,
        "pools cannot be null");
      if (this.pools == null) {
        this.pools = new ArrayList<String>();
      }
      this.pools.add(pools);
      return this;
    }

    /**
     * Set the availabilityZone.
     *
     * @param availabilityZone the availabilityZone
     * @return the LoadBalancerAzPoolsItem builder
     */
    public Builder availabilityZone(String availabilityZone) {
      this.availabilityZone = availabilityZone;
      return this;
    }

    /**
     * Set the pools.
     * Existing pools will be replaced.
     *
     * @param pools the pools
     * @return the LoadBalancerAzPoolsItem builder
     */
    public Builder pools(List<String> pools) {
      this.pools = pools;
      return this;
    }
  }

  protected LoadBalancerAzPoolsItem(Builder builder) {
    availabilityZone = builder.availabilityZone;
    pools = builder.pools;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerAzPoolsItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the availabilityZone.
   *
   * Availability zone.
   *
   * @return the availabilityZone
   */
  public String availabilityZone() {
    return availabilityZone;
  }

  /**
   * Gets the pools.
   *
   * List of load balancer pools.
   *
   * @return the pools
   */
  public List<String> pools() {
    return pools;
  }
}

