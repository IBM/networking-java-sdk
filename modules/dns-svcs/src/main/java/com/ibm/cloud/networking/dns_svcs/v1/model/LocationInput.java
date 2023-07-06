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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Request to add custom resolver location.
 */
public class LocationInput extends GenericModel {

  @SerializedName("subnet_crn")
  protected String subnetCrn;
  protected Boolean enabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetCrn;
    private Boolean enabled;

    /**
     * Instantiates a new Builder from an existing LocationInput instance.
     *
     * @param locationInput the instance to initialize the Builder with
     */
    private Builder(LocationInput locationInput) {
      this.subnetCrn = locationInput.subnetCrn;
      this.enabled = locationInput.enabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetCrn the subnetCrn
     */
    public Builder(String subnetCrn) {
      this.subnetCrn = subnetCrn;
    }

    /**
     * Builds a LocationInput.
     *
     * @return the new LocationInput instance
     */
    public LocationInput build() {
      return new LocationInput(this);
    }

    /**
     * Set the subnetCrn.
     *
     * @param subnetCrn the subnetCrn
     * @return the LocationInput builder
     */
    public Builder subnetCrn(String subnetCrn) {
      this.subnetCrn = subnetCrn;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the LocationInput builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }

  protected LocationInput() { }

  protected LocationInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnetCrn,
      "subnetCrn cannot be null");
    subnetCrn = builder.subnetCrn;
    enabled = builder.enabled;
  }

  /**
   * New builder.
   *
   * @return a LocationInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetCrn.
   *
   * Custom resolver location, subnet CRN.
   *
   * @return the subnetCrn
   */
  public String subnetCrn() {
    return subnetCrn;
  }

  /**
   * Gets the enabled.
   *
   * Enable/Disable custom resolver location.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }
}

