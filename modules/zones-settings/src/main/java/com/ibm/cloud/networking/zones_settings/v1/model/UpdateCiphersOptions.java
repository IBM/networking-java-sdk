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
package com.ibm.cloud.networking.zones_settings.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateCiphers options.
 */
public class UpdateCiphersOptions extends GenericModel {

  public interface Value {
    /** ECDHE-ECDSA-AES128-GCM-SHA256. */
    String ECDHE_ECDSA_AES128_GCM_SHA256 = "ECDHE-ECDSA-AES128-GCM-SHA256";
    /** ECDHE-ECDSA-CHACHA20-POLY1305. */
    String ECDHE_ECDSA_CHACHA20_POLY1305 = "ECDHE-ECDSA-CHACHA20-POLY1305";
    /** ECDHE-RSA-AES128-GCM-SHA256. */
    String ECDHE_RSA_AES128_GCM_SHA256 = "ECDHE-RSA-AES128-GCM-SHA256";
    /** ECDHE-RSA-CHACHA20-POLY1305. */
    String ECDHE_RSA_CHACHA20_POLY1305 = "ECDHE-RSA-CHACHA20-POLY1305";
    /** ECDHE-ECDSA-AES128-SHA256. */
    String ECDHE_ECDSA_AES128_SHA256 = "ECDHE-ECDSA-AES128-SHA256";
    /** ECDHE-ECDSA-AES128-SHA. */
    String ECDHE_ECDSA_AES128_SHA = "ECDHE-ECDSA-AES128-SHA";
    /** ECDHE-RSA-AES128-SHA256. */
    String ECDHE_RSA_AES128_SHA256 = "ECDHE-RSA-AES128-SHA256";
    /** ECDHE-RSA-AES128-SHA. */
    String ECDHE_RSA_AES128_SHA = "ECDHE-RSA-AES128-SHA";
    /** AES128-GCM-SHA256. */
    String AES128_GCM_SHA256 = "AES128-GCM-SHA256";
    /** AES128-SHA256. */
    String AES128_SHA256 = "AES128-SHA256";
    /** AES128-SHA. */
    String AES128_SHA = "AES128-SHA";
    /** ECDHE-ECDSA-AES256-GCM-SHA384. */
    String ECDHE_ECDSA_AES256_GCM_SHA384 = "ECDHE-ECDSA-AES256-GCM-SHA384";
    /** ECDHE-ECDSA-AES256-SHA384. */
    String ECDHE_ECDSA_AES256_SHA384 = "ECDHE-ECDSA-AES256-SHA384";
    /** ECDHE-RSA-AES256-GCM-SHA384. */
    String ECDHE_RSA_AES256_GCM_SHA384 = "ECDHE-RSA-AES256-GCM-SHA384";
    /** ECDHE-RSA-AES256-SHA384. */
    String ECDHE_RSA_AES256_SHA384 = "ECDHE-RSA-AES256-SHA384";
    /** ECDHE-RSA-AES256-SHA. */
    String ECDHE_RSA_AES256_SHA = "ECDHE-RSA-AES256-SHA";
    /** AES256-GCM-SHA384. */
    String AES256_GCM_SHA384 = "AES256-GCM-SHA384";
    /** AES256-SHA256. */
    String AES256_SHA256 = "AES256-SHA256";
    /** AES256-SHA. */
    String AES256_SHA = "AES256-SHA";
    /** DES-CBC3-SHA. */
    String DES_CBC3_SHA = "DES-CBC3-SHA";
  }

  protected List<String> value;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> value;

    private Builder(UpdateCiphersOptions updateCiphersOptions) {
      this.value = updateCiphersOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateCiphersOptions.
     *
     * @return the new UpdateCiphersOptions instance
     */
    public UpdateCiphersOptions build() {
      return new UpdateCiphersOptions(this);
    }

    /**
     * Adds an value to value.
     *
     * @param value the new value
     * @return the UpdateCiphersOptions builder
     */
    public Builder addValue(String value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(value,
        "value cannot be null");
      if (this.value == null) {
        this.value = new ArrayList<String>();
      }
      this.value.add(value);
      return this;
    }

    /**
     * Set the value.
     * Existing value will be replaced.
     *
     * @param value the value
     * @return the UpdateCiphersOptions builder
     */
    public Builder value(List<String> value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateCiphersOptions(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateCiphersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Value.
   *
   * @return the value
   */
  public List<String> value() {
    return value;
  }
}

