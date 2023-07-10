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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Access application details.
 */
public class CreateAccessAppRespResult extends GenericModel {

  protected String id;
  protected String name;
  protected String domain;
  protected String aud;
  protected List<Map<String, Object>> policies;
  @SerializedName("allowed_idps")
  protected List<String> allowedIdps;
  @SerializedName("auto_redirect_to_identity")
  protected Boolean autoRedirectToIdentity;
  @SerializedName("session_duration")
  protected String sessionDuration;
  protected String type;
  protected String uid;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("updated_at")
  protected String updatedAt;

  protected CreateAccessAppRespResult() { }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the domain.
   *
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Gets the aud.
   *
   * @return the aud
   */
  public String getAud() {
    return aud;
  }

  /**
   * Gets the policies.
   *
   * @return the policies
   */
  public List<Map<String, Object>> getPolicies() {
    return policies;
  }

  /**
   * Gets the allowedIdps.
   *
   * @return the allowedIdps
   */
  public List<String> getAllowedIdps() {
    return allowedIdps;
  }

  /**
   * Gets the autoRedirectToIdentity.
   *
   * @return the autoRedirectToIdentity
   */
  public Boolean isAutoRedirectToIdentity() {
    return autoRedirectToIdentity;
  }

  /**
   * Gets the sessionDuration.
   *
   * @return the sessionDuration
   */
  public String getSessionDuration() {
    return sessionDuration;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the uid.
   *
   * @return the uid
   */
  public String getUid() {
    return uid;
  }

  /**
   * Gets the createdAt.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }
}

