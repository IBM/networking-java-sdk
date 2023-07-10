/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.networking.mtls.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteAccessCertificate options.
 */
public class DeleteAccessCertificateOptions extends GenericModel {

  protected String zoneId;
  protected String certId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String certId;

    /**
     * Instantiates a new Builder from an existing DeleteAccessCertificateOptions instance.
     *
     * @param deleteAccessCertificateOptions the instance to initialize the Builder with
     */
    private Builder(DeleteAccessCertificateOptions deleteAccessCertificateOptions) {
      this.zoneId = deleteAccessCertificateOptions.zoneId;
      this.certId = deleteAccessCertificateOptions.certId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zoneId the zoneId
     * @param certId the certId
     */
    public Builder(String zoneId, String certId) {
      this.zoneId = zoneId;
      this.certId = certId;
    }

    /**
     * Builds a DeleteAccessCertificateOptions.
     *
     * @return the new DeleteAccessCertificateOptions instance
     */
    public DeleteAccessCertificateOptions build() {
      return new DeleteAccessCertificateOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the DeleteAccessCertificateOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the certId.
     *
     * @param certId the certId
     * @return the DeleteAccessCertificateOptions builder
     */
    public Builder certId(String certId) {
      this.certId = certId;
      return this;
    }
  }

  protected DeleteAccessCertificateOptions() { }

  protected DeleteAccessCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.certId,
      "certId cannot be empty");
    zoneId = builder.zoneId;
    certId = builder.certId;
  }

  /**
   * New builder.
   *
   * @return a DeleteAccessCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneId.
   *
   * Zone ID.
   *
   * @return the zoneId
   */
  public String zoneId() {
    return zoneId;
  }

  /**
   * Gets the certId.
   *
   * Access certificate ID.
   *
   * @return the certId
   */
  public String certId() {
    return certId;
  }
}

