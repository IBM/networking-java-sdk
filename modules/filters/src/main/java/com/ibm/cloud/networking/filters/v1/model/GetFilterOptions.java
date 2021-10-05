/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.networking.filters.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getFilter options.
 */
public class GetFilterOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected String filterIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private String filterIdentifier;

    private Builder(GetFilterOptions getFilterOptions) {
      this.xAuthUserToken = getFilterOptions.xAuthUserToken;
      this.crn = getFilterOptions.crn;
      this.zoneIdentifier = getFilterOptions.zoneIdentifier;
      this.filterIdentifier = getFilterOptions.filterIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @param crn the crn
     * @param zoneIdentifier the zoneIdentifier
     * @param filterIdentifier the filterIdentifier
     */
    public Builder(String xAuthUserToken, String crn, String zoneIdentifier, String filterIdentifier) {
      this.xAuthUserToken = xAuthUserToken;
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
      this.filterIdentifier = filterIdentifier;
    }

    /**
     * Builds a GetFilterOptions.
     *
     * @return the new GetFilterOptions instance
     */
    public GetFilterOptions build() {
      return new GetFilterOptions(this);
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the GetFilterOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetFilterOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the GetFilterOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the filterIdentifier.
     *
     * @param filterIdentifier the filterIdentifier
     * @return the GetFilterOptions builder
     */
    public Builder filterIdentifier(String filterIdentifier) {
      this.filterIdentifier = filterIdentifier;
      return this;
    }
  }

  protected GetFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.filterIdentifier,
      "filterIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    filterIdentifier = builder.filterIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetFilterOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xAuthUserToken.
   *
   * IBM Cloud user IAM token.
   *
   * @return the xAuthUserToken
   */
  public String xAuthUserToken() {
    return xAuthUserToken;
  }

  /**
   * Gets the crn.
   *
   * Full crn of the service instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the zoneIdentifier.
   *
   * Zone identifier (zone id).
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the filterIdentifier.
   *
   * Identifier of filter for the given zone.
   *
   * @return the filterIdentifier
   */
  public String filterIdentifier() {
    return filterIdentifier;
  }
}

