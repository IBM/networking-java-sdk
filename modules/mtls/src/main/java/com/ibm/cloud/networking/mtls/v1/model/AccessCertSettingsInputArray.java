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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AccessCertSettingsInputArray.
 */
public class AccessCertSettingsInputArray extends GenericModel {

  protected String hostname;
  @SerializedName("client_certificate_forwarding")
  protected Boolean clientCertificateForwarding;

  /**
   * Builder.
   */
  public static class Builder {
    private String hostname;
    private Boolean clientCertificateForwarding;

    /**
     * Instantiates a new Builder from an existing AccessCertSettingsInputArray instance.
     *
     * @param accessCertSettingsInputArray the instance to initialize the Builder with
     */
    private Builder(AccessCertSettingsInputArray accessCertSettingsInputArray) {
      this.hostname = accessCertSettingsInputArray.hostname;
      this.clientCertificateForwarding = accessCertSettingsInputArray.clientCertificateForwarding;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hostname the hostname
     * @param clientCertificateForwarding the clientCertificateForwarding
     */
    public Builder(String hostname, Boolean clientCertificateForwarding) {
      this.hostname = hostname;
      this.clientCertificateForwarding = clientCertificateForwarding;
    }

    /**
     * Builds a AccessCertSettingsInputArray.
     *
     * @return the new AccessCertSettingsInputArray instance
     */
    public AccessCertSettingsInputArray build() {
      return new AccessCertSettingsInputArray(this);
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the AccessCertSettingsInputArray builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the clientCertificateForwarding.
     *
     * @param clientCertificateForwarding the clientCertificateForwarding
     * @return the AccessCertSettingsInputArray builder
     */
    public Builder clientCertificateForwarding(Boolean clientCertificateForwarding) {
      this.clientCertificateForwarding = clientCertificateForwarding;
      return this;
    }
  }

  protected AccessCertSettingsInputArray() { }

  protected AccessCertSettingsInputArray(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hostname,
      "hostname cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientCertificateForwarding,
      "clientCertificateForwarding cannot be null");
    hostname = builder.hostname;
    clientCertificateForwarding = builder.clientCertificateForwarding;
  }

  /**
   * New builder.
   *
   * @return a AccessCertSettingsInputArray builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hostname.
   *
   * @return the hostname
   */
  public String hostname() {
    return hostname;
  }

  /**
   * Gets the clientCertificateForwarding.
   *
   * Whether to forward the client certificate.
   *
   * @return the clientCertificateForwarding
   */
  public Boolean clientCertificateForwarding() {
    return clientCertificateForwarding;
  }
}

