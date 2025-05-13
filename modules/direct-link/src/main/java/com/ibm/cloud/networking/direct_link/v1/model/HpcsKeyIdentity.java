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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A [Hyper Protect Crypto Service Standard Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started).
 */
public class HpcsKeyIdentity extends GenericModel {

  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing HpcsKeyIdentity instance.
     *
     * @param hpcsKeyIdentity the instance to initialize the Builder with
     */
    private Builder(HpcsKeyIdentity hpcsKeyIdentity) {
      this.crn = hpcsKeyIdentity.crn;
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
     * Builds a HpcsKeyIdentity.
     *
     * @return the new HpcsKeyIdentity instance
     */
    public HpcsKeyIdentity build() {
      return new HpcsKeyIdentity(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the HpcsKeyIdentity builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected HpcsKeyIdentity() { }

  protected HpcsKeyIdentity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a HpcsKeyIdentity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The CRN of the key.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

