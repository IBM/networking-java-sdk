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
 * The createZone options.
 */
public class CreateZoneOptions extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    private Builder(CreateZoneOptions createZoneOptions) {
      this.name = createZoneOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateZoneOptions.
     *
     * @return the new CreateZoneOptions instance
     */
    public CreateZoneOptions build() {
      return new CreateZoneOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateZoneOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateZoneOptions(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateZoneOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

