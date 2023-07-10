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
 * The listAccessPolicies options.
 */
public class ListAccessPoliciesOptions extends GenericModel {

  protected String zoneId;
  protected String appId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String appId;

    /**
     * Instantiates a new Builder from an existing ListAccessPoliciesOptions instance.
     *
     * @param listAccessPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(ListAccessPoliciesOptions listAccessPoliciesOptions) {
      this.zoneId = listAccessPoliciesOptions.zoneId;
      this.appId = listAccessPoliciesOptions.appId;
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
     * Builds a ListAccessPoliciesOptions.
     *
     * @return the new ListAccessPoliciesOptions instance
     */
    public ListAccessPoliciesOptions build() {
      return new ListAccessPoliciesOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the ListAccessPoliciesOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the appId.
     *
     * @param appId the appId
     * @return the ListAccessPoliciesOptions builder
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }
  }

  protected ListAccessPoliciesOptions() { }

  protected ListAccessPoliciesOptions(Builder builder) {
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
   * @return a ListAccessPoliciesOptions builder
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

