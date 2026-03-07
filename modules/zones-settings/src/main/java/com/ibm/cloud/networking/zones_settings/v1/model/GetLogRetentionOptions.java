/*
 * (C) Copyright IBM Corp. 2026.
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
 * The getLogRetention options.
 */
public class GetLogRetentionOptions extends GenericModel {

  protected String crn;
  protected String zoneIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String zoneIdentifier;

    /**
     * Instantiates a new Builder from an existing GetLogRetentionOptions instance.
     *
     * @param getLogRetentionOptions the instance to initialize the Builder with
     */
    private Builder(GetLogRetentionOptions getLogRetentionOptions) {
      this.crn = getLogRetentionOptions.crn;
      this.zoneIdentifier = getLogRetentionOptions.zoneIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param zoneIdentifier the zoneIdentifier
     */
    public Builder(String crn, String zoneIdentifier) {
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
    }

    /**
     * Builds a GetLogRetentionOptions.
     *
     * @return the new GetLogRetentionOptions instance
     */
    public GetLogRetentionOptions build() {
      return new GetLogRetentionOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetLogRetentionOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the GetLogRetentionOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }
  }

  protected GetLogRetentionOptions() { }

  protected GetLogRetentionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetLogRetentionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * Full url-encoded cloud resource name (CRN) of resource instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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
}

