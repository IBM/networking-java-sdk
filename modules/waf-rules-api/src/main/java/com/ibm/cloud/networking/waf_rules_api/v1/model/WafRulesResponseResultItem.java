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
package com.ibm.cloud.networking.waf_rules_api.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WafRulesResponseResultItem.
 */
public class WafRulesResponseResultItem extends GenericModel {

  /**
   * mode.
   */
  public interface Mode {
    /** on. */
    String ON = "on";
    /** off. */
    String OFF = "off";
  }

  protected String id;
  protected String description;
  protected String priority;
  protected WafRulesResponseResultItemGroup group;
  @SerializedName("package_id")
  protected String packageId;
  @SerializedName("allowed_modes")
  protected List<String> allowedModes;
  protected String mode;

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
   * Gets the description.
   *
   * description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the priority.
   *
   * priority.
   *
   * @return the priority
   */
  public String getPriority() {
    return priority;
  }

  /**
   * Gets the group.
   *
   * group definition.
   *
   * @return the group
   */
  public WafRulesResponseResultItemGroup getGroup() {
    return group;
  }

  /**
   * Gets the packageId.
   *
   * package id.
   *
   * @return the packageId
   */
  public String getPackageId() {
    return packageId;
  }

  /**
   * Gets the allowedModes.
   *
   * allowed modes.
   *
   * @return the allowedModes
   */
  public List<String> getAllowedModes() {
    return allowedModes;
  }

  /**
   * Gets the mode.
   *
   * mode.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }
}

