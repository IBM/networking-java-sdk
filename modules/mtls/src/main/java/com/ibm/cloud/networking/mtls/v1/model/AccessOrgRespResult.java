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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AccessOrgRespResult.
 */
public class AccessOrgRespResult extends GenericModel {

  @SerializedName("auth_domain")
  protected String authDomain;
  protected String name;
  @SerializedName("login_design")
  protected Map<String, Object> loginDesign;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("updated_at")
  protected String updatedAt;

  protected AccessOrgRespResult() { }

  /**
   * Gets the authDomain.
   *
   * @return the authDomain
   */
  public String getAuthDomain() {
    return authDomain;
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
   * Gets the loginDesign.
   *
   * @return the loginDesign
   */
  public Map<String, Object> getLoginDesign() {
    return loginDesign;
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

