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
 * The getCustomCertificate options.
 */
public class GetCustomCertificateOptions extends GenericModel {

  protected String customCertId;

  /**
   * Builder.
   */
  public static class Builder {
    private String customCertId;

    private Builder(GetCustomCertificateOptions getCustomCertificateOptions) {
      this.customCertId = getCustomCertificateOptions.customCertId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param customCertId the customCertId
     */
    public Builder(String customCertId) {
      this.customCertId = customCertId;
    }

    /**
     * Builds a GetCustomCertificateOptions.
     *
     * @return the new GetCustomCertificateOptions instance
     */
    public GetCustomCertificateOptions build() {
      return new GetCustomCertificateOptions(this);
    }

    /**
     * Set the customCertId.
     *
     * @param customCertId the customCertId
     * @return the GetCustomCertificateOptions builder
     */
    public Builder customCertId(String customCertId) {
      this.customCertId = customCertId;
      return this;
    }
  }

  protected GetCustomCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.customCertId,
      "customCertId cannot be empty");
    customCertId = builder.customCertId;
  }

  /**
   * New builder.
   *
   * @return a GetCustomCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the customCertId.
   *
   * custom certificate id.
   *
   * @return the customCertId
   */
  public String customCertId() {
    return customCertId;
  }
}

