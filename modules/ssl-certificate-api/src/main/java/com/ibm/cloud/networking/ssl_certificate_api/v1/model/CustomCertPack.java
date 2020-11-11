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
 * custom certificate pack.
 */
public class CustomCertPack extends GenericModel {

  protected String id;
  protected List<String> hosts;
  protected String issuer;
  protected String signature;
  protected String status;
  @SerializedName("bundle_method")
  protected String bundleMethod;
  @SerializedName("zone_id")
  protected String zoneId;
  @SerializedName("uploaded_on")
  protected String uploadedOn;
  @SerializedName("modified_on")
  protected String modifiedOn;
  @SerializedName("expires_on")
  protected String expiresOn;
  protected Double priority;

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
   * Gets the issuer.
   *
   * issuer.
   *
   * @return the issuer
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Gets the signature.
   *
   * signature.
   *
   * @return the signature
   */
  public String getSignature() {
    return signature;
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

  /**
   * Gets the bundleMethod.
   *
   * bundle method.
   *
   * @return the bundleMethod
   */
  public String getBundleMethod() {
    return bundleMethod;
  }

  /**
   * Gets the zoneId.
   *
   * zone identifier.
   *
   * @return the zoneId
   */
  public String getZoneId() {
    return zoneId;
  }

  /**
   * Gets the uploadedOn.
   *
   * uploaded date.
   *
   * @return the uploadedOn
   */
  public String getUploadedOn() {
    return uploadedOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * modified date.
   *
   * @return the modifiedOn
   */
  public String getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the expiresOn.
   *
   * expire date.
   *
   * @return the expiresOn
   */
  public String getExpiresOn() {
    return expiresOn;
  }

  /**
   * Gets the priority.
   *
   * priority.
   *
   * @return the priority
   */
  public Double getPriority() {
    return priority;
  }
}

