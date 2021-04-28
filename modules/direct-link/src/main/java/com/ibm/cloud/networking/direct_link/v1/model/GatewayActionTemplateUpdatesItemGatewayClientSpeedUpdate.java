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

/**
 * gateway speed change.
 */
public class GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate extends GatewayActionTemplateUpdatesItem {


  /**
   * Builder.
   */
  public static class Builder {
    private Long speedMbps;

    public Builder(GatewayActionTemplateUpdatesItem gatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate) {
      this.speedMbps = gatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.speedMbps;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate.
     *
     * @return the new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate instance
     */
    public GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate build() {
      return new GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate(this);
    }

    /**
     * Set the speedMbps.
     *
     * @param speedMbps the speedMbps
     * @return the GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate builder
     */
    public Builder speedMbps(long speedMbps) {
      this.speedMbps = speedMbps;
      return this;
    }
  }

  protected GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate(Builder builder) {
    speedMbps = builder.speedMbps;
  }

  /**
   * New builder.
   *
   * @return a GatewayActionTemplateUpdatesItemGatewayClientSpeedUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

