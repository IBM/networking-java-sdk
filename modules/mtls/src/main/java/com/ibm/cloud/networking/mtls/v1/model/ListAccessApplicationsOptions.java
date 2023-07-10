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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAccessApplications options.
 */
public class ListAccessApplicationsOptions extends GenericModel {

  protected String zoneId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;

    /**
     * Instantiates a new Builder from an existing ListAccessApplicationsOptions instance.
     *
     * @param listAccessApplicationsOptions the instance to initialize the Builder with
     */
    private Builder(ListAccessApplicationsOptions listAccessApplicationsOptions) {
      this.zoneId = listAccessApplicationsOptions.zoneId;
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
     * Builds a ListAccessApplicationsOptions.
     *
     * @return the new ListAccessApplicationsOptions instance
     */
    public ListAccessApplicationsOptions build() {
      return new ListAccessApplicationsOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the ListAccessApplicationsOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }
  }

  protected ListAccessApplicationsOptions() { }

  protected ListAccessApplicationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    zoneId = builder.zoneId;
  }

  /**
   * New builder.
   *
   * @return a ListAccessApplicationsOptions builder
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
}

