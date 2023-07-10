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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateAccessCertSettings options.
 */
public class UpdateAccessCertSettingsOptions extends GenericModel {

  protected String zoneId;
  protected List<AccessCertSettingsInputArray> settings;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private List<AccessCertSettingsInputArray> settings;

    /**
     * Instantiates a new Builder from an existing UpdateAccessCertSettingsOptions instance.
     *
     * @param updateAccessCertSettingsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateAccessCertSettingsOptions updateAccessCertSettingsOptions) {
      this.zoneId = updateAccessCertSettingsOptions.zoneId;
      this.settings = updateAccessCertSettingsOptions.settings;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zoneId the zoneId
     */
    public Builder(String zoneId) {
      this.zoneId = zoneId;
    }

    /**
     * Builds a UpdateAccessCertSettingsOptions.
     *
     * @return the new UpdateAccessCertSettingsOptions instance
     */
    public UpdateAccessCertSettingsOptions build() {
      return new UpdateAccessCertSettingsOptions(this);
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the UpdateAccessCertSettingsOptions builder
     */
    public Builder addSettings(AccessCertSettingsInputArray settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<AccessCertSettingsInputArray>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the UpdateAccessCertSettingsOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the UpdateAccessCertSettingsOptions builder
     */
    public Builder settings(List<AccessCertSettingsInputArray> settings) {
      this.settings = settings;
      return this;
    }
  }

  protected UpdateAccessCertSettingsOptions() { }

  protected UpdateAccessCertSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    zoneId = builder.zoneId;
    settings = builder.settings;
  }

  /**
   * New builder.
   *
   * @return a UpdateAccessCertSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneId.
   *
   * Zone ID.
   *
   * @return the zoneId
   */
  public String zoneId() {
    return zoneId;
  }

  /**
   * Gets the settings.
   *
   * @return the settings
   */
  public List<AccessCertSettingsInputArray> settings() {
    return settings;
  }
}

