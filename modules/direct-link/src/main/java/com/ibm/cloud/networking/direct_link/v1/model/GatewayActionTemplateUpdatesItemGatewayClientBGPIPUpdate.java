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
 * Update BGP customer and IBM CIDR.
 */
public class GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate extends GatewayActionTemplateUpdatesItem {


  /**
   * Builder.
   */
  public static class Builder {
    private String bgpCerCidr;
    private String bgpIbmCidr;

    public Builder(GatewayActionTemplateUpdatesItem gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdate) {
      this.bgpCerCidr = gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdate.bgpCerCidr;
      this.bgpIbmCidr = gatewayActionTemplateUpdatesItemGatewayClientBgpipUpdate.bgpIbmCidr;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate.
     *
     * @return the new GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate instance
     */
    public GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate build() {
      return new GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate(this);
    }

    /**
     * Set the bgpCerCidr.
     *
     * @param bgpCerCidr the bgpCerCidr
     * @return the GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate builder
     */
    public Builder bgpCerCidr(String bgpCerCidr) {
      this.bgpCerCidr = bgpCerCidr;
      return this;
    }

    /**
     * Set the bgpIbmCidr.
     *
     * @param bgpIbmCidr the bgpIbmCidr
     * @return the GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate builder
     */
    public Builder bgpIbmCidr(String bgpIbmCidr) {
      this.bgpIbmCidr = bgpIbmCidr;
      return this;
    }
  }

  protected GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate(Builder builder) {
    bgpCerCidr = builder.bgpCerCidr;
    bgpIbmCidr = builder.bgpIbmCidr;
  }

  /**
   * New builder.
   *
   * @return a GatewayActionTemplateUpdatesItemGatewayClientBGPIPUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

