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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Value.
 */
public class SecurityHeaderSettingValue extends GenericModel {

  @SerializedName("strict_transport_security")
  protected SecurityHeaderSettingValueStrictTransportSecurity strictTransportSecurity;

  /**
   * Builder.
   */
  public static class Builder {
    private SecurityHeaderSettingValueStrictTransportSecurity strictTransportSecurity;

    private Builder(SecurityHeaderSettingValue securityHeaderSettingValue) {
      this.strictTransportSecurity = securityHeaderSettingValue.strictTransportSecurity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param strictTransportSecurity the strictTransportSecurity
     */
    public Builder(SecurityHeaderSettingValueStrictTransportSecurity strictTransportSecurity) {
      this.strictTransportSecurity = strictTransportSecurity;
    }

    /**
     * Builds a SecurityHeaderSettingValue.
     *
     * @return the new SecurityHeaderSettingValue instance
     */
    public SecurityHeaderSettingValue build() {
      return new SecurityHeaderSettingValue(this);
    }

    /**
     * Set the strictTransportSecurity.
     *
     * @param strictTransportSecurity the strictTransportSecurity
     * @return the SecurityHeaderSettingValue builder
     */
    public Builder strictTransportSecurity(SecurityHeaderSettingValueStrictTransportSecurity strictTransportSecurity) {
      this.strictTransportSecurity = strictTransportSecurity;
      return this;
    }
  }

  protected SecurityHeaderSettingValue(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.strictTransportSecurity,
      "strictTransportSecurity cannot be null");
    strictTransportSecurity = builder.strictTransportSecurity;
  }

  /**
   * New builder.
   *
   * @return a SecurityHeaderSettingValue builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the strictTransportSecurity.
   *
   * Strict transport security.
   *
   * @return the strictTransportSecurity
   */
  public SecurityHeaderSettingValueStrictTransportSecurity strictTransportSecurity() {
    return strictTransportSecurity;
  }
}

