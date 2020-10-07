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
 * The listCertificates options.
 */
public class ListCertificatesOptions extends GenericModel {

  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String xCorrelationId;

    private Builder(ListCertificatesOptions listCertificatesOptions) {
      this.xCorrelationId = listCertificatesOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListCertificatesOptions.
     *
     * @return the new ListCertificatesOptions instance
     */
    public ListCertificatesOptions build() {
      return new ListCertificatesOptions(this);
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the ListCertificatesOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected ListCertificatesOptions(Builder builder) {
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a ListCertificatesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

