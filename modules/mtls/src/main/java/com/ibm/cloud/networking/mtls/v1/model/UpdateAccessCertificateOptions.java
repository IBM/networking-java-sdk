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
 * The updateAccessCertificate options.
 */
public class UpdateAccessCertificateOptions extends GenericModel {

  protected String zoneId;
  protected String certId;
  protected String name;
  protected List<String> associatedHostnames;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String certId;
    private String name;
    private List<String> associatedHostnames;

    /**
     * Instantiates a new Builder from an existing UpdateAccessCertificateOptions instance.
     *
     * @param updateAccessCertificateOptions the instance to initialize the Builder with
     */
    private Builder(UpdateAccessCertificateOptions updateAccessCertificateOptions) {
      this.zoneId = updateAccessCertificateOptions.zoneId;
      this.certId = updateAccessCertificateOptions.certId;
      this.name = updateAccessCertificateOptions.name;
      this.associatedHostnames = updateAccessCertificateOptions.associatedHostnames;
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
     * Builds a UpdateAccessCertificateOptions.
     *
     * @return the new UpdateAccessCertificateOptions instance
     */
    public UpdateAccessCertificateOptions build() {
      return new UpdateAccessCertificateOptions(this);
    }

    /**
     * Adds an associatedHostnames to associatedHostnames.
     *
     * @param associatedHostnames the new associatedHostnames
     * @return the UpdateAccessCertificateOptions builder
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
     * @return the UpdateAccessCertificateOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the certId.
     *
     * @param certId the certId
     * @return the UpdateAccessCertificateOptions builder
     */
    public Builder certId(String certId) {
      this.certId = certId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateAccessCertificateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the associatedHostnames.
     * Existing associatedHostnames will be replaced.
     *
     * @param associatedHostnames the associatedHostnames
     * @return the UpdateAccessCertificateOptions builder
     */
    public Builder associatedHostnames(List<String> associatedHostnames) {
      this.associatedHostnames = associatedHostnames;
      return this;
    }
  }

  protected UpdateAccessCertificateOptions() { }

  protected UpdateAccessCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.certId,
      "certId cannot be empty");
    zoneId = builder.zoneId;
    certId = builder.certId;
    name = builder.name;
    associatedHostnames = builder.associatedHostnames;
  }

  /**
   * New builder.
   *
   * @return a UpdateAccessCertificateOptions builder
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

