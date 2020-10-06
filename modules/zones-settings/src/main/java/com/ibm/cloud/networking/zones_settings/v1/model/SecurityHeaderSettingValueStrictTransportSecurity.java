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
 * Strict transport security.
 */
public class SecurityHeaderSettingValueStrictTransportSecurity extends GenericModel {

  protected Boolean enabled;
  @SerializedName("max_age")
  protected Long maxAge;
  @SerializedName("include_subdomains")
  protected Boolean includeSubdomains;
  protected Boolean nosniff;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private Long maxAge;
    private Boolean includeSubdomains;
    private Boolean nosniff;

    private Builder(SecurityHeaderSettingValueStrictTransportSecurity securityHeaderSettingValueStrictTransportSecurity) {
      this.enabled = securityHeaderSettingValueStrictTransportSecurity.enabled;
      this.maxAge = securityHeaderSettingValueStrictTransportSecurity.maxAge;
      this.includeSubdomains = securityHeaderSettingValueStrictTransportSecurity.includeSubdomains;
      this.nosniff = securityHeaderSettingValueStrictTransportSecurity.nosniff;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param enabled the enabled
     * @param maxAge the maxAge
     * @param includeSubdomains the includeSubdomains
     * @param nosniff the nosniff
     */
    public Builder(Boolean enabled, Long maxAge, Boolean includeSubdomains, Boolean nosniff) {
      this.enabled = enabled;
      this.maxAge = maxAge;
      this.includeSubdomains = includeSubdomains;
      this.nosniff = nosniff;
    }

    /**
     * Builds a SecurityHeaderSettingValueStrictTransportSecurity.
     *
     * @return the new SecurityHeaderSettingValueStrictTransportSecurity instance
     */
    public SecurityHeaderSettingValueStrictTransportSecurity build() {
      return new SecurityHeaderSettingValueStrictTransportSecurity(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the SecurityHeaderSettingValueStrictTransportSecurity builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the maxAge.
     *
     * @param maxAge the maxAge
     * @return the SecurityHeaderSettingValueStrictTransportSecurity builder
     */
    public Builder maxAge(long maxAge) {
      this.maxAge = maxAge;
      return this;
    }

    /**
     * Set the includeSubdomains.
     *
     * @param includeSubdomains the includeSubdomains
     * @return the SecurityHeaderSettingValueStrictTransportSecurity builder
     */
    public Builder includeSubdomains(Boolean includeSubdomains) {
      this.includeSubdomains = includeSubdomains;
      return this;
    }

    /**
     * Set the nosniff.
     *
     * @param nosniff the nosniff
     * @return the SecurityHeaderSettingValueStrictTransportSecurity builder
     */
    public Builder nosniff(Boolean nosniff) {
      this.nosniff = nosniff;
      return this;
    }
  }

  protected SecurityHeaderSettingValueStrictTransportSecurity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enabled,
      "enabled cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxAge,
      "maxAge cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.includeSubdomains,
      "includeSubdomains cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nosniff,
      "nosniff cannot be null");
    enabled = builder.enabled;
    maxAge = builder.maxAge;
    includeSubdomains = builder.includeSubdomains;
    nosniff = builder.nosniff;
  }

  /**
   * New builder.
   *
   * @return a SecurityHeaderSettingValueStrictTransportSecurity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Whether or not security header is enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the maxAge.
   *
   * Max age in seconds.
   *
   * @return the maxAge
   */
  public Long maxAge() {
    return maxAge;
  }

  /**
   * Gets the includeSubdomains.
   *
   * Include all subdomains.
   *
   * @return the includeSubdomains
   */
  public Boolean includeSubdomains() {
    return includeSubdomains;
  }

  /**
   * Gets the nosniff.
   *
   * Whether or not to include 'X-Content-Type-Options:nosniff' header.
   *
   * @return the nosniff
   */
  public Boolean nosniff() {
    return nosniff;
  }
}

