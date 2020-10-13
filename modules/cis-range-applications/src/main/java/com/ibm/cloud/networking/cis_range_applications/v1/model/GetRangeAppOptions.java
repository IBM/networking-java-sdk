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
package com.ibm.cloud.networking.cis_range_applications.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getRangeApp options.
 */
public class GetRangeAppOptions extends GenericModel {

  protected String appIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String appIdentifier;

    private Builder(GetRangeAppOptions getRangeAppOptions) {
      this.appIdentifier = getRangeAppOptions.appIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param appIdentifier the appIdentifier
     */
    public Builder(String appIdentifier) {
      this.appIdentifier = appIdentifier;
    }

    /**
     * Builds a GetRangeAppOptions.
     *
     * @return the new GetRangeAppOptions instance
     */
    public GetRangeAppOptions build() {
      return new GetRangeAppOptions(this);
    }

    /**
     * Set the appIdentifier.
     *
     * @param appIdentifier the appIdentifier
     * @return the GetRangeAppOptions builder
     */
    public Builder appIdentifier(String appIdentifier) {
      this.appIdentifier = appIdentifier;
      return this;
    }
  }

  protected GetRangeAppOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.appIdentifier,
      "appIdentifier cannot be empty");
    appIdentifier = builder.appIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetRangeAppOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the appIdentifier.
   *
   * application identifier.
   *
   * @return the appIdentifier
   */
  public String appIdentifier() {
    return appIdentifier;
  }
}

