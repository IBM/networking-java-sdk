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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Access certificate details.
 */
public class CertResult extends GenericModel {

  protected String id;
  protected String name;
  protected String fingerprint;
  @SerializedName("associated_hostnames")
  protected List<String> associatedHostnames;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("updated_at")
  protected String updatedAt;
  @SerializedName("expires_on")
  protected String expiresOn;

  protected CertResult() { }

  /**
   * Gets the id.
   *
   * Access certificate ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * access certificate name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the fingerprint.
   *
   * Fingerprint of the certificate.
   *
   * @return the fingerprint
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * Gets the associatedHostnames.
   *
   * The hostnames that are prompted for this certificate.
   *
   * @return the associatedHostnames
   */
  public List<String> getAssociatedHostnames() {
    return associatedHostnames;
  }

  /**
   * Gets the createdAt.
   *
   * Created time of the access certificate.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated time of the access certificate.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the expiresOn.
   *
   * Expire time of the access certificate.
   *
   * @return the expiresOn
   */
  public String getExpiresOn() {
    return expiresOn;
  }
}

