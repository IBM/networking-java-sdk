/*
 * (C) Copyright IBM Corp. 2022.
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
 * The updateCrLocationsOrder options.
 */
public class UpdateCrLocationsOrderOptions extends GenericModel {

  protected String instanceId;
  protected String resolverId;
  protected List<String> locations;
  protected String xCorrelationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String resolverId;
    private List<String> locations;
    private String xCorrelationId;

    private Builder(UpdateCrLocationsOrderOptions updateCrLocationsOrderOptions) {
      this.instanceId = updateCrLocationsOrderOptions.instanceId;
      this.resolverId = updateCrLocationsOrderOptions.resolverId;
      this.locations = updateCrLocationsOrderOptions.locations;
      this.xCorrelationId = updateCrLocationsOrderOptions.xCorrelationId;
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
     * @param resolverId the resolverId
     */
    public Builder(String instanceId, String resolverId) {
      this.instanceId = instanceId;
      this.resolverId = resolverId;
    }

    /**
     * Builds a UpdateCrLocationsOrderOptions.
     *
     * @return the new UpdateCrLocationsOrderOptions instance
     */
    public UpdateCrLocationsOrderOptions build() {
      return new UpdateCrLocationsOrderOptions(this);
    }

    /**
     * Adds an locations to locations.
     *
     * @param locations the new locations
     * @return the UpdateCrLocationsOrderOptions builder
     */
    public Builder addLocations(String locations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locations,
        "locations cannot be null");
      if (this.locations == null) {
        this.locations = new ArrayList<String>();
      }
      this.locations.add(locations);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateCrLocationsOrderOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the resolverId.
     *
     * @param resolverId the resolverId
     * @return the UpdateCrLocationsOrderOptions builder
     */
    public Builder resolverId(String resolverId) {
      this.resolverId = resolverId;
      return this;
    }

    /**
     * Set the locations.
     * Existing locations will be replaced.
     *
     * @param locations the locations
     * @return the UpdateCrLocationsOrderOptions builder
     */
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Set the xCorrelationId.
     *
     * @param xCorrelationId the xCorrelationId
     * @return the UpdateCrLocationsOrderOptions builder
     */
    public Builder xCorrelationId(String xCorrelationId) {
      this.xCorrelationId = xCorrelationId;
      return this;
    }
  }

  protected UpdateCrLocationsOrderOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resolverId,
      "resolverId cannot be empty");
    instanceId = builder.instanceId;
    resolverId = builder.resolverId;
    locations = builder.locations;
    xCorrelationId = builder.xCorrelationId;
  }

  /**
   * New builder.
   *
   * @return a UpdateCrLocationsOrderOptions builder
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
   * Gets the resolverId.
   *
   * The unique identifier of a custom resolver.
   *
   * @return the resolverId
   */
  public String resolverId() {
    return resolverId;
  }

  /**
   * Gets the locations.
   *
   * Array of custom resolver location ID.
   *
   * @return the locations
   */
  public List<String> locations() {
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

