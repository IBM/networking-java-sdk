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
package com.ibm.cloud.networking.ssl_certificate_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * geo restrictions.
 */
public class CustomCertReqGeoRestrictions extends GenericModel {

  /**
   * properties.
   */
  public interface Label {
    /** us. */
    String US = "us";
    /** eu. */
    String EU = "eu";
    /** highest_security. */
    String HIGHEST_SECURITY = "highest_security";
  }

  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;

    private Builder(CustomCertReqGeoRestrictions customCertReqGeoRestrictions) {
      this.label = customCertReqGeoRestrictions.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     */
    public Builder(String label) {
      this.label = label;
    }

    /**
     * Builds a CustomCertReqGeoRestrictions.
     *
     * @return the new CustomCertReqGeoRestrictions instance
     */
    public CustomCertReqGeoRestrictions build() {
      return new CustomCertReqGeoRestrictions(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the CustomCertReqGeoRestrictions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected CustomCertReqGeoRestrictions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a CustomCertReqGeoRestrictions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * properties.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

