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
package com.ibm.cloud.networking.zones.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteZone options.
 */
public class DeleteZoneOptions extends GenericModel {

  protected String zoneIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneIdentifier;

    private Builder(DeleteZoneOptions deleteZoneOptions) {
      this.zoneIdentifier = deleteZoneOptions.zoneIdentifier;
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
     * Builds a DeleteZoneOptions.
     *
     * @return the new DeleteZoneOptions instance
     */
    public DeleteZoneOptions build() {
      return new DeleteZoneOptions(this);
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the DeleteZoneOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }
  }

  protected DeleteZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    zoneIdentifier = builder.zoneIdentifier;
  }

  /**
   * New builder.
   *
   * @return a DeleteZoneOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Identifier of zone.
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }
}

