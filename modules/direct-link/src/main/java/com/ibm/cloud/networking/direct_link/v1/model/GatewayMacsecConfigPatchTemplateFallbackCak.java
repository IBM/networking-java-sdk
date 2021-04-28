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
 * Fallback connectivity association key.
 *
 * MACsec keys must be type=standard with key name lengths between 2 to 64 inclusive and contain only characters
 * [a-fA-F0-9]. The key material must be exactly 64 characters in length and contain only [a-fA-F0-9].
 *
 * To clear the optional `fallback_cak` field patch its crn to `""`.
 *
 * A gateway's `fallback_cak` crn cannot match its `primary_cak` crn.
 */
public class GatewayMacsecConfigPatchTemplateFallbackCak extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    private Builder(GatewayMacsecConfigPatchTemplateFallbackCak gatewayMacsecConfigPatchTemplateFallbackCak) {
      this.crn = gatewayMacsecConfigPatchTemplateFallbackCak.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a GatewayMacsecConfigPatchTemplateFallbackCak.
     *
     * @return the new GatewayMacsecConfigPatchTemplateFallbackCak instance
     */
    public GatewayMacsecConfigPatchTemplateFallbackCak build() {
      return new GatewayMacsecConfigPatchTemplateFallbackCak(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GatewayMacsecConfigPatchTemplateFallbackCak builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected GatewayMacsecConfigPatchTemplateFallbackCak(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a GatewayMacsecConfigPatchTemplateFallbackCak builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * connectivity association key crn.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

