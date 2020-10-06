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
package com.ibm.cloud.networking.waf_rule_packages_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateWafPackage options.
 */
public class UpdateWafPackageOptions extends GenericModel {

  /**
   * The sensitivity of the firewall package.
   */
  public interface Sensitivity {
    /** high. */
    String HIGH = "high";
    /** medium. */
    String MEDIUM = "medium";
    /** low. */
    String LOW = "low";
    /** off. */
    String OFF = "off";
  }

  /**
   * The default action that will be taken for rules under the firewall package.
   */
  public interface ActionMode {
    /** simulate. */
    String SIMULATE = "simulate";
    /** challenge. */
    String CHALLENGE = "challenge";
    /** block. */
    String BLOCK = "block";
  }

  protected String packageId;
  protected String sensitivity;
  protected String actionMode;

  /**
   * Builder.
   */
  public static class Builder {
    private String packageId;
    private String sensitivity;
    private String actionMode;

    private Builder(UpdateWafPackageOptions updateWafPackageOptions) {
      this.packageId = updateWafPackageOptions.packageId;
      this.sensitivity = updateWafPackageOptions.sensitivity;
      this.actionMode = updateWafPackageOptions.actionMode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param packageId the packageId
     */
    public Builder(String packageId) {
      this.packageId = packageId;
    }

    /**
     * Builds a UpdateWafPackageOptions.
     *
     * @return the new UpdateWafPackageOptions instance
     */
    public UpdateWafPackageOptions build() {
      return new UpdateWafPackageOptions(this);
    }

    /**
     * Set the packageId.
     *
     * @param packageId the packageId
     * @return the UpdateWafPackageOptions builder
     */
    public Builder packageId(String packageId) {
      this.packageId = packageId;
      return this;
    }

    /**
     * Set the sensitivity.
     *
     * @param sensitivity the sensitivity
     * @return the UpdateWafPackageOptions builder
     */
    public Builder sensitivity(String sensitivity) {
      this.sensitivity = sensitivity;
      return this;
    }

    /**
     * Set the actionMode.
     *
     * @param actionMode the actionMode
     * @return the UpdateWafPackageOptions builder
     */
    public Builder actionMode(String actionMode) {
      this.actionMode = actionMode;
      return this;
    }
  }

  protected UpdateWafPackageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.packageId,
      "packageId cannot be empty");
    packageId = builder.packageId;
    sensitivity = builder.sensitivity;
    actionMode = builder.actionMode;
  }

  /**
   * New builder.
   *
   * @return a UpdateWafPackageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the packageId.
   *
   * Package ID.
   *
   * @return the packageId
   */
  public String packageId() {
    return packageId;
  }

  /**
   * Gets the sensitivity.
   *
   * The sensitivity of the firewall package.
   *
   * @return the sensitivity
   */
  public String sensitivity() {
    return sensitivity;
  }

  /**
   * Gets the actionMode.
   *
   * The default action that will be taken for rules under the firewall package.
   *
   * @return the actionMode
   */
  public String actionMode() {
    return actionMode;
  }
}

