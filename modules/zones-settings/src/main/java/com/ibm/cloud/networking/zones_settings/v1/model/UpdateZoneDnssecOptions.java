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
package com.ibm.cloud.networking.zones_settings.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateZoneDnssec options.
 */
public class UpdateZoneDnssecOptions extends GenericModel {

  /**
   * Status.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** disabled. */
    String DISABLED = "disabled";
  }

  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;

    private Builder(UpdateZoneDnssecOptions updateZoneDnssecOptions) {
      this.status = updateZoneDnssecOptions.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateZoneDnssecOptions.
     *
     * @return the new UpdateZoneDnssecOptions instance
     */
    public UpdateZoneDnssecOptions build() {
      return new UpdateZoneDnssecOptions(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the UpdateZoneDnssecOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected UpdateZoneDnssecOptions(Builder builder) {
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a UpdateZoneDnssecOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

