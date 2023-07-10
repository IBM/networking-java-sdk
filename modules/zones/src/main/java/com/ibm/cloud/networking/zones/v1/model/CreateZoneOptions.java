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
 * The createZone options.
 */
public class CreateZoneOptions extends GenericModel {

  /**
   * zone type.
   */
  public interface Type {
    /** full. */
    String FULL = "full";
    /** partial. */
    String PARTIAL = "partial";
  }

  protected String name;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;

    /**
     * Instantiates a new Builder from an existing CreateZoneOptions instance.
     *
     * @param createZoneOptions the instance to initialize the Builder with
     */
    private Builder(CreateZoneOptions createZoneOptions) {
      this.name = createZoneOptions.name;
      this.type = createZoneOptions.type;
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

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateZoneOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected CreateZoneOptions() { }

  protected CreateZoneOptions(Builder builder) {
    name = builder.name;
    type = builder.type;
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

  /**
   * Gets the type.
   *
   * zone type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

