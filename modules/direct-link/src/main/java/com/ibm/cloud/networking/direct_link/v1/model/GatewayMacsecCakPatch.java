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
package com.ibm.cloud.networking.direct_link.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Patch fields for CAK of MACsec configuration on a direct link.
 *
 * When rotating a CAK, patch both the `name` and `key` fields simultaneously. Both must have new values and cannot
 * match with another CAK. Neither `name` nor `key` is allowed to be patched on its own.
 */
public class GatewayMacsecCakPatch extends GenericModel {

  protected HpcsKeyIdentity key;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private HpcsKeyIdentity key;
    private String name;

    /**
     * Instantiates a new Builder from an existing GatewayMacsecCakPatch instance.
     *
     * @param gatewayMacsecCakPatch the instance to initialize the Builder with
     */
    private Builder(GatewayMacsecCakPatch gatewayMacsecCakPatch) {
      this.key = gatewayMacsecCakPatch.key;
      this.name = gatewayMacsecCakPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayMacsecCakPatch.
     *
     * @return the new GatewayMacsecCakPatch instance
     */
    public GatewayMacsecCakPatch build() {
      return new GatewayMacsecCakPatch(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the GatewayMacsecCakPatch builder
     */
    public Builder key(HpcsKeyIdentity key) {
      this.key = key;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GatewayMacsecCakPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GatewayMacsecCakPatch() { }

  protected GatewayMacsecCakPatch(Builder builder) {
    key = builder.key;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GatewayMacsecCakPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * A [Hyper Protect Crypto Service Standard Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started).
   *
   * @return the key
   */
  public HpcsKeyIdentity key() {
    return key;
  }

  /**
   * Gets the name.
   *
   * The name identifies the connectivity association key (CAK) within the MACsec key chain.
   *
   * The CAK's `name` must be a hexadecimal string of even lengths between 2 to 64 inclusive.
   *
   * This value, along with the material of the `key`, must match on the MACsec peers.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the GatewayMacsecCakPatch.
   *
   * Note that properties of the GatewayMacsecCakPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the GatewayMacsecCakPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

