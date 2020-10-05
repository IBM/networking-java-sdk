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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The changeCertificatePriority options.
 */
public class ChangeCertificatePriorityOptions extends GenericModel {

  protected List<CertPriorityReqCertificatesItem> certificates;

  /**
   * Builder.
   */
  public static class Builder {
    private List<CertPriorityReqCertificatesItem> certificates;

    private Builder(ChangeCertificatePriorityOptions changeCertificatePriorityOptions) {
      this.certificates = changeCertificatePriorityOptions.certificates;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ChangeCertificatePriorityOptions.
     *
     * @return the new ChangeCertificatePriorityOptions instance
     */
    public ChangeCertificatePriorityOptions build() {
      return new ChangeCertificatePriorityOptions(this);
    }

    /**
     * Adds an certificates to certificates.
     *
     * @param certificates the new certificates
     * @return the ChangeCertificatePriorityOptions builder
     */
    public Builder addCertificates(CertPriorityReqCertificatesItem certificates) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(certificates,
        "certificates cannot be null");
      if (this.certificates == null) {
        this.certificates = new ArrayList<CertPriorityReqCertificatesItem>();
      }
      this.certificates.add(certificates);
      return this;
    }

    /**
     * Set the certificates.
     * Existing certificates will be replaced.
     *
     * @param certificates the certificates
     * @return the ChangeCertificatePriorityOptions builder
     */
    public Builder certificates(List<CertPriorityReqCertificatesItem> certificates) {
      this.certificates = certificates;
      return this;
    }
  }

  protected ChangeCertificatePriorityOptions(Builder builder) {
    certificates = builder.certificates;
  }

  /**
   * New builder.
   *
   * @return a ChangeCertificatePriorityOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the certificates.
   *
   * certificates array.
   *
   * @return the certificates
   */
  public List<CertPriorityReqCertificatesItem> certificates() {
    return certificates;
  }
}

