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
package com.ibm.cloud.networking.direct_link.v1.model;

/**
 * Update VLAN for this gateway
 *
 * VLAN provided should be in the range 1 to 4094.
 */
public class GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate extends GatewayActionTemplateUpdatesItem {


  /**
   * Builder.
   */
  public static class Builder {
    private Long vlan;

    public Builder(GatewayActionTemplateUpdatesItem gatewayActionTemplateUpdatesItemGatewayClientVlanUpdate) {
      this.vlan = gatewayActionTemplateUpdatesItemGatewayClientVlanUpdate.vlan;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate.
     *
     * @return the new GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate instance
     */
    public GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate build() {
      return new GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate(this);
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate(Builder builder) {
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a GatewayActionTemplateUpdatesItemGatewayClientVLANUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

