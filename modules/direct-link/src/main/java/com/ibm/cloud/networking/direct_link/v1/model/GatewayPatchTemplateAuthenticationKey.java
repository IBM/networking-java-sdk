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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The identity of the standard key to use for BGP MD5 authentication key. The key material that you provide must be
 * base64 encoded and original string must be maximum 126 ASCII characters in length. To clear the optional
 * `authentication_key` field patch its crn to `""`.
 */
public class GatewayPatchTemplateAuthenticationKey extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    private Builder(GatewayPatchTemplateAuthenticationKey gatewayPatchTemplateAuthenticationKey) {
      this.crn = gatewayPatchTemplateAuthenticationKey.crn;
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
     * Builds a GatewayPatchTemplateAuthenticationKey.
     *
     * @return the new GatewayPatchTemplateAuthenticationKey instance
     */
    public GatewayPatchTemplateAuthenticationKey build() {
      return new GatewayPatchTemplateAuthenticationKey(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GatewayPatchTemplateAuthenticationKey builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected GatewayPatchTemplateAuthenticationKey(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a GatewayPatchTemplateAuthenticationKey builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The CRN of the [Key Protect Standard
   * Key](https://cloud.ibm.com/docs/key-protect?topic=key-protect-getting-started-tutorial) or [Hyper Protect Crypto
   * Service Standard Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started) for this resource.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

