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
 * The deleteAccessPolicy options.
 */
public class DeleteAccessPolicyOptions extends GenericModel {

  protected String zoneId;
  protected String appId;
  protected String policyId;

  /**
   * Builder.
   */
  public static class Builder {
    private String zoneId;
    private String appId;
    private String policyId;

    /**
     * Instantiates a new Builder from an existing DeleteAccessPolicyOptions instance.
     *
     * @param deleteAccessPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeleteAccessPolicyOptions deleteAccessPolicyOptions) {
      this.zoneId = deleteAccessPolicyOptions.zoneId;
      this.appId = deleteAccessPolicyOptions.appId;
      this.policyId = deleteAccessPolicyOptions.policyId;
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
     * @param policyId the policyId
     */
    public Builder(String zoneId, String appId, String policyId) {
      this.zoneId = zoneId;
      this.appId = appId;
      this.policyId = policyId;
    }

    /**
     * Builds a DeleteAccessPolicyOptions.
     *
     * @return the new DeleteAccessPolicyOptions instance
     */
    public DeleteAccessPolicyOptions build() {
      return new DeleteAccessPolicyOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the DeleteAccessPolicyOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the appId.
     *
     * @param appId the appId
     * @return the DeleteAccessPolicyOptions builder
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the DeleteAccessPolicyOptions builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  protected DeleteAccessPolicyOptions() { }

  protected DeleteAccessPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneId,
      "zoneId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appId,
      "appId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyId,
      "policyId cannot be empty");
    zoneId = builder.zoneId;
    appId = builder.appId;
    policyId = builder.policyId;
  }

  /**
   * New builder.
   *
   * @return a DeleteAccessPolicyOptions builder
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

  /**
   * Gets the policyId.
   *
   * Access policy ID.
   *
   * @return the policyId
   */
  public String policyId() {
    return policyId;
  }
}

