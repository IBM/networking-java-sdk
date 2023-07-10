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
 * Access application details.
 */
public class AppResult extends GenericModel {

  protected String id;
  protected String name;
  protected String domain;
  protected String aud;
  protected List<PolicyResult> policies;
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

  protected AppResult() { }

  /**
   * Gets the id.
   *
   * Application ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Application name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the domain.
   *
   * The domain and path that Access blocks.
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
   * Policies of the application.
   *
   * @return the policies
   */
  public List<PolicyResult> getPolicies() {
    return policies;
  }

  /**
   * Gets the allowedIdps.
   *
   * The identity providers selected for application.
   *
   * @return the allowedIdps
   */
  public List<String> getAllowedIdps() {
    return allowedIdps;
  }

  /**
   * Gets the autoRedirectToIdentity.
   *
   * Option to skip identity provider selection if only one is configured in allowed_idps.
   *
   * @return the autoRedirectToIdentity
   */
  public Boolean isAutoRedirectToIdentity() {
    return autoRedirectToIdentity;
  }

  /**
   * Gets the sessionDuration.
   *
   * The amount of time that the tokens issued for this application are valid.
   *
   * @return the sessionDuration
   */
  public String getSessionDuration() {
    return sessionDuration;
  }

  /**
   * Gets the type.
   *
   * Application type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the uid.
   *
   * UUID, same as ID.
   *
   * @return the uid
   */
  public String getUid() {
    return uid;
  }

  /**
   * Gets the createdAt.
   *
   * Created time of the application.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated time of the application.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }
}

