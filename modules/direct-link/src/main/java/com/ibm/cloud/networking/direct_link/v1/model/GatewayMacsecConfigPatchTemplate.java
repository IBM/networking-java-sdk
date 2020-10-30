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
package com.ibm.cloud.networking.direct_link.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MACsec configuration information.  When patching any macsec_config fields, no other fields may be specified in the
 * patch request.  Contact IBM support for access to MACsec.
 *
 * A MACsec config cannot be added to a gateway created without MACsec.
 */
public class GatewayMacsecConfigPatchTemplate extends GenericModel {

  protected Boolean active;
  @SerializedName("fallback_cak")
  protected GatewayMacsecConfigPatchTemplateFallbackCak fallbackCak;
  @SerializedName("primary_cak")
  protected GatewayMacsecConfigPatchTemplatePrimaryCak primaryCak;
  @SerializedName("window_size")
  protected Long windowSize;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private GatewayMacsecConfigPatchTemplateFallbackCak fallbackCak;
    private GatewayMacsecConfigPatchTemplatePrimaryCak primaryCak;
    private Long windowSize;

    private Builder(GatewayMacsecConfigPatchTemplate gatewayMacsecConfigPatchTemplate) {
      this.active = gatewayMacsecConfigPatchTemplate.active;
      this.fallbackCak = gatewayMacsecConfigPatchTemplate.fallbackCak;
      this.primaryCak = gatewayMacsecConfigPatchTemplate.primaryCak;
      this.windowSize = gatewayMacsecConfigPatchTemplate.windowSize;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GatewayMacsecConfigPatchTemplate.
     *
     * @return the new GatewayMacsecConfigPatchTemplate instance
     */
    public GatewayMacsecConfigPatchTemplate build() {
      return new GatewayMacsecConfigPatchTemplate(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the GatewayMacsecConfigPatchTemplate builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the fallbackCak.
     *
     * @param fallbackCak the fallbackCak
     * @return the GatewayMacsecConfigPatchTemplate builder
     */
    public Builder fallbackCak(GatewayMacsecConfigPatchTemplateFallbackCak fallbackCak) {
      this.fallbackCak = fallbackCak;
      return this;
    }

    /**
     * Set the primaryCak.
     *
     * @param primaryCak the primaryCak
     * @return the GatewayMacsecConfigPatchTemplate builder
     */
    public Builder primaryCak(GatewayMacsecConfigPatchTemplatePrimaryCak primaryCak) {
      this.primaryCak = primaryCak;
      return this;
    }

    /**
     * Set the windowSize.
     *
     * @param windowSize the windowSize
     * @return the GatewayMacsecConfigPatchTemplate builder
     */
    public Builder windowSize(long windowSize) {
      this.windowSize = windowSize;
      return this;
    }
  }

  protected GatewayMacsecConfigPatchTemplate(Builder builder) {
    active = builder.active;
    fallbackCak = builder.fallbackCak;
    primaryCak = builder.primaryCak;
    windowSize = builder.windowSize;
  }

  /**
   * New builder.
   *
   * @return a GatewayMacsecConfigPatchTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Indicate whether MACsec protection should be active (true) or inactive (false) for this MACsec enabled gateway.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the fallbackCak.
   *
   * Fallback connectivity association key.
   *
   * The `fallback_cak` crn cannot match the `primary_cak` crn.
   *
   * MACsec keys must be type=standard with key name lengths between 2 to 64 inclusive and contain only characters
   * [a-fA-F0-9].
   * The key material must be exactly 64 characters in length and contain only [a-fA-F0-9].
   *
   * To clear the optional `fallback_cak` field patch its crn to `""`.
   *
   * A gateway's `fallback_cak` crn cannot match its `primary_cak` crn.
   *
   * @return the fallbackCak
   */
  public GatewayMacsecConfigPatchTemplateFallbackCak fallbackCak() {
    return fallbackCak;
  }

  /**
   * Gets the primaryCak.
   *
   * Desired primary connectivity association key.
   *
   * MACsec keys must be type=standard with key name lengths between 2 to 64 inclusive and contain only characters
   * [a-fA-F0-9].
   * The key material must be exactly 64 characters in length and contain only [a-fA-F0-9].
   *
   * A gateway's `primary_cak` crn cannot match its `fallback_cak` crn.
   *
   * @return the primaryCak
   */
  public GatewayMacsecConfigPatchTemplatePrimaryCak primaryCak() {
    return primaryCak;
  }

  /**
   * Gets the windowSize.
   *
   * replay protection window size.
   *
   * @return the windowSize
   */
  public Long windowSize() {
    return windowSize;
  }
}

