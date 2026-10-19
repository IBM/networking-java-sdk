/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.networking.ai_security_for_apps.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceZoneAiSecuritySettings options.
 */
public class ReplaceZoneAiSecuritySettingsOptions extends GenericModel {

  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;

    /**
     * Instantiates a new Builder from an existing ReplaceZoneAiSecuritySettingsOptions instance.
     *
     * @param replaceZoneAiSecuritySettingsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceZoneAiSecuritySettingsOptions replaceZoneAiSecuritySettingsOptions) {
      this.enabled = replaceZoneAiSecuritySettingsOptions.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceZoneAiSecuritySettingsOptions.
     *
     * @return the new ReplaceZoneAiSecuritySettingsOptions instance
     */
    public ReplaceZoneAiSecuritySettingsOptions build() {
      return new ReplaceZoneAiSecuritySettingsOptions(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the ReplaceZoneAiSecuritySettingsOptions builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected ReplaceZoneAiSecuritySettingsOptions() { }

  protected ReplaceZoneAiSecuritySettingsOptions(Builder builder) {
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a ReplaceZoneAiSecuritySettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Set to true to enable AI Security for Apps, false to disable.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

