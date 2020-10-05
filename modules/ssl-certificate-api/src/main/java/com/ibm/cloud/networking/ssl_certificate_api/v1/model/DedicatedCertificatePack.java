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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * dedicated certificate packs.
 */
public class DedicatedCertificatePack extends GenericModel {

  protected String id;
  protected String type;
  protected List<String> hosts;
  protected List<Certificate> certificates;
  @SerializedName("primary_certificate")
  protected Long primaryCertificate;
  protected String status;

  /**
   * Gets the id.
   *
   * identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * certificate type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the hosts.
   *
   * host name.
   *
   * @return the hosts
   */
  public List<String> getHosts() {
    return hosts;
  }

  /**
   * Gets the certificates.
   *
   * certificates.
   *
   * @return the certificates
   */
  public List<Certificate> getCertificates() {
    return certificates;
  }

  /**
   * Gets the primaryCertificate.
   *
   * primary certificate.
   *
   * @return the primaryCertificate
   */
  public Long getPrimaryCertificate() {
    return primaryCertificate;
  }

  /**
   * Gets the status.
   *
   * status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

