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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateFilters options.
 */
public class UpdateFiltersOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected List<FilterUpdateInput> filterUpdateInput;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private List<FilterUpdateInput> filterUpdateInput;

    private Builder(UpdateFiltersOptions updateFiltersOptions) {
      this.xAuthUserToken = updateFiltersOptions.xAuthUserToken;
      this.crn = updateFiltersOptions.crn;
      this.zoneIdentifier = updateFiltersOptions.zoneIdentifier;
      this.filterUpdateInput = updateFiltersOptions.filterUpdateInput;
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
     */
    public Builder(String xAuthUserToken, String crn, String zoneIdentifier) {
      this.xAuthUserToken = xAuthUserToken;
      this.crn = crn;
      this.zoneIdentifier = zoneIdentifier;
    }

    /**
     * Builds a UpdateFiltersOptions.
     *
     * @return the new UpdateFiltersOptions instance
     */
    public UpdateFiltersOptions build() {
      return new UpdateFiltersOptions(this);
    }

    /**
     * Adds an filterUpdateInput to filterUpdateInput.
     *
     * @param filterUpdateInput the new filterUpdateInput
     * @return the UpdateFiltersOptions builder
     */
    public Builder addFilterUpdateInput(FilterUpdateInput filterUpdateInput) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filterUpdateInput,
        "filterUpdateInput cannot be null");
      if (this.filterUpdateInput == null) {
        this.filterUpdateInput = new ArrayList<FilterUpdateInput>();
      }
      this.filterUpdateInput.add(filterUpdateInput);
      return this;
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the UpdateFiltersOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the UpdateFiltersOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the UpdateFiltersOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the filterUpdateInput.
     * Existing filterUpdateInput will be replaced.
     *
     * @param filterUpdateInput the filterUpdateInput
     * @return the UpdateFiltersOptions builder
     */
    public Builder filterUpdateInput(List<FilterUpdateInput> filterUpdateInput) {
      this.filterUpdateInput = filterUpdateInput;
      return this;
    }
  }

  protected UpdateFiltersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    filterUpdateInput = builder.filterUpdateInput;
  }

  /**
   * New builder.
   *
   * @return a UpdateFiltersOptions builder
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
   * Gets the filterUpdateInput.
   *
   * @return the filterUpdateInput
   */
  public List<FilterUpdateInput> filterUpdateInput() {
    return filterUpdateInput;
  }
}

