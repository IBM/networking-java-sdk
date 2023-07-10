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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createAccessCertificate options.
 */
public class CreateAccessCertificateOptions extends GenericModel {

  protected String zoneId;
  protected String name;
  protected String certificate;
  protected List<String> associatedHostnames;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String name;
    private String certificate;
    private List<String> associatedHostnames;

    /**
     * Instantiates a new Builder from an existing CreateAccessCertificateOptions instance.
     *
     * @param createAccessCertificateOptions the instance to initialize the Builder with
     */
    private Builder(CreateAccessCertificateOptions createAccessCertificateOptions) {
      this.zoneId = createAccessCertificateOptions.zoneId;
      this.name = createAccessCertificateOptions.name;
      this.certificate = createAccessCertificateOptions.certificate;
      this.associatedHostnames = createAccessCertificateOptions.associatedHostnames;
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
     */
    public Builder(String zoneId) {
      this.zoneId = zoneId;
    }

    /**
     * Builds a CreateAccessCertificateOptions.
     *
     * @return the new CreateAccessCertificateOptions instance
     */
    public CreateAccessCertificateOptions build() {
      return new CreateAccessCertificateOptions(this);
    }

    /**
     * Adds an associatedHostnames to associatedHostnames.
     *
     * @param associatedHostnames the new associatedHostnames
     * @return the CreateAccessCertificateOptions builder
     */
    public Builder addAssociatedHostnames(String associatedHostnames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(associatedHostnames,
        "associatedHostnames cannot be null");
      if (this.associatedHostnames == null) {
        this.associatedHostnames = new ArrayList<String>();
      }
      this.associatedHostnames.add(associatedHostnames);
      return this;
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the CreateAccessCertificateOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateAccessCertificateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateAccessCertificateOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the associatedHostnames.
     * Existing associatedHostnames will be replaced.
     *
     * @param associatedHostnames the associatedHostnames
     * @return the CreateAccessCertificateOptions builder
     */
    public Builder associatedHostnames(List<String> associatedHostnames) {
      this.associatedHostnames = associatedHostnames;
      return this;
    }
  }

  protected CreateAccessCertificateOptions() { }

  protected CreateAccessCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    zoneId = builder.zoneId;
    name = builder.name;
    certificate = builder.certificate;
    associatedHostnames = builder.associatedHostnames;
  }

  /**
   * New builder.
   *
   * @return a CreateAccessCertificateOptions builder
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
   * Gets the name.
   *
   * Access certificate name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the certificate.
   *
   * Access certificate.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the associatedHostnames.
   *
   * The hostnames that are prompted for this certificate.
   *
   * @return the associatedHostnames
   */
  public List<String> associatedHostnames() {
    return associatedHostnames;
  }
}

