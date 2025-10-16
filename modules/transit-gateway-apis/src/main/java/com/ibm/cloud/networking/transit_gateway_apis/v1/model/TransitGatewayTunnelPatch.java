/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.networking.transit_gateway_apis.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * An update template for a Transit Gateway connection tunnel.
 */
public class TransitGatewayTunnelPatch extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing TransitGatewayTunnelPatch instance.
     *
     * @param transitGatewayTunnelPatch the instance to initialize the Builder with
     */
    private Builder(TransitGatewayTunnelPatch transitGatewayTunnelPatch) {
      this.name = transitGatewayTunnelPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TransitGatewayTunnelPatch.
     *
     * @return the new TransitGatewayTunnelPatch instance
     */
    public TransitGatewayTunnelPatch build() {
      return new TransitGatewayTunnelPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TransitGatewayTunnelPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected TransitGatewayTunnelPatch() { }

  protected TransitGatewayTunnelPatch(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a TransitGatewayTunnelPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this connection tunnel.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the TransitGatewayTunnelPatch.
   *
   * Note that properties of the TransitGatewayTunnelPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the TransitGatewayTunnelPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

