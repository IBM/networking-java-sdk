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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BFD configuration information.
 */
public class GatewayBfdPatchTemplate extends GenericModel {

  protected Long interval;
  protected Long multiplier;

  /**
   * Builder.
   */
  public static class Builder {
    private Long interval;
    private Long multiplier;

    private Builder(GatewayBfdPatchTemplate gatewayBfdPatchTemplate) {
      this.interval = gatewayBfdPatchTemplate.interval;
      this.multiplier = gatewayBfdPatchTemplate.multiplier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayBfdPatchTemplate.
     *
     * @return the new GatewayBfdPatchTemplate instance
     */
    public GatewayBfdPatchTemplate build() {
      return new GatewayBfdPatchTemplate(this);
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the GatewayBfdPatchTemplate builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the multiplier.
     *
     * @param multiplier the multiplier
     * @return the GatewayBfdPatchTemplate builder
     */
    public Builder multiplier(long multiplier) {
      this.multiplier = multiplier;
      return this;
    }
  }

  protected GatewayBfdPatchTemplate(Builder builder) {
    interval = builder.interval;
    multiplier = builder.multiplier;
  }

  /**
   * New builder.
   *
   * @return a GatewayBfdPatchTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the interval.
   *
   * Minimum interval in milliseconds at which the local routing device transmits hello packets and then expects to
   * receive a reply from a neighbor with which it has established a BFD session.
   *
   * To clear the BFD configuration patch its interval to 0.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the multiplier.
   *
   * The number of hello packets not received by a neighbor that causes the originating interface to be declared down.
   *
   * @return the multiplier
   */
  public Long multiplier() {
    return multiplier;
  }
}

