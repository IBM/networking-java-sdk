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
 * MACsec configuration information.  Contact IBM support for access to MACsec.
 */
public class GatewayMacsecConfigTemplate extends GenericModel {

  protected Boolean active;
  @SerializedName("fallback_cak")
  protected GatewayMacsecConfigTemplateFallbackCak fallbackCak;
  @SerializedName("primary_cak")
  protected GatewayMacsecConfigTemplatePrimaryCak primaryCak;
  @SerializedName("window_size")
  protected Long windowSize;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private GatewayMacsecConfigTemplateFallbackCak fallbackCak;
    private GatewayMacsecConfigTemplatePrimaryCak primaryCak;
    private Long windowSize;

    private Builder(GatewayMacsecConfigTemplate gatewayMacsecConfigTemplate) {
      this.active = gatewayMacsecConfigTemplate.active;
      this.fallbackCak = gatewayMacsecConfigTemplate.fallbackCak;
      this.primaryCak = gatewayMacsecConfigTemplate.primaryCak;
      this.windowSize = gatewayMacsecConfigTemplate.windowSize;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param active the active
     * @param primaryCak the primaryCak
     */
    public Builder(Boolean active, GatewayMacsecConfigTemplatePrimaryCak primaryCak) {
      this.active = active;
      this.primaryCak = primaryCak;
    }

    /**
     * Builds a GatewayMacsecConfigTemplate.
     *
     * @return the new GatewayMacsecConfigTemplate instance
     */
    public GatewayMacsecConfigTemplate build() {
      return new GatewayMacsecConfigTemplate(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the GatewayMacsecConfigTemplate builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the fallbackCak.
     *
     * @param fallbackCak the fallbackCak
     * @return the GatewayMacsecConfigTemplate builder
     */
    public Builder fallbackCak(GatewayMacsecConfigTemplateFallbackCak fallbackCak) {
      this.fallbackCak = fallbackCak;
      return this;
    }

    /**
     * Set the primaryCak.
     *
     * @param primaryCak the primaryCak
     * @return the GatewayMacsecConfigTemplate builder
     */
    public Builder primaryCak(GatewayMacsecConfigTemplatePrimaryCak primaryCak) {
      this.primaryCak = primaryCak;
      return this;
    }

    /**
     * Set the windowSize.
     *
     * @param windowSize the windowSize
     * @return the GatewayMacsecConfigTemplate builder
     */
    public Builder windowSize(long windowSize) {
      this.windowSize = windowSize;
      return this;
    }
  }

  protected GatewayMacsecConfigTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.active,
      "active cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryCak,
      "primaryCak cannot be null");
    active = builder.active;
    fallbackCak = builder.fallbackCak;
    primaryCak = builder.primaryCak;
    windowSize = builder.windowSize;
  }

  /**
   * New builder.
   *
   * @return a GatewayMacsecConfigTemplate builder
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
   * MACsec keys must be type=standard with key name lengths between 2 to 64 inclusive and contain only characters
   * [a-fA-F0-9].
   * The key material must be exactly 64 characters in length and contain only [a-fA-F0-9].
   *
   * @return the fallbackCak
   */
  public GatewayMacsecConfigTemplateFallbackCak fallbackCak() {
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
   * @return the primaryCak
   */
  public GatewayMacsecConfigTemplatePrimaryCak primaryCak() {
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

