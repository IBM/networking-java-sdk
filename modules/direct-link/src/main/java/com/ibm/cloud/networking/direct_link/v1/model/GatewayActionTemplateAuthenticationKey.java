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
 * Applicable for create_gateway_approve requests to select the gateway's BGP MD5 authentication key. The key material
 * that you provide must be base64 encoded and original string must be maximum 126 ASCII characters in length. To clear
 * the optional `authentication_key` field patch its crn to `""`.
 */
public class GatewayActionTemplateAuthenticationKey extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    private Builder(GatewayActionTemplateAuthenticationKey gatewayActionTemplateAuthenticationKey) {
      this.crn = gatewayActionTemplateAuthenticationKey.crn;
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
     * Builds a GatewayActionTemplateAuthenticationKey.
     *
     * @return the new GatewayActionTemplateAuthenticationKey instance
     */
    public GatewayActionTemplateAuthenticationKey build() {
      return new GatewayActionTemplateAuthenticationKey(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GatewayActionTemplateAuthenticationKey builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected GatewayActionTemplateAuthenticationKey(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a GatewayActionTemplateAuthenticationKey builder
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

