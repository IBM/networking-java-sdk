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
 * The getAccessApplication options.
 */
public class GetAccessApplicationOptions extends GenericModel {

  protected String zoneId;
  protected String appId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String appId;

    /**
     * Instantiates a new Builder from an existing GetAccessApplicationOptions instance.
     *
     * @param getAccessApplicationOptions the instance to initialize the Builder with
     */
    private Builder(GetAccessApplicationOptions getAccessApplicationOptions) {
      this.zoneId = getAccessApplicationOptions.zoneId;
      this.appId = getAccessApplicationOptions.appId;
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
     * @param appId the appId
     */
    public Builder(String zoneId, String appId) {
      this.zoneId = zoneId;
      this.appId = appId;
    }

    /**
     * Builds a GetAccessApplicationOptions.
     *
     * @return the new GetAccessApplicationOptions instance
     */
    public GetAccessApplicationOptions build() {
      return new GetAccessApplicationOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the GetAccessApplicationOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the appId.
     *
     * @param appId the appId
     * @return the GetAccessApplicationOptions builder
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }
  }

  protected GetAccessApplicationOptions() { }

  protected GetAccessApplicationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appId,
      "appId cannot be empty");
    zoneId = builder.zoneId;
    appId = builder.appId;
  }

  /**
   * New builder.
   *
   * @return a GetAccessApplicationOptions builder
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

  /**
   * Gets the appId.
   *
   * Access application ID.
   *
   * @return the appId
   */
  public String appId() {
    return appId;
  }
}

