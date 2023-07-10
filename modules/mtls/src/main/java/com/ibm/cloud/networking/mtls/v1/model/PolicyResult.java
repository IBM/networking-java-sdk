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
 * Access policies information.
 */
public class PolicyResult extends GenericModel {

  protected String id;
  protected String name;
  protected String decision;
  protected List<PolicyRule> include;
  protected List<PolicyRule> exclude;
  protected Long precedence;
  protected List<PolicyRule> require;
  protected String uid;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("updated_at")
  protected String updatedAt;

  protected PolicyResult() { }

  /**
   * Gets the id.
   *
   * Policy ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Policy name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the decision.
   *
   * The action Access takes if the policy matches the user.
   *
   * @return the decision
   */
  public String getDecision() {
    return decision;
  }

  /**
   * Gets the include.
   *
   * The include policy works like an OR logical operator.
   *
   * @return the include
   */
  public List<PolicyRule> getInclude() {
    return include;
  }

  /**
   * Gets the exclude.
   *
   * The exclude policy works like a NOT logical operator.
   *
   * @return the exclude
   */
  public List<PolicyRule> getExclude() {
    return exclude;
  }

  /**
   * Gets the precedence.
   *
   * The unique precedence for policies on a single application.
   *
   * @return the precedence
   */
  public Long getPrecedence() {
    return precedence;
  }

  /**
   * Gets the require.
   *
   * The require policy works like a AND logical operator.
   *
   * @return the require
   */
  public List<PolicyRule> getRequire() {
    return require;
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
   * Created time of the policy.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Updated time of the policy.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }
}

