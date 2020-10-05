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
package com.ibm.cloud.networking.firewall_access_rules.v1.model;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * access rule objects.
 */
public class AccountAccessRuleObject extends GenericModel {

  public interface AllowedModes {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** whitelist. */
    String WHITELIST = "whitelist";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  /**
   * The action to be applied to a request matching the instance level access rule.
   */
  public interface Mode {
    /** block. */
    String BLOCK = "block";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** whitelist. */
    String WHITELIST = "whitelist";
    /** js_challenge. */
    String JS_CHALLENGE = "js_challenge";
  }

  protected String id;
  protected String notes;
  @SerializedName("allowed_modes")
  protected List<String> allowedModes;
  protected String mode;
  protected AccountAccessRuleObjectScope scope;
  @SerializedName("created_on")
  protected Date createdOn;
  @SerializedName("modified_on")
  protected Date modifiedOn;
  protected AccountAccessRuleObjectConfiguration configuration;

  /**
   * Gets the id.
   *
   * Identifier of the instance level firewall access rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the notes.
   *
   * A personal note about the rule. Typically used as a reminder or explanation for the rule.
   *
   * @return the notes
   */
  public String getNotes() {
    return notes;
  }

  /**
   * Gets the allowedModes.
   *
   * List of modes that are allowed.
   *
   * @return the allowedModes
   */
  public List<String> getAllowedModes() {
    return allowedModes;
  }

  /**
   * Gets the mode.
   *
   * The action to be applied to a request matching the instance level access rule.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the scope.
   *
   * The scope definition of the access rule.
   *
   * @return the scope
   */
  public AccountAccessRuleObjectScope getScope() {
    return scope;
  }

  /**
   * Gets the createdOn.
   *
   * The creation date-time of the instance level firewall access rule.
   *
   * @return the createdOn
   */
  public Date getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the modifiedOn.
   *
   * The modification date-time of the instance level firewall access rule.
   *
   * @return the modifiedOn
   */
  public Date getModifiedOn() {
    return modifiedOn;
  }

  /**
   * Gets the configuration.
   *
   * configuration.
   *
   * @return the configuration
   */
  public AccountAccessRuleObjectConfiguration getConfiguration() {
    return configuration;
  }
}

