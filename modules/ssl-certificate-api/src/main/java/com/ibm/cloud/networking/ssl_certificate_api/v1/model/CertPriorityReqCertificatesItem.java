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
 * certificate items.
 */
public class CertPriorityReqCertificatesItem extends GenericModel {

  protected String id;
  protected Long priority;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Long priority;

    private Builder(CertPriorityReqCertificatesItem certPriorityReqCertificatesItem) {
      this.id = certPriorityReqCertificatesItem.id;
      this.priority = certPriorityReqCertificatesItem.priority;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param priority the priority
     */
    public Builder(String id, Long priority) {
      this.id = id;
      this.priority = priority;
    }

    /**
     * Builds a CertPriorityReqCertificatesItem.
     *
     * @return the new CertPriorityReqCertificatesItem instance
     */
    public CertPriorityReqCertificatesItem build() {
      return new CertPriorityReqCertificatesItem(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CertPriorityReqCertificatesItem builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the CertPriorityReqCertificatesItem builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }
  }

  protected CertPriorityReqCertificatesItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.priority,
      "priority cannot be null");
    id = builder.id;
    priority = builder.priority;
  }

  /**
   * New builder.
   *
   * @return a CertPriorityReqCertificatesItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the priority.
   *
   * certificate priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }
}

