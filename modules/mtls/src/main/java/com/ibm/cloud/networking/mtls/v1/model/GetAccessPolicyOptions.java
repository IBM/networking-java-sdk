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
 * The getAccessPolicy options.
 */
public class GetAccessPolicyOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing GetAccessPolicyOptions instance.
     *
     * @param getAccessPolicyOptions the instance to initialize the Builder with
     */
    private Builder(GetAccessPolicyOptions getAccessPolicyOptions) {
      this.zoneId = getAccessPolicyOptions.zoneId;
      this.appId = getAccessPolicyOptions.appId;
      this.policyId = getAccessPolicyOptions.policyId;
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
     * Builds a GetAccessPolicyOptions.
     *
     * @return the new GetAccessPolicyOptions instance
     */
    public GetAccessPolicyOptions build() {
      return new GetAccessPolicyOptions(this);
    }

    /**
     * Set the zoneId.
     *
     * @param zoneId the zoneId
     * @return the GetAccessPolicyOptions builder
     */
    public Builder zoneId(String zoneId) {
      this.zoneId = zoneId;
      return this;
    }

    /**
     * Set the appId.
     *
     * @param appId the appId
     * @return the GetAccessPolicyOptions builder
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the GetAccessPolicyOptions builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }
  }

  protected GetAccessPolicyOptions() { }

  protected GetAccessPolicyOptions(Builder builder) {
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
   * @return a GetAccessPolicyOptions builder
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

