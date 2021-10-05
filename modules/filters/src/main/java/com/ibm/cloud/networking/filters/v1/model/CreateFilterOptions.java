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
 * The createFilter options.
 */
public class CreateFilterOptions extends GenericModel {

  protected String xAuthUserToken;
  protected String crn;
  protected String zoneIdentifier;
  protected List<FilterInput> filterInput;

  /**
   * Builder.
   */
  public static class Builder {
    private String xAuthUserToken;
    private String crn;
    private String zoneIdentifier;
    private List<FilterInput> filterInput;

    private Builder(CreateFilterOptions createFilterOptions) {
      this.xAuthUserToken = createFilterOptions.xAuthUserToken;
      this.crn = createFilterOptions.crn;
      this.zoneIdentifier = createFilterOptions.zoneIdentifier;
      this.filterInput = createFilterOptions.filterInput;
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
     * Builds a CreateFilterOptions.
     *
     * @return the new CreateFilterOptions instance
     */
    public CreateFilterOptions build() {
      return new CreateFilterOptions(this);
    }

    /**
     * Adds an filterInput to filterInput.
     *
     * @param filterInput the new filterInput
     * @return the CreateFilterOptions builder
     */
    public Builder addFilterInput(FilterInput filterInput) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filterInput,
        "filterInput cannot be null");
      if (this.filterInput == null) {
        this.filterInput = new ArrayList<FilterInput>();
      }
      this.filterInput.add(filterInput);
      return this;
    }

    /**
     * Set the xAuthUserToken.
     *
     * @param xAuthUserToken the xAuthUserToken
     * @return the CreateFilterOptions builder
     */
    public Builder xAuthUserToken(String xAuthUserToken) {
      this.xAuthUserToken = xAuthUserToken;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateFilterOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the zoneIdentifier.
     *
     * @param zoneIdentifier the zoneIdentifier
     * @return the CreateFilterOptions builder
     */
    public Builder zoneIdentifier(String zoneIdentifier) {
      this.zoneIdentifier = zoneIdentifier;
      return this;
    }

    /**
     * Set the filterInput.
     * Existing filterInput will be replaced.
     *
     * @param filterInput the filterInput
     * @return the CreateFilterOptions builder
     */
    public Builder filterInput(List<FilterInput> filterInput) {
      this.filterInput = filterInput;
      return this;
    }
  }

  protected CreateFilterOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.xAuthUserToken,
      "xAuthUserToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.crn,
      "crn cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneIdentifier,
      "zoneIdentifier cannot be empty");
    xAuthUserToken = builder.xAuthUserToken;
    crn = builder.crn;
    zoneIdentifier = builder.zoneIdentifier;
    filterInput = builder.filterInput;
  }

  /**
   * New builder.
   *
   * @return a CreateFilterOptions builder
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
   * Zone identifier of the zone for which filters are created.
   *
   * @return the zoneIdentifier
   */
  public String zoneIdentifier() {
    return zoneIdentifier;
  }

  /**
   * Gets the filterInput.
   *
   * Json objects which are used to create filters.
   *
   * @return the filterInput
   */
  public List<FilterInput> filterInput() {
    return filterInput;
  }
}

