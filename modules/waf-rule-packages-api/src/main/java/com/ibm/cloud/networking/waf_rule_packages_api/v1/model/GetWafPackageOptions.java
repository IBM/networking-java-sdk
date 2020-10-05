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
package com.ibm.cloud.networking.waf_rule_packages_api.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getWafPackage options.
 */
public class GetWafPackageOptions extends GenericModel {

  protected String packageId;

  /**
   * Builder.
   */
  public static class Builder {
    private String packageId;

    private Builder(GetWafPackageOptions getWafPackageOptions) {
      this.packageId = getWafPackageOptions.packageId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param packageId the packageId
     */
    public Builder(String packageId) {
      this.packageId = packageId;
    }

    /**
     * Builds a GetWafPackageOptions.
     *
     * @return the new GetWafPackageOptions instance
     */
    public GetWafPackageOptions build() {
      return new GetWafPackageOptions(this);
    }

    /**
     * Set the packageId.
     *
     * @param packageId the packageId
     * @return the GetWafPackageOptions builder
     */
    public Builder packageId(String packageId) {
      this.packageId = packageId;
      return this;
    }
  }

  protected GetWafPackageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.packageId,
      "packageId cannot be empty");
    packageId = builder.packageId;
  }

  /**
   * New builder.
   *
   * @return a GetWafPackageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the packageId.
   *
   * Package ID.
   *
   * @return the packageId
   */
  public String packageId() {
    return packageId;
  }
}

