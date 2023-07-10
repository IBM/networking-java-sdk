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
 * The getAccessCertSettings options.
 */
public class GetAccessCertSettingsOptions extends GenericModel {

  protected String zoneId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;

    /**
     * Instantiates a new Builder from an existing GetAccessCertSettingsOptions instance.
     *
     * @param getAccessCertSettingsOptions the instance to initialize the Builder with
     */
    private Builder(GetAccessCertSettingsOptions getAccessCertSettingsOptions) {
      this.zoneId = getAccessCertSettingsOptions.zoneId;
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
     * Builds a GetAccessCertSettingsOptions.
     *
     * @return the new GetAccessCertSettingsOptions instance
     */
    public GetAccessCertSettingsOptions build() {
      return new GetAccessCertSettingsOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the GetAccessCertSettingsOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }
  }

  protected GetAccessCertSettingsOptions() { }

  protected GetAccessCertSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    zoneId = builder.zoneId;
  }

  /**
   * New builder.
   *
   * @return a GetAccessCertSettingsOptions builder
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

