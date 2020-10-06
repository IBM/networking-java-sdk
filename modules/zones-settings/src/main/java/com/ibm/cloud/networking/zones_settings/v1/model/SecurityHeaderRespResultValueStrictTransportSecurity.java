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
public class SecurityHeaderRespResultValueStrictTransportSecurity extends GenericModel {

  protected Boolean enabled;
  @SerializedName("max_age")
  protected Long maxAge;
  @SerializedName("include_subdomains")
  protected Boolean includeSubdomains;
  protected Boolean nosniff;

  /**
   * Gets the enabled.
   *
   * Whether or not security header is enabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the maxAge.
   *
   * Max age in seconds.
   *
   * @return the maxAge
   */
  public Long getMaxAge() {
    return maxAge;
  }

  /**
   * Gets the includeSubdomains.
   *
   * Include all subdomains.
   *
   * @return the includeSubdomains
   */
  public Boolean isIncludeSubdomains() {
    return includeSubdomains;
  }

  /**
   * Gets the nosniff.
   *
   * Whether or not to include 'X-Content-Type-Options:nosniff' header.
   *
   * @return the nosniff
   */
  public Boolean isNosniff() {
    return nosniff;
  }
}

