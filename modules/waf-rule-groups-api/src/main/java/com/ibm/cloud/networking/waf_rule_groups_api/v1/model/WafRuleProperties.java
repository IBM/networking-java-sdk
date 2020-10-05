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
package com.ibm.cloud.networking.waf_rule_groups_api.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * waf rule properties.
 */
public class WafRuleProperties extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("rules_count")
  protected Long rulesCount;
  @SerializedName("modified_rules_count")
  protected Long modifiedRulesCount;
  @SerializedName("package_id")
  protected String packageId;
  protected String mode;
  @SerializedName("allowed_modes")
  protected List<String> allowedModes;

  /**
   * Gets the id.
   *
   * ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the rulesCount.
   *
   * Number of rules.
   *
   * @return the rulesCount
   */
  public Long getRulesCount() {
    return rulesCount;
  }

  /**
   * Gets the modifiedRulesCount.
   *
   * Number of modified rules.
   *
   * @return the modifiedRulesCount
   */
  public Long getModifiedRulesCount() {
    return modifiedRulesCount;
  }

  /**
   * Gets the packageId.
   *
   * Package ID.
   *
   * @return the packageId
   */
  public String getPackageId() {
    return packageId;
  }

  /**
   * Gets the mode.
   *
   * Mode.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the allowedModes.
   *
   * Allowed Modes.
   *
   * @return the allowedModes
   */
  public List<String> getAllowedModes() {
    return allowedModes;
  }
}

