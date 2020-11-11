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
 * The deleteCertificate options.
 */
public class DeleteCertificateOptions extends GenericModel {

  protected String certIdentifier;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String certIdentifier;
    private String xCorrelationId;

    private Builder(DeleteCertificateOptions deleteCertificateOptions) {
      this.certIdentifier = deleteCertificateOptions.certIdentifier;
      this.xCorrelationId = deleteCertificateOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param certIdentifier the certIdentifier
     */
    public Builder(String certIdentifier) {
      this.certIdentifier = certIdentifier;
    }

    /**
     * Builds a DeleteCertificateOptions.
     *
     * @return the new DeleteCertificateOptions instance
     */
    public DeleteCertificateOptions build() {
      return new DeleteCertificateOptions(this);
    }

    /**
     * Set the certIdentifier.
     *
     * @param certIdentifier the certIdentifier
     * @return the DeleteCertificateOptions builder
     */
    public Builder certIdentifier(String certIdentifier) {
      this.certIdentifier = certIdentifier;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the DeleteCertificateOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected DeleteCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.certIdentifier,
      "certIdentifier cannot be empty");
    certIdentifier = builder.certIdentifier;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a DeleteCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certIdentifier.
   *
   * cedrtificate identifier.
   *
   * @return the certIdentifier
   */
  public String certIdentifier() {
    return certIdentifier;
  }

  /**
   * Gets the xCorrelationId.
   *
   * uuid, identify a session.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

