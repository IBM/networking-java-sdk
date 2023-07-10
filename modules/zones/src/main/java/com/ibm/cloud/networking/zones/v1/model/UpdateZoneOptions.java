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
package com.ibm.cloud.networking.zones.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateZone options.
 */
public class UpdateZoneOptions extends GenericModel {

  protected String zoneIdentifier;
  protected Boolean paused;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneIdentifier;
    private Boolean paused;

    /**
     * Instantiates a new Builder from an existing UpdateZoneOptions instance.
     *
     * @param updateZoneOptions the instance to initialize the Builder with
     */
    private Builder(UpdateZoneOptions updateZoneOptions) {
      this.zoneIdentifier = updateZoneOptions.zoneIdentifier;
      this.paused = updateZoneOptions.paused;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zoneIdentifier the zoneIdentifier
     */
    public Builder(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
    }

    /**
     * Builds a UpdateZoneOptions.
     *
     * @return the new UpdateZoneOptions instance
     */
    public UpdateZoneOptions build() {
      return new UpdateZoneOptions(this);
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the UpdateZoneOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the UpdateZoneOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }
  }

  protected UpdateZoneOptions() { }

  protected UpdateZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    zoneIdentifier = builder.zoneIdentifier;
    paused = builder.paused;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Zone identifier.
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the paused.
   *
   * paused.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }
}

