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
public class MobileRedirecSettingValue extends GenericModel {

  /**
   * Whether or not the mobile redirection is enabled.
   */
  public interface Status {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String status;
  @SerializedName("mobile_subdomain")
  protected String mobileSubdomain;
  @SerializedName("strip_uri")
  protected Boolean stripUri;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private String mobileSubdomain;
    private Boolean stripUri;

    private Builder(MobileRedirecSettingValue mobileRedirecSettingValue) {
      this.status = mobileRedirecSettingValue.status;
      this.mobileSubdomain = mobileRedirecSettingValue.mobileSubdomain;
      this.stripUri = mobileRedirecSettingValue.stripUri;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param status the status
     * @param mobileSubdomain the mobileSubdomain
     * @param stripUri the stripUri
     */
    public Builder(String status, String mobileSubdomain, Boolean stripUri) {
      this.status = status;
      this.mobileSubdomain = mobileSubdomain;
      this.stripUri = stripUri;
    }

    /**
     * Builds a MobileRedirecSettingValue.
     *
     * @return the new MobileRedirecSettingValue instance
     */
    public MobileRedirecSettingValue build() {
      return new MobileRedirecSettingValue(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the MobileRedirecSettingValue builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the mobileSubdomain.
     *
     * @param mobileSubdomain the mobileSubdomain
     * @return the MobileRedirecSettingValue builder
     */
    public Builder mobileSubdomain(String mobileSubdomain) {
      this.mobileSubdomain = mobileSubdomain;
      return this;
    }

    /**
     * Set the stripUri.
     *
     * @param stripUri the stripUri
     * @return the MobileRedirecSettingValue builder
     */
    public Builder stripUri(Boolean stripUri) {
      this.stripUri = stripUri;
      return this;
    }
  }

  protected MobileRedirecSettingValue(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mobileSubdomain,
      "mobileSubdomain cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.stripUri,
      "stripUri cannot be null");
    status = builder.status;
    mobileSubdomain = builder.mobileSubdomain;
    stripUri = builder.stripUri;
  }

  /**
   * New builder.
   *
   * @return a MobileRedirecSettingValue builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Whether or not the mobile redirection is enabled.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the mobileSubdomain.
   *
   * Which subdomain prefix you wish to redirect visitors on mobile devices to.
   *
   * @return the mobileSubdomain
   */
  public String mobileSubdomain() {
    return mobileSubdomain;
  }

  /**
   * Gets the stripUri.
   *
   * Whether to drop the current page path and redirect to the mobile subdomain URL root or to keep the path and
   * redirect to the same page on the mobile subdomain.
   *
   * @return the stripUri
   */
  public Boolean stripUri() {
    return stripUri;
  }
}

