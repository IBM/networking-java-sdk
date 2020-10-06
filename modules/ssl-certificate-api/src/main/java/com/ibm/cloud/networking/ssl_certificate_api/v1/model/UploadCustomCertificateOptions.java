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
 * The uploadCustomCertificate options.
 */
public class UploadCustomCertificateOptions extends GenericModel {

  /**
   * Methods shown in UI mapping to API: Compatible(ubiquitous), Modern(optimal), User Defined(force).
   */
  public interface BundleMethod {
    /** ubiquitous. */
    String UBIQUITOUS = "ubiquitous";
    /** optimal. */
    String OPTIMAL = "optimal";
    /** force. */
    String FORCE = "force";
  }

  protected String certificate;
  protected String privateKey;
  protected String bundleMethod;
  protected CustomCertReqGeoRestrictions geoRestrictions;

  /**
   * Builder.
   */
  public static class Builder {
    private String certificate;
    private String privateKey;
    private String bundleMethod;
    private CustomCertReqGeoRestrictions geoRestrictions;

    private Builder(UploadCustomCertificateOptions uploadCustomCertificateOptions) {
      this.certificate = uploadCustomCertificateOptions.certificate;
      this.privateKey = uploadCustomCertificateOptions.privateKey;
      this.bundleMethod = uploadCustomCertificateOptions.bundleMethod;
      this.geoRestrictions = uploadCustomCertificateOptions.geoRestrictions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UploadCustomCertificateOptions.
     *
     * @return the new UploadCustomCertificateOptions instance
     */
    public UploadCustomCertificateOptions build() {
      return new UploadCustomCertificateOptions(this);
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the UploadCustomCertificateOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the UploadCustomCertificateOptions builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the bundleMethod.
     *
     * @param bundleMethod the bundleMethod
     * @return the UploadCustomCertificateOptions builder
     */
    public Builder bundleMethod(String bundleMethod) {
      this.bundleMethod = bundleMethod;
      return this;
    }

    /**
     * Set the geoRestrictions.
     *
     * @param geoRestrictions the geoRestrictions
     * @return the UploadCustomCertificateOptions builder
     */
    public Builder geoRestrictions(CustomCertReqGeoRestrictions geoRestrictions) {
      this.geoRestrictions = geoRestrictions;
      return this;
    }
  }

  protected UploadCustomCertificateOptions(Builder builder) {
    certificate = builder.certificate;
    privateKey = builder.privateKey;
    bundleMethod = builder.bundleMethod;
    geoRestrictions = builder.geoRestrictions;
  }

  /**
   * New builder.
   *
   * @return a UploadCustomCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificate.
   *
   * certificates.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the privateKey.
   *
   * private key.
   *
   * @return the privateKey
   */
  public String privateKey() {
    return privateKey;
  }

  /**
   * Gets the bundleMethod.
   *
   * Methods shown in UI mapping to API: Compatible(ubiquitous), Modern(optimal), User Defined(force).
   *
   * @return the bundleMethod
   */
  public String bundleMethod() {
    return bundleMethod;
  }

  /**
   * Gets the geoRestrictions.
   *
   * geo restrictions.
   *
   * @return the geoRestrictions
   */
  public CustomCertReqGeoRestrictions geoRestrictions() {
    return geoRestrictions;
  }
}

