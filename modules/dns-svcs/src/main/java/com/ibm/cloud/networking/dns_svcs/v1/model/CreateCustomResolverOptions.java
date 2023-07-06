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
package com.ibm.cloud.networking.dns_svcs.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createCustomResolver options.
 */
public class CreateCustomResolverOptions extends GenericModel {

  protected String instanceId;
  protected String name;
  protected String description;
  protected List<LocationInput> locations;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String description;
    private List<LocationInput> locations;
    private String xCorrelationId;

    /**
     * Instantiates a new Builder from an existing CreateCustomResolverOptions instance.
     *
     * @param createCustomResolverOptions the instance to initialize the Builder with
     */
    private Builder(CreateCustomResolverOptions createCustomResolverOptions) {
      this.instanceId = createCustomResolverOptions.instanceId;
      this.name = createCustomResolverOptions.name;
      this.description = createCustomResolverOptions.description;
      this.locations = createCustomResolverOptions.locations;
      this.xCorrelationId = createCustomResolverOptions.xCorrelationId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a CreateCustomResolverOptions.
     *
     * @return the new CreateCustomResolverOptions instance
     */
    public CreateCustomResolverOptions build() {
      return new CreateCustomResolverOptions(this);
    }

    /**
     * Adds an locations to locations.
     *
     * @param locations the new locations
     * @return the CreateCustomResolverOptions builder
     */
    public Builder addLocations(LocationInput locations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locations,
        "locations cannot be null");
      if (this.locations == null) {
        this.locations = new ArrayList<LocationInput>();
      }
      this.locations.add(locations);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateCustomResolverOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateCustomResolverOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateCustomResolverOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the locations.
     * Existing locations will be replaced.
     *
     * @param locations the locations
     * @return the CreateCustomResolverOptions builder
     */
    public Builder locations(List<LocationInput> locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the CreateCustomResolverOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected CreateCustomResolverOptions() { }

  protected CreateCustomResolverOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    name = builder.name;
    description = builder.description;
    locations = builder.locations;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a CreateCustomResolverOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The unique identifier of a service instance.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the name.
   *
   * Name of the custom resolver.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Descriptive text of the custom resolver.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the locations.
   *
   * Locations on which the custom resolver will be running.
   *
   * @return the locations
   */
  public List<LocationInput> locations() {
    return locations;
  }

  /**
   * Gets the xCorrelationId.
   *
   * Uniquely identifying a request.
   *
   * @return the xCorrelationId
   */
  public String xCorrelationId() {
    return xCorrelationId;
  }
}

