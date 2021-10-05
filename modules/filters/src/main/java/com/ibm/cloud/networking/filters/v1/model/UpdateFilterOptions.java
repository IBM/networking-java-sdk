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
 * The updateFilter options.
 */
public class UpdateFilterOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected String filterIdentifier;
  protected String id;
  protected String expression;
  protected String description;
  protected Boolean paused;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private String filterIdentifier;
    private String id;
    private String expression;
    private String description;
    private Boolean paused;

    private Builder(UpdateFilterOptions updateFilterOptions) {
      this.xAuthUserToken = updateFilterOptions.xAuthUserToken;
      this.crn = updateFilterOptions.crn;
      this.zoneIdentifier = updateFilterOptions.zoneIdentifier;
      this.filterIdentifier = updateFilterOptions.filterIdentifier;
      this.id = updateFilterOptions.id;
      this.expression = updateFilterOptions.expression;
      this.description = updateFilterOptions.description;
      this.paused = updateFilterOptions.paused;
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
     * Builds a UpdateFilterOptions.
     *
     * @return the new UpdateFilterOptions instance
     */
    public UpdateFilterOptions build() {
      return new UpdateFilterOptions(this);
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the UpdateFilterOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the UpdateFilterOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the UpdateFilterOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the filterIdentifier.
     *
     * @param filterIdentifier the filterIdentifier
     * @return the UpdateFilterOptions builder
     */
    public Builder filterIdentifier(String filterIdentifier) {
      this.filterIdentifier = filterIdentifier;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFilterOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the expression.
     *
     * @param expression the expression
     * @return the UpdateFilterOptions builder
     */
    public Builder expression(String expression) {
      this.expression = expression;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateFilterOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the paused.
     *
     * @param paused the paused
     * @return the UpdateFilterOptions builder
     */
    public Builder paused(Boolean paused) {
      this.paused = paused;
      return this;
    }
  }

  protected UpdateFilterOptions(Builder builder) {
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
    id = builder.id;
    expression = builder.expression;
    description = builder.description;
    paused = builder.paused;
  }

  /**
   * New builder.
   *
   * @return a UpdateFilterOptions builder
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
   * Identifier of filter.
   *
   * @return the filterIdentifier
   */
  public String filterIdentifier() {
    return filterIdentifier;
  }

  /**
   * Gets the id.
   *
   * Identifier of the filter.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the expression.
   *
   * A filter expression.
   *
   * @return the expression
   */
  public String expression() {
    return expression;
  }

  /**
   * Gets the description.
   *
   * To briefly describe the filter.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the paused.
   *
   * Indicates if the filter is active.
   *
   * @return the paused
   */
  public Boolean paused() {
    return paused;
  }
}

